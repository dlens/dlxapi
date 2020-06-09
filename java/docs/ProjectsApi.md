# ProjectsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProject**](ProjectsApi.md#createProject) | **POST** /projects | Creates a new project.
[**deleteProject**](ProjectsApi.md#deleteProject) | **DELETE** /projects/{id} | Delete a project.
[**deleteProjects**](ProjectsApi.md#deleteProjects) | **POST** /projects/delete | Delete projects.
[**getProject**](ProjectsApi.md#getProject) | **GET** /projects/{id} | Retrieves a project.
[**getProjectForPortfolioPlan**](ProjectsApi.md#getProjectForPortfolioPlan) | **GET** /projects/{projectId}/portfolioPlan/{portfolioPlanId} | Retrieves a project for a portfolioPlan.
[**getProjectsForPortfolio**](ProjectsApi.md#getProjectsForPortfolio) | **GET** /projects | Retrieves projects contained within a portfolio. Possible expand paths are - (items.fieldValues, contributingUserIds)


<a name="createProject"></a>
# **createProject**
> Project createProject(portfolioId, project)

Creates a new project.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProjectsApi apiInstance = new ProjectsApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id
Project project = new Project(); // Project | Project to create
try {
    Project result = apiInstance.createProject(portfolioId, project);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#createProject");
    e.printStackTrace();
}
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

<a name="deleteProject"></a>
# **deleteProject**
> deleteProject(id)

Delete a project.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProjectsApi apiInstance = new ProjectsApi();
String id = "id_example"; // String | Project id
try {
    apiInstance.deleteProject(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#deleteProject");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProjectsApi apiInstance = new ProjectsApi();
List<String> projectIds = Arrays.asList(new List<String>()); // List<String> | Project ids
try {
    apiInstance.deleteProjects(projectIds);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#deleteProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIds** | **List&lt;String&gt;**| Project ids |

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
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProjectsApi apiInstance = new ProjectsApi();
String id = "id_example"; // String | Project id
try {
    Project result = apiInstance.getProject(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getProject");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | Project id
String portfolioPlanId = "portfolioPlanId_example"; // String | PortfolioPlan id
try {
    Project result = apiInstance.getProjectForPortfolioPlan(projectId, portfolioPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getProjectForPortfolioPlan");
    e.printStackTrace();
}
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

<a name="getProjectsForPortfolio"></a>
# **getProjectsForPortfolio**
> Projects getProjectsForPortfolio(portfolioId, portfolioPlanId, expand, limit, offset, orderBy, match)

Retrieves projects contained within a portfolio. Possible expand paths are - (items.fieldValues, contributingUserIds)

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.ProjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProjectsApi apiInstance = new ProjectsApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id
String portfolioPlanId = "portfolioPlanId_example"; // String | Portfolio plan id. If not specified the portfolio plan will default to current baseline
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
Integer limit = 56; // Integer | Pagination limit
Integer offset = 56; // Integer | Pagination offset
String orderBy = "orderBy_example"; // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
String match = "match_example"; // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
try {
    Projects result = apiInstance.getProjectsForPortfolio(portfolioId, portfolioPlanId, expand, limit, offset, orderBy, match);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getProjectsForPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id |
 **portfolioPlanId** | **String**| Portfolio plan id. If not specified the portfolio plan will default to current baseline | [optional]
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]
 **limit** | **Integer**| Pagination limit | [optional]
 **offset** | **Integer**| Pagination offset | [optional]
 **orderBy** | **String**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional]
 **match** | **String**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional]

### Return type

[**Projects**](Projects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

