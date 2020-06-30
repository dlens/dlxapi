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
import com.decisionlens.client.model.MessageToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageTokensApi {
    private ApiClient apiClient;

    public MessageTokensApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MessageTokensApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getMessageToken
     * @param destinationType Message destination type (required)
     * @param portfolioId Portfolio id for PORTFOLIO destination type (optional)
     * @param portfolioPlanId Portfolio plan id for PORTFOLIOPLAN destination type (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMessageTokenCall(Object destinationType, String portfolioId, String portfolioPlanId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/messageTokens";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (destinationType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("destinationType", destinationType));
        if (portfolioId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("portfolioId", portfolioId));
        if (portfolioPlanId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("portfolioPlanId", portfolioPlanId));

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
    private com.squareup.okhttp.Call getMessageTokenValidateBeforeCall(Object destinationType, String portfolioId, String portfolioPlanId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'destinationType' is set
        if (destinationType == null) {
            throw new ApiException("Missing the required parameter 'destinationType' when calling getMessageToken(Async)");
        }
        

        com.squareup.okhttp.Call call = getMessageTokenCall(destinationType, portfolioId, portfolioPlanId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get message authorization token for a destination
     * 
     * @param destinationType Message destination type (required)
     * @param portfolioId Portfolio id for PORTFOLIO destination type (optional)
     * @param portfolioPlanId Portfolio plan id for PORTFOLIOPLAN destination type (optional)
     * @return MessageToken
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MessageToken getMessageToken(Object destinationType, String portfolioId, String portfolioPlanId) throws ApiException {
        ApiResponse<MessageToken> resp = getMessageTokenWithHttpInfo(destinationType, portfolioId, portfolioPlanId);
        return resp.getData();
    }

    /**
     * Get message authorization token for a destination
     * 
     * @param destinationType Message destination type (required)
     * @param portfolioId Portfolio id for PORTFOLIO destination type (optional)
     * @param portfolioPlanId Portfolio plan id for PORTFOLIOPLAN destination type (optional)
     * @return ApiResponse&lt;MessageToken&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MessageToken> getMessageTokenWithHttpInfo(Object destinationType, String portfolioId, String portfolioPlanId) throws ApiException {
        com.squareup.okhttp.Call call = getMessageTokenValidateBeforeCall(destinationType, portfolioId, portfolioPlanId, null, null);
        Type localVarReturnType = new TypeToken<MessageToken>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get message authorization token for a destination (asynchronously)
     * 
     * @param destinationType Message destination type (required)
     * @param portfolioId Portfolio id for PORTFOLIO destination type (optional)
     * @param portfolioPlanId Portfolio plan id for PORTFOLIOPLAN destination type (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMessageTokenAsync(Object destinationType, String portfolioId, String portfolioPlanId, final ApiCallback<MessageToken> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMessageTokenValidateBeforeCall(destinationType, portfolioId, portfolioPlanId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MessageToken>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}