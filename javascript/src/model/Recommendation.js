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
    define(['ApiClient', 'model/FieldValues', 'model/PortfolioPlanInsights', 'model/Project', 'model/RecommendationType'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./FieldValues'), require('./PortfolioPlanInsights'), require('./Project'), require('./RecommendationType'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.Recommendation = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.FieldValues, root.DecisionLensApi.PortfolioPlanInsights, root.DecisionLensApi.Project, root.DecisionLensApi.RecommendationType);
  }
}(this, function(ApiClient, FieldValues, PortfolioPlanInsights, Project, RecommendationType) {
  'use strict';




  /**
   * The Recommendation model module.
   * @module model/Recommendation
   * @version 1.0
   */

  /**
   * Constructs a new <code>Recommendation</code>.
   * @alias module:model/Recommendation
   * @class
   */
  var exports = function() {
    var _this = this;





  };

  /**
   * Constructs a <code>Recommendation</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Recommendation} obj Optional instance to populate.
   * @return {module:model/Recommendation} The populated <code>Recommendation</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('type')) {
        obj['type'] = RecommendationType.constructFromObject(data['type']);
      }
      if (data.hasOwnProperty('fieldValues')) {
        obj['fieldValues'] = FieldValues.constructFromObject(data['fieldValues']);
      }
      if (data.hasOwnProperty('portfolioPlanInsights')) {
        obj['portfolioPlanInsights'] = PortfolioPlanInsights.constructFromObject(data['portfolioPlanInsights']);
      }
      if (data.hasOwnProperty('project')) {
        obj['project'] = Project.constructFromObject(data['project']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/RecommendationType} type
   */
  exports.prototype['type'] = undefined;
  /**
   * @member {module:model/FieldValues} fieldValues
   */
  exports.prototype['fieldValues'] = undefined;
  /**
   * @member {module:model/PortfolioPlanInsights} portfolioPlanInsights
   */
  exports.prototype['portfolioPlanInsights'] = undefined;
  /**
   * @member {module:model/Project} project
   */
  exports.prototype['project'] = undefined;



  return exports;
}));


