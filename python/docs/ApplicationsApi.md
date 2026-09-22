# dlxapi.ApplicationsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_table_to_application**](ApplicationsApi.md#add_table_to_application) | **POST** /applications/{id}/tables | Add existing table to application
[**attach_file_to_application**](ApplicationsApi.md#attach_file_to_application) | **POST** /applications/{id}/files/{dataFileId} | Attach a file to an application
[**create_application**](ApplicationsApi.md#create_application) | **POST** /applications | Create application
[**create_tables_from_portfolio_for_application**](ApplicationsApi.md#create_tables_from_portfolio_for_application) | **POST** /applications/{id}/tables/from-portfolio | Create tables from portfolio
[**delete_application**](ApplicationsApi.md#delete_application) | **DELETE** /applications/{id} | Delete application
[**detach_file_from_application**](ApplicationsApi.md#detach_file_from_application) | **DELETE** /applications/{id}/files/{dataFileId} | Detach a file from an application
[**get_all_applications**](ApplicationsApi.md#get_all_applications) | **GET** /applications | Get all applications
[**get_application_by_id**](ApplicationsApi.md#get_application_by_id) | **GET** /applications/{id} | Get application by ID
[**list_application_files**](ApplicationsApi.md#list_application_files) | **GET** /applications/{id}/files | List files for an application
[**list_attachable_files**](ApplicationsApi.md#list_attachable_files) | **GET** /applications/{id}/attachable-files | List files that can be attached to an application
[**remove_table_from_application**](ApplicationsApi.md#remove_table_from_application) | **DELETE** /applications/{id}/tables/{key} | Unlink table from application
[**update_application**](ApplicationsApi.md#update_application) | **PUT** /applications/{id} | Update application
[**upload_table_for_application**](ApplicationsApi.md#upload_table_for_application) | **POST** /applications/{id}/tables/upload | Upload spreadsheet to application

# **add_table_to_application**
> Application add_table_to_application(body, id)

Add existing table to application

Links an existing DataHub table into the application under a user-friendly key

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
api_instance = dlxapi.ApplicationsApi(dlxapi.ApiClient(configuration))
body = dlxapi.IdTablesBody() # IdTablesBody | 
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Add existing table to application
    api_response = api_instance.add_table_to_application(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApplicationsApi->add_table_to_application: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdTablesBody**](IdTablesBody.md)|  | 
 **id** | [**str**](.md)|  | 

### Return type

[**Application**](Application.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **attach_file_to_application**
> InlineResponse201 attach_file_to_application(id, data_file_id)

Attach a file to an application

Both the application and the file must belong to the caller's tenant.

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
api_instance = dlxapi.ApplicationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 
data_file_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Attach a file to an application
    api_response = api_instance.attach_file_to_application(id, data_file_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApplicationsApi->attach_file_to_application: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 
 **data_file_id** | [**str**](.md)|  | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_application**
> Application create_application(body)

Create application

Creates a new application linked to an auth-service app

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
api_instance = dlxapi.ApplicationsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Application() # Application | 

try:
    # Create application
    api_response = api_instance.create_application(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApplicationsApi->create_application: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Application**](Application.md)|  | 

### Return type

[**Application**](Application.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_tables_from_portfolio_for_application**
> Application create_tables_from_portfolio_for_application(body, id)

Create tables from portfolio

Imports portfolio data as tables and links them to the application

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
api_instance = dlxapi.ApplicationsApi(dlxapi.ApiClient(configuration))
body = dlxapi.CreateTablesFromPortfolioRequest() # CreateTablesFromPortfolioRequest | 
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Create tables from portfolio
    api_response = api_instance.create_tables_from_portfolio_for_application(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApplicationsApi->create_tables_from_portfolio_for_application: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateTablesFromPortfolioRequest**](CreateTablesFromPortfolioRequest.md)|  | 
 **id** | [**str**](.md)|  | 

### Return type

[**Application**](Application.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_application**
> delete_application(id)

Delete application

Deletes the application record. Mapped tables are NOT deleted.

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
api_instance = dlxapi.ApplicationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Delete application
    api_instance.delete_application(id)
except ApiException as e:
    print("Exception when calling ApplicationsApi->delete_application: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **detach_file_from_application**
> detach_file_from_application(id, data_file_id)

Detach a file from an application

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
api_instance = dlxapi.ApplicationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 
data_file_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Detach a file from an application
    api_instance.detach_file_from_application(id, data_file_id)
except ApiException as e:
    print("Exception when calling ApplicationsApi->detach_file_from_application: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 
 **data_file_id** | [**str**](.md)|  | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_applications**
> Applications get_all_applications(limit=limit, offset=offset)

Get all applications

Retrieves list of all applications with table details for the authenticated tenant

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
api_instance = dlxapi.ApplicationsApi(dlxapi.ApiClient(configuration))
limit = 100 # int |  (optional) (default to 100)
offset = 0 # int |  (optional) (default to 0)

try:
    # Get all applications
    api_response = api_instance.get_all_applications(limit=limit, offset=offset)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApplicationsApi->get_all_applications: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**|  | [optional] [default to 100]
 **offset** | **int**|  | [optional] [default to 0]

### Return type

[**Applications**](Applications.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_application_by_id**
> Application get_application_by_id(id)

Get application by ID

Retrieves a single application with full table details

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
api_instance = dlxapi.ApplicationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Get application by ID
    api_response = api_instance.get_application_by_id(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApplicationsApi->get_application_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 

### Return type

[**Application**](Application.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_application_files**
> DataFiles list_application_files(id, limit=limit, offset=offset)

List files for an application

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
api_instance = dlxapi.ApplicationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 
limit = 56 # int |  (optional)
offset = 56 # int |  (optional)

try:
    # List files for an application
    api_response = api_instance.list_application_files(id, limit=limit, offset=offset)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApplicationsApi->list_application_files: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 
 **limit** | **int**|  | [optional] 
 **offset** | **int**|  | [optional] 

### Return type

[**DataFiles**](DataFiles.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_attachable_files**
> DataFiles list_attachable_files(id, limit=limit, offset=offset, match=match)

List files that can be attached to an application

Returns a page of the tenant's files that are NOT already attached to this application, ordered by createdAt descending. Useful for populating an \"attach existing file\" picker. 

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
api_instance = dlxapi.ApplicationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 
limit = 56 # int | Maximum number of files to return (clamped to 100; default 25) (optional)
offset = 56 # int | Number of files to skip before returning results (optional)
match = 'match_example' # str | Comma-separated list of property:value expressions to include only the files that satisfy the expression(s). Supported properties: name — case-insensitive substring match on the file name (e.g. match=name:report). Unsupported properties are rejected with 400.  (optional)

try:
    # List files that can be attached to an application
    api_response = api_instance.list_attachable_files(id, limit=limit, offset=offset, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApplicationsApi->list_attachable_files: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 
 **limit** | **int**| Maximum number of files to return (clamped to 100; default 25) | [optional] 
 **offset** | **int**| Number of files to skip before returning results | [optional] 
 **match** | **str**| Comma-separated list of property:value expressions to include only the files that satisfy the expression(s). Supported properties: name — case-insensitive substring match on the file name (e.g. match&#x3D;name:report). Unsupported properties are rejected with 400.  | [optional] 

### Return type

[**DataFiles**](DataFiles.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_table_from_application**
> Application remove_table_from_application(id, key)

Unlink table from application

Removes a table mapping from the application. The underlying table data is NOT deleted.

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
api_instance = dlxapi.ApplicationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 
key = 'key_example' # str | 

try:
    # Unlink table from application
    api_response = api_instance.remove_table_from_application(id, key)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApplicationsApi->remove_table_from_application: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 
 **key** | **str**|  | 

### Return type

[**Application**](Application.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_application**
> Application update_application(body, id)

Update application

Updates name, description, or mappings of an application

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
api_instance = dlxapi.ApplicationsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Application() # Application | 
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Update application
    api_response = api_instance.update_application(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApplicationsApi->update_application: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Application**](Application.md)|  | 
 **id** | [**str**](.md)|  | 

### Return type

[**Application**](Application.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_table_for_application**
> Application upload_table_for_application(file, table_display_name, id)

Upload spreadsheet to application

Uploads a spreadsheet, creates a new DataHub table, and links it to the application

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
api_instance = dlxapi.ApplicationsApi(dlxapi.ApiClient(configuration))
file = 'file_example' # str | 
table_display_name = 'table_display_name_example' # str | 
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Upload spreadsheet to application
    api_response = api_instance.upload_table_for_application(file, table_display_name, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApplicationsApi->upload_table_for_application: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **str**|  | 
 **table_display_name** | **str**|  | 
 **id** | [**str**](.md)|  | 

### Return type

[**Application**](Application.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

