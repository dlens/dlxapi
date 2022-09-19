# DecisionLensApi.PodsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**importPodTemplate**](PodsApi.md#importPodTemplate) | **PUT** /pods/template | Import pod template in JSON format


<a name="importPodTemplate"></a>
# **importPodTemplate**
> importPodTemplate(podFile, templateName)

Import pod template in JSON format

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PodsApi();

var podFile = "/path/to/file.txt"; // File | The pod file to upload.

var templateName = "templateName_example"; // String | pod template name


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.importPodTemplate(podFile, templateName, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **podFile** | **File**| The pod file to upload. | 
 **templateName** | **String**| pod template name | 

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

