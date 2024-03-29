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
    instance = new DecisionLensApi.ProvisionGroupRequest();
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

  describe('ProvisionGroupRequest', function() {
    it('should create an instance of ProvisionGroupRequest', function() {
      // uncomment below and update the code to test ProvisionGroupRequest
      //var instance = new DecisionLensApi.ProvisionGroupRequest();
      //expect(instance).to.be.a(DecisionLensApi.ProvisionGroupRequest);
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new DecisionLensApi.ProvisionGroupRequest();
      //expect(instance).to.be();
    });

    it('should have the property domain (base name: "domain")', function() {
      // uncomment below and update the code to test the property domain
      //var instance = new DecisionLensApi.ProvisionGroupRequest();
      //expect(instance).to.be();
    });

    it('should have the property linkedDomain (base name: "linkedDomain")', function() {
      // uncomment below and update the code to test the property linkedDomain
      //var instance = new DecisionLensApi.ProvisionGroupRequest();
      //expect(instance).to.be();
    });

    it('should have the property userNames (base name: "userNames")', function() {
      // uncomment below and update the code to test the property userNames
      //var instance = new DecisionLensApi.ProvisionGroupRequest();
      //expect(instance).to.be();
    });

    it('should have the property authUrl (base name: "authUrl")', function() {
      // uncomment below and update the code to test the property authUrl
      //var instance = new DecisionLensApi.ProvisionGroupRequest();
      //expect(instance).to.be();
    });

    it('should have the property dliProperties (base name: "dliProperties")', function() {
      // uncomment below and update the code to test the property dliProperties
      //var instance = new DecisionLensApi.ProvisionGroupRequest();
      //expect(instance).to.be();
    });

    it('should have the property dlxProperties (base name: "dlxProperties")', function() {
      // uncomment below and update the code to test the property dlxProperties
      //var instance = new DecisionLensApi.ProvisionGroupRequest();
      //expect(instance).to.be();
    });

    it('should have the property dlcProperties (base name: "dlcProperties")', function() {
      // uncomment below and update the code to test the property dlcProperties
      //var instance = new DecisionLensApi.ProvisionGroupRequest();
      //expect(instance).to.be();
    });

  });

}));
