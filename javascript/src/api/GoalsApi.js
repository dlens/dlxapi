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
    define(['ApiClient', 'model/ErrorResponse', 'model/Goal', 'model/Goals'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/ErrorResponse'), require('../model/Goal'), require('../model/Goals'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.GoalsApi = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.ErrorResponse, root.DecisionLensApi.Goal, root.DecisionLensApi.Goals);
  }
}(this, function(ApiClient, ErrorResponse, Goal, Goals) {
  'use strict';

  /**
   * Goals service.
   * @module api/GoalsApi
   * @version 1.0
   */

  /**
   * Constructs a new GoalsApi. 
   * @alias module:api/GoalsApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the getGoalsForPortfolio operation.
     * @callback module:api/GoalsApi~getGoalsForPortfolioCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Goals} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Goals by portfolio id
     * @param {String} portfolioId Portfolio id
     * @param {Object} opts Optional parameters
     * @param {Number} opts.offset Pagination offset
     * @param {Number} opts.limit Pagination limit
     * @param {String} opts.orderBy Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order.
     * @param {module:api/GoalsApi~getGoalsForPortfolioCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Goals}
     */
    this.getGoalsForPortfolio = function(portfolioId, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'portfolioId' is set
      if (portfolioId === undefined || portfolioId === null) {
        throw new Error("Missing the required parameter 'portfolioId' when calling getGoalsForPortfolio");
      }


      var pathParams = {
      };
      var queryParams = {
        'portfolioId': portfolioId,
        'offset': opts['offset'],
        'limit': opts['limit'],
        'orderBy': opts['orderBy'],
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
      var returnType = Goals;

      return this.apiClient.callApi(
        '/goals', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateGoalsForPortfolio operation.
     * @callback module:api/GoalsApi~updateGoalsForPortfolioCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Goal>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates Goals for portfolio
     * @param {String} portfolioId Portfolio id
     * @param {Array.<module:model/Goal>} goals Goals
     * @param {module:api/GoalsApi~updateGoalsForPortfolioCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Goal>}
     */
    this.updateGoalsForPortfolio = function(portfolioId, goals, callback) {
      var postBody = goals;

      // verify the required parameter 'portfolioId' is set
      if (portfolioId === undefined || portfolioId === null) {
        throw new Error("Missing the required parameter 'portfolioId' when calling updateGoalsForPortfolio");
      }

      // verify the required parameter 'goals' is set
      if (goals === undefined || goals === null) {
        throw new Error("Missing the required parameter 'goals' when calling updateGoalsForPortfolio");
      }


      var pathParams = {
      };
      var queryParams = {
        'portfolioId': portfolioId,
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['OAuth2'];
      var contentTypes = ['application/merge-patch+json'];
      var accepts = ['application/json'];
      var returnType = [Goal];

      return this.apiClient.callApi(
        '/goals', 'PATCH',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
