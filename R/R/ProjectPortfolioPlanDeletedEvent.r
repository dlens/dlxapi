# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ProjectPortfolioPlanDeletedEvent Class
#'
#' @field id 
#' @field name 
#' @field portfolioPlan 
#' @field portfolioId 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProjectPortfolioPlanDeletedEvent <- R6::R6Class(
  'ProjectPortfolioPlanDeletedEvent',
  public = list(
    `id` = NULL,
    `name` = NULL,
    `portfolioPlan` = NULL,
    `portfolioId` = NULL,
    initialize = function(`id`, `name`, `portfolioPlan`, `portfolioId`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
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
      ProjectPortfolioPlanDeletedEventObject <- list()
      if (!is.null(self$`id`)) {
        ProjectPortfolioPlanDeletedEventObject[['id']] <- self$`id`
      }
      if (!is.null(self$`name`)) {
        ProjectPortfolioPlanDeletedEventObject[['name']] <- self$`name`
      }
      if (!is.null(self$`portfolioPlan`)) {
        ProjectPortfolioPlanDeletedEventObject[['portfolioPlan']] <- self$`portfolioPlan`$toJSON()
      }
      if (!is.null(self$`portfolioId`)) {
        ProjectPortfolioPlanDeletedEventObject[['portfolioId']] <- self$`portfolioId`
      }

      ProjectPortfolioPlanDeletedEventObject
    },
    fromJSON = function(ProjectPortfolioPlanDeletedEventJson) {
      ProjectPortfolioPlanDeletedEventObject <- dlensFromJSON(ProjectPortfolioPlanDeletedEventJson)
      if (!is.null(ProjectPortfolioPlanDeletedEventObject$`id`)) {
        self$`id` <- ProjectPortfolioPlanDeletedEventObject$`id`
      }
      if (!is.null(ProjectPortfolioPlanDeletedEventObject$`name`)) {
        self$`name` <- ProjectPortfolioPlanDeletedEventObject$`name`
      }
      if (!is.null(ProjectPortfolioPlanDeletedEventObject$`portfolioPlan`)) {
        portfolioPlanObject <- PortfolioPlan$new()
        portfolioPlanObject$fromJSON(jsonlite::toJSON(ProjectPortfolioPlanDeletedEventObject$portfolioPlan, auto_unbox = TRUE))
        self$`portfolioPlan` <- portfolioPlanObject
      }
      if (!is.null(ProjectPortfolioPlanDeletedEventObject$`portfolioId`)) {
        self$`portfolioId` <- ProjectPortfolioPlanDeletedEventObject$`portfolioId`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "name": %s,
           "portfolioPlan": %s,
           "portfolioId": %s
        }',
        self$`id`,
        self$`name`,
        self$`portfolioPlan`$toJSON(),
        self$`portfolioId`
      )
    },
    fromJSONString = function(ProjectPortfolioPlanDeletedEventJson) {
      ProjectPortfolioPlanDeletedEventObject <- dlensFromJSON(ProjectPortfolioPlanDeletedEventJson)
      self$`id` <- ProjectPortfolioPlanDeletedEventObject$`id`
      self$`name` <- ProjectPortfolioPlanDeletedEventObject$`name`
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`portfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(ProjectPortfolioPlanDeletedEventObject$portfolioPlan, auto_unbox = TRUE))
      self$`portfolioId` <- ProjectPortfolioPlanDeletedEventObject$`portfolioId`
    }
  )
)
