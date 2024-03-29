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
    define(['ApiClient', 'model/DlcPortfolio', 'model/PortfolioPlan', 'model/SourceType'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DlcPortfolio'), require('./PortfolioPlan'), require('./SourceType'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.SourceCreatedEvent = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.DlcPortfolio, root.DecisionLensApi.PortfolioPlan, root.DecisionLensApi.SourceType);
  }
}(this, function(ApiClient, DlcPortfolio, PortfolioPlan, SourceType) {
  'use strict';




  /**
   * The SourceCreatedEvent model module.
   * @module model/SourceCreatedEvent
   * @version 1.0
   */

  /**
   * Constructs a new <code>SourceCreatedEvent</code>.
   * @alias module:model/SourceCreatedEvent
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>SourceCreatedEvent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SourceCreatedEvent} obj Optional instance to populate.
   * @return {module:model/SourceCreatedEvent} The populated <code>SourceCreatedEvent</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('sourceType')) {
        obj['sourceType'] = SourceType.constructFromObject(data['sourceType']);
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('dlcPortfolio')) {
        obj['dlcPortfolio'] = DlcPortfolio.constructFromObject(data['dlcPortfolio']);
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('portfolioPlan')) {
        obj['portfolioPlan'] = PortfolioPlan.constructFromObject(data['portfolioPlan']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/SourceType} sourceType
   */
  exports.prototype['sourceType'] = undefined;
  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {module:model/DlcPortfolio} dlcPortfolio
   */
  exports.prototype['dlcPortfolio'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {module:model/PortfolioPlan} portfolioPlan
   */
  exports.prototype['portfolioPlan'] = undefined;



  return exports;
}));


