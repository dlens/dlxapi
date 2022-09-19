# DecisionLensApi.SpreadsheetApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpreadsheet**](SpreadsheetApi.md#createSpreadsheet) | **POST** /spreadsheet | 
[**createSpreadsheetForKloudlessFile**](SpreadsheetApi.md#createSpreadsheetForKloudlessFile) | **POST** /spreadsheet/kloudless | 
[**deleteSpreadsheet**](SpreadsheetApi.md#deleteSpreadsheet) | **DELETE** /spreadsheet/{id} | Delete spreadsheet and mappings
[**getMappingsForSpreadsheet**](SpreadsheetApi.md#getMappingsForSpreadsheet) | **GET** /spreadsheet/{id}/mappings | 
[**getSpreadsheet**](SpreadsheetApi.md#getSpreadsheet) | **GET** /spreadsheet/{id} | 


<a name="createSpreadsheet"></a>
# **createSpreadsheet**
> Spreadsheet createSpreadsheet(file)



Creates spreadsheet from file upload.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.SpreadsheetApi();

var file = "/path/to/file.txt"; // File | xls or xlsx file upload


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createSpreadsheet(file, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| xls or xlsx file upload | 

### Return type

[**Spreadsheet**](Spreadsheet.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createSpreadsheetForKloudlessFile"></a>
# **createSpreadsheetForKloudlessFile**
> Spreadsheet createSpreadsheetForKloudlessFile(kloudlessFile)



Creates spreadsheet from kloudless file

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.SpreadsheetApi();

var kloudlessFile = new DecisionLensApi.KloudlessFile(); // KloudlessFile | kloudless file


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createSpreadsheetForKloudlessFile(kloudlessFile, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kloudlessFile** | [**KloudlessFile**](KloudlessFile.md)| kloudless file | 

### Return type

[**Spreadsheet**](Spreadsheet.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSpreadsheet"></a>
# **deleteSpreadsheet**
> deleteSpreadsheet(id)

Delete spreadsheet and mappings

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.SpreadsheetApi();

var id = "id_example"; // String | spreadsheet id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteSpreadsheet(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| spreadsheet id | 

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMappingsForSpreadsheet"></a>
# **getMappingsForSpreadsheet**
> Mappings getMappingsForSpreadsheet(id, opts)



Get mappings for spreadsheet

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.SpreadsheetApi();

var id = "id_example"; // String | spreadsheet id

var opts = { 
  'sheetName': "sheetName_example", // String | 
  'importType': null, // Object | Whether import PROJECT or COST data. Defaults to PROJECT
  'expand': "expand_example" // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
  'columnsOnly': true // Boolean | return columns only the case for cost import
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getMappingsForSpreadsheet(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| spreadsheet id | 
 **sheetName** | **String**|  | [optional] 
 **importType** | [**Object**](.md)| Whether import PROJECT or COST data. Defaults to PROJECT | [optional] 
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **columnsOnly** | **Boolean**| return columns only the case for cost import | [optional] [default to true]

### Return type

[**Mappings**](Mappings.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpreadsheet"></a>
# **getSpreadsheet**
> Spreadsheet getSpreadsheet(id)



Get spreadsheet

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.SpreadsheetApi();

var id = "id_example"; // String | spreadsheet id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSpreadsheet(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| spreadsheet id | 

### Return type

[**Spreadsheet**](Spreadsheet.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

