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
    define(['ApiClient', 'model/DlCollection', 'model/User'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DlCollection'), require('./User'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.Users = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.DlCollection, root.DecisionLensApi.User);
  }
}(this, function(ApiClient, DlCollection, User) {
  'use strict';




  /**
   * The Users model module.
   * @module model/Users
   * @version 1.0
   */

  /**
   * Constructs a new <code>Users</code>.
   * @alias module:model/Users
   * @class
   * @extends module:model/DlCollection
   */
  var exports = function() {
    var _this = this;
    DlCollection.call(_this);

  };

  /**
   * Constructs a <code>Users</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Users} obj Optional instance to populate.
   * @return {module:model/Users} The populated <code>Users</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      DlCollection.constructFromObject(data, obj);
      if (data.hasOwnProperty('items')) {
        obj['items'] = ApiClient.convertToType(data['items'], [User]);
      }
    }
    return obj;
  }

  exports.prototype = Object.create(DlCollection.prototype);
  exports.prototype.constructor = exports;

  /**
   * @member {Array.<module:model/User>} items
   */
  exports.prototype['items'] = undefined;



  return exports;
}));


