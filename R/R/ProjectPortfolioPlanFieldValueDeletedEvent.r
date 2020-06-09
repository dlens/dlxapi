# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ProjectPortfolioPlanFieldValueDeletedEvent Class
#'
#' @field id 
#' @field name 
#' @field field 
#' @field portfolioPlan 
#' @field timePeriod 
#' @field portfolioId 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProjectPortfolioPlanFieldValueDeletedEvent <- R6::R6Class(
  'ProjectPortfolioPlanFieldValueDeletedEvent',
  public = list(
    `id` = NULL,
    `name` = NULL,
    `field` = NULL,
    `portfolioPlan` = NULL,
    `timePeriod` = NULL,
    `portfolioId` = NULL,
    initialize = function(`id`, `name`, `field`, `portfolioPlan`, `timePeriod`, `portfolioId`){
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
      if (!missing(`timePeriod`)) {
        stopifnot(R6::is.R6(`timePeriod`))
        self$`timePeriod` <- `timePeriod`
      }
      if (!missing(`portfolioId`)) {
        stopifnot(is.character(`portfolioId`), length(`portfolioId`) == 1)
        self$`portfolioId` <- `portfolioId`
      }
    },
    toJSON = function() {
      ProjectPortfolioPlanFieldValueDeletedEventObject <- list()
      if (!is.null(self$`id`)) {
        ProjectPortfolioPlanFieldValueDeletedEventObject[['id']] <- self$`id`
      }
      if (!is.null(self$`name`)) {
        ProjectPortfolioPlanFieldValueDeletedEventObject[['name']] <- self$`name`
      }
      if (!is.null(self$`field`)) {
        ProjectPortfolioPlanFieldValueDeletedEventObject[['field']] <- self$`field`$toJSON()
      }
      if (!is.null(self$`portfolioPlan`)) {
        ProjectPortfolioPlanFieldValueDeletedEventObject[['portfolioPlan']] <- self$`portfolioPlan`$toJSON()
      }
      if (!is.null(self$`timePeriod`)) {
        ProjectPortfolioPlanFieldValueDeletedEventObject[['timePeriod']] <- self$`timePeriod`$toJSON()
      }
      if (!is.null(self$`portfolioId`)) {
        ProjectPortfolioPlanFieldValueDeletedEventObject[['portfolioId']] <- self$`portfolioId`
      }

      ProjectPortfolioPlanFieldValueDeletedEventObject
    },
    fromJSON = function(ProjectPortfolioPlanFieldValueDeletedEventJson) {
      ProjectPortfolioPlanFieldValueDeletedEventObject <- jsonlite::fromJSON(ProjectPortfolioPlanFieldValueDeletedEventJson)
      if (!is.null(ProjectPortfolioPlanFieldValueDeletedEventObject$`id`)) {
        self$`id` <- ProjectPortfolioPlanFieldValueDeletedEventObject$`id`
      }
      if (!is.null(ProjectPortfolioPlanFieldValueDeletedEventObject$`name`)) {
        self$`name` <- ProjectPortfolioPlanFieldValueDeletedEventObject$`name`
      }
      if (!is.null(ProjectPortfolioPlanFieldValueDeletedEventObject$`field`)) {
        fieldObject <- Field$new()
        fieldObject$fromJSON(jsonlite::toJSON(ProjectPortfolioPlanFieldValueDeletedEventObject$field, auto_unbox = TRUE))
        self$`field` <- fieldObject
      }
      if (!is.null(ProjectPortfolioPlanFieldValueDeletedEventObject$`portfolioPlan`)) {
        portfolioPlanObject <- PortfolioPlan$new()
        portfolioPlanObject$fromJSON(jsonlite::toJSON(ProjectPortfolioPlanFieldValueDeletedEventObject$portfolioPlan, auto_unbox = TRUE))
        self$`portfolioPlan` <- portfolioPlanObject
      }
      if (!is.null(ProjectPortfolioPlanFieldValueDeletedEventObject$`timePeriod`)) {
        timePeriodObject <- TimePeriod$new()
        timePeriodObject$fromJSON(jsonlite::toJSON(ProjectPortfolioPlanFieldValueDeletedEventObject$timePeriod, auto_unbox = TRUE))
        self$`timePeriod` <- timePeriodObject
      }
      if (!is.null(ProjectPortfolioPlanFieldValueDeletedEventObject$`portfolioId`)) {
        self$`portfolioId` <- ProjectPortfolioPlanFieldValueDeletedEventObject$`portfolioId`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "name": %s,
           "field": %s,
           "portfolioPlan": %s,
           "timePeriod": %s,
           "portfolioId": %s
        }',
        self$`id`,
        self$`name`,
        self$`field`$toJSON(),
        self$`portfolioPlan`$toJSON(),
        self$`timePeriod`$toJSON(),
        self$`portfolioId`
      )
    },
    fromJSONString = function(ProjectPortfolioPlanFieldValueDeletedEventJson) {
      ProjectPortfolioPlanFieldValueDeletedEventObject <- jsonlite::fromJSON(ProjectPortfolioPlanFieldValueDeletedEventJson)
      self$`id` <- ProjectPortfolioPlanFieldValueDeletedEventObject$`id`
      self$`name` <- ProjectPortfolioPlanFieldValueDeletedEventObject$`name`
      FieldObject <- Field$new()
      self$`field` <- FieldObject$fromJSON(jsonlite::toJSON(ProjectPortfolioPlanFieldValueDeletedEventObject$field, auto_unbox = TRUE))
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`portfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(ProjectPortfolioPlanFieldValueDeletedEventObject$portfolioPlan, auto_unbox = TRUE))
      TimePeriodObject <- TimePeriod$new()
      self$`timePeriod` <- TimePeriodObject$fromJSON(jsonlite::toJSON(ProjectPortfolioPlanFieldValueDeletedEventObject$timePeriod, auto_unbox = TRUE))
      self$`portfolioId` <- ProjectPortfolioPlanFieldValueDeletedEventObject$`portfolioId`
    }
  )
)
