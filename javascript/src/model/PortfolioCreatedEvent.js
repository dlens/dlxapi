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
    define(['ApiClient', 'model/Attributes', 'model/PortfolioPlan'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Attributes'), require('./PortfolioPlan'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.PortfolioCreatedEvent = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.Attributes, root.DecisionLensApi.PortfolioPlan);
  }
}(this, function(ApiClient, Attributes, PortfolioPlan) {
  'use strict';




  /**
   * The PortfolioCreatedEvent model module.
   * @module model/PortfolioCreatedEvent
   * @version 1.0
   */

  /**
   * Constructs a new <code>PortfolioCreatedEvent</code>.
   * @alias module:model/PortfolioCreatedEvent
   * @class
   */
  var exports = function() {
    var _this = this;











  };

  /**
   * Constructs a <code>PortfolioCreatedEvent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PortfolioCreatedEvent} obj Optional instance to populate.
   * @return {module:model/PortfolioCreatedEvent} The populated <code>PortfolioCreatedEvent</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('portfolioId')) {
        obj['portfolioId'] = ApiClient.convertToType(data['portfolioId'], 'String');
      }
      if (data.hasOwnProperty('userRegistrationToken')) {
        obj['userRegistrationToken'] = ApiClient.convertToType(data['userRegistrationToken'], 'String');
      }
      if (data.hasOwnProperty('isArchived')) {
        obj['isArchived'] = ApiClient.convertToType(data['isArchived'], 'Boolean');
      }
      if (data.hasOwnProperty('groupId')) {
        obj['groupId'] = ApiClient.convertToType(data['groupId'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('isCombined')) {
        obj['isCombined'] = ApiClient.convertToType(data['isCombined'], 'Boolean');
      }
      if (data.hasOwnProperty('attributes')) {
        obj['attributes'] = Attributes.constructFromObject(data['attributes']);
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('portfolioPlan')) {
        obj['portfolioPlan'] = PortfolioPlan.constructFromObject(data['portfolioPlan']);
      }
    }
    return obj;
  }

  /**
   * @member {String} portfolioId
   */
  exports.prototype['portfolioId'] = undefined;
  /**
   * @member {String} userRegistrationToken
   */
  exports.prototype['userRegistrationToken'] = undefined;
  /**
   * @member {Boolean} isArchived
   */
  exports.prototype['isArchived'] = undefined;
  /**
   * @member {String} groupId
   */
  exports.prototype['groupId'] = undefined;
  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * @member {Boolean} isCombined
   */
  exports.prototype['isCombined'] = undefined;
  /**
   * @member {module:model/Attributes} attributes
   */
  exports.prototype['attributes'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {module:model/PortfolioPlan} portfolioPlan
   */
  exports.prototype['portfolioPlan'] = undefined;



  return exports;
}));

