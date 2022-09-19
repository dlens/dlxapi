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
    root.DecisionLensApi.PropertyName = factory(root.DecisionLensApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';


  /**
   * Enum class PropertyName.
   * @enum {}
   * @readonly
   */
  var exports = {
    /**
     * value: "WARNING_BANNER_TEXT"
     * @const
     */
    "WARNING_BANNER_TEXT": "WARNING_BANNER_TEXT",
    /**
     * value: "INACTIVITY_TIMEOUT"
     * @const
     */
    "INACTIVITY_TIMEOUT": "INACTIVITY_TIMEOUT",
    /**
     * value: "DLC_SOURCE_ENABLED"
     * @const
     */
    "DLC_SOURCE_ENABLED": "DLC_SOURCE_ENABLED",
    /**
     * value: "KLOUDLESS_ENABLED"
     * @const
     */
    "KLOUDLESS_ENABLED": "KLOUDLESS_ENABLED",
    /**
     * value: "COMMENT_EMAIL_NOTIFY"
     * @const
     */
    "COMMENT_EMAIL_NOTIFY": "COMMENT_EMAIL_NOTIFY",
    /**
     * value: "INTAKE_ENGINE_ENABLED"
     * @const
     */
    "INTAKE_ENGINE_ENABLED": "INTAKE_ENGINE_ENABLED",
    /**
     * value: "IP_ALLOWLIST"
     * @const
     */
    "IP_ALLOWLIST": "IP_ALLOWLIST",
    /**
     * value: "ATTACHMENT_MAX_SIZE"
     * @const
     */
    "ATTACHMENT_MAX_SIZE": "ATTACHMENT_MAX_SIZE",
    /**
     * value: "SSO_SELF_ENROLLMENT_ENABLED"
     * @const
     */
    "SSO_SELF_ENROLLMENT_ENABLED": "SSO_SELF_ENROLLMENT_ENABLED",
    /**
     * value: "SHOW_DLC_LINK"
     * @const
     */
    "SHOW_DLC_LINK": "SHOW_DLC_LINK",
    /**
     * value: "LINKED_APP_URL"
     * @const
     */
    "LINKED_APP_URL": "LINKED_APP_URL",
    /**
     * value: "MAX_CATEGORY_OPTIONS"
     * @const
     */
    "MAX_CATEGORY_OPTIONS": "MAX_CATEGORY_OPTIONS",
    /**
     * value: "SHOW_SPEND_PLAN_VIEW"
     * @const
     */
    "SHOW_SPEND_PLAN_VIEW": "SHOW_SPEND_PLAN_VIEW",
    /**
     * value: "USER_PROFILE_CUSTOM_ID_ALLOWED"
     * @const
     */
    "USER_PROFILE_CUSTOM_ID_ALLOWED": "USER_PROFILE_CUSTOM_ID_ALLOWED",
    /**
     * value: "STATUS_OF_FUNDS_ENABLED"
     * @const
     */
    "STATUS_OF_FUNDS_ENABLED": "STATUS_OF_FUNDS_ENABLED"  };

  /**
   * Returns a <code>PropertyName</code> enum value from a Javascript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
   * @return {module:model/PropertyName} The enum <code>PropertyName</code> value.
   */
  exports.constructFromObject = function(object) {
    return object;
  }

  return exports;
}));


