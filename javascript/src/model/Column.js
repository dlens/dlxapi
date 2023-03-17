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
    define(['ApiClient', 'model/ColumnType'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./ColumnType'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.Column = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.ColumnType);
  }
}(this, function(ApiClient, ColumnType) {
  'use strict';




  /**
   * The Column model module.
   * @module model/Column
   * @version 1.0
   */

  /**
   * Constructs a new <code>Column</code>.
   * @alias module:model/Column
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>Column</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Column} obj Optional instance to populate.
   * @return {module:model/Column} The populated <code>Column</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('fieldId')) {
        obj['fieldId'] = ApiClient.convertToType(data['fieldId'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ColumnType.constructFromObject(data['type']);
      }
    }
    return obj;
  }

  /**
   * @member {String} fieldId
   */
  exports.prototype['fieldId'] = undefined;
  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {module:model/ColumnType} type
   */
  exports.prototype['type'] = undefined;



  return exports;
}));

