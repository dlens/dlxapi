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
    root.DecisionLensApi.MessageToken = factory(root.DecisionLensApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The MessageToken model module.
   * @module model/MessageToken
   * @version 1.0
   */

  /**
   * Constructs a new <code>MessageToken</code>.
   * @alias module:model/MessageToken
   * @class
   * @param token {String} 
   * @param expirationInMillis {Number} 
   * @param destination {String} 
   */
  var exports = function(token, expirationInMillis, destination) {
    var _this = this;

    _this['token'] = token;
    _this['expirationInMillis'] = expirationInMillis;
    _this['destination'] = destination;
  };

  /**
   * Constructs a <code>MessageToken</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MessageToken} obj Optional instance to populate.
   * @return {module:model/MessageToken} The populated <code>MessageToken</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('token')) {
        obj['token'] = ApiClient.convertToType(data['token'], 'String');
      }
      if (data.hasOwnProperty('expirationInMillis')) {
        obj['expirationInMillis'] = ApiClient.convertToType(data['expirationInMillis'], 'Number');
      }
      if (data.hasOwnProperty('destination')) {
        obj['destination'] = ApiClient.convertToType(data['destination'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} token
   */
  exports.prototype['token'] = undefined;
  /**
   * @member {Number} expirationInMillis
   */
  exports.prototype['expirationInMillis'] = undefined;
  /**
   * @member {String} destination
   */
  exports.prototype['destination'] = undefined;



  return exports;
}));


