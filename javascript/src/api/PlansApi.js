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
    define(['ApiClient', 'model/ErrorResponse', 'model/PortfolioPlanInsights', 'model/WhatsIn'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/ErrorResponse'), require('../model/PortfolioPlanInsights'), require('../model/WhatsIn'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.PlansApi = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.ErrorResponse, root.DecisionLensApi.PortfolioPlanInsights, root.DecisionLensApi.WhatsIn);
  }
}(this, function(ApiClient, ErrorResponse, PortfolioPlanInsights, WhatsIn) {
  'use strict';

  /**
   * Plans service.
   * @module api/PlansApi
   * @version 1.0
   */

  /**
   * Constructs a new PlansApi. 
   * @alias module:api/PlansApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the exportWhatsIn operation.
     * @callback module:api/PlansApi~exportWhatsInCallback
     * @param {String} error Error message, if any.
     * @param {'Blob'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Export Whats In Comparison
     * @param {String} portfolioId portfolioId
     * @param {String} portfolioPlanIds portfolioPlanIds to be exported
     * @param {Object} exportFormat export format type (XLSX)
     * @param {Number} startDate Start time period for which the grades are computed for.
     * @param {Number} endDate End time period for which the grades are computed for.
     * @param {module:api/PlansApi~exportWhatsInCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link 'Blob'}
     */
    this.exportWhatsIn = function(portfolioId, portfolioPlanIds, exportFormat, startDate, endDate, callback) {
      var postBody = null;

      // verify the required parameter 'portfolioId' is set
      if (portfolioId === undefined || portfolioId === null) {
        throw new Error("Missing the required parameter 'portfolioId' when calling exportWhatsIn");
      }

      // verify the required parameter 'portfolioPlanIds' is set
      if (portfolioPlanIds === undefined || portfolioPlanIds === null) {
        throw new Error("Missing the required parameter 'portfolioPlanIds' when calling exportWhatsIn");
      }

      // verify the required parameter 'exportFormat' is set
      if (exportFormat === undefined || exportFormat === null) {
        throw new Error("Missing the required parameter 'exportFormat' when calling exportWhatsIn");
      }

      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling exportWhatsIn");
      }

      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling exportWhatsIn");
      }


      var pathParams = {
      };
      var queryParams = {
        'portfolioId': portfolioId,
        'portfolioPlanIds': portfolioPlanIds,
        'exportFormat': exportFormat,
        'startDate': startDate,
        'endDate': endDate,
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['OAuth2'];
      var contentTypes = [];
      var accepts = ['application/vnd.openxmlformats-officedocument.spreadsheetml.sheet'];
      var returnType = 'Blob';

      return this.apiClient.callApi(
        '/portfolioPlans/whatsin/export', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getInsightsForPortfolioPlan operation.
     * @callback module:api/PlansApi~getInsightsForPortfolioPlanCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PortfolioPlanInsights} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieves insights for portfolio plan.
     * @param {String} id Portfolio Plan id
     * @param {Number} startDate Start time period for which the insights are computed for.
     * @param {Number} endDate End time period for which the insights are computed for.
     * @param {Boolean} includeGrades Whether to include grades in the response.
     * @param {module:api/PlansApi~getInsightsForPortfolioPlanCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PortfolioPlanInsights}
     */
    this.getInsightsForPortfolioPlan = function(id, startDate, endDate, includeGrades, callback) {
      var postBody = null;

      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getInsightsForPortfolioPlan");
      }

      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling getInsightsForPortfolioPlan");
      }

      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling getInsightsForPortfolioPlan");
      }

      // verify the required parameter 'includeGrades' is set
      if (includeGrades === undefined || includeGrades === null) {
        throw new Error("Missing the required parameter 'includeGrades' when calling getInsightsForPortfolioPlan");
      }


      var pathParams = {
        'id': id
      };
      var queryParams = {
        'startDate': startDate,
        'endDate': endDate,
        'includeGrades': includeGrades,
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['OAuth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = PortfolioPlanInsights;

      return this.apiClient.callApi(
        '/portfolioPlans/{id}/insights', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getValueInsightsForPortfolioPlan operation.
     * @callback module:api/PlansApi~getValueInsightsForPortfolioPlanCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PortfolioPlanInsights} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieves value insights for portfolio plan.
     * @param {String} id Portfolio Plan id
     * @param {Number} startDate Start time period for which the grades are computed for.
     * @param {Number} endDate End time period for which the grades are computed for.
     * @param {module:api/PlansApi~getValueInsightsForPortfolioPlanCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PortfolioPlanInsights}
     */
    this.getValueInsightsForPortfolioPlan = function(id, startDate, endDate, callback) {
      var postBody = null;

      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getValueInsightsForPortfolioPlan");
      }

      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling getValueInsightsForPortfolioPlan");
      }

      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling getValueInsightsForPortfolioPlan");
      }


      var pathParams = {
        'id': id
      };
      var queryParams = {
        'startDate': startDate,
        'endDate': endDate,
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['OAuth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = PortfolioPlanInsights;

      return this.apiClient.callApi(
        '/portfolioPlans/{id}/insights/value', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getWhatsIn operation.
     * @callback module:api/PlansApi~getWhatsInCallback
     * @param {String} error Error message, if any.
     * @param {module:model/WhatsIn} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieves portfolioPlans with projects for WhatsIn
     * @param {String} portfolioId portfolioId
     * @param {String} portfolioPlanIds portfolioPlanIds for which projects are returned
     * @param {Number} startDate Start time period for which the grades are computed for.
     * @param {Number} endDate End time period for which the grades are computed for.
     * @param {Number} maxLimit Maximum limit for project; 0 &lt; number of returned project(is variable, NOT fixed) &lt; maxLimit
     * @param {Object} opts Optional parameters
     * @param {Number} opts.offset Pagination offset
     * @param {module:api/PlansApi~getWhatsInCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/WhatsIn}
     */
    this.getWhatsIn = function(portfolioId, portfolioPlanIds, startDate, endDate, maxLimit, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'portfolioId' is set
      if (portfolioId === undefined || portfolioId === null) {
        throw new Error("Missing the required parameter 'portfolioId' when calling getWhatsIn");
      }

      // verify the required parameter 'portfolioPlanIds' is set
      if (portfolioPlanIds === undefined || portfolioPlanIds === null) {
        throw new Error("Missing the required parameter 'portfolioPlanIds' when calling getWhatsIn");
      }

      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling getWhatsIn");
      }

      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling getWhatsIn");
      }

      // verify the required parameter 'maxLimit' is set
      if (maxLimit === undefined || maxLimit === null) {
        throw new Error("Missing the required parameter 'maxLimit' when calling getWhatsIn");
      }


      var pathParams = {
      };
      var queryParams = {
        'portfolioId': portfolioId,
        'portfolioPlanIds': portfolioPlanIds,
        'startDate': startDate,
        'endDate': endDate,
        'maxLimit': maxLimit,
        'offset': opts['offset'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['OAuth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = WhatsIn;

      return this.apiClient.callApi(
        '/portfolioPlans/whatsin', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));