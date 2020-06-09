# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' FieldGrades Class
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
FieldGrades <- R6::R6Class(
  'FieldGrades',
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
      FieldGradesObject <- list()
      if (!is.null(self$`href`)) {
        FieldGradesObject[['href']] <- self$`href`
      }
      if (!is.null(self$`offset`)) {
        FieldGradesObject[['offset']] <- self$`offset`
      }
      if (!is.null(self$`limit`)) {
        FieldGradesObject[['limit']] <- self$`limit`
      }
      if (!is.null(self$`size`)) {
        FieldGradesObject[['size']] <- self$`size`
      }
      if (!is.null(self$`items`)) {
        FieldGradesObject[['items']] <- lapply(self$`items`, function(x) x$toJSON())
      }

      FieldGradesObject
    },
    fromJSON = function(FieldGradesJson) {
      FieldGradesObject <- jsonlite::fromJSON(FieldGradesJson)
      if (!is.null(FieldGradesObject$`href`)) {
        self$`href` <- FieldGradesObject$`href`
      }
      if (!is.null(FieldGradesObject$`offset`)) {
        self$`offset` <- FieldGradesObject$`offset`
      }
      if (!is.null(FieldGradesObject$`limit`)) {
        self$`limit` <- FieldGradesObject$`limit`
      }
      if (!is.null(FieldGradesObject$`size`)) {
        self$`size` <- FieldGradesObject$`size`
      }
      if (!is.null(FieldGradesObject$`items`)) {
        self$`items` <- lapply(FieldGradesObject$`items`, function(x) {
          itemsObject <- FieldGrade$new()
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
    fromJSONString = function(FieldGradesJson) {
      FieldGradesObject <- jsonlite::fromJSON(FieldGradesJson)
      self$`href` <- FieldGradesObject$`href`
      self$`offset` <- FieldGradesObject$`offset`
      self$`limit` <- FieldGradesObject$`limit`
      self$`size` <- FieldGradesObject$`size`
      self$`items` <- lapply(FieldGradesObject$`items`, function(x) FieldGrade$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
