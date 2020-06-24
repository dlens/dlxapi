# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' RoleType Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RoleType <- R6::R6Class(
  'RoleType',
  public = list(
    initialize = function(){
    },
    toJSON = function() {
      RoleTypeObject <- list()

      RoleTypeObject
    },
    fromJSON = function(RoleTypeJson) {
      RoleTypeObject <- dlensFromJSON(RoleTypeJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(RoleTypeJson) {
      RoleTypeObject <- dlensFromJSON(RoleTypeJson)
    }
  )
)
