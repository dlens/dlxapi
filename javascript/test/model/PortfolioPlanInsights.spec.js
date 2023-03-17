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
    instance = new DecisionLensApi.PortfolioPlanInsights();
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

  describe('PortfolioPlanInsights', function() {
    it('should create an instance of PortfolioPlanInsights', function() {
      // uncomment below and update the code to test PortfolioPlanInsights
      //var instance = new DecisionLensApi.PortfolioPlanInsights();
      //expect(instance).to.be.a(DecisionLensApi.PortfolioPlanInsights);
    });

    it('should have the property portfolio (base name: "portfolio")', function() {
      // uncomment below and update the code to test the property portfolio
      //var instance = new DecisionLensApi.PortfolioPlanInsights();
      //expect(instance).to.be();
    });

    it('should have the property subPortfolioInsights (base name: "subPortfolioInsights")', function() {
      // uncomment below and update the code to test the property subPortfolioInsights
      //var instance = new DecisionLensApi.PortfolioPlanInsights();
      //expect(instance).to.be();
    });

    it('should have the property insights (base name: "insights")', function() {
      // uncomment below and update the code to test the property insights
      //var instance = new DecisionLensApi.PortfolioPlanInsights();
      //expect(instance).to.be();
    });

    it('should have the property statusInsights (base name: "statusInsights")', function() {
      // uncomment below and update the code to test the property statusInsights
      //var instance = new DecisionLensApi.PortfolioPlanInsights();
      //expect(instance).to.be();
    });

    it('should have the property budget (base name: "budget")', function() {
      // uncomment below and update the code to test the property budget
      //var instance = new DecisionLensApi.PortfolioPlanInsights();
      //expect(instance).to.be();
    });

    it('should have the property allocation (base name: "allocation")', function() {
      // uncomment below and update the code to test the property allocation
      //var instance = new DecisionLensApi.PortfolioPlanInsights();
      //expect(instance).to.be();
    });

    it('should have the property gradingType (base name: "gradingType")', function() {
      // uncomment below and update the code to test the property gradingType
      //var instance = new DecisionLensApi.PortfolioPlanInsights();
      //expect(instance).to.be();
    });

    it('should have the property wiwo (base name: "wiwo")', function() {
      // uncomment below and update the code to test the property wiwo
      //var instance = new DecisionLensApi.PortfolioPlanInsights();
      //expect(instance).to.be();
    });

  });

}));