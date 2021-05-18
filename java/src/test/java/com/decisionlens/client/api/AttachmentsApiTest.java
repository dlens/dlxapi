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
import com.decisionlens.client.model.Attachment;
import com.decisionlens.client.model.Attachments;
import com.decisionlens.client.model.ErrorResponse;
import java.io.File;
import com.decisionlens.client.model.Operations;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AttachmentsApi
 */
@Ignore
public class AttachmentsApiTest {

    private final AttachmentsApi api = new AttachmentsApi();

    
    /**
     * Creates a new attachment from a file upload
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAttachmentTest() throws ApiException {
        File file = null;
        String portfolioId = null;
        Attachment response = api.createAttachment(file, portfolioId);

        // TODO: test validations
    }
    
    /**
     * Downloads the file content of an Attachment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadAttachmentTest() throws ApiException {
        String id = null;
        byte[] response = api.downloadAttachment(id);

        // TODO: test validations
    }
    
    /**
     * Get Attachment by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttachmentTest() throws ApiException {
        String id = null;
        Attachment response = api.getAttachment(id);

        // TODO: test validations
    }
    
    /**
     * Get Attachment by portfolio id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttachmentsTest() throws ApiException {
        String portfolioId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String match = null;
        Attachments response = api.getAttachments(portfolioId, offset, limit, orderBy, match);

        // TODO: test validations
    }
    
    /**
     * Update a single attachment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAttachmentTest() throws ApiException {
        String id = null;
        Operations body = null;
        Attachment response = api.updateAttachment(id, body);

        // TODO: test validations
    }
    
}
