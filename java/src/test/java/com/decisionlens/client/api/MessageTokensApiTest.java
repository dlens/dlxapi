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
import com.decisionlens.client.model.MessageToken;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessageTokensApi
 */
@Ignore
public class MessageTokensApiTest {

    private final MessageTokensApi api = new MessageTokensApi();

    
    /**
     * Get message authorization token for a destination
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMessageTokenTest() throws ApiException {
        Object destinationType = null;
        String portfolioId = null;
        String portfolioPlanId = null;
        MessageToken response = api.getMessageToken(destinationType, portfolioId, portfolioPlanId);

        // TODO: test validations
    }
    
}
