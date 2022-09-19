# DecisionLensApi.PortfolioPlansApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPortfolioPlanUsers**](PortfolioPlansApi.md#addPortfolioPlanUsers) | **POST** /portfolioPlans/{id}/users | Add users to a portfolio plan.
[**applyRecommendationsForPortfolioPlan**](PortfolioPlansApi.md#applyRecommendationsForPortfolioPlan) | **POST** /portfolioPlans/{id}/recommendations | Apply recommendations of a portfolio plan.
[**createPortfolioPlan**](PortfolioPlansApi.md#createPortfolioPlan) | **POST** /portfolioPlans | Create a portfolio plan
[**createProjectsInPortfolioPlan**](PortfolioPlansApi.md#createProjectsInPortfolioPlan) | **POST** /portfolioPlans/{id}/projects | Create new projects
[**deletePortfolioPlan**](PortfolioPlansApi.md#deletePortfolioPlan) | **DELETE** /portfolioPlans/{id} | Deletes portfolio plan
[**exportPortfolioPlan**](PortfolioPlansApi.md#exportPortfolioPlan) | **POST** /portfolioPlans/{id}/export | Export portfolio plan
[**getBudgetAllocationsForPortfolioPlan**](PortfolioPlansApi.md#getBudgetAllocationsForPortfolioPlan) | **GET** /portfolioPlans/{id}/budgetAllocations | Retrieves budget allocations for a portfolio plan.
[**getMinifiedProjectsForPortfolioPlan**](PortfolioPlansApi.md#getMinifiedProjectsForPortfolioPlan) | **GET** /portfolioPlans/{id}/projects/minify | Retrieves minified projects contained within a portfolio plan.
[**getPortfolioPlan**](PortfolioPlansApi.md#getPortfolioPlan) | **GET** /portfolioPlans/{id} | Retrieves portfolio plan
[**getPortfolioPlanActivities**](PortfolioPlansApi.md#getPortfolioPlanActivities) | **GET** /portfolioPlans/{id}/activities | Retrieves portfolio plan activities log.
[**getPortfolioPlanUsers**](PortfolioPlansApi.md#getPortfolioPlanUsers) | **GET** /portfolioPlans/{id}/users | Retrieves users in a portfolio plan.
[**getPortfolioPlans**](PortfolioPlansApi.md#getPortfolioPlans) | **GET** /portfolioPlans | Retrieves portfolio plans
[**getProjectForPortfolioPlan**](PortfolioPlansApi.md#getProjectForPortfolioPlan) | **GET** /portfolioPlans/{portfolioPlanId}/projects/{projectId} | Retrieves project contained within a portfolio plan.
[**getProjectPortfolioPlansForPortfolioPlanAndPortfolio**](PortfolioPlansApi.md#getProjectPortfolioPlansForPortfolioPlanAndPortfolio) | **POST** /portfolioPlans/{portfolioPlanId}/portfolios/{portfolioId}/projectPortfolioPlans | Retrieves projects for portfolio plan
[**getProjectsForPortfolioPlan**](PortfolioPlansApi.md#getProjectsForPortfolioPlan) | **GET** /portfolioPlans/{id}/projects | Retrieves projects contained within a portfolio plan. Possible expand paths - (items.fieldValues, contributingUserIds)
[**getRecommendationsForPortfolioPlan**](PortfolioPlansApi.md#getRecommendationsForPortfolioPlan) | **GET** /portfolioPlans/{id}/recommendations | Retrieves recommendations for a portfolio plan.
[**getScheduleForPortfolioPlan**](PortfolioPlansApi.md#getScheduleForPortfolioPlan) | **GET** /portfolioPlans/{id}/schedule | Retrieves schedule for portfolio plan. The schedule is stored in a new portfolio plan.
[**rebaselinePortfolioPlan**](PortfolioPlansApi.md#rebaselinePortfolioPlan) | **POST** /portfolioPlans/{id}/rebaseline | Rebaseline a portfolio plan.
[**updatePortfolioPlan**](PortfolioPlansApi.md#updatePortfolioPlan) | **PATCH** /portfolioPlans/{id} | Updates a portfolio plan utilizing JSON Patch Operations. 
[**updatePortfolioPlanBudgetFieldValues**](PortfolioPlansApi.md#updatePortfolioPlanBudgetFieldValues) | **PATCH** /portfolioPlans/{id}/fieldValues/budgets | Update field values in a portfolio plan
[**updatePortfolioPlanFieldValues**](PortfolioPlansApi.md#updatePortfolioPlanFieldValues) | **PATCH** /portfolioPlans/{id}/fieldValues | Update field values in a portfolio plan
[**updatePortfolioPlanFieldValuesWithZero**](PortfolioPlansApi.md#updatePortfolioPlanFieldValuesWithZero) | **PATCH** /portfolioPlans/{id}/fieldValues/zero | update portfolio plan numeric field values with 0
[**updatePortfolioPlanUsers**](PortfolioPlansApi.md#updatePortfolioPlanUsers) | **PATCH** /portfolioPlans/{id}/users | Update users in a portfolio plan


<a name="addPortfolioPlanUsers"></a>
# **addPortfolioPlanUsers**
> [PortfolioPlanUser] addPortfolioPlanUsers(id, opts)

Add users to a portfolio plan.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = "id_example"; // String | Portfolio plan id

var opts = { 
  'body': new DecisionLensApi.AddUsersRequest() // AddUsersRequest | Email ids and personal message
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.addPortfolioPlanUsers(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id | 
 **body** | [**AddUsersRequest**](AddUsersRequest.md)| Email ids and personal message | [optional] 

### Return type

[**[PortfolioPlanUser]**](PortfolioPlanUser.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="applyRecommendationsForPortfolioPlan"></a>
# **applyRecommendationsForPortfolioPlan**
> [FieldValue] applyRecommendationsForPortfolioPlan(id, body)

Apply recommendations of a portfolio plan.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = "id_example"; // String | Portfolio plan id

var body = [new DecisionLensApi.Recommendation()]; // [Recommendation] | JSON Recommendation Objects to apply to a portfolio plan.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.applyRecommendationsForPortfolioPlan(id, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id | 
 **body** | [**[Recommendation]**](Recommendation.md)| JSON Recommendation Objects to apply to a portfolio plan. | 

### Return type

[**[FieldValue]**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPortfolioPlan"></a>
# **createPortfolioPlan**
> PortfolioPlan createPortfolioPlan(body, opts)

Create a portfolio plan

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var body = new DecisionLensApi.PortfolioPlan(); // PortfolioPlan | portfolio plan

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
apiInstance.createPortfolioPlan(body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PortfolioPlan**](PortfolioPlan.md)| portfolio plan | 
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**PortfolioPlan**](PortfolioPlan.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProjectsInPortfolioPlan"></a>
# **createProjectsInPortfolioPlan**
> [Project] createProjectsInPortfolioPlan(id, body, opts)

Create new projects

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = "id_example"; // String | Portfolio plan id

var body = [new DecisionLensApi.Project()]; // [Project] | Projects to create

var opts = { 
  'doNotExpand': false // Boolean | Whether to return collections for each project in the response. Default is to return saved field values.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createProjectsInPortfolioPlan(id, body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id | 
 **body** | [**[Project]**](Project.md)| Projects to create | 
 **doNotExpand** | **Boolean**| Whether to return collections for each project in the response. Default is to return saved field values. | [optional] [default to false]

### Return type

[**[Project]**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePortfolioPlan"></a>
# **deletePortfolioPlan**
> deletePortfolioPlan(id)

Deletes portfolio plan

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = "id_example"; // String | portfolio plan id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deletePortfolioPlan(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| portfolio plan id | 

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="exportPortfolioPlan"></a>
# **exportPortfolioPlan**
> &#39;Blob&#39; exportPortfolioPlan(id, exportType, exportFormat, opts)

Export portfolio plan

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = "id_example"; // String | portfolio plan id

var exportType = null; // Object | export type (PROJECT, SCHEDULE, SPEND_PLAN)

var exportFormat = null; // Object | export format type (XLSX)

var opts = { 
  'exportConfig': new DecisionLensApi.ExportConfig() // ExportConfig | export configuration object
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.exportPortfolioPlan(id, exportType, exportFormat, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| portfolio plan id | 
 **exportType** | [**Object**](.md)| export type (PROJECT, SCHEDULE, SPEND_PLAN) | 
 **exportFormat** | [**Object**](.md)| export format type (XLSX) | 
 **exportConfig** | [**ExportConfig**](ExportConfig.md)| export configuration object | [optional] 

### Return type

**&#39;Blob&#39;**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

<a name="getBudgetAllocationsForPortfolioPlan"></a>
# **getBudgetAllocationsForPortfolioPlan**
> BudgetAllocations getBudgetAllocationsForPortfolioPlan(id, opts)

Retrieves budget allocations for a portfolio plan.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = "id_example"; // String | Portfolio plan id

var opts = { 
  'startTime': 789, // Number | Start time for the requested data
  'endTime': 789 // Number | End time for the requested data
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBudgetAllocationsForPortfolioPlan(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id | 
 **startTime** | **Number**| Start time for the requested data | [optional] 
 **endTime** | **Number**| End time for the requested data | [optional] 

### Return type

[**BudgetAllocations**](BudgetAllocations.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMinifiedProjectsForPortfolioPlan"></a>
# **getMinifiedProjectsForPortfolioPlan**
> MinifiedProjects getMinifiedProjectsForPortfolioPlan(id, opts)

Retrieves minified projects contained within a portfolio plan.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = "id_example"; // String | Portfolio plan id

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
apiInstance.getMinifiedProjectsForPortfolioPlan(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id | 
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **Number**| Pagination limit | [optional] 
 **offset** | **Number**| Pagination offset | [optional] 
 **orderBy** | **String**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 
 **match** | **String**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**MinifiedProjects**](MinifiedProjects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPortfolioPlan"></a>
# **getPortfolioPlan**
> PortfolioPlan getPortfolioPlan(id, opts)

Retrieves portfolio plan

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = "id_example"; // String | portfolio plan id

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
apiInstance.getPortfolioPlan(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| portfolio plan id | 
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**PortfolioPlan**](PortfolioPlan.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPortfolioPlanActivities"></a>
# **getPortfolioPlanActivities**
> Activities getPortfolioPlanActivities(id, opts)

Retrieves portfolio plan activities log.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = "id_example"; // String | Portfolio plan id

var opts = { 
  'projectId': "projectId_example", // String | Use when you want to filter activities for a specific project
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
apiInstance.getPortfolioPlanActivities(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id | 
 **projectId** | **String**| Use when you want to filter activities for a specific project | [optional] 
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

<a name="getPortfolioPlanUsers"></a>
# **getPortfolioPlanUsers**
> PortfolioPlanUsers getPortfolioPlanUsers(id, opts)

Retrieves users in a portfolio plan.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = "id_example"; // String | Portfolio plan id

var opts = { 
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
apiInstance.getPortfolioPlanUsers(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id | 
 **limit** | **Number**| Pagination limit | [optional] 
 **offset** | **Number**| Pagination offset | [optional] 
 **orderBy** | **String**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 
 **match** | **String**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**PortfolioPlanUsers**](PortfolioPlanUsers.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPortfolioPlans"></a>
# **getPortfolioPlans**
> PortfolioPlans getPortfolioPlans(portfolioId, opts)

Retrieves portfolio plans

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var portfolioId = "portfolioId_example"; // String | portfolio id

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
apiInstance.getPortfolioPlans(portfolioId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| portfolio id | 
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **Number**| Pagination limit | [optional] 
 **offset** | **Number**| Pagination offset | [optional] 
 **orderBy** | **String**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 
 **match** | **String**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**PortfolioPlans**](PortfolioPlans.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjectForPortfolioPlan"></a>
# **getProjectForPortfolioPlan**
> Project getProjectForPortfolioPlan(portfolioPlanId, projectId)

Retrieves project contained within a portfolio plan.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var portfolioPlanId = "portfolioPlanId_example"; // String | Portfolio plan id

var projectId = "projectId_example"; // String | project id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getProjectForPortfolioPlan(portfolioPlanId, projectId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioPlanId** | **String**| Portfolio plan id | 
 **projectId** | **String**| project id | 

### Return type

[**Project**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjectPortfolioPlansForPortfolioPlanAndPortfolio"></a>
# **getProjectPortfolioPlansForPortfolioPlanAndPortfolio**
> Projects getProjectPortfolioPlansForPortfolioPlanAndPortfolio(portfolioId, portfolioPlanId, positionFrom, positionTo)

Retrieves projects for portfolio plan

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var portfolioId = "portfolioId_example"; // String | Portfolio id

var portfolioPlanId = "portfolioPlanId_example"; // String | Portfolio Plan id

var positionFrom = 56; // Number | positionFrom for projects

var positionTo = 56; // Number | positionTo for projects


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getProjectPortfolioPlansForPortfolioPlanAndPortfolio(portfolioId, portfolioPlanId, positionFrom, positionTo, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id | 
 **portfolioPlanId** | **String**| Portfolio Plan id | 
 **positionFrom** | **Number**| positionFrom for projects | 
 **positionTo** | **Number**| positionTo for projects | 

### Return type

[**Projects**](Projects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjectsForPortfolioPlan"></a>
# **getProjectsForPortfolioPlan**
> Projects getProjectsForPortfolioPlan(id, opts)

Retrieves projects contained within a portfolio plan. Possible expand paths - (items.fieldValues, contributingUserIds)

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = "id_example"; // String | Portfolio plan id

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
apiInstance.getProjectsForPortfolioPlan(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id | 
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **Number**| Pagination limit | [optional] 
 **offset** | **Number**| Pagination offset | [optional] 
 **orderBy** | **String**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 
 **match** | **String**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**Projects**](Projects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRecommendationsForPortfolioPlan"></a>
# **getRecommendationsForPortfolioPlan**
> Recommendations getRecommendationsForPortfolioPlan(id, opts)

Retrieves recommendations for a portfolio plan.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = "id_example"; // String | Portfolio plan id

var opts = { 
  'startDate': 789, // Number | Start time period for the time horizon.
  'endDate': 789, // Number | End time period for the time horizon.
  'planType': OVERALL // Object | Plan type
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getRecommendationsForPortfolioPlan(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id | 
 **startDate** | **Number**| Start time period for the time horizon. | [optional] 
 **endDate** | **Number**| End time period for the time horizon. | [optional] 
 **planType** | [**Object**](.md)| Plan type | [optional] [default to OVERALL]

### Return type

[**Recommendations**](Recommendations.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getScheduleForPortfolioPlan"></a>
# **getScheduleForPortfolioPlan**
> Recommendations getScheduleForPortfolioPlan(id, opts)

Retrieves schedule for portfolio plan. The schedule is stored in a new portfolio plan.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = "id_example"; // String | Portfolio Plan id

var opts = { 
  'startDate': 789, // Number | Start time period for the time horizon.
  'endDate': 789, // Number | End time period for the time horizon.
  'toleranceLevelPercentage': 1.2, // Number | Percentage parameter to allow scheduling values within a deviation, defined by [target*(1 - tolerance), target*(1 + tolerance] bounds. Value should be between 0 and 1. Defaults to 0.1
  'schedulingCriteria': null // Object | Criteria used to function to evaluate different schedules. Defaults to TimePeriodOverBudgetPercent
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getScheduleForPortfolioPlan(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio Plan id | 
 **startDate** | **Number**| Start time period for the time horizon. | [optional] 
 **endDate** | **Number**| End time period for the time horizon. | [optional] 
 **toleranceLevelPercentage** | **Number**| Percentage parameter to allow scheduling values within a deviation, defined by [target*(1 - tolerance), target*(1 + tolerance] bounds. Value should be between 0 and 1. Defaults to 0.1 | [optional] 
 **schedulingCriteria** | [**Object**](.md)| Criteria used to function to evaluate different schedules. Defaults to TimePeriodOverBudgetPercent | [optional] 

### Return type

[**Recommendations**](Recommendations.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rebaselinePortfolioPlan"></a>
# **rebaselinePortfolioPlan**
> PortfolioPlan rebaselinePortfolioPlan(id)

Rebaseline a portfolio plan.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = "id_example"; // String | Portfolio plan id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.rebaselinePortfolioPlan(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id | 

### Return type

[**PortfolioPlan**](PortfolioPlan.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePortfolioPlan"></a>
# **updatePortfolioPlan**
> PortfolioPlan updatePortfolioPlan(id, body, opts)

Updates a portfolio plan utilizing JSON Patch Operations. 

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = "id_example"; // String | PortfolioPlan id

var body = new DecisionLensApi.Operations(); // Operations | JSON Patch Operations to update portfolio plan.

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
apiInstance.updatePortfolioPlan(id, body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| PortfolioPlan id | 
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update portfolio plan. | 
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**PortfolioPlan**](PortfolioPlan.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a name="updatePortfolioPlanBudgetFieldValues"></a>
# **updatePortfolioPlanBudgetFieldValues**
> [ResourcePoolFieldValue] updatePortfolioPlanBudgetFieldValues(id, body, opts)

Update field values in a portfolio plan

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = null; // Object | Portfolio plan id

var body = [new DecisionLensApi.ResourcePoolFieldValuePatchItem()]; // [ResourcePoolFieldValuePatchItem] | JSON Patch Operations to update multiple field values.

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
apiInstance.updatePortfolioPlanBudgetFieldValues(id, body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| Portfolio plan id | 
 **body** | [**[ResourcePoolFieldValuePatchItem]**](ResourcePoolFieldValuePatchItem.md)| JSON Patch Operations to update multiple field values. | 
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**[ResourcePoolFieldValue]**](ResourcePoolFieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a name="updatePortfolioPlanFieldValues"></a>
# **updatePortfolioPlanFieldValues**
> [FieldValue] updatePortfolioPlanFieldValues(id, body, opts)

Update field values in a portfolio plan

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = null; // Object | Portfolio plan id

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
apiInstance.updatePortfolioPlanFieldValues(id, body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| Portfolio plan id | 
 **body** | [**[FieldValuePatchItem]**](FieldValuePatchItem.md)| JSON Patch Operations to update multiple field values. | 
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**[FieldValue]**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a name="updatePortfolioPlanFieldValuesWithZero"></a>
# **updatePortfolioPlanFieldValuesWithZero**
> [FieldValue] updatePortfolioPlanFieldValuesWithZero(id, body, opts)

update portfolio plan numeric field values with 0

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = null; // Object | Portfolio plan id

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
apiInstance.updatePortfolioPlanFieldValuesWithZero(id, body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| Portfolio plan id | 
 **body** | [**[FieldValuePatchItem]**](FieldValuePatchItem.md)| JSON Patch Operations to update multiple field values. | 
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**[FieldValue]**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a name="updatePortfolioPlanUsers"></a>
# **updatePortfolioPlanUsers**
> [PortfolioPlanUser] updatePortfolioPlanUsers(id, body)

Update users in a portfolio plan

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlansApi();

var id = null; // Object | Portfolio plan id

var body = [new DecisionLensApi.PatchItem()]; // [PatchItem] | JSON Patch Operations to update multiple portfolio plan users.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updatePortfolioPlanUsers(id, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| Portfolio plan id | 
 **body** | [**[PatchItem]**](PatchItem.md)| JSON Patch Operations to update multiple portfolio plan users. | 

### Return type

[**[PortfolioPlanUser]**](PortfolioPlanUser.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

