#' @importFrom jsonlite fromJSON toJSON
#' @export
dlensFromJSON <- function(txt,...) {
  jsonlite::fromJSON(txt, simplifyVector = FALSE, ...)
}