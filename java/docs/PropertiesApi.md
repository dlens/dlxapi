# PropertiesApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProperties**](PropertiesApi.md#getProperties) | **GET** /properties | Get configuration properties for user if userId and groupId are present, otherwise properties for authenticated user will be returned
[**setProperties**](PropertiesApi.md#setProperties) | **PUT** /properties | Set configuration properties


<a name="getProperties"></a>
# **getProperties**
> Properties getProperties(userId)

Get configuration properties for user if userId and groupId are present, otherwise properties for authenticated user will be returned

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PropertiesApi apiInstance = new PropertiesApi();
String userId = "userId_example"; // String | User id
try {
    Properties result = apiInstance.getProperties(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertiesApi#getProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User id | [optional]

### Return type

[**Properties**](Properties.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setProperties"></a>
# **setProperties**
> List&lt;Property&gt; setProperties(body)

Set configuration properties

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PropertiesApi apiInstance = new PropertiesApi();
List<Property> body = Arrays.asList(new Property()); // List<Property> | Properties that needed to be created/updated for the current user.
try {
    List<Property> result = apiInstance.setProperties(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertiesApi#setProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Property&gt;**](Property.md)| Properties that needed to be created/updated for the current user. |

### Return type

[**List&lt;Property&gt;**](Property.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

