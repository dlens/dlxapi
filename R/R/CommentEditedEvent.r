# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' CommentEditedEvent Class
#'
#' @field id 
#' @field portfolioId 
#' @field userId 
#' @field projectId 
#' @field projectName 
#' @field portfolioPlan 
#' @field value 
#' @field previousValue 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CommentEditedEvent <- R6::R6Class(
  'CommentEditedEvent',
  public = list(
    `id` = NULL,
    `portfolioId` = NULL,
    `userId` = NULL,
    `projectId` = NULL,
    `projectName` = NULL,
    `portfolioPlan` = NULL,
    `value` = NULL,
    `previousValue` = NULL,
    initialize = function(`id`, `portfolioId`, `userId`, `projectId`, `projectName`, `portfolioPlan`, `value`, `previousValue`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`portfolioId`)) {
        stopifnot(is.character(`portfolioId`), length(`portfolioId`) == 1)
        self$`portfolioId` <- `portfolioId`
      }
      if (!missing(`userId`)) {
        stopifnot(is.character(`userId`), length(`userId`) == 1)
        self$`userId` <- `userId`
      }
      if (!missing(`projectId`)) {
        stopifnot(is.character(`projectId`), length(`projectId`) == 1)
        self$`projectId` <- `projectId`
      }
      if (!missing(`projectName`)) {
        stopifnot(is.character(`projectName`), length(`projectName`) == 1)
        self$`projectName` <- `projectName`
      }
      if (!missing(`portfolioPlan`)) {
        stopifnot(R6::is.R6(`portfolioPlan`))
        self$`portfolioPlan` <- `portfolioPlan`
      }
      if (!missing(`value`)) {
        stopifnot(is.character(`value`), length(`value`) == 1)
        self$`value` <- `value`
      }
      if (!missing(`previousValue`)) {
        stopifnot(is.character(`previousValue`), length(`previousValue`) == 1)
        self$`previousValue` <- `previousValue`
      }
    },
    toJSON = function() {
      CommentEditedEventObject <- list()
      if (!is.null(self$`id`)) {
        CommentEditedEventObject[['id']] <- self$`id`
      }
      if (!is.null(self$`portfolioId`)) {
        CommentEditedEventObject[['portfolioId']] <- self$`portfolioId`
      }
      if (!is.null(self$`userId`)) {
        CommentEditedEventObject[['userId']] <- self$`userId`
      }
      if (!is.null(self$`projectId`)) {
        CommentEditedEventObject[['projectId']] <- self$`projectId`
      }
      if (!is.null(self$`projectName`)) {
        CommentEditedEventObject[['projectName']] <- self$`projectName`
      }
      if (!is.null(self$`portfolioPlan`)) {
        CommentEditedEventObject[['portfolioPlan']] <- self$`portfolioPlan`$toJSON()
      }
      if (!is.null(self$`value`)) {
        CommentEditedEventObject[['value']] <- self$`value`
      }
      if (!is.null(self$`previousValue`)) {
        CommentEditedEventObject[['previousValue']] <- self$`previousValue`
      }

      CommentEditedEventObject
    },
    fromJSON = function(CommentEditedEventJson) {
      CommentEditedEventObject <- dlensFromJSON(CommentEditedEventJson)
      if (!is.null(CommentEditedEventObject$`id`)) {
        self$`id` <- CommentEditedEventObject$`id`
      }
      if (!is.null(CommentEditedEventObject$`portfolioId`)) {
        self$`portfolioId` <- CommentEditedEventObject$`portfolioId`
      }
      if (!is.null(CommentEditedEventObject$`userId`)) {
        self$`userId` <- CommentEditedEventObject$`userId`
      }
      if (!is.null(CommentEditedEventObject$`projectId`)) {
        self$`projectId` <- CommentEditedEventObject$`projectId`
      }
      if (!is.null(CommentEditedEventObject$`projectName`)) {
        self$`projectName` <- CommentEditedEventObject$`projectName`
      }
      if (!is.null(CommentEditedEventObject$`portfolioPlan`)) {
        portfolioPlanObject <- PortfolioPlan$new()
        portfolioPlanObject$fromJSON(jsonlite::toJSON(CommentEditedEventObject$portfolioPlan, auto_unbox = TRUE))
        self$`portfolioPlan` <- portfolioPlanObject
      }
      if (!is.null(CommentEditedEventObject$`value`)) {
        self$`value` <- CommentEditedEventObject$`value`
      }
      if (!is.null(CommentEditedEventObject$`previousValue`)) {
        self$`previousValue` <- CommentEditedEventObject$`previousValue`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "portfolioId": %s,
           "userId": %s,
           "projectId": %s,
           "projectName": %s,
           "portfolioPlan": %s,
           "value": %s,
           "previousValue": %s
        }',
        self$`id`,
        self$`portfolioId`,
        self$`userId`,
        self$`projectId`,
        self$`projectName`,
        self$`portfolioPlan`$toJSON(),
        self$`value`,
        self$`previousValue`
      )
    },
    fromJSONString = function(CommentEditedEventJson) {
      CommentEditedEventObject <- dlensFromJSON(CommentEditedEventJson)
      self$`id` <- CommentEditedEventObject$`id`
      self$`portfolioId` <- CommentEditedEventObject$`portfolioId`
      self$`userId` <- CommentEditedEventObject$`userId`
      self$`projectId` <- CommentEditedEventObject$`projectId`
      self$`projectName` <- CommentEditedEventObject$`projectName`
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`portfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(CommentEditedEventObject$portfolioPlan, auto_unbox = TRUE))
      self$`value` <- CommentEditedEventObject$`value`
      self$`previousValue` <- CommentEditedEventObject$`previousValue`
    }
  )
)
