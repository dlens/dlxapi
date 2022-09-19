# DecisionLensApi.ActivitiesApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reindexActivities**](ActivitiesApi.md#reindexActivities) | **POST** /reindex/activities | Reindex activities. System Administator operation.


<a name="reindexActivities"></a>
# **reindexActivities**
> &#39;String&#39; reindexActivities(opts)

Reindex activities. System Administator operation.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ActivitiesApi();

var opts = { 
  'domains': ["domains_example"] // [String] | List of domains for where activities need to be reindexed, if not provided reindex will be done for all domains
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.reindexActivities(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domains** | [**[String]**](String.md)| List of domains for where activities need to be reindexed, if not provided reindex will be done for all domains | [optional] 

### Return type

**&#39;String&#39;**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

