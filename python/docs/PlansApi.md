# swagger_client.PlansApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**export_whats_in**](PlansApi.md#export_whats_in) | **GET** /portfolioPlans/whatsin/export | Export Whats In Comparison
[**get_grades_for_portfolio_plan**](PlansApi.md#get_grades_for_portfolio_plan) | **GET** /portfolioPlans/{id}/grades | Retrieves grades for portfolio plan.
[**get_insights_for_portfolio_plan**](PlansApi.md#get_insights_for_portfolio_plan) | **GET** /portfolioPlans/{id}/insights | Retrieves insights for portfolio plan.
[**get_value_insights_for_portfolio_plan**](PlansApi.md#get_value_insights_for_portfolio_plan) | **GET** /portfolioPlans/{id}/insights/value | Retrieves value insights for portfolio plan.
[**get_whats_in**](PlansApi.md#get_whats_in) | **GET** /portfolioPlans/whatsin | Retrieves portfolioPlans with projects for WhatsIn


# **export_whats_in**
> str export_whats_in(portfolio_id, portfolio_plan_ids, export_format, start_date, end_date)

Export Whats In Comparison

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: OAuth2
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.PlansApi(swagger_client.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | portfolioId
portfolio_plan_ids = 'portfolio_plan_ids_example' # str | portfolioPlanIds to be exported
export_format = NULL # object | export format type (XLSX)
start_date = 789 # int | Start time period for which the grades are computed for.
end_date = 789 # int | End time period for which the grades are computed for.

try:
    # Export Whats In Comparison
    api_response = api_instance.export_whats_in(portfolio_id, portfolio_plan_ids, export_format, start_date, end_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PlansApi->export_whats_in: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| portfolioId | 
 **portfolio_plan_ids** | **str**| portfolioPlanIds to be exported | 
 **export_format** | [**object**](.md)| export format type (XLSX) | 
 **start_date** | **int**| Start time period for which the grades are computed for. | 
 **end_date** | **int**| End time period for which the grades are computed for. | 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_grades_for_portfolio_plan**
> PortfolioPlanGrades get_grades_for_portfolio_plan(id, start_date=start_date, end_date=end_date, generate_report=generate_report)

Retrieves grades for portfolio plan.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: OAuth2
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.PlansApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | Portfolio Plan id
start_date = 789 # int | Start time period for which the grades are computed for. (optional)
end_date = 789 # int | End time period for which the grades are computed for. (optional)
generate_report = false # bool | Generates grades report. Default is false. (optional) (default to false)

try:
    # Retrieves grades for portfolio plan.
    api_response = api_instance.get_grades_for_portfolio_plan(id, start_date=start_date, end_date=end_date, generate_report=generate_report)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PlansApi->get_grades_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio Plan id | 
 **start_date** | **int**| Start time period for which the grades are computed for. | [optional] 
 **end_date** | **int**| End time period for which the grades are computed for. | [optional] 
 **generate_report** | **bool**| Generates grades report. Default is false. | [optional] [default to false]

### Return type

[**PortfolioPlanGrades**](PortfolioPlanGrades.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_insights_for_portfolio_plan**
> PortfolioPlanInsights get_insights_for_portfolio_plan(id, start_date, end_date)

Retrieves insights for portfolio plan.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: OAuth2
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.PlansApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | Portfolio Plan id
start_date = 789 # int | Start time period for which the grades are computed for.
end_date = 789 # int | End time period for which the grades are computed for.

try:
    # Retrieves insights for portfolio plan.
    api_response = api_instance.get_insights_for_portfolio_plan(id, start_date, end_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PlansApi->get_insights_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio Plan id | 
 **start_date** | **int**| Start time period for which the grades are computed for. | 
 **end_date** | **int**| End time period for which the grades are computed for. | 

### Return type

[**PortfolioPlanInsights**](PortfolioPlanInsights.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_value_insights_for_portfolio_plan**
> PortfolioPlanInsights get_value_insights_for_portfolio_plan(id, start_date, end_date)

Retrieves value insights for portfolio plan.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: OAuth2
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.PlansApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | Portfolio Plan id
start_date = 789 # int | Start time period for which the grades are computed for.
end_date = 789 # int | End time period for which the grades are computed for.

try:
    # Retrieves value insights for portfolio plan.
    api_response = api_instance.get_value_insights_for_portfolio_plan(id, start_date, end_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PlansApi->get_value_insights_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio Plan id | 
 **start_date** | **int**| Start time period for which the grades are computed for. | 
 **end_date** | **int**| End time period for which the grades are computed for. | 

### Return type

[**PortfolioPlanInsights**](PortfolioPlanInsights.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_whats_in**
> WhatsIn get_whats_in(portfolio_id, portfolio_plan_ids, start_date, end_date, max_limit, offset=offset)

Retrieves portfolioPlans with projects for WhatsIn

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: OAuth2
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.PlansApi(swagger_client.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | portfolioId
portfolio_plan_ids = 'portfolio_plan_ids_example' # str | portfolioPlanIds for which projects are returned
start_date = 789 # int | Start time period for which the grades are computed for.
end_date = 789 # int | End time period for which the grades are computed for.
max_limit = 56 # int | Maximum limit for project; 0 < number of returned project(is variable, NOT fixed) < maxLimit
offset = 56 # int | Pagination offset (optional)

try:
    # Retrieves portfolioPlans with projects for WhatsIn
    api_response = api_instance.get_whats_in(portfolio_id, portfolio_plan_ids, start_date, end_date, max_limit, offset=offset)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PlansApi->get_whats_in: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| portfolioId | 
 **portfolio_plan_ids** | **str**| portfolioPlanIds for which projects are returned | 
 **start_date** | **int**| Start time period for which the grades are computed for. | 
 **end_date** | **int**| End time period for which the grades are computed for. | 
 **max_limit** | **int**| Maximum limit for project; 0 &lt; number of returned project(is variable, NOT fixed) &lt; maxLimit | 
 **offset** | **int**| Pagination offset | [optional] 

### Return type

[**WhatsIn**](WhatsIn.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

