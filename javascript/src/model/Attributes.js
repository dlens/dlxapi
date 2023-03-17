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
    define(['ApiClient', 'model/TimeInterval', 'model/TimePeriodType'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./TimeInterval'), require('./TimePeriodType'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.Attributes = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.TimeInterval, root.DecisionLensApi.TimePeriodType);
  }
}(this, function(ApiClient, TimeInterval, TimePeriodType) {
  'use strict';




  /**
   * The Attributes model module.
   * @module model/Attributes
   * @version 1.0
   */

  /**
   * Constructs a new <code>Attributes</code>.
   * @alias module:model/Attributes
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>Attributes</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Attributes} obj Optional instance to populate.
   * @return {module:model/Attributes} The populated <code>Attributes</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('timeInterval')) {
        obj['timeInterval'] = TimeInterval.constructFromObject(data['timeInterval']);
      }
      if (data.hasOwnProperty('budgetTimePeriodType')) {
        obj['budgetTimePeriodType'] = TimePeriodType.constructFromObject(data['budgetTimePeriodType']);
      }
      if (data.hasOwnProperty('isMonthlySpendPlan')) {
        obj['isMonthlySpendPlan'] = ApiClient.convertToType(data['isMonthlySpendPlan'], 'Boolean');
      }
    }
    return obj;
  }

  /**
   * @member {module:model/TimeInterval} timeInterval
   */
  exports.prototype['timeInterval'] = undefined;
  /**
   * @member {module:model/TimePeriodType} budgetTimePeriodType
   */
  exports.prototype['budgetTimePeriodType'] = undefined;
  /**
   * @member {Boolean} isMonthlySpendPlan
   */
  exports.prototype['isMonthlySpendPlan'] = undefined;



  return exports;
}));

