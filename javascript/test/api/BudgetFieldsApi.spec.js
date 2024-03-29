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
    instance = new DecisionLensApi.BudgetFieldsApi();
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

  describe('BudgetFieldsApi', function() {
    describe('createBudgetField', function() {
      it('should call createBudgetField successfully', function(done) {
        //uncomment below and update the code to test createBudgetField
        //instance.createBudgetField(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteBudgetField', function() {
      it('should call deleteBudgetField successfully', function(done) {
        //uncomment below and update the code to test deleteBudgetField
        //instance.deleteBudgetField(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getBudgetField', function() {
      it('should call getBudgetField successfully', function(done) {
        //uncomment below and update the code to test getBudgetField
        //instance.getBudgetField(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getBudgetFieldsForPortfolio', function() {
      it('should call getBudgetFieldsForPortfolio successfully', function(done) {
        //uncomment below and update the code to test getBudgetFieldsForPortfolio
        //instance.getBudgetFieldsForPortfolio(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateBudgetField', function() {
      it('should call updateBudgetField successfully', function(done) {
        //uncomment below and update the code to test updateBudgetField
        //instance.updateBudgetField(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateBudgetFields', function() {
      it('should call updateBudgetFields successfully', function(done) {
        //uncomment below and update the code to test updateBudgetFields
        //instance.updateBudgetFields(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
