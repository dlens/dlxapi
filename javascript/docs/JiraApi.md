# DecisionLensApi.JiraApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCommentFromJira**](JiraApi.md#createCommentFromJira) | **POST** /jira/instance/{id}/comment | 
[**createJiraFieldMapping**](JiraApi.md#createJiraFieldMapping) | **POST** /jira/instance/{id}/mapping | 
[**createJiraInstance**](JiraApi.md#createJiraInstance) | **POST** /jira/instance | 
[**deleteFieldMapping**](JiraApi.md#deleteFieldMapping) | **DELETE** /jira/instance/{id}/mapping/{mappingId} | Delete jira field mapping
[**deleteJiraInstance**](JiraApi.md#deleteJiraInstance) | **DELETE** /jira/instance/{id} | Delete jira instance
[**disableJiraInstance**](JiraApi.md#disableJiraInstance) | **POST** /jira/instance/{id}/disable | 
[**enableJiraInstance**](JiraApi.md#enableJiraInstance) | **POST** /jira/instance/{id}/enable | 
[**getFieldMapping**](JiraApi.md#getFieldMapping) | **GET** /jira/instance/{id}/mapping/{mappingId} | 
[**getFieldMappings**](JiraApi.md#getFieldMappings) | **GET** /jira/instance/{id}/mappings | 
[**getJiraInstance**](JiraApi.md#getJiraInstance) | **GET** /jira/instance/{id} | 
[**getMappedProjectForEpic**](JiraApi.md#getMappedProjectForEpic) | **GET** /jira/instance/{id}/mappedProject/{epicId} | 
[**startSyncForJiraInstance**](JiraApi.md#startSyncForJiraInstance) | **POST** /jira/instance/{id}/sync | 


<a name="createCommentFromJira"></a>
# **createCommentFromJira**
> createCommentFromJira(id, body)



Creates a comment in Decision Lens based on a Jira comment.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.JiraApi();

var id = "id_example"; // String | jira instance id

var body = new DecisionLensApi.JiraComment(); // JiraComment | Comment to create


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.createCommentFromJira(id, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira instance id | 
 **body** | [**JiraComment**](JiraComment.md)| Comment to create | 

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createJiraFieldMapping"></a>
# **createJiraFieldMapping**
> JiraFieldMapping createJiraFieldMapping(id, body)



Creates jira field mapping.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.JiraApi();

var id = "id_example"; // String | jira instance id

var body = new DecisionLensApi.JiraFieldMapping(); // JiraFieldMapping | Field mapping to create


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createJiraFieldMapping(id, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira instance id | 
 **body** | [**JiraFieldMapping**](JiraFieldMapping.md)| Field mapping to create | 

### Return type

[**JiraFieldMapping**](JiraFieldMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createJiraInstance"></a>
# **createJiraInstance**
> JiraInstance createJiraInstance(body)



Creates jira instance.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.JiraApi();

var body = new DecisionLensApi.JiraInstance(); // JiraInstance | Jira instance to create


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createJiraInstance(body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JiraInstance**](JiraInstance.md)| Jira instance to create | 

### Return type

[**JiraInstance**](JiraInstance.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFieldMapping"></a>
# **deleteFieldMapping**
> deleteFieldMapping(id)

Delete jira field mapping

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.JiraApi();

var id = "id_example"; // String | jira field mapping id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteFieldMapping(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira field mapping id | 

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteJiraInstance"></a>
# **deleteJiraInstance**
> deleteJiraInstance(id)

Delete jira instance

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.JiraApi();

var id = "id_example"; // String | jira instance id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteJiraInstance(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira instance id | 

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="disableJiraInstance"></a>
# **disableJiraInstance**
> disableJiraInstance(id)



Disable Jira Instance

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.JiraApi();

var id = "id_example"; // String | jira instance id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.disableJiraInstance(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira instance id | 

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enableJiraInstance"></a>
# **enableJiraInstance**
> enableJiraInstance(id)



Enable Jira Instance

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.JiraApi();

var id = "id_example"; // String | jira instance id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.enableJiraInstance(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira instance id | 

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFieldMapping"></a>
# **getFieldMapping**
> JiraFieldMapping getFieldMapping(id, mappingId)



Get Jira field mapping

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.JiraApi();

var id = "id_example"; // String | jira integration instance id

var mappingId = "mappingId_example"; // String | jira field mapping id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getFieldMapping(id, mappingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira integration instance id | 
 **mappingId** | **String**| jira field mapping id | 

### Return type

[**JiraFieldMapping**](JiraFieldMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFieldMappings"></a>
# **getFieldMappings**
> JiraFieldMappings getFieldMappings(id)



Get Jira field mappings for an instance

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.JiraApi();

var id = "id_example"; // String | jira instance id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getFieldMappings(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira instance id | 

### Return type

[**JiraFieldMappings**](JiraFieldMappings.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJiraInstance"></a>
# **getJiraInstance**
> JiraInstance getJiraInstance(id)



Get Jira Instance

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.JiraApi();

var id = "id_example"; // String | jira instance id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getJiraInstance(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira instance id | 

### Return type

[**JiraInstance**](JiraInstance.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMappedProjectForEpic"></a>
# **getMappedProjectForEpic**
> MappedProject getMappedProjectForEpic(id, epicId)



Return mapped Decision Lens project for a Jira epic

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.JiraApi();

var id = "id_example"; // String | Jira integration instance id

var epicId = "epicId_example"; // String | Epic key from Jira


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getMappedProjectForEpic(id, epicId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Jira integration instance id | 
 **epicId** | **String**| Epic key from Jira | 

### Return type

[**MappedProject**](MappedProject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startSyncForJiraInstance"></a>
# **startSyncForJiraInstance**
> startSyncForJiraInstance(id)



Run synchronization process for Jira Instance

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.JiraApi();

var id = "id_example"; // String | jira instance id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.startSyncForJiraInstance(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira instance id | 

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

