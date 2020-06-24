# ActivitiesApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reindexActivities**](ActivitiesApi.md#reindexActivities) | **POST** /reindex/activities | Reindex activities. System Administator operation.


<a name="reindexActivities"></a>
# **reindexActivities**
> String reindexActivities(domains)

Reindex activities. System Administator operation.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.ActivitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ActivitiesApi apiInstance = new ActivitiesApi();
List<String> domains = Arrays.asList("domains_example"); // List<String> | List of domains for where activities need to be reindexed, if not provided reindex will be done for all domains
try {
    String result = apiInstance.reindexActivities(domains);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitiesApi#reindexActivities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domains** | [**List&lt;String&gt;**](String.md)| List of domains for where activities need to be reindexed, if not provided reindex will be done for all domains | [optional]

### Return type

**String**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

