# dlxapi.UiSettingsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_ui_settings**](UiSettingsApi.md#delete_ui_settings) | **DELETE** /uiSettings/{id} | Deletes user UI settings
[**get_ui_settings**](UiSettingsApi.md#get_ui_settings) | **GET** /uiSettings/{id} | Gets user UI settings
[**update_ui_settings**](UiSettingsApi.md#update_ui_settings) | **PATCH** /uiSettings/{id} | Updates user UI settings

# **delete_ui_settings**
> delete_ui_settings(id)

Deletes user UI settings

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
api_instance = dlxapi.UiSettingsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Entity id

try:
    # Deletes user UI settings
    api_instance.delete_ui_settings(id)
except ApiException as e:
    print("Exception when calling UiSettingsApi->delete_ui_settings: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Entity id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ui_settings**
> dict(str, object) get_ui_settings(id)

Gets user UI settings

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
api_instance = dlxapi.UiSettingsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Entity id

try:
    # Gets user UI settings
    api_response = api_instance.get_ui_settings(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UiSettingsApi->get_ui_settings: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Entity id | 

### Return type

**dict(str, object)**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_ui_settings**
> dict(str, object) update_ui_settings(body, id)

Updates user UI settings

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
api_instance = dlxapi.UiSettingsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | JSON Patch Operations to update multiple UI settings
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Entity id

try:
    # Updates user UI settings
    api_response = api_instance.update_ui_settings(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UiSettingsApi->update_ui_settings: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update multiple UI settings | 
 **id** | [**str**](.md)| Entity id | 

### Return type

**dict(str, object)**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

