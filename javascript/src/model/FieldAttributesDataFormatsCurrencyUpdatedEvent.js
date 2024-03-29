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
    define(['ApiClient', 'model/Currency', 'model/PortfolioPlan'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Currency'), require('./PortfolioPlan'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.FieldAttributesDataFormatsCurrencyUpdatedEvent = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.Currency, root.DecisionLensApi.PortfolioPlan);
  }
}(this, function(ApiClient, Currency, PortfolioPlan) {
  'use strict';




  /**
   * The FieldAttributesDataFormatsCurrencyUpdatedEvent model module.
   * @module model/FieldAttributesDataFormatsCurrencyUpdatedEvent
   * @version 1.0
   */

  /**
   * Constructs a new <code>FieldAttributesDataFormatsCurrencyUpdatedEvent</code>.
   * @alias module:model/FieldAttributesDataFormatsCurrencyUpdatedEvent
   * @class
   */
  var exports = function() {
    var _this = this;







  };

  /**
   * Constructs a <code>FieldAttributesDataFormatsCurrencyUpdatedEvent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FieldAttributesDataFormatsCurrencyUpdatedEvent} obj Optional instance to populate.
   * @return {module:model/FieldAttributesDataFormatsCurrencyUpdatedEvent} The populated <code>FieldAttributesDataFormatsCurrencyUpdatedEvent</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('portfolioId')) {
        obj['portfolioId'] = ApiClient.convertToType(data['portfolioId'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('currency')) {
        obj['currency'] = Currency.constructFromObject(data['currency']);
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('portfolioPlan')) {
        obj['portfolioPlan'] = PortfolioPlan.constructFromObject(data['portfolioPlan']);
      }
      if (data.hasOwnProperty('previousCurrency')) {
        obj['previousCurrency'] = Currency.constructFromObject(data['previousCurrency']);
      }
    }
    return obj;
  }

  /**
   * @member {String} portfolioId
   */
  exports.prototype['portfolioId'] = undefined;
  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {module:model/Currency} currency
   */
  exports.prototype['currency'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {module:model/PortfolioPlan} portfolioPlan
   */
  exports.prototype['portfolioPlan'] = undefined;
  /**
   * @member {module:model/Currency} previousCurrency
   */
  exports.prototype['previousCurrency'] = undefined;



  return exports;
}));


