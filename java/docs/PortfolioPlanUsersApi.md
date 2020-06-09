# PortfolioPlanUsersApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePortfolioPlanUser**](PortfolioPlanUsersApi.md#deletePortfolioPlanUser) | **DELETE** /portfolioPlanUsers/{id} | Delete a portfolio plan user
[**updatePortfolioPlanUsers**](PortfolioPlanUsersApi.md#updatePortfolioPlanUsers) | **PATCH** /portfolioPlanUsers/{id} | Update portfolio plan users


<a name="deletePortfolioPlanUser"></a>
# **deletePortfolioPlanUser**
> deletePortfolioPlanUser(id)

Delete a portfolio plan user

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlanUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlanUsersApi apiInstance = new PortfolioPlanUsersApi();
String id = "id_example"; // String | Portfolio plan user id
try {
    apiInstance.deletePortfolioPlanUser(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlanUsersApi#deletePortfolioPlanUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan user id |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updatePortfolioPlanUsers"></a>
# **updatePortfolioPlanUsers**
> List&lt;PortfolioPlanUser&gt; updatePortfolioPlanUsers(body)

Update portfolio plan users

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlanUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlanUsersApi apiInstance = new PortfolioPlanUsersApi();
List<PatchItem> body = Arrays.asList(new PatchItem()); // List<PatchItem> | JSON Patch Operations to update multiple portfolio plan users.
try {
    List<PortfolioPlanUser> result = apiInstance.updatePortfolioPlanUsers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlanUsersApi#updatePortfolioPlanUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;PatchItem&gt;**](PatchItem.md)| JSON Patch Operations to update multiple portfolio plan users. |

### Return type

[**List&lt;PortfolioPlanUser&gt;**](PortfolioPlanUser.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

