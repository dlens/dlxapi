# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' BudgetAllocation Class
#'
#' @field resourcePoolName 
#' @field resourcePoolId 
#' @field yearlyBudgets 
#' @field yearlyAllocations 
#' @field yearlyTimePeriods 
#' @field yearlyConstrainedAllocations 
#' @field monthlyAllocations 
#' @field monthlyBudgets 
#' @field monthlyTimePeriods 
#' @field monthlyConstrainedAllocations 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BudgetAllocation <- R6::R6Class(
  'BudgetAllocation',
  public = list(
    `resourcePoolName` = NULL,
    `resourcePoolId` = NULL,
    `yearlyBudgets` = NULL,
    `yearlyAllocations` = NULL,
    `yearlyTimePeriods` = NULL,
    `yearlyConstrainedAllocations` = NULL,
    `monthlyAllocations` = NULL,
    `monthlyBudgets` = NULL,
    `monthlyTimePeriods` = NULL,
    `monthlyConstrainedAllocations` = NULL,
    initialize = function(`resourcePoolName`, `resourcePoolId`, `yearlyBudgets`, `yearlyAllocations`, `yearlyTimePeriods`, `yearlyConstrainedAllocations`, `monthlyAllocations`, `monthlyBudgets`, `monthlyTimePeriods`, `monthlyConstrainedAllocations`){
      if (!missing(`resourcePoolName`)) {
        stopifnot(is.character(`resourcePoolName`), length(`resourcePoolName`) == 1)
        self$`resourcePoolName` <- `resourcePoolName`
      }
      if (!missing(`resourcePoolId`)) {
        stopifnot(is.character(`resourcePoolId`), length(`resourcePoolId`) == 1)
        self$`resourcePoolId` <- `resourcePoolId`
      }
      if (!missing(`yearlyBudgets`)) {
        stopifnot(is.list(`yearlyBudgets`), length(`yearlyBudgets`) != 0)
        lapply(`yearlyBudgets`, function(x) stopifnot(is.character(x)))
        self$`yearlyBudgets` <- `yearlyBudgets`
      }
      if (!missing(`yearlyAllocations`)) {
        stopifnot(is.list(`yearlyAllocations`), length(`yearlyAllocations`) != 0)
        lapply(`yearlyAllocations`, function(x) stopifnot(is.character(x)))
        self$`yearlyAllocations` <- `yearlyAllocations`
      }
      if (!missing(`yearlyTimePeriods`)) {
        stopifnot(is.list(`yearlyTimePeriods`), length(`yearlyTimePeriods`) != 0)
        lapply(`yearlyTimePeriods`, function(x) stopifnot(is.character(x)))
        self$`yearlyTimePeriods` <- `yearlyTimePeriods`
      }
      if (!missing(`yearlyConstrainedAllocations`)) {
        stopifnot(is.list(`yearlyConstrainedAllocations`), length(`yearlyConstrainedAllocations`) != 0)
        lapply(`yearlyConstrainedAllocations`, function(x) stopifnot(is.character(x)))
        self$`yearlyConstrainedAllocations` <- `yearlyConstrainedAllocations`
      }
      if (!missing(`monthlyAllocations`)) {
        stopifnot(is.list(`monthlyAllocations`), length(`monthlyAllocations`) != 0)
        lapply(`monthlyAllocations`, function(x) stopifnot(is.character(x)))
        self$`monthlyAllocations` <- `monthlyAllocations`
      }
      if (!missing(`monthlyBudgets`)) {
        stopifnot(is.list(`monthlyBudgets`), length(`monthlyBudgets`) != 0)
        lapply(`monthlyBudgets`, function(x) stopifnot(is.character(x)))
        self$`monthlyBudgets` <- `monthlyBudgets`
      }
      if (!missing(`monthlyTimePeriods`)) {
        stopifnot(is.list(`monthlyTimePeriods`), length(`monthlyTimePeriods`) != 0)
        lapply(`monthlyTimePeriods`, function(x) stopifnot(is.character(x)))
        self$`monthlyTimePeriods` <- `monthlyTimePeriods`
      }
      if (!missing(`monthlyConstrainedAllocations`)) {
        stopifnot(is.list(`monthlyConstrainedAllocations`), length(`monthlyConstrainedAllocations`) != 0)
        lapply(`monthlyConstrainedAllocations`, function(x) stopifnot(is.character(x)))
        self$`monthlyConstrainedAllocations` <- `monthlyConstrainedAllocations`
      }
    },
    toJSON = function() {
      BudgetAllocationObject <- list()
      if (!is.null(self$`resourcePoolName`)) {
        BudgetAllocationObject[['resourcePoolName']] <- self$`resourcePoolName`
      }
      if (!is.null(self$`resourcePoolId`)) {
        BudgetAllocationObject[['resourcePoolId']] <- self$`resourcePoolId`
      }
      if (!is.null(self$`yearlyBudgets`)) {
        BudgetAllocationObject[['yearlyBudgets']] <- self$`yearlyBudgets`
      }
      if (!is.null(self$`yearlyAllocations`)) {
        BudgetAllocationObject[['yearlyAllocations']] <- self$`yearlyAllocations`
      }
      if (!is.null(self$`yearlyTimePeriods`)) {
        BudgetAllocationObject[['yearlyTimePeriods']] <- self$`yearlyTimePeriods`
      }
      if (!is.null(self$`yearlyConstrainedAllocations`)) {
        BudgetAllocationObject[['yearlyConstrainedAllocations']] <- self$`yearlyConstrainedAllocations`
      }
      if (!is.null(self$`monthlyAllocations`)) {
        BudgetAllocationObject[['monthlyAllocations']] <- self$`monthlyAllocations`
      }
      if (!is.null(self$`monthlyBudgets`)) {
        BudgetAllocationObject[['monthlyBudgets']] <- self$`monthlyBudgets`
      }
      if (!is.null(self$`monthlyTimePeriods`)) {
        BudgetAllocationObject[['monthlyTimePeriods']] <- self$`monthlyTimePeriods`
      }
      if (!is.null(self$`monthlyConstrainedAllocations`)) {
        BudgetAllocationObject[['monthlyConstrainedAllocations']] <- self$`monthlyConstrainedAllocations`
      }

      BudgetAllocationObject
    },
    fromJSON = function(BudgetAllocationJson) {
      BudgetAllocationObject <- jsonlite::fromJSON(BudgetAllocationJson)
      if (!is.null(BudgetAllocationObject$`resourcePoolName`)) {
        self$`resourcePoolName` <- BudgetAllocationObject$`resourcePoolName`
      }
      if (!is.null(BudgetAllocationObject$`resourcePoolId`)) {
        self$`resourcePoolId` <- BudgetAllocationObject$`resourcePoolId`
      }
      if (!is.null(BudgetAllocationObject$`yearlyBudgets`)) {
        self$`yearlyBudgets` <- BudgetAllocationObject$`yearlyBudgets`
      }
      if (!is.null(BudgetAllocationObject$`yearlyAllocations`)) {
        self$`yearlyAllocations` <- BudgetAllocationObject$`yearlyAllocations`
      }
      if (!is.null(BudgetAllocationObject$`yearlyTimePeriods`)) {
        self$`yearlyTimePeriods` <- BudgetAllocationObject$`yearlyTimePeriods`
      }
      if (!is.null(BudgetAllocationObject$`yearlyConstrainedAllocations`)) {
        self$`yearlyConstrainedAllocations` <- BudgetAllocationObject$`yearlyConstrainedAllocations`
      }
      if (!is.null(BudgetAllocationObject$`monthlyAllocations`)) {
        self$`monthlyAllocations` <- BudgetAllocationObject$`monthlyAllocations`
      }
      if (!is.null(BudgetAllocationObject$`monthlyBudgets`)) {
        self$`monthlyBudgets` <- BudgetAllocationObject$`monthlyBudgets`
      }
      if (!is.null(BudgetAllocationObject$`monthlyTimePeriods`)) {
        self$`monthlyTimePeriods` <- BudgetAllocationObject$`monthlyTimePeriods`
      }
      if (!is.null(BudgetAllocationObject$`monthlyConstrainedAllocations`)) {
        self$`monthlyConstrainedAllocations` <- BudgetAllocationObject$`monthlyConstrainedAllocations`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "resourcePoolName": %s,
           "resourcePoolId": %s,
           "yearlyBudgets": [%s],
           "yearlyAllocations": [%s],
           "yearlyTimePeriods": [%s],
           "yearlyConstrainedAllocations": [%s],
           "monthlyAllocations": [%s],
           "monthlyBudgets": [%s],
           "monthlyTimePeriods": [%s],
           "monthlyConstrainedAllocations": [%s]
        }',
        self$`resourcePoolName`,
        self$`resourcePoolId`,
        lapply(self$`yearlyBudgets`, function(x) paste(paste0('"', x, '"'), sep=",")),
        lapply(self$`yearlyAllocations`, function(x) paste(paste0('"', x, '"'), sep=",")),
        lapply(self$`yearlyTimePeriods`, function(x) paste(paste0('"', x, '"'), sep=",")),
        lapply(self$`yearlyConstrainedAllocations`, function(x) paste(paste0('"', x, '"'), sep=",")),
        lapply(self$`monthlyAllocations`, function(x) paste(paste0('"', x, '"'), sep=",")),
        lapply(self$`monthlyBudgets`, function(x) paste(paste0('"', x, '"'), sep=",")),
        lapply(self$`monthlyTimePeriods`, function(x) paste(paste0('"', x, '"'), sep=",")),
        lapply(self$`monthlyConstrainedAllocations`, function(x) paste(paste0('"', x, '"'), sep=","))
      )
    },
    fromJSONString = function(BudgetAllocationJson) {
      BudgetAllocationObject <- jsonlite::fromJSON(BudgetAllocationJson)
      self$`resourcePoolName` <- BudgetAllocationObject$`resourcePoolName`
      self$`resourcePoolId` <- BudgetAllocationObject$`resourcePoolId`
      self$`yearlyBudgets` <- BudgetAllocationObject$`yearlyBudgets`
      self$`yearlyAllocations` <- BudgetAllocationObject$`yearlyAllocations`
      self$`yearlyTimePeriods` <- BudgetAllocationObject$`yearlyTimePeriods`
      self$`yearlyConstrainedAllocations` <- BudgetAllocationObject$`yearlyConstrainedAllocations`
      self$`monthlyAllocations` <- BudgetAllocationObject$`monthlyAllocations`
      self$`monthlyBudgets` <- BudgetAllocationObject$`monthlyBudgets`
      self$`monthlyTimePeriods` <- BudgetAllocationObject$`monthlyTimePeriods`
      self$`monthlyConstrainedAllocations` <- BudgetAllocationObject$`monthlyConstrainedAllocations`
    }
  )
)
