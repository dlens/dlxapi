# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' OperationType Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OperationType <- R6::R6Class(
  'OperationType',
  public = list(
    initialize = function(){
    },
    toJSON = function() {
      OperationTypeObject <- list()

      OperationTypeObject
    },
    fromJSON = function(OperationTypeJson) {
      OperationTypeObject <- dlensFromJSON(OperationTypeJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(OperationTypeJson) {
      OperationTypeObject <- dlensFromJSON(OperationTypeJson)
    }
  )
)
