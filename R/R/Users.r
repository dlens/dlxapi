# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Users Class
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
Users <- R6::R6Class(
  'Users',
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
      UsersObject <- list()
      if (!is.null(self$`href`)) {
        UsersObject[['href']] <- self$`href`
      }
      if (!is.null(self$`offset`)) {
        UsersObject[['offset']] <- self$`offset`
      }
      if (!is.null(self$`limit`)) {
        UsersObject[['limit']] <- self$`limit`
      }
      if (!is.null(self$`size`)) {
        UsersObject[['size']] <- self$`size`
      }
      if (!is.null(self$`items`)) {
        UsersObject[['items']] <- lapply(self$`items`, function(x) x$toJSON())
      }

      UsersObject
    },
    fromJSON = function(UsersJson) {
      UsersObject <- dlensFromJSON(UsersJson)
      if (!is.null(UsersObject$`href`)) {
        self$`href` <- UsersObject$`href`
      }
      if (!is.null(UsersObject$`offset`)) {
        self$`offset` <- UsersObject$`offset`
      }
      if (!is.null(UsersObject$`limit`)) {
        self$`limit` <- UsersObject$`limit`
      }
      if (!is.null(UsersObject$`size`)) {
        self$`size` <- UsersObject$`size`
      }
      if (!is.null(UsersObject$`items`)) {
        self$`items` <- lapply(UsersObject$`items`, function(x) {
          itemsObject <- User$new()
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
    fromJSONString = function(UsersJson) {
      UsersObject <- dlensFromJSON(UsersJson)
      self$`href` <- UsersObject$`href`
      self$`offset` <- UsersObject$`offset`
      self$`limit` <- UsersObject$`limit`
      self$`size` <- UsersObject$`size`
      self$`items` <- lapply(UsersObject$`items`, function(x) User$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
