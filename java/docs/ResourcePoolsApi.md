# ResourcePoolsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResourcePool**](ResourcePoolsApi.md#getResourcePool) | **GET** /resourcePools/{id} | Retrieves a resource pool.
[**getResourcePoolsForPortfolioPlan**](ResourcePoolsApi.md#getResourcePoolsForPortfolioPlan) | **GET** /resourcePools | Fetch resource pools for portfolio plan
[**updateResourcePoolBudgetAmountsForPortfolioPlan**](ResourcePoolsApi.md#updateResourcePoolBudgetAmountsForPortfolioPlan) | **PATCH** /resourcePools | Update resource pool budget amounts in a portfolio plan


<a name="getResourcePool"></a>
# **getResourcePool**
> ResourcePool getResourcePool(id, portfolioPlanId)

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
String portfolioPlanId = "portfolioPlanId_example"; // String | Portfolio Plan id
try {
    ResourcePool result = apiInstance.getResourcePool(id, portfolioPlanId);
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
 **portfolioPlanId** | **String**| Portfolio Plan id | [optional]

### Return type

[**ResourcePool**](ResourcePool.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getResourcePoolsForPortfolioPlan"></a>
# **getResourcePoolsForPortfolioPlan**
> ResourcePools getResourcePoolsForPortfolioPlan(portfolioPlanId, planOverridesOnly, expand, limit, offset, orderBy, match)

Fetch resource pools for portfolio plan

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
String portfolioPlanId = "portfolioPlanId_example"; // String | Portfolio Plan id
Boolean planOverridesOnly = false; // Boolean | Returns only plan overrides. default is false.
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
Integer limit = 56; // Integer | Pagination limit
Integer offset = 56; // Integer | Pagination offset
String orderBy = "orderBy_example"; // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
String match = "match_example"; // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
try {
    ResourcePools result = apiInstance.getResourcePoolsForPortfolioPlan(portfolioPlanId, planOverridesOnly, expand, limit, offset, orderBy, match);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcePoolsApi#getResourcePoolsForPortfolioPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioPlanId** | **String**| Portfolio Plan id |
 **planOverridesOnly** | **Boolean**| Returns only plan overrides. default is false. | [optional] [default to false]
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]
 **limit** | **Integer**| Pagination limit | [optional]
 **offset** | **Integer**| Pagination offset | [optional]
 **orderBy** | **String**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional]
 **match** | **String**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional]

### Return type

[**ResourcePools**](ResourcePools.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateResourcePoolBudgetAmountsForPortfolioPlan"></a>
# **updateResourcePoolBudgetAmountsForPortfolioPlan**
> List&lt;ResourcePool&gt; updateResourcePoolBudgetAmountsForPortfolioPlan(portfolioPlanId, body)

Update resource pool budget amounts in a portfolio plan

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
String portfolioPlanId = "portfolioPlanId_example"; // String | Portfolio Plan id
List<ResourcePoolBudgetAmountPatchItem> body = Arrays.asList(new ResourcePoolBudgetAmountPatchItem()); // List<ResourcePoolBudgetAmountPatchItem> | JSON Patch Operations to update multiple resource pool budget amounts
try {
    List<ResourcePool> result = apiInstance.updateResourcePoolBudgetAmountsForPortfolioPlan(portfolioPlanId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcePoolsApi#updateResourcePoolBudgetAmountsForPortfolioPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioPlanId** | **String**| Portfolio Plan id |
 **body** | [**List&lt;ResourcePoolBudgetAmountPatchItem&gt;**](ResourcePoolBudgetAmountPatchItem.md)| JSON Patch Operations to update multiple resource pool budget amounts |

### Return type

[**List&lt;ResourcePool&gt;**](ResourcePool.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

