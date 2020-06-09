# PodsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**importPodTemplate**](PodsApi.md#importPodTemplate) | **PUT** /pods/template | Import pod template in JSON format


<a name="importPodTemplate"></a>
# **importPodTemplate**
> importPodTemplate(podFile, templateName)

Import pod template in JSON format

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PodsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PodsApi apiInstance = new PodsApi();
File podFile = new File("/path/to/file.txt"); // File | The pod file to upload.
String templateName = "templateName_example"; // String | pod template name
try {
    apiInstance.importPodTemplate(podFile, templateName);
} catch (ApiException e) {
    System.err.println("Exception when calling PodsApi#importPodTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **podFile** | **File**| The pod file to upload. |
 **templateName** | **String**| pod template name |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

