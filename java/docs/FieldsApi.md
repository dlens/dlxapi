# FieldsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createField**](FieldsApi.md#createField) | **POST** /fields | Creates a new field in a portfolio.
[**deleteField**](FieldsApi.md#deleteField) | **DELETE** /fields/{id} | Delete a field. Also deletes the values for every project.
[**getField**](FieldsApi.md#getField) | **GET** /fields/{id} | Retrieves a field.
[**getFieldsForPortfolio**](FieldsApi.md#getFieldsForPortfolio) | **GET** /fields | Retrieves fields for a portfolio.
[**setIdeaFormFields**](FieldsApi.md#setIdeaFormFields) | **PUT** /fields/ideaForm | Set idea form fields for a portfolio.
[**updateField**](FieldsApi.md#updateField) | **PATCH** /fields/{id} | Updates a field utilizing JSON Patch Operations. If the update logic makes changes to other fields, all updated fields will be returned in the response. 
[**updateFields**](FieldsApi.md#updateFields) | **PATCH** /fields | Update fields associated with a portfolio.


<a name="createField"></a>
# **createField**
> List&lt;Field&gt; createField(body, expand)

Creates a new field in a portfolio.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.FieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FieldsApi apiInstance = new FieldsApi();
Field body = new Field(); // Field | Field to create
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    List<Field> result = apiInstance.createField(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FieldsApi#createField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Field**](Field.md)| Field to create |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]

### Return type

[**List&lt;Field&gt;**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteField"></a>
# **deleteField**
> deleteField(id)

Delete a field. Also deletes the values for every project.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.FieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FieldsApi apiInstance = new FieldsApi();
String id = "id_example"; // String | Field id
try {
    apiInstance.deleteField(id);
} catch (ApiException e) {
    System.err.println("Exception when calling FieldsApi#deleteField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Field id |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getField"></a>
# **getField**
> Field getField(id, expand)

Retrieves a field.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.FieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FieldsApi apiInstance = new FieldsApi();
String id = "id_example"; // String | Field id
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    Field result = apiInstance.getField(id, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FieldsApi#getField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Field id |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]

### Return type

[**Field**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFieldsForPortfolio"></a>
# **getFieldsForPortfolio**
> Fields getFieldsForPortfolio(portfolioId, expand, limit, offset, orderBy, match)

Retrieves fields for a portfolio.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.FieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FieldsApi apiInstance = new FieldsApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
Integer limit = 56; // Integer | Pagination limit
Integer offset = 56; // Integer | Pagination offset
String orderBy = "orderBy_example"; // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
String match = "match_example"; // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
try {
    Fields result = apiInstance.getFieldsForPortfolio(portfolioId, expand, limit, offset, orderBy, match);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FieldsApi#getFieldsForPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]
 **limit** | **Integer**| Pagination limit | [optional]
 **offset** | **Integer**| Pagination offset | [optional]
 **orderBy** | **String**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional]
 **match** | **String**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional]

### Return type

[**Fields**](Fields.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setIdeaFormFields"></a>
# **setIdeaFormFields**
> List&lt;Field&gt; setIdeaFormFields(body, expand)

Set idea form fields for a portfolio.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.FieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FieldsApi apiInstance = new FieldsApi();
IdeaFormFieldRequest body = new IdeaFormFieldRequest(); // IdeaFormFieldRequest | Idea form field request
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    List<Field> result = apiInstance.setIdeaFormFields(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FieldsApi#setIdeaFormFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdeaFormFieldRequest**](IdeaFormFieldRequest.md)| Idea form field request |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]

### Return type

[**List&lt;Field&gt;**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateField"></a>
# **updateField**
> List&lt;Field&gt; updateField(id, body, expand)

Updates a field utilizing JSON Patch Operations. If the update logic makes changes to other fields, all updated fields will be returned in the response. 

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.FieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FieldsApi apiInstance = new FieldsApi();
String id = "id_example"; // String | Field id
Operations body = new Operations(); // Operations | JSON Patch Operations to update field.
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    List<Field> result = apiInstance.updateField(id, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FieldsApi#updateField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Field id |
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update field. |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]

### Return type

[**List&lt;Field&gt;**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a name="updateFields"></a>
# **updateFields**
> List&lt;Field&gt; updateFields(body, expand)

Update fields associated with a portfolio.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.FieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FieldsApi apiInstance = new FieldsApi();
List<PatchItem> body = Arrays.asList(new PatchItem()); // List<PatchItem> | JSON Patch Operations to update multiple fields.
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    List<Field> result = apiInstance.updateFields(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FieldsApi#updateFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;PatchItem&gt;**](PatchItem.md)| JSON Patch Operations to update multiple fields. |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]

### Return type

[**List&lt;Field&gt;**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

