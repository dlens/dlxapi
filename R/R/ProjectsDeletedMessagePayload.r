# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ProjectsDeletedMessagePayload Class
#'
#' @field projects 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProjectsDeletedMessagePayload <- R6::R6Class(
  'ProjectsDeletedMessagePayload',
  public = list(
    `projects` = NULL,
    initialize = function(`projects`){
      if (!missing(`projects`)) {
        stopifnot(is.list(`projects`), length(`projects`) != 0)
        lapply(`projects`, function(x) stopifnot(R6::is.R6(x)))
        self$`projects` <- `projects`
      }
    },
    toJSON = function() {
      ProjectsDeletedMessagePayloadObject <- list()
      if (!is.null(self$`projects`)) {
        ProjectsDeletedMessagePayloadObject[['projects']] <- lapply(self$`projects`, function(x) x$toJSON())
      }

      ProjectsDeletedMessagePayloadObject
    },
    fromJSON = function(ProjectsDeletedMessagePayloadJson) {
      ProjectsDeletedMessagePayloadObject <- jsonlite::fromJSON(ProjectsDeletedMessagePayloadJson)
      if (!is.null(ProjectsDeletedMessagePayloadObject$`projects`)) {
        self$`projects` <- lapply(ProjectsDeletedMessagePayloadObject$`projects`, function(x) {
          projectsObject <- Project$new()
          projectsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          projectsObject
        })
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "projects": [%s]
        }',
        lapply(self$`projects`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(ProjectsDeletedMessagePayloadJson) {
      ProjectsDeletedMessagePayloadObject <- jsonlite::fromJSON(ProjectsDeletedMessagePayloadJson)
      self$`projects` <- lapply(ProjectsDeletedMessagePayloadObject$`projects`, function(x) Project$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
