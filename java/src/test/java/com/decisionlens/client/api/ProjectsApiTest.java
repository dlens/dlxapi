/*
 * Decision Lens API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.decisionlens.client.api;

import com.decisionlens.client.ApiException;
import com.decisionlens.client.model.ErrorResponse;
import com.decisionlens.client.model.Project;
import com.decisionlens.client.model.Projects;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectsApi
 */
@Ignore
public class ProjectsApiTest {

    private final ProjectsApi api = new ProjectsApi();

    
    /**
     * Creates a new project.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProjectTest() throws ApiException {
        String portfolioId = null;
        Project project = null;
        Project response = api.createProject(portfolioId, project);

        // TODO: test validations
    }
    
    /**
     * Delete a project.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProjectTest() throws ApiException {
        String id = null;
        api.deleteProject(id);

        // TODO: test validations
    }
    
    /**
     * Delete projects.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProjectsTest() throws ApiException {
        List<String> projectIds = null;
        api.deleteProjects(projectIds);

        // TODO: test validations
    }
    
    /**
     * Retrieves a project.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectTest() throws ApiException {
        String id = null;
        Project response = api.getProject(id);

        // TODO: test validations
    }
    
    /**
     * Retrieves a project for a portfolioPlan.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectForPortfolioPlanTest() throws ApiException {
        String projectId = null;
        String portfolioPlanId = null;
        Project response = api.getProjectForPortfolioPlan(projectId, portfolioPlanId);

        // TODO: test validations
    }
    
    /**
     * Retrieves projects contained within a portfolio. Possible expand paths are - (items.fieldValues, contributingUserIds)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectsForPortfolioTest() throws ApiException {
        String portfolioId = null;
        String portfolioPlanId = null;
        String expand = null;
        Integer limit = null;
        Integer offset = null;
        String orderBy = null;
        String match = null;
        Projects response = api.getProjectsForPortfolio(portfolioId, portfolioPlanId, expand, limit, offset, orderBy, match);

        // TODO: test validations
    }
    
}
