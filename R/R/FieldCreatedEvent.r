# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' FieldCreatedEvent Class
#'
#' @field id 
#' @field name 
#' @field originalName 
#' @field position 
#' @field typePosition 
#' @field targetType 
#' @field dataType 
#' @field type 
#' @field parent 
#' @field sourceId 
#' @field portfolioId 
#' @field portfolioPlan 
#' @field isFromImport 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FieldCreatedEvent <- R6::R6Class(
  'FieldCreatedEvent',
  public = list(
    `id` = NULL,
    `name` = NULL,
    `originalName` = NULL,
    `position` = NULL,
    `typePosition` = NULL,
    `targetType` = NULL,
    `dataType` = NULL,
    `type` = NULL,
    `parent` = NULL,
    `sourceId` = NULL,
    `portfolioId` = NULL,
    `portfolioPlan` = NULL,
    `isFromImport` = NULL,
    initialize = function(`id`, `name`, `originalName`, `position`, `typePosition`, `targetType`, `dataType`, `type`, `parent`, `sourceId`, `portfolioId`, `portfolioPlan`, `isFromImport`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`originalName`)) {
        stopifnot(is.character(`originalName`), length(`originalName`) == 1)
        self$`originalName` <- `originalName`
      }
      if (!missing(`position`)) {
        stopifnot(is.numeric(`position`), length(`position`) == 1)
        self$`position` <- `position`
      }
      if (!missing(`typePosition`)) {
        stopifnot(is.numeric(`typePosition`), length(`typePosition`) == 1)
        self$`typePosition` <- `typePosition`
      }
      if (!missing(`targetType`)) {
        stopifnot(R6::is.R6(`targetType`))
        self$`targetType` <- `targetType`
      }
      if (!missing(`dataType`)) {
        stopifnot(R6::is.R6(`dataType`))
        self$`dataType` <- `dataType`
      }
      if (!missing(`type`)) {
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!missing(`parent`)) {
        stopifnot(R6::is.R6(`parent`))
        self$`parent` <- `parent`
      }
      if (!missing(`sourceId`)) {
        stopifnot(is.character(`sourceId`), length(`sourceId`) == 1)
        self$`sourceId` <- `sourceId`
      }
      if (!missing(`portfolioId`)) {
        stopifnot(is.character(`portfolioId`), length(`portfolioId`) == 1)
        self$`portfolioId` <- `portfolioId`
      }
      if (!missing(`portfolioPlan`)) {
        stopifnot(R6::is.R6(`portfolioPlan`))
        self$`portfolioPlan` <- `portfolioPlan`
      }
      if (!missing(`isFromImport`)) {
        self$`isFromImport` <- `isFromImport`
      }
    },
    toJSON = function() {
      FieldCreatedEventObject <- list()
      if (!is.null(self$`id`)) {
        FieldCreatedEventObject[['id']] <- self$`id`
      }
      if (!is.null(self$`name`)) {
        FieldCreatedEventObject[['name']] <- self$`name`
      }
      if (!is.null(self$`originalName`)) {
        FieldCreatedEventObject[['originalName']] <- self$`originalName`
      }
      if (!is.null(self$`position`)) {
        FieldCreatedEventObject[['position']] <- self$`position`
      }
      if (!is.null(self$`typePosition`)) {
        FieldCreatedEventObject[['typePosition']] <- self$`typePosition`
      }
      if (!is.null(self$`targetType`)) {
        FieldCreatedEventObject[['targetType']] <- self$`targetType`$toJSON()
      }
      if (!is.null(self$`dataType`)) {
        FieldCreatedEventObject[['dataType']] <- self$`dataType`$toJSON()
      }
      if (!is.null(self$`type`)) {
        FieldCreatedEventObject[['type']] <- self$`type`$toJSON()
      }
      if (!is.null(self$`parent`)) {
        FieldCreatedEventObject[['parent']] <- self$`parent`$toJSON()
      }
      if (!is.null(self$`sourceId`)) {
        FieldCreatedEventObject[['sourceId']] <- self$`sourceId`
      }
      if (!is.null(self$`portfolioId`)) {
        FieldCreatedEventObject[['portfolioId']] <- self$`portfolioId`
      }
      if (!is.null(self$`portfolioPlan`)) {
        FieldCreatedEventObject[['portfolioPlan']] <- self$`portfolioPlan`$toJSON()
      }
      if (!is.null(self$`isFromImport`)) {
        FieldCreatedEventObject[['isFromImport']] <- self$`isFromImport`
      }

      FieldCreatedEventObject
    },
    fromJSON = function(FieldCreatedEventJson) {
      FieldCreatedEventObject <- dlensFromJSON(FieldCreatedEventJson)
      if (!is.null(FieldCreatedEventObject$`id`)) {
        self$`id` <- FieldCreatedEventObject$`id`
      }
      if (!is.null(FieldCreatedEventObject$`name`)) {
        self$`name` <- FieldCreatedEventObject$`name`
      }
      if (!is.null(FieldCreatedEventObject$`originalName`)) {
        self$`originalName` <- FieldCreatedEventObject$`originalName`
      }
      if (!is.null(FieldCreatedEventObject$`position`)) {
        self$`position` <- FieldCreatedEventObject$`position`
      }
      if (!is.null(FieldCreatedEventObject$`typePosition`)) {
        self$`typePosition` <- FieldCreatedEventObject$`typePosition`
      }
      if (!is.null(FieldCreatedEventObject$`targetType`)) {
        targetTypeObject <- TargetType$new()
        targetTypeObject$fromJSON(jsonlite::toJSON(FieldCreatedEventObject$targetType, auto_unbox = TRUE))
        self$`targetType` <- targetTypeObject
      }
      if (!is.null(FieldCreatedEventObject$`dataType`)) {
        dataTypeObject <- DataType$new()
        dataTypeObject$fromJSON(jsonlite::toJSON(FieldCreatedEventObject$dataType, auto_unbox = TRUE))
        self$`dataType` <- dataTypeObject
      }
      if (!is.null(FieldCreatedEventObject$`type`)) {
        typeObject <- FieldType$new()
        typeObject$fromJSON(jsonlite::toJSON(FieldCreatedEventObject$type, auto_unbox = TRUE))
        self$`type` <- typeObject
      }
      if (!is.null(FieldCreatedEventObject$`parent`)) {
        parentObject <- Field$new()
        parentObject$fromJSON(jsonlite::toJSON(FieldCreatedEventObject$parent, auto_unbox = TRUE))
        self$`parent` <- parentObject
      }
      if (!is.null(FieldCreatedEventObject$`sourceId`)) {
        self$`sourceId` <- FieldCreatedEventObject$`sourceId`
      }
      if (!is.null(FieldCreatedEventObject$`portfolioId`)) {
        self$`portfolioId` <- FieldCreatedEventObject$`portfolioId`
      }
      if (!is.null(FieldCreatedEventObject$`portfolioPlan`)) {
        portfolioPlanObject <- PortfolioPlan$new()
        portfolioPlanObject$fromJSON(jsonlite::toJSON(FieldCreatedEventObject$portfolioPlan, auto_unbox = TRUE))
        self$`portfolioPlan` <- portfolioPlanObject
      }
      if (!is.null(FieldCreatedEventObject$`isFromImport`)) {
        self$`isFromImport` <- FieldCreatedEventObject$`isFromImport`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "name": %s,
           "originalName": %s,
           "position": %d,
           "typePosition": %d,
           "targetType": %s,
           "dataType": %s,
           "type": %s,
           "parent": %s,
           "sourceId": %s,
           "portfolioId": %s,
           "portfolioPlan": %s,
           "isFromImport": %s
        }',
        self$`id`,
        self$`name`,
        self$`originalName`,
        self$`position`,
        self$`typePosition`,
        self$`targetType`$toJSON(),
        self$`dataType`$toJSON(),
        self$`type`$toJSON(),
        self$`parent`$toJSON(),
        self$`sourceId`,
        self$`portfolioId`,
        self$`portfolioPlan`$toJSON(),
        self$`isFromImport`
      )
    },
    fromJSONString = function(FieldCreatedEventJson) {
      FieldCreatedEventObject <- dlensFromJSON(FieldCreatedEventJson)
      self$`id` <- FieldCreatedEventObject$`id`
      self$`name` <- FieldCreatedEventObject$`name`
      self$`originalName` <- FieldCreatedEventObject$`originalName`
      self$`position` <- FieldCreatedEventObject$`position`
      self$`typePosition` <- FieldCreatedEventObject$`typePosition`
      TargetTypeObject <- TargetType$new()
      self$`targetType` <- TargetTypeObject$fromJSON(jsonlite::toJSON(FieldCreatedEventObject$targetType, auto_unbox = TRUE))
      DataTypeObject <- DataType$new()
      self$`dataType` <- DataTypeObject$fromJSON(jsonlite::toJSON(FieldCreatedEventObject$dataType, auto_unbox = TRUE))
      FieldTypeObject <- FieldType$new()
      self$`type` <- FieldTypeObject$fromJSON(jsonlite::toJSON(FieldCreatedEventObject$type, auto_unbox = TRUE))
      FieldObject <- Field$new()
      self$`parent` <- FieldObject$fromJSON(jsonlite::toJSON(FieldCreatedEventObject$parent, auto_unbox = TRUE))
      self$`sourceId` <- FieldCreatedEventObject$`sourceId`
      self$`portfolioId` <- FieldCreatedEventObject$`portfolioId`
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`portfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(FieldCreatedEventObject$portfolioPlan, auto_unbox = TRUE))
      self$`isFromImport` <- FieldCreatedEventObject$`isFromImport`
    }
  )
)
