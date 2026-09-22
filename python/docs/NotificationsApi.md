# dlxapi.NotificationsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reindex_notifications**](NotificationsApi.md#reindex_notifications) | **POST** /reindex/notifications | Reindex notifications. System Administator operation.

# **reindex_notifications**
> str reindex_notifications(domains=domains)

Reindex notifications. System Administator operation.

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
api_instance = dlxapi.NotificationsApi(dlxapi.ApiClient(configuration))
domains = ['domains_example'] # list[str] | List of domains for where notifications need to be reindexed, if not provided reindex will be done for all domains (optional)

try:
    # Reindex notifications. System Administator operation.
    api_response = api_instance.reindex_notifications(domains=domains)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NotificationsApi->reindex_notifications: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domains** | [**list[str]**](str.md)| List of domains for where notifications need to be reindexed, if not provided reindex will be done for all domains | [optional] 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

