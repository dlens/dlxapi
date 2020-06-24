# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' WhatsIn Class
#'
#' @field projectSummaries 
#' @field portfolioPlansWithProjects 
#' @field maxSize 
#' @field maxLimit 
#' @field offset 
#' @field href 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
WhatsIn <- R6::R6Class(
  'WhatsIn',
  public = list(
    `projectSummaries` = NULL,
    `portfolioPlansWithProjects` = NULL,
    `maxSize` = NULL,
    `maxLimit` = NULL,
    `offset` = NULL,
    `href` = NULL,
    initialize = function(`projectSummaries`, `portfolioPlansWithProjects`, `maxSize`, `maxLimit`, `offset`, `href`){
      if (!missing(`projectSummaries`)) {
        stopifnot(is.list(`projectSummaries`), length(`projectSummaries`) != 0)
        lapply(`projectSummaries`, function(x) stopifnot(R6::is.R6(x)))
        self$`projectSummaries` <- `projectSummaries`
      }
      if (!missing(`portfolioPlansWithProjects`)) {
        stopifnot(is.list(`portfolioPlansWithProjects`), length(`portfolioPlansWithProjects`) != 0)
        lapply(`portfolioPlansWithProjects`, function(x) stopifnot(R6::is.R6(x)))
        self$`portfolioPlansWithProjects` <- `portfolioPlansWithProjects`
      }
      if (!missing(`maxSize`)) {
        stopifnot(is.numeric(`maxSize`), length(`maxSize`) == 1)
        self$`maxSize` <- `maxSize`
      }
      if (!missing(`maxLimit`)) {
        stopifnot(is.numeric(`maxLimit`), length(`maxLimit`) == 1)
        self$`maxLimit` <- `maxLimit`
      }
      if (!missing(`offset`)) {
        stopifnot(is.numeric(`offset`), length(`offset`) == 1)
        self$`offset` <- `offset`
      }
      if (!missing(`href`)) {
        stopifnot(is.character(`href`), length(`href`) == 1)
        self$`href` <- `href`
      }
    },
    toJSON = function() {
      WhatsInObject <- list()
      if (!is.null(self$`projectSummaries`)) {
        WhatsInObject[['projectSummaries']] <- lapply(self$`projectSummaries`, function(x) x$toJSON())
      }
      if (!is.null(self$`portfolioPlansWithProjects`)) {
        WhatsInObject[['portfolioPlansWithProjects']] <- lapply(self$`portfolioPlansWithProjects`, function(x) x$toJSON())
      }
      if (!is.null(self$`maxSize`)) {
        WhatsInObject[['maxSize']] <- self$`maxSize`
      }
      if (!is.null(self$`maxLimit`)) {
        WhatsInObject[['maxLimit']] <- self$`maxLimit`
      }
      if (!is.null(self$`offset`)) {
        WhatsInObject[['offset']] <- self$`offset`
      }
      if (!is.null(self$`href`)) {
        WhatsInObject[['href']] <- self$`href`
      }

      WhatsInObject
    },
    fromJSON = function(WhatsInJson) {
      WhatsInObject <- dlensFromJSON(WhatsInJson)
      if (!is.null(WhatsInObject$`projectSummaries`)) {
        self$`projectSummaries` <- lapply(WhatsInObject$`projectSummaries`, function(x) {
          projectSummariesObject <- ProjectSummary$new()
          projectSummariesObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          projectSummariesObject
        })
      }
      if (!is.null(WhatsInObject$`portfolioPlansWithProjects`)) {
        self$`portfolioPlansWithProjects` <- lapply(WhatsInObject$`portfolioPlansWithProjects`, function(x) {
          portfolioPlansWithProjectsObject <- PortfolioPlansWithProjects$new()
          portfolioPlansWithProjectsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          portfolioPlansWithProjectsObject
        })
      }
      if (!is.null(WhatsInObject$`maxSize`)) {
        self$`maxSize` <- WhatsInObject$`maxSize`
      }
      if (!is.null(WhatsInObject$`maxLimit`)) {
        self$`maxLimit` <- WhatsInObject$`maxLimit`
      }
      if (!is.null(WhatsInObject$`offset`)) {
        self$`offset` <- WhatsInObject$`offset`
      }
      if (!is.null(WhatsInObject$`href`)) {
        self$`href` <- WhatsInObject$`href`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "projectSummaries": [%s],
           "portfolioPlansWithProjects": [%s],
           "maxSize": %d,
           "maxLimit": %d,
           "offset": %d,
           "href": %s
        }',
        lapply(self$`projectSummaries`, function(x) paste(x$toJSON(), sep=",")),
        lapply(self$`portfolioPlansWithProjects`, function(x) paste(x$toJSON(), sep=",")),
        self$`maxSize`,
        self$`maxLimit`,
        self$`offset`,
        self$`href`
      )
    },
    fromJSONString = function(WhatsInJson) {
      WhatsInObject <- dlensFromJSON(WhatsInJson)
      self$`projectSummaries` <- lapply(WhatsInObject$`projectSummaries`, function(x) ProjectSummary$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`portfolioPlansWithProjects` <- lapply(WhatsInObject$`portfolioPlansWithProjects`, function(x) PortfolioPlansWithProjects$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`maxSize` <- WhatsInObject$`maxSize`
      self$`maxLimit` <- WhatsInObject$`maxLimit`
      self$`offset` <- WhatsInObject$`offset`
      self$`href` <- WhatsInObject$`href`
    }
  )
)
