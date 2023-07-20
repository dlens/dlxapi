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


import com.decisionlens.client.model.Activities;
import com.decisionlens.client.model.ErrorResponse;
import com.decisionlens.client.model.User;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserApi {
    private ApiClient apiClient;

    public UserApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteUser
     * @param id User id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteUserCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteUserValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteUser(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteUserCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete user
     * 
     * @param id User id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteUser(String id) throws ApiException {
        deleteUserWithHttpInfo(id);
    }

    /**
     * Delete user
     * 
     * @param id User id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteUserWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = deleteUserValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete user (asynchronously)
     * 
     * @param id User id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteUserAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteUserValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getUser
     * @param id User id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
    private com.squareup.okhttp.Call getUserValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getUser(Async)");
        }
        

        com.squareup.okhttp.Call call = getUserCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get user
     * 
     * @param id User id (required)
     * @return User
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public User getUser(String id) throws ApiException {
        ApiResponse<User> resp = getUserWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get user
     * 
     * @param id User id (required)
     * @return ApiResponse&lt;User&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<User> getUserWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getUserValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get user (asynchronously)
     * 
     * @param id User id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserAsync(String id, final ApiCallback<User> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUserActivities
     * @param id User id (required)
     * @param limit Pagination limit (optional)
     * @param offset Pagination offset (optional)
     * @param match Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserActivitiesCall(String id, Integer limit, Integer offset, String match, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{id}/activities"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (match != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("match", match));

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
    private com.squareup.okhttp.Call getUserActivitiesValidateBeforeCall(String id, Integer limit, Integer offset, String match, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getUserActivities(Async)");
        }
        

        com.squareup.okhttp.Call call = getUserActivitiesCall(id, limit, offset, match, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get user activities
     * 
     * @param id User id (required)
     * @param limit Pagination limit (optional)
     * @param offset Pagination offset (optional)
     * @param match Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)
     * @return Activities
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Activities getUserActivities(String id, Integer limit, Integer offset, String match) throws ApiException {
        ApiResponse<Activities> resp = getUserActivitiesWithHttpInfo(id, limit, offset, match);
        return resp.getData();
    }

    /**
     * Get user activities
     * 
     * @param id User id (required)
     * @param limit Pagination limit (optional)
     * @param offset Pagination offset (optional)
     * @param match Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)
     * @return ApiResponse&lt;Activities&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Activities> getUserActivitiesWithHttpInfo(String id, Integer limit, Integer offset, String match) throws ApiException {
        com.squareup.okhttp.Call call = getUserActivitiesValidateBeforeCall(id, limit, offset, match, null, null);
        Type localVarReturnType = new TypeToken<Activities>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get user activities (asynchronously)
     * 
     * @param id User id (required)
     * @param limit Pagination limit (optional)
     * @param offset Pagination offset (optional)
     * @param match Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserActivitiesAsync(String id, Integer limit, Integer offset, String match, final ApiCallback<Activities> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserActivitiesValidateBeforeCall(id, limit, offset, match, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Activities>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUserActivitiesForGroup
     * @param limit Pagination limit (optional)
     * @param offset Pagination offset (optional)
     * @param match Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserActivitiesForGroupCall(Integer limit, Integer offset, String match, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/activities";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (match != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("match", match));

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
    private com.squareup.okhttp.Call getUserActivitiesForGroupValidateBeforeCall(Integer limit, Integer offset, String match, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getUserActivitiesForGroupCall(limit, offset, match, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get user activities for group
     * 
     * @param limit Pagination limit (optional)
     * @param offset Pagination offset (optional)
     * @param match Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)
     * @return Activities
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Activities getUserActivitiesForGroup(Integer limit, Integer offset, String match) throws ApiException {
        ApiResponse<Activities> resp = getUserActivitiesForGroupWithHttpInfo(limit, offset, match);
        return resp.getData();
    }

    /**
     * Get user activities for group
     * 
     * @param limit Pagination limit (optional)
     * @param offset Pagination offset (optional)
     * @param match Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)
     * @return ApiResponse&lt;Activities&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Activities> getUserActivitiesForGroupWithHttpInfo(Integer limit, Integer offset, String match) throws ApiException {
        com.squareup.okhttp.Call call = getUserActivitiesForGroupValidateBeforeCall(limit, offset, match, null, null);
        Type localVarReturnType = new TypeToken<Activities>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get user activities for group (asynchronously)
     * 
     * @param limit Pagination limit (optional)
     * @param offset Pagination offset (optional)
     * @param match Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserActivitiesForGroupAsync(Integer limit, Integer offset, String match, final ApiCallback<Activities> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserActivitiesForGroupValidateBeforeCall(limit, offset, match, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Activities>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
