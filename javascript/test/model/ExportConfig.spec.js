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
    instance = new DecisionLensApi.ExportConfig();
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

  describe('ExportConfig', function() {
    it('should create an instance of ExportConfig', function() {
      // uncomment below and update the code to test ExportConfig
      //var instance = new DecisionLensApi.ExportConfig();
      //expect(instance).to.be.a(DecisionLensApi.ExportConfig);
    });

    it('should have the property projectIds (base name: "projectIds")', function() {
      // uncomment below and update the code to test the property projectIds
      //var instance = new DecisionLensApi.ExportConfig();
      //expect(instance).to.be();
    });

    it('should have the property costFieldIds (base name: "costFieldIds")', function() {
      // uncomment below and update the code to test the property costFieldIds
      //var instance = new DecisionLensApi.ExportConfig();
      //expect(instance).to.be();
    });

    it('should have the property columns (base name: "columns")', function() {
      // uncomment below and update the code to test the property columns
      //var instance = new DecisionLensApi.ExportConfig();
      //expect(instance).to.be();
    });

    it('should have the property planningPeriod (base name: "planningPeriod")', function() {
      // uncomment below and update the code to test the property planningPeriod
      //var instance = new DecisionLensApi.ExportConfig();
      //expect(instance).to.be();
    });

    it('should have the property filters (base name: "filters")', function() {
      // uncomment below and update the code to test the property filters
      //var instance = new DecisionLensApi.ExportConfig();
      //expect(instance).to.be();
    });

  });

}));
