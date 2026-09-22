# dlxapi.FilesApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_data_file**](FilesApi.md#delete_data_file) | **DELETE** /files/{fileId} | Delete a file
[**download_data_file**](FilesApi.md#download_data_file) | **GET** /files/{fileId}/content | Download file content
[**get_data_file**](FilesApi.md#get_data_file) | **GET** /files/{fileId} | Get file metadata
[**list_data_files**](FilesApi.md#list_data_files) | **GET** /files | List Data Hub files
[**rename_data_file**](FilesApi.md#rename_data_file) | **PATCH** /files/{fileId} | Update a file utilizing JSON Patch operations
[**upload_data_file**](FilesApi.md#upload_data_file) | **POST** /files | Upload a Data Hub file

# **delete_data_file**
> delete_data_file(file_id)

Delete a file

Deletes the file row and removes the underlying object. Cascades to any application attachments.

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
api_instance = dlxapi.FilesApi(dlxapi.ApiClient(configuration))
file_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Delete a file
    api_instance.delete_data_file(file_id)
except ApiException as e:
    print("Exception when calling FilesApi->delete_data_file: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | [**str**](.md)|  | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_data_file**
> str download_data_file(file_id)

Download file content

Streams the file bytes as an attachment with Content-Disposition set.

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
api_instance = dlxapi.FilesApi(dlxapi.ApiClient(configuration))
file_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Download file content
    api_response = api_instance.download_data_file(file_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FilesApi->download_data_file: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | [**str**](.md)|  | 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_data_file**
> DataFile get_data_file(file_id)

Get file metadata

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
api_instance = dlxapi.FilesApi(dlxapi.ApiClient(configuration))
file_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Get file metadata
    api_response = api_instance.get_data_file(file_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FilesApi->get_data_file: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | [**str**](.md)|  | 

### Return type

[**DataFile**](DataFile.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_data_files**
> DataFiles list_data_files(limit=limit, offset=offset, match=match)

List Data Hub files

Returns a page of files for the authenticated tenant, ordered by createdAt descending.

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
api_instance = dlxapi.FilesApi(dlxapi.ApiClient(configuration))
limit = 56 # int | Maximum number of files to return (clamped to 100; default 25) (optional)
offset = 56 # int | Number of files to skip before returning results (optional)
match = 'match_example' # str | Comma-separated list of property:value expressions to include only the files that satisfy the expression(s), following the same convention as the portfolio service. Supported properties: name — case-insensitive substring match on the file name (e.g. match=name:report). Unsupported properties are rejected with 400.  (optional)

try:
    # List Data Hub files
    api_response = api_instance.list_data_files(limit=limit, offset=offset, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FilesApi->list_data_files: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Maximum number of files to return (clamped to 100; default 25) | [optional] 
 **offset** | **int**| Number of files to skip before returning results | [optional] 
 **match** | **str**| Comma-separated list of property:value expressions to include only the files that satisfy the expression(s), following the same convention as the portfolio service. Supported properties: name — case-insensitive substring match on the file name (e.g. match&#x3D;name:report). Unsupported properties are rejected with 400.  | [optional] 

### Return type

[**DataFiles**](DataFiles.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **rename_data_file**
> DataFile rename_data_file(body, file_id)

Update a file utilizing JSON Patch operations

Updates a data file by applying a list of operations following the JSON Patch (RFC 6902) specification. Currently only REPLACE of /name is supported. A duplicate name within the tenant is rejected, as is a name whose extension is not in the upload allowlist. 

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
api_instance = dlxapi.FilesApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | JSON Patch operations to apply to the file
file_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Update a file utilizing JSON Patch operations
    api_response = api_instance.rename_data_file(body, file_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FilesApi->rename_data_file: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch operations to apply to the file | 
 **file_id** | [**str**](.md)|  | 

### Return type

[**DataFile**](DataFile.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_data_file**
> DataFile upload_data_file(file, name)

Upload a Data Hub file

Uploads a file (max 100 MB) and stores it in the tenant's object storage. Allowed types: PDF, CSV, text, RTF, JSON, YAML, Word, Excel, PowerPoint, and images. If the name is already taken within the tenant, an incrementing \" (n)\" suffix is appended before the extension (e.g. \"report (1).pdf\"). 

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
api_instance = dlxapi.FilesApi(dlxapi.ApiClient(configuration))
file = 'file_example' # str | 
name = 'name_example' # str | 

try:
    # Upload a Data Hub file
    api_response = api_instance.upload_data_file(file, name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FilesApi->upload_data_file: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **str**|  | 
 **name** | **str**|  | 

### Return type

[**DataFile**](DataFile.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

