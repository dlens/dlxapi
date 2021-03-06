# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' DlcPortfolio Class
#'
#' @field id 
#' @field url 
#' @field taskUrl 
#' @field lastUpdatedAt 
#' @field lastFetchedAt 
#' @field statuses 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DlcPortfolio <- R6::R6Class(
  'DlcPortfolio',
  public = list(
    `id` = NULL,
    `url` = NULL,
    `taskUrl` = NULL,
    `lastUpdatedAt` = NULL,
    `lastFetchedAt` = NULL,
    `statuses` = NULL,
    initialize = function(`id`, `url`, `taskUrl`, `lastUpdatedAt`, `lastFetchedAt`, `statuses`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`url`)) {
        stopifnot(is.character(`url`), length(`url`) == 1)
        self$`url` <- `url`
      }
      if (!missing(`taskUrl`)) {
        stopifnot(is.character(`taskUrl`), length(`taskUrl`) == 1)
        self$`taskUrl` <- `taskUrl`
      }
      if (!missing(`lastUpdatedAt`)) {
        stopifnot(is.numeric(`lastUpdatedAt`), length(`lastUpdatedAt`) == 1)
        self$`lastUpdatedAt` <- `lastUpdatedAt`
      }
      if (!missing(`lastFetchedAt`)) {
        stopifnot(is.numeric(`lastFetchedAt`), length(`lastFetchedAt`) == 1)
        self$`lastFetchedAt` <- `lastFetchedAt`
      }
      if (!missing(`statuses`)) {
        stopifnot(is.list(`statuses`), length(`statuses`) != 0)
        lapply(`statuses`, function(x) stopifnot(is.character(x)))
        self$`statuses` <- `statuses`
      }
    },
    toJSON = function() {
      DlcPortfolioObject <- list()
      if (!is.null(self$`id`)) {
        DlcPortfolioObject[['id']] <- self$`id`
      }
      if (!is.null(self$`url`)) {
        DlcPortfolioObject[['url']] <- self$`url`
      }
      if (!is.null(self$`taskUrl`)) {
        DlcPortfolioObject[['taskUrl']] <- self$`taskUrl`
      }
      if (!is.null(self$`lastUpdatedAt`)) {
        DlcPortfolioObject[['lastUpdatedAt']] <- self$`lastUpdatedAt`
      }
      if (!is.null(self$`lastFetchedAt`)) {
        DlcPortfolioObject[['lastFetchedAt']] <- self$`lastFetchedAt`
      }
      if (!is.null(self$`statuses`)) {
        DlcPortfolioObject[['statuses']] <- self$`statuses`
      }

      DlcPortfolioObject
    },
    fromJSON = function(DlcPortfolioJson) {
      DlcPortfolioObject <- dlensFromJSON(DlcPortfolioJson)
      if (!is.null(DlcPortfolioObject$`id`)) {
        self$`id` <- DlcPortfolioObject$`id`
      }
      if (!is.null(DlcPortfolioObject$`url`)) {
        self$`url` <- DlcPortfolioObject$`url`
      }
      if (!is.null(DlcPortfolioObject$`taskUrl`)) {
        self$`taskUrl` <- DlcPortfolioObject$`taskUrl`
      }
      if (!is.null(DlcPortfolioObject$`lastUpdatedAt`)) {
        self$`lastUpdatedAt` <- DlcPortfolioObject$`lastUpdatedAt`
      }
      if (!is.null(DlcPortfolioObject$`lastFetchedAt`)) {
        self$`lastFetchedAt` <- DlcPortfolioObject$`lastFetchedAt`
      }
      if (!is.null(DlcPortfolioObject$`statuses`)) {
        self$`statuses` <- DlcPortfolioObject$`statuses`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "url": %s,
           "taskUrl": %s,
           "lastUpdatedAt": %d,
           "lastFetchedAt": %d,
           "statuses": [%s]
        }',
        self$`id`,
        self$`url`,
        self$`taskUrl`,
        self$`lastUpdatedAt`,
        self$`lastFetchedAt`,
        lapply(self$`statuses`, function(x) paste(paste0('"', x, '"'), sep=","))
      )
    },
    fromJSONString = function(DlcPortfolioJson) {
      DlcPortfolioObject <- dlensFromJSON(DlcPortfolioJson)
      self$`id` <- DlcPortfolioObject$`id`
      self$`url` <- DlcPortfolioObject$`url`
      self$`taskUrl` <- DlcPortfolioObject$`taskUrl`
      self$`lastUpdatedAt` <- DlcPortfolioObject$`lastUpdatedAt`
      self$`lastFetchedAt` <- DlcPortfolioObject$`lastFetchedAt`
      self$`statuses` <- DlcPortfolioObject$`statuses`
    }
  )
)
