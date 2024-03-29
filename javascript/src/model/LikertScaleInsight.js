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
    define(['ApiClient', 'model/LikertScaleType'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./LikertScaleType'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.LikertScaleInsight = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.LikertScaleType);
  }
}(this, function(ApiClient, LikertScaleType) {
  'use strict';




  /**
   * The LikertScaleInsight model module.
   * @module model/LikertScaleInsight
   * @version 1.0
   */

  /**
   * Constructs a new <code>LikertScaleInsight</code>.
   * @alias module:model/LikertScaleInsight
   * @class
   * @param type {module:model/LikertScaleType} 
   */
  var exports = function(type) {
    var _this = this;

    _this['type'] = type;

  };

  /**
   * Constructs a <code>LikertScaleInsight</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LikertScaleInsight} obj Optional instance to populate.
   * @return {module:model/LikertScaleInsight} The populated <code>LikertScaleInsight</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('type')) {
        obj['type'] = LikertScaleType.constructFromObject(data['type']);
      }
      if (data.hasOwnProperty('projectIds')) {
        obj['projectIds'] = ApiClient.convertToType(data['projectIds'], ['String']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/LikertScaleType} type
   */
  exports.prototype['type'] = undefined;
  /**
   * @member {Array.<String>} projectIds
   */
  exports.prototype['projectIds'] = undefined;



  return exports;
}));


