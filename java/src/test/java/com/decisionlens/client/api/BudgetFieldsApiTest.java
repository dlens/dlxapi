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
import com.decisionlens.client.model.Field;
import com.decisionlens.client.model.Fields;
import com.decisionlens.client.model.Operations;
import com.decisionlens.client.model.PatchItem;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BudgetFieldsApi
 */
@Ignore
public class BudgetFieldsApiTest {

    private final BudgetFieldsApi api = new BudgetFieldsApi();

    
    /**
     * Creates a new budget field
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBudgetFieldTest() throws ApiException {
        Field body = null;
        String expand = null;
        List<Field> response = api.createBudgetField(body, expand);

        // TODO: test validations
    }
    
    /**
     * Delete a budget field
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBudgetFieldTest() throws ApiException {
        String id = null;
        api.deleteBudgetField(id);

        // TODO: test validations
    }
    
    /**
     * Retrieves a budget field
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBudgetFieldTest() throws ApiException {
        String id = null;
        String expand = null;
        Field response = api.getBudgetField(id, expand);

        // TODO: test validations
    }
    
    /**
     * Retrieves budget fields for a portfolio.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBudgetFieldsForPortfolioTest() throws ApiException {
        String portfolioId = null;
        String expand = null;
        Integer limit = null;
        Integer offset = null;
        String orderBy = null;
        String match = null;
        Fields response = api.getBudgetFieldsForPortfolio(portfolioId, expand, limit, offset, orderBy, match);

        // TODO: test validations
    }
    
    /**
     * Updates a budget field utilizing JSON Patch Operations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBudgetFieldTest() throws ApiException {
        String id = null;
        Operations body = null;
        String expand = null;
        List<Field> response = api.updateBudgetField(id, body, expand);

        // TODO: test validations
    }
    
    /**
     * Update budget fields
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBudgetFieldsTest() throws ApiException {
        List<PatchItem> body = null;
        String expand = null;
        List<Field> response = api.updateBudgetFields(body, expand);

        // TODO: test validations
    }
    
}
