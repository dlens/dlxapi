# AttachmentsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAttachment**](AttachmentsApi.md#createAttachment) | **POST** /attachments | Creates a new attachment from a file upload
[**downloadAttachment**](AttachmentsApi.md#downloadAttachment) | **GET** /attachments/{id}/download | Downloads the file content of an Attachment
[**getAttachment**](AttachmentsApi.md#getAttachment) | **GET** /attachments/{id} | Get Attachment by id
[**getAttachments**](AttachmentsApi.md#getAttachments) | **GET** /attachments | Get Attachment by portfolio id
[**updateAttachment**](AttachmentsApi.md#updateAttachment) | **PATCH** /attachments/{id} | Update a single attachment


<a name="createAttachment"></a>
# **createAttachment**
> Attachment createAttachment(file, portfolioId)

Creates a new attachment from a file upload

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

AttachmentsApi apiInstance = new AttachmentsApi();
File file = new File("/path/to/file.txt"); // File | File to be uploaded
String portfolioId = "portfolioId_example"; // String | the portfolio id that the attachment belongs to
try {
    Attachment result = apiInstance.createAttachment(file, portfolioId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#createAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File to be uploaded |
 **portfolioId** | **String**| the portfolio id that the attachment belongs to |

### Return type

[**Attachment**](Attachment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="downloadAttachment"></a>
# **downloadAttachment**
> byte[] downloadAttachment(id)

Downloads the file content of an Attachment

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

AttachmentsApi apiInstance = new AttachmentsApi();
String id = "id_example"; // String | Attachment id
try {
    byte[] result = apiInstance.downloadAttachment(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#downloadAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Attachment id |

### Return type

**byte[]**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getAttachment"></a>
# **getAttachment**
> Attachment getAttachment(id)

Get Attachment by id

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

AttachmentsApi apiInstance = new AttachmentsApi();
String id = "id_example"; // String | Attachment id
try {
    Attachment result = apiInstance.getAttachment(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#getAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Attachment id |

### Return type

[**Attachment**](Attachment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAttachments"></a>
# **getAttachments**
> Attachments getAttachments(portfolioId, offset, limit, orderBy, match)

Get Attachment by portfolio id

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

AttachmentsApi apiInstance = new AttachmentsApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id
Integer offset = 56; // Integer | Pagination offset
Integer limit = 56; // Integer | Pagination limit
String orderBy = "orderBy_example"; // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
String match = "match_example"; // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
try {
    Attachments result = apiInstance.getAttachments(portfolioId, offset, limit, orderBy, match);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#getAttachments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id |
 **offset** | **Integer**| Pagination offset | [optional]
 **limit** | **Integer**| Pagination limit | [optional]
 **orderBy** | **String**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional]
 **match** | **String**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional]

### Return type

[**Attachments**](Attachments.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAttachment"></a>
# **updateAttachment**
> Attachment updateAttachment(id, body)

Update a single attachment

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

AttachmentsApi apiInstance = new AttachmentsApi();
String id = "id_example"; // String | Attachment ID
Operations body = new Operations(); // Operations | JSON Patch operations to update value field.
try {
    Attachment result = apiInstance.updateAttachment(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#updateAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Attachment ID |
 **body** | [**Operations**](Operations.md)| JSON Patch operations to update value field. |

### Return type

[**Attachment**](Attachment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

