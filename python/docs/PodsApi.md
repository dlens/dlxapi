# swagger_client.PodsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**import_pod_template**](PodsApi.md#import_pod_template) | **PUT** /pods/template | Import pod template in JSON format


# **import_pod_template**
> import_pod_template(pod_file, template_name)

Import pod template in JSON format

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
api_instance = dlxapi.PodsApi(dlxapi.ApiClient(configuration))
pod_file = '/path/to/file.txt' # file | The pod file to upload.
template_name = 'template_name_example' # str | pod template name

try:
    # Import pod template in JSON format
    api_instance.import_pod_template(pod_file, template_name)
except ApiException as e:
    print("Exception when calling PodsApi->import_pod_template: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pod_file** | **file**| The pod file to upload. | 
 **template_name** | **str**| pod template name | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

