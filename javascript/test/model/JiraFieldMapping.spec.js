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
    instance = new DecisionLensApi.JiraFieldMapping();
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

  describe('JiraFieldMapping', function() {
    it('should create an instance of JiraFieldMapping', function() {
      // uncomment below and update the code to test JiraFieldMapping
      //var instance = new DecisionLensApi.JiraFieldMapping();
      //expect(instance).to.be.a(DecisionLensApi.JiraFieldMapping);
    });

    it('should have the property jiraFieldId (base name: "jiraFieldId")', function() {
      // uncomment below and update the code to test the property jiraFieldId
      //var instance = new DecisionLensApi.JiraFieldMapping();
      //expect(instance).to.be();
    });

    it('should have the property dlFieldId (base name: "dlFieldId")', function() {
      // uncomment below and update the code to test the property dlFieldId
      //var instance = new DecisionLensApi.JiraFieldMapping();
      //expect(instance).to.be();
    });

    it('should have the property dlFieldType (base name: "dlFieldType")', function() {
      // uncomment below and update the code to test the property dlFieldType
      //var instance = new DecisionLensApi.JiraFieldMapping();
      //expect(instance).to.be();
    });

    it('should have the property dlDataType (base name: "dlDataType")', function() {
      // uncomment below and update the code to test the property dlDataType
      //var instance = new DecisionLensApi.JiraFieldMapping();
      //expect(instance).to.be();
    });

    it('should have the property dlTags (base name: "dlTags")', function() {
      // uncomment below and update the code to test the property dlTags
      //var instance = new DecisionLensApi.JiraFieldMapping();
      //expect(instance).to.be();
    });

    it('should have the property dlCategories (base name: "dlCategories")', function() {
      // uncomment below and update the code to test the property dlCategories
      //var instance = new DecisionLensApi.JiraFieldMapping();
      //expect(instance).to.be();
    });

  });

}));
