# DecisionLensApi.ResourcePoolsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResourcePool**](ResourcePoolsApi.md#getResourcePool) | **GET** /resourcePools/{id} | Retrieves a resource pool.
[**getResourcePoolsForPortfolioPlan**](ResourcePoolsApi.md#getResourcePoolsForPortfolioPlan) | **GET** /resourcePools | Fetch resource pools for portfolio plan
[**updateResourcePoolBudgetAmountsForPortfolioPlan**](ResourcePoolsApi.md#updateResourcePoolBudgetAmountsForPortfolioPlan) | **PATCH** /resourcePools | Update resource pool budget amounts in a portfolio plan


<a name="getResourcePool"></a>
# **getResourcePool**
> ResourcePool getResourcePool(id, opts)

Retrieves a resource pool.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ResourcePoolsApi();

var id = "id_example"; // String | Resource Pool id

var opts = { 
  'portfolioPlanId': "portfolioPlanId_example" // String | Portfolio Plan id
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getResourcePool(id, opts, callback);
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
> ResourcePools getResourcePoolsForPortfolioPlan(portfolioPlanId, opts)

Fetch resource pools for portfolio plan

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ResourcePoolsApi();

var portfolioPlanId = "portfolioPlanId_example"; // String | Portfolio Plan id

var opts = { 
  'planOverridesOnly': false, // Boolean | Returns only plan overrides. default is false.
  'expand': "expand_example" // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
  'limit': 56, // Number | Pagination limit
  'offset': 56, // Number | Pagination offset
  'orderBy': "orderBy_example", // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
  'match': "match_example" // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getResourcePoolsForPortfolioPlan(portfolioPlanId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioPlanId** | **String**| Portfolio Plan id | 
 **planOverridesOnly** | **Boolean**| Returns only plan overrides. default is false. | [optional] [default to false]
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **Number**| Pagination limit | [optional] 
 **offset** | **Number**| Pagination offset | [optional] 
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
> [ResourcePool] updateResourcePoolBudgetAmountsForPortfolioPlan(portfolioPlanId, body)

Update resource pool budget amounts in a portfolio plan

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ResourcePoolsApi();

var portfolioPlanId = "portfolioPlanId_example"; // String | Portfolio Plan id

var body = [new DecisionLensApi.ResourcePoolBudgetAmountPatchItem()]; // [ResourcePoolBudgetAmountPatchItem] | JSON Patch Operations to update multiple resource pool budget amounts


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateResourcePoolBudgetAmountsForPortfolioPlan(portfolioPlanId, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioPlanId** | **String**| Portfolio Plan id | 
 **body** | [**[ResourcePoolBudgetAmountPatchItem]**](ResourcePoolBudgetAmountPatchItem.md)| JSON Patch Operations to update multiple resource pool budget amounts | 

### Return type

[**[ResourcePool]**](ResourcePool.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

