# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Attributes Class
#'
#' @field timeInterval 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Attributes <- R6::R6Class(
  'Attributes',
  public = list(
    `timeInterval` = NULL,
    initialize = function(`timeInterval`){
      if (!missing(`timeInterval`)) {
        stopifnot(R6::is.R6(`timeInterval`))
        self$`timeInterval` <- `timeInterval`
      }
    },
    toJSON = function() {
      AttributesObject <- list()
      if (!is.null(self$`timeInterval`)) {
        AttributesObject[['timeInterval']] <- self$`timeInterval`$toJSON()
      }

      AttributesObject
    },
    fromJSON = function(AttributesJson) {
      AttributesObject <- dlensFromJSON(AttributesJson)
      if (!is.null(AttributesObject$`timeInterval`)) {
        timeIntervalObject <- TimeInterval$new()
        timeIntervalObject$fromJSON(jsonlite::toJSON(AttributesObject$timeInterval, auto_unbox = TRUE))
        self$`timeInterval` <- timeIntervalObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "timeInterval": %s
        }',
        self$`timeInterval`$toJSON()
      )
    },
    fromJSONString = function(AttributesJson) {
      AttributesObject <- dlensFromJSON(AttributesJson)
      TimeIntervalObject <- TimeInterval$new()
      self$`timeInterval` <- TimeIntervalObject$fromJSON(jsonlite::toJSON(AttributesObject$timeInterval, auto_unbox = TRUE))
    }
  )
)
