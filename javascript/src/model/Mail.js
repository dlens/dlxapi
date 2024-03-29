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
    define(['ApiClient', 'model/TemplateProperty'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./TemplateProperty'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.Mail = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.TemplateProperty);
  }
}(this, function(ApiClient, TemplateProperty) {
  'use strict';




  /**
   * The Mail model module.
   * @module model/Mail
   * @version 1.0
   */

  /**
   * Constructs a new <code>Mail</code>.
   * @alias module:model/Mail
   * @class
   */
  var exports = function() {
    var _this = this;











  };

  /**
   * Constructs a <code>Mail</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Mail} obj Optional instance to populate.
   * @return {module:model/Mail} The populated <code>Mail</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('from')) {
        obj['from'] = ApiClient.convertToType(data['from'], 'String');
      }
      if (data.hasOwnProperty('replyTo')) {
        obj['replyTo'] = ApiClient.convertToType(data['replyTo'], 'String');
      }
      if (data.hasOwnProperty('replyToDisplayName')) {
        obj['replyToDisplayName'] = ApiClient.convertToType(data['replyToDisplayName'], 'String');
      }
      if (data.hasOwnProperty('to')) {
        obj['to'] = ApiClient.convertToType(data['to'], ['String']);
      }
      if (data.hasOwnProperty('cc')) {
        obj['cc'] = ApiClient.convertToType(data['cc'], ['String']);
      }
      if (data.hasOwnProperty('bcc')) {
        obj['bcc'] = ApiClient.convertToType(data['bcc'], ['String']);
      }
      if (data.hasOwnProperty('subject')) {
        obj['subject'] = ApiClient.convertToType(data['subject'], 'String');
      }
      if (data.hasOwnProperty('message')) {
        obj['message'] = ApiClient.convertToType(data['message'], 'String');
      }
      if (data.hasOwnProperty('templateName')) {
        obj['templateName'] = ApiClient.convertToType(data['templateName'], 'String');
      }
      if (data.hasOwnProperty('templateProperties')) {
        obj['templateProperties'] = ApiClient.convertToType(data['templateProperties'], [TemplateProperty]);
      }
    }
    return obj;
  }

  /**
   * @member {String} from
   */
  exports.prototype['from'] = undefined;
  /**
   * @member {String} replyTo
   */
  exports.prototype['replyTo'] = undefined;
  /**
   * @member {String} replyToDisplayName
   */
  exports.prototype['replyToDisplayName'] = undefined;
  /**
   * @member {Array.<String>} to
   */
  exports.prototype['to'] = undefined;
  /**
   * @member {Array.<String>} cc
   */
  exports.prototype['cc'] = undefined;
  /**
   * @member {Array.<String>} bcc
   */
  exports.prototype['bcc'] = undefined;
  /**
   * @member {String} subject
   */
  exports.prototype['subject'] = undefined;
  /**
   * @member {String} message
   */
  exports.prototype['message'] = undefined;
  /**
   * @member {String} templateName
   */
  exports.prototype['templateName'] = undefined;
  /**
   * @member {Array.<module:model/TemplateProperty>} templateProperties
   */
  exports.prototype['templateProperties'] = undefined;



  return exports;
}));


