# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' PortfolioUpdatedMessagePayload Class
#'
#' @field portfolio 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PortfolioUpdatedMessagePayload <- R6::R6Class(
  'PortfolioUpdatedMessagePayload',
  public = list(
    `portfolio` = NULL,
    initialize = function(`portfolio`){
      if (!missing(`portfolio`)) {
        stopifnot(R6::is.R6(`portfolio`))
        self$`portfolio` <- `portfolio`
      }
    },
    toJSON = function() {
      PortfolioUpdatedMessagePayloadObject <- list()
      if (!is.null(self$`portfolio`)) {
        PortfolioUpdatedMessagePayloadObject[['portfolio']] <- self$`portfolio`$toJSON()
      }

      PortfolioUpdatedMessagePayloadObject
    },
    fromJSON = function(PortfolioUpdatedMessagePayloadJson) {
      PortfolioUpdatedMessagePayloadObject <- dlensFromJSON(PortfolioUpdatedMessagePayloadJson)
      if (!is.null(PortfolioUpdatedMessagePayloadObject$`portfolio`)) {
        portfolioObject <- Portfolio$new()
        portfolioObject$fromJSON(jsonlite::toJSON(PortfolioUpdatedMessagePayloadObject$portfolio, auto_unbox = TRUE))
        self$`portfolio` <- portfolioObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "portfolio": %s
        }',
        self$`portfolio`$toJSON()
      )
    },
    fromJSONString = function(PortfolioUpdatedMessagePayloadJson) {
      PortfolioUpdatedMessagePayloadObject <- dlensFromJSON(PortfolioUpdatedMessagePayloadJson)
      PortfolioObject <- Portfolio$new()
      self$`portfolio` <- PortfolioObject$fromJSON(jsonlite::toJSON(PortfolioUpdatedMessagePayloadObject$portfolio, auto_unbox = TRUE))
    }
  )
)
