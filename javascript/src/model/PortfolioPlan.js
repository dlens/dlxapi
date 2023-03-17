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
    define(['ApiClient', 'model/DlResource', 'model/Portfolio', 'model/PortfolioPlan', 'model/PortfolioPlanUser', 'model/PortfolioPlanUsers'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DlResource'), require('./Portfolio'), require('./PortfolioPlan'), require('./PortfolioPlanUser'), require('./PortfolioPlanUsers'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.PortfolioPlan = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.DlResource, root.DecisionLensApi.Portfolio, root.DecisionLensApi.PortfolioPlan, root.DecisionLensApi.PortfolioPlanUser, root.DecisionLensApi.PortfolioPlanUsers);
  }
}(this, function(ApiClient, DlResource, Portfolio, PortfolioPlan, PortfolioPlanUser, PortfolioPlanUsers) {
  'use strict';




  /**
   * The PortfolioPlan model module.
   * @module model/PortfolioPlan
   * @version 1.0
   */

  /**
   * Constructs a new <code>PortfolioPlan</code>.
   * @alias module:model/PortfolioPlan
   * @class
   * @extends module:model/DlResource
   */
  var exports = function() {
    var _this = this;
    DlResource.call(_this);







  };

  /**
   * Constructs a <code>PortfolioPlan</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PortfolioPlan} obj Optional instance to populate.
   * @return {module:model/PortfolioPlan} The populated <code>PortfolioPlan</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      DlResource.constructFromObject(data, obj);
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('isBaseline')) {
        obj['isBaseline'] = ApiClient.convertToType(data['isBaseline'], 'Boolean');
      }
      if (data.hasOwnProperty('portfolio')) {
        obj['portfolio'] = Portfolio.constructFromObject(data['portfolio']);
      }
      if (data.hasOwnProperty('parentPortfolioPlan')) {
        obj['parentPortfolioPlan'] = PortfolioPlan.constructFromObject(data['parentPortfolioPlan']);
      }
      if (data.hasOwnProperty('portfolioPlanUsers')) {
        obj['portfolioPlanUsers'] = PortfolioPlanUsers.constructFromObject(data['portfolioPlanUsers']);
      }
      if (data.hasOwnProperty('currentPortfolioPlanUser')) {
        obj['currentPortfolioPlanUser'] = PortfolioPlanUser.constructFromObject(data['currentPortfolioPlanUser']);
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
    }
    return obj;
  }

  exports.prototype = Object.create(DlResource.prototype);
  exports.prototype.constructor = exports;

  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {Boolean} isBaseline
   */
  exports.prototype['isBaseline'] = undefined;
  /**
   * @member {module:model/Portfolio} portfolio
   */
  exports.prototype['portfolio'] = undefined;
  /**
   * @member {module:model/PortfolioPlan} parentPortfolioPlan
   */
  exports.prototype['parentPortfolioPlan'] = undefined;
  /**
   * @member {module:model/PortfolioPlanUsers} portfolioPlanUsers
   */
  exports.prototype['portfolioPlanUsers'] = undefined;
  /**
   * @member {module:model/PortfolioPlanUser} currentPortfolioPlanUser
   */
  exports.prototype['currentPortfolioPlanUser'] = undefined;
  /**
   * @member {String} description
   */
  exports.prototype['description'] = undefined;



  return exports;
}));

