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
    define(['ApiClient', 'model/PortfolioPlansWithProjects', 'model/ProjectSummary'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./PortfolioPlansWithProjects'), require('./ProjectSummary'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.WhatsIn = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.PortfolioPlansWithProjects, root.DecisionLensApi.ProjectSummary);
  }
}(this, function(ApiClient, PortfolioPlansWithProjects, ProjectSummary) {
  'use strict';




  /**
   * The WhatsIn model module.
   * @module model/WhatsIn
   * @version 1.0
   */

  /**
   * Constructs a new <code>WhatsIn</code>.
   * @alias module:model/WhatsIn
   * @class
   */
  var exports = function() {
    var _this = this;







  };

  /**
   * Constructs a <code>WhatsIn</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/WhatsIn} obj Optional instance to populate.
   * @return {module:model/WhatsIn} The populated <code>WhatsIn</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('projectSummaries')) {
        obj['projectSummaries'] = ApiClient.convertToType(data['projectSummaries'], [ProjectSummary]);
      }
      if (data.hasOwnProperty('portfolioPlansWithProjects')) {
        obj['portfolioPlansWithProjects'] = ApiClient.convertToType(data['portfolioPlansWithProjects'], [PortfolioPlansWithProjects]);
      }
      if (data.hasOwnProperty('maxSize')) {
        obj['maxSize'] = ApiClient.convertToType(data['maxSize'], 'Number');
      }
      if (data.hasOwnProperty('maxLimit')) {
        obj['maxLimit'] = ApiClient.convertToType(data['maxLimit'], 'Number');
      }
      if (data.hasOwnProperty('offset')) {
        obj['offset'] = ApiClient.convertToType(data['offset'], 'Number');
      }
      if (data.hasOwnProperty('href')) {
        obj['href'] = ApiClient.convertToType(data['href'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Array.<module:model/ProjectSummary>} projectSummaries
   */
  exports.prototype['projectSummaries'] = undefined;
  /**
   * @member {Array.<module:model/PortfolioPlansWithProjects>} portfolioPlansWithProjects
   */
  exports.prototype['portfolioPlansWithProjects'] = undefined;
  /**
   * @member {Number} maxSize
   */
  exports.prototype['maxSize'] = undefined;
  /**
   * @member {Number} maxLimit
   */
  exports.prototype['maxLimit'] = undefined;
  /**
   * @member {Number} offset
   */
  exports.prototype['offset'] = undefined;
  /**
   * @member {String} href
   */
  exports.prototype['href'] = undefined;



  return exports;
}));


