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
    instance = new DecisionLensApi.FieldTagAddedEvent();
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

  describe('FieldTagAddedEvent', function() {
    it('should create an instance of FieldTagAddedEvent', function() {
      // uncomment below and update the code to test FieldTagAddedEvent
      //var instance = new DecisionLensApi.FieldTagAddedEvent();
      //expect(instance).to.be.a(DecisionLensApi.FieldTagAddedEvent);
    });

    it('should have the property portfolioId (base name: "portfolioId")', function() {
      // uncomment below and update the code to test the property portfolioId
      //var instance = new DecisionLensApi.FieldTagAddedEvent();
      //expect(instance).to.be();
    });

    it('should have the property tagParentName (base name: "tagParentName")', function() {
      // uncomment below and update the code to test the property tagParentName
      //var instance = new DecisionLensApi.FieldTagAddedEvent();
      //expect(instance).to.be();
    });

    it('should have the property tagId (base name: "tagId")', function() {
      // uncomment below and update the code to test the property tagId
      //var instance = new DecisionLensApi.FieldTagAddedEvent();
      //expect(instance).to.be();
    });

    it('should have the property tagColor (base name: "tagColor")', function() {
      // uncomment below and update the code to test the property tagColor
      //var instance = new DecisionLensApi.FieldTagAddedEvent();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new DecisionLensApi.FieldTagAddedEvent();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new DecisionLensApi.FieldTagAddedEvent();
      //expect(instance).to.be();
    });

    it('should have the property tagName (base name: "tagName")', function() {
      // uncomment below and update the code to test the property tagName
      //var instance = new DecisionLensApi.FieldTagAddedEvent();
      //expect(instance).to.be();
    });

    it('should have the property tagParentId (base name: "tagParentId")', function() {
      // uncomment below and update the code to test the property tagParentId
      //var instance = new DecisionLensApi.FieldTagAddedEvent();
      //expect(instance).to.be();
    });

    it('should have the property portfolioPlan (base name: "portfolioPlan")', function() {
      // uncomment below and update the code to test the property portfolioPlan
      //var instance = new DecisionLensApi.FieldTagAddedEvent();
      //expect(instance).to.be();
    });

  });

}));
