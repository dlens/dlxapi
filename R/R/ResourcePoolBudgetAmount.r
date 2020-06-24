# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ResourcePoolBudgetAmount Class
#'
#' @field resourcePool 
#' @field timePeriod 
#' @field amount 
#' @field details 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ResourcePoolBudgetAmount <- R6::R6Class(
  'ResourcePoolBudgetAmount',
  public = list(
    `resourcePool` = NULL,
    `timePeriod` = NULL,
    `amount` = NULL,
    `details` = NULL,
    initialize = function(`resourcePool`, `timePeriod`, `amount`, `details`){
      if (!missing(`resourcePool`)) {
        stopifnot(R6::is.R6(`resourcePool`))
        self$`resourcePool` <- `resourcePool`
      }
      if (!missing(`timePeriod`)) {
        stopifnot(R6::is.R6(`timePeriod`))
        self$`timePeriod` <- `timePeriod`
      }
      if (!missing(`amount`)) {
        stopifnot(is.numeric(`amount`), length(`amount`) == 1)
        self$`amount` <- `amount`
      }
      if (!missing(`details`)) {
        stopifnot(R6::is.R6(`details`))
        self$`details` <- `details`
      }
    },
    toJSON = function() {
      ResourcePoolBudgetAmountObject <- list()
      if (!is.null(self$`resourcePool`)) {
        ResourcePoolBudgetAmountObject[['resourcePool']] <- self$`resourcePool`$toJSON()
      }
      if (!is.null(self$`timePeriod`)) {
        ResourcePoolBudgetAmountObject[['timePeriod']] <- self$`timePeriod`$toJSON()
      }
      if (!is.null(self$`amount`)) {
        ResourcePoolBudgetAmountObject[['amount']] <- self$`amount`
      }
      if (!is.null(self$`details`)) {
        ResourcePoolBudgetAmountObject[['details']] <- self$`details`$toJSON()
      }

      ResourcePoolBudgetAmountObject
    },
    fromJSON = function(ResourcePoolBudgetAmountJson) {
      ResourcePoolBudgetAmountObject <- dlensFromJSON(ResourcePoolBudgetAmountJson)
      if (!is.null(ResourcePoolBudgetAmountObject$`resourcePool`)) {
        resourcePoolObject <- ResourcePool$new()
        resourcePoolObject$fromJSON(jsonlite::toJSON(ResourcePoolBudgetAmountObject$resourcePool, auto_unbox = TRUE))
        self$`resourcePool` <- resourcePoolObject
      }
      if (!is.null(ResourcePoolBudgetAmountObject$`timePeriod`)) {
        timePeriodObject <- TimePeriod$new()
        timePeriodObject$fromJSON(jsonlite::toJSON(ResourcePoolBudgetAmountObject$timePeriod, auto_unbox = TRUE))
        self$`timePeriod` <- timePeriodObject
      }
      if (!is.null(ResourcePoolBudgetAmountObject$`amount`)) {
        self$`amount` <- ResourcePoolBudgetAmountObject$`amount`
      }
      if (!is.null(ResourcePoolBudgetAmountObject$`details`)) {
        detailsObject <- ResourcePoolBudgetAmounts$new()
        detailsObject$fromJSON(jsonlite::toJSON(ResourcePoolBudgetAmountObject$details, auto_unbox = TRUE))
        self$`details` <- detailsObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "resourcePool": %s,
           "timePeriod": %s,
           "amount": %d,
           "details": %s
        }',
        self$`resourcePool`$toJSON(),
        self$`timePeriod`$toJSON(),
        self$`amount`,
        self$`details`$toJSON()
      )
    },
    fromJSONString = function(ResourcePoolBudgetAmountJson) {
      ResourcePoolBudgetAmountObject <- dlensFromJSON(ResourcePoolBudgetAmountJson)
      ResourcePoolObject <- ResourcePool$new()
      self$`resourcePool` <- ResourcePoolObject$fromJSON(jsonlite::toJSON(ResourcePoolBudgetAmountObject$resourcePool, auto_unbox = TRUE))
      TimePeriodObject <- TimePeriod$new()
      self$`timePeriod` <- TimePeriodObject$fromJSON(jsonlite::toJSON(ResourcePoolBudgetAmountObject$timePeriod, auto_unbox = TRUE))
      self$`amount` <- ResourcePoolBudgetAmountObject$`amount`
      ResourcePoolBudgetAmountsObject <- ResourcePoolBudgetAmounts$new()
      self$`details` <- ResourcePoolBudgetAmountsObject$fromJSON(jsonlite::toJSON(ResourcePoolBudgetAmountObject$details, auto_unbox = TRUE))
    }
  )
)
