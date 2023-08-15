# swagger_client.GoalsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_goals_for_portfolio**](GoalsApi.md#get_goals_for_portfolio) | **GET** /goals | Get Goals by portfolio id
[**update_goals_for_portfolio**](GoalsApi.md#update_goals_for_portfolio) | **PATCH** /goals | Updates Goals for portfolio


# **get_goals_for_portfolio**
> Goals get_goals_for_portfolio(portfolio_id, offset=offset, limit=limit, order_by=order_by)

Get Goals by portfolio id

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
api_instance = swagger_client.GoalsApi(swagger_client.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio id
offset = 56 # int | Pagination offset (optional)
limit = 56 # int | Pagination limit (optional)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)

try:
    # Get Goals by portfolio id
    api_response = api_instance.get_goals_for_portfolio(portfolio_id, offset=offset, limit=limit, order_by=order_by)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalsApi->get_goals_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 
 **offset** | **int**| Pagination offset | [optional] 
 **limit** | **int**| Pagination limit | [optional] 
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 

### Return type

[**Goals**](Goals.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_goals_for_portfolio**
> list[Goal] update_goals_for_portfolio(portfolio_id, goals)

Updates Goals for portfolio

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
api_instance = swagger_client.GoalsApi(swagger_client.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio id
goals = [swagger_client.Goal()] # list[Goal] | Goals

try:
    # Updates Goals for portfolio
    api_response = api_instance.update_goals_for_portfolio(portfolio_id, goals)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalsApi->update_goals_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 
 **goals** | [**list[Goal]**](Goal.md)| Goals | 

### Return type

[**list[Goal]**](Goal.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

