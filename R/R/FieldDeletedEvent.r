# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' FieldDeletedEvent Class
#'
#' @field id 
#' @field name 
#' @field type 
#' @field portfolioId 
#' @field portfolioPlan 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FieldDeletedEvent <- R6::R6Class(
  'FieldDeletedEvent',
  public = list(
    `id` = NULL,
    `name` = NULL,
    `type` = NULL,
    `portfolioId` = NULL,
    `portfolioPlan` = NULL,
    initialize = function(`id`, `name`, `type`, `portfolioId`, `portfolioPlan`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`type`)) {
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!missing(`portfolioId`)) {
        stopifnot(is.character(`portfolioId`), length(`portfolioId`) == 1)
        self$`portfolioId` <- `portfolioId`
      }
      if (!missing(`portfolioPlan`)) {
        stopifnot(R6::is.R6(`portfolioPlan`))
        self$`portfolioPlan` <- `portfolioPlan`
      }
    },
    toJSON = function() {
      FieldDeletedEventObject <- list()
      if (!is.null(self$`id`)) {
        FieldDeletedEventObject[['id']] <- self$`id`
      }
      if (!is.null(self$`name`)) {
        FieldDeletedEventObject[['name']] <- self$`name`
      }
      if (!is.null(self$`type`)) {
        FieldDeletedEventObject[['type']] <- self$`type`$toJSON()
      }
      if (!is.null(self$`portfolioId`)) {
        FieldDeletedEventObject[['portfolioId']] <- self$`portfolioId`
      }
      if (!is.null(self$`portfolioPlan`)) {
        FieldDeletedEventObject[['portfolioPlan']] <- self$`portfolioPlan`$toJSON()
      }

      FieldDeletedEventObject
    },
    fromJSON = function(FieldDeletedEventJson) {
      FieldDeletedEventObject <- dlensFromJSON(FieldDeletedEventJson)
      if (!is.null(FieldDeletedEventObject$`id`)) {
        self$`id` <- FieldDeletedEventObject$`id`
      }
      if (!is.null(FieldDeletedEventObject$`name`)) {
        self$`name` <- FieldDeletedEventObject$`name`
      }
      if (!is.null(FieldDeletedEventObject$`type`)) {
        typeObject <- FieldType$new()
        typeObject$fromJSON(jsonlite::toJSON(FieldDeletedEventObject$type, auto_unbox = TRUE))
        self$`type` <- typeObject
      }
      if (!is.null(FieldDeletedEventObject$`portfolioId`)) {
        self$`portfolioId` <- FieldDeletedEventObject$`portfolioId`
      }
      if (!is.null(FieldDeletedEventObject$`portfolioPlan`)) {
        portfolioPlanObject <- PortfolioPlan$new()
        portfolioPlanObject$fromJSON(jsonlite::toJSON(FieldDeletedEventObject$portfolioPlan, auto_unbox = TRUE))
        self$`portfolioPlan` <- portfolioPlanObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "name": %s,
           "type": %s,
           "portfolioId": %s,
           "portfolioPlan": %s
        }',
        self$`id`,
        self$`name`,
        self$`type`$toJSON(),
        self$`portfolioId`,
        self$`portfolioPlan`$toJSON()
      )
    },
    fromJSONString = function(FieldDeletedEventJson) {
      FieldDeletedEventObject <- dlensFromJSON(FieldDeletedEventJson)
      self$`id` <- FieldDeletedEventObject$`id`
      self$`name` <- FieldDeletedEventObject$`name`
      FieldTypeObject <- FieldType$new()
      self$`type` <- FieldTypeObject$fromJSON(jsonlite::toJSON(FieldDeletedEventObject$type, auto_unbox = TRUE))
      self$`portfolioId` <- FieldDeletedEventObject$`portfolioId`
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`portfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(FieldDeletedEventObject$portfolioPlan, auto_unbox = TRUE))
    }
  )
)
