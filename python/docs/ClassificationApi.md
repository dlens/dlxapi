# swagger_client.ClassificationApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_classification_data**](ClassificationApi.md#get_classification_data) | **GET** /classification/{dataType} | Fetch classification training or testing data.


# **get_classification_data**
> Classifications get_classification_data(data_type)

Fetch classification training or testing data.

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
api_instance = dlxapi.ClassificationApi(dlxapi.ApiClient(configuration))
data_type = 'data_type_example' # str | dataType can be either training or testing

try:
    # Fetch classification training or testing data.
    api_response = api_instance.get_classification_data(data_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClassificationApi->get_classification_data: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_type** | **str**| dataType can be either training or testing | 

### Return type

[**Classifications**](Classifications.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

