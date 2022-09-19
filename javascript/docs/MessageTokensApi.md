# DecisionLensApi.MessageTokensApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMessageToken**](MessageTokensApi.md#getMessageToken) | **GET** /messageTokens | Get message authorization token for a destination


<a name="getMessageToken"></a>
# **getMessageToken**
> MessageToken getMessageToken(destinationType, opts)

Get message authorization token for a destination

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.MessageTokensApi();

var destinationType = null; // Object | Message destination type

var opts = { 
  'portfolioId': "portfolioId_example", // String | Portfolio id for PORTFOLIO destination type
  'portfolioPlanId': "portfolioPlanId_example" // String | Portfolio plan id for PORTFOLIOPLAN destination type
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getMessageToken(destinationType, opts, callback);
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

