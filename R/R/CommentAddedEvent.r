# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' CommentAddedEvent Class
#'
#' @field id 
#' @field portfolioId 
#' @field userId 
#' @field projectId 
#' @field projectName 
#' @field portfolioPlan 
#' @field value 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CommentAddedEvent <- R6::R6Class(
  'CommentAddedEvent',
  public = list(
    `id` = NULL,
    `portfolioId` = NULL,
    `userId` = NULL,
    `projectId` = NULL,
    `projectName` = NULL,
    `portfolioPlan` = NULL,
    `value` = NULL,
    initialize = function(`id`, `portfolioId`, `userId`, `projectId`, `projectName`, `portfolioPlan`, `value`){
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
    },
    toJSON = function() {
      CommentAddedEventObject <- list()
      if (!is.null(self$`id`)) {
        CommentAddedEventObject[['id']] <- self$`id`
      }
      if (!is.null(self$`portfolioId`)) {
        CommentAddedEventObject[['portfolioId']] <- self$`portfolioId`
      }
      if (!is.null(self$`userId`)) {
        CommentAddedEventObject[['userId']] <- self$`userId`
      }
      if (!is.null(self$`projectId`)) {
        CommentAddedEventObject[['projectId']] <- self$`projectId`
      }
      if (!is.null(self$`projectName`)) {
        CommentAddedEventObject[['projectName']] <- self$`projectName`
      }
      if (!is.null(self$`portfolioPlan`)) {
        CommentAddedEventObject[['portfolioPlan']] <- self$`portfolioPlan`$toJSON()
      }
      if (!is.null(self$`value`)) {
        CommentAddedEventObject[['value']] <- self$`value`
      }

      CommentAddedEventObject
    },
    fromJSON = function(CommentAddedEventJson) {
      CommentAddedEventObject <- dlensFromJSON(CommentAddedEventJson)
      if (!is.null(CommentAddedEventObject$`id`)) {
        self$`id` <- CommentAddedEventObject$`id`
      }
      if (!is.null(CommentAddedEventObject$`portfolioId`)) {
        self$`portfolioId` <- CommentAddedEventObject$`portfolioId`
      }
      if (!is.null(CommentAddedEventObject$`userId`)) {
        self$`userId` <- CommentAddedEventObject$`userId`
      }
      if (!is.null(CommentAddedEventObject$`projectId`)) {
        self$`projectId` <- CommentAddedEventObject$`projectId`
      }
      if (!is.null(CommentAddedEventObject$`projectName`)) {
        self$`projectName` <- CommentAddedEventObject$`projectName`
      }
      if (!is.null(CommentAddedEventObject$`portfolioPlan`)) {
        portfolioPlanObject <- PortfolioPlan$new()
        portfolioPlanObject$fromJSON(jsonlite::toJSON(CommentAddedEventObject$portfolioPlan, auto_unbox = TRUE))
        self$`portfolioPlan` <- portfolioPlanObject
      }
      if (!is.null(CommentAddedEventObject$`value`)) {
        self$`value` <- CommentAddedEventObject$`value`
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
           "value": %s
        }',
        self$`id`,
        self$`portfolioId`,
        self$`userId`,
        self$`projectId`,
        self$`projectName`,
        self$`portfolioPlan`$toJSON(),
        self$`value`
      )
    },
    fromJSONString = function(CommentAddedEventJson) {
      CommentAddedEventObject <- dlensFromJSON(CommentAddedEventJson)
      self$`id` <- CommentAddedEventObject$`id`
      self$`portfolioId` <- CommentAddedEventObject$`portfolioId`
      self$`userId` <- CommentAddedEventObject$`userId`
      self$`projectId` <- CommentAddedEventObject$`projectId`
      self$`projectName` <- CommentAddedEventObject$`projectName`
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`portfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(CommentAddedEventObject$portfolioPlan, auto_unbox = TRUE))
      self$`value` <- CommentAddedEventObject$`value`
    }
  )
)
