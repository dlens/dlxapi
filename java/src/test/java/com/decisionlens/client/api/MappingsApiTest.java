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
import java.io.File;
import com.decisionlens.client.model.Mapping;
import com.decisionlens.client.model.Mappings;
import com.decisionlens.client.model.Operations;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MappingsApi
 */
@Ignore
public class MappingsApiTest {

    private final MappingsApi api = new MappingsApi();

    
    /**
     * Accepts upload of spreadsheet and converts data into mappings.
     *
     * Maps the fields in the spreadsheet to appropriate buckets
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void spreadsheetToMappingsTest() throws ApiException {
        File file = null;
        Mappings response = api.spreadsheetToMappings(file);

        // TODO: test validations
    }
    
    /**
     * Update mapping
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMappingTest() throws ApiException {
        String id = null;
        Operations body = null;
        String expand = null;
        List<Mapping> response = api.updateMapping(id, body, expand);

        // TODO: test validations
    }
    
}
