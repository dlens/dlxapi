# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Property Class
#'
#' @field name 
#' @field value 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Property <- R6::R6Class(
  'Property',
  public = list(
    `name` = NULL,
    `value` = NULL,
    initialize = function(`name`, `value`){
      if (!missing(`name`)) {
        stopifnot(R6::is.R6(`name`))
        self$`name` <- `name`
      }
      if (!missing(`value`)) {
        stopifnot(is.character(`value`), length(`value`) == 1)
        self$`value` <- `value`
      }
    },
    toJSON = function() {
      PropertyObject <- list()
      if (!is.null(self$`name`)) {
        PropertyObject[['name']] <- self$`name`$toJSON()
      }
      if (!is.null(self$`value`)) {
        PropertyObject[['value']] <- self$`value`
      }

      PropertyObject
    },
    fromJSON = function(PropertyJson) {
      PropertyObject <- dlensFromJSON(PropertyJson)
      if (!is.null(PropertyObject$`name`)) {
        nameObject <- PropertyName$new()
        nameObject$fromJSON(jsonlite::toJSON(PropertyObject$name, auto_unbox = TRUE))
        self$`name` <- nameObject
      }
      if (!is.null(PropertyObject$`value`)) {
        self$`value` <- PropertyObject$`value`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "name": %s,
           "value": %s
        }',
        self$`name`$toJSON(),
        self$`value`
      )
    },
    fromJSONString = function(PropertyJson) {
      PropertyObject <- dlensFromJSON(PropertyJson)
      PropertyNameObject <- PropertyName$new()
      self$`name` <- PropertyNameObject$fromJSON(jsonlite::toJSON(PropertyObject$name, auto_unbox = TRUE))
      self$`value` <- PropertyObject$`value`
    }
  )
)
