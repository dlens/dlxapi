# DecisionLensApi.ReportsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPortfolioPlanGradesReport**](ReportsApi.md#getPortfolioPlanGradesReport) | **GET** /portfolioPlans/{id}/grades/report | Downloads the grades report for a portfolio plan


<a name="getPortfolioPlanGradesReport"></a>
# **getPortfolioPlanGradesReport**
> &#39;Blob&#39; getPortfolioPlanGradesReport(id, opts)

Downloads the grades report for a portfolio plan

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.ReportsApi();

var id = "id_example"; // String | Portfolio Plan id

var opts = { 
  'startDate': 789, // Number | Start time period for which the grades are computed for.
  'endDate': 789 // Number | End time period for which the grades are computed for.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioPlanGradesReport(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio Plan id | 
 **startDate** | **Number**| Start time period for which the grades are computed for. | [optional] 
 **endDate** | **Number**| End time period for which the grades are computed for. | [optional] 

### Return type

**&#39;Blob&#39;**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

