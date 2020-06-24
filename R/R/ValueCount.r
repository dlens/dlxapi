# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ValueCount Class
#'
#' @field value 
#' @field count 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ValueCount <- R6::R6Class(
  'ValueCount',
  public = list(
    `value` = NULL,
    `count` = NULL,
    initialize = function(`value`, `count`){
      if (!missing(`value`)) {
        stopifnot(is.character(`value`), length(`value`) == 1)
        self$`value` <- `value`
      }
      if (!missing(`count`)) {
        stopifnot(is.numeric(`count`), length(`count`) == 1)
        self$`count` <- `count`
      }
    },
    toJSON = function() {
      ValueCountObject <- list()
      if (!is.null(self$`value`)) {
        ValueCountObject[['value']] <- self$`value`
      }
      if (!is.null(self$`count`)) {
        ValueCountObject[['count']] <- self$`count`
      }

      ValueCountObject
    },
    fromJSON = function(ValueCountJson) {
      ValueCountObject <- dlensFromJSON(ValueCountJson)
      if (!is.null(ValueCountObject$`value`)) {
        self$`value` <- ValueCountObject$`value`
      }
      if (!is.null(ValueCountObject$`count`)) {
        self$`count` <- ValueCountObject$`count`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "value": %s,
           "count": %d
        }',
        self$`value`,
        self$`count`
      )
    },
    fromJSONString = function(ValueCountJson) {
      ValueCountObject <- dlensFromJSON(ValueCountJson)
      self$`value` <- ValueCountObject$`value`
      self$`count` <- ValueCountObject$`count`
    }
  )
)
