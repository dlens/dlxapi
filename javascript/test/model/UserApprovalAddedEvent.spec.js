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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.DecisionLensApi);
  }
}(this, function(expect, DecisionLensApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new DecisionLensApi.UserApprovalAddedEvent();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('UserApprovalAddedEvent', function() {
    it('should create an instance of UserApprovalAddedEvent', function() {
      // uncomment below and update the code to test UserApprovalAddedEvent
      //var instance = new DecisionLensApi.UserApprovalAddedEvent();
      //expect(instance).to.be.a(DecisionLensApi.UserApprovalAddedEvent);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new DecisionLensApi.UserApprovalAddedEvent();
      //expect(instance).to.be();
    });

    it('should have the property user (base name: "user")', function() {
      // uncomment below and update the code to test the property user
      //var instance = new DecisionLensApi.UserApprovalAddedEvent();
      //expect(instance).to.be();
    });

    it('should have the property clientId (base name: "clientId")', function() {
      // uncomment below and update the code to test the property clientId
      //var instance = new DecisionLensApi.UserApprovalAddedEvent();
      //expect(instance).to.be();
    });

    it('should have the property groupId (base name: "groupId")', function() {
      // uncomment below and update the code to test the property groupId
      //var instance = new DecisionLensApi.UserApprovalAddedEvent();
      //expect(instance).to.be();
    });

  });

}));