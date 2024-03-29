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
    define(['ApiClient', 'model/DlResource', 'model/Field', 'model/ResourcePoolBudgetAmounts', 'model/ResourcePoolFieldValue'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DlResource'), require('./Field'), require('./ResourcePoolBudgetAmounts'), require('./ResourcePoolFieldValue'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.ResourcePool = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.DlResource, root.DecisionLensApi.Field, root.DecisionLensApi.ResourcePoolBudgetAmounts, root.DecisionLensApi.ResourcePoolFieldValue);
  }
}(this, function(ApiClient, DlResource, Field, ResourcePoolBudgetAmounts, ResourcePoolFieldValue) {
  'use strict';




  /**
   * The ResourcePool model module.
   * @module model/ResourcePool
   * @version 1.0
   */

  /**
   * Constructs a new <code>ResourcePool</code>.
   * @alias module:model/ResourcePool
   * @class
   * @extends module:model/DlResource
   */
  var exports = function() {
    var _this = this;
    DlResource.call(_this);




  };

  /**
   * Constructs a <code>ResourcePool</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ResourcePool} obj Optional instance to populate.
   * @return {module:model/ResourcePool} The populated <code>ResourcePool</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      DlResource.constructFromObject(data, obj);
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('budgetAmounts')) {
        obj['budgetAmounts'] = ResourcePoolBudgetAmounts.constructFromObject(data['budgetAmounts']);
      }
      if (data.hasOwnProperty('field')) {
        obj['field'] = Field.constructFromObject(data['field']);
      }
      if (data.hasOwnProperty('fieldValues')) {
        obj['fieldValues'] = ApiClient.convertToType(data['fieldValues'], [ResourcePoolFieldValue]);
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
   * @member {module:model/ResourcePoolBudgetAmounts} budgetAmounts
   */
  exports.prototype['budgetAmounts'] = undefined;
  /**
   * @member {module:model/Field} field
   */
  exports.prototype['field'] = undefined;
  /**
   * @member {Array.<module:model/ResourcePoolFieldValue>} fieldValues
   */
  exports.prototype['fieldValues'] = undefined;



  return exports;
}));


