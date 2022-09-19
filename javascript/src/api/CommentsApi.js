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
    define(['ApiClient', 'model/Comment', 'model/Comments', 'model/ErrorResponse', 'model/Operations'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Comment'), require('../model/Comments'), require('../model/ErrorResponse'), require('../model/Operations'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.CommentsApi = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.Comment, root.DecisionLensApi.Comments, root.DecisionLensApi.ErrorResponse, root.DecisionLensApi.Operations);
  }
}(this, function(ApiClient, Comment, Comments, ErrorResponse, Operations) {
  'use strict';

  /**
   * Comments service.
   * @module api/CommentsApi
   * @version 1.0
   */

  /**
   * Constructs a new CommentsApi. 
   * @alias module:api/CommentsApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createComment operation.
     * @callback module:api/CommentsApi~createCommentCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Comment} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Creates a new comment
     * @param {module:model/Comment} body Comment to create
     * @param {module:api/CommentsApi~createCommentCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Comment}
     */
    this.createComment = function(body, callback) {
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling createComment");
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
      var returnType = Comment;

      return this.apiClient.callApi(
        '/comments', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteComment operation.
     * @callback module:api/CommentsApi~deleteCommentCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete a single comment
     * @param {String} id Comment ID
     * @param {module:api/CommentsApi~deleteCommentCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteComment = function(id, callback) {
      var postBody = null;

      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling deleteComment");
      }


      var pathParams = {
        'id': id
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
      var contentTypes = [];
      var accepts = [];
      var returnType = null;

      return this.apiClient.callApi(
        '/comments/{id}', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getComments operation.
     * @callback module:api/CommentsApi~getCommentsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Comments} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieves comments based on params
     * @param {Object} opts Optional parameters
     * @param {String} opts.portfolioId Use when you want all comments from all projects inside this portfolio
     * @param {String} opts.projectId Use when you want comments for a specific project
     * @param {Number} opts.offset The page number from where the search will be done
     * @param {Number} opts.limit Max number of comments which will be returned
     * @param {String} opts.orderBy Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order.
     * @param {module:api/CommentsApi~getCommentsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Comments}
     */
    this.getComments = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'portfolioId': opts['portfolioId'],
        'projectId': opts['projectId'],
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
      var returnType = Comments;

      return this.apiClient.callApi(
        '/comments', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateComment operation.
     * @callback module:api/CommentsApi~updateCommentCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Comment} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update a single comment
     * @param {String} id Comment ID
     * @param {module:model/Operations} body JSON Patch operations to update value field.
     * @param {module:api/CommentsApi~updateCommentCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Comment}
     */
    this.updateComment = function(id, body, callback) {
      var postBody = body;

      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling updateComment");
      }

      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling updateComment");
      }


      var pathParams = {
        'id': id
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
      var contentTypes = ['application/json-patch+json'];
      var accepts = ['application/json'];
      var returnType = Comment;

      return this.apiClient.callApi(
        '/comments/{id}', 'PATCH',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
