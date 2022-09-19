# DecisionLensApi.ClassificationApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClassificationData**](ClassificationApi.md#getClassificationData) | **GET** /classification/{dataType} | Fetch classification training or testing data.


<a name="getClassificationData"></a>
# **getClassificationData**
> Classifications getClassificationData(dataType)

Fetch classification training or testing data.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ClassificationApi();

var dataType = "dataType_example"; // String | dataType can be either training or testing


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClassificationData(dataType, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataType** | **String**| dataType can be either training or testing | 

### Return type

[**Classifications**](Classifications.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

