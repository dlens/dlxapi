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
    define(['ApiClient', 'model/ScoreWeight'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./ScoreWeight'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.ScoreWeightsUpdatedMessagePayload = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.ScoreWeight);
  }
}(this, function(ApiClient, ScoreWeight) {
  'use strict';




  /**
   * The ScoreWeightsUpdatedMessagePayload model module.
   * @module model/ScoreWeightsUpdatedMessagePayload
   * @version 1.0
   */

  /**
   * Constructs a new <code>ScoreWeightsUpdatedMessagePayload</code>.
   * @alias module:model/ScoreWeightsUpdatedMessagePayload
   * @class
   * @param portfolioId {String} 
   */
  var exports = function(portfolioId) {
    var _this = this;

    _this['portfolioId'] = portfolioId;

  };

  /**
   * Constructs a <code>ScoreWeightsUpdatedMessagePayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ScoreWeightsUpdatedMessagePayload} obj Optional instance to populate.
   * @return {module:model/ScoreWeightsUpdatedMessagePayload} The populated <code>ScoreWeightsUpdatedMessagePayload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('portfolioId')) {
        obj['portfolioId'] = ApiClient.convertToType(data['portfolioId'], 'String');
      }
      if (data.hasOwnProperty('scoreWeights')) {
        obj['scoreWeights'] = ApiClient.convertToType(data['scoreWeights'], [ScoreWeight]);
      }
    }
    return obj;
  }

  /**
   * @member {String} portfolioId
   */
  exports.prototype['portfolioId'] = undefined;
  /**
   * @member {Array.<module:model/ScoreWeight>} scoreWeights
   */
  exports.prototype['scoreWeights'] = undefined;



  return exports;
}));


