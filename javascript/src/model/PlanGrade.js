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
    define(['ApiClient', 'model/DlResource', 'model/FieldGrades', 'model/Grade', 'model/PlanType'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DlResource'), require('./FieldGrades'), require('./Grade'), require('./PlanType'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.PlanGrade = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.DlResource, root.DecisionLensApi.FieldGrades, root.DecisionLensApi.Grade, root.DecisionLensApi.PlanType);
  }
}(this, function(ApiClient, DlResource, FieldGrades, Grade, PlanType) {
  'use strict';




  /**
   * The PlanGrade model module.
   * @module model/PlanGrade
   * @version 1.0
   */

  /**
   * Constructs a new <code>PlanGrade</code>.
   * @alias module:model/PlanGrade
   * @class
   * @extends module:model/DlResource
   */
  var exports = function() {
    var _this = this;
    DlResource.call(_this);



  };

  /**
   * Constructs a <code>PlanGrade</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PlanGrade} obj Optional instance to populate.
   * @return {module:model/PlanGrade} The populated <code>PlanGrade</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      DlResource.constructFromObject(data, obj);
      if (data.hasOwnProperty('type')) {
        obj['type'] = PlanType.constructFromObject(data['type']);
      }
      if (data.hasOwnProperty('grade')) {
        obj['grade'] = Grade.constructFromObject(data['grade']);
      }
      if (data.hasOwnProperty('fieldGrades')) {
        obj['fieldGrades'] = FieldGrades.constructFromObject(data['fieldGrades']);
      }
    }
    return obj;
  }

  exports.prototype = Object.create(DlResource.prototype);
  exports.prototype.constructor = exports;

  /**
   * @member {module:model/PlanType} type
   */
  exports.prototype['type'] = undefined;
  /**
   * @member {module:model/Grade} grade
   */
  exports.prototype['grade'] = undefined;
  /**
   * @member {module:model/FieldGrades} fieldGrades
   */
  exports.prototype['fieldGrades'] = undefined;



  return exports;
}));


