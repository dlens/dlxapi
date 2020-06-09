# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' UserRegistrationToken Class
#'
#' @field portfolioId 
#' @field group 
#' @field role 
#' @field expiresAt 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UserRegistrationToken <- R6::R6Class(
  'UserRegistrationToken',
  public = list(
    `portfolioId` = NULL,
    `group` = NULL,
    `role` = NULL,
    `expiresAt` = NULL,
    initialize = function(`portfolioId`, `group`, `role`, `expiresAt`){
      if (!missing(`portfolioId`)) {
        stopifnot(is.character(`portfolioId`), length(`portfolioId`) == 1)
        self$`portfolioId` <- `portfolioId`
      }
      if (!missing(`group`)) {
        stopifnot(R6::is.R6(`group`))
        self$`group` <- `group`
      }
      if (!missing(`role`)) {
        stopifnot(R6::is.R6(`role`))
        self$`role` <- `role`
      }
      if (!missing(`expiresAt`)) {
        stopifnot(is.numeric(`expiresAt`), length(`expiresAt`) == 1)
        self$`expiresAt` <- `expiresAt`
      }
    },
    toJSON = function() {
      UserRegistrationTokenObject <- list()
      if (!is.null(self$`portfolioId`)) {
        UserRegistrationTokenObject[['portfolioId']] <- self$`portfolioId`
      }
      if (!is.null(self$`group`)) {
        UserRegistrationTokenObject[['group']] <- self$`group`$toJSON()
      }
      if (!is.null(self$`role`)) {
        UserRegistrationTokenObject[['role']] <- self$`role`$toJSON()
      }
      if (!is.null(self$`expiresAt`)) {
        UserRegistrationTokenObject[['expiresAt']] <- self$`expiresAt`
      }

      UserRegistrationTokenObject
    },
    fromJSON = function(UserRegistrationTokenJson) {
      UserRegistrationTokenObject <- jsonlite::fromJSON(UserRegistrationTokenJson)
      if (!is.null(UserRegistrationTokenObject$`portfolioId`)) {
        self$`portfolioId` <- UserRegistrationTokenObject$`portfolioId`
      }
      if (!is.null(UserRegistrationTokenObject$`group`)) {
        groupObject <- Group$new()
        groupObject$fromJSON(jsonlite::toJSON(UserRegistrationTokenObject$group, auto_unbox = TRUE))
        self$`group` <- groupObject
      }
      if (!is.null(UserRegistrationTokenObject$`role`)) {
        roleObject <- PortfolioPlanUserRole$new()
        roleObject$fromJSON(jsonlite::toJSON(UserRegistrationTokenObject$role, auto_unbox = TRUE))
        self$`role` <- roleObject
      }
      if (!is.null(UserRegistrationTokenObject$`expiresAt`)) {
        self$`expiresAt` <- UserRegistrationTokenObject$`expiresAt`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "portfolioId": %s,
           "group": %s,
           "role": %s,
           "expiresAt": %d
        }',
        self$`portfolioId`,
        self$`group`$toJSON(),
        self$`role`$toJSON(),
        self$`expiresAt`
      )
    },
    fromJSONString = function(UserRegistrationTokenJson) {
      UserRegistrationTokenObject <- jsonlite::fromJSON(UserRegistrationTokenJson)
      self$`portfolioId` <- UserRegistrationTokenObject$`portfolioId`
      GroupObject <- Group$new()
      self$`group` <- GroupObject$fromJSON(jsonlite::toJSON(UserRegistrationTokenObject$group, auto_unbox = TRUE))
      PortfolioPlanUserRoleObject <- PortfolioPlanUserRole$new()
      self$`role` <- PortfolioPlanUserRoleObject$fromJSON(jsonlite::toJSON(UserRegistrationTokenObject$role, auto_unbox = TRUE))
      self$`expiresAt` <- UserRegistrationTokenObject$`expiresAt`
    }
  )
)
