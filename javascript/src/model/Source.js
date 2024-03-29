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
    define(['ApiClient', 'model/DlResource', 'model/DlcPortfolio', 'model/Fields', 'model/Portfolio', 'model/Projects', 'model/SourceType'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DlResource'), require('./DlcPortfolio'), require('./Fields'), require('./Portfolio'), require('./Projects'), require('./SourceType'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.Source = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.DlResource, root.DecisionLensApi.DlcPortfolio, root.DecisionLensApi.Fields, root.DecisionLensApi.Portfolio, root.DecisionLensApi.Projects, root.DecisionLensApi.SourceType);
  }
}(this, function(ApiClient, DlResource, DlcPortfolio, Fields, Portfolio, Projects, SourceType) {
  'use strict';




  /**
   * The Source model module.
   * @module model/Source
   * @version 1.0
   */

  /**
   * Constructs a new <code>Source</code>.
   * @alias module:model/Source
   * @class
   * @extends module:model/DlResource
   * @param type {module:model/SourceType} 
   */
  var exports = function(type) {
    var _this = this;
    DlResource.call(_this);

    _this['type'] = type;




  };

  /**
   * Constructs a <code>Source</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Source} obj Optional instance to populate.
   * @return {module:model/Source} The populated <code>Source</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      DlResource.constructFromObject(data, obj);
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = SourceType.constructFromObject(data['type']);
      }
      if (data.hasOwnProperty('portfolio')) {
        obj['portfolio'] = Portfolio.constructFromObject(data['portfolio']);
      }
      if (data.hasOwnProperty('fields')) {
        obj['fields'] = Fields.constructFromObject(data['fields']);
      }
      if (data.hasOwnProperty('projects')) {
        obj['projects'] = Projects.constructFromObject(data['projects']);
      }
      if (data.hasOwnProperty('dlcPortfolio')) {
        obj['dlcPortfolio'] = DlcPortfolio.constructFromObject(data['dlcPortfolio']);
      }
    }
    return obj;
  }

  exports.prototype = Object.create(DlResource.prototype);
  exports.prototype.constructor = exports;

  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {module:model/SourceType} type
   */
  exports.prototype['type'] = undefined;
  /**
   * @member {module:model/Portfolio} portfolio
   */
  exports.prototype['portfolio'] = undefined;
  /**
   * @member {module:model/Fields} fields
   */
  exports.prototype['fields'] = undefined;
  /**
   * @member {module:model/Projects} projects
   */
  exports.prototype['projects'] = undefined;
  /**
   * @member {module:model/DlcPortfolio} dlcPortfolio
   */
  exports.prototype['dlcPortfolio'] = undefined;



  return exports;
}));


