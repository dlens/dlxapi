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
import com.decisionlens.client.model.JiraComment;
import com.decisionlens.client.model.JiraFieldMapping;
import com.decisionlens.client.model.JiraFieldMappings;
import com.decisionlens.client.model.JiraInstance;
import com.decisionlens.client.model.MappedProject;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JiraApi
 */
@Ignore
public class JiraApiTest {

    private final JiraApi api = new JiraApi();

    
    /**
     * 
     *
     * Creates a comment in Decision Lens based on a Jira comment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCommentFromJiraTest() throws ApiException {
        String id = null;
        JiraComment body = null;
        api.createCommentFromJira(id, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates jira field mapping.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createJiraFieldMappingTest() throws ApiException {
        String id = null;
        JiraFieldMapping body = null;
        JiraFieldMapping response = api.createJiraFieldMapping(id, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates jira instance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createJiraInstanceTest() throws ApiException {
        JiraInstance body = null;
        JiraInstance response = api.createJiraInstance(body);

        // TODO: test validations
    }
    
    /**
     * Delete jira field mapping
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFieldMappingTest() throws ApiException {
        String id = null;
        api.deleteFieldMapping(id);

        // TODO: test validations
    }
    
    /**
     * Delete jira instance
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJiraInstanceTest() throws ApiException {
        String id = null;
        api.deleteJiraInstance(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Disable Jira Instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void disableJiraInstanceTest() throws ApiException {
        String id = null;
        api.disableJiraInstance(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Enable Jira Instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enableJiraInstanceTest() throws ApiException {
        String id = null;
        api.enableJiraInstance(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get Jira field mapping
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFieldMappingTest() throws ApiException {
        String id = null;
        String mappingId = null;
        JiraFieldMapping response = api.getFieldMapping(id, mappingId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get Jira field mappings for an instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFieldMappingsTest() throws ApiException {
        String id = null;
        JiraFieldMappings response = api.getFieldMappings(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get Jira Instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJiraInstanceTest() throws ApiException {
        String id = null;
        JiraInstance response = api.getJiraInstance(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Return mapped Decision Lens project for a Jira epic
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMappedProjectForEpicTest() throws ApiException {
        String id = null;
        String epicId = null;
        MappedProject response = api.getMappedProjectForEpic(id, epicId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Run synchronization process for Jira Instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startSyncForJiraInstanceTest() throws ApiException {
        String id = null;
        api.startSyncForJiraInstance(id);

        // TODO: test validations
    }
    
}
