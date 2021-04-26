# swagger_client.MappingsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spreadsheet_to_mappings**](MappingsApi.md#spreadsheet_to_mappings) | **POST** /mappings/spreadsheet | Accepts upload of spreadsheet and converts data into mappings.
[**update_mapping**](MappingsApi.md#update_mapping) | **PATCH** /mappings/{id} | Update mapping


# **spreadsheet_to_mappings**
> Mappings spreadsheet_to_mappings(file)

Accepts upload of spreadsheet and converts data into mappings.

Maps the fields in the spreadsheet to appropriate buckets

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
api_instance = dlxapi.MappingsApi(dlxapi.ApiClient(configuration))
file = '/path/to/file.txt' # file | maybe put supported file types here?

try:
    # Accepts upload of spreadsheet and converts data into mappings.
    api_response = api_instance.spreadsheet_to_mappings(file)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MappingsApi->spreadsheet_to_mappings: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **file**| maybe put supported file types here? | 

### Return type

[**Mappings**](Mappings.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_mapping**
> list[Mapping] update_mapping(id, body, expand=expand)

Update mapping

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
api_instance = dlxapi.MappingsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Mapping id
body = dlxapi.Operations() # Operations | JSON Patch Operations to update mapping.
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Update mapping
    api_response = api_instance.update_mapping(id, body, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MappingsApi->update_mapping: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Mapping id | 
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update mapping. | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**list[Mapping]**](Mapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

