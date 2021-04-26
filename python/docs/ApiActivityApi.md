# swagger_client.ApiActivityApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reset_api_activity_time**](ApiActivityApi.md#reset_api_activity_time) | **POST** /apiActivity/reset | Reset last API Acitivity time


# **reset_api_activity_time**
> reset_api_activity_time()

Reset last API Acitivity time

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
api_instance = dlxapi.ApiActivityApi(dlxapi.ApiClient(configuration))

try:
    # Reset last API Acitivity time
    api_instance.reset_api_activity_time()
except ApiException as e:
    print("Exception when calling ApiActivityApi->reset_api_activity_time: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

