/**
 * Decision Lens API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.7
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/ErrorResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/ErrorResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.PodsApi = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.ErrorResponse);
  }
}(this, function(ApiClient, ErrorResponse) {
  'use strict';

  /**
   * Pods service.
   * @module api/PodsApi
   * @version 1.0
   */

  /**
   * Constructs a new PodsApi. 
   * @alias module:api/PodsApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the importPodTemplate operation.
     * @callback module:api/PodsApi~importPodTemplateCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Import pod template in JSON format
     * @param {File} podFile The pod file to upload.
     * @param {String} templateName pod template name
     * @param {module:api/PodsApi~importPodTemplateCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.importPodTemplate = function(podFile, templateName, callback) {
      var postBody = null;

      // verify the required parameter 'podFile' is set
      if (podFile === undefined || podFile === null) {
        throw new Error("Missing the required parameter 'podFile' when calling importPodTemplate");
      }

      // verify the required parameter 'templateName' is set
      if (templateName === undefined || templateName === null) {
        throw new Error("Missing the required parameter 'templateName' when calling importPodTemplate");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'podFile': podFile,
        'templateName': templateName
      };

      var authNames = ['OAuth2'];
      var contentTypes = ['multipart/form-data'];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/pods/template', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
