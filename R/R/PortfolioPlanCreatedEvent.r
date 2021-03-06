# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' PortfolioPlanCreatedEvent Class
#'
#' @field id 
#' @field name 
#' @field description 
#' @field isBaseline 
#' @field portfolioPlan 
#' @field parentPortfolioPlan 
#' @field portfolioId 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PortfolioPlanCreatedEvent <- R6::R6Class(
  'PortfolioPlanCreatedEvent',
  public = list(
    `id` = NULL,
    `name` = NULL,
    `description` = NULL,
    `isBaseline` = NULL,
    `portfolioPlan` = NULL,
    `parentPortfolioPlan` = NULL,
    `portfolioId` = NULL,
    initialize = function(`id`, `name`, `description`, `isBaseline`, `portfolioPlan`, `parentPortfolioPlan`, `portfolioId`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`description`)) {
        stopifnot(is.character(`description`), length(`description`) == 1)
        self$`description` <- `description`
      }
      if (!missing(`isBaseline`)) {
        self$`isBaseline` <- `isBaseline`
      }
      if (!missing(`portfolioPlan`)) {
        stopifnot(R6::is.R6(`portfolioPlan`))
        self$`portfolioPlan` <- `portfolioPlan`
      }
      if (!missing(`parentPortfolioPlan`)) {
        stopifnot(R6::is.R6(`parentPortfolioPlan`))
        self$`parentPortfolioPlan` <- `parentPortfolioPlan`
      }
      if (!missing(`portfolioId`)) {
        stopifnot(is.character(`portfolioId`), length(`portfolioId`) == 1)
        self$`portfolioId` <- `portfolioId`
      }
    },
    toJSON = function() {
      PortfolioPlanCreatedEventObject <- list()
      if (!is.null(self$`id`)) {
        PortfolioPlanCreatedEventObject[['id']] <- self$`id`
      }
      if (!is.null(self$`name`)) {
        PortfolioPlanCreatedEventObject[['name']] <- self$`name`
      }
      if (!is.null(self$`description`)) {
        PortfolioPlanCreatedEventObject[['description']] <- self$`description`
      }
      if (!is.null(self$`isBaseline`)) {
        PortfolioPlanCreatedEventObject[['isBaseline']] <- self$`isBaseline`
      }
      if (!is.null(self$`portfolioPlan`)) {
        PortfolioPlanCreatedEventObject[['portfolioPlan']] <- self$`portfolioPlan`$toJSON()
      }
      if (!is.null(self$`parentPortfolioPlan`)) {
        PortfolioPlanCreatedEventObject[['parentPortfolioPlan']] <- self$`parentPortfolioPlan`$toJSON()
      }
      if (!is.null(self$`portfolioId`)) {
        PortfolioPlanCreatedEventObject[['portfolioId']] <- self$`portfolioId`
      }

      PortfolioPlanCreatedEventObject
    },
    fromJSON = function(PortfolioPlanCreatedEventJson) {
      PortfolioPlanCreatedEventObject <- dlensFromJSON(PortfolioPlanCreatedEventJson)
      if (!is.null(PortfolioPlanCreatedEventObject$`id`)) {
        self$`id` <- PortfolioPlanCreatedEventObject$`id`
      }
      if (!is.null(PortfolioPlanCreatedEventObject$`name`)) {
        self$`name` <- PortfolioPlanCreatedEventObject$`name`
      }
      if (!is.null(PortfolioPlanCreatedEventObject$`description`)) {
        self$`description` <- PortfolioPlanCreatedEventObject$`description`
      }
      if (!is.null(PortfolioPlanCreatedEventObject$`isBaseline`)) {
        self$`isBaseline` <- PortfolioPlanCreatedEventObject$`isBaseline`
      }
      if (!is.null(PortfolioPlanCreatedEventObject$`portfolioPlan`)) {
        portfolioPlanObject <- PortfolioPlan$new()
        portfolioPlanObject$fromJSON(jsonlite::toJSON(PortfolioPlanCreatedEventObject$portfolioPlan, auto_unbox = TRUE))
        self$`portfolioPlan` <- portfolioPlanObject
      }
      if (!is.null(PortfolioPlanCreatedEventObject$`parentPortfolioPlan`)) {
        parentPortfolioPlanObject <- PortfolioPlan$new()
        parentPortfolioPlanObject$fromJSON(jsonlite::toJSON(PortfolioPlanCreatedEventObject$parentPortfolioPlan, auto_unbox = TRUE))
        self$`parentPortfolioPlan` <- parentPortfolioPlanObject
      }
      if (!is.null(PortfolioPlanCreatedEventObject$`portfolioId`)) {
        self$`portfolioId` <- PortfolioPlanCreatedEventObject$`portfolioId`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "name": %s,
           "description": %s,
           "isBaseline": %s,
           "portfolioPlan": %s,
           "parentPortfolioPlan": %s,
           "portfolioId": %s
        }',
        self$`id`,
        self$`name`,
        self$`description`,
        self$`isBaseline`,
        self$`portfolioPlan`$toJSON(),
        self$`parentPortfolioPlan`$toJSON(),
        self$`portfolioId`
      )
    },
    fromJSONString = function(PortfolioPlanCreatedEventJson) {
      PortfolioPlanCreatedEventObject <- dlensFromJSON(PortfolioPlanCreatedEventJson)
      self$`id` <- PortfolioPlanCreatedEventObject$`id`
      self$`name` <- PortfolioPlanCreatedEventObject$`name`
      self$`description` <- PortfolioPlanCreatedEventObject$`description`
      self$`isBaseline` <- PortfolioPlanCreatedEventObject$`isBaseline`
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`portfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(PortfolioPlanCreatedEventObject$portfolioPlan, auto_unbox = TRUE))
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`parentPortfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(PortfolioPlanCreatedEventObject$parentPortfolioPlan, auto_unbox = TRUE))
      self$`portfolioId` <- PortfolioPlanCreatedEventObject$`portfolioId`
    }
  )
)
