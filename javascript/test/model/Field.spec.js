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
    instance = new DecisionLensApi.Field();
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

  describe('Field', function() {
    it('should create an instance of Field', function() {
      // uncomment below and update the code to test Field
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be.a(DecisionLensApi.Field);
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property description (base name: "description")', function() {
      // uncomment below and update the code to test the property description
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property source (base name: "source")', function() {
      // uncomment below and update the code to test the property source
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property portfolio (base name: "portfolio")', function() {
      // uncomment below and update the code to test the property portfolio
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property parent (base name: "parent")', function() {
      // uncomment below and update the code to test the property parent
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property position (base name: "position")', function() {
      // uncomment below and update the code to test the property position
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property typePosition (base name: "typePosition")', function() {
      // uncomment below and update the code to test the property typePosition
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property fieldValues (base name: "fieldValues")', function() {
      // uncomment below and update the code to test the property fieldValues
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property targetType (base name: "targetType")', function() {
      // uncomment below and update the code to test the property targetType
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property dataType (base name: "dataType")', function() {
      // uncomment below and update the code to test the property dataType
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property calculationType (base name: "calculationType")', function() {
      // uncomment below and update the code to test the property calculationType
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property isFieldTypeApproved (base name: "isFieldTypeApproved")', function() {
      // uncomment below and update the code to test the property isFieldTypeApproved
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property tagIds (base name: "tagIds")', function() {
      // uncomment below and update the code to test the property tagIds
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property categoryOptions (base name: "categoryOptions")', function() {
      // uncomment below and update the code to test the property categoryOptions
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property isIdeaField (base name: "isIdeaField")', function() {
      // uncomment below and update the code to test the property isIdeaField
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property ideaFieldPosition (base name: "ideaFieldPosition")', function() {
      // uncomment below and update the code to test the property ideaFieldPosition
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property isIdeaFieldRequired (base name: "isIdeaFieldRequired")', function() {
      // uncomment below and update the code to test the property isIdeaFieldRequired
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property scale (base name: "scale")', function() {
      // uncomment below and update the code to test the property scale
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

    it('should have the property attributes (base name: "attributes")', function() {
      // uncomment below and update the code to test the property attributes
      //var instance = new DecisionLensApi.Field();
      //expect(instance).to.be();
    });

  });

}));
