# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Properties Class
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
Properties <- R6::R6Class(
  'Properties',
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
      PropertiesObject <- list()
      if (!is.null(self$`href`)) {
        PropertiesObject[['href']] <- self$`href`
      }
      if (!is.null(self$`offset`)) {
        PropertiesObject[['offset']] <- self$`offset`
      }
      if (!is.null(self$`limit`)) {
        PropertiesObject[['limit']] <- self$`limit`
      }
      if (!is.null(self$`size`)) {
        PropertiesObject[['size']] <- self$`size`
      }
      if (!is.null(self$`items`)) {
        PropertiesObject[['items']] <- lapply(self$`items`, function(x) x$toJSON())
      }

      PropertiesObject
    },
    fromJSON = function(PropertiesJson) {
      PropertiesObject <- jsonlite::fromJSON(PropertiesJson)
      if (!is.null(PropertiesObject$`href`)) {
        self$`href` <- PropertiesObject$`href`
      }
      if (!is.null(PropertiesObject$`offset`)) {
        self$`offset` <- PropertiesObject$`offset`
      }
      if (!is.null(PropertiesObject$`limit`)) {
        self$`limit` <- PropertiesObject$`limit`
      }
      if (!is.null(PropertiesObject$`size`)) {
        self$`size` <- PropertiesObject$`size`
      }
      if (!is.null(PropertiesObject$`items`)) {
        self$`items` <- lapply(PropertiesObject$`items`, function(x) {
          itemsObject <- Property$new()
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
    fromJSONString = function(PropertiesJson) {
      PropertiesObject <- jsonlite::fromJSON(PropertiesJson)
      self$`href` <- PropertiesObject$`href`
      self$`offset` <- PropertiesObject$`offset`
      self$`limit` <- PropertiesObject$`limit`
      self$`size` <- PropertiesObject$`size`
      self$`items` <- lapply(PropertiesObject$`items`, function(x) Property$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
