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
    instance = new DecisionLensApi.FieldAttributesCategoryDisplayOrderUpdatedEvent();
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

  describe('FieldAttributesCategoryDisplayOrderUpdatedEvent', function() {
    it('should create an instance of FieldAttributesCategoryDisplayOrderUpdatedEvent', function() {
      // uncomment below and update the code to test FieldAttributesCategoryDisplayOrderUpdatedEvent
      //var instance = new DecisionLensApi.FieldAttributesCategoryDisplayOrderUpdatedEvent();
      //expect(instance).to.be.a(DecisionLensApi.FieldAttributesCategoryDisplayOrderUpdatedEvent);
    });

    it('should have the property portfolioId (base name: "portfolioId")', function() {
      // uncomment below and update the code to test the property portfolioId
      //var instance = new DecisionLensApi.FieldAttributesCategoryDisplayOrderUpdatedEvent();
      //expect(instance).to.be();
    });

    it('should have the property categoryDisplayOrder (base name: "categoryDisplayOrder")', function() {
      // uncomment below and update the code to test the property categoryDisplayOrder
      //var instance = new DecisionLensApi.FieldAttributesCategoryDisplayOrderUpdatedEvent();
      //expect(instance).to.be();
    });

    it('should have the property previousCategoryDisplayOrder (base name: "previousCategoryDisplayOrder")', function() {
      // uncomment below and update the code to test the property previousCategoryDisplayOrder
      //var instance = new DecisionLensApi.FieldAttributesCategoryDisplayOrderUpdatedEvent();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new DecisionLensApi.FieldAttributesCategoryDisplayOrderUpdatedEvent();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new DecisionLensApi.FieldAttributesCategoryDisplayOrderUpdatedEvent();
      //expect(instance).to.be();
    });

    it('should have the property portfolioPlan (base name: "portfolioPlan")', function() {
      // uncomment below and update the code to test the property portfolioPlan
      //var instance = new DecisionLensApi.FieldAttributesCategoryDisplayOrderUpdatedEvent();
      //expect(instance).to.be();
    });

  });

}));
