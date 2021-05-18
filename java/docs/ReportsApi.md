# ReportsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPortfolioPlanGradesReport**](ReportsApi.md#getPortfolioPlanGradesReport) | **GET** /portfolioPlans/{id}/grades/report | Downloads the grades report for a portfolio plan


<a name="getPortfolioPlanGradesReport"></a>
# **getPortfolioPlanGradesReport**
> byte[] getPortfolioPlanGradesReport(id, startDate, endDate)

Downloads the grades report for a portfolio plan

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.ReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ReportsApi apiInstance = new ReportsApi();
String id = "id_example"; // String | Portfolio Plan id
Long startDate = 789L; // Long | Start time period for which the grades are computed for.
Long endDate = 789L; // Long | End time period for which the grades are computed for.
try {
    byte[] result = apiInstance.getPortfolioPlanGradesReport(id, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#getPortfolioPlanGradesReport");
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

**byte[]**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

