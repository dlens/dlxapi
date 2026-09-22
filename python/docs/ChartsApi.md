# dlxapi.ChartsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copy_charts**](ChartsApi.md#copy_charts) | **POST** /charts/copy | Copy chart configurations to another source
[**create_chart**](ChartsApi.md#create_chart) | **POST** /charts | Create chart configuration
[**delete_chart**](ChartsApi.md#delete_chart) | **DELETE** /charts/{id} | Delete chart configuration
[**delete_snapshot_charts**](ChartsApi.md#delete_snapshot_charts) | **DELETE** /charts/snapshot/{snapshotId} | Delete the captured charts for a portfolio snapshot
[**get_chart**](ChartsApi.md#get_chart) | **GET** /charts/{id} | Get chart configuration by ID
[**get_chart_data**](ChartsApi.md#get_chart_data) | **GET** /charts/{id}/data | Get computed chart data
[**get_chart_data_for_config**](ChartsApi.md#get_chart_data_for_config) | **POST** /charts/data | Get computed chart data from a chart config supplied in the request body
[**get_chart_source_structure**](ChartsApi.md#get_chart_source_structure) | **GET** /charts/sources/{type}/{id}/structure | Get data source structure
[**get_charts**](ChartsApi.md#get_charts) | **GET** /charts | List chart configurations
[**update_chart**](ChartsApi.md#update_chart) | **PATCH** /charts/{id} | Updates a chart configuration utilizing JSON Patch Operations.

# **copy_charts**
> Charts copy_charts(body)

Copy chart configurations to another source

Duplicates every chart configuration belonging to a source (e.g. a portfolio) onto a target source, creating brand-new chart records with fresh ids and timestamps. Field references inside axes/filters are remapped using fieldIdMapping where a mapping exists; unmapped column ids (built-in columns or fields without a mapping) are left unchanged.

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
api_instance = dlxapi.ChartsApi(dlxapi.ApiClient(configuration))
body = dlxapi.CopyChartsRequest() # CopyChartsRequest | 

try:
    # Copy chart configurations to another source
    api_response = api_instance.copy_charts(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ChartsApi->copy_charts: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CopyChartsRequest**](CopyChartsRequest.md)|  | 

### Return type

[**Charts**](Charts.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_chart**
> Chart create_chart(body)

Create chart configuration

Creates a new saved chart configuration

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
api_instance = dlxapi.ChartsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Chart() # Chart | 

try:
    # Create chart configuration
    api_response = api_instance.create_chart(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ChartsApi->create_chart: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Chart**](Chart.md)|  | 

### Return type

[**Chart**](Chart.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_chart**
> delete_chart(id)

Delete chart configuration

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
api_instance = dlxapi.ChartsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Delete chart configuration
    api_instance.delete_chart(id)
except ApiException as e:
    print("Exception when calling ChartsApi->delete_chart: %s\n" % e)
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

# **delete_snapshot_charts**
> delete_snapshot_charts(snapshot_id)

Delete the captured charts for a portfolio snapshot

Removes every chart configuration captured for the given snapshot (sourceType SNAPSHOT, sourceId = snapshotId). Called by portfolio-service when a snapshot is deleted, evicted, or discarded during restore so no orphaned snapshot charts remain.

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
api_instance = dlxapi.ChartsApi(dlxapi.ApiClient(configuration))
snapshot_id = 'snapshot_id_example' # str | Id of the snapshot whose captured charts should be removed

try:
    # Delete the captured charts for a portfolio snapshot
    api_instance.delete_snapshot_charts(snapshot_id)
except ApiException as e:
    print("Exception when calling ChartsApi->delete_snapshot_charts: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshot_id** | **str**| Id of the snapshot whose captured charts should be removed | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_chart**
> Chart get_chart(id)

Get chart configuration by ID

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
api_instance = dlxapi.ChartsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Get chart configuration by ID
    api_response = api_instance.get_chart(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ChartsApi->get_chart: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 

### Return type

[**Chart**](Chart.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_chart_data**
> ChartData get_chart_data(id, plan_id=plan_id)

Get computed chart data

Returns computed chart data for a saved chart config, with runtime params (e.g. planId)

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
api_instance = dlxapi.ChartsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 
plan_id = 'plan_id_example' # str |  (optional)

try:
    # Get computed chart data
    api_response = api_instance.get_chart_data(id, plan_id=plan_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ChartsApi->get_chart_data: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 
 **plan_id** | **str**|  | [optional] 

### Return type

[**ChartData**](ChartData.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_chart_data_for_config**
> ChartData get_chart_data_for_config(body, plan_id=plan_id)

Get computed chart data from a chart config supplied in the request body

Returns computed chart data for an unsaved chart config sent in the request body, with runtime params (e.g. planId) supplied as query parameters. Mirrors GET /charts/{id}/data but does not require the chart to be persisted.  This endpoint additionally accepts a MEASURE-ONLY config — `axes.y` with no `axes.x` — and answers it with a single-point series carrying one aggregate over the whole source (`series[0].data[0]`), which is what a dashboard's Numeric Tile element displays. `axes.x` remains required in the AxesConfig schema because every SAVED chart has a dimension; only this endpoint relaxes it, and an `axes.x` that is present without a `columnId` is still a 400.

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
api_instance = dlxapi.ChartsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Chart() # Chart | 
plan_id = 'plan_id_example' # str |  (optional)

try:
    # Get computed chart data from a chart config supplied in the request body
    api_response = api_instance.get_chart_data_for_config(body, plan_id=plan_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ChartsApi->get_chart_data_for_config: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Chart**](Chart.md)|  | 
 **plan_id** | **str**|  | [optional] 

### Return type

[**ChartData**](ChartData.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_chart_source_structure**
> list[ChartDataSchema] get_chart_source_structure(type, id)

Get data source structure

Returns the available tables and columns for a given data source. Supported source types (see ChartSourceType): PORTFOLIO / SNAPSHOT (id = portfolioId / snapshotId) and TABLE (id = DataHub tableName). Matched case-insensitively.

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
api_instance = dlxapi.ChartsApi(dlxapi.ApiClient(configuration))
type = 'type_example' # str | 
id = 'id_example' # str | 

try:
    # Get data source structure
    api_response = api_instance.get_chart_source_structure(type, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ChartsApi->get_chart_source_structure: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **str**|  | 
 **id** | **str**|  | 

### Return type

[**list[ChartDataSchema]**](ChartDataSchema.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_charts**
> Charts get_charts(source_type=source_type, source_id=source_id, chart_type=chart_type)

List chart configurations

Returns all saved chart configurations, optionally filtered by source and by chart type.

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
api_instance = dlxapi.ChartsApi(dlxapi.ApiClient(configuration))
source_type = 'source_type_example' # str |  (optional)
source_id = 'source_id_example' # str |  (optional)
chart_type = ['chart_type_example'] # list[str] | Restrict the listing to these types (repeat the parameter, or pass one comma-separated value). Matched case-insensitively against `chartType`, so the values are `ChartType` and `ElementType` members alike. Omitted returns every type. A surface that can only render plotted charts asks for the plotted types, so a NUMERIC_TILE record — a custom element with no dimension to draw — is never offered to it (DL4-35019). (optional)

try:
    # List chart configurations
    api_response = api_instance.get_charts(source_type=source_type, source_id=source_id, chart_type=chart_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ChartsApi->get_charts: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source_type** | **str**|  | [optional] 
 **source_id** | **str**|  | [optional] 
 **chart_type** | [**list[str]**](str.md)| Restrict the listing to these types (repeat the parameter, or pass one comma-separated value). Matched case-insensitively against &#x60;chartType&#x60;, so the values are &#x60;ChartType&#x60; and &#x60;ElementType&#x60; members alike. Omitted returns every type. A surface that can only render plotted charts asks for the plotted types, so a NUMERIC_TILE record — a custom element with no dimension to draw — is never offered to it (DL4-35019). | [optional] 

### Return type

[**Charts**](Charts.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_chart**
> Chart update_chart(body, id)

Updates a chart configuration utilizing JSON Patch Operations.

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
api_instance = dlxapi.ChartsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | JSON Patch Operations to update the chart configuration.
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Updates a chart configuration utilizing JSON Patch Operations.
    api_response = api_instance.update_chart(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ChartsApi->update_chart: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update the chart configuration. | 
 **id** | [**str**](.md)|  | 

### Return type

[**Chart**](Chart.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

