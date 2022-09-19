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
    root.DecisionLensApi.SourceType = factory(root.DecisionLensApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';


  /**
   * Enum class SourceType.
   * @enum {}
   * @readonly
   */
  var exports = {
    /**
     * value: "ESTIMATE"
     * @const
     */
    "ESTIMATE": "ESTIMATE",
    /**
     * value: "GOOGLESHEETS"
     * @const
     */
    "GOOGLESHEETS": "GOOGLESHEETS",
    /**
     * value: "MANUALENTRY"
     * @const
     */
    "MANUALENTRY": "MANUALENTRY",
    /**
     * value: "SPREADSHEET"
     * @const
     */
    "SPREADSHEET": "SPREADSHEET",
    /**
     * value: "SYSTEM"
     * @const
     */
    "SYSTEM": "SYSTEM",
    /**
     * value: "DLC"
     * @const
     */
    "DLC": "DLC"  };

  /**
   * Returns a <code>SourceType</code> enum value from a Javascript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
   * @return {module:model/SourceType} The enum <code>SourceType</code> value.
   */
  exports.constructFromObject = function(object) {
    return object;
  }

  return exports;
}));


