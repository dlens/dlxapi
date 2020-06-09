# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Spreadsheet Class
#'
#' @field href 
#' @field id 
#' @field createdAt 
#' @field modifiedAt 
#' @field name 
#' @field sheets 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Spreadsheet <- R6::R6Class(
  'Spreadsheet',
  public = list(
    `href` = NULL,
    `id` = NULL,
    `createdAt` = NULL,
    `modifiedAt` = NULL,
    `name` = NULL,
    `sheets` = NULL,
    initialize = function(`href`, `id`, `createdAt`, `modifiedAt`, `name`, `sheets`){
      if (!missing(`href`)) {
        stopifnot(is.character(`href`), length(`href`) == 1)
        self$`href` <- `href`
      }
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`createdAt`)) {
        stopifnot(is.character(`createdAt`), length(`createdAt`) == 1)
        self$`createdAt` <- `createdAt`
      }
      if (!missing(`modifiedAt`)) {
        stopifnot(is.character(`modifiedAt`), length(`modifiedAt`) == 1)
        self$`modifiedAt` <- `modifiedAt`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`sheets`)) {
        stopifnot(R6::is.R6(`sheets`))
        self$`sheets` <- `sheets`
      }
    },
    toJSON = function() {
      SpreadsheetObject <- list()
      if (!is.null(self$`href`)) {
        SpreadsheetObject[['href']] <- self$`href`
      }
      if (!is.null(self$`id`)) {
        SpreadsheetObject[['id']] <- self$`id`
      }
      if (!is.null(self$`createdAt`)) {
        SpreadsheetObject[['createdAt']] <- self$`createdAt`
      }
      if (!is.null(self$`modifiedAt`)) {
        SpreadsheetObject[['modifiedAt']] <- self$`modifiedAt`
      }
      if (!is.null(self$`name`)) {
        SpreadsheetObject[['name']] <- self$`name`
      }
      if (!is.null(self$`sheets`)) {
        SpreadsheetObject[['sheets']] <- self$`sheets`$toJSON()
      }

      SpreadsheetObject
    },
    fromJSON = function(SpreadsheetJson) {
      SpreadsheetObject <- jsonlite::fromJSON(SpreadsheetJson)
      if (!is.null(SpreadsheetObject$`href`)) {
        self$`href` <- SpreadsheetObject$`href`
      }
      if (!is.null(SpreadsheetObject$`id`)) {
        self$`id` <- SpreadsheetObject$`id`
      }
      if (!is.null(SpreadsheetObject$`createdAt`)) {
        self$`createdAt` <- SpreadsheetObject$`createdAt`
      }
      if (!is.null(SpreadsheetObject$`modifiedAt`)) {
        self$`modifiedAt` <- SpreadsheetObject$`modifiedAt`
      }
      if (!is.null(SpreadsheetObject$`name`)) {
        self$`name` <- SpreadsheetObject$`name`
      }
      if (!is.null(SpreadsheetObject$`sheets`)) {
        sheetsObject <- Sheets$new()
        sheetsObject$fromJSON(jsonlite::toJSON(SpreadsheetObject$sheets, auto_unbox = TRUE))
        self$`sheets` <- sheetsObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "href": %s,
           "id": %s,
           "createdAt": %s,
           "modifiedAt": %s,
           "name": %s,
           "sheets": %s
        }',
        self$`href`,
        self$`id`,
        self$`createdAt`,
        self$`modifiedAt`,
        self$`name`,
        self$`sheets`$toJSON()
      )
    },
    fromJSONString = function(SpreadsheetJson) {
      SpreadsheetObject <- jsonlite::fromJSON(SpreadsheetJson)
      self$`href` <- SpreadsheetObject$`href`
      self$`id` <- SpreadsheetObject$`id`
      self$`createdAt` <- SpreadsheetObject$`createdAt`
      self$`modifiedAt` <- SpreadsheetObject$`modifiedAt`
      self$`name` <- SpreadsheetObject$`name`
      SheetsObject <- Sheets$new()
      self$`sheets` <- SheetsObject$fromJSON(jsonlite::toJSON(SpreadsheetObject$sheets, auto_unbox = TRUE))
    }
  )
)
