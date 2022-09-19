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
    instance = new DecisionLensApi.PortfolioPlansApi();
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

  describe('PortfolioPlansApi', function() {
    describe('addPortfolioPlanUsers', function() {
      it('should call addPortfolioPlanUsers successfully', function(done) {
        //uncomment below and update the code to test addPortfolioPlanUsers
        //instance.addPortfolioPlanUsers(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('applyRecommendationsForPortfolioPlan', function() {
      it('should call applyRecommendationsForPortfolioPlan successfully', function(done) {
        //uncomment below and update the code to test applyRecommendationsForPortfolioPlan
        //instance.applyRecommendationsForPortfolioPlan(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createPortfolioPlan', function() {
      it('should call createPortfolioPlan successfully', function(done) {
        //uncomment below and update the code to test createPortfolioPlan
        //instance.createPortfolioPlan(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createProjectsInPortfolioPlan', function() {
      it('should call createProjectsInPortfolioPlan successfully', function(done) {
        //uncomment below and update the code to test createProjectsInPortfolioPlan
        //instance.createProjectsInPortfolioPlan(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deletePortfolioPlan', function() {
      it('should call deletePortfolioPlan successfully', function(done) {
        //uncomment below and update the code to test deletePortfolioPlan
        //instance.deletePortfolioPlan(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('exportPortfolioPlan', function() {
      it('should call exportPortfolioPlan successfully', function(done) {
        //uncomment below and update the code to test exportPortfolioPlan
        //instance.exportPortfolioPlan(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getBudgetAllocationsForPortfolioPlan', function() {
      it('should call getBudgetAllocationsForPortfolioPlan successfully', function(done) {
        //uncomment below and update the code to test getBudgetAllocationsForPortfolioPlan
        //instance.getBudgetAllocationsForPortfolioPlan(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getMinifiedProjectsForPortfolioPlan', function() {
      it('should call getMinifiedProjectsForPortfolioPlan successfully', function(done) {
        //uncomment below and update the code to test getMinifiedProjectsForPortfolioPlan
        //instance.getMinifiedProjectsForPortfolioPlan(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPortfolioPlan', function() {
      it('should call getPortfolioPlan successfully', function(done) {
        //uncomment below and update the code to test getPortfolioPlan
        //instance.getPortfolioPlan(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPortfolioPlanActivities', function() {
      it('should call getPortfolioPlanActivities successfully', function(done) {
        //uncomment below and update the code to test getPortfolioPlanActivities
        //instance.getPortfolioPlanActivities(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPortfolioPlanUsers', function() {
      it('should call getPortfolioPlanUsers successfully', function(done) {
        //uncomment below and update the code to test getPortfolioPlanUsers
        //instance.getPortfolioPlanUsers(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPortfolioPlans', function() {
      it('should call getPortfolioPlans successfully', function(done) {
        //uncomment below and update the code to test getPortfolioPlans
        //instance.getPortfolioPlans(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getProjectForPortfolioPlan', function() {
      it('should call getProjectForPortfolioPlan successfully', function(done) {
        //uncomment below and update the code to test getProjectForPortfolioPlan
        //instance.getProjectForPortfolioPlan(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getProjectPortfolioPlansForPortfolioPlanAndPortfolio', function() {
      it('should call getProjectPortfolioPlansForPortfolioPlanAndPortfolio successfully', function(done) {
        //uncomment below and update the code to test getProjectPortfolioPlansForPortfolioPlanAndPortfolio
        //instance.getProjectPortfolioPlansForPortfolioPlanAndPortfolio(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getProjectsForPortfolioPlan', function() {
      it('should call getProjectsForPortfolioPlan successfully', function(done) {
        //uncomment below and update the code to test getProjectsForPortfolioPlan
        //instance.getProjectsForPortfolioPlan(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getRecommendationsForPortfolioPlan', function() {
      it('should call getRecommendationsForPortfolioPlan successfully', function(done) {
        //uncomment below and update the code to test getRecommendationsForPortfolioPlan
        //instance.getRecommendationsForPortfolioPlan(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getScheduleForPortfolioPlan', function() {
      it('should call getScheduleForPortfolioPlan successfully', function(done) {
        //uncomment below and update the code to test getScheduleForPortfolioPlan
        //instance.getScheduleForPortfolioPlan(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('rebaselinePortfolioPlan', function() {
      it('should call rebaselinePortfolioPlan successfully', function(done) {
        //uncomment below and update the code to test rebaselinePortfolioPlan
        //instance.rebaselinePortfolioPlan(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updatePortfolioPlan', function() {
      it('should call updatePortfolioPlan successfully', function(done) {
        //uncomment below and update the code to test updatePortfolioPlan
        //instance.updatePortfolioPlan(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updatePortfolioPlanBudgetFieldValues', function() {
      it('should call updatePortfolioPlanBudgetFieldValues successfully', function(done) {
        //uncomment below and update the code to test updatePortfolioPlanBudgetFieldValues
        //instance.updatePortfolioPlanBudgetFieldValues(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updatePortfolioPlanFieldValues', function() {
      it('should call updatePortfolioPlanFieldValues successfully', function(done) {
        //uncomment below and update the code to test updatePortfolioPlanFieldValues
        //instance.updatePortfolioPlanFieldValues(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updatePortfolioPlanFieldValuesWithZero', function() {
      it('should call updatePortfolioPlanFieldValuesWithZero successfully', function(done) {
        //uncomment below and update the code to test updatePortfolioPlanFieldValuesWithZero
        //instance.updatePortfolioPlanFieldValuesWithZero(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updatePortfolioPlanUsers', function() {
      it('should call updatePortfolioPlanUsers successfully', function(done) {
        //uncomment below and update the code to test updatePortfolioPlanUsers
        //instance.updatePortfolioPlanUsers(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
