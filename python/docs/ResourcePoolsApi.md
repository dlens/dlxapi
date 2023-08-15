# swagger_client.ResourcePoolsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_resource_pool**](ResourcePoolsApi.md#get_resource_pool) | **GET** /resourcePools/{id} | Retrieves a resource pool.
[**get_resource_pools_for_portfolio_plan**](ResourcePoolsApi.md#get_resource_pools_for_portfolio_plan) | **GET** /resourcePools | Fetch resource pools for portfolio plan
[**update_resource_pool_budget_amounts_for_portfolio_plan**](ResourcePoolsApi.md#update_resource_pool_budget_amounts_for_portfolio_plan) | **PATCH** /resourcePools | Update resource pool budget amounts in a portfolio plan


# **get_resource_pool**
> ResourcePool get_resource_pool(id, portfolio_plan_id=portfolio_plan_id)

Retrieves a resource pool.

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
api_instance = swagger_client.ResourcePoolsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | Resource Pool id
portfolio_plan_id = 'portfolio_plan_id_example' # str | Portfolio Plan id (optional)

try:
    # Retrieves a resource pool.
    api_response = api_instance.get_resource_pool(id, portfolio_plan_id=portfolio_plan_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ResourcePoolsApi->get_resource_pool: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Resource Pool id | 
 **portfolio_plan_id** | **str**| Portfolio Plan id | [optional] 

### Return type

[**ResourcePool**](ResourcePool.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_resource_pools_for_portfolio_plan**
> ResourcePools get_resource_pools_for_portfolio_plan(portfolio_plan_id, plan_overrides_only=plan_overrides_only, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)

Fetch resource pools for portfolio plan

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
api_instance = swagger_client.ResourcePoolsApi(swagger_client.ApiClient(configuration))
portfolio_plan_id = 'portfolio_plan_id_example' # str | Portfolio Plan id
plan_overrides_only = false # bool | Returns only plan overrides. default is false. (optional) (default to false)
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Fetch resource pools for portfolio plan
    api_response = api_instance.get_resource_pools_for_portfolio_plan(portfolio_plan_id, plan_overrides_only=plan_overrides_only, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ResourcePoolsApi->get_resource_pools_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_plan_id** | **str**| Portfolio Plan id | 
 **plan_overrides_only** | **bool**| Returns only plan overrides. default is false. | [optional] [default to false]
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**ResourcePools**](ResourcePools.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_resource_pool_budget_amounts_for_portfolio_plan**
> list[ResourcePool] update_resource_pool_budget_amounts_for_portfolio_plan(portfolio_plan_id, body)

Update resource pool budget amounts in a portfolio plan

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
api_instance = swagger_client.ResourcePoolsApi(swagger_client.ApiClient(configuration))
portfolio_plan_id = 'portfolio_plan_id_example' # str | Portfolio Plan id
body = [swagger_client.ResourcePoolBudgetAmountPatchItem()] # list[ResourcePoolBudgetAmountPatchItem] | JSON Patch Operations to update multiple resource pool budget amounts

try:
    # Update resource pool budget amounts in a portfolio plan
    api_response = api_instance.update_resource_pool_budget_amounts_for_portfolio_plan(portfolio_plan_id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ResourcePoolsApi->update_resource_pool_budget_amounts_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_plan_id** | **str**| Portfolio Plan id | 
 **body** | [**list[ResourcePoolBudgetAmountPatchItem]**](ResourcePoolBudgetAmountPatchItem.md)| JSON Patch Operations to update multiple resource pool budget amounts | 

### Return type

[**list[ResourcePool]**](ResourcePool.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

