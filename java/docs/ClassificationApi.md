# ClassificationApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClassificationData**](ClassificationApi.md#getClassificationData) | **GET** /classification/{dataType} | Fetch classification training or testing data.


<a name="getClassificationData"></a>
# **getClassificationData**
> Classifications getClassificationData(dataType)

Fetch classification training or testing data.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.ClassificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ClassificationApi apiInstance = new ClassificationApi();
String dataType = "dataType_example"; // String | dataType can be either training or testing
try {
    Classifications result = apiInstance.getClassificationData(dataType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassificationApi#getClassificationData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataType** | **String**| dataType can be either training or testing |

### Return type

[**Classifications**](Classifications.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

