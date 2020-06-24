# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' FieldTargetTypeUpdatedEvent Class
#'
#' @field id 
#' @field name 
#' @field type 
#' @field targetType 
#' @field previousTargetType 
#' @field portfolioId 
#' @field portfolioPlan 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FieldTargetTypeUpdatedEvent <- R6::R6Class(
  'FieldTargetTypeUpdatedEvent',
  public = list(
    `id` = NULL,
    `name` = NULL,
    `type` = NULL,
    `targetType` = NULL,
    `previousTargetType` = NULL,
    `portfolioId` = NULL,
    `portfolioPlan` = NULL,
    initialize = function(`id`, `name`, `type`, `targetType`, `previousTargetType`, `portfolioId`, `portfolioPlan`){
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
      if (!missing(`targetType`)) {
        stopifnot(R6::is.R6(`targetType`))
        self$`targetType` <- `targetType`
      }
      if (!missing(`previousTargetType`)) {
        stopifnot(R6::is.R6(`previousTargetType`))
        self$`previousTargetType` <- `previousTargetType`
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
      FieldTargetTypeUpdatedEventObject <- list()
      if (!is.null(self$`id`)) {
        FieldTargetTypeUpdatedEventObject[['id']] <- self$`id`
      }
      if (!is.null(self$`name`)) {
        FieldTargetTypeUpdatedEventObject[['name']] <- self$`name`
      }
      if (!is.null(self$`type`)) {
        FieldTargetTypeUpdatedEventObject[['type']] <- self$`type`$toJSON()
      }
      if (!is.null(self$`targetType`)) {
        FieldTargetTypeUpdatedEventObject[['targetType']] <- self$`targetType`$toJSON()
      }
      if (!is.null(self$`previousTargetType`)) {
        FieldTargetTypeUpdatedEventObject[['previousTargetType']] <- self$`previousTargetType`$toJSON()
      }
      if (!is.null(self$`portfolioId`)) {
        FieldTargetTypeUpdatedEventObject[['portfolioId']] <- self$`portfolioId`
      }
      if (!is.null(self$`portfolioPlan`)) {
        FieldTargetTypeUpdatedEventObject[['portfolioPlan']] <- self$`portfolioPlan`$toJSON()
      }

      FieldTargetTypeUpdatedEventObject
    },
    fromJSON = function(FieldTargetTypeUpdatedEventJson) {
      FieldTargetTypeUpdatedEventObject <- dlensFromJSON(FieldTargetTypeUpdatedEventJson)
      if (!is.null(FieldTargetTypeUpdatedEventObject$`id`)) {
        self$`id` <- FieldTargetTypeUpdatedEventObject$`id`
      }
      if (!is.null(FieldTargetTypeUpdatedEventObject$`name`)) {
        self$`name` <- FieldTargetTypeUpdatedEventObject$`name`
      }
      if (!is.null(FieldTargetTypeUpdatedEventObject$`type`)) {
        typeObject <- FieldType$new()
        typeObject$fromJSON(jsonlite::toJSON(FieldTargetTypeUpdatedEventObject$type, auto_unbox = TRUE))
        self$`type` <- typeObject
      }
      if (!is.null(FieldTargetTypeUpdatedEventObject$`targetType`)) {
        targetTypeObject <- TargetType$new()
        targetTypeObject$fromJSON(jsonlite::toJSON(FieldTargetTypeUpdatedEventObject$targetType, auto_unbox = TRUE))
        self$`targetType` <- targetTypeObject
      }
      if (!is.null(FieldTargetTypeUpdatedEventObject$`previousTargetType`)) {
        previousTargetTypeObject <- TargetType$new()
        previousTargetTypeObject$fromJSON(jsonlite::toJSON(FieldTargetTypeUpdatedEventObject$previousTargetType, auto_unbox = TRUE))
        self$`previousTargetType` <- previousTargetTypeObject
      }
      if (!is.null(FieldTargetTypeUpdatedEventObject$`portfolioId`)) {
        self$`portfolioId` <- FieldTargetTypeUpdatedEventObject$`portfolioId`
      }
      if (!is.null(FieldTargetTypeUpdatedEventObject$`portfolioPlan`)) {
        portfolioPlanObject <- PortfolioPlan$new()
        portfolioPlanObject$fromJSON(jsonlite::toJSON(FieldTargetTypeUpdatedEventObject$portfolioPlan, auto_unbox = TRUE))
        self$`portfolioPlan` <- portfolioPlanObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "name": %s,
           "type": %s,
           "targetType": %s,
           "previousTargetType": %s,
           "portfolioId": %s,
           "portfolioPlan": %s
        }',
        self$`id`,
        self$`name`,
        self$`type`$toJSON(),
        self$`targetType`$toJSON(),
        self$`previousTargetType`$toJSON(),
        self$`portfolioId`,
        self$`portfolioPlan`$toJSON()
      )
    },
    fromJSONString = function(FieldTargetTypeUpdatedEventJson) {
      FieldTargetTypeUpdatedEventObject <- dlensFromJSON(FieldTargetTypeUpdatedEventJson)
      self$`id` <- FieldTargetTypeUpdatedEventObject$`id`
      self$`name` <- FieldTargetTypeUpdatedEventObject$`name`
      FieldTypeObject <- FieldType$new()
      self$`type` <- FieldTypeObject$fromJSON(jsonlite::toJSON(FieldTargetTypeUpdatedEventObject$type, auto_unbox = TRUE))
      TargetTypeObject <- TargetType$new()
      self$`targetType` <- TargetTypeObject$fromJSON(jsonlite::toJSON(FieldTargetTypeUpdatedEventObject$targetType, auto_unbox = TRUE))
      TargetTypeObject <- TargetType$new()
      self$`previousTargetType` <- TargetTypeObject$fromJSON(jsonlite::toJSON(FieldTargetTypeUpdatedEventObject$previousTargetType, auto_unbox = TRUE))
      self$`portfolioId` <- FieldTargetTypeUpdatedEventObject$`portfolioId`
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`portfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(FieldTargetTypeUpdatedEventObject$portfolioPlan, auto_unbox = TRUE))
    }
  )
)
