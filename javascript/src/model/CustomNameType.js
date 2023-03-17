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
    root.DecisionLensApi.CustomNameType = factory(root.DecisionLensApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';


  /**
   * Enum class CustomNameType.
   * @enum {}
   * @readonly
   */
  var exports = {
    /**
     * value: "PROJECT"
     * @const
     */
    "PROJECT": "PROJECT",
    /**
     * value: "BUDGET"
     * @const
     */
    "BUDGET": "BUDGET",
    /**
     * value: "REQUEST"
     * @const
     */
    "REQUEST": "REQUEST",
    /**
     * value: "ALLOCATED"
     * @const
     */
    "ALLOCATED": "ALLOCATED",
    /**
     * value: "DRAFT"
     * @const
     */
    "DRAFT": "DRAFT",
    /**
     * value: "IDEA"
     * @const
     */
    "IDEA": "IDEA",
    /**
     * value: "BACKLOG"
     * @const
     */
    "BACKLOG": "BACKLOG",
    /**
     * value: "SCHEDULED"
     * @const
     */
    "SCHEDULED": "SCHEDULED",
    /**
     * value: "IN_PROGRESS"
     * @const
     */
    "IN_PROGRESS": "IN_PROGRESS",
    /**
     * value: "COMPLETED"
     * @const
     */
    "COMPLETED": "COMPLETED",
    /**
     * value: "ON_HOLD"
     * @const
     */
    "ON_HOLD": "ON_HOLD",
    /**
     * value: "ARCHIVED"
     * @const
     */
    "ARCHIVED": "ARCHIVED",
    /**
     * value: "PLANNED"
     * @const
     */
    "PLANNED": "PLANNED",
    /**
     * value: "OBLIGATED"
     * @const
     */
    "OBLIGATED": "OBLIGATED"  };

  /**
   * Returns a <code>CustomNameType</code> enum value from a Javascript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
   * @return {module:model/CustomNameType} The enum <code>CustomNameType</code> value.
   */
  exports.constructFromObject = function(object) {
    return object;
  }

  return exports;
}));

