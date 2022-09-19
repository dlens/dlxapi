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
    instance = new DecisionLensApi.ProjectsApi();
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

  describe('ProjectsApi', function() {
    describe('addContributingUsersForProject', function() {
      it('should call addContributingUsersForProject successfully', function(done) {
        //uncomment below and update the code to test addContributingUsersForProject
        //instance.addContributingUsersForProject(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('copyProject', function() {
      it('should call copyProject successfully', function(done) {
        //uncomment below and update the code to test copyProject
        //instance.copyProject(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createProject', function() {
      it('should call createProject successfully', function(done) {
        //uncomment below and update the code to test createProject
        //instance.createProject(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteFieldValuesForProject', function() {
      it('should call deleteFieldValuesForProject successfully', function(done) {
        //uncomment below and update the code to test deleteFieldValuesForProject
        //instance.deleteFieldValuesForProject(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteProject', function() {
      it('should call deleteProject successfully', function(done) {
        //uncomment below and update the code to test deleteProject
        //instance.deleteProject(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteProjects', function() {
      it('should call deleteProjects successfully', function(done) {
        //uncomment below and update the code to test deleteProjects
        //instance.deleteProjects(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getProject', function() {
      it('should call getProject successfully', function(done) {
        //uncomment below and update the code to test getProject
        //instance.getProject(function(error) {
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
    describe('getProjectsDataForPortfolio', function() {
      it('should call getProjectsDataForPortfolio successfully', function(done) {
        //uncomment below and update the code to test getProjectsDataForPortfolio
        //instance.getProjectsDataForPortfolio(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getProjectsForPortfolio', function() {
      it('should call getProjectsForPortfolio successfully', function(done) {
        //uncomment below and update the code to test getProjectsForPortfolio
        //instance.getProjectsForPortfolio(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('removeContributingUsersFromProject', function() {
      it('should call removeContributingUsersFromProject successfully', function(done) {
        //uncomment below and update the code to test removeContributingUsersFromProject
        //instance.removeContributingUsersFromProject(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('setProjectDependencies', function() {
      it('should call setProjectDependencies successfully', function(done) {
        //uncomment below and update the code to test setProjectDependencies
        //instance.setProjectDependencies(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
