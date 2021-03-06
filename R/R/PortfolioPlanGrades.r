# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' PortfolioPlanGrades Class
#'
#' @field href 
#' @field offset 
#' @field limit 
#' @field size 
#' @field items 
#' @field portfolio 
#' @field details 
#' @field gradingType 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PortfolioPlanGrades <- R6::R6Class(
  'PortfolioPlanGrades',
  public = list(
    `href` = NULL,
    `offset` = NULL,
    `limit` = NULL,
    `size` = NULL,
    `items` = NULL,
    `portfolio` = NULL,
    `details` = NULL,
    `gradingType` = NULL,
    initialize = function(`href`, `offset`, `limit`, `size`, `items`, `portfolio`, `details`, `gradingType`){
      if (!missing(`href`)) {
        stopifnot(is.character(`href`), length(`href`) == 1)
        self$`href` <- `href`
      }
      if (!missing(`offset`)) {
        stopifnot(is.numeric(`offset`), length(`offset`) == 1)
        self$`offset` <- `offset`
      }
      if (!missing(`limit`)) {
        stopifnot(is.numeric(`limit`), length(`limit`) == 1)
        self$`limit` <- `limit`
      }
      if (!missing(`size`)) {
        stopifnot(is.numeric(`size`), length(`size`) == 1)
        self$`size` <- `size`
      }
      if (!missing(`items`)) {
        stopifnot(is.list(`items`), length(`items`) != 0)
        lapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
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
      if (!missing(`gradingType`)) {
        stopifnot(R6::is.R6(`gradingType`))
        self$`gradingType` <- `gradingType`
      }
    },
    toJSON = function() {
      PortfolioPlanGradesObject <- list()
      if (!is.null(self$`href`)) {
        PortfolioPlanGradesObject[['href']] <- self$`href`
      }
      if (!is.null(self$`offset`)) {
        PortfolioPlanGradesObject[['offset']] <- self$`offset`
      }
      if (!is.null(self$`limit`)) {
        PortfolioPlanGradesObject[['limit']] <- self$`limit`
      }
      if (!is.null(self$`size`)) {
        PortfolioPlanGradesObject[['size']] <- self$`size`
      }
      if (!is.null(self$`items`)) {
        PortfolioPlanGradesObject[['items']] <- lapply(self$`items`, function(x) x$toJSON())
      }
      if (!is.null(self$`portfolio`)) {
        PortfolioPlanGradesObject[['portfolio']] <- self$`portfolio`$toJSON()
      }
      if (!is.null(self$`details`)) {
        PortfolioPlanGradesObject[['details']] <- lapply(self$`details`, function(x) x$toJSON())
      }
      if (!is.null(self$`gradingType`)) {
        PortfolioPlanGradesObject[['gradingType']] <- self$`gradingType`$toJSON()
      }

      PortfolioPlanGradesObject
    },
    fromJSON = function(PortfolioPlanGradesJson) {
      PortfolioPlanGradesObject <- dlensFromJSON(PortfolioPlanGradesJson)
      if (!is.null(PortfolioPlanGradesObject$`href`)) {
        self$`href` <- PortfolioPlanGradesObject$`href`
      }
      if (!is.null(PortfolioPlanGradesObject$`offset`)) {
        self$`offset` <- PortfolioPlanGradesObject$`offset`
      }
      if (!is.null(PortfolioPlanGradesObject$`limit`)) {
        self$`limit` <- PortfolioPlanGradesObject$`limit`
      }
      if (!is.null(PortfolioPlanGradesObject$`size`)) {
        self$`size` <- PortfolioPlanGradesObject$`size`
      }
      if (!is.null(PortfolioPlanGradesObject$`items`)) {
        self$`items` <- lapply(PortfolioPlanGradesObject$`items`, function(x) {
          itemsObject <- PortfolioPlanGrade$new()
          itemsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          itemsObject
        })
      }
      if (!is.null(PortfolioPlanGradesObject$`portfolio`)) {
        portfolioObject <- Portfolio$new()
        portfolioObject$fromJSON(jsonlite::toJSON(PortfolioPlanGradesObject$portfolio, auto_unbox = TRUE))
        self$`portfolio` <- portfolioObject
      }
      if (!is.null(PortfolioPlanGradesObject$`details`)) {
        self$`details` <- lapply(PortfolioPlanGradesObject$`details`, function(x) {
          detailsObject <- PortfolioPlanGrades$new()
          detailsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          detailsObject
        })
      }
      if (!is.null(PortfolioPlanGradesObject$`gradingType`)) {
        gradingTypeObject <- GradingType$new()
        gradingTypeObject$fromJSON(jsonlite::toJSON(PortfolioPlanGradesObject$gradingType, auto_unbox = TRUE))
        self$`gradingType` <- gradingTypeObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "href": %s,
           "offset": %d,
           "limit": %d,
           "size": %d,
           "items": [%s],
           "portfolio": %s,
           "details": [%s],
           "gradingType": %s
        }',
        self$`href`,
        self$`offset`,
        self$`limit`,
        self$`size`,
        lapply(self$`items`, function(x) paste(x$toJSON(), sep=",")),
        self$`portfolio`$toJSON(),
        lapply(self$`details`, function(x) paste(x$toJSON(), sep=",")),
        self$`gradingType`$toJSON()
      )
    },
    fromJSONString = function(PortfolioPlanGradesJson) {
      PortfolioPlanGradesObject <- dlensFromJSON(PortfolioPlanGradesJson)
      self$`href` <- PortfolioPlanGradesObject$`href`
      self$`offset` <- PortfolioPlanGradesObject$`offset`
      self$`limit` <- PortfolioPlanGradesObject$`limit`
      self$`size` <- PortfolioPlanGradesObject$`size`
      self$`items` <- lapply(PortfolioPlanGradesObject$`items`, function(x) PortfolioPlanGrade$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      PortfolioObject <- Portfolio$new()
      self$`portfolio` <- PortfolioObject$fromJSON(jsonlite::toJSON(PortfolioPlanGradesObject$portfolio, auto_unbox = TRUE))
      self$`details` <- lapply(PortfolioPlanGradesObject$`details`, function(x) PortfolioPlanGrades$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      GradingTypeObject <- GradingType$new()
      self$`gradingType` <- GradingTypeObject$fromJSON(jsonlite::toJSON(PortfolioPlanGradesObject$gradingType, auto_unbox = TRUE))
    }
  )
)
