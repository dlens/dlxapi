# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Comment Class
#'
#' @field href 
#' @field id 
#' @field createdAt 
#' @field modifiedAt 
#' @field portfolioId 
#' @field projectId 
#' @field user 
#' @field value 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Comment <- R6::R6Class(
  'Comment',
  public = list(
    `href` = NULL,
    `id` = NULL,
    `createdAt` = NULL,
    `modifiedAt` = NULL,
    `portfolioId` = NULL,
    `projectId` = NULL,
    `user` = NULL,
    `value` = NULL,
    initialize = function(`href`, `id`, `createdAt`, `modifiedAt`, `portfolioId`, `projectId`, `user`, `value`){
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
      if (!missing(`portfolioId`)) {
        stopifnot(is.character(`portfolioId`), length(`portfolioId`) == 1)
        self$`portfolioId` <- `portfolioId`
      }
      if (!missing(`projectId`)) {
        stopifnot(is.character(`projectId`), length(`projectId`) == 1)
        self$`projectId` <- `projectId`
      }
      if (!missing(`user`)) {
        stopifnot(R6::is.R6(`user`))
        self$`user` <- `user`
      }
      if (!missing(`value`)) {
        stopifnot(is.character(`value`), length(`value`) == 1)
        self$`value` <- `value`
      }
    },
    toJSON = function() {
      CommentObject <- list()
      if (!is.null(self$`href`)) {
        CommentObject[['href']] <- self$`href`
      }
      if (!is.null(self$`id`)) {
        CommentObject[['id']] <- self$`id`
      }
      if (!is.null(self$`createdAt`)) {
        CommentObject[['createdAt']] <- self$`createdAt`
      }
      if (!is.null(self$`modifiedAt`)) {
        CommentObject[['modifiedAt']] <- self$`modifiedAt`
      }
      if (!is.null(self$`portfolioId`)) {
        CommentObject[['portfolioId']] <- self$`portfolioId`
      }
      if (!is.null(self$`projectId`)) {
        CommentObject[['projectId']] <- self$`projectId`
      }
      if (!is.null(self$`user`)) {
        CommentObject[['user']] <- self$`user`$toJSON()
      }
      if (!is.null(self$`value`)) {
        CommentObject[['value']] <- self$`value`
      }

      CommentObject
    },
    fromJSON = function(CommentJson) {
      CommentObject <- dlensFromJSON(CommentJson)
      if (!is.null(CommentObject$`href`)) {
        self$`href` <- CommentObject$`href`
      }
      if (!is.null(CommentObject$`id`)) {
        self$`id` <- CommentObject$`id`
      }
      if (!is.null(CommentObject$`createdAt`)) {
        self$`createdAt` <- CommentObject$`createdAt`
      }
      if (!is.null(CommentObject$`modifiedAt`)) {
        self$`modifiedAt` <- CommentObject$`modifiedAt`
      }
      if (!is.null(CommentObject$`portfolioId`)) {
        self$`portfolioId` <- CommentObject$`portfolioId`
      }
      if (!is.null(CommentObject$`projectId`)) {
        self$`projectId` <- CommentObject$`projectId`
      }
      if (!is.null(CommentObject$`user`)) {
        userObject <- User$new()
        userObject$fromJSON(jsonlite::toJSON(CommentObject$user, auto_unbox = TRUE))
        self$`user` <- userObject
      }
      if (!is.null(CommentObject$`value`)) {
        self$`value` <- CommentObject$`value`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "href": %s,
           "id": %s,
           "createdAt": %s,
           "modifiedAt": %s,
           "portfolioId": %s,
           "projectId": %s,
           "user": %s,
           "value": %s
        }',
        self$`href`,
        self$`id`,
        self$`createdAt`,
        self$`modifiedAt`,
        self$`portfolioId`,
        self$`projectId`,
        self$`user`$toJSON(),
        self$`value`
      )
    },
    fromJSONString = function(CommentJson) {
      CommentObject <- dlensFromJSON(CommentJson)
      self$`href` <- CommentObject$`href`
      self$`id` <- CommentObject$`id`
      self$`createdAt` <- CommentObject$`createdAt`
      self$`modifiedAt` <- CommentObject$`modifiedAt`
      self$`portfolioId` <- CommentObject$`portfolioId`
      self$`projectId` <- CommentObject$`projectId`
      UserObject <- User$new()
      self$`user` <- UserObject$fromJSON(jsonlite::toJSON(CommentObject$user, auto_unbox = TRUE))
      self$`value` <- CommentObject$`value`
    }
  )
)
