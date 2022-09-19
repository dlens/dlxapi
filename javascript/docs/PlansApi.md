# DecisionLensApi.PlansApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportWhatsIn**](PlansApi.md#exportWhatsIn) | **GET** /portfolioPlans/whatsin/export | Export Whats In Comparison
[**getInsightsForPortfolioPlan**](PlansApi.md#getInsightsForPortfolioPlan) | **GET** /portfolioPlans/{id}/insights | Retrieves insights for portfolio plan.
[**getValueInsightsForPortfolioPlan**](PlansApi.md#getValueInsightsForPortfolioPlan) | **GET** /portfolioPlans/{id}/insights/value | Retrieves value insights for portfolio plan.
[**getWhatsIn**](PlansApi.md#getWhatsIn) | **GET** /portfolioPlans/whatsin | Retrieves portfolioPlans with projects for WhatsIn


<a name="exportWhatsIn"></a>
# **exportWhatsIn**
> &#39;Blob&#39; exportWhatsIn(portfolioId, portfolioPlanIds, exportFormat, startDate, endDate)

Export Whats In Comparison

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PlansApi();

var portfolioId = "portfolioId_example"; // String | portfolioId

var portfolioPlanIds = "portfolioPlanIds_example"; // String | portfolioPlanIds to be exported

var exportFormat = null; // Object | export format type (XLSX)

var startDate = 789; // Number | Start time period for which the grades are computed for.

var endDate = 789; // Number | End time period for which the grades are computed for.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.exportWhatsIn(portfolioId, portfolioPlanIds, exportFormat, startDate, endDate, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| portfolioId | 
 **portfolioPlanIds** | **String**| portfolioPlanIds to be exported | 
 **exportFormat** | [**Object**](.md)| export format type (XLSX) | 
 **startDate** | **Number**| Start time period for which the grades are computed for. | 
 **endDate** | **Number**| End time period for which the grades are computed for. | 

### Return type

**&#39;Blob&#39;**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

<a name="getInsightsForPortfolioPlan"></a>
# **getInsightsForPortfolioPlan**
> PortfolioPlanInsights getInsightsForPortfolioPlan(id, startDate, endDate, includeGrades)

Retrieves insights for portfolio plan.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PlansApi();

var id = "id_example"; // String | Portfolio Plan id

var startDate = 789; // Number | Start time period for which the insights are computed for.

var endDate = 789; // Number | End time period for which the insights are computed for.

var includeGrades = false; // Boolean | Whether to include grades in the response.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getInsightsForPortfolioPlan(id, startDate, endDate, includeGrades, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio Plan id | 
 **startDate** | **Number**| Start time period for which the insights are computed for. | 
 **endDate** | **Number**| End time period for which the insights are computed for. | 
 **includeGrades** | **Boolean**| Whether to include grades in the response. | [default to false]

### Return type

[**PortfolioPlanInsights**](PortfolioPlanInsights.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getValueInsightsForPortfolioPlan"></a>
# **getValueInsightsForPortfolioPlan**
> PortfolioPlanInsights getValueInsightsForPortfolioPlan(id, startDate, endDate)

Retrieves value insights for portfolio plan.

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PlansApi();

var id = "id_example"; // String | Portfolio Plan id

var startDate = 789; // Number | Start time period for which the grades are computed for.

var endDate = 789; // Number | End time period for which the grades are computed for.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getValueInsightsForPortfolioPlan(id, startDate, endDate, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio Plan id | 
 **startDate** | **Number**| Start time period for which the grades are computed for. | 
 **endDate** | **Number**| End time period for which the grades are computed for. | 

### Return type

[**PortfolioPlanInsights**](PortfolioPlanInsights.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWhatsIn"></a>
# **getWhatsIn**
> WhatsIn getWhatsIn(portfolioId, portfolioPlanIds, startDate, endDate, maxLimit, opts)

Retrieves portfolioPlans with projects for WhatsIn

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PlansApi();

var portfolioId = "portfolioId_example"; // String | portfolioId

var portfolioPlanIds = "portfolioPlanIds_example"; // String | portfolioPlanIds for which projects are returned

var startDate = 789; // Number | Start time period for which the grades are computed for.

var endDate = 789; // Number | End time period for which the grades are computed for.

var maxLimit = 56; // Number | Maximum limit for project; 0 < number of returned project(is variable, NOT fixed) < maxLimit

var opts = { 
  'offset': 56, // Number | Pagination offset
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getWhatsIn(portfolioId, portfolioPlanIds, startDate, endDate, maxLimit, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| portfolioId | 
 **portfolioPlanIds** | **String**| portfolioPlanIds for which projects are returned | 
 **startDate** | **Number**| Start time period for which the grades are computed for. | 
 **endDate** | **Number**| End time period for which the grades are computed for. | 
 **maxLimit** | **Number**| Maximum limit for project; 0 &lt; number of returned project(is variable, NOT fixed) &lt; maxLimit | 
 **offset** | **Number**| Pagination offset | [optional] 

### Return type

[**WhatsIn**](WhatsIn.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

