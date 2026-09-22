# dlxapi.BudgetsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_budget**](BudgetsApi.md#get_budget) | **GET** /budgets/{id} | Retrieves a budget.
[**get_budgets_for_portfolio_plan**](BudgetsApi.md#get_budgets_for_portfolio_plan) | **GET** /budgets | Fetch budgets for portfolio plan
[**get_budgets_for_portfolio_plan_and_recommendations**](BudgetsApi.md#get_budgets_for_portfolio_plan_and_recommendations) | **POST** /budgets/recommendations | Get budgets for portfolio plan with recommendations
[**update_budget_amounts_for_portfolio_plan**](BudgetsApi.md#update_budget_amounts_for_portfolio_plan) | **PATCH** /budgets | Update budget amounts in a portfolio plan

# **get_budget**
> Budget get_budget(id, portfolio_plan_id=portfolio_plan_id)

Retrieves a budget.

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
api_instance = dlxapi.BudgetsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Budget id
portfolio_plan_id = 'portfolio_plan_id_example' # str | Portfolio Plan id (optional)

try:
    # Retrieves a budget.
    api_response = api_instance.get_budget(id, portfolio_plan_id=portfolio_plan_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BudgetsApi->get_budget: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Budget id | 
 **portfolio_plan_id** | **str**| Portfolio Plan id | [optional] 

### Return type

[**Budget**](Budget.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_budgets_for_portfolio_plan**
> Budgets get_budgets_for_portfolio_plan(portfolio_plan_id, plan_overrides_only=plan_overrides_only, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)

Fetch budgets for portfolio plan

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
api_instance = dlxapi.BudgetsApi(dlxapi.ApiClient(configuration))
portfolio_plan_id = 'portfolio_plan_id_example' # str | Portfolio Plan id
plan_overrides_only = false # bool | Returns only plan overrides. default is false. (optional) (default to false)
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Fetch budgets for portfolio plan
    api_response = api_instance.get_budgets_for_portfolio_plan(portfolio_plan_id, plan_overrides_only=plan_overrides_only, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BudgetsApi->get_budgets_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_plan_id** | **str**| Portfolio Plan id | 
 **plan_overrides_only** | **bool**| Returns only plan overrides. default is false. | [optional] [default to false]
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#x27;-&#x27; in front of expression for reverse order. | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**Budgets**](Budgets.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_budgets_for_portfolio_plan_and_recommendations**
> Budgets get_budgets_for_portfolio_plan_and_recommendations(body, portfolio_plan_id)

Get budgets for portfolio plan with recommendations

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
api_instance = dlxapi.BudgetsApi(dlxapi.ApiClient(configuration))
body = [dlxapi.Recommendation()] # list[Recommendation] | JSON Recommendation Objects to apply to a portfolio plan.
portfolio_plan_id = 'portfolio_plan_id_example' # str | portfolio plan id

try:
    # Get budgets for portfolio plan with recommendations
    api_response = api_instance.get_budgets_for_portfolio_plan_and_recommendations(body, portfolio_plan_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BudgetsApi->get_budgets_for_portfolio_plan_and_recommendations: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[Recommendation]**](Recommendation.md)| JSON Recommendation Objects to apply to a portfolio plan. | 
 **portfolio_plan_id** | **str**| portfolio plan id | 

### Return type

[**Budgets**](Budgets.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_budget_amounts_for_portfolio_plan**
> list[Budget] update_budget_amounts_for_portfolio_plan(body, portfolio_plan_id)

Update budget amounts in a portfolio plan

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
api_instance = dlxapi.BudgetsApi(dlxapi.ApiClient(configuration))
body = [dlxapi.BudgetAmountPatchItem()] # list[BudgetAmountPatchItem] | JSON Patch Operations to update multiple budget amounts
portfolio_plan_id = 'portfolio_plan_id_example' # str | Portfolio Plan id

try:
    # Update budget amounts in a portfolio plan
    api_response = api_instance.update_budget_amounts_for_portfolio_plan(body, portfolio_plan_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BudgetsApi->update_budget_amounts_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[BudgetAmountPatchItem]**](BudgetAmountPatchItem.md)| JSON Patch Operations to update multiple budget amounts | 
 **portfolio_plan_id** | **str**| Portfolio Plan id | 

### Return type

[**list[Budget]**](Budget.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

