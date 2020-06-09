# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' CommentEditedMessagePayload Class
#'
#' @field comment 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CommentEditedMessagePayload <- R6::R6Class(
  'CommentEditedMessagePayload',
  public = list(
    `comment` = NULL,
    initialize = function(`comment`){
      if (!missing(`comment`)) {
        stopifnot(R6::is.R6(`comment`))
        self$`comment` <- `comment`
      }
    },
    toJSON = function() {
      CommentEditedMessagePayloadObject <- list()
      if (!is.null(self$`comment`)) {
        CommentEditedMessagePayloadObject[['comment']] <- self$`comment`$toJSON()
      }

      CommentEditedMessagePayloadObject
    },
    fromJSON = function(CommentEditedMessagePayloadJson) {
      CommentEditedMessagePayloadObject <- jsonlite::fromJSON(CommentEditedMessagePayloadJson)
      if (!is.null(CommentEditedMessagePayloadObject$`comment`)) {
        commentObject <- Comment$new()
        commentObject$fromJSON(jsonlite::toJSON(CommentEditedMessagePayloadObject$comment, auto_unbox = TRUE))
        self$`comment` <- commentObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "comment": %s
        }',
        self$`comment`$toJSON()
      )
    },
    fromJSONString = function(CommentEditedMessagePayloadJson) {
      CommentEditedMessagePayloadObject <- jsonlite::fromJSON(CommentEditedMessagePayloadJson)
      CommentObject <- Comment$new()
      self$`comment` <- CommentObject$fromJSON(jsonlite::toJSON(CommentEditedMessagePayloadObject$comment, auto_unbox = TRUE))
    }
  )
)
