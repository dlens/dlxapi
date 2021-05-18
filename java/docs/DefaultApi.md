# DefaultApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCategoryOption**](DefaultApi.md#createCategoryOption) | **POST** /fields/{fieldId}/categoryOption | Creates a new category
[**createCategoryOptions**](DefaultApi.md#createCategoryOptions) | **POST** /fields/{fieldId}/categoryOptions | Creates new category options
[**deleteCategoryOption**](DefaultApi.md#deleteCategoryOption) | **DELETE** /fields/{fieldId}/categoryOptions/{categoryOptionId} | Delete a single category option
[**getCategoryOption**](DefaultApi.md#getCategoryOption) | **GET** /fields/{fieldId}/categoryOptions/{categoryOptionId} | Retrieves a category
[**getCategoryOptionsForField**](DefaultApi.md#getCategoryOptionsForField) | **GET** /fields/{fieldId}/categoryOptions | Retrieves categories for a field
[**updateCategoryOption**](DefaultApi.md#updateCategoryOption) | **PATCH** /fields/{fieldId}/categoryOptions/{categoryOptionId} | Update a single category


<a name="createCategoryOption"></a>
# **createCategoryOption**
> CategoryOption createCategoryOption(body)

Creates a new category

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
CategoryOption body = new CategoryOption(); // CategoryOption | Category option to create
try {
    CategoryOption result = apiInstance.createCategoryOption(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createCategoryOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CategoryOption**](CategoryOption.md)| Category option to create |

### Return type

[**CategoryOption**](CategoryOption.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCategoryOptions"></a>
# **createCategoryOptions**
> CategoryOptions createCategoryOptions(body)

Creates new category options

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
CategoryOptions body = new CategoryOptions(); // CategoryOptions | Category options to create
try {
    CategoryOptions result = apiInstance.createCategoryOptions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createCategoryOptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CategoryOptions**](CategoryOptions.md)| Category options to create |

### Return type

[**CategoryOptions**](CategoryOptions.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCategoryOption"></a>
# **deleteCategoryOption**
> deleteCategoryOption(fieldId, categoryOptionId)

Delete a single category option

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String fieldId = "fieldId_example"; // String | Field id
String categoryOptionId = "categoryOptionId_example"; // String | Category Option ID
try {
    apiInstance.deleteCategoryOption(fieldId, categoryOptionId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteCategoryOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **String**| Field id |
 **categoryOptionId** | **String**| Category Option ID |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCategoryOption"></a>
# **getCategoryOption**
> CategoryOption getCategoryOption(fieldId, categoryOptionId)

Retrieves a category

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String fieldId = "fieldId_example"; // String | Field id
String categoryOptionId = "categoryOptionId_example"; // String | Category Option id
try {
    CategoryOption result = apiInstance.getCategoryOption(fieldId, categoryOptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getCategoryOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **String**| Field id |
 **categoryOptionId** | **String**| Category Option id |

### Return type

[**CategoryOption**](CategoryOption.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCategoryOptionsForField"></a>
# **getCategoryOptionsForField**
> CategoryOptions getCategoryOptionsForField(fieldId)

Retrieves categories for a field

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String fieldId = "fieldId_example"; // String | Field id
try {
    CategoryOptions result = apiInstance.getCategoryOptionsForField(fieldId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getCategoryOptionsForField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **String**| Field id |

### Return type

[**CategoryOptions**](CategoryOptions.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCategoryOption"></a>
# **updateCategoryOption**
> CategoryOption updateCategoryOption(fieldId, categoryOptionId, body)

Update a single category

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String fieldId = "fieldId_example"; // String | Field id
String categoryOptionId = "categoryOptionId_example"; // String | Category Option id
CategoryOption body = new CategoryOption(); // CategoryOption | JSON Patch operations to update value field.
try {
    CategoryOption result = apiInstance.updateCategoryOption(fieldId, categoryOptionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateCategoryOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldId** | **String**| Field id |
 **categoryOptionId** | **String**| Category Option id |
 **body** | [**CategoryOption**](CategoryOption.md)| JSON Patch operations to update value field. |

### Return type

[**CategoryOption**](CategoryOption.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

