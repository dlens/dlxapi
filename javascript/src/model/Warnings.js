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
    root.DecisionLensApi.Warnings = factory(root.DecisionLensApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Warnings model module.
   * @module model/Warnings
   * @version 1.0
   */

  /**
   * Constructs a new <code>Warnings</code>.
   * @alias module:model/Warnings
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>Warnings</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Warnings} obj Optional instance to populate.
   * @return {module:model/Warnings} The populated <code>Warnings</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('size')) {
        obj['size'] = ApiClient.convertToType(data['size'], 'Number');
      }
      if (data.hasOwnProperty('messages')) {
        obj['messages'] = ApiClient.convertToType(data['messages'], ['String']);
      }
    }
    return obj;
  }

  /**
   * @member {Number} size
   */
  exports.prototype['size'] = undefined;
  /**
   * @member {Array.<String>} messages
   */
  exports.prototype['messages'] = undefined;



  return exports;
}));


