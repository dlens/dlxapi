# dlxapi.CacheApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_cache**](CacheApi.md#delete_cache) | **DELETE** /cache | Flush all entries from the cache. System Administrator operation.
[**get_cache_stats**](CacheApi.md#get_cache_stats) | **GET** /cache/stats | Get cache statistics per cache server. System Administrator operation.

# **delete_cache**
> delete_cache()

Flush all entries from the cache. System Administrator operation.

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
api_instance = dlxapi.CacheApi(dlxapi.ApiClient(configuration))

try:
    # Flush all entries from the cache. System Administrator operation.
    api_instance.delete_cache()
except ApiException as e:
    print("Exception when calling CacheApi->delete_cache: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_cache_stats**
> CacheStats get_cache_stats()

Get cache statistics per cache server. System Administrator operation.

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
api_instance = dlxapi.CacheApi(dlxapi.ApiClient(configuration))

try:
    # Get cache statistics per cache server. System Administrator operation.
    api_response = api_instance.get_cache_stats()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CacheApi->get_cache_stats: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CacheStats**](CacheStats.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

