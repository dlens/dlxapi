# ScoreWeightsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getScoreWeightsForPortfolio**](ScoreWeightsApi.md#getScoreWeightsForPortfolio) | **GET** /scoreWeights | Fetch score weights for portfolio
[**updateScoreWeightsForPortfolio**](ScoreWeightsApi.md#updateScoreWeightsForPortfolio) | **PATCH** /scoreWeights | Updates Score Weights for portfolio


<a name="getScoreWeightsForPortfolio"></a>
# **getScoreWeightsForPortfolio**
> ScoreWeights getScoreWeightsForPortfolio(portfolioId, limit, offset, orderBy, match)

Fetch score weights for portfolio

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.ScoreWeightsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ScoreWeightsApi apiInstance = new ScoreWeightsApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id
Integer limit = 56; // Integer | Pagination limit
Integer offset = 56; // Integer | Pagination offset
String orderBy = "orderBy_example"; // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
String match = "match_example"; // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
try {
    ScoreWeights result = apiInstance.getScoreWeightsForPortfolio(portfolioId, limit, offset, orderBy, match);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScoreWeightsApi#getScoreWeightsForPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id |
 **limit** | **Integer**| Pagination limit | [optional]
 **offset** | **Integer**| Pagination offset | [optional]
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
> List&lt;ScoreWeight&gt; updateScoreWeightsForPortfolio(scoreWeights)

Updates Score Weights for portfolio

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.ScoreWeightsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ScoreWeightsApi apiInstance = new ScoreWeightsApi();
List<ScoreWeight> scoreWeights = Arrays.asList(new ScoreWeight()); // List<ScoreWeight> | Score Weights
try {
    List<ScoreWeight> result = apiInstance.updateScoreWeightsForPortfolio(scoreWeights);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScoreWeightsApi#updateScoreWeightsForPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scoreWeights** | [**List&lt;ScoreWeight&gt;**](ScoreWeight.md)| Score Weights |

### Return type

[**List&lt;ScoreWeight&gt;**](ScoreWeight.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json

