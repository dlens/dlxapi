# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' PortfolioPlanNameUpdatedEvent Class
#'
#' @field id 
#' @field name 
#' @field previousName 
#' @field portfolioPlan 
#' @field portfolioId 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PortfolioPlanNameUpdatedEvent <- R6::R6Class(
  'PortfolioPlanNameUpdatedEvent',
  public = list(
    `id` = NULL,
    `name` = NULL,
    `previousName` = NULL,
    `portfolioPlan` = NULL,
    `portfolioId` = NULL,
    initialize = function(`id`, `name`, `previousName`, `portfolioPlan`, `portfolioId`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`previousName`)) {
        stopifnot(is.character(`previousName`), length(`previousName`) == 1)
        self$`previousName` <- `previousName`
      }
      if (!missing(`portfolioPlan`)) {
        stopifnot(R6::is.R6(`portfolioPlan`))
        self$`portfolioPlan` <- `portfolioPlan`
      }
      if (!missing(`portfolioId`)) {
        stopifnot(is.character(`portfolioId`), length(`portfolioId`) == 1)
        self$`portfolioId` <- `portfolioId`
      }
    },
    toJSON = function() {
      PortfolioPlanNameUpdatedEventObject <- list()
      if (!is.null(self$`id`)) {
        PortfolioPlanNameUpdatedEventObject[['id']] <- self$`id`
      }
      if (!is.null(self$`name`)) {
        PortfolioPlanNameUpdatedEventObject[['name']] <- self$`name`
      }
      if (!is.null(self$`previousName`)) {
        PortfolioPlanNameUpdatedEventObject[['previousName']] <- self$`previousName`
      }
      if (!is.null(self$`portfolioPlan`)) {
        PortfolioPlanNameUpdatedEventObject[['portfolioPlan']] <- self$`portfolioPlan`$toJSON()
      }
      if (!is.null(self$`portfolioId`)) {
        PortfolioPlanNameUpdatedEventObject[['portfolioId']] <- self$`portfolioId`
      }

      PortfolioPlanNameUpdatedEventObject
    },
    fromJSON = function(PortfolioPlanNameUpdatedEventJson) {
      PortfolioPlanNameUpdatedEventObject <- dlensFromJSON(PortfolioPlanNameUpdatedEventJson)
      if (!is.null(PortfolioPlanNameUpdatedEventObject$`id`)) {
        self$`id` <- PortfolioPlanNameUpdatedEventObject$`id`
      }
      if (!is.null(PortfolioPlanNameUpdatedEventObject$`name`)) {
        self$`name` <- PortfolioPlanNameUpdatedEventObject$`name`
      }
      if (!is.null(PortfolioPlanNameUpdatedEventObject$`previousName`)) {
        self$`previousName` <- PortfolioPlanNameUpdatedEventObject$`previousName`
      }
      if (!is.null(PortfolioPlanNameUpdatedEventObject$`portfolioPlan`)) {
        portfolioPlanObject <- PortfolioPlan$new()
        portfolioPlanObject$fromJSON(jsonlite::toJSON(PortfolioPlanNameUpdatedEventObject$portfolioPlan, auto_unbox = TRUE))
        self$`portfolioPlan` <- portfolioPlanObject
      }
      if (!is.null(PortfolioPlanNameUpdatedEventObject$`portfolioId`)) {
        self$`portfolioId` <- PortfolioPlanNameUpdatedEventObject$`portfolioId`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "name": %s,
           "previousName": %s,
           "portfolioPlan": %s,
           "portfolioId": %s
        }',
        self$`id`,
        self$`name`,
        self$`previousName`,
        self$`portfolioPlan`$toJSON(),
        self$`portfolioId`
      )
    },
    fromJSONString = function(PortfolioPlanNameUpdatedEventJson) {
      PortfolioPlanNameUpdatedEventObject <- dlensFromJSON(PortfolioPlanNameUpdatedEventJson)
      self$`id` <- PortfolioPlanNameUpdatedEventObject$`id`
      self$`name` <- PortfolioPlanNameUpdatedEventObject$`name`
      self$`previousName` <- PortfolioPlanNameUpdatedEventObject$`previousName`
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`portfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(PortfolioPlanNameUpdatedEventObject$portfolioPlan, auto_unbox = TRUE))
      self$`portfolioId` <- PortfolioPlanNameUpdatedEventObject$`portfolioId`
    }
  )
)
