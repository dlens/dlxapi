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
    define(['ApiClient', 'model/PortfolioPlan', 'model/TimePeriodType'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./PortfolioPlan'), require('./TimePeriodType'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.PortfolioBudgetTimePeriodTypeUpdatedEvent = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.PortfolioPlan, root.DecisionLensApi.TimePeriodType);
  }
}(this, function(ApiClient, PortfolioPlan, TimePeriodType) {
  'use strict';




  /**
   * The PortfolioBudgetTimePeriodTypeUpdatedEvent model module.
   * @module model/PortfolioBudgetTimePeriodTypeUpdatedEvent
   * @version 1.0
   */

  /**
   * Constructs a new <code>PortfolioBudgetTimePeriodTypeUpdatedEvent</code>.
   * @alias module:model/PortfolioBudgetTimePeriodTypeUpdatedEvent
   * @class
   */
  var exports = function() {
    var _this = this;







  };

  /**
   * Constructs a <code>PortfolioBudgetTimePeriodTypeUpdatedEvent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PortfolioBudgetTimePeriodTypeUpdatedEvent} obj Optional instance to populate.
   * @return {module:model/PortfolioBudgetTimePeriodTypeUpdatedEvent} The populated <code>PortfolioBudgetTimePeriodTypeUpdatedEvent</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('budgetTimePeriodType')) {
        obj['budgetTimePeriodType'] = TimePeriodType.constructFromObject(data['budgetTimePeriodType']);
      }
      if (data.hasOwnProperty('portfolioId')) {
        obj['portfolioId'] = ApiClient.convertToType(data['portfolioId'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('previousTimePeriodType')) {
        obj['previousTimePeriodType'] = TimePeriodType.constructFromObject(data['previousTimePeriodType']);
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
   * @member {module:model/TimePeriodType} budgetTimePeriodType
   */
  exports.prototype['budgetTimePeriodType'] = undefined;
  /**
   * @member {String} portfolioId
   */
  exports.prototype['portfolioId'] = undefined;
  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {module:model/TimePeriodType} previousTimePeriodType
   */
  exports.prototype['previousTimePeriodType'] = undefined;
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


