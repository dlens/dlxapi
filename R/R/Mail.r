# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Mail Class
#'
#' @field from 
#' @field replyTo 
#' @field replyToDisplayName 
#' @field to 
#' @field cc 
#' @field bcc 
#' @field subject 
#' @field message 
#' @field templateName 
#' @field templateProperties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Mail <- R6::R6Class(
  'Mail',
  public = list(
    `from` = NULL,
    `replyTo` = NULL,
    `replyToDisplayName` = NULL,
    `to` = NULL,
    `cc` = NULL,
    `bcc` = NULL,
    `subject` = NULL,
    `message` = NULL,
    `templateName` = NULL,
    `templateProperties` = NULL,
    initialize = function(`from`, `replyTo`, `replyToDisplayName`, `to`, `cc`, `bcc`, `subject`, `message`, `templateName`, `templateProperties`){
      if (!missing(`from`)) {
        stopifnot(is.character(`from`), length(`from`) == 1)
        self$`from` <- `from`
      }
      if (!missing(`replyTo`)) {
        stopifnot(is.character(`replyTo`), length(`replyTo`) == 1)
        self$`replyTo` <- `replyTo`
      }
      if (!missing(`replyToDisplayName`)) {
        stopifnot(is.character(`replyToDisplayName`), length(`replyToDisplayName`) == 1)
        self$`replyToDisplayName` <- `replyToDisplayName`
      }
      if (!missing(`to`)) {
        stopifnot(is.list(`to`), length(`to`) != 0)
        lapply(`to`, function(x) stopifnot(is.character(x)))
        self$`to` <- `to`
      }
      if (!missing(`cc`)) {
        stopifnot(is.list(`cc`), length(`cc`) != 0)
        lapply(`cc`, function(x) stopifnot(is.character(x)))
        self$`cc` <- `cc`
      }
      if (!missing(`bcc`)) {
        stopifnot(is.list(`bcc`), length(`bcc`) != 0)
        lapply(`bcc`, function(x) stopifnot(is.character(x)))
        self$`bcc` <- `bcc`
      }
      if (!missing(`subject`)) {
        stopifnot(is.character(`subject`), length(`subject`) == 1)
        self$`subject` <- `subject`
      }
      if (!missing(`message`)) {
        stopifnot(is.character(`message`), length(`message`) == 1)
        self$`message` <- `message`
      }
      if (!missing(`templateName`)) {
        stopifnot(is.character(`templateName`), length(`templateName`) == 1)
        self$`templateName` <- `templateName`
      }
      if (!missing(`templateProperties`)) {
        stopifnot(is.list(`templateProperties`), length(`templateProperties`) != 0)
        lapply(`templateProperties`, function(x) stopifnot(R6::is.R6(x)))
        self$`templateProperties` <- `templateProperties`
      }
    },
    toJSON = function() {
      MailObject <- list()
      if (!is.null(self$`from`)) {
        MailObject[['from']] <- self$`from`
      }
      if (!is.null(self$`replyTo`)) {
        MailObject[['replyTo']] <- self$`replyTo`
      }
      if (!is.null(self$`replyToDisplayName`)) {
        MailObject[['replyToDisplayName']] <- self$`replyToDisplayName`
      }
      if (!is.null(self$`to`)) {
        MailObject[['to']] <- self$`to`
      }
      if (!is.null(self$`cc`)) {
        MailObject[['cc']] <- self$`cc`
      }
      if (!is.null(self$`bcc`)) {
        MailObject[['bcc']] <- self$`bcc`
      }
      if (!is.null(self$`subject`)) {
        MailObject[['subject']] <- self$`subject`
      }
      if (!is.null(self$`message`)) {
        MailObject[['message']] <- self$`message`
      }
      if (!is.null(self$`templateName`)) {
        MailObject[['templateName']] <- self$`templateName`
      }
      if (!is.null(self$`templateProperties`)) {
        MailObject[['templateProperties']] <- lapply(self$`templateProperties`, function(x) x$toJSON())
      }

      MailObject
    },
    fromJSON = function(MailJson) {
      MailObject <- dlensFromJSON(MailJson)
      if (!is.null(MailObject$`from`)) {
        self$`from` <- MailObject$`from`
      }
      if (!is.null(MailObject$`replyTo`)) {
        self$`replyTo` <- MailObject$`replyTo`
      }
      if (!is.null(MailObject$`replyToDisplayName`)) {
        self$`replyToDisplayName` <- MailObject$`replyToDisplayName`
      }
      if (!is.null(MailObject$`to`)) {
        self$`to` <- MailObject$`to`
      }
      if (!is.null(MailObject$`cc`)) {
        self$`cc` <- MailObject$`cc`
      }
      if (!is.null(MailObject$`bcc`)) {
        self$`bcc` <- MailObject$`bcc`
      }
      if (!is.null(MailObject$`subject`)) {
        self$`subject` <- MailObject$`subject`
      }
      if (!is.null(MailObject$`message`)) {
        self$`message` <- MailObject$`message`
      }
      if (!is.null(MailObject$`templateName`)) {
        self$`templateName` <- MailObject$`templateName`
      }
      if (!is.null(MailObject$`templateProperties`)) {
        self$`templateProperties` <- lapply(MailObject$`templateProperties`, function(x) {
          templatePropertiesObject <- TemplateProperty$new()
          templatePropertiesObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          templatePropertiesObject
        })
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "from": %s,
           "replyTo": %s,
           "replyToDisplayName": %s,
           "to": [%s],
           "cc": [%s],
           "bcc": [%s],
           "subject": %s,
           "message": %s,
           "templateName": %s,
           "templateProperties": [%s]
        }',
        self$`from`,
        self$`replyTo`,
        self$`replyToDisplayName`,
        lapply(self$`to`, function(x) paste(paste0('"', x, '"'), sep=",")),
        lapply(self$`cc`, function(x) paste(paste0('"', x, '"'), sep=",")),
        lapply(self$`bcc`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`subject`,
        self$`message`,
        self$`templateName`,
        lapply(self$`templateProperties`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(MailJson) {
      MailObject <- dlensFromJSON(MailJson)
      self$`from` <- MailObject$`from`
      self$`replyTo` <- MailObject$`replyTo`
      self$`replyToDisplayName` <- MailObject$`replyToDisplayName`
      self$`to` <- MailObject$`to`
      self$`cc` <- MailObject$`cc`
      self$`bcc` <- MailObject$`bcc`
      self$`subject` <- MailObject$`subject`
      self$`message` <- MailObject$`message`
      self$`templateName` <- MailObject$`templateName`
      self$`templateProperties` <- lapply(MailObject$`templateProperties`, function(x) TemplateProperty$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
