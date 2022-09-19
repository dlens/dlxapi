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
    define(['ApiClient', 'model/DlResource', 'model/PortfolioPlanUser', 'model/User'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DlResource'), require('./PortfolioPlanUser'), require('./User'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.Comment = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.DlResource, root.DecisionLensApi.PortfolioPlanUser, root.DecisionLensApi.User);
  }
}(this, function(ApiClient, DlResource, PortfolioPlanUser, User) {
  'use strict';




  /**
   * The Comment model module.
   * @module model/Comment
   * @version 1.0
   */

  /**
   * Constructs a new <code>Comment</code>.
   * @alias module:model/Comment
   * @class
   * @extends module:model/DlResource
   */
  var exports = function() {
    var _this = this;
    DlResource.call(_this);





  };

  /**
   * Constructs a <code>Comment</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Comment} obj Optional instance to populate.
   * @return {module:model/Comment} The populated <code>Comment</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      DlResource.constructFromObject(data, obj);
      if (data.hasOwnProperty('portfolioId')) {
        obj['portfolioId'] = ApiClient.convertToType(data['portfolioId'], 'String');
      }
      if (data.hasOwnProperty('projectId')) {
        obj['projectId'] = ApiClient.convertToType(data['projectId'], 'String');
      }
      if (data.hasOwnProperty('user')) {
        obj['user'] = User.constructFromObject(data['user']);
      }
      if (data.hasOwnProperty('value')) {
        obj['value'] = ApiClient.convertToType(data['value'], 'String');
      }
      if (data.hasOwnProperty('contributorsAdded')) {
        obj['contributorsAdded'] = ApiClient.convertToType(data['contributorsAdded'], [PortfolioPlanUser]);
      }
    }
    return obj;
  }

  exports.prototype = Object.create(DlResource.prototype);
  exports.prototype.constructor = exports;

  /**
   * @member {String} portfolioId
   */
  exports.prototype['portfolioId'] = undefined;
  /**
   * @member {String} projectId
   */
  exports.prototype['projectId'] = undefined;
  /**
   * @member {module:model/User} user
   */
  exports.prototype['user'] = undefined;
  /**
   * @member {String} value
   */
  exports.prototype['value'] = undefined;
  /**
   * @member {Array.<module:model/PortfolioPlanUser>} contributorsAdded
   */
  exports.prototype['contributorsAdded'] = undefined;



  return exports;
}));


