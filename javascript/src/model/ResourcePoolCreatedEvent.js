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
    define(['ApiClient', 'model/Field', 'model/PortfolioPlan', 'model/ResourcePoolBudgetAmount'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Field'), require('./PortfolioPlan'), require('./ResourcePoolBudgetAmount'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.ResourcePoolCreatedEvent = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.Field, root.DecisionLensApi.PortfolioPlan, root.DecisionLensApi.ResourcePoolBudgetAmount);
  }
}(this, function(ApiClient, Field, PortfolioPlan, ResourcePoolBudgetAmount) {
  'use strict';




  /**
   * The ResourcePoolCreatedEvent model module.
   * @module model/ResourcePoolCreatedEvent
   * @version 1.0
   */

  /**
   * Constructs a new <code>ResourcePoolCreatedEvent</code>.
   * @alias module:model/ResourcePoolCreatedEvent
   * @class
   */
  var exports = function() {
    var _this = this;







  };

  /**
   * Constructs a <code>ResourcePoolCreatedEvent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ResourcePoolCreatedEvent} obj Optional instance to populate.
   * @return {module:model/ResourcePoolCreatedEvent} The populated <code>ResourcePoolCreatedEvent</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('portfolioId')) {
        obj['portfolioId'] = ApiClient.convertToType(data['portfolioId'], 'String');
      }
      if (data.hasOwnProperty('field')) {
        obj['field'] = Field.constructFromObject(data['field']);
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('budgetAmounts')) {
        obj['budgetAmounts'] = ApiClient.convertToType(data['budgetAmounts'], [ResourcePoolBudgetAmount]);
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
   * @member {module:model/Field} field
   */
  exports.prototype['field'] = undefined;
  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {Array.<module:model/ResourcePoolBudgetAmount>} budgetAmounts
   */
  exports.prototype['budgetAmounts'] = undefined;
  /**
   * @member {module:model/PortfolioPlan} portfolioPlan
   */
  exports.prototype['portfolioPlan'] = undefined;



  return exports;
}));


