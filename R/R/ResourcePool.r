# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ResourcePool Class
#'
#' @field href 
#' @field id 
#' @field createdAt 
#' @field modifiedAt 
#' @field name 
#' @field budgetAmounts 
#' @field field 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ResourcePool <- R6::R6Class(
  'ResourcePool',
  public = list(
    `href` = NULL,
    `id` = NULL,
    `createdAt` = NULL,
    `modifiedAt` = NULL,
    `name` = NULL,
    `budgetAmounts` = NULL,
    `field` = NULL,
    initialize = function(`href`, `id`, `createdAt`, `modifiedAt`, `name`, `budgetAmounts`, `field`){
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
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`budgetAmounts`)) {
        stopifnot(R6::is.R6(`budgetAmounts`))
        self$`budgetAmounts` <- `budgetAmounts`
      }
      if (!missing(`field`)) {
        stopifnot(R6::is.R6(`field`))
        self$`field` <- `field`
      }
    },
    toJSON = function() {
      ResourcePoolObject <- list()
      if (!is.null(self$`href`)) {
        ResourcePoolObject[['href']] <- self$`href`
      }
      if (!is.null(self$`id`)) {
        ResourcePoolObject[['id']] <- self$`id`
      }
      if (!is.null(self$`createdAt`)) {
        ResourcePoolObject[['createdAt']] <- self$`createdAt`
      }
      if (!is.null(self$`modifiedAt`)) {
        ResourcePoolObject[['modifiedAt']] <- self$`modifiedAt`
      }
      if (!is.null(self$`name`)) {
        ResourcePoolObject[['name']] <- self$`name`
      }
      if (!is.null(self$`budgetAmounts`)) {
        ResourcePoolObject[['budgetAmounts']] <- self$`budgetAmounts`$toJSON()
      }
      if (!is.null(self$`field`)) {
        ResourcePoolObject[['field']] <- self$`field`$toJSON()
      }

      ResourcePoolObject
    },
    fromJSON = function(ResourcePoolJson) {
      ResourcePoolObject <- dlensFromJSON(ResourcePoolJson)
      if (!is.null(ResourcePoolObject$`href`)) {
        self$`href` <- ResourcePoolObject$`href`
      }
      if (!is.null(ResourcePoolObject$`id`)) {
        self$`id` <- ResourcePoolObject$`id`
      }
      if (!is.null(ResourcePoolObject$`createdAt`)) {
        self$`createdAt` <- ResourcePoolObject$`createdAt`
      }
      if (!is.null(ResourcePoolObject$`modifiedAt`)) {
        self$`modifiedAt` <- ResourcePoolObject$`modifiedAt`
      }
      if (!is.null(ResourcePoolObject$`name`)) {
        self$`name` <- ResourcePoolObject$`name`
      }
      if (!is.null(ResourcePoolObject$`budgetAmounts`)) {
        budgetAmountsObject <- ResourcePoolBudgetAmounts$new()
        budgetAmountsObject$fromJSON(jsonlite::toJSON(ResourcePoolObject$budgetAmounts, auto_unbox = TRUE))
        self$`budgetAmounts` <- budgetAmountsObject
      }
      if (!is.null(ResourcePoolObject$`field`)) {
        fieldObject <- Field$new()
        fieldObject$fromJSON(jsonlite::toJSON(ResourcePoolObject$field, auto_unbox = TRUE))
        self$`field` <- fieldObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "href": %s,
           "id": %s,
           "createdAt": %s,
           "modifiedAt": %s,
           "name": %s,
           "budgetAmounts": %s,
           "field": %s
        }',
        self$`href`,
        self$`id`,
        self$`createdAt`,
        self$`modifiedAt`,
        self$`name`,
        self$`budgetAmounts`$toJSON(),
        self$`field`$toJSON()
      )
    },
    fromJSONString = function(ResourcePoolJson) {
      ResourcePoolObject <- dlensFromJSON(ResourcePoolJson)
      self$`href` <- ResourcePoolObject$`href`
      self$`id` <- ResourcePoolObject$`id`
      self$`createdAt` <- ResourcePoolObject$`createdAt`
      self$`modifiedAt` <- ResourcePoolObject$`modifiedAt`
      self$`name` <- ResourcePoolObject$`name`
      ResourcePoolBudgetAmountsObject <- ResourcePoolBudgetAmounts$new()
      self$`budgetAmounts` <- ResourcePoolBudgetAmountsObject$fromJSON(jsonlite::toJSON(ResourcePoolObject$budgetAmounts, auto_unbox = TRUE))
      FieldObject <- Field$new()
      self$`field` <- FieldObject$fromJSON(jsonlite::toJSON(ResourcePoolObject$field, auto_unbox = TRUE))
    }
  )
)
