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
    define(['ApiClient', 'model/Field', 'model/PortfolioPlan', 'model/TimePeriod'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Field'), require('./PortfolioPlan'), require('./TimePeriod'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.ProjectPortfolioPlanFieldValueUpdatedEvent = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.Field, root.DecisionLensApi.PortfolioPlan, root.DecisionLensApi.TimePeriod);
  }
}(this, function(ApiClient, Field, PortfolioPlan, TimePeriod) {
  'use strict';




  /**
   * The ProjectPortfolioPlanFieldValueUpdatedEvent model module.
   * @module model/ProjectPortfolioPlanFieldValueUpdatedEvent
   * @version 1.0
   */

  /**
   * Constructs a new <code>ProjectPortfolioPlanFieldValueUpdatedEvent</code>.
   * @alias module:model/ProjectPortfolioPlanFieldValueUpdatedEvent
   * @class
   */
  var exports = function() {
    var _this = this;













  };

  /**
   * Constructs a <code>ProjectPortfolioPlanFieldValueUpdatedEvent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ProjectPortfolioPlanFieldValueUpdatedEvent} obj Optional instance to populate.
   * @return {module:model/ProjectPortfolioPlanFieldValueUpdatedEvent} The populated <code>ProjectPortfolioPlanFieldValueUpdatedEvent</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('portfolioId')) {
        obj['portfolioId'] = ApiClient.convertToType(data['portfolioId'], 'String');
      }
      if (data.hasOwnProperty('field')) {
        obj['field'] = Field.constructFromObject(data['field']);
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('timePeriod')) {
        obj['timePeriod'] = TimePeriod.constructFromObject(data['timePeriod']);
      }
      if (data.hasOwnProperty('numericValue')) {
        obj['numericValue'] = ApiClient.convertToType(data['numericValue'], 'Number');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('previousNumericValue')) {
        obj['previousNumericValue'] = ApiClient.convertToType(data['previousNumericValue'], 'Number');
      }
      if (data.hasOwnProperty('isRebaseline')) {
        obj['isRebaseline'] = ApiClient.convertToType(data['isRebaseline'], 'Boolean');
      }
      if (data.hasOwnProperty('value')) {
        obj['value'] = ApiClient.convertToType(data['value'], 'String');
      }
      if (data.hasOwnProperty('previousValue')) {
        obj['previousValue'] = ApiClient.convertToType(data['previousValue'], 'String');
      }
      if (data.hasOwnProperty('portfolioPlan')) {
        obj['portfolioPlan'] = PortfolioPlan.constructFromObject(data['portfolioPlan']);
      }
      if (data.hasOwnProperty('isFromImport')) {
        obj['isFromImport'] = ApiClient.convertToType(data['isFromImport'], 'Boolean');
      }
    }
    return obj;
  }

  /**
   * @member {String} portfolioId
   */
  exports.prototype['portfolioId'] = undefined;
  /**
   * @member {module:model/Field} field
   */
  exports.prototype['field'] = undefined;
  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {module:model/TimePeriod} timePeriod
   */
  exports.prototype['timePeriod'] = undefined;
  /**
   * @member {Number} numericValue
   */
  exports.prototype['numericValue'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {Number} previousNumericValue
   */
  exports.prototype['previousNumericValue'] = undefined;
  /**
   * @member {Boolean} isRebaseline
   */
  exports.prototype['isRebaseline'] = undefined;
  /**
   * @member {String} value
   */
  exports.prototype['value'] = undefined;
  /**
   * @member {String} previousValue
   */
  exports.prototype['previousValue'] = undefined;
  /**
   * @member {module:model/PortfolioPlan} portfolioPlan
   */
  exports.prototype['portfolioPlan'] = undefined;
  /**
   * @member {Boolean} isFromImport
   */
  exports.prototype['isFromImport'] = undefined;



  return exports;
}));


