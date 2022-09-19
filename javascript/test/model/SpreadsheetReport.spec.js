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
    instance = new DecisionLensApi.SpreadsheetReport();
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

  describe('SpreadsheetReport', function() {
    it('should create an instance of SpreadsheetReport', function() {
      // uncomment below and update the code to test SpreadsheetReport
      //var instance = new DecisionLensApi.SpreadsheetReport();
      //expect(instance).to.be.a(DecisionLensApi.SpreadsheetReport);
    });

    it('should have the property portfolioId (base name: "portfolioId")', function() {
      // uncomment below and update the code to test the property portfolioId
      //var instance = new DecisionLensApi.SpreadsheetReport();
      //expect(instance).to.be();
    });

    it('should have the property spreadsheetId (base name: "spreadsheetId")', function() {
      // uncomment below and update the code to test the property spreadsheetId
      //var instance = new DecisionLensApi.SpreadsheetReport();
      //expect(instance).to.be();
    });

    it('should have the property sheetName (base name: "sheetName")', function() {
      // uncomment below and update the code to test the property sheetName
      //var instance = new DecisionLensApi.SpreadsheetReport();
      //expect(instance).to.be();
    });

    it('should have the property newProjects (base name: "newProjects")', function() {
      // uncomment below and update the code to test the property newProjects
      //var instance = new DecisionLensApi.SpreadsheetReport();
      //expect(instance).to.be();
    });

    it('should have the property newFields (base name: "newFields")', function() {
      // uncomment below and update the code to test the property newFields
      //var instance = new DecisionLensApi.SpreadsheetReport();
      //expect(instance).to.be();
    });

    it('should have the property newBudgets (base name: "newBudgets")', function() {
      // uncomment below and update the code to test the property newBudgets
      //var instance = new DecisionLensApi.SpreadsheetReport();
      //expect(instance).to.be();
    });

    it('should have the property updateFields (base name: "updateFields")', function() {
      // uncomment below and update the code to test the property updateFields
      //var instance = new DecisionLensApi.SpreadsheetReport();
      //expect(instance).to.be();
    });

    it('should have the property updateBudgets (base name: "updateBudgets")', function() {
      // uncomment below and update the code to test the property updateBudgets
      //var instance = new DecisionLensApi.SpreadsheetReport();
      //expect(instance).to.be();
    });

    it('should have the property updateProjectFieldValuesCount (base name: "updateProjectFieldValuesCount")', function() {
      // uncomment below and update the code to test the property updateProjectFieldValuesCount
      //var instance = new DecisionLensApi.SpreadsheetReport();
      //expect(instance).to.be();
    });

    it('should have the property updateBudgetFieldValuesCount (base name: "updateBudgetFieldValuesCount")', function() {
      // uncomment below and update the code to test the property updateBudgetFieldValuesCount
      //var instance = new DecisionLensApi.SpreadsheetReport();
      //expect(instance).to.be();
    });

    it('should have the property newBudgetAmountsCount (base name: "newBudgetAmountsCount")', function() {
      // uncomment below and update the code to test the property newBudgetAmountsCount
      //var instance = new DecisionLensApi.SpreadsheetReport();
      //expect(instance).to.be();
    });

    it('should have the property updateBudgetAmountsCount (base name: "updateBudgetAmountsCount")', function() {
      // uncomment below and update the code to test the property updateBudgetAmountsCount
      //var instance = new DecisionLensApi.SpreadsheetReport();
      //expect(instance).to.be();
    });

    it('should have the property updateTimePeriodsCount (base name: "updateTimePeriodsCount")', function() {
      // uncomment below and update the code to test the property updateTimePeriodsCount
      //var instance = new DecisionLensApi.SpreadsheetReport();
      //expect(instance).to.be();
    });

    it('should have the property updateProjects (base name: "updateProjects")', function() {
      // uncomment below and update the code to test the property updateProjects
      //var instance = new DecisionLensApi.SpreadsheetReport();
      //expect(instance).to.be();
    });

    it('should have the property warnings (base name: "warnings")', function() {
      // uncomment below and update the code to test the property warnings
      //var instance = new DecisionLensApi.SpreadsheetReport();
      //expect(instance).to.be();
    });

    it('should have the property importType (base name: "importType")', function() {
      // uncomment below and update the code to test the property importType
      //var instance = new DecisionLensApi.SpreadsheetReport();
      //expect(instance).to.be();
    });

  });

}));
