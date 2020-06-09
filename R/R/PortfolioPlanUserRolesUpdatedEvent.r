# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' PortfolioPlanUserRolesUpdatedEvent Class
#'
#' @field id 
#' @field portfolioPlan 
#' @field user 
#' @field roles 
#' @field previousRoles 
#' @field portfolioId 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PortfolioPlanUserRolesUpdatedEvent <- R6::R6Class(
  'PortfolioPlanUserRolesUpdatedEvent',
  public = list(
    `id` = NULL,
    `portfolioPlan` = NULL,
    `user` = NULL,
    `roles` = NULL,
    `previousRoles` = NULL,
    `portfolioId` = NULL,
    initialize = function(`id`, `portfolioPlan`, `user`, `roles`, `previousRoles`, `portfolioId`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`portfolioPlan`)) {
        stopifnot(R6::is.R6(`portfolioPlan`))
        self$`portfolioPlan` <- `portfolioPlan`
      }
      if (!missing(`user`)) {
        stopifnot(R6::is.R6(`user`))
        self$`user` <- `user`
      }
      if (!missing(`roles`)) {
        stopifnot(is.list(`roles`), length(`roles`) != 0)
        lapply(`roles`, function(x) stopifnot(R6::is.R6(x)))
        self$`roles` <- `roles`
      }
      if (!missing(`previousRoles`)) {
        stopifnot(is.list(`previousRoles`), length(`previousRoles`) != 0)
        lapply(`previousRoles`, function(x) stopifnot(R6::is.R6(x)))
        self$`previousRoles` <- `previousRoles`
      }
      if (!missing(`portfolioId`)) {
        stopifnot(is.character(`portfolioId`), length(`portfolioId`) == 1)
        self$`portfolioId` <- `portfolioId`
      }
    },
    toJSON = function() {
      PortfolioPlanUserRolesUpdatedEventObject <- list()
      if (!is.null(self$`id`)) {
        PortfolioPlanUserRolesUpdatedEventObject[['id']] <- self$`id`
      }
      if (!is.null(self$`portfolioPlan`)) {
        PortfolioPlanUserRolesUpdatedEventObject[['portfolioPlan']] <- self$`portfolioPlan`$toJSON()
      }
      if (!is.null(self$`user`)) {
        PortfolioPlanUserRolesUpdatedEventObject[['user']] <- self$`user`$toJSON()
      }
      if (!is.null(self$`roles`)) {
        PortfolioPlanUserRolesUpdatedEventObject[['roles']] <- lapply(self$`roles`, function(x) x$toJSON())
      }
      if (!is.null(self$`previousRoles`)) {
        PortfolioPlanUserRolesUpdatedEventObject[['previousRoles']] <- lapply(self$`previousRoles`, function(x) x$toJSON())
      }
      if (!is.null(self$`portfolioId`)) {
        PortfolioPlanUserRolesUpdatedEventObject[['portfolioId']] <- self$`portfolioId`
      }

      PortfolioPlanUserRolesUpdatedEventObject
    },
    fromJSON = function(PortfolioPlanUserRolesUpdatedEventJson) {
      PortfolioPlanUserRolesUpdatedEventObject <- jsonlite::fromJSON(PortfolioPlanUserRolesUpdatedEventJson)
      if (!is.null(PortfolioPlanUserRolesUpdatedEventObject$`id`)) {
        self$`id` <- PortfolioPlanUserRolesUpdatedEventObject$`id`
      }
      if (!is.null(PortfolioPlanUserRolesUpdatedEventObject$`portfolioPlan`)) {
        portfolioPlanObject <- PortfolioPlan$new()
        portfolioPlanObject$fromJSON(jsonlite::toJSON(PortfolioPlanUserRolesUpdatedEventObject$portfolioPlan, auto_unbox = TRUE))
        self$`portfolioPlan` <- portfolioPlanObject
      }
      if (!is.null(PortfolioPlanUserRolesUpdatedEventObject$`user`)) {
        userObject <- User$new()
        userObject$fromJSON(jsonlite::toJSON(PortfolioPlanUserRolesUpdatedEventObject$user, auto_unbox = TRUE))
        self$`user` <- userObject
      }
      if (!is.null(PortfolioPlanUserRolesUpdatedEventObject$`roles`)) {
        self$`roles` <- lapply(PortfolioPlanUserRolesUpdatedEventObject$`roles`, function(x) {
          rolesObject <- PortfolioPlanUserRole$new()
          rolesObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          rolesObject
        })
      }
      if (!is.null(PortfolioPlanUserRolesUpdatedEventObject$`previousRoles`)) {
        self$`previousRoles` <- lapply(PortfolioPlanUserRolesUpdatedEventObject$`previousRoles`, function(x) {
          previousRolesObject <- PortfolioPlanUserRole$new()
          previousRolesObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          previousRolesObject
        })
      }
      if (!is.null(PortfolioPlanUserRolesUpdatedEventObject$`portfolioId`)) {
        self$`portfolioId` <- PortfolioPlanUserRolesUpdatedEventObject$`portfolioId`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "portfolioPlan": %s,
           "user": %s,
           "roles": [%s],
           "previousRoles": [%s],
           "portfolioId": %s
        }',
        self$`id`,
        self$`portfolioPlan`$toJSON(),
        self$`user`$toJSON(),
        lapply(self$`roles`, function(x) paste(x$toJSON(), sep=",")),
        lapply(self$`previousRoles`, function(x) paste(x$toJSON(), sep=",")),
        self$`portfolioId`
      )
    },
    fromJSONString = function(PortfolioPlanUserRolesUpdatedEventJson) {
      PortfolioPlanUserRolesUpdatedEventObject <- jsonlite::fromJSON(PortfolioPlanUserRolesUpdatedEventJson)
      self$`id` <- PortfolioPlanUserRolesUpdatedEventObject$`id`
      PortfolioPlanObject <- PortfolioPlan$new()
      self$`portfolioPlan` <- PortfolioPlanObject$fromJSON(jsonlite::toJSON(PortfolioPlanUserRolesUpdatedEventObject$portfolioPlan, auto_unbox = TRUE))
      UserObject <- User$new()
      self$`user` <- UserObject$fromJSON(jsonlite::toJSON(PortfolioPlanUserRolesUpdatedEventObject$user, auto_unbox = TRUE))
      self$`roles` <- lapply(PortfolioPlanUserRolesUpdatedEventObject$`roles`, function(x) PortfolioPlanUserRole$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`previousRoles` <- lapply(PortfolioPlanUserRolesUpdatedEventObject$`previousRoles`, function(x) PortfolioPlanUserRole$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`portfolioId` <- PortfolioPlanUserRolesUpdatedEventObject$`portfolioId`
    }
  )
)
