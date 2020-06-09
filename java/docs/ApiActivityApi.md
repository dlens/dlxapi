# ApiActivityApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resetApiActivityTime**](ApiActivityApi.md#resetApiActivityTime) | **POST** /apiActivity/reset | Reset last API Acitivity time


<a name="resetApiActivityTime"></a>
# **resetApiActivityTime**
> resetApiActivityTime()

Reset last API Acitivity time

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.ApiActivityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ApiActivityApi apiInstance = new ApiActivityApi();
try {
    apiInstance.resetApiActivityTime();
} catch (ApiException e) {
    System.err.println("Exception when calling ApiActivityApi#resetApiActivityTime");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

