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
import com.decisionlens.client.model.Source;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SourcesApi {
    private ApiClient apiClient;

    public SourcesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SourcesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for fetchDataForSource
     * @param id Source id (required)
     * @param priorityScenario Priority Scenario name (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call fetchDataForSourceCall(String id, String priorityScenario, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sources/{id}/fetchData"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (priorityScenario != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("priorityScenario", priorityScenario));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call fetchDataForSourceValidateBeforeCall(String id, String priorityScenario, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling fetchDataForSource(Async)");
        }
        

        com.squareup.okhttp.Call call = fetchDataForSourceCall(id, priorityScenario, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch data for source.
     * 
     * @param id Source id (required)
     * @param priorityScenario Priority Scenario name (optional)
     * @return Source
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Source fetchDataForSource(String id, String priorityScenario) throws ApiException {
        ApiResponse<Source> resp = fetchDataForSourceWithHttpInfo(id, priorityScenario);
        return resp.getData();
    }

    /**
     * Fetch data for source.
     * 
     * @param id Source id (required)
     * @param priorityScenario Priority Scenario name (optional)
     * @return ApiResponse&lt;Source&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Source> fetchDataForSourceWithHttpInfo(String id, String priorityScenario) throws ApiException {
        com.squareup.okhttp.Call call = fetchDataForSourceValidateBeforeCall(id, priorityScenario, null, null);
        Type localVarReturnType = new TypeToken<Source>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch data for source. (asynchronously)
     * 
     * @param id Source id (required)
     * @param priorityScenario Priority Scenario name (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call fetchDataForSourceAsync(String id, String priorityScenario, final ApiCallback<Source> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = fetchDataForSourceValidateBeforeCall(id, priorityScenario, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Source>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for sendDataForSource
     * @param id Source id (required)
     * @param statuses Statuses (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call sendDataForSourceCall(String id, List<String> statuses, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = statuses;

        // create path and map variables
        String localVarPath = "/sources/{id}/sendData"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call sendDataForSourceValidateBeforeCall(String id, List<String> statuses, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling sendDataForSource(Async)");
        }
        
        // verify the required parameter 'statuses' is set
        if (statuses == null) {
            throw new ApiException("Missing the required parameter 'statuses' when calling sendDataForSource(Async)");
        }
        

        com.squareup.okhttp.Call call = sendDataForSourceCall(id, statuses, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Send data for source.
     * 
     * @param id Source id (required)
     * @param statuses Statuses (required)
     * @return Source
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Source sendDataForSource(String id, List<String> statuses) throws ApiException {
        ApiResponse<Source> resp = sendDataForSourceWithHttpInfo(id, statuses);
        return resp.getData();
    }

    /**
     * Send data for source.
     * 
     * @param id Source id (required)
     * @param statuses Statuses (required)
     * @return ApiResponse&lt;Source&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Source> sendDataForSourceWithHttpInfo(String id, List<String> statuses) throws ApiException {
        com.squareup.okhttp.Call call = sendDataForSourceValidateBeforeCall(id, statuses, null, null);
        Type localVarReturnType = new TypeToken<Source>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send data for source. (asynchronously)
     * 
     * @param id Source id (required)
     * @param statuses Statuses (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sendDataForSourceAsync(String id, List<String> statuses, final ApiCallback<Source> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = sendDataForSourceValidateBeforeCall(id, statuses, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Source>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
