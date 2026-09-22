# dlxapi.PortfolioDataApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copy_and_sync_projects_between_portfolios**](PortfolioDataApi.md#copy_and_sync_projects_between_portfolios) | **POST** /portfolio-data/copy-and-sync-projects | Copy and sync projects between two portfolios
[**copy_and_sync_projects_to_multiple_portfolios**](PortfolioDataApi.md#copy_and_sync_projects_to_multiple_portfolios) | **POST** /portfolio-data/copy-and-sync-multi-portfolio | Copy and sync projects from one source portfolio to multiple destination portfolios
[**create_portfolio_data**](PortfolioDataApi.md#create_portfolio_data) | **POST** /portfolio-data | Creates a new portfolio source data entry
[**delete_portfolio_data**](PortfolioDataApi.md#delete_portfolio_data) | **DELETE** /portfolio-data/{id} | Delete portfolio source data entry
[**execute_sync**](PortfolioDataApi.md#execute_sync) | **POST** /portfolio-data/execute-sync | Execute portfolio data synchronization between two portfolios
[**get_all_portfolio_data**](PortfolioDataApi.md#get_all_portfolio_data) | **GET** /portfolio-data | Retrieves all portfolio source data entries
[**get_portfolio_data_by_id**](PortfolioDataApi.md#get_portfolio_data_by_id) | **GET** /portfolio-data/{id} | Get portfolio source data entry by ID
[**get_portfolio_data_by_portfolio_id**](PortfolioDataApi.md#get_portfolio_data_by_portfolio_id) | **GET** /portfolio-data/portfolio/{portfolioId} | Get portfolio source data entries by portfolio ID
[**update_portfolio_data**](PortfolioDataApi.md#update_portfolio_data) | **PUT** /portfolio-data/{id} | Update portfolio source data entry with latest POD data from DLX

# **copy_and_sync_projects_between_portfolios**
> ExecuteSyncResponse copy_and_sync_projects_between_portfolios(body)

Copy and sync projects between two portfolios

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
api_instance = dlxapi.PortfolioDataApi(dlxapi.ApiClient(configuration))
body = dlxapi.ProjectsCopyAndSyncRequest() # ProjectsCopyAndSyncRequest | Request to copy and sync projects between two portfolios

try:
    # Copy and sync projects between two portfolios
    api_response = api_instance.copy_and_sync_projects_between_portfolios(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioDataApi->copy_and_sync_projects_between_portfolios: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProjectsCopyAndSyncRequest**](ProjectsCopyAndSyncRequest.md)| Request to copy and sync projects between two portfolios | 

### Return type

[**ExecuteSyncResponse**](ExecuteSyncResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **copy_and_sync_projects_to_multiple_portfolios**
> MultiPortfolioCopyAndSyncResponse copy_and_sync_projects_to_multiple_portfolios(body)

Copy and sync projects from one source portfolio to multiple destination portfolios

Copies and syncs projects from a source portfolio to multiple destination portfolios. For each destination portfolio, the API automatically determines which projects need to be: - **Copied** (new projects created) - when no mapping exists - **Synced** (existing projects updated) - when a mapping already exists 

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
api_instance = dlxapi.PortfolioDataApi(dlxapi.ApiClient(configuration))
body = dlxapi.MultiPortfolioCopyAndSyncRequest() # MultiPortfolioCopyAndSyncRequest | Request to copy and sync projects from source to multiple destinations

try:
    # Copy and sync projects from one source portfolio to multiple destination portfolios
    api_response = api_instance.copy_and_sync_projects_to_multiple_portfolios(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioDataApi->copy_and_sync_projects_to_multiple_portfolios: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MultiPortfolioCopyAndSyncRequest**](MultiPortfolioCopyAndSyncRequest.md)| Request to copy and sync projects from source to multiple destinations | 

### Return type

[**MultiPortfolioCopyAndSyncResponse**](MultiPortfolioCopyAndSyncResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_portfolio_data**
> PortfolioData create_portfolio_data(body)

Creates a new portfolio source data entry

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
api_instance = dlxapi.PortfolioDataApi(dlxapi.ApiClient(configuration))
body = dlxapi.CreatePortfolioDataRequest() # CreatePortfolioDataRequest | Request to create portfolio data by fetching POD data

try:
    # Creates a new portfolio source data entry
    api_response = api_instance.create_portfolio_data(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioDataApi->create_portfolio_data: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreatePortfolioDataRequest**](CreatePortfolioDataRequest.md)| Request to create portfolio data by fetching POD data | 

### Return type

[**PortfolioData**](PortfolioData.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_portfolio_data**
> delete_portfolio_data(id)

Delete portfolio source data entry

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
api_instance = dlxapi.PortfolioDataApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the portfolio source data entry to delete

try:
    # Delete portfolio source data entry
    api_instance.delete_portfolio_data(id)
except ApiException as e:
    print("Exception when calling PortfolioDataApi->delete_portfolio_data: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| ID of the portfolio source data entry to delete | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **execute_sync**
> ExecuteSyncResponse execute_sync(body)

Execute portfolio data synchronization between two portfolios

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
api_instance = dlxapi.PortfolioDataApi(dlxapi.ApiClient(configuration))
body = dlxapi.ExecuteSyncRequest() # ExecuteSyncRequest | Request to execute portfolio data synchronization

try:
    # Execute portfolio data synchronization between two portfolios
    api_response = api_instance.execute_sync(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioDataApi->execute_sync: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExecuteSyncRequest**](ExecuteSyncRequest.md)| Request to execute portfolio data synchronization | 

### Return type

[**ExecuteSyncResponse**](ExecuteSyncResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_portfolio_data**
> list[PortfolioData] get_all_portfolio_data(limit=limit, offset=offset, portfolio_id=portfolio_id)

Retrieves all portfolio source data entries

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
api_instance = dlxapi.PortfolioDataApi(dlxapi.ApiClient(configuration))
limit = 100 # int | Maximum number of entries to return (optional) (default to 100)
offset = 0 # int | Number of entries to skip (optional) (default to 0)
portfolio_id = 'portfolio_id_example' # str | Filter by portfolio ID (optional)

try:
    # Retrieves all portfolio source data entries
    api_response = api_instance.get_all_portfolio_data(limit=limit, offset=offset, portfolio_id=portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioDataApi->get_all_portfolio_data: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Maximum number of entries to return | [optional] [default to 100]
 **offset** | **int**| Number of entries to skip | [optional] [default to 0]
 **portfolio_id** | **str**| Filter by portfolio ID | [optional] 

### Return type

[**list[PortfolioData]**](PortfolioData.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_data_by_id**
> PortfolioData get_portfolio_data_by_id(id)

Get portfolio source data entry by ID

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
api_instance = dlxapi.PortfolioDataApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the portfolio source data entry

try:
    # Get portfolio source data entry by ID
    api_response = api_instance.get_portfolio_data_by_id(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioDataApi->get_portfolio_data_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| ID of the portfolio source data entry | 

### Return type

[**PortfolioData**](PortfolioData.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_data_by_portfolio_id**
> list[PortfolioData] get_portfolio_data_by_portfolio_id(portfolio_id, limit=limit, offset=offset)

Get portfolio source data entries by portfolio ID

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
api_instance = dlxapi.PortfolioDataApi(dlxapi.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio ID to search for
limit = 100 # int | Maximum number of entries to return (optional) (default to 100)
offset = 0 # int | Number of entries to skip (optional) (default to 0)

try:
    # Get portfolio source data entries by portfolio ID
    api_response = api_instance.get_portfolio_data_by_portfolio_id(portfolio_id, limit=limit, offset=offset)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioDataApi->get_portfolio_data_by_portfolio_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio ID to search for | 
 **limit** | **int**| Maximum number of entries to return | [optional] [default to 100]
 **offset** | **int**| Number of entries to skip | [optional] [default to 0]

### Return type

[**list[PortfolioData]**](PortfolioData.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_data**
> PortfolioData update_portfolio_data(body, id)

Update portfolio source data entry with latest POD data from DLX

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
api_instance = dlxapi.PortfolioDataApi(dlxapi.ApiClient(configuration))
body = dlxapi.UpdatePortfolioDataRequest() # UpdatePortfolioDataRequest | Request to update portfolio data by fetching latest POD data from DLX
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the portfolio source data entry to update

try:
    # Update portfolio source data entry with latest POD data from DLX
    api_response = api_instance.update_portfolio_data(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioDataApi->update_portfolio_data: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdatePortfolioDataRequest**](UpdatePortfolioDataRequest.md)| Request to update portfolio data by fetching latest POD data from DLX | 
 **id** | [**str**](.md)| ID of the portfolio source data entry to update | 

### Return type

[**PortfolioData**](PortfolioData.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

