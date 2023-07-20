# GoalsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGoalsForPortfolio**](GoalsApi.md#getGoalsForPortfolio) | **GET** /goals | Get Goals by portfolio id
[**updateGoalsForPortfolio**](GoalsApi.md#updateGoalsForPortfolio) | **PATCH** /goals | Updates Goals for portfolio


<a name="getGoalsForPortfolio"></a>
# **getGoalsForPortfolio**
> Goals getGoalsForPortfolio(portfolioId, offset, limit, orderBy)

Get Goals by portfolio id

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.GoalsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

GoalsApi apiInstance = new GoalsApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id
Integer offset = 56; // Integer | Pagination offset
Integer limit = 56; // Integer | Pagination limit
String orderBy = "orderBy_example"; // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
try {
    Goals result = apiInstance.getGoalsForPortfolio(portfolioId, offset, limit, orderBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalsApi#getGoalsForPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id |
 **offset** | **Integer**| Pagination offset | [optional]
 **limit** | **Integer**| Pagination limit | [optional]
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
> List&lt;Goal&gt; updateGoalsForPortfolio(portfolioId, goals)

Updates Goals for portfolio

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.GoalsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

GoalsApi apiInstance = new GoalsApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id
List<Goal> goals = Arrays.asList(new Goal()); // List<Goal> | Goals
try {
    List<Goal> result = apiInstance.updateGoalsForPortfolio(portfolioId, goals);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoalsApi#updateGoalsForPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id |
 **goals** | [**List&lt;Goal&gt;**](Goal.md)| Goals |

### Return type

[**List&lt;Goal&gt;**](Goal.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json

