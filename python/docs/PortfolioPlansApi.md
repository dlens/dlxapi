# swagger_client.PortfolioPlansApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_portfolio_plan_users**](PortfolioPlansApi.md#add_portfolio_plan_users) | **POST** /portfolioPlans/{id}/users | Add users to a portfolio plan.
[**apply_recommendations_for_portfolio_plan**](PortfolioPlansApi.md#apply_recommendations_for_portfolio_plan) | **POST** /portfolioPlans/{id}/recommendations | Apply recommendations of a portfolio plan.
[**create_portfolio_plan**](PortfolioPlansApi.md#create_portfolio_plan) | **POST** /portfolioPlans | Create a portfolio plan
[**create_projects_in_portfolio_plan**](PortfolioPlansApi.md#create_projects_in_portfolio_plan) | **POST** /portfolioPlans/{id}/projects | Create new projects
[**delete_portfolio_plan**](PortfolioPlansApi.md#delete_portfolio_plan) | **DELETE** /portfolioPlans/{id} | Deletes portfolio plan
[**export_portfolio_plan**](PortfolioPlansApi.md#export_portfolio_plan) | **GET** /portfolioPlans/{id}/export | Export portfolio plan
[**get_budget_allocations_for_portfolio_plan**](PortfolioPlansApi.md#get_budget_allocations_for_portfolio_plan) | **GET** /portfolioPlans/{id}/budgetAllocations | Retrieves budget allocations for a portfolio plan.
[**get_minified_projects_for_portfolio_plan**](PortfolioPlansApi.md#get_minified_projects_for_portfolio_plan) | **GET** /portfolioPlans/{id}/projects/minify | Retrieves minified projects contained within a portfolio plan.
[**get_portfolio_plan**](PortfolioPlansApi.md#get_portfolio_plan) | **GET** /portfolioPlans/{id} | Retrieves portfolio plan
[**get_portfolio_plan_activities**](PortfolioPlansApi.md#get_portfolio_plan_activities) | **GET** /portfolioPlans/{id}/activities | Retrieves portfolio plan activities log.
[**get_portfolio_plan_users**](PortfolioPlansApi.md#get_portfolio_plan_users) | **GET** /portfolioPlans/{id}/users | Retrieves users in a portfolio plan.
[**get_portfolio_plans**](PortfolioPlansApi.md#get_portfolio_plans) | **GET** /portfolioPlans | Retrieves portfolio plans
[**get_project_for_portfolio_plan**](PortfolioPlansApi.md#get_project_for_portfolio_plan) | **GET** /portfolioPlans/{portfolioPlanId}/projects/{projectId} | Retrieves project contained within a portfolio plan.
[**get_project_portfolio_plans_for_portfolio_plan_and_portfolio**](PortfolioPlansApi.md#get_project_portfolio_plans_for_portfolio_plan_and_portfolio) | **POST** /portfolioPlans/{portfolioPlanId}/portfolios/{portfolioId}/projectPortfolioPlans | Retrieves projects for portfolio plan
[**get_projects_for_portfolio_plan**](PortfolioPlansApi.md#get_projects_for_portfolio_plan) | **GET** /portfolioPlans/{id}/projects | Retrieves projects contained within a portfolio plan. Possible expand paths - (items.fieldValues, contributingUserIds)
[**get_recommendations_for_portfolio_plan**](PortfolioPlansApi.md#get_recommendations_for_portfolio_plan) | **GET** /portfolioPlans/{id}/recommendations | Retrieves recommendations for a portfolio plan.
[**get_schedule_for_portfolio_plan**](PortfolioPlansApi.md#get_schedule_for_portfolio_plan) | **GET** /portfolioPlans/{id}/schedule | Retrieves schedule for portfolio plan. The schedule is stored in a new portfolio plan.
[**rebaseline_portfolio_plan**](PortfolioPlansApi.md#rebaseline_portfolio_plan) | **POST** /portfolioPlans/{id}/rebaseline | Rebaseline a portfolio plan.
[**update_portfolio_plan**](PortfolioPlansApi.md#update_portfolio_plan) | **PATCH** /portfolioPlans/{id} | Updates a portfolio plan utilizing JSON Patch Operations. 
[**update_portfolio_plan_field_values**](PortfolioPlansApi.md#update_portfolio_plan_field_values) | **PATCH** /portfolioPlans/{id}/fieldValues | Update field values in a portfolio plan
[**update_portfolio_plan_users**](PortfolioPlansApi.md#update_portfolio_plan_users) | **PATCH** /portfolioPlans/{id}/users | Update users in a portfolio plan


# **add_portfolio_plan_users**
> list[PortfolioPlanUser] add_portfolio_plan_users(id, body=body)

Add users to a portfolio plan.

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio plan id
body = dlxapi.AddUsersRequest() # AddUsersRequest | Email ids and personal message (optional)

try:
    # Add users to a portfolio plan.
    api_response = api_instance.add_portfolio_plan_users(id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->add_portfolio_plan_users: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio plan id | 
 **body** | [**AddUsersRequest**](AddUsersRequest.md)| Email ids and personal message | [optional] 

### Return type

[**list[PortfolioPlanUser]**](PortfolioPlanUser.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **apply_recommendations_for_portfolio_plan**
> list[FieldValue] apply_recommendations_for_portfolio_plan(id, body)

Apply recommendations of a portfolio plan.

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio plan id
body = [dlxapi.Recommendation()] # list[Recommendation] | JSON Recommendation Objects to apply to a portfolio plan.

try:
    # Apply recommendations of a portfolio plan.
    api_response = api_instance.apply_recommendations_for_portfolio_plan(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->apply_recommendations_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio plan id | 
 **body** | [**list[Recommendation]**](Recommendation.md)| JSON Recommendation Objects to apply to a portfolio plan. | 

### Return type

[**list[FieldValue]**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_portfolio_plan**
> PortfolioPlan create_portfolio_plan(body, expand=expand)

Create a portfolio plan

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
body = dlxapi.PortfolioPlan() # PortfolioPlan | portfolio plan
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Create a portfolio plan
    api_response = api_instance.create_portfolio_plan(body, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->create_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PortfolioPlan**](PortfolioPlan.md)| portfolio plan | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**PortfolioPlan**](PortfolioPlan.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_projects_in_portfolio_plan**
> list[Project] create_projects_in_portfolio_plan(id, body, do_not_expand=do_not_expand)

Create new projects

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio plan id
body = [dlxapi.Project()] # list[Project] | Projects to create
do_not_expand = false # bool | Whether to return collections for each project in the response. Default is to return saved field values. (optional) (default to false)

try:
    # Create new projects
    api_response = api_instance.create_projects_in_portfolio_plan(id, body, do_not_expand=do_not_expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->create_projects_in_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio plan id | 
 **body** | [**list[Project]**](Project.md)| Projects to create | 
 **do_not_expand** | **bool**| Whether to return collections for each project in the response. Default is to return saved field values. | [optional] [default to false]

### Return type

[**list[Project]**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_portfolio_plan**
> delete_portfolio_plan(id)

Deletes portfolio plan

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | portfolio plan id

try:
    # Deletes portfolio plan
    api_instance.delete_portfolio_plan(id)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->delete_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| portfolio plan id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **export_portfolio_plan**
> str export_portfolio_plan(id, export_type, export_format)

Export portfolio plan

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | portfolio plan id
export_type = NULL # object | export type (PROJECT, SCHEDULE)
export_format = NULL # object | export format type (XLSX)

try:
    # Export portfolio plan
    api_response = api_instance.export_portfolio_plan(id, export_type, export_format)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->export_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| portfolio plan id | 
 **export_type** | [**object**](.md)| export type (PROJECT, SCHEDULE) | 
 **export_format** | [**object**](.md)| export format type (XLSX) | 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_budget_allocations_for_portfolio_plan**
> BudgetAllocations get_budget_allocations_for_portfolio_plan(id, start_time=start_time, end_time=end_time)

Retrieves budget allocations for a portfolio plan.

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio plan id
start_time = 789 # int | Start time for the requested data (optional)
end_time = 789 # int | End time for the requested data (optional)

try:
    # Retrieves budget allocations for a portfolio plan.
    api_response = api_instance.get_budget_allocations_for_portfolio_plan(id, start_time=start_time, end_time=end_time)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_budget_allocations_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio plan id | 
 **start_time** | **int**| Start time for the requested data | [optional] 
 **end_time** | **int**| End time for the requested data | [optional] 

### Return type

[**BudgetAllocations**](BudgetAllocations.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_minified_projects_for_portfolio_plan**
> MinifiedProjects get_minified_projects_for_portfolio_plan(id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)

Retrieves minified projects contained within a portfolio plan.

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio plan id
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Retrieves minified projects contained within a portfolio plan.
    api_response = api_instance.get_minified_projects_for_portfolio_plan(id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_minified_projects_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio plan id | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**MinifiedProjects**](MinifiedProjects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_plan**
> PortfolioPlan get_portfolio_plan(id, expand=expand)

Retrieves portfolio plan

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | portfolio plan id
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Retrieves portfolio plan
    api_response = api_instance.get_portfolio_plan(id, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| portfolio plan id | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**PortfolioPlan**](PortfolioPlan.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_plan_activities**
> Activities get_portfolio_plan_activities(id, project_id=project_id, limit=limit, offset=offset, match=match)

Retrieves portfolio plan activities log.

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio plan id
project_id = 'project_id_example' # str | Use when you want to filter activities for a specific project (optional)
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Retrieves portfolio plan activities log.
    api_response = api_instance.get_portfolio_plan_activities(id, project_id=project_id, limit=limit, offset=offset, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_portfolio_plan_activities: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio plan id | 
 **project_id** | **str**| Use when you want to filter activities for a specific project | [optional] 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**Activities**](Activities.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_plan_users**
> PortfolioPlanUsers get_portfolio_plan_users(id, limit=limit, offset=offset, order_by=order_by, match=match)

Retrieves users in a portfolio plan.

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio plan id
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Retrieves users in a portfolio plan.
    api_response = api_instance.get_portfolio_plan_users(id, limit=limit, offset=offset, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_portfolio_plan_users: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio plan id | 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**PortfolioPlanUsers**](PortfolioPlanUsers.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_plans**
> PortfolioPlans get_portfolio_plans(portfolio_id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)

Retrieves portfolio plans

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | portfolio id
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Retrieves portfolio plans
    api_response = api_instance.get_portfolio_plans(portfolio_id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_portfolio_plans: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| portfolio id | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**PortfolioPlans**](PortfolioPlans.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_for_portfolio_plan**
> Project get_project_for_portfolio_plan(portfolio_plan_id, project_id)

Retrieves project contained within a portfolio plan.

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
portfolio_plan_id = 'portfolio_plan_id_example' # str | Portfolio plan id
project_id = 'project_id_example' # str | project id

try:
    # Retrieves project contained within a portfolio plan.
    api_response = api_instance.get_project_for_portfolio_plan(portfolio_plan_id, project_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_project_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_plan_id** | **str**| Portfolio plan id | 
 **project_id** | **str**| project id | 

### Return type

[**Project**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_portfolio_plans_for_portfolio_plan_and_portfolio**
> Projects get_project_portfolio_plans_for_portfolio_plan_and_portfolio(portfolio_id, portfolio_plan_id, position_from, position_to)

Retrieves projects for portfolio plan

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio id
portfolio_plan_id = 'portfolio_plan_id_example' # str | Portfolio Plan id
position_from = 56 # int | positionFrom for projects
position_to = 56 # int | positionTo for projects

try:
    # Retrieves projects for portfolio plan
    api_response = api_instance.get_project_portfolio_plans_for_portfolio_plan_and_portfolio(portfolio_id, portfolio_plan_id, position_from, position_to)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_project_portfolio_plans_for_portfolio_plan_and_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 
 **portfolio_plan_id** | **str**| Portfolio Plan id | 
 **position_from** | **int**| positionFrom for projects | 
 **position_to** | **int**| positionTo for projects | 

### Return type

[**Projects**](Projects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_projects_for_portfolio_plan**
> Projects get_projects_for_portfolio_plan(id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)

Retrieves projects contained within a portfolio plan. Possible expand paths - (items.fieldValues, contributingUserIds)

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio plan id
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Retrieves projects contained within a portfolio plan. Possible expand paths - (items.fieldValues, contributingUserIds)
    api_response = api_instance.get_projects_for_portfolio_plan(id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_projects_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio plan id | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**Projects**](Projects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_recommendations_for_portfolio_plan**
> Recommendations get_recommendations_for_portfolio_plan(id, start_date=start_date, end_date=end_date, plan_type=plan_type)

Retrieves recommendations for a portfolio plan.

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio plan id
start_date = 789 # int | Start time period for the time horizon. (optional)
end_date = 789 # int | End time period for the time horizon. (optional)
plan_type = OVERALL # object | Plan type (optional) (default to OVERALL)

try:
    # Retrieves recommendations for a portfolio plan.
    api_response = api_instance.get_recommendations_for_portfolio_plan(id, start_date=start_date, end_date=end_date, plan_type=plan_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_recommendations_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio plan id | 
 **start_date** | **int**| Start time period for the time horizon. | [optional] 
 **end_date** | **int**| End time period for the time horizon. | [optional] 
 **plan_type** | [**object**](.md)| Plan type | [optional] [default to OVERALL]

### Return type

[**Recommendations**](Recommendations.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_schedule_for_portfolio_plan**
> Recommendations get_schedule_for_portfolio_plan(id, start_date=start_date, end_date=end_date, tolerance_level_percentage=tolerance_level_percentage, scheduling_criteria=scheduling_criteria)

Retrieves schedule for portfolio plan. The schedule is stored in a new portfolio plan.

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio Plan id
start_date = 789 # int | Start time period for the time horizon. (optional)
end_date = 789 # int | End time period for the time horizon. (optional)
tolerance_level_percentage = 1.2 # float | Percentage parameter to allow scheduling values within a deviation, defined by [target*(1 - tolerance), target*(1 + tolerance] bounds. Value should be between 0 and 1. Defaults to 0.1 (optional)
scheduling_criteria = NULL # object | Criteria used to function to evaluate different schedules. Defaults to TimePeriodOverBudgetPercent (optional)

try:
    # Retrieves schedule for portfolio plan. The schedule is stored in a new portfolio plan.
    api_response = api_instance.get_schedule_for_portfolio_plan(id, start_date=start_date, end_date=end_date, tolerance_level_percentage=tolerance_level_percentage, scheduling_criteria=scheduling_criteria)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_schedule_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio Plan id | 
 **start_date** | **int**| Start time period for the time horizon. | [optional] 
 **end_date** | **int**| End time period for the time horizon. | [optional] 
 **tolerance_level_percentage** | **float**| Percentage parameter to allow scheduling values within a deviation, defined by [target*(1 - tolerance), target*(1 + tolerance] bounds. Value should be between 0 and 1. Defaults to 0.1 | [optional] 
 **scheduling_criteria** | [**object**](.md)| Criteria used to function to evaluate different schedules. Defaults to TimePeriodOverBudgetPercent | [optional] 

### Return type

[**Recommendations**](Recommendations.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **rebaseline_portfolio_plan**
> PortfolioPlan rebaseline_portfolio_plan(id)

Rebaseline a portfolio plan.

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio plan id

try:
    # Rebaseline a portfolio plan.
    api_response = api_instance.rebaseline_portfolio_plan(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->rebaseline_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio plan id | 

### Return type

[**PortfolioPlan**](PortfolioPlan.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_plan**
> PortfolioPlan update_portfolio_plan(id, body, expand=expand)

Updates a portfolio plan utilizing JSON Patch Operations. 

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | PortfolioPlan id
body = dlxapi.Operations() # Operations | JSON Patch Operations to update portfolio plan.
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Updates a portfolio plan utilizing JSON Patch Operations. 
    api_response = api_instance.update_portfolio_plan(id, body, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->update_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| PortfolioPlan id | 
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update portfolio plan. | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**PortfolioPlan**](PortfolioPlan.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_plan_field_values**
> list[FieldValue] update_portfolio_plan_field_values(id, body, expand=expand)

Update field values in a portfolio plan

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
id = NULL # object | Portfolio plan id
body = [dlxapi.FieldValuePatchItem()] # list[FieldValuePatchItem] | JSON Patch Operations to update multiple field values.
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Update field values in a portfolio plan
    api_response = api_instance.update_portfolio_plan_field_values(id, body, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->update_portfolio_plan_field_values: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**object**](.md)| Portfolio plan id | 
 **body** | [**list[FieldValuePatchItem]**](FieldValuePatchItem.md)| JSON Patch Operations to update multiple field values. | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**list[FieldValue]**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_plan_users**
> list[PortfolioPlanUser] update_portfolio_plan_users(id, body)

Update users in a portfolio plan

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
api_instance = dlxapi.PortfolioPlansApi(dlxapi.ApiClient(configuration))
id = NULL # object | Portfolio plan id
body = [dlxapi.PatchItem()] # list[PatchItem] | JSON Patch Operations to update multiple portfolio plan users.

try:
    # Update users in a portfolio plan
    api_response = api_instance.update_portfolio_plan_users(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->update_portfolio_plan_users: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**object**](.md)| Portfolio plan id | 
 **body** | [**list[PatchItem]**](PatchItem.md)| JSON Patch Operations to update multiple portfolio plan users. | 

### Return type

[**list[PortfolioPlanUser]**](PortfolioPlanUser.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

