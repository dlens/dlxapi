# dlxapi.PortfolioPlansApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_portfolio_plan_users**](PortfolioPlansApi.md#add_portfolio_plan_users) | **POST** /portfolioPlans/{id}/users | Add users to a portfolio plan.
[**apply_recommendations_for_portfolio_plan**](PortfolioPlansApi.md#apply_recommendations_for_portfolio_plan) | **POST** /portfolioPlans/{id}/recommendations | Apply recommendations of a portfolio plan.
[**calculate_for_portfolio_plan**](PortfolioPlansApi.md#calculate_for_portfolio_plan) | **PATCH** /portfolioPlans/{portfolioPlanId}/calculate | Calculate and update FieldValues or Budgets in a portfolio plan
[**create_portfolio_plan**](PortfolioPlansApi.md#create_portfolio_plan) | **POST** /portfolioPlans | Create a portfolio plan
[**create_portfolio_plan_with_recommendations**](PortfolioPlansApi.md#create_portfolio_plan_with_recommendations) | **POST** /portfolioPlans/{id}/createPortfolioPlanAndApplyRecommendations | Create a portfolio plan with applied recommendations
[**create_projects_in_portfolio_plan**](PortfolioPlansApi.md#create_projects_in_portfolio_plan) | **POST** /portfolioPlans/{id}/projects | Create new projects
[**create_projects_in_portfolio_plan_from_datahub**](PortfolioPlansApi.md#create_projects_in_portfolio_plan_from_datahub) | **POST** /portfolioPlans/{id}/datahub/projects | Create new projects via datahub-service
[**delete_portfolio_plan**](PortfolioPlansApi.md#delete_portfolio_plan) | **DELETE** /portfolioPlans/{id} | Deletes portfolio plan
[**export_portfolio_plan**](PortfolioPlansApi.md#export_portfolio_plan) | **POST** /portfolioPlans/{id}/export | Export portfolio plan
[**get_field_data_for_portfolio_plan**](PortfolioPlansApi.md#get_field_data_for_portfolio_plan) | **GET** /portfolioPlans/{id}/fieldData | Retrieves field data contained within a portfolio plan.
[**get_field_data_for_portfolio_plan_with_filter**](PortfolioPlansApi.md#get_field_data_for_portfolio_plan_with_filter) | **POST** /portfolioPlans/{id}/fieldData | Retrieves field data contained within a portfolio plan.
[**get_field_values_data_for_portfolio_plan**](PortfolioPlansApi.md#get_field_values_data_for_portfolio_plan) | **GET** /portfolioPlans/{portfolioPlanId}/data/{dataId} | Fetch field values data for portfolio plan and data id.
[**get_minified_projects_for_portfolio_plan**](PortfolioPlansApi.md#get_minified_projects_for_portfolio_plan) | **GET** /portfolioPlans/{id}/projects/minify | Retrieves minified projects contained within a portfolio plan.
[**get_minified_projects_with_filter**](PortfolioPlansApi.md#get_minified_projects_with_filter) | **POST** /portfolioPlans/{id}/projects/minify | Retrieves minified projects with filtered field values.
[**get_minified_projects_with_recommendations_applied**](PortfolioPlansApi.md#get_minified_projects_with_recommendations_applied) | **POST** /portfolioPlans/{id}/projects/minify/withRecommendationsApplied | Retrieves minified projects with filtered field values.
[**get_portfolio_plan**](PortfolioPlansApi.md#get_portfolio_plan) | **GET** /portfolioPlans/{id} | Retrieves portfolio plan
[**get_portfolio_plan_activities**](PortfolioPlansApi.md#get_portfolio_plan_activities) | **GET** /portfolioPlans/{id}/activities | Retrieves portfolio plan activities log.
[**get_portfolio_plan_users**](PortfolioPlansApi.md#get_portfolio_plan_users) | **GET** /portfolioPlans/{id}/users | Retrieves users in a portfolio plan.
[**get_portfolio_plans**](PortfolioPlansApi.md#get_portfolio_plans) | **GET** /portfolioPlans | Retrieves portfolio plans
[**get_project_details_for_portfolio_plan**](PortfolioPlansApi.md#get_project_details_for_portfolio_plan) | **GET** /portfolioPlans/{portfolioPlanId}/projects/{projectId} | Retrieves project contained within a portfolio plan.
[**get_project_portfolio_plans_for_portfolio_plan_and_portfolio**](PortfolioPlansApi.md#get_project_portfolio_plans_for_portfolio_plan_and_portfolio) | **POST** /portfolioPlans/{portfolioPlanId}/portfolios/{portfolioId}/projectPortfolioPlans | Retrieves projects for portfolio plan
[**get_projects_for_portfolio_plan**](PortfolioPlansApi.md#get_projects_for_portfolio_plan) | **GET** /portfolioPlans/{id}/projects | Retrieves projects contained within a portfolio plan. Possible expand paths - (items.fieldValues, contributingUserIds)
[**get_recommendations_for_portfolio_plan**](PortfolioPlansApi.md#get_recommendations_for_portfolio_plan) | **POST** /portfolioPlans/{id}/recommendations/retrieve | Retrieves recommendations for a portfolio plan.
[**get_schedule_for_portfolio_plan**](PortfolioPlansApi.md#get_schedule_for_portfolio_plan) | **GET** /portfolioPlans/{id}/schedule | Retrieves schedule for portfolio plan. The schedule is stored in a new portfolio plan.
[**reassign_cost**](PortfolioPlansApi.md#reassign_cost) | **POST** /portfolioPlans/{portfolioPlanId}/reassignCost | add field values for the cost field that should be assigned, and remove all field values for cost field that is the source, for the supplied project
[**rebaseline_portfolio_plan**](PortfolioPlansApi.md#rebaseline_portfolio_plan) | **POST** /portfolioPlans/{id}/rebaseline | Rebaseline a portfolio plan.
[**save_activity_attachments**](PortfolioPlansApi.md#save_activity_attachments) | **POST** /portfolioPlans/{planId}/activities/{activityId}/attachments | Save activity attachments
[**save_activity_note**](PortfolioPlansApi.md#save_activity_note) | **POST** /portfolioPlans/{planId}/activities/{activityId}/notes | Add or edit activity note
[**update_portfolio_plan**](PortfolioPlansApi.md#update_portfolio_plan) | **PATCH** /portfolioPlans/{id} | Updates a portfolio plan utilizing JSON Patch Operations. 
[**update_portfolio_plan_field_values**](PortfolioPlansApi.md#update_portfolio_plan_field_values) | **PATCH** /portfolioPlans/{id}/fieldValues | Update field values in a portfolio plan
[**update_portfolio_plan_field_values_from_datahub**](PortfolioPlansApi.md#update_portfolio_plan_field_values_from_datahub) | **PATCH** /portfolioPlans/{id}/datahub/fieldValues | Update field values in a portfolio plan via datahub-service
[**update_portfolio_plan_users_for_portfolio_plan**](PortfolioPlansApi.md#update_portfolio_plan_users_for_portfolio_plan) | **PATCH** /portfolioPlans/{id}/users | Update users in a portfolio plan
[**value_insights_after_recommendations**](PortfolioPlansApi.md#value_insights_after_recommendations) | **POST** /portfolioPlans/{portfolioPlanId}/insights/valueAfterRecommendations | Get value insights after recommendations applied

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
> list[FieldValue] apply_recommendations_for_portfolio_plan(body, id)

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
body = [dlxapi.Recommendation()] # list[Recommendation] | JSON Recommendation Objects to apply to a portfolio plan.
id = 'id_example' # str | Portfolio plan id

try:
    # Apply recommendations of a portfolio plan.
    api_response = api_instance.apply_recommendations_for_portfolio_plan(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->apply_recommendations_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[Recommendation]**](Recommendation.md)| JSON Recommendation Objects to apply to a portfolio plan. | 
 **id** | **str**| Portfolio plan id | 

### Return type

[**list[FieldValue]**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calculate_for_portfolio_plan**
> CalculatedValues calculate_for_portfolio_plan(body, portfolio_plan_id)

Calculate and update FieldValues or Budgets in a portfolio plan

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
body = dlxapi.CalculatePatchItems() # CalculatePatchItems | JSON Patch Operations to update multiple field values.
portfolio_plan_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Portfolio plan id

try:
    # Calculate and update FieldValues or Budgets in a portfolio plan
    api_response = api_instance.calculate_for_portfolio_plan(body, portfolio_plan_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->calculate_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CalculatePatchItems**](CalculatePatchItems.md)| JSON Patch Operations to update multiple field values. | 
 **portfolio_plan_id** | [**str**](.md)| Portfolio plan id | 

### Return type

[**CalculatedValues**](CalculatedValues.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
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

# **create_portfolio_plan_with_recommendations**
> PortfolioPlan create_portfolio_plan_with_recommendations(body, id, start_date=start_date, end_date=end_date, tolerance=tolerance, plan_type=plan_type, expand=expand, improve_on_cost=improve_on_cost)

Create a portfolio plan with applied recommendations

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
body = dlxapi.RecommendationRequest() # RecommendationRequest | portfolio plan
id = 'id_example' # str | portfolio plan id
start_date = 789 # int | Start time period for the time horizon. (optional)
end_date = 789 # int | End time period for the time horizon. (optional)
tolerance = 56 # int | Percentage tolerance to apply to the budgets (optional)
plan_type = 'plan_type_example' # str | Plan type (optional)
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)
improve_on_cost = true # bool | Improve or not on cost (optional)

try:
    # Create a portfolio plan with applied recommendations
    api_response = api_instance.create_portfolio_plan_with_recommendations(body, id, start_date=start_date, end_date=end_date, tolerance=tolerance, plan_type=plan_type, expand=expand, improve_on_cost=improve_on_cost)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->create_portfolio_plan_with_recommendations: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecommendationRequest**](RecommendationRequest.md)| portfolio plan | 
 **id** | **str**| portfolio plan id | 
 **start_date** | **int**| Start time period for the time horizon. | [optional] 
 **end_date** | **int**| End time period for the time horizon. | [optional] 
 **tolerance** | **int**| Percentage tolerance to apply to the budgets | [optional] 
 **plan_type** | **str**| Plan type | [optional] 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **improve_on_cost** | **bool**| Improve or not on cost | [optional] 

### Return type

[**PortfolioPlan**](PortfolioPlan.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_projects_in_portfolio_plan**
> list[Project] create_projects_in_portfolio_plan(body, id, do_not_expand=do_not_expand)

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
body = [dlxapi.Project()] # list[Project] | Projects to create
id = 'id_example' # str | Portfolio plan id
do_not_expand = false # bool | Whether to return collections for each project in the response. Default is to return saved field values. (optional) (default to false)

try:
    # Create new projects
    api_response = api_instance.create_projects_in_portfolio_plan(body, id, do_not_expand=do_not_expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->create_projects_in_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[Project]**](Project.md)| Projects to create | 
 **id** | **str**| Portfolio plan id | 
 **do_not_expand** | **bool**| Whether to return collections for each project in the response. Default is to return saved field values. | [optional] [default to false]

### Return type

[**list[Project]**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_projects_in_portfolio_plan_from_datahub**
> list[Project] create_projects_in_portfolio_plan_from_datahub(project_file, id, do_not_expand=do_not_expand, source_portfolio_id=source_portfolio_id)

Create new projects via datahub-service

This endpoint is specifically for datahub-service to create new projects. It automatically publishes ProjectsCopiedEvent after successful update.

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
project_file = 'project_file_example' # str | 
id = 'id_example' # str | Portfolio plan id
do_not_expand = false # bool | Whether to return collections for each project in the response. Default is to return saved field values. (optional) (default to false)
source_portfolio_id = 'source_portfolio_id_example' # str | Portfolio ID from where projects were copied (optional)

try:
    # Create new projects via datahub-service
    api_response = api_instance.create_projects_in_portfolio_plan_from_datahub(project_file, id, do_not_expand=do_not_expand, source_portfolio_id=source_portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->create_projects_in_portfolio_plan_from_datahub: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_file** | **str**|  | 
 **id** | **str**| Portfolio plan id | 
 **do_not_expand** | **bool**| Whether to return collections for each project in the response. Default is to return saved field values. | [optional] [default to false]
 **source_portfolio_id** | **str**| Portfolio ID from where projects were copied | [optional] 

### Return type

[**list[Project]**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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
> str export_portfolio_plan(export_type, export_format, id, body=body)

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
export_type = 'export_type_example' # str | export type (PROJECT, SCHEDULE, SPEND_PLAN)
export_format = 'export_format_example' # str | export format type (XLSX)
id = 'id_example' # str | portfolio plan id
body = dlxapi.ExportConfig() # ExportConfig | export configuration object (optional)

try:
    # Export portfolio plan
    api_response = api_instance.export_portfolio_plan(export_type, export_format, id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->export_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **export_type** | **str**| export type (PROJECT, SCHEDULE, SPEND_PLAN) | 
 **export_format** | **str**| export format type (XLSX) | 
 **id** | **str**| portfolio plan id | 
 **body** | [**ExportConfig**](ExportConfig.md)| export configuration object | [optional] 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_field_data_for_portfolio_plan**
> FieldDatas get_field_data_for_portfolio_plan(id)

Retrieves field data contained within a portfolio plan.

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
    # Retrieves field data contained within a portfolio plan.
    api_response = api_instance.get_field_data_for_portfolio_plan(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_field_data_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio plan id | 

### Return type

[**FieldDatas**](FieldDatas.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_field_data_for_portfolio_plan_with_filter**
> FieldDatas get_field_data_for_portfolio_plan_with_filter(id, body=body)

Retrieves field data contained within a portfolio plan.

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
body = dlxapi.FieldDataFilter() # FieldDataFilter | Filter (optional)

try:
    # Retrieves field data contained within a portfolio plan.
    api_response = api_instance.get_field_data_for_portfolio_plan_with_filter(id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_field_data_for_portfolio_plan_with_filter: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio plan id | 
 **body** | [**FieldDataFilter**](FieldDataFilter.md)| Filter | [optional] 

### Return type

[**FieldDatas**](FieldDatas.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_field_values_data_for_portfolio_plan**
> list[FieldValue] get_field_values_data_for_portfolio_plan(portfolio_plan_id, data_id)

Fetch field values data for portfolio plan and data id.

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
portfolio_plan_id = 'portfolio_plan_id_example' # str | Portfolio plan ID
data_id = 'data_id_example' # str | Data ID

try:
    # Fetch field values data for portfolio plan and data id.
    api_response = api_instance.get_field_values_data_for_portfolio_plan(portfolio_plan_id, data_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_field_values_data_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_plan_id** | **str**| Portfolio plan ID | 
 **data_id** | **str**| Data ID | 

### Return type

[**list[FieldValue]**](FieldValue.md)

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
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#x27;-&#x27; in front of expression for reverse order. | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**MinifiedProjects**](MinifiedProjects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_minified_projects_with_filter**
> MinifiedProjects get_minified_projects_with_filter(id, body=body, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)

Retrieves minified projects with filtered field values.

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
body = dlxapi.ProjectFilter() # ProjectFilter | project filter (optional)
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Retrieves minified projects with filtered field values.
    api_response = api_instance.get_minified_projects_with_filter(id, body=body, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_minified_projects_with_filter: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio plan id | 
 **body** | [**ProjectFilter**](ProjectFilter.md)| project filter | [optional] 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#x27;-&#x27; in front of expression for reverse order. | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**MinifiedProjects**](MinifiedProjects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_minified_projects_with_recommendations_applied**
> MinifiedProjects get_minified_projects_with_recommendations_applied(id, body=body, expand=expand)

Retrieves minified projects with filtered field values.

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
body = dlxapi.ProjectDataWithRecommendationsRequest() # ProjectDataWithRecommendationsRequest | project filter (optional)
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Retrieves minified projects with filtered field values.
    api_response = api_instance.get_minified_projects_with_recommendations_applied(id, body=body, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_minified_projects_with_recommendations_applied: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio plan id | 
 **body** | [**ProjectDataWithRecommendationsRequest**](ProjectDataWithRecommendationsRequest.md)| project filter | [optional] 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**MinifiedProjects**](MinifiedProjects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
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
> Activities get_portfolio_plan_activities(id, project_id=project_id, limit=limit, offset=offset, match=match, only_with_note=only_with_note)

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
only_with_note = true # bool | Filter activities with notes (optional)

try:
    # Retrieves portfolio plan activities log.
    api_response = api_instance.get_portfolio_plan_activities(id, project_id=project_id, limit=limit, offset=offset, match=match, only_with_note=only_with_note)
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
 **only_with_note** | **bool**| Filter activities with notes | [optional] 

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
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#x27;-&#x27; in front of expression for reverse order. | [optional] 
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
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#x27;-&#x27; in front of expression for reverse order. | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**PortfolioPlans**](PortfolioPlans.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_details_for_portfolio_plan**
> Project get_project_details_for_portfolio_plan(portfolio_plan_id, project_id)

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
    api_response = api_instance.get_project_details_for_portfolio_plan(portfolio_plan_id, project_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_project_details_for_portfolio_plan: %s\n" % e)
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
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#x27;-&#x27; in front of expression for reverse order. | [optional] 
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
> Recommendations get_recommendations_for_portfolio_plan(id, body=body, start_date=start_date, end_date=end_date, tolerance=tolerance, plan_type=plan_type, improve_on_cost=improve_on_cost)

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
body = dlxapi.RecommendationRequest() # RecommendationRequest | Field and project ids (optional)
start_date = 789 # int | Start time period for the time horizon. (optional)
end_date = 789 # int | End time period for the time horizon. (optional)
tolerance = 56 # int | Percentage tolerance to apply to the budgets (optional)
plan_type = 'plan_type_example' # str | Plan type (optional)
improve_on_cost = true # bool | Improve or not on cost (optional)

try:
    # Retrieves recommendations for a portfolio plan.
    api_response = api_instance.get_recommendations_for_portfolio_plan(id, body=body, start_date=start_date, end_date=end_date, tolerance=tolerance, plan_type=plan_type, improve_on_cost=improve_on_cost)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->get_recommendations_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio plan id | 
 **body** | [**RecommendationRequest**](RecommendationRequest.md)| Field and project ids | [optional] 
 **start_date** | **int**| Start time period for the time horizon. | [optional] 
 **end_date** | **int**| End time period for the time horizon. | [optional] 
 **tolerance** | **int**| Percentage tolerance to apply to the budgets | [optional] 
 **plan_type** | **str**| Plan type | [optional] 
 **improve_on_cost** | **bool**| Improve or not on cost | [optional] 

### Return type

[**Recommendations**](Recommendations.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
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
scheduling_criteria = 'scheduling_criteria_example' # str | Criteria used to function to evaluate different schedules. Defaults to TimePeriodOverBudgetPercent (optional)

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
 **scheduling_criteria** | **str**| Criteria used to function to evaluate different schedules. Defaults to TimePeriodOverBudgetPercent | [optional] 

### Return type

[**Recommendations**](Recommendations.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reassign_cost**
> list[FieldValue] reassign_cost(body, portfolio_plan_id)

add field values for the cost field that should be assigned, and remove all field values for cost field that is the source, for the supplied project

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
body = dlxapi.ReassignCostRequest() # ReassignCostRequest | Cost field to add, cost field to remove
portfolio_plan_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | PortfolioPlan Id

try:
    # add field values for the cost field that should be assigned, and remove all field values for cost field that is the source, for the supplied project
    api_response = api_instance.reassign_cost(body, portfolio_plan_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->reassign_cost: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReassignCostRequest**](ReassignCostRequest.md)| Cost field to add, cost field to remove | 
 **portfolio_plan_id** | [**str**](.md)| PortfolioPlan Id | 

### Return type

[**list[FieldValue]**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
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

# **save_activity_attachments**
> ActivityAttachment save_activity_attachments(body, plan_id, activity_id)

Save activity attachments

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
body = dlxapi.ActivityAttachment() # ActivityAttachment | attachments
plan_id = 'plan_id_example' # str | Portfolio plan id
activity_id = 'activity_id_example' # str | Activity id

try:
    # Save activity attachments
    api_response = api_instance.save_activity_attachments(body, plan_id, activity_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->save_activity_attachments: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ActivityAttachment**](ActivityAttachment.md)| attachments | 
 **plan_id** | **str**| Portfolio plan id | 
 **activity_id** | **str**| Activity id | 

### Return type

[**ActivityAttachment**](ActivityAttachment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_activity_note**
> ActivityNote save_activity_note(body, plan_id, activity_id)

Add or edit activity note

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
body = dlxapi.ActivityNote() # ActivityNote | note
plan_id = 'plan_id_example' # str | Portfolio plan id
activity_id = 'activity_id_example' # str | Activity id

try:
    # Add or edit activity note
    api_response = api_instance.save_activity_note(body, plan_id, activity_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->save_activity_note: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ActivityNote**](ActivityNote.md)| note | 
 **plan_id** | **str**| Portfolio plan id | 
 **activity_id** | **str**| Activity id | 

### Return type

[**ActivityNote**](ActivityNote.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_plan**
> PortfolioPlan update_portfolio_plan(body, id, expand=expand)

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
body = dlxapi.Operations() # Operations | JSON Patch Operations to update portfolio plan.
id = 'id_example' # str | PortfolioPlan id
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Updates a portfolio plan utilizing JSON Patch Operations. 
    api_response = api_instance.update_portfolio_plan(body, id, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->update_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update portfolio plan. | 
 **id** | **str**| PortfolioPlan id | 
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
> list[FieldValue] update_portfolio_plan_field_values(body, id, apply_rank=apply_rank, preserve_project_access=preserve_project_access, group_activities=group_activities, expand=expand)

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
body = [dlxapi.FieldValuePatchItem()] # list[FieldValuePatchItem] | JSON Patch Operations to update multiple field values.
id = 'id_example' # str | Portfolio plan id
apply_rank = true # bool | Whether the update signifies an Apply Rank action. (optional)
preserve_project_access = true # bool | Making sure projects access is retained in case that the current change would affect permissions (optional)
group_activities = true # bool | Whether to group activities, for example if recommendations were applied (optional)
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Update field values in a portfolio plan
    api_response = api_instance.update_portfolio_plan_field_values(body, id, apply_rank=apply_rank, preserve_project_access=preserve_project_access, group_activities=group_activities, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->update_portfolio_plan_field_values: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[FieldValuePatchItem]**](FieldValuePatchItem.md)| JSON Patch Operations to update multiple field values. | 
 **id** | **str**| Portfolio plan id | 
 **apply_rank** | **bool**| Whether the update signifies an Apply Rank action. | [optional] 
 **preserve_project_access** | **bool**| Making sure projects access is retained in case that the current change would affect permissions | [optional] 
 **group_activities** | **bool**| Whether to group activities, for example if recommendations were applied | [optional] 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**list[FieldValue]**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_plan_field_values_from_datahub**
> list[FieldValue] update_portfolio_plan_field_values_from_datahub(body, id, source_portfolio_id=source_portfolio_id)

Update field values in a portfolio plan via datahub-service

This endpoint is specifically for datahub-service to update field values. It automatically publishes PortfolioPlanDataFieldValuesSyncedEvent after successful update.

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
body = [dlxapi.FieldValuePatchItem()] # list[FieldValuePatchItem] | JSON Patch Operations to update multiple field values.
id = 'id_example' # str | Portfolio plan id
source_portfolio_id = 'source_portfolio_id_example' # str | Portfolio ID from where field values were updated (optional)

try:
    # Update field values in a portfolio plan via datahub-service
    api_response = api_instance.update_portfolio_plan_field_values_from_datahub(body, id, source_portfolio_id=source_portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->update_portfolio_plan_field_values_from_datahub: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[FieldValuePatchItem]**](FieldValuePatchItem.md)| JSON Patch Operations to update multiple field values. | 
 **id** | **str**| Portfolio plan id | 
 **source_portfolio_id** | **str**| Portfolio ID from where field values were updated | [optional] 

### Return type

[**list[FieldValue]**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_plan_users_for_portfolio_plan**
> list[PortfolioPlanUser] update_portfolio_plan_users_for_portfolio_plan(body, id)

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
body = [dlxapi.PatchItem()] # list[PatchItem] | JSON Patch Operations to update multiple portfolio plan users.
id = 'id_example' # str | Portfolio plan id

try:
    # Update users in a portfolio plan
    api_response = api_instance.update_portfolio_plan_users_for_portfolio_plan(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->update_portfolio_plan_users_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[PatchItem]**](PatchItem.md)| JSON Patch Operations to update multiple portfolio plan users. | 
 **id** | **str**| Portfolio plan id | 

### Return type

[**list[PortfolioPlanUser]**](PortfolioPlanUser.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **value_insights_after_recommendations**
> list[FieldInsight] value_insights_after_recommendations(body, portfolio_plan_id, start_date=start_date, end_date=end_date)

Get value insights after recommendations applied

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
body = dlxapi.ProjectDataWithRecommendationsRequest() # ProjectDataWithRecommendationsRequest | JSON Recommendation Objects to apply to a portfolio plan and filtered projectIds
portfolio_plan_id = 'portfolio_plan_id_example' # str | Portfolio plan ID
start_date = 789 # int | Start time period for which the grades are computed for. (optional)
end_date = 789 # int | End time period for which the grades are computed for. (optional)

try:
    # Get value insights after recommendations applied
    api_response = api_instance.value_insights_after_recommendations(body, portfolio_plan_id, start_date=start_date, end_date=end_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlansApi->value_insights_after_recommendations: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectDataWithRecommendationsRequest**](ProjectDataWithRecommendationsRequest.md)| JSON Recommendation Objects to apply to a portfolio plan and filtered projectIds | 
 **portfolio_plan_id** | **str**| Portfolio plan ID | 
 **start_date** | **int**| Start time period for which the grades are computed for. | [optional] 
 **end_date** | **int**| End time period for which the grades are computed for. | [optional] 

### Return type

[**list[FieldInsight]**](FieldInsight.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

