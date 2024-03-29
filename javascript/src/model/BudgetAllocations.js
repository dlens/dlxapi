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
    define(['ApiClient', 'model/BudgetAllocation', 'model/DlCollection', 'model/PortfolioPlan', 'model/TimePeriodType'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./BudgetAllocation'), require('./DlCollection'), require('./PortfolioPlan'), require('./TimePeriodType'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.BudgetAllocations = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.BudgetAllocation, root.DecisionLensApi.DlCollection, root.DecisionLensApi.PortfolioPlan, root.DecisionLensApi.TimePeriodType);
  }
}(this, function(ApiClient, BudgetAllocation, DlCollection, PortfolioPlan, TimePeriodType) {
  'use strict';




  /**
   * The BudgetAllocations model module.
   * @module model/BudgetAllocations
   * @version 1.0
   */

  /**
   * Constructs a new <code>BudgetAllocations</code>.
   * @alias module:model/BudgetAllocations
   * @class
   * @extends module:model/DlCollection
   */
  var exports = function() {
    var _this = this;
    DlCollection.call(_this);





  };

  /**
   * Constructs a <code>BudgetAllocations</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BudgetAllocations} obj Optional instance to populate.
   * @return {module:model/BudgetAllocations} The populated <code>BudgetAllocations</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      DlCollection.constructFromObject(data, obj);
      if (data.hasOwnProperty('portfolioPlan')) {
        obj['portfolioPlan'] = PortfolioPlan.constructFromObject(data['portfolioPlan']);
      }
      if (data.hasOwnProperty('timePeriodType')) {
        obj['timePeriodType'] = TimePeriodType.constructFromObject(data['timePeriodType']);
      }
      if (data.hasOwnProperty('yearlyStartTime')) {
        obj['yearlyStartTime'] = ApiClient.convertToType(data['yearlyStartTime'], 'Number');
      }
      if (data.hasOwnProperty('monthlyStartTime')) {
        obj['monthlyStartTime'] = ApiClient.convertToType(data['monthlyStartTime'], 'Number');
      }
      if (data.hasOwnProperty('items')) {
        obj['items'] = ApiClient.convertToType(data['items'], [BudgetAllocation]);
      }
    }
    return obj;
  }

  exports.prototype = Object.create(DlCollection.prototype);
  exports.prototype.constructor = exports;

  /**
   * @member {module:model/PortfolioPlan} portfolioPlan
   */
  exports.prototype['portfolioPlan'] = undefined;
  /**
   * @member {module:model/TimePeriodType} timePeriodType
   */
  exports.prototype['timePeriodType'] = undefined;
  /**
   * @member {Number} yearlyStartTime
   */
  exports.prototype['yearlyStartTime'] = undefined;
  /**
   * @member {Number} monthlyStartTime
   */
  exports.prototype['monthlyStartTime'] = undefined;
  /**
   * @member {Array.<module:model/BudgetAllocation>} items
   */
  exports.prototype['items'] = undefined;



  return exports;
}));


