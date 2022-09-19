# DecisionLensApi.NotificationsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNotifications**](NotificationsApi.md#getNotifications) | **GET** /notifications | Retrieves portfolio notifications log.
[**reindexNotifications**](NotificationsApi.md#reindexNotifications) | **POST** /reindex/notifications | Reindex notifications. System Administator operation.


<a name="getNotifications"></a>
# **getNotifications**
> Activities getNotifications(portfolioId, opts)

Retrieves portfolio notifications log.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.NotificationsApi();

var portfolioId = "portfolioId_example"; // String | Portfolio id

var opts = { 
  'limit': 56, // Number | Pagination limit
  'offset': 56, // Number | Pagination offset
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getNotifications(portfolioId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id | 
 **limit** | **Number**| Pagination limit | [optional] 
 **offset** | **Number**| Pagination offset | [optional] 

### Return type

[**Activities**](Activities.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reindexNotifications"></a>
# **reindexNotifications**
> &#39;String&#39; reindexNotifications(opts)

Reindex notifications. System Administator operation.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.NotificationsApi();

var opts = { 
  'domains': ["domains_example"] // [String] | List of domains for where notifications need to be reindexed, if not provided reindex will be done for all domains
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.reindexNotifications(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domains** | [**[String]**](String.md)| List of domains for where notifications need to be reindexed, if not provided reindex will be done for all domains | [optional] 

### Return type

**&#39;String&#39;**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

