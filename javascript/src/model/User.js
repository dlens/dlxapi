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
    define(['ApiClient', 'model/DlResource', 'model/Portfolios', 'model/RoleType', 'model/UserStatus'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DlResource'), require('./Portfolios'), require('./RoleType'), require('./UserStatus'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.User = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.DlResource, root.DecisionLensApi.Portfolios, root.DecisionLensApi.RoleType, root.DecisionLensApi.UserStatus);
  }
}(this, function(ApiClient, DlResource, Portfolios, RoleType, UserStatus) {
  'use strict';




  /**
   * The User model module.
   * @module model/User
   * @version 1.0
   */

  /**
   * Constructs a new <code>User</code>.
   * @alias module:model/User
   * @class
   * @extends module:model/DlResource
   */
  var exports = function() {
    var _this = this;
    DlResource.call(_this);









  };

  /**
   * Constructs a <code>User</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/User} obj Optional instance to populate.
   * @return {module:model/User} The populated <code>User</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      DlResource.constructFromObject(data, obj);
      if (data.hasOwnProperty('username')) {
        obj['username'] = ApiClient.convertToType(data['username'], 'String');
      }
      if (data.hasOwnProperty('firstName')) {
        obj['firstName'] = ApiClient.convertToType(data['firstName'], 'String');
      }
      if (data.hasOwnProperty('lastName')) {
        obj['lastName'] = ApiClient.convertToType(data['lastName'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = UserStatus.constructFromObject(data['status']);
      }
      if (data.hasOwnProperty('isLocked')) {
        obj['isLocked'] = ApiClient.convertToType(data['isLocked'], 'Boolean');
      }
      if (data.hasOwnProperty('invitationUrl')) {
        obj['invitationUrl'] = ApiClient.convertToType(data['invitationUrl'], 'String');
      }
      if (data.hasOwnProperty('invitationUrlExpiration')) {
        obj['invitationUrlExpiration'] = ApiClient.convertToType(data['invitationUrlExpiration'], 'Number');
      }
      if (data.hasOwnProperty('role')) {
        obj['role'] = RoleType.constructFromObject(data['role']);
      }
      if (data.hasOwnProperty('portfolios')) {
        obj['portfolios'] = Portfolios.constructFromObject(data['portfolios']);
      }
    }
    return obj;
  }

  exports.prototype = Object.create(DlResource.prototype);
  exports.prototype.constructor = exports;

  /**
   * @member {String} username
   */
  exports.prototype['username'] = undefined;
  /**
   * @member {String} firstName
   */
  exports.prototype['firstName'] = undefined;
  /**
   * @member {String} lastName
   */
  exports.prototype['lastName'] = undefined;
  /**
   * @member {module:model/UserStatus} status
   */
  exports.prototype['status'] = undefined;
  /**
   * @member {Boolean} isLocked
   */
  exports.prototype['isLocked'] = undefined;
  /**
   * @member {String} invitationUrl
   */
  exports.prototype['invitationUrl'] = undefined;
  /**
   * @member {Number} invitationUrlExpiration
   */
  exports.prototype['invitationUrlExpiration'] = undefined;
  /**
   * @member {module:model/RoleType} role
   */
  exports.prototype['role'] = undefined;
  /**
   * @member {module:model/Portfolios} portfolios
   */
  exports.prototype['portfolios'] = undefined;



  return exports;
}));


