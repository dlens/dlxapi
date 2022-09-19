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
    define(['ApiClient', 'model/CalculationType', 'model/FieldType', 'model/PortfolioPlan'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CalculationType'), require('./FieldType'), require('./PortfolioPlan'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.FieldCalculationTypeUpdatedEvent = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.CalculationType, root.DecisionLensApi.FieldType, root.DecisionLensApi.PortfolioPlan);
  }
}(this, function(ApiClient, CalculationType, FieldType, PortfolioPlan) {
  'use strict';




  /**
   * The FieldCalculationTypeUpdatedEvent model module.
   * @module model/FieldCalculationTypeUpdatedEvent
   * @version 1.0
   */

  /**
   * Constructs a new <code>FieldCalculationTypeUpdatedEvent</code>.
   * @alias module:model/FieldCalculationTypeUpdatedEvent
   * @class
   */
  var exports = function() {
    var _this = this;








  };

  /**
   * Constructs a <code>FieldCalculationTypeUpdatedEvent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FieldCalculationTypeUpdatedEvent} obj Optional instance to populate.
   * @return {module:model/FieldCalculationTypeUpdatedEvent} The populated <code>FieldCalculationTypeUpdatedEvent</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('calculationType')) {
        obj['calculationType'] = CalculationType.constructFromObject(data['calculationType']);
      }
      if (data.hasOwnProperty('portfolioId')) {
        obj['portfolioId'] = ApiClient.convertToType(data['portfolioId'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('previousCalculationType')) {
        obj['previousCalculationType'] = CalculationType.constructFromObject(data['previousCalculationType']);
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('fieldType')) {
        obj['fieldType'] = FieldType.constructFromObject(data['fieldType']);
      }
      if (data.hasOwnProperty('portfolioPlan')) {
        obj['portfolioPlan'] = PortfolioPlan.constructFromObject(data['portfolioPlan']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/CalculationType} calculationType
   */
  exports.prototype['calculationType'] = undefined;
  /**
   * @member {String} portfolioId
   */
  exports.prototype['portfolioId'] = undefined;
  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {module:model/CalculationType} previousCalculationType
   */
  exports.prototype['previousCalculationType'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {module:model/FieldType} fieldType
   */
  exports.prototype['fieldType'] = undefined;
  /**
   * @member {module:model/PortfolioPlan} portfolioPlan
   */
  exports.prototype['portfolioPlan'] = undefined;



  return exports;
}));


