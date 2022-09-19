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
    define(['ApiClient', 'model/Field', 'model/FieldValue', 'model/FieldValues', 'model/Project', 'model/ResourcePool', 'model/TimePeriod'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Field'), require('./FieldValue'), require('./FieldValues'), require('./Project'), require('./ResourcePool'), require('./TimePeriod'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.ResourcePoolFieldValue = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.Field, root.DecisionLensApi.FieldValue, root.DecisionLensApi.FieldValues, root.DecisionLensApi.Project, root.DecisionLensApi.ResourcePool, root.DecisionLensApi.TimePeriod);
  }
}(this, function(ApiClient, Field, FieldValue, FieldValues, Project, ResourcePool, TimePeriod) {
  'use strict';




  /**
   * The ResourcePoolFieldValue model module.
   * @module model/ResourcePoolFieldValue
   * @version 1.0
   */

  /**
   * Constructs a new <code>ResourcePoolFieldValue</code>.
   * @alias module:model/ResourcePoolFieldValue
   * @class
   * @extends module:model/FieldValue
   */
  var exports = function() {
    var _this = this;
    FieldValue.call(_this);

  };

  /**
   * Constructs a <code>ResourcePoolFieldValue</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ResourcePoolFieldValue} obj Optional instance to populate.
   * @return {module:model/ResourcePoolFieldValue} The populated <code>ResourcePoolFieldValue</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      FieldValue.constructFromObject(data, obj);
      if (data.hasOwnProperty('resourcePool')) {
        obj['resourcePool'] = ResourcePool.constructFromObject(data['resourcePool']);
      }
    }
    return obj;
  }

  exports.prototype = Object.create(FieldValue.prototype);
  exports.prototype.constructor = exports;

  /**
   * @member {module:model/ResourcePool} resourcePool
   */
  exports.prototype['resourcePool'] = undefined;



  return exports;
}));


