# NotificationsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNotifications**](NotificationsApi.md#getNotifications) | **GET** /notifications | Retrieves portfolio notifications log.
[**reindexNotifications**](NotificationsApi.md#reindexNotifications) | **POST** /reindex/notifications | Reindex notifications. System Administator operation.


<a name="getNotifications"></a>
# **getNotifications**
> Activities getNotifications(portfolioId, limit, offset)

Retrieves portfolio notifications log.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

NotificationsApi apiInstance = new NotificationsApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id
Integer limit = 56; // Integer | Pagination limit
Integer offset = 56; // Integer | Pagination offset
try {
    Activities result = apiInstance.getNotifications(portfolioId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#getNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id |
 **limit** | **Integer**| Pagination limit | [optional]
 **offset** | **Integer**| Pagination offset | [optional]

### Return type

[**Activities**](Activities.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reindexNotifications"></a>
# **reindexNotifications**
> String reindexNotifications(domains)

Reindex notifications. System Administator operation.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.NotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

NotificationsApi apiInstance = new NotificationsApi();
List<String> domains = Arrays.asList("domains_example"); // List<String> | List of domains for where notifications need to be reindexed, if not provided reindex will be done for all domains
try {
    String result = apiInstance.reindexNotifications(domains);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#reindexNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domains** | [**List&lt;String&gt;**](String.md)| List of domains for where notifications need to be reindexed, if not provided reindex will be done for all domains | [optional]

### Return type

**String**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

