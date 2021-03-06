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


import com.decisionlens.client.model.CategoryOption;
import com.decisionlens.client.model.CategoryOptions;
import com.decisionlens.client.model.ErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createCategoryOption
     * @param body Category option to create (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createCategoryOptionCall(CategoryOption body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/fields/{fieldId}/categoryOption";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private com.squareup.okhttp.Call createCategoryOptionValidateBeforeCall(CategoryOption body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createCategoryOption(Async)");
        }
        

        com.squareup.okhttp.Call call = createCategoryOptionCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a new category
     * 
     * @param body Category option to create (required)
     * @return CategoryOption
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CategoryOption createCategoryOption(CategoryOption body) throws ApiException {
        ApiResponse<CategoryOption> resp = createCategoryOptionWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Creates a new category
     * 
     * @param body Category option to create (required)
     * @return ApiResponse&lt;CategoryOption&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CategoryOption> createCategoryOptionWithHttpInfo(CategoryOption body) throws ApiException {
        com.squareup.okhttp.Call call = createCategoryOptionValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<CategoryOption>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a new category (asynchronously)
     * 
     * @param body Category option to create (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createCategoryOptionAsync(CategoryOption body, final ApiCallback<CategoryOption> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createCategoryOptionValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CategoryOption>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createCategoryOptions
     * @param body Category options to create (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createCategoryOptionsCall(CategoryOptions body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/fields/{fieldId}/categoryOptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private com.squareup.okhttp.Call createCategoryOptionsValidateBeforeCall(CategoryOptions body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createCategoryOptions(Async)");
        }
        

        com.squareup.okhttp.Call call = createCategoryOptionsCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates new category options
     * 
     * @param body Category options to create (required)
     * @return CategoryOptions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CategoryOptions createCategoryOptions(CategoryOptions body) throws ApiException {
        ApiResponse<CategoryOptions> resp = createCategoryOptionsWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Creates new category options
     * 
     * @param body Category options to create (required)
     * @return ApiResponse&lt;CategoryOptions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CategoryOptions> createCategoryOptionsWithHttpInfo(CategoryOptions body) throws ApiException {
        com.squareup.okhttp.Call call = createCategoryOptionsValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<CategoryOptions>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates new category options (asynchronously)
     * 
     * @param body Category options to create (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createCategoryOptionsAsync(CategoryOptions body, final ApiCallback<CategoryOptions> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createCategoryOptionsValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CategoryOptions>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteCategoryOption
     * @param fieldId Field id (required)
     * @param categoryOptionId Category Option ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCategoryOptionCall(String fieldId, String categoryOptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fields/{fieldId}/categoryOptions/{categoryOptionId}"
            .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()))
            .replaceAll("\\{" + "categoryOptionId" + "\\}", apiClient.escapeString(categoryOptionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteCategoryOptionValidateBeforeCall(String fieldId, String categoryOptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new ApiException("Missing the required parameter 'fieldId' when calling deleteCategoryOption(Async)");
        }
        
        // verify the required parameter 'categoryOptionId' is set
        if (categoryOptionId == null) {
            throw new ApiException("Missing the required parameter 'categoryOptionId' when calling deleteCategoryOption(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteCategoryOptionCall(fieldId, categoryOptionId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a single category option
     * 
     * @param fieldId Field id (required)
     * @param categoryOptionId Category Option ID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteCategoryOption(String fieldId, String categoryOptionId) throws ApiException {
        deleteCategoryOptionWithHttpInfo(fieldId, categoryOptionId);
    }

    /**
     * Delete a single category option
     * 
     * @param fieldId Field id (required)
     * @param categoryOptionId Category Option ID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteCategoryOptionWithHttpInfo(String fieldId, String categoryOptionId) throws ApiException {
        com.squareup.okhttp.Call call = deleteCategoryOptionValidateBeforeCall(fieldId, categoryOptionId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a single category option (asynchronously)
     * 
     * @param fieldId Field id (required)
     * @param categoryOptionId Category Option ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCategoryOptionAsync(String fieldId, String categoryOptionId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteCategoryOptionValidateBeforeCall(fieldId, categoryOptionId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getCategoryOption
     * @param fieldId Field id (required)
     * @param categoryOptionId Category Option id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCategoryOptionCall(String fieldId, String categoryOptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fields/{fieldId}/categoryOptions/{categoryOptionId}"
            .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()))
            .replaceAll("\\{" + "categoryOptionId" + "\\}", apiClient.escapeString(categoryOptionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call getCategoryOptionValidateBeforeCall(String fieldId, String categoryOptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new ApiException("Missing the required parameter 'fieldId' when calling getCategoryOption(Async)");
        }
        
        // verify the required parameter 'categoryOptionId' is set
        if (categoryOptionId == null) {
            throw new ApiException("Missing the required parameter 'categoryOptionId' when calling getCategoryOption(Async)");
        }
        

        com.squareup.okhttp.Call call = getCategoryOptionCall(fieldId, categoryOptionId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves a category
     * 
     * @param fieldId Field id (required)
     * @param categoryOptionId Category Option id (required)
     * @return CategoryOption
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CategoryOption getCategoryOption(String fieldId, String categoryOptionId) throws ApiException {
        ApiResponse<CategoryOption> resp = getCategoryOptionWithHttpInfo(fieldId, categoryOptionId);
        return resp.getData();
    }

    /**
     * Retrieves a category
     * 
     * @param fieldId Field id (required)
     * @param categoryOptionId Category Option id (required)
     * @return ApiResponse&lt;CategoryOption&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CategoryOption> getCategoryOptionWithHttpInfo(String fieldId, String categoryOptionId) throws ApiException {
        com.squareup.okhttp.Call call = getCategoryOptionValidateBeforeCall(fieldId, categoryOptionId, null, null);
        Type localVarReturnType = new TypeToken<CategoryOption>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves a category (asynchronously)
     * 
     * @param fieldId Field id (required)
     * @param categoryOptionId Category Option id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCategoryOptionAsync(String fieldId, String categoryOptionId, final ApiCallback<CategoryOption> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCategoryOptionValidateBeforeCall(fieldId, categoryOptionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CategoryOption>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCategoryOptionsForField
     * @param fieldId Field id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCategoryOptionsForFieldCall(String fieldId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fields/{fieldId}/categoryOptions"
            .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call getCategoryOptionsForFieldValidateBeforeCall(String fieldId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new ApiException("Missing the required parameter 'fieldId' when calling getCategoryOptionsForField(Async)");
        }
        

        com.squareup.okhttp.Call call = getCategoryOptionsForFieldCall(fieldId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves categories for a field
     * 
     * @param fieldId Field id (required)
     * @return CategoryOptions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CategoryOptions getCategoryOptionsForField(String fieldId) throws ApiException {
        ApiResponse<CategoryOptions> resp = getCategoryOptionsForFieldWithHttpInfo(fieldId);
        return resp.getData();
    }

    /**
     * Retrieves categories for a field
     * 
     * @param fieldId Field id (required)
     * @return ApiResponse&lt;CategoryOptions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CategoryOptions> getCategoryOptionsForFieldWithHttpInfo(String fieldId) throws ApiException {
        com.squareup.okhttp.Call call = getCategoryOptionsForFieldValidateBeforeCall(fieldId, null, null);
        Type localVarReturnType = new TypeToken<CategoryOptions>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves categories for a field (asynchronously)
     * 
     * @param fieldId Field id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCategoryOptionsForFieldAsync(String fieldId, final ApiCallback<CategoryOptions> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCategoryOptionsForFieldValidateBeforeCall(fieldId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CategoryOptions>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateCategoryOption
     * @param fieldId Field id (required)
     * @param categoryOptionId Category Option id (required)
     * @param body JSON Patch operations to update value field. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCategoryOptionCall(String fieldId, String categoryOptionId, CategoryOption body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/fields/{fieldId}/categoryOptions/{categoryOptionId}"
            .replaceAll("\\{" + "fieldId" + "\\}", apiClient.escapeString(fieldId.toString()))
            .replaceAll("\\{" + "categoryOptionId" + "\\}", apiClient.escapeString(categoryOptionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json-patch+json"
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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateCategoryOptionValidateBeforeCall(String fieldId, String categoryOptionId, CategoryOption body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new ApiException("Missing the required parameter 'fieldId' when calling updateCategoryOption(Async)");
        }
        
        // verify the required parameter 'categoryOptionId' is set
        if (categoryOptionId == null) {
            throw new ApiException("Missing the required parameter 'categoryOptionId' when calling updateCategoryOption(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateCategoryOption(Async)");
        }
        

        com.squareup.okhttp.Call call = updateCategoryOptionCall(fieldId, categoryOptionId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update a single category
     * 
     * @param fieldId Field id (required)
     * @param categoryOptionId Category Option id (required)
     * @param body JSON Patch operations to update value field. (required)
     * @return CategoryOption
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CategoryOption updateCategoryOption(String fieldId, String categoryOptionId, CategoryOption body) throws ApiException {
        ApiResponse<CategoryOption> resp = updateCategoryOptionWithHttpInfo(fieldId, categoryOptionId, body);
        return resp.getData();
    }

    /**
     * Update a single category
     * 
     * @param fieldId Field id (required)
     * @param categoryOptionId Category Option id (required)
     * @param body JSON Patch operations to update value field. (required)
     * @return ApiResponse&lt;CategoryOption&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CategoryOption> updateCategoryOptionWithHttpInfo(String fieldId, String categoryOptionId, CategoryOption body) throws ApiException {
        com.squareup.okhttp.Call call = updateCategoryOptionValidateBeforeCall(fieldId, categoryOptionId, body, null, null);
        Type localVarReturnType = new TypeToken<CategoryOption>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a single category (asynchronously)
     * 
     * @param fieldId Field id (required)
     * @param categoryOptionId Category Option id (required)
     * @param body JSON Patch operations to update value field. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCategoryOptionAsync(String fieldId, String categoryOptionId, CategoryOption body, final ApiCallback<CategoryOption> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateCategoryOptionValidateBeforeCall(fieldId, categoryOptionId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CategoryOption>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
