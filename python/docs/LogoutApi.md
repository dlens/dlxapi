# swagger_client.LogoutApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logout**](LogoutApi.md#logout) | **GET** /oauth/logout | Logout


# **logout**
> logout(target_url)

Logout

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
api_instance = dlxapi.LogoutApi(dlxapi.ApiClient(configuration))
target_url = 'target_url_example' # str | Target url to redirect after login

try:
    # Logout
    api_instance.logout(target_url)
except ApiException as e:
    print("Exception when calling LogoutApi->logout: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **target_url** | **str**| Target url to redirect after login | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

