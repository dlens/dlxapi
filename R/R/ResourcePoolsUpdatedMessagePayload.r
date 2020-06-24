# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ResourcePoolsUpdatedMessagePayload Class
#'
#' @field resourcePools 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ResourcePoolsUpdatedMessagePayload <- R6::R6Class(
  'ResourcePoolsUpdatedMessagePayload',
  public = list(
    `resourcePools` = NULL,
    initialize = function(`resourcePools`){
      if (!missing(`resourcePools`)) {
        stopifnot(is.list(`resourcePools`), length(`resourcePools`) != 0)
        lapply(`resourcePools`, function(x) stopifnot(R6::is.R6(x)))
        self$`resourcePools` <- `resourcePools`
      }
    },
    toJSON = function() {
      ResourcePoolsUpdatedMessagePayloadObject <- list()
      if (!is.null(self$`resourcePools`)) {
        ResourcePoolsUpdatedMessagePayloadObject[['resourcePools']] <- lapply(self$`resourcePools`, function(x) x$toJSON())
      }

      ResourcePoolsUpdatedMessagePayloadObject
    },
    fromJSON = function(ResourcePoolsUpdatedMessagePayloadJson) {
      ResourcePoolsUpdatedMessagePayloadObject <- dlensFromJSON(ResourcePoolsUpdatedMessagePayloadJson)
      if (!is.null(ResourcePoolsUpdatedMessagePayloadObject$`resourcePools`)) {
        self$`resourcePools` <- lapply(ResourcePoolsUpdatedMessagePayloadObject$`resourcePools`, function(x) {
          resourcePoolsObject <- ResourcePool$new()
          resourcePoolsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          resourcePoolsObject
        })
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "resourcePools": [%s]
        }',
        lapply(self$`resourcePools`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(ResourcePoolsUpdatedMessagePayloadJson) {
      ResourcePoolsUpdatedMessagePayloadObject <- dlensFromJSON(ResourcePoolsUpdatedMessagePayloadJson)
      self$`resourcePools` <- lapply(ResourcePoolsUpdatedMessagePayloadObject$`resourcePools`, function(x) ResourcePool$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
