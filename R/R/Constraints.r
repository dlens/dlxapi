# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Constraints Class
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
Constraints <- R6::R6Class(
  'Constraints',
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
      ConstraintsObject <- list()
      if (!is.null(self$`href`)) {
        ConstraintsObject[['href']] <- self$`href`
      }
      if (!is.null(self$`offset`)) {
        ConstraintsObject[['offset']] <- self$`offset`
      }
      if (!is.null(self$`limit`)) {
        ConstraintsObject[['limit']] <- self$`limit`
      }
      if (!is.null(self$`size`)) {
        ConstraintsObject[['size']] <- self$`size`
      }
      if (!is.null(self$`items`)) {
        ConstraintsObject[['items']] <- lapply(self$`items`, function(x) x$toJSON())
      }

      ConstraintsObject
    },
    fromJSON = function(ConstraintsJson) {
      ConstraintsObject <- dlensFromJSON(ConstraintsJson)
      if (!is.null(ConstraintsObject$`href`)) {
        self$`href` <- ConstraintsObject$`href`
      }
      if (!is.null(ConstraintsObject$`offset`)) {
        self$`offset` <- ConstraintsObject$`offset`
      }
      if (!is.null(ConstraintsObject$`limit`)) {
        self$`limit` <- ConstraintsObject$`limit`
      }
      if (!is.null(ConstraintsObject$`size`)) {
        self$`size` <- ConstraintsObject$`size`
      }
      if (!is.null(ConstraintsObject$`items`)) {
        self$`items` <- lapply(ConstraintsObject$`items`, function(x) {
          itemsObject <- Constraint$new()
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
    fromJSONString = function(ConstraintsJson) {
      ConstraintsObject <- dlensFromJSON(ConstraintsJson)
      self$`href` <- ConstraintsObject$`href`
      self$`offset` <- ConstraintsObject$`offset`
      self$`limit` <- ConstraintsObject$`limit`
      self$`size` <- ConstraintsObject$`size`
      self$`items` <- lapply(ConstraintsObject$`items`, function(x) Constraint$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
