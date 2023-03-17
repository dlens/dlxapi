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
    define(['ApiClient', 'model/ErrorResponse', 'model/PortfolioPlanUser', 'model/RegisterUserRequest', 'model/User'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/ErrorResponse'), require('../model/PortfolioPlanUser'), require('../model/RegisterUserRequest'), require('../model/User'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.RegistrationApi = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.ErrorResponse, root.DecisionLensApi.PortfolioPlanUser, root.DecisionLensApi.RegisterUserRequest, root.DecisionLensApi.User);
  }
}(this, function(ApiClient, ErrorResponse, PortfolioPlanUser, RegisterUserRequest, User) {
  'use strict';

  /**
   * Registration service.
   * @module api/RegistrationApi
   * @version 1.0
   */

  /**
   * Constructs a new RegistrationApi. 
   * @alias module:api/RegistrationApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the registerPortfolioUser operation.
     * @callback module:api/RegistrationApi~registerPortfolioUserCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PortfolioPlanUser} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Register Portfolio User
     * @param {module:model/RegisterUserRequest} registerUserRequest Register user request
     * @param {module:api/RegistrationApi~registerPortfolioUserCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PortfolioPlanUser}
     */
    this.registerPortfolioUser = function(registerUserRequest, callback) {
      var postBody = registerUserRequest;

      // verify the required parameter 'registerUserRequest' is set
      if (registerUserRequest === undefined || registerUserRequest === null) {
        throw new Error("Missing the required parameter 'registerUserRequest' when calling registerPortfolioUser");
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
      };

      var authNames = ['OAuth2'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = PortfolioPlanUser;

      return this.apiClient.callApi(
        '/registerPortfolioUser', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the registerUser operation.
     * @callback module:api/RegistrationApi~registerUserCallback
     * @param {String} error Error message, if any.
     * @param {module:model/User} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Register User
     * @param {module:model/RegisterUserRequest} registerUserRequest Register user request
     * @param {module:api/RegistrationApi~registerUserCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/User}
     */
    this.registerUser = function(registerUserRequest, callback) {
      var postBody = registerUserRequest;

      // verify the required parameter 'registerUserRequest' is set
      if (registerUserRequest === undefined || registerUserRequest === null) {
        throw new Error("Missing the required parameter 'registerUserRequest' when calling registerUser");
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
      };

      var authNames = ['OAuth2'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = User;

      return this.apiClient.callApi(
        '/registerUser', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));