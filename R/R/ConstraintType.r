# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ConstraintType Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConstraintType <- R6::R6Class(
  'ConstraintType',
  public = list(
    initialize = function(){
    },
    toJSON = function() {
      ConstraintTypeObject <- list()

      ConstraintTypeObject
    },
    fromJSON = function(ConstraintTypeJson) {
      ConstraintTypeObject <- dlensFromJSON(ConstraintTypeJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(ConstraintTypeJson) {
      ConstraintTypeObject <- dlensFromJSON(ConstraintTypeJson)
    }
  )
)