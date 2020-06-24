# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' TimePeriod Class
#'
#' @field startDate 
#' @field type 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TimePeriod <- R6::R6Class(
  'TimePeriod',
  public = list(
    `startDate` = NULL,
    `type` = NULL,
    initialize = function(`startDate`, `type`){
      if (!missing(`startDate`)) {
        stopifnot(is.numeric(`startDate`), length(`startDate`) == 1)
        self$`startDate` <- `startDate`
      }
      if (!missing(`type`)) {
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
    },
    toJSON = function() {
      TimePeriodObject <- list()
      if (!is.null(self$`startDate`)) {
        TimePeriodObject[['startDate']] <- self$`startDate`
      }
      if (!is.null(self$`type`)) {
        TimePeriodObject[['type']] <- self$`type`$toJSON()
      }

      TimePeriodObject
    },
    fromJSON = function(TimePeriodJson) {
      TimePeriodObject <- dlensFromJSON(TimePeriodJson)
      if (!is.null(TimePeriodObject$`startDate`)) {
        self$`startDate` <- TimePeriodObject$`startDate`
      }
      if (!is.null(TimePeriodObject$`type`)) {
        typeObject <- TimePeriodType$new()
        typeObject$fromJSON(jsonlite::toJSON(TimePeriodObject$type, auto_unbox = TRUE))
        self$`type` <- typeObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "startDate": %d,
           "type": %s
        }',
        self$`startDate`,
        self$`type`$toJSON()
      )
    },
    fromJSONString = function(TimePeriodJson) {
      TimePeriodObject <- dlensFromJSON(TimePeriodJson)
      self$`startDate` <- TimePeriodObject$`startDate`
      TimePeriodTypeObject <- TimePeriodType$new()
      self$`type` <- TimePeriodTypeObject$fromJSON(jsonlite::toJSON(TimePeriodObject$type, auto_unbox = TRUE))
    }
  )
)
