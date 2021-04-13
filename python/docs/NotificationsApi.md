# swagger_client.NotificationsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_notifications**](NotificationsApi.md#get_notifications) | **GET** /notifications | Retrieves portfolio notifications log.
[**reindex_notifications**](NotificationsApi.md#reindex_notifications) | **POST** /reindex/notifications | Reindex notifications. System Administator operation.


# **get_notifications**
> Activities get_notifications(portfolio_id, limit=limit, offset=offset)

Retrieves portfolio notifications log.

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
api_instance = swagger_client.NotificationsApi(swagger_client.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio id
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)

try:
    # Retrieves portfolio notifications log.
    api_response = api_instance.get_notifications(portfolio_id, limit=limit, offset=offset)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NotificationsApi->get_notifications: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 

### Return type

[**Activities**](Activities.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reindex_notifications**
> str reindex_notifications(domains=domains)

Reindex notifications. System Administator operation.

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
api_instance = swagger_client.NotificationsApi(swagger_client.ApiClient(configuration))
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

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

