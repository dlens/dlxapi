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
    define(['ApiClient', 'model/DlResource', 'model/Users'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DlResource'), require('./Users'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.Group = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.DlResource, root.DecisionLensApi.Users);
  }
}(this, function(ApiClient, DlResource, Users) {
  'use strict';




  /**
   * The Group model module.
   * @module model/Group
   * @version 1.0
   */

  /**
   * Constructs a new <code>Group</code>.
   * @alias module:model/Group
   * @class
   * @extends module:model/DlResource
   */
  var exports = function() {
    var _this = this;
    DlResource.call(_this);








  };

  /**
   * Constructs a <code>Group</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Group} obj Optional instance to populate.
   * @return {module:model/Group} The populated <code>Group</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      DlResource.constructFromObject(data, obj);
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('domain')) {
        obj['domain'] = ApiClient.convertToType(data['domain'], 'String');
      }
      if (data.hasOwnProperty('linkedDomain')) {
        obj['linkedDomain'] = ApiClient.convertToType(data['linkedDomain'], 'String');
      }
      if (data.hasOwnProperty('parentDomain')) {
        obj['parentDomain'] = ApiClient.convertToType(data['parentDomain'], 'String');
      }
      if (data.hasOwnProperty('isActive')) {
        obj['isActive'] = ApiClient.convertToType(data['isActive'], 'Boolean');
      }
      if (data.hasOwnProperty('authType')) {
        obj['authType'] = ApiClient.convertToType(data['authType'], 'String');
      }
      if (data.hasOwnProperty('authUrl')) {
        obj['authUrl'] = ApiClient.convertToType(data['authUrl'], 'String');
      }
      if (data.hasOwnProperty('users')) {
        obj['users'] = Users.constructFromObject(data['users']);
      }
    }
    return obj;
  }

  exports.prototype = Object.create(DlResource.prototype);
  exports.prototype.constructor = exports;

  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {String} domain
   */
  exports.prototype['domain'] = undefined;
  /**
   * @member {String} linkedDomain
   */
  exports.prototype['linkedDomain'] = undefined;
  /**
   * @member {String} parentDomain
   */
  exports.prototype['parentDomain'] = undefined;
  /**
   * @member {Boolean} isActive
   */
  exports.prototype['isActive'] = undefined;
  /**
   * @member {String} authType
   */
  exports.prototype['authType'] = undefined;
  /**
   * @member {String} authUrl
   */
  exports.prototype['authUrl'] = undefined;
  /**
   * @member {module:model/Users} users
   */
  exports.prototype['users'] = undefined;



  return exports;
}));

