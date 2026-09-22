# dlxapi.PropertiesApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_default_properties**](PropertiesApi.md#get_default_properties) | **GET** /properties/defaults | Get the default properties
[**get_properties**](PropertiesApi.md#get_properties) | **GET** /properties | Get configuration properties for user if userId and groupId are present, otherwise properties for authenticated user will be returned
[**set_default_properties**](PropertiesApi.md#set_default_properties) | **PUT** /properties/defaults | Update the default properties. Only existing default properties can be updated, new ones are never created.
[**set_properties**](PropertiesApi.md#set_properties) | **PUT** /properties | Set configuration properties

# **get_default_properties**
> Properties get_default_properties()

Get the default properties

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
api_instance = dlxapi.PropertiesApi(dlxapi.ApiClient(configuration))

try:
    # Get the default properties
    api_response = api_instance.get_default_properties()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PropertiesApi->get_default_properties: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Properties**](Properties.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_properties**
> Properties get_properties(user_id=user_id)

Get configuration properties for user if userId and groupId are present, otherwise properties for authenticated user will be returned

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
api_instance = dlxapi.PropertiesApi(dlxapi.ApiClient(configuration))
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

# **set_default_properties**
> list[ModelProperty] set_default_properties(body)

Update the default properties. Only existing default properties can be updated, new ones are never created.

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
api_instance = dlxapi.PropertiesApi(dlxapi.ApiClient(configuration))
body = [dlxapi.ModelProperty()] # list[ModelProperty] | Default properties to be updated.

try:
    # Update the default properties. Only existing default properties can be updated, new ones are never created.
    api_response = api_instance.set_default_properties(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PropertiesApi->set_default_properties: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[ModelProperty]**](ModelProperty.md)| Default properties to be updated. | 

### Return type

[**list[ModelProperty]**](ModelProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_properties**
> list[ModelProperty] set_properties(body)

Set configuration properties

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
api_instance = dlxapi.PropertiesApi(dlxapi.ApiClient(configuration))
body = [dlxapi.ModelProperty()] # list[ModelProperty] | Properties that needed to be created/updated for the current user.

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

