# swagger_client.GroupsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_group**](GroupsApi.md#create_group) | **POST** /groups | Creates a new group. System Administator operation.
[**get_activities_for_group**](GroupsApi.md#get_activities_for_group) | **GET** /groups/{id}/activities | Get activities for group. System Administator operation.
[**get_groups**](GroupsApi.md#get_groups) | **GET** /groups | Get groups. System Administator operation.
[**get_users_for_group**](GroupsApi.md#get_users_for_group) | **GET** /groups/{id}/users | Get users for group. System Administator operation.


# **create_group**
> Group create_group(group)

Creates a new group. System Administator operation.

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
group = dlxapi.Group() # Group | Group to create

try:
    # Creates a new group. System Administator operation.
    api_response = api_instance.create_group(group)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->create_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | [**Group**](Group.md)| Group to create | 

### Return type

[**Group**](Group.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

# **get_groups**
> Groups get_groups(expand=expand, limit=limit, offset=offset, match=match)

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
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Get groups. System Administator operation.
    api_response = api_instance.get_groups(expand=expand, limit=limit, offset=offset, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GroupsApi->get_groups: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**Groups**](Groups.md)

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

