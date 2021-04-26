# swagger_client.ReportsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_portfolio_plan_grades_report**](ReportsApi.md#get_portfolio_plan_grades_report) | **GET** /portfolioPlans/{id}/grades/report | Downloads the grades report for a portfolio plan


# **get_portfolio_plan_grades_report**
> str get_portfolio_plan_grades_report(id, start_date=start_date, end_date=end_date)

Downloads the grades report for a portfolio plan

### Example

```python
from __future__ import print_function
import time
import dlxapi
from dlxapi.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: OAuth2
configuration = dlxapi.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = dlxapi.ReportsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio Plan id
start_date = 789 # int | Start time period for which the grades are computed for. (optional)
end_date = 789 # int | End time period for which the grades are computed for. (optional)

try:
    # Downloads the grades report for a portfolio plan
    api_response = api_instance.get_portfolio_plan_grades_report(id, start_date=start_date, end_date=end_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportsApi->get_portfolio_plan_grades_report: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio Plan id | 
 **start_date** | **int**| Start time period for which the grades are computed for. | [optional] 
 **end_date** | **int**| End time period for which the grades are computed for. | [optional] 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

