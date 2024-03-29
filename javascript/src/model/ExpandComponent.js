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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.ExpandComponent = factory(root.DecisionLensApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ExpandComponent model module.
   * @module model/ExpandComponent
   * @version 1.0
   */

  /**
   * Constructs a new <code>ExpandComponent</code>.
   * @alias module:model/ExpandComponent
   * @class
   */
  var exports = function() {
    var _this = this;








  };

  /**
   * Constructs a <code>ExpandComponent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ExpandComponent} obj Optional instance to populate.
   * @return {module:model/ExpandComponent} The populated <code>ExpandComponent</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('path')) {
        obj['path'] = ApiClient.convertToType(data['path'], 'String');
      }
      if (data.hasOwnProperty('match')) {
        obj['match'] = ApiClient.convertToType(data['match'], 'String');
      }
      if (data.hasOwnProperty('allPossible')) {
        obj['allPossible'] = ApiClient.convertToType(data['allPossible'], 'Boolean');
      }
      if (data.hasOwnProperty('unique')) {
        obj['unique'] = ApiClient.convertToType(data['unique'], 'Boolean');
      }
      if (data.hasOwnProperty('limit')) {
        obj['limit'] = ApiClient.convertToType(data['limit'], 'Number');
      }
      if (data.hasOwnProperty('offset')) {
        obj['offset'] = ApiClient.convertToType(data['offset'], 'Number');
      }
      if (data.hasOwnProperty('orderBy')) {
        obj['orderBy'] = ApiClient.convertToType(data['orderBy'], 'String');
      }
    }
    return obj;
  }

  /**
   * path to the collection. example - items.fieldValues
   * @member {String} path
   */
  exports.prototype['path'] = undefined;
  /**
   * filter the collection. example - \"field.id:123-12321-321312-e3e21w\"
   * @member {String} match
   */
  exports.prototype['match'] = undefined;
  /**
   * return all possible values in the collection even if they are not assigned to projects currently like all STATUS values.
   * @member {Boolean} allPossible
   */
  exports.prototype['allPossible'] = undefined;
  /**
   * return only unique values in the collection
   * @member {Boolean} unique
   */
  exports.prototype['unique'] = undefined;
  /**
   * pagination - limit
   * @member {Number} limit
   */
  exports.prototype['limit'] = undefined;
  /**
   * pagination - offset
   * @member {Number} offset
   */
  exports.prototype['offset'] = undefined;
  /**
   * order the values returned in the collection
   * @member {String} orderBy
   */
  exports.prototype['orderBy'] = undefined;



  return exports;
}));


