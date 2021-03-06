# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Mappings Class
#'
#' @field size 
#' @field items 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Mappings <- R6::R6Class(
  'Mappings',
  public = list(
    `size` = NULL,
    `items` = NULL,
    initialize = function(`size`, `items`){
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
      MappingsObject <- list()
      if (!is.null(self$`size`)) {
        MappingsObject[['size']] <- self$`size`
      }
      if (!is.null(self$`items`)) {
        MappingsObject[['items']] <- lapply(self$`items`, function(x) x$toJSON())
      }

      MappingsObject
    },
    fromJSON = function(MappingsJson) {
      MappingsObject <- dlensFromJSON(MappingsJson)
      if (!is.null(MappingsObject$`size`)) {
        self$`size` <- MappingsObject$`size`
      }
      if (!is.null(MappingsObject$`items`)) {
        self$`items` <- lapply(MappingsObject$`items`, function(x) {
          itemsObject <- Mapping$new()
          itemsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          itemsObject
        })
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "size": %d,
           "items": [%s]
        }',
        self$`size`,
        lapply(self$`items`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(MappingsJson) {
      MappingsObject <- dlensFromJSON(MappingsJson)
      self$`size` <- MappingsObject$`size`
      self$`items` <- lapply(MappingsObject$`items`, function(x) Mapping$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
