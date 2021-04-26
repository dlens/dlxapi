# swagger_client.ActivitiesApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reindex_activities**](ActivitiesApi.md#reindex_activities) | **POST** /reindex/activities | Reindex activities. System Administator operation.


# **reindex_activities**
> str reindex_activities(domains=domains)

Reindex activities. System Administator operation.

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
api_instance = dlxapi.ActivitiesApi(dlxapi.ApiClient(configuration))
domains = ['domains_example'] # list[str] | List of domains for where activities need to be reindexed, if not provided reindex will be done for all domains (optional)

try:
    # Reindex activities. System Administator operation.
    api_response = api_instance.reindex_activities(domains=domains)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ActivitiesApi->reindex_activities: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domains** | [**list[str]**](str.md)| List of domains for where activities need to be reindexed, if not provided reindex will be done for all domains | [optional] 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

