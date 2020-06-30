# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' UserStatus Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UserStatus <- R6::R6Class(
  'UserStatus',
  public = list(
    initialize = function(){
    },
    toJSON = function() {
      UserStatusObject <- list()

      UserStatusObject
    },
    fromJSON = function(UserStatusJson) {
      UserStatusObject <- dlensFromJSON(UserStatusJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(UserStatusJson) {
      UserStatusObject <- dlensFromJSON(UserStatusJson)
    }
  )
)