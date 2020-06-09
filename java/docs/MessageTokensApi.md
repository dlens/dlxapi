# MessageTokensApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMessageToken**](MessageTokensApi.md#getMessageToken) | **GET** /messageTokens | Get message authorization token for a destination


<a name="getMessageToken"></a>
# **getMessageToken**
> MessageToken getMessageToken(destinationType, portfolioId, portfolioPlanId)

Get message authorization token for a destination

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.MessageTokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

MessageTokensApi apiInstance = new MessageTokensApi();
Object destinationType = null; // Object | Message destination type
String portfolioId = "portfolioId_example"; // String | Portfolio id for PORTFOLIO destination type
String portfolioPlanId = "portfolioPlanId_example"; // String | Portfolio plan id for PORTFOLIOPLAN destination type
try {
    MessageToken result = apiInstance.getMessageToken(destinationType, portfolioId, portfolioPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageTokensApi#getMessageToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **destinationType** | [**Object**](.md)| Message destination type |
 **portfolioId** | **String**| Portfolio id for PORTFOLIO destination type | [optional]
 **portfolioPlanId** | **String**| Portfolio plan id for PORTFOLIOPLAN destination type | [optional]

### Return type

[**MessageToken**](MessageToken.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

