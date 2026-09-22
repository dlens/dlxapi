# dlxapi.ConnectorsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_connection**](ConnectorsApi.md#create_connection) | **POST** /connectors/{id}/connections | Add a connection (table) to the connector
[**create_connector**](ConnectorsApi.md#create_connector) | **POST** /connectors | Create a connector
[**delete_connection**](ConnectorsApi.md#delete_connection) | **DELETE** /connectors/{id}/connections/{connectionId} | Delete a connection
[**delete_connector**](ConnectorsApi.md#delete_connector) | **DELETE** /connectors/{id} | Delete a connector
[**discover_connector_parameter_options**](ConnectorsApi.md#discover_connector_parameter_options) | **GET** /connectors/{id}/discover/{parameter} | Discover dynamic options for a parameter
[**execute_connector_action**](ConnectorsApi.md#execute_connector_action) | **POST** /connectors/{id}/actions/{action} | Execute a parameter-level action
[**get_connection_executions**](ConnectorsApi.md#get_connection_executions) | **GET** /connectors/{id}/connections/{connectionId}/executions | List connection run history
[**get_connections**](ConnectorsApi.md#get_connections) | **GET** /connectors/{id}/connections | List connector connections
[**get_connector_by_id**](ConnectorsApi.md#get_connector_by_id) | **GET** /connectors/{id} | Get connector details
[**get_connector_types**](ConnectorsApi.md#get_connector_types) | **GET** /connectors/types | Discover available connector types
[**get_connectors**](ConnectorsApi.md#get_connectors) | **GET** /connectors | List connectors
[**refresh_connection**](ConnectorsApi.md#refresh_connection) | **POST** /connectors/{id}/connections/{connectionId}/refresh | Refresh one connection
[**sync_connector**](ConnectorsApi.md#sync_connector) | **POST** /connectors/{id}/sync | Sync all connector tables
[**test_connector**](ConnectorsApi.md#test_connector) | **POST** /connectors/test | Test an external connection
[**update_connection**](ConnectorsApi.md#update_connection) | **PATCH** /connectors/{id}/connections/{connectionId} | Edit a connection
[**update_connector**](ConnectorsApi.md#update_connector) | **PATCH** /connectors/{id} | Update a connector

# **create_connection**
> Connection create_connection(body, id)

Add a connection (table) to the connector

Post the Connection resource (appId + connection-scoped parameter values; server-owned fields are readOnly). Persists the connection, runs the initial ingest, creates the table, and adds it to the application's App Tables. The run is recorded as an execution.

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
api_instance = dlxapi.ConnectorsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Connection() # Connection | 
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Add a connection (table) to the connector
    api_response = api_instance.create_connection(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->create_connection: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Connection**](Connection.md)|  | 
 **id** | [**str**](.md)|  | 

### Return type

[**Connection**](Connection.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_connector**
> Connector create_connector(body)

Create a connector

Creates a tenant-scoped connector (Admin only) — post the Connector resource; server-owned fields are readOnly. Secret parameters are encrypted at rest. A connector with zero connections is a valid state.

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
api_instance = dlxapi.ConnectorsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Connector() # Connector | 

try:
    # Create a connector
    api_response = api_instance.create_connector(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->create_connector: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Connector**](Connector.md)|  | 

### Return type

[**Connector**](Connector.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_connection**
> DeleteTableResponse delete_connection(id, connection_id)

Delete a connection

Drops the connection and its table (DuckDB drop + metadata + removal from application mappings).

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
api_instance = dlxapi.ConnectorsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 
connection_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Delete a connection
    api_response = api_instance.delete_connection(id, connection_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->delete_connection: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 
 **connection_id** | [**str**](.md)|  | 

### Return type

[**DeleteTableResponse**](DeleteTableResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_connector**
> DeleteTableResponse delete_connector(id)

Delete a connector

Admin only. Cascade: all connections, all their tables (DuckDB drop + metadata + removal from application mappings), then the connector.

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
api_instance = dlxapi.ConnectorsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Delete a connector
    api_response = api_instance.delete_connector(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->delete_connector: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 

### Return type

[**DeleteTableResponse**](DeleteTableResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **discover_connector_parameter_options**
> DiscoveredOptions discover_connector_parameter_options(id, parameter, query=query)

Discover dynamic options for a parameter

Resolves a parameter's dynamic options (optionsFrom) via the connector's strategy, running against the connector's stored credentials. Visible to all members.

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
api_instance = dlxapi.ConnectorsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 
parameter = 'parameter_example' # str | Spec parameter name declaring optionsFrom
query = 'query_example' # str | Search text (optional)

try:
    # Discover dynamic options for a parameter
    api_response = api_instance.discover_connector_parameter_options(id, parameter, query=query)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->discover_connector_parameter_options: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 
 **parameter** | **str**| Spec parameter name declaring optionsFrom | 
 **query** | **str**| Search text | [optional] 

### Return type

[**DiscoveredOptions**](DiscoveredOptions.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **execute_connector_action**
> ConnectorActionResponse execute_connector_action(body, id, action)

Execute a parameter-level action

Parameter-level resolve/validate round-trips declared in the spec. First consumer: Jira's paste-a-filter-URL resolve (host-match + accessibility check + preview). Visible to all app members.

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
api_instance = dlxapi.ConnectorsApi(dlxapi.ApiClient(configuration))
body = dlxapi.ConnectorActionRequest() # ConnectorActionRequest | 
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 
action = 'action_example' # str | Action name declared on a spec parameter

try:
    # Execute a parameter-level action
    api_response = api_instance.execute_connector_action(body, id, action)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->execute_connector_action: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectorActionRequest**](ConnectorActionRequest.md)|  | 
 **id** | [**str**](.md)|  | 
 **action** | **str**| Action name declared on a spec parameter | 

### Return type

[**ConnectorActionResponse**](ConnectorActionResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connection_executions**
> ConnectionExecutions get_connection_executions(id, connection_id, limit=limit, offset=offset)

List connection run history

Paged run history for a connection, newest first — one execution per ingest, refresh, edit re-ingest, or \"Sync now\" table.

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
api_instance = dlxapi.ConnectorsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 
connection_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 
limit = 56 # int | Page size (default 20, max 100) (optional)
offset = 56 # int | Rows to skip (default 0) (optional)

try:
    # List connection run history
    api_response = api_instance.get_connection_executions(id, connection_id, limit=limit, offset=offset)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connection_executions: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 
 **connection_id** | [**str**](.md)|  | 
 **limit** | **int**| Page size (default 20, max 100) | [optional] 
 **offset** | **int**| Rows to skip (default 0) | [optional] 

### Return type

[**ConnectionExecutions**](ConnectionExecutions.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connections**
> Connections get_connections(id)

List connector connections

Lists connections with per-table refresh status.

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
api_instance = dlxapi.ConnectorsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # List connector connections
    api_response = api_instance.get_connections(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connections: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 

### Return type

[**Connections**](Connections.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connector_by_id**
> Connector get_connector_by_id(id)

Get connector details

Connector details; secret parameters are never returned.

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
api_instance = dlxapi.ConnectorsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Get connector details
    api_response = api_instance.get_connector_by_id(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connector_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 

### Return type

[**Connector**](Connector.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connector_types**
> ConnectorSpecs get_connector_types()

Discover available connector types

The tenant's effective connector specs (code-owned registry intersected with the tenant allowlist) with full parameter schemas — drives all connector forms.

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
api_instance = dlxapi.ConnectorsApi(dlxapi.ApiClient(configuration))

try:
    # Discover available connector types
    api_response = api_instance.get_connector_types()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connector_types: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConnectorSpecs**](ConnectorSpecs.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connectors**
> Connectors get_connectors()

List connectors

Lists the tenant's connectors with sync status and the connections each powers (App Connectors section). Visible to all members.

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
api_instance = dlxapi.ConnectorsApi(dlxapi.ApiClient(configuration))

try:
    # List connectors
    api_response = api_instance.get_connectors()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connectors: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Connectors**](Connectors.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **refresh_connection**
> Connection refresh_connection(id, connection_id)

Refresh one connection

Rebuilds the table from the stored connection via a safe swap (build new, validate, atomic rename); a failed refresh never corrupts the existing table. The run is recorded as an execution.

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
api_instance = dlxapi.ConnectorsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 
connection_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Refresh one connection
    api_response = api_instance.refresh_connection(id, connection_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->refresh_connection: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 
 **connection_id** | [**str**](.md)|  | 

### Return type

[**Connection**](Connection.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sync_connector**
> ConnectorSyncResponse sync_connector(id)

Sync all connector tables

Refreshes every connection sequentially with per-table results; partial failure does not abort remaining tables. Each table's run is recorded as an execution.

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
api_instance = dlxapi.ConnectorsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Sync all connector tables
    api_response = api_instance.sync_connector(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->sync_connector: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 

### Return type

[**ConnectorSyncResponse**](ConnectorSyncResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **test_connector**
> TestConnectorResponse test_connector(body)

Test an external connection

Validates connector-scoped parameter values against the external system without persisting anything.

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
api_instance = dlxapi.ConnectorsApi(dlxapi.ApiClient(configuration))
body = dlxapi.TestConnectorRequest() # TestConnectorRequest | 

try:
    # Test an external connection
    api_response = api_instance.test_connector(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->test_connector: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TestConnectorRequest**](TestConnectorRequest.md)|  | 

### Return type

[**TestConnectorResponse**](TestConnectorResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_connection**
> Connection update_connection(body, id, connection_id)

Edit a connection

JSON Patch (RFC 6902) update: replace/add/remove /parameterValues/<key>. A source change triggers full re-ingest with table swap; the run is recorded as an execution.

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
api_instance = dlxapi.ConnectorsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | 
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 
connection_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Edit a connection
    api_response = api_instance.update_connection(body, id, connection_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->update_connection: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)|  | 
 **id** | [**str**](.md)|  | 
 **connection_id** | [**str**](.md)|  | 

### Return type

[**Connection**](Connection.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_connector**
> Connector update_connector(body, id)

Update a connector

JSON Patch (RFC 6902) update (Admin only): replace /name, or replace/add/remove /parameterValues/<key>. Untouched paths keep their values, so secrets stay put without resending them.

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
api_instance = dlxapi.ConnectorsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | 
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Update a connector
    api_response = api_instance.update_connector(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->update_connector: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)|  | 
 **id** | [**str**](.md)|  | 

### Return type

[**Connector**](Connector.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

