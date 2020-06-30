# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' DataUpdatedMessagePayload Class
#'
#' @field message 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DataUpdatedMessagePayload <- R6::R6Class(
  'DataUpdatedMessagePayload',
  public = list(
    `message` = NULL,
    initialize = function(`message`){
      if (!missing(`message`)) {
        stopifnot(is.character(`message`), length(`message`) == 1)
        self$`message` <- `message`
      }
    },
    toJSON = function() {
      DataUpdatedMessagePayloadObject <- list()
      if (!is.null(self$`message`)) {
        DataUpdatedMessagePayloadObject[['message']] <- self$`message`
      }

      DataUpdatedMessagePayloadObject
    },
    fromJSON = function(DataUpdatedMessagePayloadJson) {
      DataUpdatedMessagePayloadObject <- dlensFromJSON(DataUpdatedMessagePayloadJson)
      if (!is.null(DataUpdatedMessagePayloadObject$`message`)) {
        self$`message` <- DataUpdatedMessagePayloadObject$`message`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "message": %s
        }',
        self$`message`
      )
    },
    fromJSONString = function(DataUpdatedMessagePayloadJson) {
      DataUpdatedMessagePayloadObject <- dlensFromJSON(DataUpdatedMessagePayloadJson)
      self$`message` <- DataUpdatedMessagePayloadObject$`message`
    }
  )
)