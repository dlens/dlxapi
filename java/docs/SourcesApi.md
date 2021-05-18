# SourcesApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchDataForSource**](SourcesApi.md#fetchDataForSource) | **GET** /sources/{id}/fetchData | Fetch data for source.
[**sendDataForSource**](SourcesApi.md#sendDataForSource) | **POST** /sources/{id}/sendData | Send data for source.


<a name="fetchDataForSource"></a>
# **fetchDataForSource**
> Source fetchDataForSource(id, priorityScenario)

Fetch data for source.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.SourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

SourcesApi apiInstance = new SourcesApi();
String id = "id_example"; // String | Source id
String priorityScenario = "priorityScenario_example"; // String | Priority Scenario name
try {
    Source result = apiInstance.fetchDataForSource(id, priorityScenario);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourcesApi#fetchDataForSource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Source id |
 **priorityScenario** | **String**| Priority Scenario name | [optional]

### Return type

[**Source**](Source.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendDataForSource"></a>
# **sendDataForSource**
> Source sendDataForSource(id, statuses)

Send data for source.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.SourcesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

SourcesApi apiInstance = new SourcesApi();
String id = "id_example"; // String | Source id
List<String> statuses = Arrays.asList(new List<String>()); // List<String> | Statuses
try {
    Source result = apiInstance.sendDataForSource(id, statuses);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SourcesApi#sendDataForSource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Source id |
 **statuses** | **List&lt;String&gt;**| Statuses |

### Return type

[**Source**](Source.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

