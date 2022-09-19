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
    instance = new DecisionLensApi.RegisterUserRequest();
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

  describe('RegisterUserRequest', function() {
    it('should create an instance of RegisterUserRequest', function() {
      // uncomment below and update the code to test RegisterUserRequest
      //var instance = new DecisionLensApi.RegisterUserRequest();
      //expect(instance).to.be.a(DecisionLensApi.RegisterUserRequest);
    });

    it('should have the property userRegistrationToken (base name: "userRegistrationToken")', function() {
      // uncomment below and update the code to test the property userRegistrationToken
      //var instance = new DecisionLensApi.RegisterUserRequest();
      //expect(instance).to.be();
    });

    it('should have the property emailId (base name: "emailId")', function() {
      // uncomment below and update the code to test the property emailId
      //var instance = new DecisionLensApi.RegisterUserRequest();
      //expect(instance).to.be();
    });

    it('should have the property landingPage (base name: "landingPage")', function() {
      // uncomment below and update the code to test the property landingPage
      //var instance = new DecisionLensApi.RegisterUserRequest();
      //expect(instance).to.be();
    });

    it('should have the property doNotNotify (base name: "doNotNotify")', function() {
      // uncomment below and update the code to test the property doNotNotify
      //var instance = new DecisionLensApi.RegisterUserRequest();
      //expect(instance).to.be();
    });

  });

}));
