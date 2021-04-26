# swagger_client.UserApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_user**](UserApi.md#get_user) | **GET** /users/{id} | Get user
[**get_user_activities**](UserApi.md#get_user_activities) | **GET** /users/{id}/activities | Get user activities
[**get_user_activities_for_group**](UserApi.md#get_user_activities_for_group) | **GET** /users/activities | Get user activities for group


# **get_user**
> User get_user(id)

Get user

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
api_instance = dlxapi.UserApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | User id

try:
    # Get user
    api_response = api_instance.get_user(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->get_user: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| User id | 

### Return type

[**User**](User.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user_activities**
> Activities get_user_activities(id, limit=limit, offset=offset, match=match)

Get user activities

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
api_instance = dlxapi.UserApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | User id
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Get user activities
    api_response = api_instance.get_user_activities(id, limit=limit, offset=offset, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->get_user_activities: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| User id | 
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

# **get_user_activities_for_group**
> Activities get_user_activities_for_group(limit=limit, offset=offset, match=match)

Get user activities for group

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
api_instance = dlxapi.UserApi(dlxapi.ApiClient(configuration))
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Get user activities for group
    api_response = api_instance.get_user_activities_for_group(limit=limit, offset=offset, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->get_user_activities_for_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

