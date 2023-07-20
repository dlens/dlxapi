# BudgetFieldsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBudgetField**](BudgetFieldsApi.md#createBudgetField) | **POST** /fields/budgets | Creates a new budget field
[**deleteBudgetField**](BudgetFieldsApi.md#deleteBudgetField) | **DELETE** /fields/budgets/{id} | Delete a budget field
[**getBudgetField**](BudgetFieldsApi.md#getBudgetField) | **GET** /fields/budgets/{id} | Retrieves a budget field
[**getBudgetFieldsForPortfolio**](BudgetFieldsApi.md#getBudgetFieldsForPortfolio) | **GET** /fields/budgets | Retrieves budget fields for a portfolio.
[**updateBudgetField**](BudgetFieldsApi.md#updateBudgetField) | **PATCH** /fields/budgets/{id} | Updates a budget field utilizing JSON Patch Operations.
[**updateBudgetFields**](BudgetFieldsApi.md#updateBudgetFields) | **PATCH** /fields/budgets | Update budget fields


<a name="createBudgetField"></a>
# **createBudgetField**
> List&lt;Field&gt; createBudgetField(body, expand)

Creates a new budget field

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.BudgetFieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

BudgetFieldsApi apiInstance = new BudgetFieldsApi();
Field body = new Field(); // Field | Budget field to create
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    List<Field> result = apiInstance.createBudgetField(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetFieldsApi#createBudgetField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Field**](Field.md)| Budget field to create |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]

### Return type

[**List&lt;Field&gt;**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBudgetField"></a>
# **deleteBudgetField**
> deleteBudgetField(id)

Delete a budget field

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.BudgetFieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

BudgetFieldsApi apiInstance = new BudgetFieldsApi();
String id = "id_example"; // String | Budget field id
try {
    apiInstance.deleteBudgetField(id);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetFieldsApi#deleteBudgetField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Budget field id |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBudgetField"></a>
# **getBudgetField**
> Field getBudgetField(id, expand)

Retrieves a budget field

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.BudgetFieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

BudgetFieldsApi apiInstance = new BudgetFieldsApi();
String id = "id_example"; // String | Budget field id
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    Field result = apiInstance.getBudgetField(id, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetFieldsApi#getBudgetField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Budget field id |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]

### Return type

[**Field**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBudgetFieldsForPortfolio"></a>
# **getBudgetFieldsForPortfolio**
> Fields getBudgetFieldsForPortfolio(portfolioId, expand, limit, offset, orderBy, match)

Retrieves budget fields for a portfolio.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.BudgetFieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

BudgetFieldsApi apiInstance = new BudgetFieldsApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
Integer limit = 56; // Integer | Pagination limit
Integer offset = 56; // Integer | Pagination offset
String orderBy = "orderBy_example"; // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
String match = "match_example"; // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
try {
    Fields result = apiInstance.getBudgetFieldsForPortfolio(portfolioId, expand, limit, offset, orderBy, match);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetFieldsApi#getBudgetFieldsForPortfolio");
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

<a name="updateBudgetField"></a>
# **updateBudgetField**
> List&lt;Field&gt; updateBudgetField(id, body, expand)

Updates a budget field utilizing JSON Patch Operations.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.BudgetFieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

BudgetFieldsApi apiInstance = new BudgetFieldsApi();
String id = "id_example"; // String | Budget field id
Operations body = new Operations(); // Operations | JSON Patch Operations to update budget field.
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    List<Field> result = apiInstance.updateBudgetField(id, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetFieldsApi#updateBudgetField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Budget field id |
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update budget field. |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]

### Return type

[**List&lt;Field&gt;**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a name="updateBudgetFields"></a>
# **updateBudgetFields**
> List&lt;Field&gt; updateBudgetFields(body, expand)

Update budget fields

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.BudgetFieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

BudgetFieldsApi apiInstance = new BudgetFieldsApi();
List<PatchItem> body = Arrays.asList(new PatchItem()); // List<PatchItem> | JSON Patch Operations to update multiple budgeet fields.
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    List<Field> result = apiInstance.updateBudgetFields(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetFieldsApi#updateBudgetFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;PatchItem&gt;**](PatchItem.md)| JSON Patch Operations to update multiple budgeet fields. |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]

### Return type

[**List&lt;Field&gt;**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

