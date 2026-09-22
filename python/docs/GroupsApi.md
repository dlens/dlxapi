# dlxapi.GroupsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_user_to_group**](GroupsApi.md#add_user_to_group) | **POST** /groups/{id}/users | Add a user to a group. System Administrator operation.
[**create_group**](GroupsApi.md#create_group) | **POST** /groups | Creates a new group. System Administrator operation.
[**create_user_api_credentials**](GroupsApi.md#create_user_api_credentials) | **POST** /groups/{id}/users/{userId}/apiCredentials | Create API credentials for a user in a group. System Administrator operation.
[**export_group**](GroupsApi.md#export_group) | **POST** /groups/{id}/export | Export Group
[**export_group_users**](GroupsApi.md#export_group_users) | **POST** /groups/{id}/users/export | Export login counts per user for a group. System Administrator operation.
[**export_groups**](GroupsApi.md#export_groups) | **POST** /groups/export | Export cross-tenant login usage stats. System Administrator operation.
[**get_activities_for_group**](GroupsApi.md#get_activities_for_group) | **GET** /groups/{id}/activities | Get activities for group. System Administator operation.
[**get_group_properties**](GroupsApi.md#get_group_properties) | **GET** /groups/{id}/properties | Get the properties stored for the group. System Administator operation.
[**get_groups**](GroupsApi.md#get_groups) | **GET** /groups | Get groups. System Administator operation.
[**get_portfolios_for_group**](GroupsApi.md#get_portfolios_for_group) | **GET** /groups/{id}/portfolios | Get portfolios for group. Group administrator operation.
[**get_users_for_group**](GroupsApi.md#get_users_for_group) | **GET** /groups/{id}/users | Get users for group. System Administator operation.
[**provision_group**](GroupsApi.md#provision_group) | **POST** /groups/provision | Provision a group (tenant).
[**remove_user_from_group**](GroupsApi.md#remove_user_from_group) | **DELETE** /groups/{id}/users/{userId} | Remove a user from a group. System Administrator operation.
[**set_group_properties**](GroupsApi.md#set_group_properties) | **PUT** /groups/{id}/properties | Set the properties for the group. System Administator operation.
[**update_group**](GroupsApi.md#update_group) | **PATCH** /groups/{id} | Update a group. System Administrator operation.
[**update_user_in_group**](GroupsApi.md#update_user_in_group) | **PATCH** /groups/{id}/users/{userId} | Update a user in a group. System Administrator operation.

# **add_user_to_group**
> User add_user_to_group(body, id)

Add a user to a group. System Administrator operation.

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
api_instance = dlxapi.GroupsApi(dlxapi.ApiClient(configuration))
body = dlxapi.AddUserRequest() # AddUserRequest | User to add to the group
id = 'id_example' # str | Group id

try:
    # Add a user to a group. System Administrator operation.
    api_response = api_instance.add_user_to_group(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->add_user_to_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddUserRequest**](AddUserRequest.md)| User to add to the group | 
 **id** | **str**| Group id | 

### Return type

[**User**](User.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_group**
> Group create_group(body)

Creates a new group. System Administrator operation.

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
api_instance = dlxapi.GroupsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Group() # Group | Group to create

try:
    # Creates a new group. System Administrator operation.
    api_response = api_instance.create_group(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->create_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Group**](Group.md)| Group to create | 

### Return type

[**Group**](Group.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_user_api_credentials**
> ApiCredentials create_user_api_credentials(id, user_id)

Create API credentials for a user in a group. System Administrator operation.

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
api_instance = dlxapi.GroupsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Group id
user_id = 'user_id_example' # str | User id

try:
    # Create API credentials for a user in a group. System Administrator operation.
    api_response = api_instance.create_user_api_credentials(id, user_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->create_user_api_credentials: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Group id | 
 **user_id** | **str**| User id | 

### Return type

[**ApiCredentials**](ApiCredentials.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **export_group**
> str export_group(id, export_type=export_type, export_format=export_format)

Export Group

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
api_instance = dlxapi.GroupsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Group id
export_type = 'export_type_example' # str | export type (GROUP) (optional)
export_format = 'export_format_example' # str | export format type (XLSX) (optional)

try:
    # Export Group
    api_response = api_instance.export_group(id, export_type=export_type, export_format=export_format)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->export_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Group id | 
 **export_type** | **str**| export type (GROUP) | [optional] 
 **export_format** | **str**| export format type (XLSX) | [optional] 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **export_group_users**
> str export_group_users(id, export_type=export_type, export_format=export_format, start_date=start_date, end_date=end_date)

Export login counts per user for a group. System Administrator operation.

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
api_instance = dlxapi.GroupsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Group id
export_type = dlxapi.ExportType() # ExportType | export type (GROUP_USER_LOGIN_COUNTS) (optional)
export_format = 'XLSX' # str | export format type (XLSX) (optional) (default to XLSX)
start_date = 789 # int | Start of the report period, epoch milliseconds (inclusive) (optional)
end_date = 789 # int | End of the report period, epoch milliseconds (inclusive) (optional)

try:
    # Export login counts per user for a group. System Administrator operation.
    api_response = api_instance.export_group_users(id, export_type=export_type, export_format=export_format, start_date=start_date, end_date=end_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->export_group_users: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Group id | 
 **export_type** | [**ExportType**](.md)| export type (GROUP_USER_LOGIN_COUNTS) | [optional] 
 **export_format** | **str**| export format type (XLSX) | [optional] [default to XLSX]
 **start_date** | **int**| Start of the report period, epoch milliseconds (inclusive) | [optional] 
 **end_date** | **int**| End of the report period, epoch milliseconds (inclusive) | [optional] 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **export_groups**
> str export_groups(export_type, export_format=export_format, start_date=start_date, end_date=end_date)

Export cross-tenant login usage stats. System Administrator operation.

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
api_instance = dlxapi.GroupsApi(dlxapi.ApiClient(configuration))
export_type = dlxapi.ExportType() # ExportType | export type (GROUP_LOGIN_COUNTS, GROUP_DAILY_LOGIN_COUNTS)
export_format = 'XLSX' # str | export format type (XLSX) (optional) (default to XLSX)
start_date = 789 # int | Start of the report period, epoch milliseconds (inclusive) (optional)
end_date = 789 # int | End of the report period, epoch milliseconds (inclusive) (optional)

try:
    # Export cross-tenant login usage stats. System Administrator operation.
    api_response = api_instance.export_groups(export_type, export_format=export_format, start_date=start_date, end_date=end_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->export_groups: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **export_type** | [**ExportType**](.md)| export type (GROUP_LOGIN_COUNTS, GROUP_DAILY_LOGIN_COUNTS) | 
 **export_format** | **str**| export format type (XLSX) | [optional] [default to XLSX]
 **start_date** | **int**| Start of the report period, epoch milliseconds (inclusive) | [optional] 
 **end_date** | **int**| End of the report period, epoch milliseconds (inclusive) | [optional] 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_activities_for_group**
> Activities get_activities_for_group(id, limit=limit, offset=offset, match=match)

Get activities for group. System Administator operation.

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
api_instance = dlxapi.GroupsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Group id
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Get activities for group. System Administator operation.
    api_response = api_instance.get_activities_for_group(id, limit=limit, offset=offset, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->get_activities_for_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Group id | 
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

# **get_group_properties**
> Properties get_group_properties(id)

Get the properties stored for the group. System Administator operation.

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
api_instance = dlxapi.GroupsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Group id

try:
    # Get the properties stored for the group. System Administator operation.
    api_response = api_instance.get_group_properties(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->get_group_properties: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Group id | 

### Return type

[**Properties**](Properties.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_groups**
> Groups get_groups(domain=domain, expand=expand, limit=limit, offset=offset, match=match, include_inactive=include_inactive)

Get groups. System Administator operation.

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
api_instance = dlxapi.GroupsApi(dlxapi.ApiClient(configuration))
domain = 'domain_example' # str | Group for domain (optional)
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)
include_inactive = false # bool | When true, include inactive groups. Default is false (active groups only). (optional) (default to false)

try:
    # Get groups. System Administator operation.
    api_response = api_instance.get_groups(domain=domain, expand=expand, limit=limit, offset=offset, match=match, include_inactive=include_inactive)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->get_groups: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **str**| Group for domain | [optional] 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 
 **include_inactive** | **bool**| When true, include inactive groups. Default is false (active groups only). | [optional] [default to false]

### Return type

[**Groups**](Groups.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolios_for_group**
> Portfolios get_portfolios_for_group(id, include_archived=include_archived, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)

Get portfolios for group. Group administrator operation.

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
api_instance = dlxapi.GroupsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Group id
include_archived = false # bool | Whether to include archived portfolios in the response. Default is false. (optional) (default to false)
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Get portfolios for group. Group administrator operation.
    api_response = api_instance.get_portfolios_for_group(id, include_archived=include_archived, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->get_portfolios_for_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Group id | 
 **include_archived** | **bool**| Whether to include archived portfolios in the response. Default is false. | [optional] [default to false]
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#x27;-&#x27; in front of expression for reverse order. | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**Portfolios**](Portfolios.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_users_for_group**
> Users get_users_for_group(id, expand=expand, limit=limit, offset=offset, match=match)

Get users for group. System Administator operation.

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
api_instance = dlxapi.GroupsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Group id
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Get users for group. System Administator operation.
    api_response = api_instance.get_users_for_group(id, expand=expand, limit=limit, offset=offset, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->get_users_for_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Group id | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**Users**](Users.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **provision_group**
> ProvisionGroupResponse provision_group(body)

Provision a group (tenant).

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
api_instance = dlxapi.GroupsApi(dlxapi.ApiClient(configuration))
body = dlxapi.ProvisionGroupRequest() # ProvisionGroupRequest | Provision a Group

try:
    # Provision a group (tenant).
    api_response = api_instance.provision_group(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->provision_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProvisionGroupRequest**](ProvisionGroupRequest.md)| Provision a Group | 

### Return type

[**ProvisionGroupResponse**](ProvisionGroupResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_user_from_group**
> remove_user_from_group(id, user_id)

Remove a user from a group. System Administrator operation.

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
api_instance = dlxapi.GroupsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Group id
user_id = 'user_id_example' # str | User id

try:
    # Remove a user from a group. System Administrator operation.
    api_instance.remove_user_from_group(id, user_id)
except ApiException as e:
    print("Exception when calling GroupsApi->remove_user_from_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Group id | 
 **user_id** | **str**| User id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_group_properties**
> list[ModelProperty] set_group_properties(body, id)

Set the properties for the group. System Administator operation.

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
api_instance = dlxapi.GroupsApi(dlxapi.ApiClient(configuration))
body = [dlxapi.ModelProperty()] # list[ModelProperty] | Group properties to be created/updated.
id = 'id_example' # str | Group id

try:
    # Set the properties for the group. System Administator operation.
    api_response = api_instance.set_group_properties(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->set_group_properties: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[ModelProperty]**](ModelProperty.md)| Group properties to be created/updated. | 
 **id** | **str**| Group id | 

### Return type

[**list[ModelProperty]**](ModelProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_group**
> Group update_group(body, id)

Update a group. System Administrator operation.

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
api_instance = dlxapi.GroupsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Group() # Group | Updated group request
id = 'id_example' # str | Group id

try:
    # Update a group. System Administrator operation.
    api_response = api_instance.update_group(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->update_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Group**](Group.md)| Updated group request | 
 **id** | **str**| Group id | 

### Return type

[**Group**](Group.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_user_in_group**
> User update_user_in_group(body, id, user_id)

Update a user in a group. System Administrator operation.

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
api_instance = dlxapi.GroupsApi(dlxapi.ApiClient(configuration))
body = dlxapi.User() # User | Updated user request
id = 'id_example' # str | Group id
user_id = 'user_id_example' # str | User id

try:
    # Update a user in a group. System Administrator operation.
    api_response = api_instance.update_user_in_group(body, id, user_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->update_user_in_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| Updated user request | 
 **id** | **str**| Group id | 
 **user_id** | **str**| User id | 

### Return type

[**User**](User.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

