# dlxapi.DlxIntegrationApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetch_fields_from_dlx**](DlxIntegrationApi.md#fetch_fields_from_dlx) | **GET** /datahub/dlx-integration/fetch-fields/{portfolioId} | Fetch fields from DLX portfolio service for a specific portfolio
[**fetch_pod_data_from_dlx**](DlxIntegrationApi.md#fetch_pod_data_from_dlx) | **GET** /datahub/dlx-integration/fetch-pod-data/{portfolioId} | Fetch comprehensive portfolio data (POD) from DLX portfolio service
[**fetch_portfolios_from_dlx**](DlxIntegrationApi.md#fetch_portfolios_from_dlx) | **GET** /datahub/dlx-integration/fetch-portfolios | Fetch portfolios from DLX portfolio service
[**fetch_projects_from_dlx**](DlxIntegrationApi.md#fetch_projects_from_dlx) | **GET** /datahub/dlx-integration/fetch-projects/{portfolioId} | Fetch projects from DLX portfolio service for a specific portfolio

# **fetch_fields_from_dlx**
> Fields fetch_fields_from_dlx(portfolio_id)

Fetch fields from DLX portfolio service for a specific portfolio

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
api_instance = dlxapi.DlxIntegrationApi(dlxapi.ApiClient(configuration))
portfolio_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | The portfolio ID to fetch fields for

try:
    # Fetch fields from DLX portfolio service for a specific portfolio
    api_response = api_instance.fetch_fields_from_dlx(portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DlxIntegrationApi->fetch_fields_from_dlx: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**str**](.md)| The portfolio ID to fetch fields for | 

### Return type

[**Fields**](Fields.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_pod_data_from_dlx**
> FetchPodDataFromDLXResponse fetch_pod_data_from_dlx(portfolio_id)

Fetch comprehensive portfolio data (POD) from DLX portfolio service

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
api_instance = dlxapi.DlxIntegrationApi(dlxapi.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio ID to fetch POD data for

try:
    # Fetch comprehensive portfolio data (POD) from DLX portfolio service
    api_response = api_instance.fetch_pod_data_from_dlx(portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DlxIntegrationApi->fetch_pod_data_from_dlx: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio ID to fetch POD data for | 

### Return type

[**FetchPodDataFromDLXResponse**](FetchPodDataFromDLXResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_portfolios_from_dlx**
> FetchPortfoliosFromDLXResponse fetch_portfolios_from_dlx(limit=limit, offset=offset, order_by=order_by, match=match)

Fetch portfolios from DLX portfolio service

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
api_instance = dlxapi.DlxIntegrationApi(dlxapi.ApiClient(configuration))
limit = 100 # int | Maximum number of portfolios to return (optional) (default to 100)
offset = 0 # int | Number of portfolios to skip (optional) (default to 0)
order_by = 'order_by_example' # str | MappingField to order results by (optional)
match = 'match_example' # str | Filter portfolios by matching criteria (optional)

try:
    # Fetch portfolios from DLX portfolio service
    api_response = api_instance.fetch_portfolios_from_dlx(limit=limit, offset=offset, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DlxIntegrationApi->fetch_portfolios_from_dlx: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| Maximum number of portfolios to return | [optional] [default to 100]
 **offset** | **int**| Number of portfolios to skip | [optional] [default to 0]
 **order_by** | **str**| MappingField to order results by | [optional] 
 **match** | **str**| Filter portfolios by matching criteria | [optional] 

### Return type

[**FetchPortfoliosFromDLXResponse**](FetchPortfoliosFromDLXResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_projects_from_dlx**
> Projects fetch_projects_from_dlx(portfolio_id)

Fetch projects from DLX portfolio service for a specific portfolio

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
api_instance = dlxapi.DlxIntegrationApi(dlxapi.ApiClient(configuration))
portfolio_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | The portfolio ID to fetch projects for

try:
    # Fetch projects from DLX portfolio service for a specific portfolio
    api_response = api_instance.fetch_projects_from_dlx(portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DlxIntegrationApi->fetch_projects_from_dlx: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**str**](.md)| The portfolio ID to fetch projects for | 

### Return type

[**Projects**](Projects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

