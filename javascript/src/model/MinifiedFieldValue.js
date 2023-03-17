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
    define(['ApiClient', 'model/MinifiedYearlyFieldValue'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./MinifiedYearlyFieldValue'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.MinifiedFieldValue = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.MinifiedYearlyFieldValue);
  }
}(this, function(ApiClient, MinifiedYearlyFieldValue) {
  'use strict';




  /**
   * The MinifiedFieldValue model module.
   * @module model/MinifiedFieldValue
   * @version 1.0
   */

  /**
   * Constructs a new <code>MinifiedFieldValue</code>.
   * @alias module:model/MinifiedFieldValue
   * @class
   */
  var exports = function() {
    var _this = this;








  };

  /**
   * Constructs a <code>MinifiedFieldValue</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MinifiedFieldValue} obj Optional instance to populate.
   * @return {module:model/MinifiedFieldValue} The populated <code>MinifiedFieldValue</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('v')) {
        obj['v'] = ApiClient.convertToType(data['v'], 'String');
      }
      if (data.hasOwnProperty('nv')) {
        obj['nv'] = ApiClient.convertToType(data['nv'], 'Number');
      }
      if (data.hasOwnProperty('bv')) {
        obj['bv'] = ApiClient.convertToType(data['bv'], 'Boolean');
      }
      if (data.hasOwnProperty('yrs')) {
        obj['yrs'] = ApiClient.convertToType(data['yrs'], {'String': MinifiedYearlyFieldValue});
      }
      if (data.hasOwnProperty('mns')) {
        obj['mns'] = ApiClient.convertToType(data['mns'], {'String': 'Number'});
      }
      if (data.hasOwnProperty('vs')) {
        obj['vs'] = ApiClient.convertToType(data['vs'], ['String']);
      }
      if (data.hasOwnProperty('nvs')) {
        obj['nvs'] = ApiClient.convertToType(data['nvs'], ['Number']);
      }
    }
    return obj;
  }

  /**
   * Text value
   * @member {String} v
   */
  exports.prototype['v'] = undefined;
  /**
   * Numeric Value
   * @member {Number} nv
   */
  exports.prototype['nv'] = undefined;
  /**
   * Boolean Value
   * @member {Boolean} bv
   */
  exports.prototype['bv'] = undefined;
  /**
   * Yearly cost/allocate data
   * @member {Object.<String, module:model/MinifiedYearlyFieldValue>} yrs
   */
  exports.prototype['yrs'] = undefined;
  /**
   * Monthly cost/allocate data
   * @member {Object.<String, Number>} mns
   */
  exports.prototype['mns'] = undefined;
  /**
   * @member {Array.<String>} vs
   */
  exports.prototype['vs'] = undefined;
  /**
   * @member {Array.<Number>} nvs
   */
  exports.prototype['nvs'] = undefined;



  return exports;
}));

