# DecisionLensApi.GoalsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGoalsForPortfolio**](GoalsApi.md#getGoalsForPortfolio) | **GET** /goals | Get Goals by portfolio id
[**updateGoalsForPortfolio**](GoalsApi.md#updateGoalsForPortfolio) | **PATCH** /goals | Updates Goals for portfolio


<a name="getGoalsForPortfolio"></a>
# **getGoalsForPortfolio**
> Goals getGoalsForPortfolio(portfolioId, opts)

Get Goals by portfolio id

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.GoalsApi();

var portfolioId = "portfolioId_example"; // String | Portfolio id

var opts = { 
  'offset': 56, // Number | Pagination offset
  'limit': 56, // Number | Pagination limit
  'orderBy': "orderBy_example", // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGoalsForPortfolio(portfolioId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id | 
 **offset** | **Number**| Pagination offset | [optional] 
 **limit** | **Number**| Pagination limit | [optional] 
 **orderBy** | **String**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 

### Return type

[**Goals**](Goals.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateGoalsForPortfolio"></a>
# **updateGoalsForPortfolio**
> [Goal] updateGoalsForPortfolio(portfolioId, goals)

Updates Goals for portfolio

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.GoalsApi();

var portfolioId = "portfolioId_example"; // String | Portfolio id

var goals = [new DecisionLensApi.Goal()]; // [Goal] | Goals


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateGoalsForPortfolio(portfolioId, goals, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id | 
 **goals** | [**[Goal]**](Goal.md)| Goals | 

### Return type

[**[Goal]**](Goal.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json

