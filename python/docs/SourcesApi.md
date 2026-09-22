# dlxapi.SourcesApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetch_data_for_source**](SourcesApi.md#fetch_data_for_source) | **GET** /sources/{id}/fetchData | Fetch data for source.
[**send_data_for_source**](SourcesApi.md#send_data_for_source) | **POST** /sources/{id}/sendData | Send data for source.

# **fetch_data_for_source**
> Source fetch_data_for_source(id, priority_scenario=priority_scenario)

Fetch data for source.

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
api_instance = dlxapi.SourcesApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Source id
priority_scenario = 'priority_scenario_example' # str | Priority Scenario name (optional)

try:
    # Fetch data for source.
    api_response = api_instance.fetch_data_for_source(id, priority_scenario=priority_scenario)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SourcesApi->fetch_data_for_source: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Source id | 
 **priority_scenario** | **str**| Priority Scenario name | [optional] 

### Return type

[**Source**](Source.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_data_for_source**
> Source send_data_for_source(body, id)

Send data for source.

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
api_instance = dlxapi.SourcesApi(dlxapi.ApiClient(configuration))
body = ['body_example'] # list[str] | Statuses
id = 'id_example' # str | Source id

try:
    # Send data for source.
    api_response = api_instance.send_data_for_source(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SourcesApi->send_data_for_source: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[str]**](str.md)| Statuses | 
 **id** | **str**| Source id | 

### Return type

[**Source**](Source.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

