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
    define(['ApiClient', 'model/DlCollection', 'model/PortfolioPlan'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DlCollection'), require('./PortfolioPlan'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.PortfolioPlans = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.DlCollection, root.DecisionLensApi.PortfolioPlan);
  }
}(this, function(ApiClient, DlCollection, PortfolioPlan) {
  'use strict';




  /**
   * The PortfolioPlans model module.
   * @module model/PortfolioPlans
   * @version 1.0
   */

  /**
   * Constructs a new <code>PortfolioPlans</code>.
   * @alias module:model/PortfolioPlans
   * @class
   * @extends module:model/DlCollection
   */
  var exports = function() {
    var _this = this;
    DlCollection.call(_this);

  };

  /**
   * Constructs a <code>PortfolioPlans</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PortfolioPlans} obj Optional instance to populate.
   * @return {module:model/PortfolioPlans} The populated <code>PortfolioPlans</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      DlCollection.constructFromObject(data, obj);
      if (data.hasOwnProperty('items')) {
        obj['items'] = ApiClient.convertToType(data['items'], [PortfolioPlan]);
      }
    }
    return obj;
  }

  exports.prototype = Object.create(DlCollection.prototype);
  exports.prototype.constructor = exports;

  /**
   * @member {Array.<module:model/PortfolioPlan>} items
   */
  exports.prototype['items'] = undefined;



  return exports;
}));


