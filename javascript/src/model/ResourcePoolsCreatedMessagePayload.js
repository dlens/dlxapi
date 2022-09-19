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
    define(['ApiClient', 'model/ResourcePool'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./ResourcePool'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.ResourcePoolsCreatedMessagePayload = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.ResourcePool);
  }
}(this, function(ApiClient, ResourcePool) {
  'use strict';




  /**
   * The ResourcePoolsCreatedMessagePayload model module.
   * @module model/ResourcePoolsCreatedMessagePayload
   * @version 1.0
   */

  /**
   * Constructs a new <code>ResourcePoolsCreatedMessagePayload</code>.
   * @alias module:model/ResourcePoolsCreatedMessagePayload
   * @class
   * @param resourcePools {Array.<module:model/ResourcePool>} 
   */
  var exports = function(resourcePools) {
    var _this = this;

    _this['resourcePools'] = resourcePools;
  };

  /**
   * Constructs a <code>ResourcePoolsCreatedMessagePayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ResourcePoolsCreatedMessagePayload} obj Optional instance to populate.
   * @return {module:model/ResourcePoolsCreatedMessagePayload} The populated <code>ResourcePoolsCreatedMessagePayload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('resourcePools')) {
        obj['resourcePools'] = ApiClient.convertToType(data['resourcePools'], [ResourcePool]);
      }
    }
    return obj;
  }

  /**
   * @member {Array.<module:model/ResourcePool>} resourcePools
   */
  exports.prototype['resourcePools'] = undefined;



  return exports;
}));


