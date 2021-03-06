# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ExportType Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ExportType <- R6::R6Class(
  'ExportType',
  public = list(
    initialize = function(){
    },
    toJSON = function() {
      ExportTypeObject <- list()

      ExportTypeObject
    },
    fromJSON = function(ExportTypeJson) {
      ExportTypeObject <- dlensFromJSON(ExportTypeJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(ExportTypeJson) {
      ExportTypeObject <- dlensFromJSON(ExportTypeJson)
    }
  )
)
