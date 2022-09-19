# DecisionLensApi.AttachmentsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAttachment**](AttachmentsApi.md#createAttachment) | **POST** /attachments | Creates a new attachment from a file upload
[**downloadAttachment**](AttachmentsApi.md#downloadAttachment) | **GET** /attachments/{id}/download | Downloads the file content of an Attachment
[**getAttachment**](AttachmentsApi.md#getAttachment) | **GET** /attachments/{id} | Get Attachment by id
[**getAttachments**](AttachmentsApi.md#getAttachments) | **GET** /attachments | Get Attachment by portfolio id
[**updateAttachment**](AttachmentsApi.md#updateAttachment) | **PATCH** /attachments/{id} | Update a single attachment


<a name="createAttachment"></a>
# **createAttachment**
> Attachment createAttachment(file, portfolioId)

Creates a new attachment from a file upload

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.AttachmentsApi();

var file = "/path/to/file.txt"; // File | File to be uploaded

var portfolioId = "portfolioId_example"; // String | the portfolio id that the attachment belongs to


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAttachment(file, portfolioId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File to be uploaded | 
 **portfolioId** | **String**| the portfolio id that the attachment belongs to | 

### Return type

[**Attachment**](Attachment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="downloadAttachment"></a>
# **downloadAttachment**
> &#39;Blob&#39; downloadAttachment(id)

Downloads the file content of an Attachment

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.AttachmentsApi();

var id = "id_example"; // String | Attachment id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.downloadAttachment(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Attachment id | 

### Return type

**&#39;Blob&#39;**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getAttachment"></a>
# **getAttachment**
> Attachment getAttachment(id)

Get Attachment by id

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.AttachmentsApi();

var id = "id_example"; // String | Attachment id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAttachment(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Attachment id | 

### Return type

[**Attachment**](Attachment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAttachments"></a>
# **getAttachments**
> Attachments getAttachments(portfolioId, opts)

Get Attachment by portfolio id

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.AttachmentsApi();

var portfolioId = "portfolioId_example"; // String | Portfolio id

var opts = { 
  'offset': 56, // Number | Pagination offset
  'limit': 56, // Number | Pagination limit
  'orderBy': "orderBy_example", // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
  'match': "match_example" // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAttachments(portfolioId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id | 
 **offset** | **Number**| Pagination offset | [optional] 
 **limit** | **Number**| Pagination limit | [optional] 
 **orderBy** | **String**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 
 **match** | **String**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**Attachments**](Attachments.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAttachment"></a>
# **updateAttachment**
> Attachment updateAttachment(id, body)

Update a single attachment

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.AttachmentsApi();

var id = "id_example"; // String | Attachment ID

var body = new DecisionLensApi.Operations(); // Operations | JSON Patch operations to update value field.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAttachment(id, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Attachment ID | 
 **body** | [**Operations**](Operations.md)| JSON Patch operations to update value field. | 

### Return type

[**Attachment**](Attachment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

