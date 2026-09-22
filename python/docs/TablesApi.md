# dlxapi.TablesApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_table_column**](TablesApi.md#add_table_column) | **POST** /tables/{tableName}/columns | Add a column to a table
[**create_tables_from_portfolio**](TablesApi.md#create_tables_from_portfolio) | **POST** /tables/from-portfolio | Create tables from DLX portfolio
[**delete_table**](TablesApi.md#delete_table) | **DELETE** /tables/{tableName} | Delete table
[**delete_table_rows**](TablesApi.md#delete_table_rows) | **DELETE** /tables/{tableName}/rows | Delete rows from a table
[**get_all_tables**](TablesApi.md#get_all_tables) | **GET** /tables | Get all tables
[**get_table_by_name**](TablesApi.md#get_table_by_name) | **GET** /tables/{tableName} | Get table details
[**insert_table_rows**](TablesApi.md#insert_table_rows) | **POST** /tables/{tableName}/rows | Insert rows into a table
[**rename_table**](TablesApi.md#rename_table) | **PATCH** /tables/{tableName} | Update table display name
[**replace_table_content**](TablesApi.md#replace_table_content) | **PUT** /tables/{tableName}/content | Replace table data
[**update_table_rows**](TablesApi.md#update_table_rows) | **PATCH** /tables/{tableName}/rows | Update rows in a table
[**upload_file**](TablesApi.md#upload_file) | **POST** /tables/upload | Upload data file

# **add_table_column**
> AddColumnResponse add_table_column(body, table_name)

Add a column to a table

Adds a new column to a spreadsheet-sourced table. Existing rows receive NULL for the new column. Portfolio-sourced tables are read-only (405).

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
api_instance = dlxapi.TablesApi(dlxapi.ApiClient(configuration))
body = dlxapi.AddColumnRequest() # AddColumnRequest | 
table_name = 'table_name_example' # str | Name of the table

try:
    # Add a column to a table
    api_response = api_instance.add_table_column(body, table_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TablesApi->add_table_column: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddColumnRequest**](AddColumnRequest.md)|  | 
 **table_name** | **str**| Name of the table | 

### Return type

[**AddColumnResponse**](AddColumnResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_tables_from_portfolio**
> CreateTablesFromPortfolioResponse create_tables_from_portfolio(body)

Create tables from DLX portfolio

Creates one DuckDB table per non-empty sheet (Projects, Requests, Scoresheet, …) from the baseline-plan XLSX export of a DLX portfolio. The calling user must be an Owner or Participant of the portfolio. 

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
api_instance = dlxapi.TablesApi(dlxapi.ApiClient(configuration))
body = dlxapi.CreateTablesFromPortfolioRequest() # CreateTablesFromPortfolioRequest | 

try:
    # Create tables from DLX portfolio
    api_response = api_instance.create_tables_from_portfolio(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TablesApi->create_tables_from_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateTablesFromPortfolioRequest**](CreateTablesFromPortfolioRequest.md)|  | 

### Return type

[**CreateTablesFromPortfolioResponse**](CreateTablesFromPortfolioResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_table**
> DeleteTableResponse delete_table(table_name)

Delete table

Deletes a table by name

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
api_instance = dlxapi.TablesApi(dlxapi.ApiClient(configuration))
table_name = 'table_name_example' # str | Name of the table to delete

try:
    # Delete table
    api_response = api_instance.delete_table(table_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TablesApi->delete_table: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **table_name** | **str**| Name of the table to delete | 

### Return type

[**DeleteTableResponse**](DeleteTableResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_table_rows**
> MutateRowsResponse delete_table_rows(body, table_name)

Delete rows from a table

Deletes rows by id. Portfolio-sourced tables are read-only (405).

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
api_instance = dlxapi.TablesApi(dlxapi.ApiClient(configuration))
body = dlxapi.DeleteRowsRequest() # DeleteRowsRequest | 
table_name = 'table_name_example' # str | Name of the table

try:
    # Delete rows from a table
    api_response = api_instance.delete_table_rows(body, table_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TablesApi->delete_table_rows: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteRowsRequest**](DeleteRowsRequest.md)|  | 
 **table_name** | **str**| Name of the table | 

### Return type

[**MutateRowsResponse**](MutateRowsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_tables**
> TablesListResponse get_all_tables(limit=limit, offset=offset)

Get all tables

Retrieves list of all data tables with metadata

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
api_instance = dlxapi.TablesApi(dlxapi.ApiClient(configuration))
limit = 100 # int | Maximum number of tables to return (optional) (default to 100)
offset = 0 # int | Number of tables to skip (optional) (default to 0)

try:
    # Get all tables
    api_response = api_instance.get_all_tables(limit=limit, offset=offset)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TablesApi->get_all_tables: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Maximum number of tables to return | [optional] [default to 100]
 **offset** | **int**| Number of tables to skip | [optional] [default to 0]

### Return type

[**TablesListResponse**](TablesListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_table_by_name**
> TableDetailResponse get_table_by_name(table_name)

Get table details

Retrieves table metadata and data by table name

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
api_instance = dlxapi.TablesApi(dlxapi.ApiClient(configuration))
table_name = 'table_name_example' # str | Name of the table

try:
    # Get table details
    api_response = api_instance.get_table_by_name(table_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TablesApi->get_table_by_name: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **table_name** | **str**| Name of the table | 

### Return type

[**TableDetailResponse**](TableDetailResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **insert_table_rows**
> MutateRowsResponse insert_table_rows(body, table_name)

Insert rows into a table

Inserts one or more rows into a spreadsheet-sourced table. Portfolio-sourced tables are read-only (405).

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
api_instance = dlxapi.TablesApi(dlxapi.ApiClient(configuration))
body = dlxapi.InsertRowsRequest() # InsertRowsRequest | 
table_name = 'table_name_example' # str | Name of the table

try:
    # Insert rows into a table
    api_response = api_instance.insert_table_rows(body, table_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TablesApi->insert_table_rows: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InsertRowsRequest**](InsertRowsRequest.md)|  | 
 **table_name** | **str**| Name of the table | 

### Return type

[**MutateRowsResponse**](MutateRowsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **rename_table**
> DataTable rename_table(body, table_name)

Update table display name

Updates the user-facing display name (tableDisplayName). The DuckDB table name stays unchanged. Accepts user-friendly names with spaces (e.g. \"SyncPort1 4 Eva_scoresheet Hi\").

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
api_instance = dlxapi.TablesApi(dlxapi.ApiClient(configuration))
body = dlxapi.TablesTableNameBody() # TablesTableNameBody | 
table_name = 'table_name_example' # str | The DuckDB table name (tableName) used to identify the table

try:
    # Update table display name
    api_response = api_instance.rename_table(body, table_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TablesApi->rename_table: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TablesTableNameBody**](TablesTableNameBody.md)|  | 
 **table_name** | **str**| The DuckDB table name (tableName) used to identify the table | 

### Return type

[**DataTable**](DataTable.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **replace_table_content**
> DataTable replace_table_content(file, table_name)

Replace table data

Replaces data for an existing table using an uploaded data file (canonical path; legacy alias uses /replace).

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
api_instance = dlxapi.TablesApi(dlxapi.ApiClient(configuration))
file = 'file_example' # str | 
table_name = 'table_name_example' # str | Name of the table to replace

try:
    # Replace table data
    api_response = api_instance.replace_table_content(file, table_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TablesApi->replace_table_content: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **str**|  | 
 **table_name** | **str**| Name of the table to replace | 

### Return type

[**DataTable**](DataTable.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_table_rows**
> MutateRowsResponse update_table_rows(body, table_name)

Update rows in a table

Updates existing rows by id (last-write-wins). Portfolio-sourced tables are read-only (405).

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
api_instance = dlxapi.TablesApi(dlxapi.ApiClient(configuration))
body = dlxapi.UpdateRowsRequest() # UpdateRowsRequest | 
table_name = 'table_name_example' # str | Name of the table

try:
    # Update rows in a table
    api_response = api_instance.update_table_rows(body, table_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TablesApi->update_table_rows: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateRowsRequest**](UpdateRowsRequest.md)|  | 
 **table_name** | **str**| Name of the table | 

### Return type

[**MutateRowsResponse**](MutateRowsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_file**
> UploadResult upload_file(file, table_display_name)

Upload data file

Uploads a data file (CSV, JSON, Excel, or Parquet) and creates a new table

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
api_instance = dlxapi.TablesApi(dlxapi.ApiClient(configuration))
file = 'file_example' # str | 
table_display_name = 'table_display_name_example' # str | 

try:
    # Upload data file
    api_response = api_instance.upload_file(file, table_display_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TablesApi->upload_file: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **str**|  | 
 **table_display_name** | **str**|  | 

### Return type

[**UploadResult**](UploadResult.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

