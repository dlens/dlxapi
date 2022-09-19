# DecisionLensApi.BudgetFieldsApi

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
> [Field] createBudgetField(body, opts)

Creates a new budget field

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.BudgetFieldsApi();

var body = new DecisionLensApi.Field(); // Field | Budget field to create

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
apiInstance.createBudgetField(body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Field**](Field.md)| Budget field to create | 
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**[Field]**](Field.md)

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
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.BudgetFieldsApi();

var id = "id_example"; // String | Budget field id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteBudgetField(id, callback);
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
> Field getBudgetField(id, opts)

Retrieves a budget field

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.BudgetFieldsApi();

var id = "id_example"; // String | Budget field id

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
apiInstance.getBudgetField(id, opts, callback);
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
> Fields getBudgetFieldsForPortfolio(portfolioId, opts)

Retrieves budget fields for a portfolio.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.BudgetFieldsApi();

var portfolioId = "portfolioId_example"; // String | Portfolio id

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
apiInstance.getBudgetFieldsForPortfolio(portfolioId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id | 
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **Number**| Pagination limit | [optional] 
 **offset** | **Number**| Pagination offset | [optional] 
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
> [Field] updateBudgetField(id, body, opts)

Updates a budget field utilizing JSON Patch Operations.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.BudgetFieldsApi();

var id = "id_example"; // String | Budget field id

var body = new DecisionLensApi.Operations(); // Operations | JSON Patch Operations to update budget field.

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
apiInstance.updateBudgetField(id, body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Budget field id | 
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update budget field. | 
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**[Field]**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a name="updateBudgetFields"></a>
# **updateBudgetFields**
> [Field] updateBudgetFields(body, opts)

Update budget fields

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.BudgetFieldsApi();

var body = [new DecisionLensApi.PatchItem()]; // [PatchItem] | JSON Patch Operations to update multiple budgeet fields.

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
apiInstance.updateBudgetFields(body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**[PatchItem]**](PatchItem.md)| JSON Patch Operations to update multiple budgeet fields. | 
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**[Field]**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

