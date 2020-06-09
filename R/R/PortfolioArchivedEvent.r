# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' PortfolioArchivedEvent Class
#'
#' @field id 
#' @field portfolioId 
#' @field name 
#' @field isArchived 
#' @field portfolioPlan 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PortfolioArchivedEvent <- R6::R6Class(
  'PortfolioArchivedEvent',
  public = list(
    `id` = NULL,
    `portfolioId` = NULL,
    `name` = NULL,
    `isArchived` = NULL,
    `portfolioPlan` = NULL,
    initialize = function(`id`, `portfolioId`, `name`, `isArchived`, `portfolioPlan`){
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
      if (!missing(`isArchived`)) {
        self$`isArchived` <- `isArchived`
      }
      if (!missing(`portfolioPlan`)) {
        stopifnot(R6::is.R6(`portfolioPlan`))
        self$`portfolioPlan` <- `portfolioPlan`
      }
    },
    toJSON = function() {
      PortfolioArchivedEventObject <- list()
      if (!is.null(self$`id`)) {
        PortfolioArchivedEventObject[['id']] <- self$`id`
      }
      if (!is.null(self$`portfolioId`)) {
        PortfolioArchivedEventObject[['portfolioId']] <- self$`portfolioId`
      }
      if (!is.null(self$`name`)) {
        PortfolioArchivedEventObject[['name']] <- self$`name`
      }
      if (!is.null(self$`isArchived`)) {
        PortfolioArchivedEventObject[['isArchived']] <- self$`isArchived`
      }
      if (!is.null(self$`portfolioPlan`)) {
        PortfolioArchivedEventObject[['portfolioPlan']] <- self$`portfolioPlan`$toJSON()
      }

      PortfolioArchivedEventObject
    },
    fromJSON = function(PortfolioArchivedEventJson) {
      PortfolioArchivedEventObject <- jsonlite::fromJSON(PortfolioArchivedEventJson)
      if (!is.null(PortfolioArchivedEventObject$`id`)) {
        self$`id` <- PortfolioArchivedEventObject$`id`
      }
      if (!is.null(PortfolioArchivedEventObject$`portfolioId`)) {
        self$`portfolioId` <- PortfolioArchivedEventObject$`portfolioId`
      }
      if (!is.null(PortfolioArchivedEventObject$`name`)) {
        self$`name` <- PortfolioArchivedEventObject$`name`
      }
      if (!is.null(PortfolioArchivedEventObject$`isArchived`)) {
        self$`isArchived` <- PortfolioArchivedEventObject$`isArchived`
      }
      if (!is.null(PortfolioArchivedEventObject$`portfolioPlan`)) {
        portfolioPlanObject <- PortfolioPlan$new()
        portfolioPlanObject$fromJSON(jsonlite::toJSON(PortfolioArchivedEventObject$portfolioPlan, auto_unbox = TRUE))
        self$`portfolioPlan` <- portfolioPlanObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "portfolioId": %s,
           "name": %s,
           "isArchived": %s,
           "portfolioPlan": %s
        }',
        self$`id`,
        self$`portfolioId`,
        self$`name`,
        self$`isArchived`,
        self$`portfolioPlan`$toJSON()
      )
    },
    fromJSONString = function(PortfolioArchivedEventJson) {
      PortfolioArchivedEventObject <- jsonlite::fromJSON(PortfolioArchivedEventJson)
      self$`id` <- PortfolioArchivedEventObject$`id`
      self$`portfolioId` <- PortfolioArchivedEventObject$`portfolioId`
      self$`name` <- PortfolioArchivedEventObject$`name`
      self$`isArchived` <- PortfolioArchivedEventObject$`isArchived`
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`portfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(PortfolioArchivedEventObject$portfolioPlan, auto_unbox = TRUE))
    }
  )
)
