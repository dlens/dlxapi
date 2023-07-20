# PortfolioPlansApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAndDeleteFieldValuesForFields**](PortfolioPlansApi.md#addAndDeleteFieldValuesForFields) | **PATCH** /portfolioPlans/{portfolioPlanId}/project/{projectId}/addRemoveCosts | add field values for the fields, and remove all field values for fields, for the supplied project
[**addPortfolioPlanUsers**](PortfolioPlansApi.md#addPortfolioPlanUsers) | **POST** /portfolioPlans/{id}/users | Add users to a portfolio plan.
[**applyRecommendationsForPortfolioPlan**](PortfolioPlansApi.md#applyRecommendationsForPortfolioPlan) | **POST** /portfolioPlans/{id}/recommendations | Apply recommendations of a portfolio plan.
[**createPortfolioPlan**](PortfolioPlansApi.md#createPortfolioPlan) | **POST** /portfolioPlans | Create a portfolio plan
[**createProjectsInPortfolioPlan**](PortfolioPlansApi.md#createProjectsInPortfolioPlan) | **POST** /portfolioPlans/{id}/projects | Create new projects
[**deletePortfolioPlan**](PortfolioPlansApi.md#deletePortfolioPlan) | **DELETE** /portfolioPlans/{id} | Deletes portfolio plan
[**exportPortfolioPlan**](PortfolioPlansApi.md#exportPortfolioPlan) | **POST** /portfolioPlans/{id}/export | Export portfolio plan
[**getBudgetAllocationsForPortfolioPlan**](PortfolioPlansApi.md#getBudgetAllocationsForPortfolioPlan) | **GET** /portfolioPlans/{id}/budgetAllocations | Retrieves budget allocations for a portfolio plan.
[**getFieldValuesDataForPortfolioPlan**](PortfolioPlansApi.md#getFieldValuesDataForPortfolioPlan) | **GET** /portfolioPlans/{portfolioPlanId}/data/{dataId} | Fetch field values data for portfolio plan and data id.
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
[**updatePortfolioPlanUsers**](PortfolioPlansApi.md#updatePortfolioPlanUsers) | **PATCH** /portfolioPlans/{id}/users | Update users in a portfolio plan


<a name="addAndDeleteFieldValuesForFields"></a>
# **addAndDeleteFieldValuesForFields**
> List&lt;FieldValue&gt; addAndDeleteFieldValuesForFields(portfolioPlanId, projectId, body, expand)

add field values for the fields, and remove all field values for fields, for the supplied project

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
Object portfolioPlanId = null; // Object | Portfolio plan id
Object projectId = null; // Object | Project id
AddAndDeleteFieldValuesForFieldsRequest body = new AddAndDeleteFieldValuesForFieldsRequest(); // AddAndDeleteFieldValuesForFieldsRequest | TimePeriods cost fields to add, cost fields to remove
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    List<FieldValue> result = apiInstance.addAndDeleteFieldValuesForFields(portfolioPlanId, projectId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#addAndDeleteFieldValuesForFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioPlanId** | [**Object**](.md)| Portfolio plan id |
 **projectId** | [**Object**](.md)| Project id |
 **body** | [**AddAndDeleteFieldValuesForFieldsRequest**](AddAndDeleteFieldValuesForFieldsRequest.md)| TimePeriods cost fields to add, cost fields to remove |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]

### Return type

[**List&lt;FieldValue&gt;**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a name="addPortfolioPlanUsers"></a>
# **addPortfolioPlanUsers**
> List&lt;PortfolioPlanUser&gt; addPortfolioPlanUsers(id, body)

Add users to a portfolio plan.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String id = "id_example"; // String | Portfolio plan id
AddUsersRequest body = new AddUsersRequest(); // AddUsersRequest | Email ids and personal message
try {
    List<PortfolioPlanUser> result = apiInstance.addPortfolioPlanUsers(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#addPortfolioPlanUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id |
 **body** | [**AddUsersRequest**](AddUsersRequest.md)| Email ids and personal message | [optional]

### Return type

[**List&lt;PortfolioPlanUser&gt;**](PortfolioPlanUser.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="applyRecommendationsForPortfolioPlan"></a>
# **applyRecommendationsForPortfolioPlan**
> List&lt;FieldValue&gt; applyRecommendationsForPortfolioPlan(id, body)

Apply recommendations of a portfolio plan.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String id = "id_example"; // String | Portfolio plan id
List<Recommendation> body = Arrays.asList(new Recommendation()); // List<Recommendation> | JSON Recommendation Objects to apply to a portfolio plan.
try {
    List<FieldValue> result = apiInstance.applyRecommendationsForPortfolioPlan(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#applyRecommendationsForPortfolioPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id |
 **body** | [**List&lt;Recommendation&gt;**](Recommendation.md)| JSON Recommendation Objects to apply to a portfolio plan. |

### Return type

[**List&lt;FieldValue&gt;**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPortfolioPlan"></a>
# **createPortfolioPlan**
> PortfolioPlan createPortfolioPlan(body, expand)

Create a portfolio plan

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
PortfolioPlan body = new PortfolioPlan(); // PortfolioPlan | portfolio plan
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    PortfolioPlan result = apiInstance.createPortfolioPlan(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#createPortfolioPlan");
    e.printStackTrace();
}
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
> List&lt;Project&gt; createProjectsInPortfolioPlan(id, body, doNotExpand)

Create new projects

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String id = "id_example"; // String | Portfolio plan id
List<Project> body = Arrays.asList(new Project()); // List<Project> | Projects to create
Boolean doNotExpand = false; // Boolean | Whether to return collections for each project in the response. Default is to return saved field values.
try {
    List<Project> result = apiInstance.createProjectsInPortfolioPlan(id, body, doNotExpand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#createProjectsInPortfolioPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id |
 **body** | [**List&lt;Project&gt;**](Project.md)| Projects to create |
 **doNotExpand** | **Boolean**| Whether to return collections for each project in the response. Default is to return saved field values. | [optional] [default to false]

### Return type

[**List&lt;Project&gt;**](Project.md)

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
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String id = "id_example"; // String | portfolio plan id
try {
    apiInstance.deletePortfolioPlan(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#deletePortfolioPlan");
    e.printStackTrace();
}
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
> byte[] exportPortfolioPlan(id, exportType, exportFormat, exportConfig)

Export portfolio plan

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String id = "id_example"; // String | portfolio plan id
Object exportType = null; // Object | export type (PROJECT, SCHEDULE, SPEND_PLAN)
Object exportFormat = null; // Object | export format type (XLSX)
ExportConfig exportConfig = new ExportConfig(); // ExportConfig | export configuration object
try {
    byte[] result = apiInstance.exportPortfolioPlan(id, exportType, exportFormat, exportConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#exportPortfolioPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| portfolio plan id |
 **exportType** | [**Object**](.md)| export type (PROJECT, SCHEDULE, SPEND_PLAN) |
 **exportFormat** | [**Object**](.md)| export format type (XLSX) |
 **exportConfig** | [**ExportConfig**](ExportConfig.md)| export configuration object | [optional]

### Return type

**byte[]**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

<a name="getBudgetAllocationsForPortfolioPlan"></a>
# **getBudgetAllocationsForPortfolioPlan**
> BudgetAllocations getBudgetAllocationsForPortfolioPlan(id, startTime, endTime)

Retrieves budget allocations for a portfolio plan.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String id = "id_example"; // String | Portfolio plan id
Long startTime = 789L; // Long | Start time for the requested data
Long endTime = 789L; // Long | End time for the requested data
try {
    BudgetAllocations result = apiInstance.getBudgetAllocationsForPortfolioPlan(id, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#getBudgetAllocationsForPortfolioPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id |
 **startTime** | **Long**| Start time for the requested data | [optional]
 **endTime** | **Long**| End time for the requested data | [optional]

### Return type

[**BudgetAllocations**](BudgetAllocations.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFieldValuesDataForPortfolioPlan"></a>
# **getFieldValuesDataForPortfolioPlan**
> List&lt;FieldValue&gt; getFieldValuesDataForPortfolioPlan(portfolioPlanId, dataId)

Fetch field values data for portfolio plan and data id.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String portfolioPlanId = "portfolioPlanId_example"; // String | Portfolio plan ID
String dataId = "dataId_example"; // String | Data ID
try {
    List<FieldValue> result = apiInstance.getFieldValuesDataForPortfolioPlan(portfolioPlanId, dataId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#getFieldValuesDataForPortfolioPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioPlanId** | **String**| Portfolio plan ID |
 **dataId** | **String**| Data ID |

### Return type

[**List&lt;FieldValue&gt;**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMinifiedProjectsForPortfolioPlan"></a>
# **getMinifiedProjectsForPortfolioPlan**
> MinifiedProjects getMinifiedProjectsForPortfolioPlan(id, expand, limit, offset, orderBy, match)

Retrieves minified projects contained within a portfolio plan.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String id = "id_example"; // String | Portfolio plan id
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
Integer limit = 56; // Integer | Pagination limit
Integer offset = 56; // Integer | Pagination offset
String orderBy = "orderBy_example"; // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
String match = "match_example"; // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
try {
    MinifiedProjects result = apiInstance.getMinifiedProjectsForPortfolioPlan(id, expand, limit, offset, orderBy, match);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#getMinifiedProjectsForPortfolioPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]
 **limit** | **Integer**| Pagination limit | [optional]
 **offset** | **Integer**| Pagination offset | [optional]
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
> PortfolioPlan getPortfolioPlan(id, expand)

Retrieves portfolio plan

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String id = "id_example"; // String | portfolio plan id
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    PortfolioPlan result = apiInstance.getPortfolioPlan(id, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#getPortfolioPlan");
    e.printStackTrace();
}
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
> Activities getPortfolioPlanActivities(id, projectId, limit, offset, match)

Retrieves portfolio plan activities log.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String id = "id_example"; // String | Portfolio plan id
String projectId = "projectId_example"; // String | Use when you want to filter activities for a specific project
Integer limit = 56; // Integer | Pagination limit
Integer offset = 56; // Integer | Pagination offset
String match = "match_example"; // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
try {
    Activities result = apiInstance.getPortfolioPlanActivities(id, projectId, limit, offset, match);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#getPortfolioPlanActivities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id |
 **projectId** | **String**| Use when you want to filter activities for a specific project | [optional]
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

<a name="getPortfolioPlanUsers"></a>
# **getPortfolioPlanUsers**
> PortfolioPlanUsers getPortfolioPlanUsers(id, limit, offset, orderBy, match)

Retrieves users in a portfolio plan.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String id = "id_example"; // String | Portfolio plan id
Integer limit = 56; // Integer | Pagination limit
Integer offset = 56; // Integer | Pagination offset
String orderBy = "orderBy_example"; // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
String match = "match_example"; // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
try {
    PortfolioPlanUsers result = apiInstance.getPortfolioPlanUsers(id, limit, offset, orderBy, match);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#getPortfolioPlanUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id |
 **limit** | **Integer**| Pagination limit | [optional]
 **offset** | **Integer**| Pagination offset | [optional]
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
> PortfolioPlans getPortfolioPlans(portfolioId, expand, limit, offset, orderBy, match)

Retrieves portfolio plans

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String portfolioId = "portfolioId_example"; // String | portfolio id
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
Integer limit = 56; // Integer | Pagination limit
Integer offset = 56; // Integer | Pagination offset
String orderBy = "orderBy_example"; // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
String match = "match_example"; // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
try {
    PortfolioPlans result = apiInstance.getPortfolioPlans(portfolioId, expand, limit, offset, orderBy, match);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#getPortfolioPlans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| portfolio id |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]
 **limit** | **Integer**| Pagination limit | [optional]
 **offset** | **Integer**| Pagination offset | [optional]
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
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String portfolioPlanId = "portfolioPlanId_example"; // String | Portfolio plan id
String projectId = "projectId_example"; // String | project id
try {
    Project result = apiInstance.getProjectForPortfolioPlan(portfolioPlanId, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#getProjectForPortfolioPlan");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String portfolioId = "portfolioId_example"; // String | Portfolio id
String portfolioPlanId = "portfolioPlanId_example"; // String | Portfolio Plan id
Integer positionFrom = 56; // Integer | positionFrom for projects
Integer positionTo = 56; // Integer | positionTo for projects
try {
    Projects result = apiInstance.getProjectPortfolioPlansForPortfolioPlanAndPortfolio(portfolioId, portfolioPlanId, positionFrom, positionTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#getProjectPortfolioPlansForPortfolioPlanAndPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio id |
 **portfolioPlanId** | **String**| Portfolio Plan id |
 **positionFrom** | **Integer**| positionFrom for projects |
 **positionTo** | **Integer**| positionTo for projects |

### Return type

[**Projects**](Projects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjectsForPortfolioPlan"></a>
# **getProjectsForPortfolioPlan**
> Projects getProjectsForPortfolioPlan(id, expand, limit, offset, orderBy, match)

Retrieves projects contained within a portfolio plan. Possible expand paths - (items.fieldValues, contributingUserIds)

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String id = "id_example"; // String | Portfolio plan id
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
Integer limit = 56; // Integer | Pagination limit
Integer offset = 56; // Integer | Pagination offset
String orderBy = "orderBy_example"; // String | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order.
String match = "match_example"; // String | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded.
try {
    Projects result = apiInstance.getProjectsForPortfolioPlan(id, expand, limit, offset, orderBy, match);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#getProjectsForPortfolioPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id |
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

<a name="getRecommendationsForPortfolioPlan"></a>
# **getRecommendationsForPortfolioPlan**
> Recommendations getRecommendationsForPortfolioPlan(id, startDate, endDate, planType)

Retrieves recommendations for a portfolio plan.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String id = "id_example"; // String | Portfolio plan id
Long startDate = 789L; // Long | Start time period for the time horizon.
Long endDate = 789L; // Long | End time period for the time horizon.
Object planType = OVERALL; // Object | Plan type
try {
    Recommendations result = apiInstance.getRecommendationsForPortfolioPlan(id, startDate, endDate, planType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#getRecommendationsForPortfolioPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan id |
 **startDate** | **Long**| Start time period for the time horizon. | [optional]
 **endDate** | **Long**| End time period for the time horizon. | [optional]
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
> Recommendations getScheduleForPortfolioPlan(id, startDate, endDate, toleranceLevelPercentage, schedulingCriteria)

Retrieves schedule for portfolio plan. The schedule is stored in a new portfolio plan.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String id = "id_example"; // String | Portfolio Plan id
Long startDate = 789L; // Long | Start time period for the time horizon.
Long endDate = 789L; // Long | End time period for the time horizon.
Double toleranceLevelPercentage = 3.4D; // Double | Percentage parameter to allow scheduling values within a deviation, defined by [target*(1 - tolerance), target*(1 + tolerance] bounds. Value should be between 0 and 1. Defaults to 0.1
Object schedulingCriteria = null; // Object | Criteria used to function to evaluate different schedules. Defaults to TimePeriodOverBudgetPercent
try {
    Recommendations result = apiInstance.getScheduleForPortfolioPlan(id, startDate, endDate, toleranceLevelPercentage, schedulingCriteria);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#getScheduleForPortfolioPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio Plan id |
 **startDate** | **Long**| Start time period for the time horizon. | [optional]
 **endDate** | **Long**| End time period for the time horizon. | [optional]
 **toleranceLevelPercentage** | **Double**| Percentage parameter to allow scheduling values within a deviation, defined by [target*(1 - tolerance), target*(1 + tolerance] bounds. Value should be between 0 and 1. Defaults to 0.1 | [optional]
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
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String id = "id_example"; // String | Portfolio plan id
try {
    PortfolioPlan result = apiInstance.rebaselinePortfolioPlan(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#rebaselinePortfolioPlan");
    e.printStackTrace();
}
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
> PortfolioPlan updatePortfolioPlan(id, body, expand)

Updates a portfolio plan utilizing JSON Patch Operations. 

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
String id = "id_example"; // String | PortfolioPlan id
Operations body = new Operations(); // Operations | JSON Patch Operations to update portfolio plan.
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    PortfolioPlan result = apiInstance.updatePortfolioPlan(id, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#updatePortfolioPlan");
    e.printStackTrace();
}
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
> List&lt;ResourcePoolFieldValue&gt; updatePortfolioPlanBudgetFieldValues(id, body, expand)

Update field values in a portfolio plan

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
Object id = null; // Object | Portfolio plan id
List<ResourcePoolFieldValuePatchItem> body = Arrays.asList(new ResourcePoolFieldValuePatchItem()); // List<ResourcePoolFieldValuePatchItem> | JSON Patch Operations to update multiple field values.
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    List<ResourcePoolFieldValue> result = apiInstance.updatePortfolioPlanBudgetFieldValues(id, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#updatePortfolioPlanBudgetFieldValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| Portfolio plan id |
 **body** | [**List&lt;ResourcePoolFieldValuePatchItem&gt;**](ResourcePoolFieldValuePatchItem.md)| JSON Patch Operations to update multiple field values. |
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]

### Return type

[**List&lt;ResourcePoolFieldValue&gt;**](ResourcePoolFieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a name="updatePortfolioPlanFieldValues"></a>
# **updatePortfolioPlanFieldValues**
> List&lt;FieldValue&gt; updatePortfolioPlanFieldValues(id, body, applyRank, preserveProjectAccess, expand)

Update field values in a portfolio plan

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
Object id = null; // Object | Portfolio plan id
List<FieldValuePatchItem> body = Arrays.asList(new FieldValuePatchItem()); // List<FieldValuePatchItem> | JSON Patch Operations to update multiple field values.
Boolean applyRank = true; // Boolean | Whether the update signifies an Apply Rank action.
Boolean preserveProjectAccess = true; // Boolean | Making sure projects access is retained in case that the current change would affect permissions
String expand = "expand_example"; // String | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
try {
    List<FieldValue> result = apiInstance.updatePortfolioPlanFieldValues(id, body, applyRank, preserveProjectAccess, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#updatePortfolioPlanFieldValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| Portfolio plan id |
 **body** | [**List&lt;FieldValuePatchItem&gt;**](FieldValuePatchItem.md)| JSON Patch Operations to update multiple field values. |
 **applyRank** | **Boolean**| Whether the update signifies an Apply Rank action. | [optional]
 **preserveProjectAccess** | **Boolean**| Making sure projects access is retained in case that the current change would affect permissions | [optional]
 **expand** | **String**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional]

### Return type

[**List&lt;FieldValue&gt;**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a name="updatePortfolioPlanUsers"></a>
# **updatePortfolioPlanUsers**
> List&lt;PortfolioPlanUser&gt; updatePortfolioPlanUsers(id, body)

Update users in a portfolio plan

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PortfolioPlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PortfolioPlansApi apiInstance = new PortfolioPlansApi();
Object id = null; // Object | Portfolio plan id
List<PatchItem> body = Arrays.asList(new PatchItem()); // List<PatchItem> | JSON Patch Operations to update multiple portfolio plan users.
try {
    List<PortfolioPlanUser> result = apiInstance.updatePortfolioPlanUsers(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioPlansApi#updatePortfolioPlanUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**Object**](.md)| Portfolio plan id |
 **body** | [**List&lt;PatchItem&gt;**](PatchItem.md)| JSON Patch Operations to update multiple portfolio plan users. |

### Return type

[**List&lt;PortfolioPlanUser&gt;**](PortfolioPlanUser.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

