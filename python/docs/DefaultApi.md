# swagger_client.DefaultApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_category_option**](DefaultApi.md#create_category_option) | **POST** /fields/{fieldId}/categoryOption | Creates a new category
[**create_category_options**](DefaultApi.md#create_category_options) | **POST** /fields/{fieldId}/categoryOptions | Creates new category options
[**delete_category_option**](DefaultApi.md#delete_category_option) | **DELETE** /fields/{fieldId}/categoryOptions/{categoryOptionId} | Delete a single category option
[**get_category_option**](DefaultApi.md#get_category_option) | **GET** /fields/{fieldId}/categoryOptions/{categoryOptionId} | Retrieves a category
[**get_category_options_for_field**](DefaultApi.md#get_category_options_for_field) | **GET** /fields/{fieldId}/categoryOptions | Retrieves categories for a field
[**update_category_option**](DefaultApi.md#update_category_option) | **PATCH** /fields/{fieldId}/categoryOptions/{categoryOptionId} | Update a single category


# **create_category_option**
> CategoryOption create_category_option(body)

Creates a new category

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
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
body = swagger_client.CategoryOption() # CategoryOption | Category option to create

try:
    # Creates a new category
    api_response = api_instance.create_category_option(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->create_category_option: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CategoryOption**](CategoryOption.md)| Category option to create | 

### Return type

[**CategoryOption**](CategoryOption.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_category_options**
> CategoryOptions create_category_options(body)

Creates new category options

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
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
body = swagger_client.CategoryOptions() # CategoryOptions | Category options to create

try:
    # Creates new category options
    api_response = api_instance.create_category_options(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->create_category_options: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CategoryOptions**](CategoryOptions.md)| Category options to create | 

### Return type

[**CategoryOptions**](CategoryOptions.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_category_option**
> delete_category_option(field_id, category_option_id)

Delete a single category option

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
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
field_id = 'field_id_example' # str | Field id
category_option_id = 'category_option_id_example' # str | Category Option ID

try:
    # Delete a single category option
    api_instance.delete_category_option(field_id, category_option_id)
except ApiException as e:
    print("Exception when calling DefaultApi->delete_category_option: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **field_id** | **str**| Field id | 
 **category_option_id** | **str**| Category Option ID | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_category_option**
> CategoryOption get_category_option(field_id, category_option_id)

Retrieves a category

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
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
field_id = 'field_id_example' # str | Field id
category_option_id = 'category_option_id_example' # str | Category Option id

try:
    # Retrieves a category
    api_response = api_instance.get_category_option(field_id, category_option_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->get_category_option: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **field_id** | **str**| Field id | 
 **category_option_id** | **str**| Category Option id | 

### Return type

[**CategoryOption**](CategoryOption.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_category_options_for_field**
> CategoryOptions get_category_options_for_field(field_id)

Retrieves categories for a field

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
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
field_id = 'field_id_example' # str | Field id

try:
    # Retrieves categories for a field
    api_response = api_instance.get_category_options_for_field(field_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->get_category_options_for_field: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **field_id** | **str**| Field id | 

### Return type

[**CategoryOptions**](CategoryOptions.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_category_option**
> CategoryOption update_category_option(field_id, category_option_id, body)

Update a single category

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
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
field_id = 'field_id_example' # str | Field id
category_option_id = 'category_option_id_example' # str | Category Option id
body = swagger_client.CategoryOption() # CategoryOption | JSON Patch operations to update value field.

try:
    # Update a single category
    api_response = api_instance.update_category_option(field_id, category_option_id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->update_category_option: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **field_id** | **str**| Field id | 
 **category_option_id** | **str**| Category Option id | 
 **body** | [**CategoryOption**](CategoryOption.md)| JSON Patch operations to update value field. | 

### Return type

[**CategoryOption**](CategoryOption.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

