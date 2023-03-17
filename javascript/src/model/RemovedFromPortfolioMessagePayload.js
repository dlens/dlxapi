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
    define(['ApiClient', 'model/Portfolio'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Portfolio'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.RemovedFromPortfolioMessagePayload = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.Portfolio);
  }
}(this, function(ApiClient, Portfolio) {
  'use strict';




  /**
   * The RemovedFromPortfolioMessagePayload model module.
   * @module model/RemovedFromPortfolioMessagePayload
   * @version 1.0
   */

  /**
   * Constructs a new <code>RemovedFromPortfolioMessagePayload</code>.
   * @alias module:model/RemovedFromPortfolioMessagePayload
   * @class
   * @param portfolio {module:model/Portfolio} 
   */
  var exports = function(portfolio) {
    var _this = this;

    _this['portfolio'] = portfolio;
  };

  /**
   * Constructs a <code>RemovedFromPortfolioMessagePayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RemovedFromPortfolioMessagePayload} obj Optional instance to populate.
   * @return {module:model/RemovedFromPortfolioMessagePayload} The populated <code>RemovedFromPortfolioMessagePayload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('portfolio')) {
        obj['portfolio'] = Portfolio.constructFromObject(data['portfolio']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/Portfolio} portfolio
   */
  exports.prototype['portfolio'] = undefined;



  return exports;
}));

