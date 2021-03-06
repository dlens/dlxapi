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
import com.decisionlens.client.model.ResourcePool;
import com.decisionlens.client.model.ResourcePoolBudgetAmountPatchItem;
import com.decisionlens.client.model.ResourcePools;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResourcePoolsApi
 */
@Ignore
public class ResourcePoolsApiTest {

    private final ResourcePoolsApi api = new ResourcePoolsApi();

    
    /**
     * Retrieves a resource pool.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getResourcePoolTest() throws ApiException {
        String id = null;
        String portfolioPlanId = null;
        ResourcePool response = api.getResourcePool(id, portfolioPlanId);

        // TODO: test validations
    }
    
    /**
     * Fetch resource pools for portfolio plan
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getResourcePoolsForPortfolioPlanTest() throws ApiException {
        String portfolioPlanId = null;
        Boolean planOverridesOnly = null;
        String expand = null;
        Integer limit = null;
        Integer offset = null;
        String orderBy = null;
        String match = null;
        ResourcePools response = api.getResourcePoolsForPortfolioPlan(portfolioPlanId, planOverridesOnly, expand, limit, offset, orderBy, match);

        // TODO: test validations
    }
    
    /**
     * Update resource pool budget amounts in a portfolio plan
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateResourcePoolBudgetAmountsForPortfolioPlanTest() throws ApiException {
        String portfolioPlanId = null;
        List<ResourcePoolBudgetAmountPatchItem> body = null;
        List<ResourcePool> response = api.updateResourcePoolBudgetAmountsForPortfolioPlan(portfolioPlanId, body);

        // TODO: test validations
    }
    
}
