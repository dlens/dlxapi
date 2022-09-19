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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.BudgetAllocation = factory(root.DecisionLensApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The BudgetAllocation model module.
   * @module model/BudgetAllocation
   * @version 1.0
   */

  /**
   * Constructs a new <code>BudgetAllocation</code>.
   * @alias module:model/BudgetAllocation
   * @class
   */
  var exports = function() {
    var _this = this;











  };

  /**
   * Constructs a <code>BudgetAllocation</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BudgetAllocation} obj Optional instance to populate.
   * @return {module:model/BudgetAllocation} The populated <code>BudgetAllocation</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('resourcePoolName')) {
        obj['resourcePoolName'] = ApiClient.convertToType(data['resourcePoolName'], 'String');
      }
      if (data.hasOwnProperty('resourcePoolId')) {
        obj['resourcePoolId'] = ApiClient.convertToType(data['resourcePoolId'], 'String');
      }
      if (data.hasOwnProperty('yearlyBudgets')) {
        obj['yearlyBudgets'] = ApiClient.convertToType(data['yearlyBudgets'], ['Number']);
      }
      if (data.hasOwnProperty('yearlyAllocations')) {
        obj['yearlyAllocations'] = ApiClient.convertToType(data['yearlyAllocations'], ['Number']);
      }
      if (data.hasOwnProperty('yearlyTimePeriods')) {
        obj['yearlyTimePeriods'] = ApiClient.convertToType(data['yearlyTimePeriods'], ['Number']);
      }
      if (data.hasOwnProperty('yearlyConstrainedAllocations')) {
        obj['yearlyConstrainedAllocations'] = ApiClient.convertToType(data['yearlyConstrainedAllocations'], ['Number']);
      }
      if (data.hasOwnProperty('monthlyAllocations')) {
        obj['monthlyAllocations'] = ApiClient.convertToType(data['monthlyAllocations'], ['Number']);
      }
      if (data.hasOwnProperty('monthlyBudgets')) {
        obj['monthlyBudgets'] = ApiClient.convertToType(data['monthlyBudgets'], ['Number']);
      }
      if (data.hasOwnProperty('monthlyTimePeriods')) {
        obj['monthlyTimePeriods'] = ApiClient.convertToType(data['monthlyTimePeriods'], ['Number']);
      }
      if (data.hasOwnProperty('monthlyConstrainedAllocations')) {
        obj['monthlyConstrainedAllocations'] = ApiClient.convertToType(data['monthlyConstrainedAllocations'], ['Number']);
      }
    }
    return obj;
  }

  /**
   * @member {String} resourcePoolName
   */
  exports.prototype['resourcePoolName'] = undefined;
  /**
   * @member {String} resourcePoolId
   */
  exports.prototype['resourcePoolId'] = undefined;
  /**
   * @member {Array.<Number>} yearlyBudgets
   */
  exports.prototype['yearlyBudgets'] = undefined;
  /**
   * @member {Array.<Number>} yearlyAllocations
   */
  exports.prototype['yearlyAllocations'] = undefined;
  /**
   * @member {Array.<Number>} yearlyTimePeriods
   */
  exports.prototype['yearlyTimePeriods'] = undefined;
  /**
   * @member {Array.<Number>} yearlyConstrainedAllocations
   */
  exports.prototype['yearlyConstrainedAllocations'] = undefined;
  /**
   * @member {Array.<Number>} monthlyAllocations
   */
  exports.prototype['monthlyAllocations'] = undefined;
  /**
   * @member {Array.<Number>} monthlyBudgets
   */
  exports.prototype['monthlyBudgets'] = undefined;
  /**
   * @member {Array.<Number>} monthlyTimePeriods
   */
  exports.prototype['monthlyTimePeriods'] = undefined;
  /**
   * @member {Array.<Number>} monthlyConstrainedAllocations
   */
  exports.prototype['monthlyConstrainedAllocations'] = undefined;



  return exports;
}));


