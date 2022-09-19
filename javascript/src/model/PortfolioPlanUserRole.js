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
    root.DecisionLensApi.PortfolioPlanUserRole = factory(root.DecisionLensApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';


  /**
   * Enum class PortfolioPlanUserRole.
   * @enum {}
   * @readonly
   */
  var exports = {
    /**
     * value: "OWNER"
     * @const
     */
    "OWNER": "OWNER",
    /**
     * value: "VIEWER"
     * @const
     */
    "VIEWER": "VIEWER",
    /**
     * value: "VIEWER_COMBINED"
     * @const
     */
    "VIEWER_COMBINED": "VIEWER_COMBINED",
    /**
     * value: "CONTRIBUTOR"
     * @const
     */
    "CONTRIBUTOR": "CONTRIBUTOR",
    /**
     * value: "PARTICIPANT"
     * @const
     */
    "PARTICIPANT": "PARTICIPANT"  };

  /**
   * Returns a <code>PortfolioPlanUserRole</code> enum value from a Javascript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
   * @return {module:model/PortfolioPlanUserRole} The enum <code>PortfolioPlanUserRole</code> value.
   */
  exports.constructFromObject = function(object) {
    return object;
  }

  return exports;
}));


