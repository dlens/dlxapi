# dlxapi.SnapshotsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_portfolio_from_snapshot**](SnapshotsApi.md#create_portfolio_from_snapshot) | **POST** /snapshots/{snapshotId}/portfolio | Creates a new portfolio from a snapshot
[**create_snapshot**](SnapshotsApi.md#create_snapshot) | **POST** /snapshots | Creates a new snapshot for a portfolio
[**delete_snapshot**](SnapshotsApi.md#delete_snapshot) | **DELETE** /snapshots/{snapshotId} | Deletes a snapshot
[**get_snapshot**](SnapshotsApi.md#get_snapshot) | **GET** /snapshots/{snapshotId} | Retrieves a specific snapshot by ID
[**get_snapshots_for_portfolio**](SnapshotsApi.md#get_snapshots_for_portfolio) | **GET** /snapshots | Retrieves all snapshots for a portfolio
[**restore_snapshot**](SnapshotsApi.md#restore_snapshot) | **POST** /snapshots/{snapshotId}/restore | Restores a portfolio to the state captured in the snapshot
[**update_snapshot**](SnapshotsApi.md#update_snapshot) | **PATCH** /snapshots/{snapshotId} | Updates a snapshot

# **create_portfolio_from_snapshot**
> Portfolio create_portfolio_from_snapshot(snapshot_id, name=name, copy_fields=copy_fields, copy_projects=copy_projects, copy_people=copy_people, copy_comments=copy_comments)

Creates a new portfolio from a snapshot

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
api_instance = dlxapi.SnapshotsApi(dlxapi.ApiClient(configuration))
snapshot_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Snapshot id
name = 'name_example' # str | Optional name for the new portfolio. If omitted, the snapshot name is used (with version disambiguation). (optional)
copy_fields = true # bool | Copy fields from the snapshot. Defaults to true. (optional) (default to true)
copy_projects = true # bool | Copy projects from the snapshot. Defaults to true. (optional) (default to true)
copy_people = true # bool | Copy people and permissions from the source portfolio. Defaults to true. (optional) (default to true)
copy_comments = false # bool | Copy comments from the snapshot. Defaults to false. (optional) (default to false)

try:
    # Creates a new portfolio from a snapshot
    api_response = api_instance.create_portfolio_from_snapshot(snapshot_id, name=name, copy_fields=copy_fields, copy_projects=copy_projects, copy_people=copy_people, copy_comments=copy_comments)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SnapshotsApi->create_portfolio_from_snapshot: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshot_id** | [**str**](.md)| Snapshot id | 
 **name** | **str**| Optional name for the new portfolio. If omitted, the snapshot name is used (with version disambiguation). | [optional] 
 **copy_fields** | **bool**| Copy fields from the snapshot. Defaults to true. | [optional] [default to true]
 **copy_projects** | **bool**| Copy projects from the snapshot. Defaults to true. | [optional] [default to true]
 **copy_people** | **bool**| Copy people and permissions from the source portfolio. Defaults to true. | [optional] [default to true]
 **copy_comments** | **bool**| Copy comments from the snapshot. Defaults to false. | [optional] [default to false]

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_snapshot**
> Snapshot create_snapshot(body, portfolio_id)

Creates a new snapshot for a portfolio

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
api_instance = dlxapi.SnapshotsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Snapshot() # Snapshot | Snapshot details
portfolio_id = 'portfolio_id_example' # str | Portfolio id

try:
    # Creates a new snapshot for a portfolio
    api_response = api_instance.create_snapshot(body, portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SnapshotsApi->create_snapshot: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Snapshot**](Snapshot.md)| Snapshot details | 
 **portfolio_id** | **str**| Portfolio id | 

### Return type

[**Snapshot**](Snapshot.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_snapshot**
> delete_snapshot(snapshot_id)

Deletes a snapshot

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
api_instance = dlxapi.SnapshotsApi(dlxapi.ApiClient(configuration))
snapshot_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Snapshot id

try:
    # Deletes a snapshot
    api_instance.delete_snapshot(snapshot_id)
except ApiException as e:
    print("Exception when calling SnapshotsApi->delete_snapshot: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshot_id** | [**str**](.md)| Snapshot id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_snapshot**
> Snapshot get_snapshot(snapshot_id)

Retrieves a specific snapshot by ID

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
api_instance = dlxapi.SnapshotsApi(dlxapi.ApiClient(configuration))
snapshot_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Snapshot id

try:
    # Retrieves a specific snapshot by ID
    api_response = api_instance.get_snapshot(snapshot_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SnapshotsApi->get_snapshot: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshot_id** | [**str**](.md)| Snapshot id | 

### Return type

[**Snapshot**](Snapshot.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_snapshots_for_portfolio**
> Snapshots get_snapshots_for_portfolio(portfolio_id)

Retrieves all snapshots for a portfolio

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
api_instance = dlxapi.SnapshotsApi(dlxapi.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio id

try:
    # Retrieves all snapshots for a portfolio
    api_response = api_instance.get_snapshots_for_portfolio(portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SnapshotsApi->get_snapshots_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 

### Return type

[**Snapshots**](Snapshots.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **restore_snapshot**
> restore_snapshot(snapshot_id)

Restores a portfolio to the state captured in the snapshot

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
api_instance = dlxapi.SnapshotsApi(dlxapi.ApiClient(configuration))
snapshot_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Snapshot id

try:
    # Restores a portfolio to the state captured in the snapshot
    api_instance.restore_snapshot(snapshot_id)
except ApiException as e:
    print("Exception when calling SnapshotsApi->restore_snapshot: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshot_id** | [**str**](.md)| Snapshot id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_snapshot**
> Snapshot update_snapshot(body, snapshot_id)

Updates a snapshot

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
api_instance = dlxapi.SnapshotsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Snapshot() # Snapshot | Updated snapshot details
snapshot_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Snapshot id

try:
    # Updates a snapshot
    api_response = api_instance.update_snapshot(body, snapshot_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SnapshotsApi->update_snapshot: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Snapshot**](Snapshot.md)| Updated snapshot details | 
 **snapshot_id** | [**str**](.md)| Snapshot id | 

### Return type

[**Snapshot**](Snapshot.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

