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
import com.decisionlens.client.model.ScoreWeight;
import com.decisionlens.client.model.ScoreWeights;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScoreWeightsApi
 */
@Ignore
public class ScoreWeightsApiTest {

    private final ScoreWeightsApi api = new ScoreWeightsApi();

    
    /**
     * Fetch score weights for portfolio
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScoreWeightsForPortfolioTest() throws ApiException {
        String portfolioId = null;
        Integer limit = null;
        Integer offset = null;
        String orderBy = null;
        String match = null;
        ScoreWeights response = api.getScoreWeightsForPortfolio(portfolioId, limit, offset, orderBy, match);

        // TODO: test validations
    }
    
    /**
     * Updates Score Weights for portfolio
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateScoreWeightsForPortfolioTest() throws ApiException {
        List<ScoreWeight> scoreWeights = null;
        List<ScoreWeight> response = api.updateScoreWeightsForPortfolio(scoreWeights);

        // TODO: test validations
    }
    
}
