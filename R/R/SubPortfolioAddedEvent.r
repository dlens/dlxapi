# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' SubPortfolioAddedEvent Class
#'
#' @field id 
#' @field portfolioId 
#' @field name 
#' @field subPortfolio 
#' @field position 
#' @field portfolioPlan 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SubPortfolioAddedEvent <- R6::R6Class(
  'SubPortfolioAddedEvent',
  public = list(
    `id` = NULL,
    `portfolioId` = NULL,
    `name` = NULL,
    `subPortfolio` = NULL,
    `position` = NULL,
    `portfolioPlan` = NULL,
    initialize = function(`id`, `portfolioId`, `name`, `subPortfolio`, `position`, `portfolioPlan`){
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
      if (!missing(`subPortfolio`)) {
        stopifnot(R6::is.R6(`subPortfolio`))
        self$`subPortfolio` <- `subPortfolio`
      }
      if (!missing(`position`)) {
        stopifnot(is.numeric(`position`), length(`position`) == 1)
        self$`position` <- `position`
      }
      if (!missing(`portfolioPlan`)) {
        stopifnot(R6::is.R6(`portfolioPlan`))
        self$`portfolioPlan` <- `portfolioPlan`
      }
    },
    toJSON = function() {
      SubPortfolioAddedEventObject <- list()
      if (!is.null(self$`id`)) {
        SubPortfolioAddedEventObject[['id']] <- self$`id`
      }
      if (!is.null(self$`portfolioId`)) {
        SubPortfolioAddedEventObject[['portfolioId']] <- self$`portfolioId`
      }
      if (!is.null(self$`name`)) {
        SubPortfolioAddedEventObject[['name']] <- self$`name`
      }
      if (!is.null(self$`subPortfolio`)) {
        SubPortfolioAddedEventObject[['subPortfolio']] <- self$`subPortfolio`$toJSON()
      }
      if (!is.null(self$`position`)) {
        SubPortfolioAddedEventObject[['position']] <- self$`position`
      }
      if (!is.null(self$`portfolioPlan`)) {
        SubPortfolioAddedEventObject[['portfolioPlan']] <- self$`portfolioPlan`$toJSON()
      }

      SubPortfolioAddedEventObject
    },
    fromJSON = function(SubPortfolioAddedEventJson) {
      SubPortfolioAddedEventObject <- dlensFromJSON(SubPortfolioAddedEventJson)
      if (!is.null(SubPortfolioAddedEventObject$`id`)) {
        self$`id` <- SubPortfolioAddedEventObject$`id`
      }
      if (!is.null(SubPortfolioAddedEventObject$`portfolioId`)) {
        self$`portfolioId` <- SubPortfolioAddedEventObject$`portfolioId`
      }
      if (!is.null(SubPortfolioAddedEventObject$`name`)) {
        self$`name` <- SubPortfolioAddedEventObject$`name`
      }
      if (!is.null(SubPortfolioAddedEventObject$`subPortfolio`)) {
        subPortfolioObject <- Portfolio$new()
        subPortfolioObject$fromJSON(jsonlite::toJSON(SubPortfolioAddedEventObject$subPortfolio, auto_unbox = TRUE))
        self$`subPortfolio` <- subPortfolioObject
      }
      if (!is.null(SubPortfolioAddedEventObject$`position`)) {
        self$`position` <- SubPortfolioAddedEventObject$`position`
      }
      if (!is.null(SubPortfolioAddedEventObject$`portfolioPlan`)) {
        portfolioPlanObject <- PortfolioPlan$new()
        portfolioPlanObject$fromJSON(jsonlite::toJSON(SubPortfolioAddedEventObject$portfolioPlan, auto_unbox = TRUE))
        self$`portfolioPlan` <- portfolioPlanObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "portfolioId": %s,
           "name": %s,
           "subPortfolio": %s,
           "position": %d,
           "portfolioPlan": %s
        }',
        self$`id`,
        self$`portfolioId`,
        self$`name`,
        self$`subPortfolio`$toJSON(),
        self$`position`,
        self$`portfolioPlan`$toJSON()
      )
    },
    fromJSONString = function(SubPortfolioAddedEventJson) {
      SubPortfolioAddedEventObject <- dlensFromJSON(SubPortfolioAddedEventJson)
      self$`id` <- SubPortfolioAddedEventObject$`id`
      self$`portfolioId` <- SubPortfolioAddedEventObject$`portfolioId`
      self$`name` <- SubPortfolioAddedEventObject$`name`
      PortfolioObject <- Portfolio$new()
      self$`subPortfolio` <- PortfolioObject$fromJSON(jsonlite::toJSON(SubPortfolioAddedEventObject$subPortfolio, auto_unbox = TRUE))
      self$`position` <- SubPortfolioAddedEventObject$`position`
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`portfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(SubPortfolioAddedEventObject$portfolioPlan, auto_unbox = TRUE))
    }
  )
)
