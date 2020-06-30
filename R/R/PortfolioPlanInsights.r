# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' PortfolioPlanInsights Class
#'
#' @field href 
#' @field id 
#' @field createdAt 
#' @field modifiedAt 
#' @field statusCounts 
#' @field budget 
#' @field allocation 
#' @field portfolio 
#' @field details 
#' @field costBudgetAllocation 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PortfolioPlanInsights <- R6::R6Class(
  'PortfolioPlanInsights',
  public = list(
    `href` = NULL,
    `id` = NULL,
    `createdAt` = NULL,
    `modifiedAt` = NULL,
    `statusCounts` = NULL,
    `budget` = NULL,
    `allocation` = NULL,
    `portfolio` = NULL,
    `details` = NULL,
    `costBudgetAllocation` = NULL,
    initialize = function(`href`, `id`, `createdAt`, `modifiedAt`, `statusCounts`, `budget`, `allocation`, `portfolio`, `details`, `costBudgetAllocation`){
      if (!missing(`href`)) {
        stopifnot(is.character(`href`), length(`href`) == 1)
        self$`href` <- `href`
      }
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`createdAt`)) {
        stopifnot(is.character(`createdAt`), length(`createdAt`) == 1)
        self$`createdAt` <- `createdAt`
      }
      if (!missing(`modifiedAt`)) {
        stopifnot(is.character(`modifiedAt`), length(`modifiedAt`) == 1)
        self$`modifiedAt` <- `modifiedAt`
      }
      if (!missing(`statusCounts`)) {
        stopifnot(is.list(`statusCounts`), length(`statusCounts`) != 0)
        lapply(`statusCounts`, function(x) stopifnot(R6::is.R6(x)))
        self$`statusCounts` <- `statusCounts`
      }
      if (!missing(`budget`)) {
        stopifnot(is.numeric(`budget`), length(`budget`) == 1)
        self$`budget` <- `budget`
      }
      if (!missing(`allocation`)) {
        stopifnot(is.numeric(`allocation`), length(`allocation`) == 1)
        self$`allocation` <- `allocation`
      }
      if (!missing(`portfolio`)) {
        stopifnot(R6::is.R6(`portfolio`))
        self$`portfolio` <- `portfolio`
      }
      if (!missing(`details`)) {
        stopifnot(is.list(`details`), length(`details`) != 0)
        lapply(`details`, function(x) stopifnot(R6::is.R6(x)))
        self$`details` <- `details`
      }
      if (!missing(`costBudgetAllocation`)) {
        stopifnot(is.list(`costBudgetAllocation`), length(`costBudgetAllocation`) != 0)
        lapply(`costBudgetAllocation`, function(x) stopifnot(R6::is.R6(x)))
        self$`costBudgetAllocation` <- `costBudgetAllocation`
      }
    },
    toJSON = function() {
      PortfolioPlanInsightsObject <- list()
      if (!is.null(self$`href`)) {
        PortfolioPlanInsightsObject[['href']] <- self$`href`
      }
      if (!is.null(self$`id`)) {
        PortfolioPlanInsightsObject[['id']] <- self$`id`
      }
      if (!is.null(self$`createdAt`)) {
        PortfolioPlanInsightsObject[['createdAt']] <- self$`createdAt`
      }
      if (!is.null(self$`modifiedAt`)) {
        PortfolioPlanInsightsObject[['modifiedAt']] <- self$`modifiedAt`
      }
      if (!is.null(self$`statusCounts`)) {
        PortfolioPlanInsightsObject[['statusCounts']] <- lapply(self$`statusCounts`, function(x) x$toJSON())
      }
      if (!is.null(self$`budget`)) {
        PortfolioPlanInsightsObject[['budget']] <- self$`budget`
      }
      if (!is.null(self$`allocation`)) {
        PortfolioPlanInsightsObject[['allocation']] <- self$`allocation`
      }
      if (!is.null(self$`portfolio`)) {
        PortfolioPlanInsightsObject[['portfolio']] <- self$`portfolio`$toJSON()
      }
      if (!is.null(self$`details`)) {
        PortfolioPlanInsightsObject[['details']] <- lapply(self$`details`, function(x) x$toJSON())
      }
      if (!is.null(self$`costBudgetAllocation`)) {
        PortfolioPlanInsightsObject[['costBudgetAllocation']] <- lapply(self$`costBudgetAllocation`, function(x) x$toJSON())
      }

      PortfolioPlanInsightsObject
    },
    fromJSON = function(PortfolioPlanInsightsJson) {
      PortfolioPlanInsightsObject <- dlensFromJSON(PortfolioPlanInsightsJson)
      if (!is.null(PortfolioPlanInsightsObject$`href`)) {
        self$`href` <- PortfolioPlanInsightsObject$`href`
      }
      if (!is.null(PortfolioPlanInsightsObject$`id`)) {
        self$`id` <- PortfolioPlanInsightsObject$`id`
      }
      if (!is.null(PortfolioPlanInsightsObject$`createdAt`)) {
        self$`createdAt` <- PortfolioPlanInsightsObject$`createdAt`
      }
      if (!is.null(PortfolioPlanInsightsObject$`modifiedAt`)) {
        self$`modifiedAt` <- PortfolioPlanInsightsObject$`modifiedAt`
      }
      if (!is.null(PortfolioPlanInsightsObject$`statusCounts`)) {
        self$`statusCounts` <- lapply(PortfolioPlanInsightsObject$`statusCounts`, function(x) {
          statusCountsObject <- ValueCount$new()
          statusCountsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          statusCountsObject
        })
      }
      if (!is.null(PortfolioPlanInsightsObject$`budget`)) {
        self$`budget` <- PortfolioPlanInsightsObject$`budget`
      }
      if (!is.null(PortfolioPlanInsightsObject$`allocation`)) {
        self$`allocation` <- PortfolioPlanInsightsObject$`allocation`
      }
      if (!is.null(PortfolioPlanInsightsObject$`portfolio`)) {
        portfolioObject <- Portfolio$new()
        portfolioObject$fromJSON(jsonlite::toJSON(PortfolioPlanInsightsObject$portfolio, auto_unbox = TRUE))
        self$`portfolio` <- portfolioObject
      }
      if (!is.null(PortfolioPlanInsightsObject$`details`)) {
        self$`details` <- lapply(PortfolioPlanInsightsObject$`details`, function(x) {
          detailsObject <- PortfolioPlanInsights$new()
          detailsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          detailsObject
        })
      }
      if (!is.null(PortfolioPlanInsightsObject$`costBudgetAllocation`)) {
        self$`costBudgetAllocation` <- lapply(PortfolioPlanInsightsObject$`costBudgetAllocation`, function(x) {
          costBudgetAllocationObject <- CostBudgetAllocation$new()
          costBudgetAllocationObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          costBudgetAllocationObject
        })
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "href": %s,
           "id": %s,
           "createdAt": %s,
           "modifiedAt": %s,
           "statusCounts": [%s],
           "budget": %d,
           "allocation": %d,
           "portfolio": %s,
           "details": [%s],
           "costBudgetAllocation": [%s]
        }',
        self$`href`,
        self$`id`,
        self$`createdAt`,
        self$`modifiedAt`,
        lapply(self$`statusCounts`, function(x) paste(x$toJSON(), sep=",")),
        self$`budget`,
        self$`allocation`,
        self$`portfolio`$toJSON(),
        lapply(self$`details`, function(x) paste(x$toJSON(), sep=",")),
        lapply(self$`costBudgetAllocation`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(PortfolioPlanInsightsJson) {
      PortfolioPlanInsightsObject <- dlensFromJSON(PortfolioPlanInsightsJson)
      self$`href` <- PortfolioPlanInsightsObject$`href`
      self$`id` <- PortfolioPlanInsightsObject$`id`
      self$`createdAt` <- PortfolioPlanInsightsObject$`createdAt`
      self$`modifiedAt` <- PortfolioPlanInsightsObject$`modifiedAt`
      self$`statusCounts` <- lapply(PortfolioPlanInsightsObject$`statusCounts`, function(x) ValueCount$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`budget` <- PortfolioPlanInsightsObject$`budget`
      self$`allocation` <- PortfolioPlanInsightsObject$`allocation`
      PortfolioObject <- Portfolio$new()
      self$`portfolio` <- PortfolioObject$fromJSON(jsonlite::toJSON(PortfolioPlanInsightsObject$portfolio, auto_unbox = TRUE))
      self$`details` <- lapply(PortfolioPlanInsightsObject$`details`, function(x) PortfolioPlanInsights$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`costBudgetAllocation` <- lapply(PortfolioPlanInsightsObject$`costBudgetAllocation`, function(x) CostBudgetAllocation$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)