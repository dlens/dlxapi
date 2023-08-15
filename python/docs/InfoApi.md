# swagger_client.InfoApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_info**](InfoApi.md#get_info) | **GET** /info | Get service build information


# **get_info**
> ServiceInfoDetails get_info()

Get service build information

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
api_instance = swagger_client.InfoApi(swagger_client.ApiClient(configuration))

try:
    # Get service build information
    api_response = api_instance.get_info()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InfoApi->get_info: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServiceInfoDetails**](ServiceInfoDetails.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

