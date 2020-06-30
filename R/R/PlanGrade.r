# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' PlanGrade Class
#'
#' @field href 
#' @field id 
#' @field createdAt 
#' @field modifiedAt 
#' @field type 
#' @field grade 
#' @field fieldGrades 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PlanGrade <- R6::R6Class(
  'PlanGrade',
  public = list(
    `href` = NULL,
    `id` = NULL,
    `createdAt` = NULL,
    `modifiedAt` = NULL,
    `type` = NULL,
    `grade` = NULL,
    `fieldGrades` = NULL,
    initialize = function(`href`, `id`, `createdAt`, `modifiedAt`, `type`, `grade`, `fieldGrades`){
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
      if (!missing(`type`)) {
        stopifnot(R6::is.R6(`type`))
        self$`type` <- `type`
      }
      if (!missing(`grade`)) {
        stopifnot(R6::is.R6(`grade`))
        self$`grade` <- `grade`
      }
      if (!missing(`fieldGrades`)) {
        stopifnot(R6::is.R6(`fieldGrades`))
        self$`fieldGrades` <- `fieldGrades`
      }
    },
    toJSON = function() {
      PlanGradeObject <- list()
      if (!is.null(self$`href`)) {
        PlanGradeObject[['href']] <- self$`href`
      }
      if (!is.null(self$`id`)) {
        PlanGradeObject[['id']] <- self$`id`
      }
      if (!is.null(self$`createdAt`)) {
        PlanGradeObject[['createdAt']] <- self$`createdAt`
      }
      if (!is.null(self$`modifiedAt`)) {
        PlanGradeObject[['modifiedAt']] <- self$`modifiedAt`
      }
      if (!is.null(self$`type`)) {
        PlanGradeObject[['type']] <- self$`type`$toJSON()
      }
      if (!is.null(self$`grade`)) {
        PlanGradeObject[['grade']] <- self$`grade`$toJSON()
      }
      if (!is.null(self$`fieldGrades`)) {
        PlanGradeObject[['fieldGrades']] <- self$`fieldGrades`$toJSON()
      }

      PlanGradeObject
    },
    fromJSON = function(PlanGradeJson) {
      PlanGradeObject <- dlensFromJSON(PlanGradeJson)
      if (!is.null(PlanGradeObject$`href`)) {
        self$`href` <- PlanGradeObject$`href`
      }
      if (!is.null(PlanGradeObject$`id`)) {
        self$`id` <- PlanGradeObject$`id`
      }
      if (!is.null(PlanGradeObject$`createdAt`)) {
        self$`createdAt` <- PlanGradeObject$`createdAt`
      }
      if (!is.null(PlanGradeObject$`modifiedAt`)) {
        self$`modifiedAt` <- PlanGradeObject$`modifiedAt`
      }
      if (!is.null(PlanGradeObject$`type`)) {
        typeObject <- PlanType$new()
        typeObject$fromJSON(jsonlite::toJSON(PlanGradeObject$type, auto_unbox = TRUE))
        self$`type` <- typeObject
      }
      if (!is.null(PlanGradeObject$`grade`)) {
        gradeObject <- Grade$new()
        gradeObject$fromJSON(jsonlite::toJSON(PlanGradeObject$grade, auto_unbox = TRUE))
        self$`grade` <- gradeObject
      }
      if (!is.null(PlanGradeObject$`fieldGrades`)) {
        fieldGradesObject <- FieldGrades$new()
        fieldGradesObject$fromJSON(jsonlite::toJSON(PlanGradeObject$fieldGrades, auto_unbox = TRUE))
        self$`fieldGrades` <- fieldGradesObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "href": %s,
           "id": %s,
           "createdAt": %s,
           "modifiedAt": %s,
           "type": %s,
           "grade": %s,
           "fieldGrades": %s
        }',
        self$`href`,
        self$`id`,
        self$`createdAt`,
        self$`modifiedAt`,
        self$`type`$toJSON(),
        self$`grade`$toJSON(),
        self$`fieldGrades`$toJSON()
      )
    },
    fromJSONString = function(PlanGradeJson) {
      PlanGradeObject <- dlensFromJSON(PlanGradeJson)
      self$`href` <- PlanGradeObject$`href`
      self$`id` <- PlanGradeObject$`id`
      self$`createdAt` <- PlanGradeObject$`createdAt`
      self$`modifiedAt` <- PlanGradeObject$`modifiedAt`
      PlanTypeObject <- PlanType$new()
      self$`type` <- PlanTypeObject$fromJSON(jsonlite::toJSON(PlanGradeObject$type, auto_unbox = TRUE))
      GradeObject <- Grade$new()
      self$`grade` <- GradeObject$fromJSON(jsonlite::toJSON(PlanGradeObject$grade, auto_unbox = TRUE))
      FieldGradesObject <- FieldGrades$new()
      self$`fieldGrades` <- FieldGradesObject$fromJSON(jsonlite::toJSON(PlanGradeObject$fieldGrades, auto_unbox = TRUE))
    }
  )
)