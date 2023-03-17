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
    instance = new DecisionLensApi.Recommendation();
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

  describe('Recommendation', function() {
    it('should create an instance of Recommendation', function() {
      // uncomment below and update the code to test Recommendation
      //var instance = new DecisionLensApi.Recommendation();
      //expect(instance).to.be.a(DecisionLensApi.Recommendation);
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instance = new DecisionLensApi.Recommendation();
      //expect(instance).to.be();
    });

    it('should have the property fieldValues (base name: "fieldValues")', function() {
      // uncomment below and update the code to test the property fieldValues
      //var instance = new DecisionLensApi.Recommendation();
      //expect(instance).to.be();
    });

    it('should have the property portfolioPlanInsights (base name: "portfolioPlanInsights")', function() {
      // uncomment below and update the code to test the property portfolioPlanInsights
      //var instance = new DecisionLensApi.Recommendation();
      //expect(instance).to.be();
    });

    it('should have the property project (base name: "project")', function() {
      // uncomment below and update the code to test the property project
      //var instance = new DecisionLensApi.Recommendation();
      //expect(instance).to.be();
    });

  });

}));