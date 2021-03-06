# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' PortfolioTimeIntervalUpdatedEvent Class
#'
#' @field id 
#' @field portfolioId 
#' @field name 
#' @field timeInterval 
#' @field previousTimeInterval 
#' @field portfolioPlan 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PortfolioTimeIntervalUpdatedEvent <- R6::R6Class(
  'PortfolioTimeIntervalUpdatedEvent',
  public = list(
    `id` = NULL,
    `portfolioId` = NULL,
    `name` = NULL,
    `timeInterval` = NULL,
    `previousTimeInterval` = NULL,
    `portfolioPlan` = NULL,
    initialize = function(`id`, `portfolioId`, `name`, `timeInterval`, `previousTimeInterval`, `portfolioPlan`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`portfolioId`)) {
        stopifnot(is.character(`portfolioId`), length(`portfolioId`) == 1)
        self$`portfolioId` <- `portfolioId`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`timeInterval`)) {
        stopifnot(R6::is.R6(`timeInterval`))
        self$`timeInterval` <- `timeInterval`
      }
      if (!missing(`previousTimeInterval`)) {
        stopifnot(R6::is.R6(`previousTimeInterval`))
        self$`previousTimeInterval` <- `previousTimeInterval`
      }
      if (!missing(`portfolioPlan`)) {
        stopifnot(R6::is.R6(`portfolioPlan`))
        self$`portfolioPlan` <- `portfolioPlan`
      }
    },
    toJSON = function() {
      PortfolioTimeIntervalUpdatedEventObject <- list()
      if (!is.null(self$`id`)) {
        PortfolioTimeIntervalUpdatedEventObject[['id']] <- self$`id`
      }
      if (!is.null(self$`portfolioId`)) {
        PortfolioTimeIntervalUpdatedEventObject[['portfolioId']] <- self$`portfolioId`
      }
      if (!is.null(self$`name`)) {
        PortfolioTimeIntervalUpdatedEventObject[['name']] <- self$`name`
      }
      if (!is.null(self$`timeInterval`)) {
        PortfolioTimeIntervalUpdatedEventObject[['timeInterval']] <- self$`timeInterval`$toJSON()
      }
      if (!is.null(self$`previousTimeInterval`)) {
        PortfolioTimeIntervalUpdatedEventObject[['previousTimeInterval']] <- self$`previousTimeInterval`$toJSON()
      }
      if (!is.null(self$`portfolioPlan`)) {
        PortfolioTimeIntervalUpdatedEventObject[['portfolioPlan']] <- self$`portfolioPlan`$toJSON()
      }

      PortfolioTimeIntervalUpdatedEventObject
    },
    fromJSON = function(PortfolioTimeIntervalUpdatedEventJson) {
      PortfolioTimeIntervalUpdatedEventObject <- dlensFromJSON(PortfolioTimeIntervalUpdatedEventJson)
      if (!is.null(PortfolioTimeIntervalUpdatedEventObject$`id`)) {
        self$`id` <- PortfolioTimeIntervalUpdatedEventObject$`id`
      }
      if (!is.null(PortfolioTimeIntervalUpdatedEventObject$`portfolioId`)) {
        self$`portfolioId` <- PortfolioTimeIntervalUpdatedEventObject$`portfolioId`
      }
      if (!is.null(PortfolioTimeIntervalUpdatedEventObject$`name`)) {
        self$`name` <- PortfolioTimeIntervalUpdatedEventObject$`name`
      }
      if (!is.null(PortfolioTimeIntervalUpdatedEventObject$`timeInterval`)) {
        timeIntervalObject <- TimeInterval$new()
        timeIntervalObject$fromJSON(jsonlite::toJSON(PortfolioTimeIntervalUpdatedEventObject$timeInterval, auto_unbox = TRUE))
        self$`timeInterval` <- timeIntervalObject
      }
      if (!is.null(PortfolioTimeIntervalUpdatedEventObject$`previousTimeInterval`)) {
        previousTimeIntervalObject <- TimeInterval$new()
        previousTimeIntervalObject$fromJSON(jsonlite::toJSON(PortfolioTimeIntervalUpdatedEventObject$previousTimeInterval, auto_unbox = TRUE))
        self$`previousTimeInterval` <- previousTimeIntervalObject
      }
      if (!is.null(PortfolioTimeIntervalUpdatedEventObject$`portfolioPlan`)) {
        portfolioPlanObject <- PortfolioPlan$new()
        portfolioPlanObject$fromJSON(jsonlite::toJSON(PortfolioTimeIntervalUpdatedEventObject$portfolioPlan, auto_unbox = TRUE))
        self$`portfolioPlan` <- portfolioPlanObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "portfolioId": %s,
           "name": %s,
           "timeInterval": %s,
           "previousTimeInterval": %s,
           "portfolioPlan": %s
        }',
        self$`id`,
        self$`portfolioId`,
        self$`name`,
        self$`timeInterval`$toJSON(),
        self$`previousTimeInterval`$toJSON(),
        self$`portfolioPlan`$toJSON()
      )
    },
    fromJSONString = function(PortfolioTimeIntervalUpdatedEventJson) {
      PortfolioTimeIntervalUpdatedEventObject <- dlensFromJSON(PortfolioTimeIntervalUpdatedEventJson)
      self$`id` <- PortfolioTimeIntervalUpdatedEventObject$`id`
      self$`portfolioId` <- PortfolioTimeIntervalUpdatedEventObject$`portfolioId`
      self$`name` <- PortfolioTimeIntervalUpdatedEventObject$`name`
      TimeIntervalObject <- TimeInterval$new()
      self$`timeInterval` <- TimeIntervalObject$fromJSON(jsonlite::toJSON(PortfolioTimeIntervalUpdatedEventObject$timeInterval, auto_unbox = TRUE))
      TimeIntervalObject <- TimeInterval$new()
      self$`previousTimeInterval` <- TimeIntervalObject$fromJSON(jsonlite::toJSON(PortfolioTimeIntervalUpdatedEventObject$previousTimeInterval, auto_unbox = TRUE))
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`portfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(PortfolioTimeIntervalUpdatedEventObject$portfolioPlan, auto_unbox = TRUE))
    }
  )
)
