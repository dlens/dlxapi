# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Sheet Class
#'
#' @field name 
#' @field rows 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Sheet <- R6::R6Class(
  'Sheet',
  public = list(
    `name` = NULL,
    `rows` = NULL,
    initialize = function(`name`, `rows`){
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`rows`)) {
        stopifnot(is.list(`rows`), length(`rows`) != 0)
        lapply(`rows`, function(x) stopifnot(R6::is.R6(x)))
        self$`rows` <- `rows`
      }
    },
    toJSON = function() {
      SheetObject <- list()
      if (!is.null(self$`name`)) {
        SheetObject[['name']] <- self$`name`
      }
      if (!is.null(self$`rows`)) {
        SheetObject[['rows']] <- lapply(self$`rows`, function(x) x$toJSON())
      }

      SheetObject
    },
    fromJSON = function(SheetJson) {
      SheetObject <- dlensFromJSON(SheetJson)
      if (!is.null(SheetObject$`name`)) {
        self$`name` <- SheetObject$`name`
      }
      if (!is.null(SheetObject$`rows`)) {
        self$`rows` <- lapply(SheetObject$`rows`, function(x) {
          rowsObject <- Row$new()
          rowsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          rowsObject
        })
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "name": %s,
           "rows": [%s]
        }',
        self$`name`,
        lapply(self$`rows`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(SheetJson) {
      SheetObject <- dlensFromJSON(SheetJson)
      self$`name` <- SheetObject$`name`
      self$`rows` <- lapply(SheetObject$`rows`, function(x) Row$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)