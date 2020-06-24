# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' PortfolioPlanRebaselinedEvent Class
#'
#' @field id 
#' @field baselinePortfolioPlanName 
#' @field whatIfPortfolioPlanName 
#' @field portfolioPlan 
#' @field whatIfPortfolioPlan 
#' @field portfolioId 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PortfolioPlanRebaselinedEvent <- R6::R6Class(
  'PortfolioPlanRebaselinedEvent',
  public = list(
    `id` = NULL,
    `baselinePortfolioPlanName` = NULL,
    `whatIfPortfolioPlanName` = NULL,
    `portfolioPlan` = NULL,
    `whatIfPortfolioPlan` = NULL,
    `portfolioId` = NULL,
    initialize = function(`id`, `baselinePortfolioPlanName`, `whatIfPortfolioPlanName`, `portfolioPlan`, `whatIfPortfolioPlan`, `portfolioId`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`baselinePortfolioPlanName`)) {
        stopifnot(is.character(`baselinePortfolioPlanName`), length(`baselinePortfolioPlanName`) == 1)
        self$`baselinePortfolioPlanName` <- `baselinePortfolioPlanName`
      }
      if (!missing(`whatIfPortfolioPlanName`)) {
        stopifnot(is.character(`whatIfPortfolioPlanName`), length(`whatIfPortfolioPlanName`) == 1)
        self$`whatIfPortfolioPlanName` <- `whatIfPortfolioPlanName`
      }
      if (!missing(`portfolioPlan`)) {
        stopifnot(R6::is.R6(`portfolioPlan`))
        self$`portfolioPlan` <- `portfolioPlan`
      }
      if (!missing(`whatIfPortfolioPlan`)) {
        stopifnot(R6::is.R6(`whatIfPortfolioPlan`))
        self$`whatIfPortfolioPlan` <- `whatIfPortfolioPlan`
      }
      if (!missing(`portfolioId`)) {
        stopifnot(is.character(`portfolioId`), length(`portfolioId`) == 1)
        self$`portfolioId` <- `portfolioId`
      }
    },
    toJSON = function() {
      PortfolioPlanRebaselinedEventObject <- list()
      if (!is.null(self$`id`)) {
        PortfolioPlanRebaselinedEventObject[['id']] <- self$`id`
      }
      if (!is.null(self$`baselinePortfolioPlanName`)) {
        PortfolioPlanRebaselinedEventObject[['baselinePortfolioPlanName']] <- self$`baselinePortfolioPlanName`
      }
      if (!is.null(self$`whatIfPortfolioPlanName`)) {
        PortfolioPlanRebaselinedEventObject[['whatIfPortfolioPlanName']] <- self$`whatIfPortfolioPlanName`
      }
      if (!is.null(self$`portfolioPlan`)) {
        PortfolioPlanRebaselinedEventObject[['portfolioPlan']] <- self$`portfolioPlan`$toJSON()
      }
      if (!is.null(self$`whatIfPortfolioPlan`)) {
        PortfolioPlanRebaselinedEventObject[['whatIfPortfolioPlan']] <- self$`whatIfPortfolioPlan`$toJSON()
      }
      if (!is.null(self$`portfolioId`)) {
        PortfolioPlanRebaselinedEventObject[['portfolioId']] <- self$`portfolioId`
      }

      PortfolioPlanRebaselinedEventObject
    },
    fromJSON = function(PortfolioPlanRebaselinedEventJson) {
      PortfolioPlanRebaselinedEventObject <- dlensFromJSON(PortfolioPlanRebaselinedEventJson)
      if (!is.null(PortfolioPlanRebaselinedEventObject$`id`)) {
        self$`id` <- PortfolioPlanRebaselinedEventObject$`id`
      }
      if (!is.null(PortfolioPlanRebaselinedEventObject$`baselinePortfolioPlanName`)) {
        self$`baselinePortfolioPlanName` <- PortfolioPlanRebaselinedEventObject$`baselinePortfolioPlanName`
      }
      if (!is.null(PortfolioPlanRebaselinedEventObject$`whatIfPortfolioPlanName`)) {
        self$`whatIfPortfolioPlanName` <- PortfolioPlanRebaselinedEventObject$`whatIfPortfolioPlanName`
      }
      if (!is.null(PortfolioPlanRebaselinedEventObject$`portfolioPlan`)) {
        portfolioPlanObject <- PortfolioPlan$new()
        portfolioPlanObject$fromJSON(jsonlite::toJSON(PortfolioPlanRebaselinedEventObject$portfolioPlan, auto_unbox = TRUE))
        self$`portfolioPlan` <- portfolioPlanObject
      }
      if (!is.null(PortfolioPlanRebaselinedEventObject$`whatIfPortfolioPlan`)) {
        whatIfPortfolioPlanObject <- PortfolioPlan$new()
        whatIfPortfolioPlanObject$fromJSON(jsonlite::toJSON(PortfolioPlanRebaselinedEventObject$whatIfPortfolioPlan, auto_unbox = TRUE))
        self$`whatIfPortfolioPlan` <- whatIfPortfolioPlanObject
      }
      if (!is.null(PortfolioPlanRebaselinedEventObject$`portfolioId`)) {
        self$`portfolioId` <- PortfolioPlanRebaselinedEventObject$`portfolioId`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "baselinePortfolioPlanName": %s,
           "whatIfPortfolioPlanName": %s,
           "portfolioPlan": %s,
           "whatIfPortfolioPlan": %s,
           "portfolioId": %s
        }',
        self$`id`,
        self$`baselinePortfolioPlanName`,
        self$`whatIfPortfolioPlanName`,
        self$`portfolioPlan`$toJSON(),
        self$`whatIfPortfolioPlan`$toJSON(),
        self$`portfolioId`
      )
    },
    fromJSONString = function(PortfolioPlanRebaselinedEventJson) {
      PortfolioPlanRebaselinedEventObject <- dlensFromJSON(PortfolioPlanRebaselinedEventJson)
      self$`id` <- PortfolioPlanRebaselinedEventObject$`id`
      self$`baselinePortfolioPlanName` <- PortfolioPlanRebaselinedEventObject$`baselinePortfolioPlanName`
      self$`whatIfPortfolioPlanName` <- PortfolioPlanRebaselinedEventObject$`whatIfPortfolioPlanName`
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`portfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(PortfolioPlanRebaselinedEventObject$portfolioPlan, auto_unbox = TRUE))
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`whatIfPortfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(PortfolioPlanRebaselinedEventObject$whatIfPortfolioPlan, auto_unbox = TRUE))
      self$`portfolioId` <- PortfolioPlanRebaselinedEventObject$`portfolioId`
    }
  )
)
