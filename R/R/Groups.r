# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Groups Class
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
Groups <- R6::R6Class(
  'Groups',
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
      GroupsObject <- list()
      if (!is.null(self$`href`)) {
        GroupsObject[['href']] <- self$`href`
      }
      if (!is.null(self$`offset`)) {
        GroupsObject[['offset']] <- self$`offset`
      }
      if (!is.null(self$`limit`)) {
        GroupsObject[['limit']] <- self$`limit`
      }
      if (!is.null(self$`size`)) {
        GroupsObject[['size']] <- self$`size`
      }
      if (!is.null(self$`items`)) {
        GroupsObject[['items']] <- lapply(self$`items`, function(x) x$toJSON())
      }

      GroupsObject
    },
    fromJSON = function(GroupsJson) {
      GroupsObject <- dlensFromJSON(GroupsJson)
      if (!is.null(GroupsObject$`href`)) {
        self$`href` <- GroupsObject$`href`
      }
      if (!is.null(GroupsObject$`offset`)) {
        self$`offset` <- GroupsObject$`offset`
      }
      if (!is.null(GroupsObject$`limit`)) {
        self$`limit` <- GroupsObject$`limit`
      }
      if (!is.null(GroupsObject$`size`)) {
        self$`size` <- GroupsObject$`size`
      }
      if (!is.null(GroupsObject$`items`)) {
        self$`items` <- lapply(GroupsObject$`items`, function(x) {
          itemsObject <- Group$new()
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
    fromJSONString = function(GroupsJson) {
      GroupsObject <- dlensFromJSON(GroupsJson)
      self$`href` <- GroupsObject$`href`
      self$`offset` <- GroupsObject$`offset`
      self$`limit` <- GroupsObject$`limit`
      self$`size` <- GroupsObject$`size`
      self$`items` <- lapply(GroupsObject$`items`, function(x) Group$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
