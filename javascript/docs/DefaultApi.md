# DecisionLensApi.DefaultApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCategoryOption**](DefaultApi.md#createCategoryOption) | **POST** /fields/{fieldId}/categoryOption | Creates a new category
[**createCategoryOptions**](DefaultApi.md#createCategoryOptions) | **POST** /fields/{fieldId}/categoryOptions | Creates new category options
[**deleteCategoryOption**](DefaultApi.md#deleteCategoryOption) | **DELETE** /fields/{fieldId}/categoryOptions/{categoryOptionId} | Delete a single category option
[**getCategoryOption**](DefaultApi.md#getCategoryOption) | **GET** /fields/{fieldId}/categoryOptions/{categoryOptionId} | Retrieves a category
[**getCategoryOptionsForField**](DefaultApi.md#getCategoryOptionsForField) | **GET** /fields/{fieldId}/categoryOptions | Retrieves categories for a field
[**updateCategoryOption**](DefaultApi.md#updateCategoryOption) | **PATCH** /fields/{fieldId}/categoryOptions/{categoryOptionId} | Update a single category


<a name="createCategoryOption"></a>
# **createCategoryOption**
> CategoryOption createCategoryOption(body)

Creates a new category

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.DefaultApi();

var body = new DecisionLensApi.CategoryOption(); // CategoryOption | Category option to create


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCategoryOption(body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CategoryOption**](CategoryOption.md)| Category option to create | 

### Return type

[**CategoryOption**](CategoryOption.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCategoryOptions"></a>
# **createCategoryOptions**
> CategoryOptions createCategoryOptions(body)

Creates new category options

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.DefaultApi();

var body = new DecisionLensApi.CategoryOptions(); // CategoryOptions | Category options to create


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCategoryOptions(body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CategoryOptions**](CategoryOptions.md)| Category options to create | 

### Return type

[**CategoryOptions**](CategoryOptions.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCategoryOption"></a>
# **deleteCategoryOption**
> deleteCategoryOption(fieldId, categoryOptionId)

Delete a single category option

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.DefaultApi();

var fieldId = "fieldId_example"; // String | Field id

var categoryOptionId = "categoryOptionId_example"; // String | Category Option ID


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCategoryOption(fieldId, categoryOptionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **String**| Field id | 
 **categoryOptionId** | **String**| Category Option ID | 

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCategoryOption"></a>
# **getCategoryOption**
> CategoryOption getCategoryOption(fieldId, categoryOptionId)

Retrieves a category

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.DefaultApi();

var fieldId = "fieldId_example"; // String | Field id

var categoryOptionId = "categoryOptionId_example"; // String | Category Option id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCategoryOption(fieldId, categoryOptionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **String**| Field id | 
 **categoryOptionId** | **String**| Category Option id | 

### Return type

[**CategoryOption**](CategoryOption.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCategoryOptionsForField"></a>
# **getCategoryOptionsForField**
> CategoryOptions getCategoryOptionsForField(fieldId)

Retrieves categories for a field

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.DefaultApi();

var fieldId = "fieldId_example"; // String | Field id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCategoryOptionsForField(fieldId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **String**| Field id | 

### Return type

[**CategoryOptions**](CategoryOptions.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCategoryOption"></a>
# **updateCategoryOption**
> CategoryOption updateCategoryOption(fieldId, categoryOptionId, body)

Update a single category

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.DefaultApi();

var fieldId = "fieldId_example"; // String | Field id

var categoryOptionId = "categoryOptionId_example"; // String | Category Option id

var body = new DecisionLensApi.CategoryOption(); // CategoryOption | JSON Patch operations to update value field.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCategoryOption(fieldId, categoryOptionId, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **String**| Field id | 
 **categoryOptionId** | **String**| Category Option id | 
 **body** | [**CategoryOption**](CategoryOption.md)| JSON Patch operations to update value field. | 

### Return type

[**CategoryOption**](CategoryOption.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

