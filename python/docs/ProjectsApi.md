# swagger_client.ProjectsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_contributing_users_for_project**](ProjectsApi.md#add_contributing_users_for_project) | **POST** /projects/{id}/users | Add users to a project.
[**create_project**](ProjectsApi.md#create_project) | **POST** /projects | Creates a new project.
[**delete_project**](ProjectsApi.md#delete_project) | **DELETE** /projects/{id} | Delete a project.
[**delete_projects**](ProjectsApi.md#delete_projects) | **POST** /projects/delete | Delete projects.
[**get_project**](ProjectsApi.md#get_project) | **GET** /projects/{id} | Retrieves a project.
[**get_project_for_portfolio_plan**](ProjectsApi.md#get_project_for_portfolio_plan) | **GET** /projects/{projectId}/portfolioPlan/{portfolioPlanId} | Retrieves a project for a portfolioPlan.
[**get_projects_for_portfolio**](ProjectsApi.md#get_projects_for_portfolio) | **GET** /projects | Retrieves projects contained within a portfolio. Possible expand paths are - (items.fieldValues, contributingUserIds)
[**remove_contributing_users_from_project**](ProjectsApi.md#remove_contributing_users_from_project) | **DELETE** /projects/{id}/users | Remove contributing users from a project.
[**set_project_dependencies**](ProjectsApi.md#set_project_dependencies) | **PUT** /projects/{id}/dependencies | Adds or removes dependsOn and/or dependant linked projects to a project.


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

# **create_project**
> Project create_project(portfolio_id, project)

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
portfolio_id = 'portfolio_id_example' # str | Portfolio id
project = dlxapi.Project() # Project | Project to create

try:
    # Creates a new project.
    api_response = api_instance.create_project(portfolio_id, project)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProjectsApi->create_project: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 
 **project** | [**Project**](Project.md)| Project to create | 

### Return type

[**Project**](Project.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_projects**
> delete_projects(project_ids)

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
project_ids = [dlxapi.list[str]()] # list[str] | Project ids

try:
    # Delete projects.
    api_instance.delete_projects(project_ids)
except ApiException as e:
    print("Exception when calling ProjectsApi->delete_projects: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_ids** | **list[str]**| Project ids | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

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

# **remove_contributing_users_from_project**
> remove_contributing_users_from_project(id, body)

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
id = 'id_example' # str | project id
body = dlxapi.RemoveContributingUsersRequest() # RemoveContributingUsersRequest | contributing user ids

try:
    # Remove contributing users from a project.
    api_instance.remove_contributing_users_from_project(id, body)
except ApiException as e:
    print("Exception when calling ProjectsApi->remove_contributing_users_from_project: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| project id | 
 **body** | [**RemoveContributingUsersRequest**](RemoveContributingUsersRequest.md)| contributing user ids | 

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

