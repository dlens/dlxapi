# DecisionLensApi.ScoreWeightsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getScoreWeightsForPortfolio**](ScoreWeightsApi.md#getScoreWeightsForPortfolio) | **GET** /scoreWeights | Fetch score weights for portfolio
[**updateScoreWeightsForPortfolio**](ScoreWeightsApi.md#updateScoreWeightsForPortfolio) | **PATCH** /scoreWeights | Updates Score Weights for portfolio


<a name="getScoreWeightsForPortfolio"></a>
# **getScoreWeightsForPortfolio**
> ScoreWeights getScoreWeightsForPortfolio(portfolioId, opts)

Fetch score weights for portfolio

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ScoreWeightsApi();

var portfolioId = "portfolioId_example"; // String | Portfolio id

var opts = { 
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
apiInstance.getScoreWeightsForPortfolio(portfolioId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id | 
 **limit** | **Number**| Pagination limit | [optional] 
 **offset** | **Number**| Pagination offset | [optional] 
 **orderBy** | **String**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 
 **match** | **String**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**ScoreWeights**](ScoreWeights.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateScoreWeightsForPortfolio"></a>
# **updateScoreWeightsForPortfolio**
> [ScoreWeight] updateScoreWeightsForPortfolio(scoreWeights)

Updates Score Weights for portfolio

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ScoreWeightsApi();

var scoreWeights = [new DecisionLensApi.ScoreWeight()]; // [ScoreWeight] | Score Weights


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateScoreWeightsForPortfolio(scoreWeights, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scoreWeights** | [**[ScoreWeight]**](ScoreWeight.md)| Score Weights | 

### Return type

[**[ScoreWeight]**](ScoreWeight.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json

