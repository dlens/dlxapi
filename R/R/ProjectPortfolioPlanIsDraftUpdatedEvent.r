# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ProjectPortfolioPlanIsDraftUpdatedEvent Class
#'
#' @field id 
#' @field name 
#' @field isDraft 
#' @field previousIsDraft 
#' @field portfolioPlan 
#' @field portfolioId 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProjectPortfolioPlanIsDraftUpdatedEvent <- R6::R6Class(
  'ProjectPortfolioPlanIsDraftUpdatedEvent',
  public = list(
    `id` = NULL,
    `name` = NULL,
    `isDraft` = NULL,
    `previousIsDraft` = NULL,
    `portfolioPlan` = NULL,
    `portfolioId` = NULL,
    initialize = function(`id`, `name`, `isDraft`, `previousIsDraft`, `portfolioPlan`, `portfolioId`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`isDraft`)) {
        self$`isDraft` <- `isDraft`
      }
      if (!missing(`previousIsDraft`)) {
        self$`previousIsDraft` <- `previousIsDraft`
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
      ProjectPortfolioPlanIsDraftUpdatedEventObject <- list()
      if (!is.null(self$`id`)) {
        ProjectPortfolioPlanIsDraftUpdatedEventObject[['id']] <- self$`id`
      }
      if (!is.null(self$`name`)) {
        ProjectPortfolioPlanIsDraftUpdatedEventObject[['name']] <- self$`name`
      }
      if (!is.null(self$`isDraft`)) {
        ProjectPortfolioPlanIsDraftUpdatedEventObject[['isDraft']] <- self$`isDraft`
      }
      if (!is.null(self$`previousIsDraft`)) {
        ProjectPortfolioPlanIsDraftUpdatedEventObject[['previousIsDraft']] <- self$`previousIsDraft`
      }
      if (!is.null(self$`portfolioPlan`)) {
        ProjectPortfolioPlanIsDraftUpdatedEventObject[['portfolioPlan']] <- self$`portfolioPlan`$toJSON()
      }
      if (!is.null(self$`portfolioId`)) {
        ProjectPortfolioPlanIsDraftUpdatedEventObject[['portfolioId']] <- self$`portfolioId`
      }

      ProjectPortfolioPlanIsDraftUpdatedEventObject
    },
    fromJSON = function(ProjectPortfolioPlanIsDraftUpdatedEventJson) {
      ProjectPortfolioPlanIsDraftUpdatedEventObject <- dlensFromJSON(ProjectPortfolioPlanIsDraftUpdatedEventJson)
      if (!is.null(ProjectPortfolioPlanIsDraftUpdatedEventObject$`id`)) {
        self$`id` <- ProjectPortfolioPlanIsDraftUpdatedEventObject$`id`
      }
      if (!is.null(ProjectPortfolioPlanIsDraftUpdatedEventObject$`name`)) {
        self$`name` <- ProjectPortfolioPlanIsDraftUpdatedEventObject$`name`
      }
      if (!is.null(ProjectPortfolioPlanIsDraftUpdatedEventObject$`isDraft`)) {
        self$`isDraft` <- ProjectPortfolioPlanIsDraftUpdatedEventObject$`isDraft`
      }
      if (!is.null(ProjectPortfolioPlanIsDraftUpdatedEventObject$`previousIsDraft`)) {
        self$`previousIsDraft` <- ProjectPortfolioPlanIsDraftUpdatedEventObject$`previousIsDraft`
      }
      if (!is.null(ProjectPortfolioPlanIsDraftUpdatedEventObject$`portfolioPlan`)) {
        portfolioPlanObject <- PortfolioPlan$new()
        portfolioPlanObject$fromJSON(jsonlite::toJSON(ProjectPortfolioPlanIsDraftUpdatedEventObject$portfolioPlan, auto_unbox = TRUE))
        self$`portfolioPlan` <- portfolioPlanObject
      }
      if (!is.null(ProjectPortfolioPlanIsDraftUpdatedEventObject$`portfolioId`)) {
        self$`portfolioId` <- ProjectPortfolioPlanIsDraftUpdatedEventObject$`portfolioId`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "name": %s,
           "isDraft": %s,
           "previousIsDraft": %s,
           "portfolioPlan": %s,
           "portfolioId": %s
        }',
        self$`id`,
        self$`name`,
        self$`isDraft`,
        self$`previousIsDraft`,
        self$`portfolioPlan`$toJSON(),
        self$`portfolioId`
      )
    },
    fromJSONString = function(ProjectPortfolioPlanIsDraftUpdatedEventJson) {
      ProjectPortfolioPlanIsDraftUpdatedEventObject <- dlensFromJSON(ProjectPortfolioPlanIsDraftUpdatedEventJson)
      self$`id` <- ProjectPortfolioPlanIsDraftUpdatedEventObject$`id`
      self$`name` <- ProjectPortfolioPlanIsDraftUpdatedEventObject$`name`
      self$`isDraft` <- ProjectPortfolioPlanIsDraftUpdatedEventObject$`isDraft`
      self$`previousIsDraft` <- ProjectPortfolioPlanIsDraftUpdatedEventObject$`previousIsDraft`
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`portfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(ProjectPortfolioPlanIsDraftUpdatedEventObject$portfolioPlan, auto_unbox = TRUE))
      self$`portfolioId` <- ProjectPortfolioPlanIsDraftUpdatedEventObject$`portfolioId`
    }
  )
)
