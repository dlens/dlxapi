# PortfoliosApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archivePortfolio**](PortfoliosApi.md#archivePortfolio) | **DELETE** /portfolios/{id} | Archive a portfolio.
[**createPortfolio**](PortfoliosApi.md#createPortfolio) | **POST** /portfolios | Creates a new portfolio.
[**exportPortfolioData**](PortfoliosApi.md#exportPortfolioData) | **GET** /portfolios/{id}/pod | Export portfolio data in JSON format
[**getPortfolio**](PortfoliosApi.md#getPortfolio) | **GET** /portfolios/{id} | Retrieves a portfolio.
[**getPortfolioActivities**](PortfoliosApi.md#getPortfolioActivities) | **GET** /portfolios/{id}/activities | Retrieves portfolio activities log.
[**getPortfolioResourcePools**](PortfoliosApi.md#getPortfolioResourcePools) | **GET** /portfolios/{id}/resourcePools | Retrieves resource pools in a portfolio.
[**getPortfolios**](PortfoliosApi.md#getPortfolios) | **GET** /portfolios | Get portfolios.
[**getProjectsForPortfolio**](PortfoliosApi.md#getProjectsForPortfolio) | **GET** /portfolios/{portfolioId}/projects | Retrieves projects for portfolio
[**getSpreadsheetReportForPortfolio**](PortfoliosApi.md#getSpreadsheetReportForPortfolio) | **GET** /portfolios/{portfolioId}/spreadsheet/{spreadsheetId}/report | Retrieves spreadsheet report for portfolio
[**importPortfolioData**](PortfoliosApi.md#importPortfolioData) | **POST** /portfolios/{id}/pod | Import portfolio data in JSON format
[**saveSpreadsheetForPortfolio**](PortfoliosApi.md#saveSpreadsheetForPortfolio) | **POST** /portfolios/{portfolioId}/spreadsheet/{spreadsheetId} | Saves spreadsheet for portfolio
[**saveSpreadsheetSourceForPortfolio**](PortfoliosApi.md#saveSpreadsheetSourceForPortfolio) | **POST** /portfolios/{id}/sources/spreadsheet | Save spreadsheet source for a portfolio
[**updatePortfolio**](PortfoliosApi.md#updatePortfolio) | **PATCH** /portfolios/{id} | Update a portfolio.
[**updatePortfolioFieldValues**](PortfoliosApi.md#updatePortfolioFieldValues) | **PATCH** /portfolios/{id}/fieldValues | Update field values in a portfolio
[**updatePortfolioResourcePoolBudgetAmounts**](PortfoliosApi.md#updatePortfolioResourcePoolBudgetAmounts) | **PATCH** /portfolios/{id}/resourcePoolBudgetAmounts | Update resource pool budget amounts in a portfolio
[**updatePortfolioResourcePools**](PortfoliosApi.md#updatePortfolioResourcePools) | **PATCH** /portfolios/{id}/resourcePools | Update resource pools in a portfolio


<a name="archivePortfolio"></a>
# **archivePortfolio**
> Portfolio archivePortfolio(id)

Archive a portfolio.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String id = "id_example"; // String | Portfolio id
try {
    Portfolio result = apiInstance.archivePortfolio(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#archivePortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio id |

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPortfolio"></a>
# **createPortfolio**
> Portfolio createPortfolio(body)

Creates a new portfolio.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
Portfolio body = new Portfolio(); // Portfolio | Portfolio to create
try {
    Portfolio result = apiInstance.createPortfolio(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#createPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Portfolio**](Portfolio.md)| Portfolio to create |

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exportPortfolioData"></a>
# **exportPortfolioData**
> byte[] exportPortfolioData(id)

Export portfolio data in JSON format

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String id = "id_example"; // String | Portfolio id
try {
    byte[] result = apiInstance.exportPortfolioData(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#exportPortfolioData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio id |

### Return type

**byte[]**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPortfolio"></a>
# **getPortfolio**
> Portfolio getPortfolio(id, expand)

Retrieves a portfolio.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String id = "id_example"; // String | Portfolio id
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    Portfolio result = apiInstance.getPortfolio(id, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#getPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio id |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPortfolioActivities"></a>
# **getPortfolioActivities**
> Activities getPortfolioActivities(id, limit, offset, match)

Retrieves portfolio activities log.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String id = "id_example"; // String | Portfolio id
Integer limit = 56; // Integer | Pagination limit
Integer offset = 56; // Integer | Pagination offset
String match = "match_example"; // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
try {
    Activities result = apiInstance.getPortfolioActivities(id, limit, offset, match);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#getPortfolioActivities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio id |
 **limit** | **Integer**| Pagination limit | [optional]
 **offset** | **Integer**| Pagination offset | [optional]
 **match** | **String**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional]

### Return type

[**Activities**](Activities.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPortfolioResourcePools"></a>
# **getPortfolioResourcePools**
> ResourcePools getPortfolioResourcePools(id, expand, limit, offset, orderBy, match)

Retrieves resource pools in a portfolio.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String id = "id_example"; // String | Portfolio id
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
Integer limit = 56; // Integer | Pagination limit
Integer offset = 56; // Integer | Pagination offset
String orderBy = "orderBy_example"; // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
String match = "match_example"; // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
try {
    ResourcePools result = apiInstance.getPortfolioResourcePools(id, expand, limit, offset, orderBy, match);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#getPortfolioResourcePools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio id |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]
 **limit** | **Integer**| Pagination limit | [optional]
 **offset** | **Integer**| Pagination offset | [optional]
 **orderBy** | **String**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional]
 **match** | **String**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional]

### Return type

[**ResourcePools**](ResourcePools.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPortfolios"></a>
# **getPortfolios**
> Portfolios getPortfolios(expand, limit, offset, orderBy, match)

Get portfolios.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
Integer limit = 56; // Integer | Pagination limit
Integer offset = 56; // Integer | Pagination offset
String orderBy = "orderBy_example"; // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
String match = "match_example"; // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
try {
    Portfolios result = apiInstance.getPortfolios(expand, limit, offset, orderBy, match);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#getPortfolios");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]
 **limit** | **Integer**| Pagination limit | [optional]
 **offset** | **Integer**| Pagination offset | [optional]
 **orderBy** | **String**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional]
 **match** | **String**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional]

### Return type

[**Portfolios**](Portfolios.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjectsForPortfolio"></a>
# **getProjectsForPortfolio**
> Projects getProjectsForPortfolio(portfolioId, limit, offset)

Retrieves projects for portfolio

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id
Integer limit = 56; // Integer | Pagination limit
Integer offset = 56; // Integer | Pagination offset
try {
    Projects result = apiInstance.getProjectsForPortfolio(portfolioId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#getProjectsForPortfolio");
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

[**Projects**](Projects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpreadsheetReportForPortfolio"></a>
# **getSpreadsheetReportForPortfolio**
> SpreadsheetReport getSpreadsheetReportForPortfolio(portfolioId, spreadsheetId, sheetName, expand)

Retrieves spreadsheet report for portfolio

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id
String spreadsheetId = "spreadsheetId_example"; // String | Spreadsheet id
String sheetName = "sheetName_example"; // String | Spreadsheet name
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    SpreadsheetReport result = apiInstance.getSpreadsheetReportForPortfolio(portfolioId, spreadsheetId, sheetName, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#getSpreadsheetReportForPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id |
 **spreadsheetId** | **String**| Spreadsheet id |
 **sheetName** | **String**| Spreadsheet name |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]

### Return type

[**SpreadsheetReport**](SpreadsheetReport.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importPortfolioData"></a>
# **importPortfolioData**
> Portfolio importPortfolioData(id, podFile, templateName)

Import portfolio data in JSON format

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String id = "id_example"; // String | Portfolio id
File podFile = new File("/path/to/file.txt"); // File | The pod file to upload.
String templateName = "templateName_example"; // String | pod template name to load
try {
    Portfolio result = apiInstance.importPortfolioData(id, podFile, templateName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#importPortfolioData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio id |
 **podFile** | **File**| The pod file to upload. | [optional]
 **templateName** | **String**| pod template name to load | [optional]

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="saveSpreadsheetForPortfolio"></a>
# **saveSpreadsheetForPortfolio**
> SpreadsheetReport saveSpreadsheetForPortfolio(portfolioId, spreadsheetId, sheetName)

Saves spreadsheet for portfolio

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id
String spreadsheetId = "spreadsheetId_example"; // String | Spreadsheet id
String sheetName = "sheetName_example"; // String | Spreadsheet name
try {
    SpreadsheetReport result = apiInstance.saveSpreadsheetForPortfolio(portfolioId, spreadsheetId, sheetName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#saveSpreadsheetForPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id |
 **spreadsheetId** | **String**| Spreadsheet id |
 **sheetName** | **String**| Spreadsheet name |

### Return type

[**SpreadsheetReport**](SpreadsheetReport.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="saveSpreadsheetSourceForPortfolio"></a>
# **saveSpreadsheetSourceForPortfolio**
> Source saveSpreadsheetSourceForPortfolio(id, file, saveZeroAsBlank)

Save spreadsheet source for a portfolio

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String id = "id_example"; // String | Portfolio id
File file = new File("/path/to/file.txt"); // File | 
Boolean saveZeroAsBlank = true; // Boolean | 
try {
    Source result = apiInstance.saveSpreadsheetSourceForPortfolio(id, file, saveZeroAsBlank);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#saveSpreadsheetSourceForPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio id |
 **file** | **File**|  |
 **saveZeroAsBlank** | **Boolean**|  | [optional]

### Return type

[**Source**](Source.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updatePortfolio"></a>
# **updatePortfolio**
> Portfolio updatePortfolio(id, body, expand)

Update a portfolio.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String id = "id_example"; // String | Portfolio id
Operations body = new Operations(); // Operations | JSON Patch Operations to update a portfolio.
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    Portfolio result = apiInstance.updatePortfolio(id, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#updatePortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio id |
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update a portfolio. |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a name="updatePortfolioFieldValues"></a>
# **updatePortfolioFieldValues**
> List&lt;FieldValue&gt; updatePortfolioFieldValues(id, body, expand)

Update field values in a portfolio

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
Object id = null; // Object | Portfolio id
List<FieldValuePatchItem> body = Arrays.asList(new FieldValuePatchItem()); // List<FieldValuePatchItem> | JSON Patch Operations to update multiple field values.
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    List<FieldValue> result = apiInstance.updatePortfolioFieldValues(id, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#updatePortfolioFieldValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| Portfolio id |
 **body** | [**List&lt;FieldValuePatchItem&gt;**](FieldValuePatchItem.md)| JSON Patch Operations to update multiple field values. |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]

### Return type

[**List&lt;FieldValue&gt;**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a name="updatePortfolioResourcePoolBudgetAmounts"></a>
# **updatePortfolioResourcePoolBudgetAmounts**
> List&lt;ResourcePool&gt; updatePortfolioResourcePoolBudgetAmounts(id, body)

Update resource pool budget amounts in a portfolio

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
Object id = null; // Object | Portfolio id
List<ResourcePoolBudgetAmountPatchItem> body = Arrays.asList(new ResourcePoolBudgetAmountPatchItem()); // List<ResourcePoolBudgetAmountPatchItem> | JSON Patch Operations to update multiple resource pool budget amounts
try {
    List<ResourcePool> result = apiInstance.updatePortfolioResourcePoolBudgetAmounts(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#updatePortfolioResourcePoolBudgetAmounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| Portfolio id |
 **body** | [**List&lt;ResourcePoolBudgetAmountPatchItem&gt;**](ResourcePoolBudgetAmountPatchItem.md)| JSON Patch Operations to update multiple resource pool budget amounts |

### Return type

[**List&lt;ResourcePool&gt;**](ResourcePool.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a name="updatePortfolioResourcePools"></a>
# **updatePortfolioResourcePools**
> List&lt;ResourcePool&gt; updatePortfolioResourcePools(id, body)

Update resource pools in a portfolio

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
Object id = null; // Object | Portfolio id
List<PatchItem> body = Arrays.asList(new PatchItem()); // List<PatchItem> | JSON Patch Operations to update multiple resource pools.
try {
    List<ResourcePool> result = apiInstance.updatePortfolioResourcePools(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#updatePortfolioResourcePools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| Portfolio id |
 **body** | [**List&lt;PatchItem&gt;**](PatchItem.md)| JSON Patch Operations to update multiple resource pools. |

### Return type

[**List&lt;ResourcePool&gt;**](ResourcePool.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

