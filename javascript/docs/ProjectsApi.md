# DecisionLensApi.ProjectsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addContributingUsersForProject**](ProjectsApi.md#addContributingUsersForProject) | **POST** /projects/{id}/users | Add users to a project.
[**copyProject**](ProjectsApi.md#copyProject) | **POST** /projects/{id}/copy | Creates a copy of the project, including portfolio data, dependencies, attachments
[**createProject**](ProjectsApi.md#createProject) | **POST** /projects | Creates a new project.
[**deleteFieldValuesForProject**](ProjectsApi.md#deleteFieldValuesForProject) | **DELETE** /projects/{id}/fieldValues | Deletes all field values for a certain fields for a particular project
[**deleteProject**](ProjectsApi.md#deleteProject) | **DELETE** /projects/{id} | Delete a project.
[**deleteProjects**](ProjectsApi.md#deleteProjects) | **POST** /projects/delete | Delete projects.
[**getProject**](ProjectsApi.md#getProject) | **GET** /projects/{id} | Retrieves a project.
[**getProjectForPortfolioPlan**](ProjectsApi.md#getProjectForPortfolioPlan) | **GET** /projects/{projectId}/portfolioPlan/{portfolioPlanId} | Retrieves a project for a portfolioPlan.
[**getProjectsDataForPortfolio**](ProjectsApi.md#getProjectsDataForPortfolio) | **GET** /projects/data | Fetch project data for portfolio and data id.
[**getProjectsForPortfolio**](ProjectsApi.md#getProjectsForPortfolio) | **GET** /projects | Retrieves projects contained within a portfolio. Possible expand paths are - (items.fieldValues, contributingUserIds)
[**removeContributingUsersFromProject**](ProjectsApi.md#removeContributingUsersFromProject) | **DELETE** /projects/{id}/users | Remove contributing users from a project.
[**setProjectDependencies**](ProjectsApi.md#setProjectDependencies) | **PUT** /projects/{id}/dependencies | Adds or removes dependsOn and/or dependant linked projects to a project.


<a name="addContributingUsersForProject"></a>
# **addContributingUsersForProject**
> [PortfolioPlanUser] addContributingUsersForProject(id, opts)

Add users to a project.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ProjectsApi();

var id = "id_example"; // String | project id

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
apiInstance.addContributingUsersForProject(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| project id | 
 **body** | [**AddUsersRequest**](AddUsersRequest.md)| Email ids and personal message | [optional] 

### Return type

[**[PortfolioPlanUser]**](PortfolioPlanUser.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="copyProject"></a>
# **copyProject**
> Project copyProject(id, opts)

Creates a copy of the project, including portfolio data, dependencies, attachments

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ProjectsApi();

var id = "id_example"; // String | project id

var opts = { 
  'body': new DecisionLensApi.Project() // Project | Info to be included in the new project copy; only name will suffice
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.copyProject(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| project id | 
 **body** | [**Project**](Project.md)| Info to be included in the new project copy; only name will suffice | [optional] 

### Return type

[**Project**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProject"></a>
# **createProject**
> Project createProject(portfolioId, project)

Creates a new project.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ProjectsApi();

var portfolioId = "portfolioId_example"; // String | Portfolio id

var project = new DecisionLensApi.Project(); // Project | Project to create


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createProject(portfolioId, project, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id | 
 **project** | [**Project**](Project.md)| Project to create | 

### Return type

[**Project**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFieldValuesForProject"></a>
# **deleteFieldValuesForProject**
> deleteFieldValuesForProject(id, fieldIds)

Deletes all field values for a certain fields for a particular project

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ProjectsApi();

var id = "id_example"; // String | project id

var fieldIds = ["fieldIds_example"]; // [String] | field ids


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteFieldValuesForProject(id, fieldIds, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| project id | 
 **fieldIds** | [**[String]**](String.md)| field ids | 

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteProject"></a>
# **deleteProject**
> deleteProject(id)

Delete a project.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ProjectsApi();

var id = "id_example"; // String | Project id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteProject(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Project id | 

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteProjects"></a>
# **deleteProjects**
> deleteProjects(projectIds)

Delete projects.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ProjectsApi();

var projectIds = [new DecisionLensApi.[String]()]; // [String] | Project ids


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteProjects(projectIds, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIds** | **[String]**| Project ids | 

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getProject"></a>
# **getProject**
> Project getProject(id)

Retrieves a project.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ProjectsApi();

var id = "id_example"; // String | Project id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getProject(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Project id | 

### Return type

[**Project**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjectForPortfolioPlan"></a>
# **getProjectForPortfolioPlan**
> Project getProjectForPortfolioPlan(projectId, portfolioPlanId)

Retrieves a project for a portfolioPlan.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ProjectsApi();

var projectId = "projectId_example"; // String | Project id

var portfolioPlanId = "portfolioPlanId_example"; // String | PortfolioPlan id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getProjectForPortfolioPlan(projectId, portfolioPlanId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| Project id | 
 **portfolioPlanId** | **String**| PortfolioPlan id | 

### Return type

[**Project**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjectsDataForPortfolio"></a>
# **getProjectsDataForPortfolio**
> MinifiedProjects getProjectsDataForPortfolio(portfolioId, dataId)

Fetch project data for portfolio and data id.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ProjectsApi();

var portfolioId = "portfolioId_example"; // String | Portfolio Id

var dataId = "dataId_example"; // String | Data Id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getProjectsDataForPortfolio(portfolioId, dataId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio Id | 
 **dataId** | **String**| Data Id | 

### Return type

[**MinifiedProjects**](MinifiedProjects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjectsForPortfolio"></a>
# **getProjectsForPortfolio**
> Projects getProjectsForPortfolio(portfolioId, opts)

Retrieves projects contained within a portfolio. Possible expand paths are - (items.fieldValues, contributingUserIds)

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ProjectsApi();

var portfolioId = "portfolioId_example"; // String | Portfolio id

var opts = { 
  'portfolioPlanId': "portfolioPlanId_example", // String | Portfolio plan id. If not specified the portfolio plan will default to current baseline
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
apiInstance.getProjectsForPortfolio(portfolioId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id | 
 **portfolioPlanId** | **String**| Portfolio plan id. If not specified the portfolio plan will default to current baseline | [optional] 
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

<a name="removeContributingUsersFromProject"></a>
# **removeContributingUsersFromProject**
> removeContributingUsersFromProject(id, body)

Remove contributing users from a project.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ProjectsApi();

var id = "id_example"; // String | project id

var body = new DecisionLensApi.RemoveContributingUsersRequest(); // RemoveContributingUsersRequest | contributing user ids


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.removeContributingUsersFromProject(id, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| project id | 
 **body** | [**RemoveContributingUsersRequest**](RemoveContributingUsersRequest.md)| contributing user ids | 

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setProjectDependencies"></a>
# **setProjectDependencies**
> Projects setProjectDependencies(id, opts)

Adds or removes dependsOn and/or dependant linked projects to a project.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ProjectsApi();

var id = "id_example"; // String | project id

var opts = { 
  'body': new DecisionLensApi.SetDependenciesRequest() // SetDependenciesRequest | dependsOn and hasDependent project Ids
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.setProjectDependencies(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| project id | 
 **body** | [**SetDependenciesRequest**](SetDependenciesRequest.md)| dependsOn and hasDependent project Ids | [optional] 

### Return type

[**Projects**](Projects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

