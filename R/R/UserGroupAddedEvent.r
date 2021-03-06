# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' UserGroupAddedEvent Class
#'
#' @field id 
#' @field user 
#' @field addedByUser 
#' @field groupId 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UserGroupAddedEvent <- R6::R6Class(
  'UserGroupAddedEvent',
  public = list(
    `id` = NULL,
    `user` = NULL,
    `addedByUser` = NULL,
    `groupId` = NULL,
    initialize = function(`id`, `user`, `addedByUser`, `groupId`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`user`)) {
        stopifnot(R6::is.R6(`user`))
        self$`user` <- `user`
      }
      if (!missing(`addedByUser`)) {
        stopifnot(R6::is.R6(`addedByUser`))
        self$`addedByUser` <- `addedByUser`
      }
      if (!missing(`groupId`)) {
        stopifnot(is.character(`groupId`), length(`groupId`) == 1)
        self$`groupId` <- `groupId`
      }
    },
    toJSON = function() {
      UserGroupAddedEventObject <- list()
      if (!is.null(self$`id`)) {
        UserGroupAddedEventObject[['id']] <- self$`id`
      }
      if (!is.null(self$`user`)) {
        UserGroupAddedEventObject[['user']] <- self$`user`$toJSON()
      }
      if (!is.null(self$`addedByUser`)) {
        UserGroupAddedEventObject[['addedByUser']] <- self$`addedByUser`$toJSON()
      }
      if (!is.null(self$`groupId`)) {
        UserGroupAddedEventObject[['groupId']] <- self$`groupId`
      }

      UserGroupAddedEventObject
    },
    fromJSON = function(UserGroupAddedEventJson) {
      UserGroupAddedEventObject <- dlensFromJSON(UserGroupAddedEventJson)
      if (!is.null(UserGroupAddedEventObject$`id`)) {
        self$`id` <- UserGroupAddedEventObject$`id`
      }
      if (!is.null(UserGroupAddedEventObject$`user`)) {
        userObject <- User$new()
        userObject$fromJSON(jsonlite::toJSON(UserGroupAddedEventObject$user, auto_unbox = TRUE))
        self$`user` <- userObject
      }
      if (!is.null(UserGroupAddedEventObject$`addedByUser`)) {
        addedByUserObject <- User$new()
        addedByUserObject$fromJSON(jsonlite::toJSON(UserGroupAddedEventObject$addedByUser, auto_unbox = TRUE))
        self$`addedByUser` <- addedByUserObject
      }
      if (!is.null(UserGroupAddedEventObject$`groupId`)) {
        self$`groupId` <- UserGroupAddedEventObject$`groupId`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "user": %s,
           "addedByUser": %s,
           "groupId": %s
        }',
        self$`id`,
        self$`user`$toJSON(),
        self$`addedByUser`$toJSON(),
        self$`groupId`
      )
    },
    fromJSONString = function(UserGroupAddedEventJson) {
      UserGroupAddedEventObject <- dlensFromJSON(UserGroupAddedEventJson)
      self$`id` <- UserGroupAddedEventObject$`id`
      UserObject <- User$new()
      self$`user` <- UserObject$fromJSON(jsonlite::toJSON(UserGroupAddedEventObject$user, auto_unbox = TRUE))
      UserObject <- User$new()
      self$`addedByUser` <- UserObject$fromJSON(jsonlite::toJSON(UserGroupAddedEventObject$addedByUser, auto_unbox = TRUE))
      self$`groupId` <- UserGroupAddedEventObject$`groupId`
    }
  )
)
