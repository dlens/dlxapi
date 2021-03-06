# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Projects Class
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
Projects <- R6::R6Class(
  'Projects',
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
      ProjectsObject <- list()
      if (!is.null(self$`href`)) {
        ProjectsObject[['href']] <- self$`href`
      }
      if (!is.null(self$`offset`)) {
        ProjectsObject[['offset']] <- self$`offset`
      }
      if (!is.null(self$`limit`)) {
        ProjectsObject[['limit']] <- self$`limit`
      }
      if (!is.null(self$`size`)) {
        ProjectsObject[['size']] <- self$`size`
      }
      if (!is.null(self$`items`)) {
        ProjectsObject[['items']] <- lapply(self$`items`, function(x) x$toJSON())
      }

      ProjectsObject
    },
    fromJSON = function(ProjectsJson) {
      ProjectsObject <- dlensFromJSON(ProjectsJson)
      if (!is.null(ProjectsObject$`href`)) {
        self$`href` <- ProjectsObject$`href`
      }
      if (!is.null(ProjectsObject$`offset`)) {
        self$`offset` <- ProjectsObject$`offset`
      }
      if (!is.null(ProjectsObject$`limit`)) {
        self$`limit` <- ProjectsObject$`limit`
      }
      if (!is.null(ProjectsObject$`size`)) {
        self$`size` <- ProjectsObject$`size`
      }
      if (!is.null(ProjectsObject$`items`)) {
        self$`items` <- lapply(ProjectsObject$`items`, function(x) {
          itemsObject <- Project$new()
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
    fromJSONString = function(ProjectsJson) {
      ProjectsObject <- dlensFromJSON(ProjectsJson)
      self$`href` <- ProjectsObject$`href`
      self$`offset` <- ProjectsObject$`offset`
      self$`limit` <- ProjectsObject$`limit`
      self$`size` <- ProjectsObject$`size`
      self$`items` <- lapply(ProjectsObject$`items`, function(x) Project$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
