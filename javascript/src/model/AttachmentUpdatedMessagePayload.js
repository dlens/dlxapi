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
    define(['ApiClient', 'model/Attachment'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Attachment'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.AttachmentUpdatedMessagePayload = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.Attachment);
  }
}(this, function(ApiClient, Attachment) {
  'use strict';




  /**
   * The AttachmentUpdatedMessagePayload model module.
   * @module model/AttachmentUpdatedMessagePayload
   * @version 1.0
   */

  /**
   * Constructs a new <code>AttachmentUpdatedMessagePayload</code>.
   * @alias module:model/AttachmentUpdatedMessagePayload
   * @class
   * @param attachment {module:model/Attachment} 
   */
  var exports = function(attachment) {
    var _this = this;

    _this['attachment'] = attachment;
  };

  /**
   * Constructs a <code>AttachmentUpdatedMessagePayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AttachmentUpdatedMessagePayload} obj Optional instance to populate.
   * @return {module:model/AttachmentUpdatedMessagePayload} The populated <code>AttachmentUpdatedMessagePayload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('attachment')) {
        obj['attachment'] = Attachment.constructFromObject(data['attachment']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/Attachment} attachment
   */
  exports.prototype['attachment'] = undefined;



  return exports;
}));

