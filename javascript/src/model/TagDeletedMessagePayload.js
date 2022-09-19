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
    define(['ApiClient', 'model/Tag'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Tag'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.TagDeletedMessagePayload = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.Tag);
  }
}(this, function(ApiClient, Tag) {
  'use strict';




  /**
   * The TagDeletedMessagePayload model module.
   * @module model/TagDeletedMessagePayload
   * @version 1.0
   */

  /**
   * Constructs a new <code>TagDeletedMessagePayload</code>.
   * @alias module:model/TagDeletedMessagePayload
   * @class
   * @param tag {module:model/Tag} 
   */
  var exports = function(tag) {
    var _this = this;

    _this['tag'] = tag;
  };

  /**
   * Constructs a <code>TagDeletedMessagePayload</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TagDeletedMessagePayload} obj Optional instance to populate.
   * @return {module:model/TagDeletedMessagePayload} The populated <code>TagDeletedMessagePayload</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('tag')) {
        obj['tag'] = Tag.constructFromObject(data['tag']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/Tag} tag
   */
  exports.prototype['tag'] = undefined;



  return exports;
}));


