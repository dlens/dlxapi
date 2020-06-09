# PlansApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportWhatsIn**](PlansApi.md#exportWhatsIn) | **GET** /portfolioPlans/whatsin/export | Export Whats In Comparison
[**getGradesForPortfolioPlan**](PlansApi.md#getGradesForPortfolioPlan) | **GET** /portfolioPlans/{id}/grades | Retrieves grades for portfolio plan.
[**getInsightsForPortfolioPlan**](PlansApi.md#getInsightsForPortfolioPlan) | **GET** /portfolioPlans/{id}/insights | Retrieves insights for portfolio plan.
[**getWhatsIn**](PlansApi.md#getWhatsIn) | **GET** /portfolioPlans/whatsin | Retrieves portfolioPlans with projects for WhatsIn


<a name="exportWhatsIn"></a>
# **exportWhatsIn**
> byte[] exportWhatsIn(portfolioId, portfolioPlanIds, exportFormat, startDate, endDate)

Export Whats In Comparison

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PlansApi apiInstance = new PlansApi();
String portfolioId = "portfolioId_example"; // String | portfolioId
String portfolioPlanIds = "portfolioPlanIds_example"; // String | portfolioPlanIds to be exported
Object exportFormat = null; // Object | export format type (XLSX)
Long startDate = 789L; // Long | Start time period for which the grades are computed for.
Long endDate = 789L; // Long | End time period for which the grades are computed for.
try {
    byte[] result = apiInstance.exportWhatsIn(portfolioId, portfolioPlanIds, exportFormat, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#exportWhatsIn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| portfolioId |
 **portfolioPlanIds** | **String**| portfolioPlanIds to be exported |
 **exportFormat** | [**Object**](.md)| export format type (XLSX) |
 **startDate** | **Long**| Start time period for which the grades are computed for. |
 **endDate** | **Long**| End time period for which the grades are computed for. |

### Return type

**byte[]**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

<a name="getGradesForPortfolioPlan"></a>
# **getGradesForPortfolioPlan**
> PortfolioPlanGrades getGradesForPortfolioPlan(id, startDate, endDate)

Retrieves grades for portfolio plan.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PlansApi apiInstance = new PlansApi();
String id = "id_example"; // String | Portfolio Plan id
Long startDate = 789L; // Long | Start time period for which the grades are computed for.
Long endDate = 789L; // Long | End time period for which the grades are computed for.
try {
    PortfolioPlanGrades result = apiInstance.getGradesForPortfolioPlan(id, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#getGradesForPortfolioPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio Plan id |
 **startDate** | **Long**| Start time period for which the grades are computed for. | [optional]
 **endDate** | **Long**| End time period for which the grades are computed for. | [optional]

### Return type

[**PortfolioPlanGrades**](PortfolioPlanGrades.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInsightsForPortfolioPlan"></a>
# **getInsightsForPortfolioPlan**
> PortfolioPlanInsights getInsightsForPortfolioPlan(id, startDate, endDate)

Retrieves insights for portfolio plan.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PlansApi apiInstance = new PlansApi();
String id = "id_example"; // String | Portfolio Plan id
Long startDate = 789L; // Long | Start time period for which the grades are computed for.
Long endDate = 789L; // Long | End time period for which the grades are computed for.
try {
    PortfolioPlanInsights result = apiInstance.getInsightsForPortfolioPlan(id, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#getInsightsForPortfolioPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio Plan id |
 **startDate** | **Long**| Start time period for which the grades are computed for. |
 **endDate** | **Long**| End time period for which the grades are computed for. |

### Return type

[**PortfolioPlanInsights**](PortfolioPlanInsights.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWhatsIn"></a>
# **getWhatsIn**
> WhatsIn getWhatsIn(portfolioId, portfolioPlanIds, startDate, endDate, maxLimit, offset)

Retrieves portfolioPlans with projects for WhatsIn

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.PlansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PlansApi apiInstance = new PlansApi();
String portfolioId = "portfolioId_example"; // String | portfolioId
String portfolioPlanIds = "portfolioPlanIds_example"; // String | portfolioPlanIds for which projects are returned
Long startDate = 789L; // Long | Start time period for which the grades are computed for.
Long endDate = 789L; // Long | End time period for which the grades are computed for.
Integer maxLimit = 56; // Integer | Maximum limit for project; 0 < number of returned project(is variable, NOT fixed) < maxLimit
Integer offset = 56; // Integer | Pagination offset
try {
    WhatsIn result = apiInstance.getWhatsIn(portfolioId, portfolioPlanIds, startDate, endDate, maxLimit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#getWhatsIn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| portfolioId |
 **portfolioPlanIds** | **String**| portfolioPlanIds for which projects are returned |
 **startDate** | **Long**| Start time period for which the grades are computed for. |
 **endDate** | **Long**| End time period for which the grades are computed for. |
 **maxLimit** | **Integer**| Maximum limit for project; 0 &lt; number of returned project(is variable, NOT fixed) &lt; maxLimit |
 **offset** | **Integer**| Pagination offset | [optional]

### Return type

[**WhatsIn**](WhatsIn.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

