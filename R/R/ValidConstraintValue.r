# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ValidConstraintValue Class
#'
#' @field field 
#' @field minCost 
#' @field maxCost 
#' @field totalCost 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ValidConstraintValue <- R6::R6Class(
  'ValidConstraintValue',
  public = list(
    `field` = NULL,
    `minCost` = NULL,
    `maxCost` = NULL,
    `totalCost` = NULL,
    initialize = function(`field`, `minCost`, `maxCost`, `totalCost`){
      if (!missing(`field`)) {
        stopifnot(R6::is.R6(`field`))
        self$`field` <- `field`
      }
      if (!missing(`minCost`)) {
        stopifnot(is.numeric(`minCost`), length(`minCost`) == 1)
        self$`minCost` <- `minCost`
      }
      if (!missing(`maxCost`)) {
        stopifnot(is.numeric(`maxCost`), length(`maxCost`) == 1)
        self$`maxCost` <- `maxCost`
      }
      if (!missing(`totalCost`)) {
        stopifnot(is.numeric(`totalCost`), length(`totalCost`) == 1)
        self$`totalCost` <- `totalCost`
      }
    },
    toJSON = function() {
      ValidConstraintValueObject <- list()
      if (!is.null(self$`field`)) {
        ValidConstraintValueObject[['field']] <- self$`field`$toJSON()
      }
      if (!is.null(self$`minCost`)) {
        ValidConstraintValueObject[['minCost']] <- self$`minCost`
      }
      if (!is.null(self$`maxCost`)) {
        ValidConstraintValueObject[['maxCost']] <- self$`maxCost`
      }
      if (!is.null(self$`totalCost`)) {
        ValidConstraintValueObject[['totalCost']] <- self$`totalCost`
      }

      ValidConstraintValueObject
    },
    fromJSON = function(ValidConstraintValueJson) {
      ValidConstraintValueObject <- dlensFromJSON(ValidConstraintValueJson)
      if (!is.null(ValidConstraintValueObject$`field`)) {
        fieldObject <- Field$new()
        fieldObject$fromJSON(jsonlite::toJSON(ValidConstraintValueObject$field, auto_unbox = TRUE))
        self$`field` <- fieldObject
      }
      if (!is.null(ValidConstraintValueObject$`minCost`)) {
        self$`minCost` <- ValidConstraintValueObject$`minCost`
      }
      if (!is.null(ValidConstraintValueObject$`maxCost`)) {
        self$`maxCost` <- ValidConstraintValueObject$`maxCost`
      }
      if (!is.null(ValidConstraintValueObject$`totalCost`)) {
        self$`totalCost` <- ValidConstraintValueObject$`totalCost`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "field": %s,
           "minCost": %d,
           "maxCost": %d,
           "totalCost": %d
        }',
        self$`field`$toJSON(),
        self$`minCost`,
        self$`maxCost`,
        self$`totalCost`
      )
    },
    fromJSONString = function(ValidConstraintValueJson) {
      ValidConstraintValueObject <- dlensFromJSON(ValidConstraintValueJson)
      FieldObject <- Field$new()
      self$`field` <- FieldObject$fromJSON(jsonlite::toJSON(ValidConstraintValueObject$field, auto_unbox = TRUE))
      self$`minCost` <- ValidConstraintValueObject$`minCost`
      self$`maxCost` <- ValidConstraintValueObject$`maxCost`
      self$`totalCost` <- ValidConstraintValueObject$`totalCost`
    }
  )
)
