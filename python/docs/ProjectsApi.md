# dlxapi.ProjectsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_and_delete_field_values_for_cost_fields**](ProjectsApi.md#add_and_delete_field_values_for_cost_fields) | **PATCH** /projects/{projectId}/addRemoveCosts | add field values for the cost fields, and remove all field values for cost fields, for the supplied project
[**add_contributing_users_for_project**](ProjectsApi.md#add_contributing_users_for_project) | **POST** /projects/{id}/users | Add users to a project.
[**copy_project**](ProjectsApi.md#copy_project) | **POST** /projects/{id}/copy | Creates a copy of the project, including portfolio data, dependencies, attachments
[**create_project**](ProjectsApi.md#create_project) | **POST** /projects | Creates a new project.
[**delete_field_values_for_project**](ProjectsApi.md#delete_field_values_for_project) | **DELETE** /projects/{id}/fieldValues | Deletes all field values for a certain fields for a particular project
[**delete_project**](ProjectsApi.md#delete_project) | **DELETE** /projects/{id} | Delete a project.
[**delete_projects**](ProjectsApi.md#delete_projects) | **POST** /projects/delete | Delete projects.
[**export_project_approval_report**](ProjectsApi.md#export_project_approval_report) | **GET** /projects/{id}/projectChanges/report | Exports an Excel (xlsx) approval history report for a project.
[**get_project**](ProjectsApi.md#get_project) | **GET** /projects/{id} | Retrieves a project.
[**get_project_changes_for_project**](ProjectsApi.md#get_project_changes_for_project) | **GET** /projects/{id}/projectChanges | Retrieves the approval history for a project.
[**get_project_for_portfolio_plan**](ProjectsApi.md#get_project_for_portfolio_plan) | **GET** /projects/{projectId}/portfolioPlan/{portfolioPlanId} | Retrieves a project for a portfolioPlan.
[**get_projects_data_for_portfolio**](ProjectsApi.md#get_projects_data_for_portfolio) | **GET** /projects/data | Fetch project data for portfolio and data id.
[**get_projects_for_portfolio**](ProjectsApi.md#get_projects_for_portfolio) | **GET** /projects | Retrieves projects contained within a portfolio. Possible expand paths are - (items.fieldValues, contributingUserIds)
[**get_projects_with_duplicate_values_for_field**](ProjectsApi.md#get_projects_with_duplicate_values_for_field) | **GET** /projects/duplicates | Get Projects with duplicate values for field
[**remove_contributing_users_from_project**](ProjectsApi.md#remove_contributing_users_from_project) | **DELETE** /projects/{id}/users | Remove contributing users from a project.
[**set_project_dependencies**](ProjectsApi.md#set_project_dependencies) | **PUT** /projects/{id}/dependencies | Adds or removes dependsOn and/or dependant linked projects to a project.

# **add_and_delete_field_values_for_cost_fields**
> list[FieldValue] add_and_delete_field_values_for_cost_fields(body, project_id, expand=expand)

add field values for the cost fields, and remove all field values for cost fields, for the supplied project

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
api_instance = dlxapi.ProjectsApi(dlxapi.ApiClient(configuration))
body = dlxapi.AddAndDeleteFieldValuesForFieldsRequest() # AddAndDeleteFieldValuesForFieldsRequest | TimePeriods & cost fields to add, cost fields to remove
project_id = 'project_id_example' # str | Project id
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # add field values for the cost fields, and remove all field values for cost fields, for the supplied project
    api_response = api_instance.add_and_delete_field_values_for_cost_fields(body, project_id, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsApi->add_and_delete_field_values_for_cost_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddAndDeleteFieldValuesForFieldsRequest**](AddAndDeleteFieldValuesForFieldsRequest.md)| TimePeriods &amp; cost fields to add, cost fields to remove | 
 **project_id** | **str**| Project id | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**list[FieldValue]**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **add_contributing_users_for_project**
> list[PortfolioPlanUser] add_contributing_users_for_project(id, body=body)

Add users to a project.

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
api_instance = dlxapi.ProjectsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | project id
body = dlxapi.AddUsersRequest() # AddUsersRequest | Email ids and personal message (optional)

try:
    # Add users to a project.
    api_response = api_instance.add_contributing_users_for_project(id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsApi->add_contributing_users_for_project: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| project id | 
 **body** | [**AddUsersRequest**](AddUsersRequest.md)| Email ids and personal message | [optional] 

### Return type

[**list[PortfolioPlanUser]**](PortfolioPlanUser.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **copy_project**
> Project copy_project(id)

Creates a copy of the project, including portfolio data, dependencies, attachments

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
api_instance = dlxapi.ProjectsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | project id

try:
    # Creates a copy of the project, including portfolio data, dependencies, attachments
    api_response = api_instance.copy_project(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsApi->copy_project: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| project id | 

### Return type

[**Project**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_project**
> Project create_project(body, portfolio_id)

Creates a new project.

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
api_instance = dlxapi.ProjectsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Project() # Project | Project to create
portfolio_id = 'portfolio_id_example' # str | Portfolio id

try:
    # Creates a new project.
    api_response = api_instance.create_project(body, portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsApi->create_project: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Project**](Project.md)| Project to create | 
 **portfolio_id** | **str**| Portfolio id | 

### Return type

[**Project**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_field_values_for_project**
> delete_field_values_for_project(id, field_ids)

Deletes all field values for a certain fields for a particular project

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
api_instance = dlxapi.ProjectsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | project id
field_ids = ['field_ids_example'] # list[str] | field ids

try:
    # Deletes all field values for a certain fields for a particular project
    api_instance.delete_field_values_for_project(id, field_ids)
except ApiException as e:
    print("Exception when calling ProjectsApi->delete_field_values_for_project: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| project id | 
 **field_ids** | [**list[str]**](str.md)| field ids | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_project**
> delete_project(id)

Delete a project.

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
api_instance = dlxapi.ProjectsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Project id

try:
    # Delete a project.
    api_instance.delete_project(id)
except ApiException as e:
    print("Exception when calling ProjectsApi->delete_project: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Project id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_projects**
> delete_projects(body)

Delete projects.

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
api_instance = dlxapi.ProjectsApi(dlxapi.ApiClient(configuration))
body = ['body_example'] # list[str] | Project ids

try:
    # Delete projects.
    api_instance.delete_projects(body)
except ApiException as e:
    print("Exception when calling ProjectsApi->delete_projects: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[str]**](str.md)| Project ids | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **export_project_approval_report**
> str export_project_approval_report(id, time_zone=time_zone)

Exports an Excel (xlsx) approval history report for a project.

The spreadsheet form of GET /projects/{id}/projectChanges — every ProjectChange recorded against the project, across all approval workflows and in every status, one row each with a Workflow column naming the workflow it belongs to.  Same authorization and the same field filtering as the read endpoint: project READ access, then narrowed to the fields the caller has EDIT access to. A caller with no field permissions downloads a report with no rows rather than being refused, so the export can never widen what the Approval History surface itself shows.  Always the full history — it is not narrowed by whatever search or filter the UI has applied, and the sheet carries an autofilter instead. 

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
api_instance = dlxapi.ProjectsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Project id
time_zone = 'time_zone_example' # str | IANA time zone id (e.g. America/New_York) the submitted/action timestamps are rendered in, so the report reads in the same local time the app shows. Defaults to UTC when omitted or unrecognized. Field DATE values stay UTC — a date-only value is stored as UTC midnight platform-wide, so shifting it would move the day. (optional)

try:
    # Exports an Excel (xlsx) approval history report for a project.
    api_response = api_instance.export_project_approval_report(id, time_zone=time_zone)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsApi->export_project_approval_report: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Project id | 
 **time_zone** | **str**| IANA time zone id (e.g. America/New_York) the submitted/action timestamps are rendered in, so the report reads in the same local time the app shows. Defaults to UTC when omitted or unrecognized. Field DATE values stay UTC — a date-only value is stored as UTC midnight platform-wide, so shifting it would move the day. | [optional] 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project**
> Project get_project(id)

Retrieves a project.

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
api_instance = dlxapi.ProjectsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Project id

try:
    # Retrieves a project.
    api_response = api_instance.get_project(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsApi->get_project: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Project id | 

### Return type

[**Project**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_changes_for_project**
> ProjectChanges get_project_changes_for_project(id)

Retrieves the approval history for a project.

Every ProjectChange recorded against the project across all approval workflows, in every status (PENDING, APPROVED, REJECTED and the MOVED tombstones), so the project's own approval history reads as one list. Ordered by the workflow's precedence position, then by submission time newest first within a workflow.  Authorized on project READ access, unlike the approval-scoped reads which are restricted to the portfolio owner and the workflow's approvers. Rows are then filtered to the fields the caller has EDIT access to (ALL_FIELDS, or the specific FIELDS / COST_TYPES permissions on their baseline plan membership), so a member sees the history of exactly the fields they could have changed themselves. A caller with no field permissions receives an empty list.  Project-scoped, not plan-scoped: a project has one approval history regardless of which plan it is being viewed through. Access resolves through the project's OWN portfolio, so a combined portfolio grants nothing here — its projects belong to the sub-portfolios, and a member of only the combined portfolio fails the project read check. 

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
api_instance = dlxapi.ProjectsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Project id

try:
    # Retrieves the approval history for a project.
    api_response = api_instance.get_project_changes_for_project(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsApi->get_project_changes_for_project: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Project id | 

### Return type

[**ProjectChanges**](ProjectChanges.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_for_portfolio_plan**
> Project get_project_for_portfolio_plan(project_id, portfolio_plan_id)

Retrieves a project for a portfolioPlan.

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
api_instance = dlxapi.ProjectsApi(dlxapi.ApiClient(configuration))
project_id = 'project_id_example' # str | Project id
portfolio_plan_id = 'portfolio_plan_id_example' # str | PortfolioPlan id

try:
    # Retrieves a project for a portfolioPlan.
    api_response = api_instance.get_project_for_portfolio_plan(project_id, portfolio_plan_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsApi->get_project_for_portfolio_plan: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **str**| Project id | 
 **portfolio_plan_id** | **str**| PortfolioPlan id | 

### Return type

[**Project**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_projects_data_for_portfolio**
> MinifiedProjects get_projects_data_for_portfolio(portfolio_id, data_id)

Fetch project data for portfolio and data id.

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
api_instance = dlxapi.ProjectsApi(dlxapi.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio Id
data_id = 'data_id_example' # str | Data Id

try:
    # Fetch project data for portfolio and data id.
    api_response = api_instance.get_projects_data_for_portfolio(portfolio_id, data_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsApi->get_projects_data_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio Id | 
 **data_id** | **str**| Data Id | 

### Return type

[**MinifiedProjects**](MinifiedProjects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_projects_for_portfolio**
> Projects get_projects_for_portfolio(portfolio_id, portfolio_plan_id=portfolio_plan_id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)

Retrieves projects contained within a portfolio. Possible expand paths are - (items.fieldValues, contributingUserIds)

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
api_instance = dlxapi.ProjectsApi(dlxapi.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio id
portfolio_plan_id = 'portfolio_plan_id_example' # str | Portfolio plan id. If not specified the portfolio plan will default to current baseline (optional)
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Retrieves projects contained within a portfolio. Possible expand paths are - (items.fieldValues, contributingUserIds)
    api_response = api_instance.get_projects_for_portfolio(portfolio_id, portfolio_plan_id=portfolio_plan_id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsApi->get_projects_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 
 **portfolio_plan_id** | **str**| Portfolio plan id. If not specified the portfolio plan will default to current baseline | [optional] 
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

# **get_projects_with_duplicate_values_for_field**
> list[Project] get_projects_with_duplicate_values_for_field(field_id, value=value)

Get Projects with duplicate values for field

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
api_instance = dlxapi.ProjectsApi(dlxapi.ApiClient(configuration))
field_id = 'field_id_example' # str | Field id
value = 'value_example' # str | a single FieldValue. Projects with this value for the field are returned when it’s not blank. (optional)

try:
    # Get Projects with duplicate values for field
    api_response = api_instance.get_projects_with_duplicate_values_for_field(field_id, value=value)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsApi->get_projects_with_duplicate_values_for_field: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **field_id** | **str**| Field id | 
 **value** | **str**| a single FieldValue. Projects with this value for the field are returned when it’s not blank. | [optional] 

### Return type

[**list[Project]**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_contributing_users_from_project**
> remove_contributing_users_from_project(body, id)

Remove contributing users from a project.

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
api_instance = dlxapi.ProjectsApi(dlxapi.ApiClient(configuration))
body = dlxapi.RemoveContributingUsersRequest() # RemoveContributingUsersRequest | contributing user ids
id = 'id_example' # str | project id

try:
    # Remove contributing users from a project.
    api_instance.remove_contributing_users_from_project(body, id)
except ApiException as e:
    print("Exception when calling ProjectsApi->remove_contributing_users_from_project: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemoveContributingUsersRequest**](RemoveContributingUsersRequest.md)| contributing user ids | 
 **id** | **str**| project id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_project_dependencies**
> Projects set_project_dependencies(id, body=body)

Adds or removes dependsOn and/or dependant linked projects to a project.

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
api_instance = dlxapi.ProjectsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | project id
body = dlxapi.SetDependenciesRequest() # SetDependenciesRequest | dependsOn and hasDependent project Ids (optional)

try:
    # Adds or removes dependsOn and/or dependant linked projects to a project.
    api_response = api_instance.set_project_dependencies(id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsApi->set_project_dependencies: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| project id | 
 **body** | [**SetDependenciesRequest**](SetDependenciesRequest.md)| dependsOn and hasDependent project Ids | [optional] 

### Return type

[**Projects**](Projects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

