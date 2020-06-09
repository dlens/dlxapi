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
import com.decisionlens.client.model.KloudlessFile;
import com.decisionlens.client.model.Mappings;
import com.decisionlens.client.model.Spreadsheet;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SpreadsheetApi
 */
@Ignore
public class SpreadsheetApiTest {

    private final SpreadsheetApi api = new SpreadsheetApi();

    
    /**
     * 
     *
     * Creates spreadsheet from file upload.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSpreadsheetTest() throws ApiException {
        File file = null;
        Spreadsheet response = api.createSpreadsheet(file);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates spreadsheet from kloudless file
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSpreadsheetForKloudlessFileTest() throws ApiException {
        KloudlessFile kloudlessFile = null;
        Spreadsheet response = api.createSpreadsheetForKloudlessFile(kloudlessFile);

        // TODO: test validations
    }
    
    /**
     * Delete spreadsheet and mappings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSpreadsheetTest() throws ApiException {
        String id = null;
        api.deleteSpreadsheet(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get mappings for spreadsheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMappingsForSpreadsheetTest() throws ApiException {
        String id = null;
        String sheetName = null;
        Object importType = null;
        String expand = null;
        Mappings response = api.getMappingsForSpreadsheet(id, sheetName, importType, expand);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get spreadsheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSpreadsheetTest() throws ApiException {
        String id = null;
        Spreadsheet response = api.getSpreadsheet(id);

        // TODO: test validations
    }
    
}
