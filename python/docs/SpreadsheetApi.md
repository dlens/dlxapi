# swagger_client.SpreadsheetApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_spreadsheet**](SpreadsheetApi.md#create_spreadsheet) | **POST** /spreadsheet | 
[**create_spreadsheet_for_kloudless_file**](SpreadsheetApi.md#create_spreadsheet_for_kloudless_file) | **POST** /spreadsheet/kloudless | 
[**delete_spreadsheet**](SpreadsheetApi.md#delete_spreadsheet) | **DELETE** /spreadsheet/{id} | Delete spreadsheet and mappings
[**get_mappings_for_spreadsheet**](SpreadsheetApi.md#get_mappings_for_spreadsheet) | **GET** /spreadsheet/{id}/mappings | 
[**get_spreadsheet**](SpreadsheetApi.md#get_spreadsheet) | **GET** /spreadsheet/{id} | 


# **create_spreadsheet**
> Spreadsheet create_spreadsheet(file)



Creates spreadsheet from file upload.

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
api_instance = swagger_client.SpreadsheetApi(swagger_client.ApiClient(configuration))
file = '/path/to/file.txt' # file | xls or xlsx file upload

try:
    api_response = api_instance.create_spreadsheet(file)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SpreadsheetApi->create_spreadsheet: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **file**| xls or xlsx file upload | 

### Return type

[**Spreadsheet**](Spreadsheet.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_spreadsheet_for_kloudless_file**
> Spreadsheet create_spreadsheet_for_kloudless_file(kloudless_file)



Creates spreadsheet from kloudless file

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
api_instance = swagger_client.SpreadsheetApi(swagger_client.ApiClient(configuration))
kloudless_file = swagger_client.KloudlessFile() # KloudlessFile | kloudless file

try:
    api_response = api_instance.create_spreadsheet_for_kloudless_file(kloudless_file)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SpreadsheetApi->create_spreadsheet_for_kloudless_file: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kloudless_file** | [**KloudlessFile**](KloudlessFile.md)| kloudless file | 

### Return type

[**Spreadsheet**](Spreadsheet.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_spreadsheet**
> delete_spreadsheet(id)

Delete spreadsheet and mappings

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
api_instance = swagger_client.SpreadsheetApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | spreadsheet id

try:
    # Delete spreadsheet and mappings
    api_instance.delete_spreadsheet(id)
except ApiException as e:
    print("Exception when calling SpreadsheetApi->delete_spreadsheet: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| spreadsheet id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_mappings_for_spreadsheet**
> Mappings get_mappings_for_spreadsheet(id, sheet_name=sheet_name, import_type=import_type, expand=expand)



Get mappings for spreadsheet

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
api_instance = swagger_client.SpreadsheetApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | spreadsheet id
sheet_name = 'sheet_name_example' # str |  (optional)
import_type = NULL # object | Whether import PROJECT or COST data. Defaults to PROJECT (optional)
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    api_response = api_instance.get_mappings_for_spreadsheet(id, sheet_name=sheet_name, import_type=import_type, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SpreadsheetApi->get_mappings_for_spreadsheet: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| spreadsheet id | 
 **sheet_name** | **str**|  | [optional] 
 **import_type** | [**object**](.md)| Whether import PROJECT or COST data. Defaults to PROJECT | [optional] 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**Mappings**](Mappings.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_spreadsheet**
> Spreadsheet get_spreadsheet(id)



Get spreadsheet

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
api_instance = swagger_client.SpreadsheetApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | spreadsheet id

try:
    api_response = api_instance.get_spreadsheet(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SpreadsheetApi->get_spreadsheet: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| spreadsheet id | 

### Return type

[**Spreadsheet**](Spreadsheet.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

