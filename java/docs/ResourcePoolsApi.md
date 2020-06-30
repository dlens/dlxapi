# ResourcePoolsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResourcePool**](ResourcePoolsApi.md#getResourcePool) | **GET** /resourcePools/{id} | Retrieves a resource pool.


<a name="getResourcePool"></a>
# **getResourcePool**
> ResourcePool getResourcePool(id)

Retrieves a resource pool.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.ResourcePoolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ResourcePoolsApi apiInstance = new ResourcePoolsApi();
String id = "id_example"; // String | Resource Pool id
try {
    ResourcePool result = apiInstance.getResourcePool(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcePoolsApi#getResourcePool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Resource Pool id |

### Return type

[**ResourcePool**](ResourcePool.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

