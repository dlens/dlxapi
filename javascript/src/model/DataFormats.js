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
    define(['ApiClient', 'model/Currency', 'model/Negatives'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Currency'), require('./Negatives'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.DataFormats = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.Currency, root.DecisionLensApi.Negatives);
  }
}(this, function(ApiClient, Currency, Negatives) {
  'use strict';




  /**
   * The DataFormats model module.
   * @module model/DataFormats
   * @version 1.0
   */

  /**
   * Constructs a new <code>DataFormats</code>.
   * @alias module:model/DataFormats
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>DataFormats</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DataFormats} obj Optional instance to populate.
   * @return {module:model/DataFormats} The populated <code>DataFormats</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('decimalPlaces')) {
        obj['decimalPlaces'] = ApiClient.convertToType(data['decimalPlaces'], 'Number');
      }
      if (data.hasOwnProperty('currency')) {
        obj['currency'] = Currency.constructFromObject(data['currency']);
      }
      if (data.hasOwnProperty('negatives')) {
        obj['negatives'] = Negatives.constructFromObject(data['negatives']);
      }
    }
    return obj;
  }

  /**
   * @member {Number} decimalPlaces
   */
  exports.prototype['decimalPlaces'] = undefined;
  /**
   * @member {module:model/Currency} currency
   */
  exports.prototype['currency'] = undefined;
  /**
   * @member {module:model/Negatives} negatives
   */
  exports.prototype['negatives'] = undefined;



  return exports;
}));

