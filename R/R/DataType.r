# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' DataType Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DataType <- R6::R6Class(
  'DataType',
  public = list(
    initialize = function(){
    },
    toJSON = function() {
      DataTypeObject <- list()

      DataTypeObject
    },
    fromJSON = function(DataTypeJson) {
      DataTypeObject <- jsonlite::fromJSON(DataTypeJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(DataTypeJson) {
      DataTypeObject <- jsonlite::fromJSON(DataTypeJson)
    }
  )
)
