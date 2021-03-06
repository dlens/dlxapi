# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
#
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Operations Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Operations <- R6::R6Class(
  'Operations',
  public = list(
    initialize = function(){
      self$ops = c()
    },
    toJSON = function() {
      OperationsObject <- list()

      OperationsObject
    },
    fromJSON = function(OperationsJson) {
      OperationsObject <- dlensFromJSON(OperationsJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(OperationsJson) {
      OperationsObject <- dlensFromJSON(OperationsJson)
    }
  )
)
