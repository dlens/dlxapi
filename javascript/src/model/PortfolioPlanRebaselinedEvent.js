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
    define(['ApiClient', 'model/PortfolioPlan'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./PortfolioPlan'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.PortfolioPlanRebaselinedEvent = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.PortfolioPlan);
  }
}(this, function(ApiClient, PortfolioPlan) {
  'use strict';




  /**
   * The PortfolioPlanRebaselinedEvent model module.
   * @module model/PortfolioPlanRebaselinedEvent
   * @version 1.0
   */

  /**
   * Constructs a new <code>PortfolioPlanRebaselinedEvent</code>.
   * @alias module:model/PortfolioPlanRebaselinedEvent
   * @class
   */
  var exports = function() {
    var _this = this;







  };

  /**
   * Constructs a <code>PortfolioPlanRebaselinedEvent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PortfolioPlanRebaselinedEvent} obj Optional instance to populate.
   * @return {module:model/PortfolioPlanRebaselinedEvent} The populated <code>PortfolioPlanRebaselinedEvent</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('portfolioId')) {
        obj['portfolioId'] = ApiClient.convertToType(data['portfolioId'], 'String');
      }
      if (data.hasOwnProperty('baselinePortfolioPlanName')) {
        obj['baselinePortfolioPlanName'] = ApiClient.convertToType(data['baselinePortfolioPlanName'], 'String');
      }
      if (data.hasOwnProperty('whatIfPortfolioPlan')) {
        obj['whatIfPortfolioPlan'] = PortfolioPlan.constructFromObject(data['whatIfPortfolioPlan']);
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('whatIfPortfolioPlanName')) {
        obj['whatIfPortfolioPlanName'] = ApiClient.convertToType(data['whatIfPortfolioPlanName'], 'String');
      }
      if (data.hasOwnProperty('portfolioPlan')) {
        obj['portfolioPlan'] = PortfolioPlan.constructFromObject(data['portfolioPlan']);
      }
    }
    return obj;
  }

  /**
   * @member {String} portfolioId
   */
  exports.prototype['portfolioId'] = undefined;
  /**
   * @member {String} baselinePortfolioPlanName
   */
  exports.prototype['baselinePortfolioPlanName'] = undefined;
  /**
   * @member {module:model/PortfolioPlan} whatIfPortfolioPlan
   */
  exports.prototype['whatIfPortfolioPlan'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {String} whatIfPortfolioPlanName
   */
  exports.prototype['whatIfPortfolioPlanName'] = undefined;
  /**
   * @member {module:model/PortfolioPlan} portfolioPlan
   */
  exports.prototype['portfolioPlan'] = undefined;



  return exports;
}));

