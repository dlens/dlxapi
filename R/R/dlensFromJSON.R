#' @importFrom jsonlite fromJSON toJSON
#' @importFrom base64enc base64encode
#' @importFrom httr add_headers, add_headers
#' @export
dlensFromJSON <- function(txt,...) {
  jsonlite::fromJSON(txt, simplifyVector = FALSE, ...)
}

#' Gets a portfolio object from its name
#' 
#' Note that name is spacing and case sensitive.
#' 
#' @param apiclient The ApiClient object to use for method calls.
#' @param name The name of the portfolio to return
#' @return A Portfolio object or NULL if there was no portfolio of the given name
portfolioFromName <- function(apiclient, name) {
  portfoliosApi = PortfoliosApi$new()
  portfoliosApi$apiClient = apiClient
  ports = portfoliosApi$get_portfolios()
  for (port in ports$content$items) {
    if (port$name == name) {
      return(port)
    }
  }
  return(NULL)
}

apiClientFromCreds <- function(dlx_instance, id, secret) {
  #Remove trailing slash on dlx_instance if it is there, because it causes issues
  dlx_instance = gsub("/$", "", dlx_instance)
  #Setup login and api calling urls from our instance
  dlx_login_url = paste(dlx_instance, "oauth/token?grant_type=client_credentials", sep="/")
  dlx_api_url = paste(dlx_instance, "v1", sep="/")
  
  basicAuth <- base64enc::base64encode(charToRaw(paste(id,secret, sep=":")))
  res=httr::POST(dlx_login_url, httr::add_headers("Authorization"= paste("Basic", basicAuth)))
  access_token = httr::content(res)$access_token
  #print(access_token)
  apiClient = ApiClient$new()
  apiClient$basePath=dlx_api_url
  apiClient$defaultHeaders = list("Authorization"=paste("Bearer", access_token))
  return(apiClient)
}