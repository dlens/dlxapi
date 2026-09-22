# dlxapi.AppHubApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list_app_hub_apps**](AppHubApi.md#list_app_hub_apps) | **GET** /sysadmin/apps | List apps available in App Hub

# **list_app_hub_apps**
> Apps list_app_hub_apps(limit=limit, offset=offset)

List apps available in App Hub

Returns the catalog of apps exposed by App Hub for system administrators (for example, to review or publish apps). Implementations may enforce elevated privileges beyond standard OAuth2 scopes. 

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
api_instance = dlxapi.AppHubApi(dlxapi.ApiClient(configuration))
limit = 50 # int | Maximum number of apps to return (optional) (default to 50)
offset = 0 # int | Number of apps to skip before returning results (optional) (default to 0)

try:
    # List apps available in App Hub
    api_response = api_instance.list_app_hub_apps(limit=limit, offset=offset)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppHubApi->list_app_hub_apps: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Maximum number of apps to return | [optional] [default to 50]
 **offset** | **int**| Number of apps to skip before returning results | [optional] [default to 0]

### Return type

[**Apps**](Apps.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

