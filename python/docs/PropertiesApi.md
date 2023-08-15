# swagger_client.PropertiesApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_properties**](PropertiesApi.md#get_properties) | **GET** /properties | Get configuration properties for user if userId and groupId are present, otherwise properties for authenticated user will be returned
[**set_properties**](PropertiesApi.md#set_properties) | **PUT** /properties | Set configuration properties


# **get_properties**
> Properties get_properties(user_id=user_id)

Get configuration properties for user if userId and groupId are present, otherwise properties for authenticated user will be returned

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
api_instance = swagger_client.PropertiesApi(swagger_client.ApiClient(configuration))
user_id = 'user_id_example' # str | User id (optional)

try:
    # Get configuration properties for user if userId and groupId are present, otherwise properties for authenticated user will be returned
    api_response = api_instance.get_properties(user_id=user_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PropertiesApi->get_properties: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| User id | [optional] 

### Return type

[**Properties**](Properties.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_properties**
> list[ModelProperty] set_properties(body)

Set configuration properties

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
api_instance = swagger_client.PropertiesApi(swagger_client.ApiClient(configuration))
body = [swagger_client.ModelProperty()] # list[ModelProperty] | Properties that needed to be created/updated for the current user.

try:
    # Set configuration properties
    api_response = api_instance.set_properties(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PropertiesApi->set_properties: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[ModelProperty]**](ModelProperty.md)| Properties that needed to be created/updated for the current user. | 

### Return type

[**list[ModelProperty]**](ModelProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

