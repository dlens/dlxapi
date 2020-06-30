# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Fields Class
#'
#' @field href 
#' @field offset 
#' @field limit 
#' @field size 
#' @field items 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Fields <- R6::R6Class(
  'Fields',
  public = list(
    `href` = NULL,
    `offset` = NULL,
    `limit` = NULL,
    `size` = NULL,
    `items` = NULL,
    initialize = function(`href`, `offset`, `limit`, `size`, `items`){
      if (!missing(`href`)) {
        stopifnot(is.character(`href`), length(`href`) == 1)
        self$`href` <- `href`
      }
      if (!missing(`offset`)) {
        stopifnot(is.numeric(`offset`), length(`offset`) == 1)
        self$`offset` <- `offset`
      }
      if (!missing(`limit`)) {
        stopifnot(is.numeric(`limit`), length(`limit`) == 1)
        self$`limit` <- `limit`
      }
      if (!missing(`size`)) {
        stopifnot(is.numeric(`size`), length(`size`) == 1)
        self$`size` <- `size`
      }
      if (!missing(`items`)) {
        stopifnot(is.list(`items`), length(`items`) != 0)
        lapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
      }
    },
    toJSON = function() {
      FieldsObject <- list()
      if (!is.null(self$`href`)) {
        FieldsObject[['href']] <- self$`href`
      }
      if (!is.null(self$`offset`)) {
        FieldsObject[['offset']] <- self$`offset`
      }
      if (!is.null(self$`limit`)) {
        FieldsObject[['limit']] <- self$`limit`
      }
      if (!is.null(self$`size`)) {
        FieldsObject[['size']] <- self$`size`
      }
      if (!is.null(self$`items`)) {
        FieldsObject[['items']] <- lapply(self$`items`, function(x) x$toJSON())
      }

      FieldsObject
    },
    fromJSON = function(FieldsJson) {
      FieldsObject <- dlensFromJSON(FieldsJson)
      if (!is.null(FieldsObject$`href`)) {
        self$`href` <- FieldsObject$`href`
      }
      if (!is.null(FieldsObject$`offset`)) {
        self$`offset` <- FieldsObject$`offset`
      }
      if (!is.null(FieldsObject$`limit`)) {
        self$`limit` <- FieldsObject$`limit`
      }
      if (!is.null(FieldsObject$`size`)) {
        self$`size` <- FieldsObject$`size`
      }
      if (!is.null(FieldsObject$`items`)) {
        self$`items` <- lapply(FieldsObject$`items`, function(x) {
          itemsObject <- Field$new()
          itemsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          itemsObject
        })
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "href": %s,
           "offset": %d,
           "limit": %d,
           "size": %d,
           "items": [%s]
        }',
        self$`href`,
        self$`offset`,
        self$`limit`,
        self$`size`,
        lapply(self$`items`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(FieldsJson) {
      FieldsObject <- dlensFromJSON(FieldsJson)
      self$`href` <- FieldsObject$`href`
      self$`offset` <- FieldsObject$`offset`
      self$`limit` <- FieldsObject$`limit`
      self$`size` <- FieldsObject$`size`
      self$`items` <- lapply(FieldsObject$`items`, function(x) Field$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)