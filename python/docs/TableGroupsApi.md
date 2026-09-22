# dlxapi.TableGroupsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_table_group**](TableGroupsApi.md#create_table_group) | **POST** /table-groups | Create table group
[**delete_table_group**](TableGroupsApi.md#delete_table_group) | **DELETE** /table-groups/{id} | Delete table group
[**get_all_table_groups**](TableGroupsApi.md#get_all_table_groups) | **GET** /table-groups | Get all table groups
[**get_table_group_by_id**](TableGroupsApi.md#get_table_group_by_id) | **GET** /table-groups/{id} | Get table group by ID
[**get_tables_by_table_group_number**](TableGroupsApi.md#get_tables_by_table_group_number) | **GET** /table-groups/{tableGroupNumber}/tables | Get tables by group number
[**refresh_table_group**](TableGroupsApi.md#refresh_table_group) | **POST** /table-groups/{id}/refresh | Refresh a portfolio-backed table group
[**update_table_group**](TableGroupsApi.md#update_table_group) | **PUT** /table-groups/{id} | Update table group

# **create_table_group**
> TableGroup create_table_group(body)

Create table group

Creates a new table group

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
api_instance = dlxapi.TableGroupsApi(dlxapi.ApiClient(configuration))
body = dlxapi.CreateTableGroupRequest() # CreateTableGroupRequest | Table group to create

try:
    # Create table group
    api_response = api_instance.create_table_group(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TableGroupsApi->create_table_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateTableGroupRequest**](CreateTableGroupRequest.md)| Table group to create | 

### Return type

[**TableGroup**](TableGroup.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_table_group**
> DeleteTableGroupResponse delete_table_group(id)

Delete table group

Deletes a table group by ID

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
api_instance = dlxapi.TableGroupsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the table group to delete

try:
    # Delete table group
    api_response = api_instance.delete_table_group(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TableGroupsApi->delete_table_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| ID of the table group to delete | 

### Return type

[**DeleteTableGroupResponse**](DeleteTableGroupResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_table_groups**
> TableGroupsListResponse get_all_table_groups(limit=limit, offset=offset)

Get all table groups

Retrieves list of all table groups with details

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
api_instance = dlxapi.TableGroupsApi(dlxapi.ApiClient(configuration))
limit = 100 # int | Maximum number of groups to return (optional) (default to 100)
offset = 0 # int | Number of groups to skip (optional) (default to 0)

try:
    # Get all table groups
    api_response = api_instance.get_all_table_groups(limit=limit, offset=offset)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TableGroupsApi->get_all_table_groups: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Maximum number of groups to return | [optional] [default to 100]
 **offset** | **int**| Number of groups to skip | [optional] [default to 0]

### Return type

[**TableGroupsListResponse**](TableGroupsListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_table_group_by_id**
> TableGroupDetails get_table_group_by_id(id)

Get table group by ID

Retrieves a table group with details by ID

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
api_instance = dlxapi.TableGroupsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the table group

try:
    # Get table group by ID
    api_response = api_instance.get_table_group_by_id(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TableGroupsApi->get_table_group_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| ID of the table group | 

### Return type

[**TableGroupDetails**](TableGroupDetails.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_tables_by_table_group_number**
> list[str] get_tables_by_table_group_number(table_group_number)

Get tables by group number

Retrieves all tables in a table group by group number

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
api_instance = dlxapi.TableGroupsApi(dlxapi.ApiClient(configuration))
table_group_number = 'table_group_number_example' # str | Table group number of the tables to retrieve

try:
    # Get tables by group number
    api_response = api_instance.get_tables_by_table_group_number(table_group_number)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TableGroupsApi->get_tables_by_table_group_number: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **table_group_number** | **str**| Table group number of the tables to retrieve | 

### Return type

**list[str]**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **refresh_table_group**
> TableGroupDetails refresh_table_group(id)

Refresh a portfolio-backed table group

Refreshes a portfolio-backed table group from the latest baseline-plan XLSX export of its originating DLX portfolio.

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
api_instance = dlxapi.TableGroupsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the table group to refresh

try:
    # Refresh a portfolio-backed table group
    api_response = api_instance.refresh_table_group(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TableGroupsApi->refresh_table_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| ID of the table group to refresh | 

### Return type

[**TableGroupDetails**](TableGroupDetails.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_table_group**
> TableGroup update_table_group(body, id)

Update table group

Updates an existing table group

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
api_instance = dlxapi.TableGroupsApi(dlxapi.ApiClient(configuration))
body = dlxapi.UpdateTableGroupRequest() # UpdateTableGroupRequest | Updated table group data
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the table group to update

try:
    # Update table group
    api_response = api_instance.update_table_group(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TableGroupsApi->update_table_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateTableGroupRequest**](UpdateTableGroupRequest.md)| Updated table group data | 
 **id** | [**str**](.md)| ID of the table group to update | 

### Return type

[**TableGroup**](TableGroup.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

