# SpreadsheetApi

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
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.SpreadsheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

SpreadsheetApi apiInstance = new SpreadsheetApi();
File file = new File("/path/to/file.txt"); // File | xls or xlsx file upload
try {
    Spreadsheet result = apiInstance.createSpreadsheet(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpreadsheetApi#createSpreadsheet");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.SpreadsheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

SpreadsheetApi apiInstance = new SpreadsheetApi();
KloudlessFile kloudlessFile = new KloudlessFile(); // KloudlessFile | kloudless file
try {
    Spreadsheet result = apiInstance.createSpreadsheetForKloudlessFile(kloudlessFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpreadsheetApi#createSpreadsheetForKloudlessFile");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.SpreadsheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

SpreadsheetApi apiInstance = new SpreadsheetApi();
String id = "id_example"; // String | spreadsheet id
try {
    apiInstance.deleteSpreadsheet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling SpreadsheetApi#deleteSpreadsheet");
    e.printStackTrace();
}
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
> Mappings getMappingsForSpreadsheet(id, sheetName, importType, expand, columnsOnly)



Get mappings for spreadsheet

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.SpreadsheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

SpreadsheetApi apiInstance = new SpreadsheetApi();
String id = "id_example"; // String | spreadsheet id
String sheetName = "sheetName_example"; // String | 
Object importType = null; // Object | Whether import PROJECT or COST data. Defaults to PROJECT
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
Boolean columnsOnly = true; // Boolean | return columns only the case for cost import
try {
    Mappings result = apiInstance.getMappingsForSpreadsheet(id, sheetName, importType, expand, columnsOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpreadsheetApi#getMappingsForSpreadsheet");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.SpreadsheetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

SpreadsheetApi apiInstance = new SpreadsheetApi();
String id = "id_example"; // String | spreadsheet id
try {
    Spreadsheet result = apiInstance.getSpreadsheet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpreadsheetApi#getSpreadsheet");
    e.printStackTrace();
}
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

