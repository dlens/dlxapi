# DecisionLensApi.PortfoliosApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archivePortfolio**](PortfoliosApi.md#archivePortfolio) | **DELETE** /portfolios/{id} | Archive a portfolio.
[**createPortfolio**](PortfoliosApi.md#createPortfolio) | **POST** /portfolios | Creates a new portfolio.
[**downloadSpreadsheetTemplate**](PortfoliosApi.md#downloadSpreadsheetTemplate) | **GET** /portfolios/{portfolioId}/spreadsheet/template | Download spreadsheet template for portfolio
[**exportPortfolioData**](PortfoliosApi.md#exportPortfolioData) | **GET** /portfolios/{id}/pod | Export portfolio data in JSON format
[**getPortfolio**](PortfoliosApi.md#getPortfolio) | **GET** /portfolios/{id} | Retrieves a portfolio.
[**getPortfolioActivities**](PortfoliosApi.md#getPortfolioActivities) | **GET** /portfolios/{id}/activities | Retrieves portfolio activities log.
[**getPortfolioResourcePools**](PortfoliosApi.md#getPortfolioResourcePools) | **GET** /portfolios/{id}/resourcePools | (Deprecated. Use getResourcePoolsForPortfolioPlan) Retrieves resource pools in a portfolio.
[**getPortfolios**](PortfoliosApi.md#getPortfolios) | **GET** /portfolios | Get portfolios.
[**getProjectsForPortfolio**](PortfoliosApi.md#getProjectsForPortfolio) | **GET** /portfolios/{portfolioId}/projects | Retrieves projects for portfolio
[**getSpreadsheetReportForPortfolio**](PortfoliosApi.md#getSpreadsheetReportForPortfolio) | **GET** /portfolios/{portfolioId}/spreadsheet/{spreadsheetId}/report | Retrieves spreadsheet report for portfolio
[**importPortfolioData**](PortfoliosApi.md#importPortfolioData) | **POST** /portfolios/{id}/pod | Import portfolio data in JSON format
[**regenerateUserRegistrationToken**](PortfoliosApi.md#regenerateUserRegistrationToken) | **POST** /portfolios/{id}/regenerateUserRegistrationToken | Generates a new registration token
[**saveSpreadsheetForPortfolio**](PortfoliosApi.md#saveSpreadsheetForPortfolio) | **POST** /portfolios/{portfolioId}/spreadsheet/{spreadsheetId} | Saves spreadsheet for portfolio
[**saveSpreadsheetSourceForPortfolio**](PortfoliosApi.md#saveSpreadsheetSourceForPortfolio) | **POST** /portfolios/{id}/sources/spreadsheet | Save spreadsheet source for a portfolio
[**setCustomNames**](PortfoliosApi.md#setCustomNames) | **PUT** /portfolios/{portfolioId}/customNames | Updates custom names for portfolio
[**updatePortfolio**](PortfoliosApi.md#updatePortfolio) | **PATCH** /portfolios/{id} | Update a portfolio.
[**updatePortfolioFieldValues**](PortfoliosApi.md#updatePortfolioFieldValues) | **PATCH** /portfolios/{id}/fieldValues | Update field values in a portfolio
[**updatePortfolioResourcePoolBudgetAmounts**](PortfoliosApi.md#updatePortfolioResourcePoolBudgetAmounts) | **PATCH** /portfolios/{id}/resourcePoolBudgetAmounts | (Deprecated. Use updateResourcePoolBudgetAmountsForPortfolioPlan) Update resource pool budget amounts in a portfolio


<a name="archivePortfolio"></a>
# **archivePortfolio**
> Portfolio archivePortfolio(id)

Archive a portfolio.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var id = "id_example"; // String | Portfolio id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.archivePortfolio(id, callback);
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
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var body = new DecisionLensApi.Portfolio(); // Portfolio | Portfolio to create


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createPortfolio(body, callback);
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

<a name="downloadSpreadsheetTemplate"></a>
# **downloadSpreadsheetTemplate**
> &#39;Blob&#39; downloadSpreadsheetTemplate(portfolioId)

Download spreadsheet template for portfolio

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var portfolioId = "portfolioId_example"; // String | Portfolio id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.downloadSpreadsheetTemplate(portfolioId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id | 

### Return type

**&#39;Blob&#39;**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

<a name="exportPortfolioData"></a>
# **exportPortfolioData**
> &#39;Blob&#39; exportPortfolioData(id)

Export portfolio data in JSON format

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var id = "id_example"; // String | Portfolio id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.exportPortfolioData(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio id | 

### Return type

**&#39;Blob&#39;**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPortfolio"></a>
# **getPortfolio**
> Portfolio getPortfolio(id, opts)

Retrieves a portfolio.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var id = "id_example"; // String | Portfolio id

var opts = { 
  'expand': "expand_example" // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolio(id, opts, callback);
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
> Activities getPortfolioActivities(id, opts)

Retrieves portfolio activities log.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var id = "id_example"; // String | Portfolio id

var opts = { 
  'limit': 56, // Number | Pagination limit
  'offset': 56, // Number | Pagination offset
  'match': "match_example" // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioActivities(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio id | 
 **limit** | **Number**| Pagination limit | [optional] 
 **offset** | **Number**| Pagination offset | [optional] 
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
> ResourcePools getPortfolioResourcePools(id, opts)

(Deprecated. Use getResourcePoolsForPortfolioPlan) Retrieves resource pools in a portfolio.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var id = "id_example"; // String | Portfolio id

var opts = { 
  'expand': "expand_example" // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
  'limit': 56, // Number | Pagination limit
  'offset': 56, // Number | Pagination offset
  'orderBy': "orderBy_example", // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
  'match': "match_example" // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioResourcePools(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio id | 
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **Number**| Pagination limit | [optional] 
 **offset** | **Number**| Pagination offset | [optional] 
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
> Portfolios getPortfolios(opts)

Get portfolios.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var opts = { 
  'expand': "expand_example" // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
  'limit': 56, // Number | Pagination limit
  'offset': 56, // Number | Pagination offset
  'orderBy': "orderBy_example", // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
  'match': "match_example" // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolios(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **Number**| Pagination limit | [optional] 
 **offset** | **Number**| Pagination offset | [optional] 
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
> Projects getProjectsForPortfolio(portfolioId, opts)

Retrieves projects for portfolio

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var portfolioId = "portfolioId_example"; // String | Portfolio id

var opts = { 
  'limit': 56, // Number | Pagination limit
  'offset': 56, // Number | Pagination offset
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getProjectsForPortfolio(portfolioId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id | 
 **limit** | **Number**| Pagination limit | [optional] 
 **offset** | **Number**| Pagination offset | [optional] 

### Return type

[**Projects**](Projects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpreadsheetReportForPortfolio"></a>
# **getSpreadsheetReportForPortfolio**
> SpreadsheetReport getSpreadsheetReportForPortfolio(portfolioId, spreadsheetId, sheetName, opts)

Retrieves spreadsheet report for portfolio

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var portfolioId = "portfolioId_example"; // String | Portfolio id

var spreadsheetId = "spreadsheetId_example"; // String | Spreadsheet id

var sheetName = "sheetName_example"; // String | Spreadsheet name

var opts = { 
  'importType': null, // Object | Import type
  'expand': "expand_example" // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSpreadsheetReportForPortfolio(portfolioId, spreadsheetId, sheetName, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id | 
 **spreadsheetId** | **String**| Spreadsheet id | 
 **sheetName** | **String**| Spreadsheet name | 
 **importType** | [**Object**](.md)| Import type | [optional] 
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
> Portfolio importPortfolioData(id, opts)

Import portfolio data in JSON format

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var id = "id_example"; // String | Portfolio id

var opts = { 
  'podFile': "/path/to/file.txt", // File | The pod file to upload.
  'templateName': "templateName_example" // String | pod template name to load
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.importPortfolioData(id, opts, callback);
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

<a name="regenerateUserRegistrationToken"></a>
# **regenerateUserRegistrationToken**
> Portfolio regenerateUserRegistrationToken(id)

Generates a new registration token

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var id = "id_example"; // String | Portfolio id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.regenerateUserRegistrationToken(id, callback);
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

<a name="saveSpreadsheetForPortfolio"></a>
# **saveSpreadsheetForPortfolio**
> SpreadsheetReport saveSpreadsheetForPortfolio(portfolioId, spreadsheetId, sheetName, opts)

Saves spreadsheet for portfolio

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var portfolioId = "portfolioId_example"; // String | Portfolio id

var spreadsheetId = "spreadsheetId_example"; // String | Spreadsheet id

var sheetName = "sheetName_example"; // String | Spreadsheet name

var opts = { 
  'importType': null // Object | Import type
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.saveSpreadsheetForPortfolio(portfolioId, spreadsheetId, sheetName, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id | 
 **spreadsheetId** | **String**| Spreadsheet id | 
 **sheetName** | **String**| Spreadsheet name | 
 **importType** | [**Object**](.md)| Import type | [optional] 

### Return type

[**SpreadsheetReport**](SpreadsheetReport.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="saveSpreadsheetSourceForPortfolio"></a>
# **saveSpreadsheetSourceForPortfolio**
> Source saveSpreadsheetSourceForPortfolio(id, file, opts)

Save spreadsheet source for a portfolio

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var id = "id_example"; // String | Portfolio id

var file = "/path/to/file.txt"; // File | 

var opts = { 
  'saveZeroAsBlank': true // Boolean | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.saveSpreadsheetSourceForPortfolio(id, file, opts, callback);
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

<a name="setCustomNames"></a>
# **setCustomNames**
> [CustomName] setCustomNames(portfolioId, customNames)

Updates custom names for portfolio

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var portfolioId = "portfolioId_example"; // String | Portfolio id

var customNames = [new DecisionLensApi.CustomName()]; // [CustomName] | Custom names


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.setCustomNames(portfolioId, customNames, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id | 
 **customNames** | [**[CustomName]**](CustomName.md)| Custom names | 

### Return type

[**[CustomName]**](CustomName.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePortfolio"></a>
# **updatePortfolio**
> Portfolio updatePortfolio(id, body, opts)

Update a portfolio.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var id = "id_example"; // String | Portfolio id

var body = new DecisionLensApi.Operations(); // Operations | JSON Patch Operations to update a portfolio.

var opts = { 
  'expand': "expand_example" // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updatePortfolio(id, body, opts, callback);
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
> [FieldValue] updatePortfolioFieldValues(id, body, opts)

Update field values in a portfolio

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var id = null; // Object | Portfolio id

var body = [new DecisionLensApi.FieldValuePatchItem()]; // [FieldValuePatchItem] | JSON Patch Operations to update multiple field values.

var opts = { 
  'expand': "expand_example" // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updatePortfolioFieldValues(id, body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| Portfolio id | 
 **body** | [**[FieldValuePatchItem]**](FieldValuePatchItem.md)| JSON Patch Operations to update multiple field values. | 
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**[FieldValue]**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a name="updatePortfolioResourcePoolBudgetAmounts"></a>
# **updatePortfolioResourcePoolBudgetAmounts**
> [ResourcePool] updatePortfolioResourcePoolBudgetAmounts(id, body)

(Deprecated. Use updateResourcePoolBudgetAmountsForPortfolioPlan) Update resource pool budget amounts in a portfolio

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfoliosApi();

var id = null; // Object | Portfolio id

var body = [new DecisionLensApi.ResourcePoolBudgetAmountPatchItem()]; // [ResourcePoolBudgetAmountPatchItem] | JSON Patch Operations to update multiple resource pool budget amounts


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updatePortfolioResourcePoolBudgetAmounts(id, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| Portfolio id | 
 **body** | [**[ResourcePoolBudgetAmountPatchItem]**](ResourcePoolBudgetAmountPatchItem.md)| JSON Patch Operations to update multiple resource pool budget amounts | 

### Return type

[**[ResourcePool]**](ResourcePool.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

