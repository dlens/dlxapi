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
    instance = new DecisionLensApi.ExpandComponent();
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

  describe('ExpandComponent', function() {
    it('should create an instance of ExpandComponent', function() {
      // uncomment below and update the code to test ExpandComponent
      //var instance = new DecisionLensApi.ExpandComponent();
      //expect(instance).to.be.a(DecisionLensApi.ExpandComponent);
    });

    it('should have the property path (base name: "path")', function() {
      // uncomment below and update the code to test the property path
      //var instance = new DecisionLensApi.ExpandComponent();
      //expect(instance).to.be();
    });

    it('should have the property match (base name: "match")', function() {
      // uncomment below and update the code to test the property match
      //var instance = new DecisionLensApi.ExpandComponent();
      //expect(instance).to.be();
    });

    it('should have the property allPossible (base name: "allPossible")', function() {
      // uncomment below and update the code to test the property allPossible
      //var instance = new DecisionLensApi.ExpandComponent();
      //expect(instance).to.be();
    });

    it('should have the property unique (base name: "unique")', function() {
      // uncomment below and update the code to test the property unique
      //var instance = new DecisionLensApi.ExpandComponent();
      //expect(instance).to.be();
    });

    it('should have the property limit (base name: "limit")', function() {
      // uncomment below and update the code to test the property limit
      //var instance = new DecisionLensApi.ExpandComponent();
      //expect(instance).to.be();
    });

    it('should have the property offset (base name: "offset")', function() {
      // uncomment below and update the code to test the property offset
      //var instance = new DecisionLensApi.ExpandComponent();
      //expect(instance).to.be();
    });

    it('should have the property orderBy (base name: "orderBy")', function() {
      // uncomment below and update the code to test the property orderBy
      //var instance = new DecisionLensApi.ExpandComponent();
      //expect(instance).to.be();
    });

  });

}));
