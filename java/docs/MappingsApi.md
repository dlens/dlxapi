# MappingsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spreadsheetToMappings**](MappingsApi.md#spreadsheetToMappings) | **POST** /mappings/spreadsheet | Accepts upload of spreadsheet and converts data into mappings.
[**updateMapping**](MappingsApi.md#updateMapping) | **PATCH** /mappings/{id} | Update mapping


<a name="spreadsheetToMappings"></a>
# **spreadsheetToMappings**
> Mappings spreadsheetToMappings(file)

Accepts upload of spreadsheet and converts data into mappings.

Maps the fields in the spreadsheet to appropriate buckets

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.MappingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

MappingsApi apiInstance = new MappingsApi();
File file = new File("/path/to/file.txt"); // File | maybe put supported file types here?
try {
    Mappings result = apiInstance.spreadsheetToMappings(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingsApi#spreadsheetToMappings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| maybe put supported file types here? |

### Return type

[**Mappings**](Mappings.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updateMapping"></a>
# **updateMapping**
> List&lt;Mapping&gt; updateMapping(id, body, expand)

Update mapping

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.MappingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

MappingsApi apiInstance = new MappingsApi();
String id = "id_example"; // String | Mapping id
Operations body = new Operations(); // Operations | JSON Patch Operations to update mapping.
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    List<Mapping> result = apiInstance.updateMapping(id, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingsApi#updateMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Mapping id |
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update mapping. |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]

### Return type

[**List&lt;Mapping&gt;**](Mapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

