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

import com.decisionlens.client.ApiCallback;
import com.decisionlens.client.ApiClient;
import com.decisionlens.client.ApiException;
import com.decisionlens.client.ApiResponse;
import com.decisionlens.client.Configuration;
import com.decisionlens.client.Pair;
import com.decisionlens.client.ProgressRequestBody;
import com.decisionlens.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.decisionlens.client.model.ErrorResponse;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PodsApi {
    private ApiClient apiClient;

    public PodsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PodsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for importPodTemplate
     * @param podFile The pod file to upload. (required)
     * @param templateName pod template name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call importPodTemplateCall(File podFile, String templateName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pods/template";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (podFile != null)
        localVarFormParams.put("podFile", podFile);
        if (templateName != null)
        localVarFormParams.put("templateName", templateName);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call importPodTemplateValidateBeforeCall(File podFile, String templateName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'podFile' is set
        if (podFile == null) {
            throw new ApiException("Missing the required parameter 'podFile' when calling importPodTemplate(Async)");
        }
        
        // verify the required parameter 'templateName' is set
        if (templateName == null) {
            throw new ApiException("Missing the required parameter 'templateName' when calling importPodTemplate(Async)");
        }
        

        com.squareup.okhttp.Call call = importPodTemplateCall(podFile, templateName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Import pod template in JSON format
     * 
     * @param podFile The pod file to upload. (required)
     * @param templateName pod template name (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void importPodTemplate(File podFile, String templateName) throws ApiException {
        importPodTemplateWithHttpInfo(podFile, templateName);
    }

    /**
     * Import pod template in JSON format
     * 
     * @param podFile The pod file to upload. (required)
     * @param templateName pod template name (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> importPodTemplateWithHttpInfo(File podFile, String templateName) throws ApiException {
        com.squareup.okhttp.Call call = importPodTemplateValidateBeforeCall(podFile, templateName, null, null);
        return apiClient.execute(call);
    }

    /**
     * Import pod template in JSON format (asynchronously)
     * 
     * @param podFile The pod file to upload. (required)
     * @param templateName pod template name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call importPodTemplateAsync(File podFile, String templateName, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = importPodTemplateValidateBeforeCall(podFile, templateName, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
