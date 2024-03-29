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
    define(['ApiClient', 'model/Field'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Field'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.FieldsDeletedMessagePayload = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.Field);
  }
}(this, function(ApiClient, Field) {
  'use strict';




  /**
   * The FieldsDeletedMessagePayload model module.
   * @module model/FieldsDeletedMessagePayload
   * @version 1.0
   */

  /**
   * Constructs a new <code>FieldsDeletedMessagePayload</code>.
   * @alias module:model/FieldsDeletedMessagePayload
   * @class
   * @param fields {Array.<module:model/Field>} 
   */
  var exports = function(fields) {
    var _this = this;


    _this['fields'] = fields;
  };

  /**
   * Constructs a <code>FieldsDeletedMessagePayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FieldsDeletedMessagePayload} obj Optional instance to populate.
   * @return {module:model/FieldsDeletedMessagePayload} The populated <code>FieldsDeletedMessagePayload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('portfolioId')) {
        obj['portfolioId'] = ApiClient.convertToType(data['portfolioId'], 'String');
      }
      if (data.hasOwnProperty('fields')) {
        obj['fields'] = ApiClient.convertToType(data['fields'], [Field]);
      }
    }
    return obj;
  }

  /**
   * @member {String} portfolioId
   */
  exports.prototype['portfolioId'] = undefined;
  /**
   * @member {Array.<module:model/Field>} fields
   */
  exports.prototype['fields'] = undefined;



  return exports;
}));


