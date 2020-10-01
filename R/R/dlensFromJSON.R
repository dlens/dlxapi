#' @importFrom jsonlite fromJSON toJSON
#' @importFrom base64enc base64encode
#' @importFrom httr add_headers, add_headers
#' @importFrom readxl read_xlsx
#' @importFrom stringr str_c str_length

#' @export
dlensFromJSON <- function(txt,...) {
  jsonlite::fromJSON(txt, simplifyVector = FALSE, ...)
}

#' Gets a portfolio object from its name
#' 
#' Note that name is spacing and case sensitive.
#' 
#' @param apiclient The ApiClient object to use for method calls.
#' @param name The name of the portfolio to return
#' @return A Portfolio object or NULL if there was no portfolio of the given name
portfolioFromName <- function(apiclient, name) {
  portfoliosApi = PortfoliosApi$new()
  portfoliosApi$apiClient = apiClient
  ports = portfoliosApi$get_portfolios()
  for (port in ports$content$items) {
    if (port$name == name) {
      return(portfoliosApi$get_portfolio(port$id))
    }
  }
  return(NULL)
}

#' Gets a portfolio object from its id
#' 
#' @param apiclient The ApiClient object to use for method calls.
#' @param id The name of the portfolio to return
#' @return A Portfolio object or NULL if there was no portfolio of the given name
portfolioFromId <- function(apiClient, id) {
  portfoliosApi = PortfoliosApi$new()
  portfoliosApi$apiClient = apiClient
  return(portfoliosApi$get_portfolio(id))
}

is.errorStatus <- function(status) {
  if ((status < 200) || (status >= 300)) {
    return(TRUE)
  } else {
    return(FALSE)
  }
}

processingReportStart <- function() {
  PROCESSSING_REPORT_STEP <<- 0
}

processingReportIncrementStep <- function() {
  PROCESSSING_REPORT_STEP <<- PROCESSSING_REPORT_STEP + 1
  return(PROCESSSING_REPORT_STEP)
}

processingReportNextNotNull <- function(notNullObject=NULL, step_msg=NULL) {
  if (!is.null(step_msg)) {
    # Report out the current step
    report = sprintf("%d. %s ", processingReportIncrementStep(), step_msg)
    cat(report)
    error_msg = paste0("FAILURE in: ", step_msg)
  } else {
    error_msg = paste0("FAILURE:")
  }
  if (is.null(notNullObject)) {
    errorReport(error_msg)
  } else {
    cat("[OK]\n")
  }
}

processingReportNextResponse <- function(resp=NULL, step_msg=NULL) {
  if (!is.null(step_msg)) {
    # Report out the current step
    report = sprintf("%d. %s ", processingReportIncrementStep(), step_msg)
    cat(report)
    error_msg = paste0("FAILURE in: ", step_msg)
  } else {
    error_msg = "FAILURE:"
  }
  # Checking a response type
  if (is.null(resp)) {
    errorReport(paste("Tried to check for possible error without http response, original error_msg: ", error_msg), resp)
  } else if (is.null(resp$response$status_code)) {
    errorReport(paste("Had a response but with no status code, this is problematic, original error_msg: ", error_msg), resp)
  } else if (is.errorStatus(resp$response$status_code)) {
    errorReport(error_msg, resp)
  } else {
    print("[OK]")
  }
}

errorReport <- function(msg, resp=NULL) {
  cat("[FAILED]:\n")
  print(msg)
  if (!is.null(resp)) {
    if (!is.null(resp$response$status_code)) {
      print(paste0("Status_Code=", resp$response$status_code))
    }
    if (!is.null(resp$response$headers)) {
      if (!is.null(resp$response$headers$'dl-request-id')) {
        print(paste0("DL Request Id = ", resp$response$headers$'dl-request-id'))
      }
    }
  }
  print("Contact support@decisionlens.com if you need further assistance")
  stop("Stopping at this stage")
}

warnReport <- function(msg) {
  cat("[BEGIN WARNING MESSAGE]:\n")
  print(msg)
  cat("[END WARNING MESSAGE]:\n")
}

apiClientFromCreds <- function(dlx_instance, id, secret) {
  #Remove trailing slash on dlx_instance if it is there, because it causes issues
  dlx_instance = gsub("/$", "", dlx_instance)
  #Setup login and api calling urls from our instance
  dlx_login_url = paste(dlx_instance, "oauth/token?grant_type=client_credentials", sep="/")
  dlx_api_url = paste(dlx_instance, "v1", sep="/")
  
  basicAuth <- base64enc::base64encode(charToRaw(paste(id,secret, sep=":")))
  res=httr::POST(dlx_login_url, httr::add_headers("Authorization"= paste("Basic", basicAuth)))
  if (res$status_code == 401) {
    # You were unauthorized, we fail now
    errorReport("Authentication error", res)
  }
  
  access_token = httr::content(res)$access_token
  #print(access_token)
  apiClient = ApiClient$new()
  apiClient$basePath=dlx_api_url
  apiClient$defaultHeaders = list("Authorization"=paste("Bearer", access_token))
  return(apiClient)
}

#' Send xlsx file to DLX portfolio and import data and will process errors to standard output
#' @param dlx_instance URL for DLX instance
#' @param id client credential ID
#' @param secret client credential secret
#' @param portfolioId ID of portfolio to import to
#' @param excel_file name of file to send to portfolio
#' @param dataType type of data sending either 'COST' or 'PROJECT'
#' @return returns nothing
importDataDLX <- function(dlx_instsance, id, secret, portfolioId, excel_file, sheetName, dataType)
{
  processingReportStart()
  
  # Start our report of progress
  processingReportStart()
  # You need an ApiClient object to talk to the server.
  # This ApiClient object basically has the auth info
  apiClient = apiClientFromCreds(dlx_instance, id, secret)
  processingReportNextNotNull(apiClient, "Setting up API Client")
  
  # Need a PortfoliosApi object to talk to the Portfolio server
  portfoliosApi = PortfoliosApi$new()
  processingReportNextNotNull(portfoliosApi, "Setting up Portfolios API Client")
  portfoliosApi$apiClient = apiClient
  
  # Let's get our portfolio, just to make sure things are working
  portfolioName = "R Code Integration Test"
  #Get portfolio either by id or by name
  #myport = portfolioFromName(apiClient, portfolioName)
  myport = portfolioFromId(apiClient, portfolioId)
  
  processingReportNextResponse(myport,"Getting a portfolio by name")
  
  #We need an SpreadsheetApi object to call to upload our spreadsheet
  spreadsheetApi = SpreadsheetApi$new(apiClient)
  processingReportNextNotNull(spreadsheetApi, "Getting Spreadsheet API")
  # excel_file="Output.xlsx"
  # sheetName = "Sheet"
  #Upload the spreadsheet to the server
  spreadsheet = spreadsheetApi$create_spreadsheet(excel_file)
  processingReportNextResponse(spreadsheet, "Uploading Spreadsheet")
  
  #Now set up the mapping
  #The second to last parameter is either "COST" to import cost data, or "PROJECT" to import
  #project scores on other fields, e.g. Revenue, Risk, NPV, etc.
  spreadsheetApi$get_mappings_for_spreadsheet(spreadsheet$content$id, sheetName, dataType, FALSE)
  #Now save
  rval = portfoliosApi$save_spreadsheet_for_portfolio(myport$content$id, spreadsheet$content$id, sheetName)
  processingReportNextResponse(rval, "Performing import")
}

#' Creates an item for patching
#' @export
#' @param fieldId The id of the field whose value we want to change
#' @param projectId The id of the project we are changing
#' @param op The operation, typically "REPLACE"
#' @param path Typically "/value" or "/numericaValue" depends on what you are changing
#' @param value The new value to store there
createPatchItemOp = function(fieldId, projectId, op, path, value) {
  rval = '{
    "fieldId": "%s",
    "projectId": "%s",
    "operations": [
      {
        "op": "%s",
        "path": "%s",
        "value": "%s"
      }
    ]
  }'
  return(sprintf(rval, fieldId, projectId, op, path, value))
}

#' Creates an allocation patch itemitem for patching
#' @export
#' @param fieldId The id of the field whose value we want to change
#' @param projectId The id of the project we are changing
#' @param op The operation, typically "REPLACE"
#' @param path Typically "/value" or "/numericaValue" depends on what you are changing
#' @param value The new value to store there
createAllocationPatchItemOp = function(costFieldId, timeString, yearOrMonthString, projectId, op, path, value) {
  timeInt = as.character(dateAsMillis(timeString))
  rval = '{
    "fieldId": "%s",
    "projectId": "%s",
    "operations": [
      {
        "op": "%s",
        "path": "%s",
        "value": "%s"
      }
    ],
    "timePeriod": {
      "startDate": "%s",
      "type": "%s"
    }
  }'
  return(sprintf(rval, costFieldId, projectId, op, path, value, timeInt, yearOrMonthString))
}
#' Packs up a vector of things created createPatchItemOp() function, getting it ready for
#' sending to portfolioPlansApi$update_portfolio_plan_field_values() as the 2nd param
#' @export
#' @param opsVector The vector of ops created by createPatchItemOp
jsonPatchItemOps = function(opsVector) {
  #We need to remove NAs
  opsVector = opsVector[!is.na(opsVector)]
  return(sprintf("[%s]", stringr::str_c(opsVector, collapse = ", ")))
}

#' Takes a date string and converts it to millis since the epoch
#' @export
#' @param dateString something as.Date() understands.  Best to use "Year-Mon-Day"
#' for instance "2020-10-21" mean October 21, 2020.
dateAsMillis = function(dateString) {
  if (length(dateString)>1) {
    return(lapply(dateString, function(x) dateAsMillis(x)))
  }
  #Check if an not an integer of length 4 or less.  If it is an integer of
  # length 4 or more, it is an excel date integer
  if (suppressWarnings(is.na(as.numeric(dateString)) | (stringr::str_length(dateString)<=4))) {
      rval=tryCatch({
        days = as.numeric(as.Date(dateString))
        return(days*24*60*60*1000)
      }, error = function(err) {
        #Trying a new method
        pieces = strsplit(dateString, " ")[[1]]
        dateString = trimws(dateString)
        if (length(pieces) == 1) {
          # We have just a year
          dateString =paste("1 Jan ", pieces[[1]])
        } else if (length(pieces) == 2) {
          # We have month then year
          dateString = paste0("1 ", pieces[[1]], pieces[[2]])
        }
        #print("New date string is")
        #print(dateString)
        rval = tryCatch({
          days = as.numeric(as.Date(dateString, format="%d %B %Y"))
          return(days*24*60*60*1000)
        }, error = function(e2) {
          return(NA)
        })
      }
      )
  } else {
    rval=tryCatch({
      date = convertToDate(dateString)
      days = as.numeric(as.Date(date))
      return(days*24*60*60*1000)
    }, error = function(err) {
      #print("Date parse error")
      return(NA)
    }
    )
  }
  return(rval)
}


#' Returns a vector whose keys are names of fields and values are the ids
#' @export
#' @param apiClient The apiClient to use for communication
#' @param portId The id of the portfolio to get the fields of
fieldsToNameLookup <- function(apiClient, portId) {
  fieldsApi = FieldsApi$new()
  fieldsApi$apiClient = apiClient
  fields=fieldsApi$get_fields_for_portfolio(portId)
  rval = c()
  for (field in fields$content$items) {
    name=field$name
    id = field$id
    rval[name] = id
  }
  return(rval)
}

#' Converts a Field name to its Id.  If you pass in one field, it returns
#' the single id.  If you pass in a list of names, it returns the corresponding
#' list of ids
#' 
fieldNameToId <- function(apiClient, portId, name) {
  lookup = fieldsToNameLookup(apiClient, portId)
  if (length(name) == 1) {
    return(lookup[name])
  } else {
    return(lapply(name, function(x) lookup[x]))
  }
}

#' Returns a vector whose keys are names of projects and values are the ids
#' @export
#' @param apiClient The apiClient to use for communication
#' @param portId The id of the portfolio to get the fields of
projectNamesToIdLookup <- function(apiClient, portId, planId) {
  projectsApi = ProjectsApi$new()
  projectsApi$apiClient = apiClient
  projects=projectsApi$get_projects_for_portfolio(portId, planId)
  rval = c()
  for (project in projects$content$items) {
    name=project$name
    id = project$id
    rval[name] = id
  }
  return(rval)
}

#' Converts a project name to its Id.  If you pass in one project, it returns
#' the single id.  If you pass in a list of names, it returns the corresponding
#' list of ids
#' 
projectNameToId <- function(apiClient, portId, planId, name) {
  lookup = projectNamesToIdLookup(apiClient, portId, planId)
  if (length(name) == 1) {
    return(lookup[name])
  } else {
    return(lapply(name, function(x) lookup[x]))
  }
}


#' Updates all the project statuses for the passed in projects
#' @export
#' @param apiClient The apiClient to use for communication
#' @param portId The id of the portfolio to update statuses of
#' @param planId The id of the plan whose statuses we are setting
#' @param projects A vector of project ids to set the status of
#' @param statuses A vector of project statuses to set the status to
#' @param reporting_msg The message to use for success or error reporting
updateProjectsStatuses <- function(apiClient, portId, planId, projects, statuses, reporting_msg) {
  ops = c()
  statusFieldId = fieldsToNameLookup(apiClient, portId)[["Status"]]
  portfoliosApi = PortfoliosApi$new()
  portfoliosApi$apiClient = apiClient
  for (i in seq_len(length(projects))) {
    project = projects[[i]]
    status = statuses[[i]]
    if ((!is.na(project)) && (!is.na(status))) {
      ops[[i]] = createPatchItemOp(statusFieldId, project, "REPLACE", "/value", status)
    }
  }
  if (length(ops) == 0) {
    # Nothing to do, give up
    return(NA)
  }
  shopkinsOps = jsonPatchItemOps(ops)
  portfolioPlansApi = PortfolioPlansApi$new(apiClient)
  rval = portfolioPlansApi$update_portfolio_plan_field_values(planId, shopkinsOps)
  processingReportNextResponse(rval, reporting_msg)
  return(rval)
}


#' Updates all the project start dates for the passed in projects
#' @export
#' @param apiClient The apiClient to use for communication
#' @param portId The id of the portfolio to update statuses of
#' @param planId The id of the plan whose statuses we are setting
#' @param projects A vector of project ids to set the start dates of
#' @param startDates A vector of project start date strings.  Should be in the form
#' accepted by dateToMillis() in this file.  Essentially use "Year-Month-Day", e.g.
#' "2020-10-31" is Halloween 2020
#' @param reporting_msg The message to use for success or error reporting
updateProjectsStartDates <- function(apiClient, portId, planId, projects, startDates, reporting_msg) {
  ops = c()
  dateFieldId = fieldsToNameLookup(apiClient, portId)[["Start"]]
  portfoliosApi = PortfoliosApi$new()
  portfoliosApi$apiClient = apiClient
  for (i in seq_len(length(projects))) {
    project = projects[[i]]
    sd = startDates[[i]]
    if ((!is.na(project)) && (!is.na(sd))) {
      date = dateAsMillis(startDates[[i]])
      ops[[i]] = createPatchItemOp(dateFieldId, project, "REPLACE", "/numericValue", date)
    }
  }
  if (length(ops) > 0) {
    shopkinsOps = jsonPatchItemOps(ops)
    portfolioPlansApi = PortfolioPlansApi$new(apiClient)
    rval = portfolioPlansApi$update_portfolio_plan_field_values(planId, shopkinsOps)
    processingReportNextResponse(rval, reporting_msg)
    return(rval)
  }
}

#' Updates all the project end dates for the passed in projects
#' @export
#' @param apiClient The apiClient to use for communication
#' @param portId The id of the portfolio to update statuses of
#' @param planId The id of the plan whose statuses we are setting
#' @param projects A vector of project ids to set the start dates of
#' @param endDates A vector of project start date strings.  Should be in the form
#' accepted by dateToMillis() in this file.  Essentially use "Year-Month-Day", e.g.
#' "2020-10-31" is Halloween 2020
#' @param reporting_msg The message to use for success or error reporting
updateProjectsEndDates <- function(apiClient, portId, planId, projects, endDates, reporting_msg) {
  ops = c()
  dateFieldId = fieldsToNameLookup(apiClient, portId)[["End"]]
  portfoliosApi = PortfoliosApi$new()
  portfoliosApi$apiClient = apiClient
  for (i in seq_len(length(projects))) {
    project = projects[[i]]
    if ((!is.na(project)) && (!is.na(endDates[[i]]))) {
      date = dateAsMillis(endDates[[i]])
      ops[[i]] = createPatchItemOp(dateFieldId, project, "REPLACE", "/numericValue", date)
    }
  }
  if (length(ops) > 0) {
    shopkinsOps = jsonPatchItemOps(ops)
    portfolioPlansApi = PortfolioPlansApi$new(apiClient)
    rval = portfolioPlansApi$update_portfolio_plan_field_values(planId, shopkinsOps)
    processingReportNextResponse(rval, reporting_msg)
    return(rval)
  }
}

#' Updates all the project allocations for the passed in projects
#' @export
#' @param apiClient The apiClient to use for communication
#' @param portId The id of the portfolio to update statuses of
#' @param planId The id of the plan whose statuses we are setting
#' @param costFieldId The id of the cost field we are working on
#' @param timePeriodString The string version of time period e.g. 2020-10-1 for 
#' October 1, 2020
#' @param yearOrMonthString Should either be "YEAR" or "MONTH"
#' @param projects A vector of project ids to set the start dates of
#' @param allocs A vector of project allocs.  Should be in the form
#' @param reporting_msg The message to use for success or error reporting
updateProjectsAllocs <- function(apiClient, planId, costFieldId, timePeriodString, yearOrMonthString, projects, allocs, reporting_msg) {
  ops = c()
  portfoliosApi = PortfoliosApi$new()
  portfoliosApi$apiClient = apiClient
  for (i in seq_len(length(projects))) {
    project = projects[[i]]
    if ((!is.na(project)) && (!is.na(allocs[[i]]))) {
      alloc = as.character(allocs[[i]])
      ops[[i]] = createAllocationPatchItemOp(costFieldId, timePeriodString, yearOrMonthString, project, "REPLACE", "/numericValue", alloc)
    }
  }
  if (length(ops) > 0) {
    shopkinsOps = jsonPatchItemOps(ops)
    portfolioPlansApi = PortfolioPlansApi$new(apiClient)
    rval = portfolioPlansApi$update_portfolio_plan_field_values(planId, shopkinsOps)
    processingReportNextResponse(rval, reporting_msg)
    return(rval)
  }
}

dateColumns = function(df) {
  cols=colnames(df)
  return(cols[!is.na(dateAsMillis(cols))])
}

#' This function imports from a previous dlx export.  It imports from the "Schedule" sheet which is the 2nd
#' sheet.
updateProjectsFromExport <- function(apiClient, portId, planId, excelExportFile, yearOrMonthString, reporting_msg,
                                     doStatuses=TRUE, doStartEnds=TRUE, doCosts=TRUE, scheduleSheet=2) {
  #Need to get the right offset, so first read in the sheet and see when column 2 has first thing that is not NA
  startSheet = readxl::read_xlsx(excelExportFile, scheduleSheet)
  offset = which.min(is.na(startSheet[[2]]))
  #Now we read in again
  scheduledf = readxl::read_xlsx(excelExportFile, scheduleSheet, skip = offset)
  #Our list of update operations
  ops = c()
  #Our standard fields to update
  projects = scheduledf[[1]]
  statusFieldId = fieldsToNameLookup(apiClient, portId)[["Status"]]
  endFieldId = fieldsToNameLookup(apiClient, portId)[["End"]]
  startFieldId = fieldsToNameLookup(apiClient, portId)[["Start"]]
  dcols = dateColumns(scheduledf)
  fieldsToNames = fieldsToNameLookup(apiClient, portId)
  projectsToIds = projectNamesToIdLookup(apiClient, portId, planId)
  #Our excel columns
  if (doStatuses) {
    statusData = scheduledf[["Status"]]
  }
  if (doStartEnds) {
    startData = scheduledf[["Start"]]
    endData = scheduledf[["End"]]
  }
  if (doCosts) {
    costFieldData = scheduledf[["Cost Field"]]
    reqAllocData = scheduledf[["Request/Allocation"]]
  }
  for (row in seq_len(length(rownames(scheduledf)))) {
    projectName = projects[[row]]
    if (!is.na(projectName) && (projectName %in% names(projectsToIds))) {
      project = projectsToIds[[projectName]]
      if (doStatuses) {
        status = statusData[[row]]
        if ((!is.na(project)) && (!is.na(status))) {
          ops = append(ops, c(createPatchItemOp(statusFieldId, project, "REPLACE", "/value", status)))
        }
      }
      if (doStartEnds) {
        start = startData[[row]]
        end = endData[[row]]
        if ((!is.na(project)) && (!is.na(start))) {
          date = dateAsMillis(start)
          ops = append(ops, c(createPatchItemOp(startFieldId, project, "REPLACE", "/numericValue", date)))
        }
        if ((!is.na(project)) && (!is.na(end))) {
          date = dateAsMillis(end)
          ops = append(ops, c(createPatchItemOp(endFieldId, project, "REPLACE", "/numericValue", date)))
        }
      }
      if (doCosts) {
        costField = costFieldData[[row]]
        reqAlloc = tolower(reqAllocData[[row]])
        validReqAlloc = TRUE
        if (startsWith(reqAlloc, "a")) {
          # Allocation line
          theCostField = paste0(costField, " Allocate")
        } else if (startsWith(reqAlloc, "r")) {
          # Request line
          theCostField = costField
        } else {
          # Unknown line type warn
          validReqAlloc = FALSE
        }
        if (!validReqAlloc) {
          warnReport(sprintf("Working in spreadsheet_row='%d' (where we are 0 indexed), request/allocation type '%s' unknown, will not handle", row, reqAlloc))
        } else if (!(theCostField %in% names(fieldsToNames))) {
          warnReport(sprintf("Working in row='%d' (where it is 0 indexed) the costField of '%s' was unknown, skipping", row, costField))
        } else {
          theCostFieldId = fieldsToNames[[theCostField]]
          for (dateCol in dcols) {
            value = scheduledf[[dateCol]][[row]]
            if ((!is.na(project)) && (!is.na(value))) {
              alloc = as.character(value)
              ops = append(ops, c(createAllocationPatchItemOp(theCostFieldId, dateCol, yearOrMonthString, project, "REPLACE", "/numericValue", alloc)))
            }
          }
        }
      }
    }
  }
  # Let's actually perform the operations.
  if (length(ops) > 0) {
    shopkinsOps = jsonPatchItemOps(ops)
    portfolioPlansApi = PortfolioPlansApi$new(apiClient)
    rval = portfolioPlansApi$update_portfolio_plan_field_values(planId, shopkinsOps)
    processingReportNextResponse(rval, reporting_msg)
    return(rval)
  }
  
}