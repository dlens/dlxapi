# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Comments Class
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
Comments <- R6::R6Class(
  'Comments',
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
      CommentsObject <- list()
      if (!is.null(self$`href`)) {
        CommentsObject[['href']] <- self$`href`
      }
      if (!is.null(self$`offset`)) {
        CommentsObject[['offset']] <- self$`offset`
      }
      if (!is.null(self$`limit`)) {
        CommentsObject[['limit']] <- self$`limit`
      }
      if (!is.null(self$`size`)) {
        CommentsObject[['size']] <- self$`size`
      }
      if (!is.null(self$`items`)) {
        CommentsObject[['items']] <- lapply(self$`items`, function(x) x$toJSON())
      }

      CommentsObject
    },
    fromJSON = function(CommentsJson) {
      CommentsObject <- dlensFromJSON(CommentsJson)
      if (!is.null(CommentsObject$`href`)) {
        self$`href` <- CommentsObject$`href`
      }
      if (!is.null(CommentsObject$`offset`)) {
        self$`offset` <- CommentsObject$`offset`
      }
      if (!is.null(CommentsObject$`limit`)) {
        self$`limit` <- CommentsObject$`limit`
      }
      if (!is.null(CommentsObject$`size`)) {
        self$`size` <- CommentsObject$`size`
      }
      if (!is.null(CommentsObject$`items`)) {
        self$`items` <- lapply(CommentsObject$`items`, function(x) {
          itemsObject <- Comment$new()
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
    fromJSONString = function(CommentsJson) {
      CommentsObject <- dlensFromJSON(CommentsJson)
      self$`href` <- CommentsObject$`href`
      self$`offset` <- CommentsObject$`offset`
      self$`limit` <- CommentsObject$`limit`
      self$`size` <- CommentsObject$`size`
      self$`items` <- lapply(CommentsObject$`items`, function(x) Comment$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
