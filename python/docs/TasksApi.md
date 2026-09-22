# dlxapi.TasksApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_my_tasks**](TasksApi.md#get_my_tasks) | **GET** /tasks | Retrieves the authenticated user&#x27;s tasks, aggregated live from their open approvals and surveys.

# **get_my_tasks**
> Tasks get_my_tasks()

Retrieves the authenticated user's tasks, aggregated live from their open approvals and surveys.

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
api_instance = dlxapi.TasksApi(dlxapi.ApiClient(configuration))

try:
    # Retrieves the authenticated user's tasks, aggregated live from their open approvals and surveys.
    api_response = api_instance.get_my_tasks()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TasksApi->get_my_tasks: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Tasks**](Tasks.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

