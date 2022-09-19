# DecisionLensApi.SourcesApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchDataForSource**](SourcesApi.md#fetchDataForSource) | **GET** /sources/{id}/fetchData | Fetch data for source.
[**sendDataForSource**](SourcesApi.md#sendDataForSource) | **POST** /sources/{id}/sendData | Send data for source.


<a name="fetchDataForSource"></a>
# **fetchDataForSource**
> Source fetchDataForSource(id, opts)

Fetch data for source.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.SourcesApi();

var id = "id_example"; // String | Source id

var opts = { 
  'priorityScenario': "priorityScenario_example" // String | Priority Scenario name
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.fetchDataForSource(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Source id | 
 **priorityScenario** | **String**| Priority Scenario name | [optional] 

### Return type

[**Source**](Source.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendDataForSource"></a>
# **sendDataForSource**
> Source sendDataForSource(id, statuses)

Send data for source.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.SourcesApi();

var id = "id_example"; // String | Source id

var statuses = [new DecisionLensApi.[String]()]; // [String] | Statuses


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.sendDataForSource(id, statuses, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Source id | 
 **statuses** | **[String]**| Statuses | 

### Return type

[**Source**](Source.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

