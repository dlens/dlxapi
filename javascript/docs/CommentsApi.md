# DecisionLensApi.CommentsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createComment**](CommentsApi.md#createComment) | **POST** /comments | Creates a new comment
[**deleteComment**](CommentsApi.md#deleteComment) | **DELETE** /comments/{id} | Delete a single comment
[**getComments**](CommentsApi.md#getComments) | **GET** /comments | Retrieves comments based on params
[**updateComment**](CommentsApi.md#updateComment) | **PATCH** /comments/{id} | Update a single comment


<a name="createComment"></a>
# **createComment**
> Comment createComment(body)

Creates a new comment

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.CommentsApi();

var body = new DecisionLensApi.Comment(); // Comment | Comment to create


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createComment(body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Comment**](Comment.md)| Comment to create | 

### Return type

[**Comment**](Comment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteComment"></a>
# **deleteComment**
> deleteComment(id)

Delete a single comment

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.CommentsApi();

var id = "id_example"; // String | Comment ID


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteComment(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Comment ID | 

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getComments"></a>
# **getComments**
> Comments getComments(opts)

Retrieves comments based on params

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.CommentsApi();

var opts = { 
  'portfolioId': "portfolioId_example", // String | Use when you want all comments from all projects inside this portfolio
  'projectId': "projectId_example", // String | Use when you want comments for a specific project
  'offset': 56, // Number | The page number from where the search will be done
  'limit': 56, // Number | Max number of comments which will be returned
  'orderBy': "orderBy_example", // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getComments(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Use when you want all comments from all projects inside this portfolio | [optional] 
 **projectId** | **String**| Use when you want comments for a specific project | [optional] 
 **offset** | **Number**| The page number from where the search will be done | [optional] 
 **limit** | **Number**| Max number of comments which will be returned | [optional] 
 **orderBy** | **String**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 

### Return type

[**Comments**](Comments.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateComment"></a>
# **updateComment**
> Comment updateComment(id, body)

Update a single comment

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.CommentsApi();

var id = "id_example"; // String | Comment ID

var body = new DecisionLensApi.Operations(); // Operations | JSON Patch operations to update value field.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateComment(id, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Comment ID | 
 **body** | [**Operations**](Operations.md)| JSON Patch operations to update value field. | 

### Return type

[**Comment**](Comment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

