# Decision Lens API
#
# No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
#
# OpenAPI spec version: 1.0
#
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ApiClient Class
#'
#' Generic API client for Swagger client library builds.
#' Swagger generic API client. This client handles the client-
#' server communication, and is invariant across implementations. Specifics of
#' the methods and models for each application are generated from the Swagger
#' templates.
#'
#' NOTE: This class is auto generated by the swagger code generator program.
#' Ref: https://github.com/swagger-api/swagger-codegen
#' Do not edit the class manually.
#' @include urltools
#' @export
ApiClient  <- R6::R6Class(
  'ApiClient',
  public = list(
    basePath = "http://localhost:9005/v1",
    configuration = NULL,
    userAgent = NULL,
    defaultHeaders = list(),
    initialize = function(basePath, configuration, defaultHeaders){
        if (!missing(basePath)) {
            self$basePath <- basePath
        }

        if (!missing(configuration)) {
            self$configuration <- configuration
        }

        if (!missing(defaultHeaders)) {
            self$defaultHeaders <- defaultHeaders
        }

        self$`userAgent` <- 'Swagger-Codegen/1.0.0/r'
    },
    callApi = function(url, method, queryParams, headerParams, body, ...){
        allHeaderParams = append(self$defaultHeaders, headerParams)
        headers <- do.call(httr::add_headers, allHeaderParams)
        if (method == "GET") {
          #Let's append the url by hand
          for(queryName in names(queryParams)) {
            url = urltools::param_set(url, queryName, queryParams[[queryName]])
          }
          httr::GET(url, queryParams, headers, ...)
        }
        else if (method == "POST") {
          #Let's append the url by hand
          for(queryName in names(queryParams)) {
            url = urltools::param_set(url, queryName, queryParams[[queryName]])
          }
            httr::POST(url, headers, body = body, ...)
        }
        else if (method == "PUT") {
            httr::PUT(url, queryParams, headers, body = body, ...)
        }
        else if (method == "PATCH") {
            httr::PATCH(url, queryParams, headers, body = body, ...)
        }
        else if (method == "HEAD") {
            httr::HEAD(url, queryParams, headers, ...)
        }
        else if (method == "DELETE") {
            httr::DELETE(url, queryParams, headers, ...)
        }
        else {
            stop("http method must be `GET`, `HEAD`, `OPTIONS`, `POST`, `PATCH`, `PUT` or `DELETE`.")
        }
    }
  )
)
