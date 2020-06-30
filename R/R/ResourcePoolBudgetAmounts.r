# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ResourcePoolBudgetAmounts Class
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
ResourcePoolBudgetAmounts <- R6::R6Class(
  'ResourcePoolBudgetAmounts',
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
      ResourcePoolBudgetAmountsObject <- list()
      if (!is.null(self$`href`)) {
        ResourcePoolBudgetAmountsObject[['href']] <- self$`href`
      }
      if (!is.null(self$`offset`)) {
        ResourcePoolBudgetAmountsObject[['offset']] <- self$`offset`
      }
      if (!is.null(self$`limit`)) {
        ResourcePoolBudgetAmountsObject[['limit']] <- self$`limit`
      }
      if (!is.null(self$`size`)) {
        ResourcePoolBudgetAmountsObject[['size']] <- self$`size`
      }
      if (!is.null(self$`items`)) {
        ResourcePoolBudgetAmountsObject[['items']] <- lapply(self$`items`, function(x) x$toJSON())
      }

      ResourcePoolBudgetAmountsObject
    },
    fromJSON = function(ResourcePoolBudgetAmountsJson) {
      ResourcePoolBudgetAmountsObject <- dlensFromJSON(ResourcePoolBudgetAmountsJson)
      if (!is.null(ResourcePoolBudgetAmountsObject$`href`)) {
        self$`href` <- ResourcePoolBudgetAmountsObject$`href`
      }
      if (!is.null(ResourcePoolBudgetAmountsObject$`offset`)) {
        self$`offset` <- ResourcePoolBudgetAmountsObject$`offset`
      }
      if (!is.null(ResourcePoolBudgetAmountsObject$`limit`)) {
        self$`limit` <- ResourcePoolBudgetAmountsObject$`limit`
      }
      if (!is.null(ResourcePoolBudgetAmountsObject$`size`)) {
        self$`size` <- ResourcePoolBudgetAmountsObject$`size`
      }
      if (!is.null(ResourcePoolBudgetAmountsObject$`items`)) {
        self$`items` <- lapply(ResourcePoolBudgetAmountsObject$`items`, function(x) {
          itemsObject <- ResourcePoolBudgetAmount$new()
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
    fromJSONString = function(ResourcePoolBudgetAmountsJson) {
      ResourcePoolBudgetAmountsObject <- dlensFromJSON(ResourcePoolBudgetAmountsJson)
      self$`href` <- ResourcePoolBudgetAmountsObject$`href`
      self$`offset` <- ResourcePoolBudgetAmountsObject$`offset`
      self$`limit` <- ResourcePoolBudgetAmountsObject$`limit`
      self$`size` <- ResourcePoolBudgetAmountsObject$`size`
      self$`items` <- lapply(ResourcePoolBudgetAmountsObject$`items`, function(x) ResourcePoolBudgetAmount$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)