# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ProjectPortfolioPlanFieldValueUpdatedEvent Class
#'
#' @field id 
#' @field name 
#' @field field 
#' @field portfolioPlan 
#' @field value 
#' @field previousValue 
#' @field numericValue 
#' @field previousNumericValue 
#' @field timePeriod 
#' @field portfolioId 
#' @field isRebaseline 
#' @field isFromImport 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProjectPortfolioPlanFieldValueUpdatedEvent <- R6::R6Class(
  'ProjectPortfolioPlanFieldValueUpdatedEvent',
  public = list(
    `id` = NULL,
    `name` = NULL,
    `field` = NULL,
    `portfolioPlan` = NULL,
    `value` = NULL,
    `previousValue` = NULL,
    `numericValue` = NULL,
    `previousNumericValue` = NULL,
    `timePeriod` = NULL,
    `portfolioId` = NULL,
    `isRebaseline` = NULL,
    `isFromImport` = NULL,
    initialize = function(`id`, `name`, `field`, `portfolioPlan`, `value`, `previousValue`, `numericValue`, `previousNumericValue`, `timePeriod`, `portfolioId`, `isRebaseline`, `isFromImport`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`field`)) {
        stopifnot(R6::is.R6(`field`))
        self$`field` <- `field`
      }
      if (!missing(`portfolioPlan`)) {
        stopifnot(R6::is.R6(`portfolioPlan`))
        self$`portfolioPlan` <- `portfolioPlan`
      }
      if (!missing(`value`)) {
        stopifnot(is.character(`value`), length(`value`) == 1)
        self$`value` <- `value`
      }
      if (!missing(`previousValue`)) {
        stopifnot(is.character(`previousValue`), length(`previousValue`) == 1)
        self$`previousValue` <- `previousValue`
      }
      if (!missing(`numericValue`)) {
        stopifnot(is.numeric(`numericValue`), length(`numericValue`) == 1)
        self$`numericValue` <- `numericValue`
      }
      if (!missing(`previousNumericValue`)) {
        stopifnot(is.numeric(`previousNumericValue`), length(`previousNumericValue`) == 1)
        self$`previousNumericValue` <- `previousNumericValue`
      }
      if (!missing(`timePeriod`)) {
        stopifnot(R6::is.R6(`timePeriod`))
        self$`timePeriod` <- `timePeriod`
      }
      if (!missing(`portfolioId`)) {
        stopifnot(is.character(`portfolioId`), length(`portfolioId`) == 1)
        self$`portfolioId` <- `portfolioId`
      }
      if (!missing(`isRebaseline`)) {
        self$`isRebaseline` <- `isRebaseline`
      }
      if (!missing(`isFromImport`)) {
        self$`isFromImport` <- `isFromImport`
      }
    },
    toJSON = function() {
      ProjectPortfolioPlanFieldValueUpdatedEventObject <- list()
      if (!is.null(self$`id`)) {
        ProjectPortfolioPlanFieldValueUpdatedEventObject[['id']] <- self$`id`
      }
      if (!is.null(self$`name`)) {
        ProjectPortfolioPlanFieldValueUpdatedEventObject[['name']] <- self$`name`
      }
      if (!is.null(self$`field`)) {
        ProjectPortfolioPlanFieldValueUpdatedEventObject[['field']] <- self$`field`$toJSON()
      }
      if (!is.null(self$`portfolioPlan`)) {
        ProjectPortfolioPlanFieldValueUpdatedEventObject[['portfolioPlan']] <- self$`portfolioPlan`$toJSON()
      }
      if (!is.null(self$`value`)) {
        ProjectPortfolioPlanFieldValueUpdatedEventObject[['value']] <- self$`value`
      }
      if (!is.null(self$`previousValue`)) {
        ProjectPortfolioPlanFieldValueUpdatedEventObject[['previousValue']] <- self$`previousValue`
      }
      if (!is.null(self$`numericValue`)) {
        ProjectPortfolioPlanFieldValueUpdatedEventObject[['numericValue']] <- self$`numericValue`
      }
      if (!is.null(self$`previousNumericValue`)) {
        ProjectPortfolioPlanFieldValueUpdatedEventObject[['previousNumericValue']] <- self$`previousNumericValue`
      }
      if (!is.null(self$`timePeriod`)) {
        ProjectPortfolioPlanFieldValueUpdatedEventObject[['timePeriod']] <- self$`timePeriod`$toJSON()
      }
      if (!is.null(self$`portfolioId`)) {
        ProjectPortfolioPlanFieldValueUpdatedEventObject[['portfolioId']] <- self$`portfolioId`
      }
      if (!is.null(self$`isRebaseline`)) {
        ProjectPortfolioPlanFieldValueUpdatedEventObject[['isRebaseline']] <- self$`isRebaseline`
      }
      if (!is.null(self$`isFromImport`)) {
        ProjectPortfolioPlanFieldValueUpdatedEventObject[['isFromImport']] <- self$`isFromImport`
      }

      ProjectPortfolioPlanFieldValueUpdatedEventObject
    },
    fromJSON = function(ProjectPortfolioPlanFieldValueUpdatedEventJson) {
      ProjectPortfolioPlanFieldValueUpdatedEventObject <- jsonlite::fromJSON(ProjectPortfolioPlanFieldValueUpdatedEventJson)
      if (!is.null(ProjectPortfolioPlanFieldValueUpdatedEventObject$`id`)) {
        self$`id` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`id`
      }
      if (!is.null(ProjectPortfolioPlanFieldValueUpdatedEventObject$`name`)) {
        self$`name` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`name`
      }
      if (!is.null(ProjectPortfolioPlanFieldValueUpdatedEventObject$`field`)) {
        fieldObject <- Field$new()
        fieldObject$fromJSON(jsonlite::toJSON(ProjectPortfolioPlanFieldValueUpdatedEventObject$field, auto_unbox = TRUE))
        self$`field` <- fieldObject
      }
      if (!is.null(ProjectPortfolioPlanFieldValueUpdatedEventObject$`portfolioPlan`)) {
        portfolioPlanObject <- PortfolioPlan$new()
        portfolioPlanObject$fromJSON(jsonlite::toJSON(ProjectPortfolioPlanFieldValueUpdatedEventObject$portfolioPlan, auto_unbox = TRUE))
        self$`portfolioPlan` <- portfolioPlanObject
      }
      if (!is.null(ProjectPortfolioPlanFieldValueUpdatedEventObject$`value`)) {
        self$`value` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`value`
      }
      if (!is.null(ProjectPortfolioPlanFieldValueUpdatedEventObject$`previousValue`)) {
        self$`previousValue` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`previousValue`
      }
      if (!is.null(ProjectPortfolioPlanFieldValueUpdatedEventObject$`numericValue`)) {
        self$`numericValue` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`numericValue`
      }
      if (!is.null(ProjectPortfolioPlanFieldValueUpdatedEventObject$`previousNumericValue`)) {
        self$`previousNumericValue` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`previousNumericValue`
      }
      if (!is.null(ProjectPortfolioPlanFieldValueUpdatedEventObject$`timePeriod`)) {
        timePeriodObject <- TimePeriod$new()
        timePeriodObject$fromJSON(jsonlite::toJSON(ProjectPortfolioPlanFieldValueUpdatedEventObject$timePeriod, auto_unbox = TRUE))
        self$`timePeriod` <- timePeriodObject
      }
      if (!is.null(ProjectPortfolioPlanFieldValueUpdatedEventObject$`portfolioId`)) {
        self$`portfolioId` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`portfolioId`
      }
      if (!is.null(ProjectPortfolioPlanFieldValueUpdatedEventObject$`isRebaseline`)) {
        self$`isRebaseline` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`isRebaseline`
      }
      if (!is.null(ProjectPortfolioPlanFieldValueUpdatedEventObject$`isFromImport`)) {
        self$`isFromImport` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`isFromImport`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "name": %s,
           "field": %s,
           "portfolioPlan": %s,
           "value": %s,
           "previousValue": %s,
           "numericValue": %d,
           "previousNumericValue": %d,
           "timePeriod": %s,
           "portfolioId": %s,
           "isRebaseline": %s,
           "isFromImport": %s
        }',
        self$`id`,
        self$`name`,
        self$`field`$toJSON(),
        self$`portfolioPlan`$toJSON(),
        self$`value`,
        self$`previousValue`,
        self$`numericValue`,
        self$`previousNumericValue`,
        self$`timePeriod`$toJSON(),
        self$`portfolioId`,
        self$`isRebaseline`,
        self$`isFromImport`
      )
    },
    fromJSONString = function(ProjectPortfolioPlanFieldValueUpdatedEventJson) {
      ProjectPortfolioPlanFieldValueUpdatedEventObject <- jsonlite::fromJSON(ProjectPortfolioPlanFieldValueUpdatedEventJson)
      self$`id` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`id`
      self$`name` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`name`
      FieldObject <- Field$new()
      self$`field` <- FieldObject$fromJSON(jsonlite::toJSON(ProjectPortfolioPlanFieldValueUpdatedEventObject$field, auto_unbox = TRUE))
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`portfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(ProjectPortfolioPlanFieldValueUpdatedEventObject$portfolioPlan, auto_unbox = TRUE))
      self$`value` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`value`
      self$`previousValue` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`previousValue`
      self$`numericValue` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`numericValue`
      self$`previousNumericValue` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`previousNumericValue`
      TimePeriodObject <- TimePeriod$new()
      self$`timePeriod` <- TimePeriodObject$fromJSON(jsonlite::toJSON(ProjectPortfolioPlanFieldValueUpdatedEventObject$timePeriod, auto_unbox = TRUE))
      self$`portfolioId` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`portfolioId`
      self$`isRebaseline` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`isRebaseline`
      self$`isFromImport` <- ProjectPortfolioPlanFieldValueUpdatedEventObject$`isFromImport`
    }
  )
)
