# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ErrorResponse Class
#'
#' @field code 
#' @field message 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ErrorResponse <- R6::R6Class(
  'ErrorResponse',
  public = list(
    `code` = NULL,
    `message` = NULL,
    initialize = function(`code`, `message`){
      if (!missing(`code`)) {
        stopifnot(is.numeric(`code`), length(`code`) == 1)
        self$`code` <- `code`
      }
      if (!missing(`message`)) {
        stopifnot(is.character(`message`), length(`message`) == 1)
        self$`message` <- `message`
      }
    },
    toJSON = function() {
      ErrorResponseObject <- list()
      if (!is.null(self$`code`)) {
        ErrorResponseObject[['code']] <- self$`code`
      }
      if (!is.null(self$`message`)) {
        ErrorResponseObject[['message']] <- self$`message`
      }

      ErrorResponseObject
    },
    fromJSON = function(ErrorResponseJson) {
      ErrorResponseObject <- dlensFromJSON(ErrorResponseJson)
      if (!is.null(ErrorResponseObject$`code`)) {
        self$`code` <- ErrorResponseObject$`code`
      }
      if (!is.null(ErrorResponseObject$`message`)) {
        self$`message` <- ErrorResponseObject$`message`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "code": %d,
           "message": %s
        }',
        self$`code`,
        self$`message`
      )
    },
    fromJSONString = function(ErrorResponseJson) {
      ErrorResponseObject <- dlensFromJSON(ErrorResponseJson)
      self$`code` <- ErrorResponseObject$`code`
      self$`message` <- ErrorResponseObject$`message`
    }
  )
)