# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' NotificationsMessagePayload Class
#'
#' @field activities 
#' @field portfolioId 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
NotificationsMessagePayload <- R6::R6Class(
  'NotificationsMessagePayload',
  public = list(
    `activities` = NULL,
    `portfolioId` = NULL,
    initialize = function(`activities`, `portfolioId`){
      if (!missing(`activities`)) {
        stopifnot(is.list(`activities`), length(`activities`) != 0)
        lapply(`activities`, function(x) stopifnot(R6::is.R6(x)))
        self$`activities` <- `activities`
      }
      if (!missing(`portfolioId`)) {
        stopifnot(is.character(`portfolioId`), length(`portfolioId`) == 1)
        self$`portfolioId` <- `portfolioId`
      }
    },
    toJSON = function() {
      NotificationsMessagePayloadObject <- list()
      if (!is.null(self$`activities`)) {
        NotificationsMessagePayloadObject[['activities']] <- lapply(self$`activities`, function(x) x$toJSON())
      }
      if (!is.null(self$`portfolioId`)) {
        NotificationsMessagePayloadObject[['portfolioId']] <- self$`portfolioId`
      }

      NotificationsMessagePayloadObject
    },
    fromJSON = function(NotificationsMessagePayloadJson) {
      NotificationsMessagePayloadObject <- dlensFromJSON(NotificationsMessagePayloadJson)
      if (!is.null(NotificationsMessagePayloadObject$`activities`)) {
        self$`activities` <- lapply(NotificationsMessagePayloadObject$`activities`, function(x) {
          activitiesObject <- Activity$new()
          activitiesObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          activitiesObject
        })
      }
      if (!is.null(NotificationsMessagePayloadObject$`portfolioId`)) {
        self$`portfolioId` <- NotificationsMessagePayloadObject$`portfolioId`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "activities": [%s],
           "portfolioId": %s
        }',
        lapply(self$`activities`, function(x) paste(x$toJSON(), sep=",")),
        self$`portfolioId`
      )
    },
    fromJSONString = function(NotificationsMessagePayloadJson) {
      NotificationsMessagePayloadObject <- dlensFromJSON(NotificationsMessagePayloadJson)
      self$`activities` <- lapply(NotificationsMessagePayloadObject$`activities`, function(x) Activity$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`portfolioId` <- NotificationsMessagePayloadObject$`portfolioId`
    }
  )
)
