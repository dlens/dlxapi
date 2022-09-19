# DecisionLensApi.MappingsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spreadsheetToMappings**](MappingsApi.md#spreadsheetToMappings) | **POST** /mappings/spreadsheet | Accepts upload of spreadsheet and converts data into mappings.
[**updateMapping**](MappingsApi.md#updateMapping) | **PATCH** /mappings/{id} | Update mapping


<a name="spreadsheetToMappings"></a>
# **spreadsheetToMappings**
> Mappings spreadsheetToMappings(file, opts)

Accepts upload of spreadsheet and converts data into mappings.

Maps the fields in the spreadsheet to appropriate buckets

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.MappingsApi();

var file = "/path/to/file.txt"; // File | maybe put supported file types here?

var opts = { 
  'columnsOnly': true // Boolean | return columns only the case for cost import
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.spreadsheetToMappings(file, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| maybe put supported file types here? | 
 **columnsOnly** | **Boolean**| return columns only the case for cost import | [optional] [default to true]

### Return type

[**Mappings**](Mappings.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updateMapping"></a>
# **updateMapping**
> [Mapping] updateMapping(id, body, opts)

Update mapping

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.MappingsApi();

var id = "id_example"; // String | Mapping id

var body = new DecisionLensApi.Operations(); // Operations | JSON Patch Operations to update mapping.

var opts = { 
  'expand': "expand_example" // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateMapping(id, body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Mapping id | 
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update mapping. | 
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**[Mapping]**](Mapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

