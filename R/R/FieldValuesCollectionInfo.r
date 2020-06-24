# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' FieldValuesCollectionInfo Class
#'
#' @field hasDuplicateValues 
#' @field hasBlankValues 
#' @field totalValue 
#' @field balanceUniquenessExceeded 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FieldValuesCollectionInfo <- R6::R6Class(
  'FieldValuesCollectionInfo',
  public = list(
    `hasDuplicateValues` = NULL,
    `hasBlankValues` = NULL,
    `totalValue` = NULL,
    `balanceUniquenessExceeded` = NULL,
    initialize = function(`hasDuplicateValues`, `hasBlankValues`, `totalValue`, `balanceUniquenessExceeded`){
      if (!missing(`hasDuplicateValues`)) {
        self$`hasDuplicateValues` <- `hasDuplicateValues`
      }
      if (!missing(`hasBlankValues`)) {
        self$`hasBlankValues` <- `hasBlankValues`
      }
      if (!missing(`totalValue`)) {
        stopifnot(is.numeric(`totalValue`), length(`totalValue`) == 1)
        self$`totalValue` <- `totalValue`
      }
      if (!missing(`balanceUniquenessExceeded`)) {
        self$`balanceUniquenessExceeded` <- `balanceUniquenessExceeded`
      }
    },
    toJSON = function() {
      FieldValuesCollectionInfoObject <- list()
      if (!is.null(self$`hasDuplicateValues`)) {
        FieldValuesCollectionInfoObject[['hasDuplicateValues']] <- self$`hasDuplicateValues`
      }
      if (!is.null(self$`hasBlankValues`)) {
        FieldValuesCollectionInfoObject[['hasBlankValues']] <- self$`hasBlankValues`
      }
      if (!is.null(self$`totalValue`)) {
        FieldValuesCollectionInfoObject[['totalValue']] <- self$`totalValue`
      }
      if (!is.null(self$`balanceUniquenessExceeded`)) {
        FieldValuesCollectionInfoObject[['balanceUniquenessExceeded']] <- self$`balanceUniquenessExceeded`
      }

      FieldValuesCollectionInfoObject
    },
    fromJSON = function(FieldValuesCollectionInfoJson) {
      FieldValuesCollectionInfoObject <- dlensFromJSON(FieldValuesCollectionInfoJson)
      if (!is.null(FieldValuesCollectionInfoObject$`hasDuplicateValues`)) {
        self$`hasDuplicateValues` <- FieldValuesCollectionInfoObject$`hasDuplicateValues`
      }
      if (!is.null(FieldValuesCollectionInfoObject$`hasBlankValues`)) {
        self$`hasBlankValues` <- FieldValuesCollectionInfoObject$`hasBlankValues`
      }
      if (!is.null(FieldValuesCollectionInfoObject$`totalValue`)) {
        self$`totalValue` <- FieldValuesCollectionInfoObject$`totalValue`
      }
      if (!is.null(FieldValuesCollectionInfoObject$`balanceUniquenessExceeded`)) {
        self$`balanceUniquenessExceeded` <- FieldValuesCollectionInfoObject$`balanceUniquenessExceeded`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "hasDuplicateValues": %s,
           "hasBlankValues": %s,
           "totalValue": %d,
           "balanceUniquenessExceeded": %s
        }',
        self$`hasDuplicateValues`,
        self$`hasBlankValues`,
        self$`totalValue`,
        self$`balanceUniquenessExceeded`
      )
    },
    fromJSONString = function(FieldValuesCollectionInfoJson) {
      FieldValuesCollectionInfoObject <- dlensFromJSON(FieldValuesCollectionInfoJson)
      self$`hasDuplicateValues` <- FieldValuesCollectionInfoObject$`hasDuplicateValues`
      self$`hasBlankValues` <- FieldValuesCollectionInfoObject$`hasBlankValues`
      self$`totalValue` <- FieldValuesCollectionInfoObject$`totalValue`
      self$`balanceUniquenessExceeded` <- FieldValuesCollectionInfoObject$`balanceUniquenessExceeded`
    }
  )
)
