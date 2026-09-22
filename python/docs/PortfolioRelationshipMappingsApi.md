# dlxapi.PortfolioRelationshipMappingsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_portfolio_relationship_mapping**](PortfolioRelationshipMappingsApi.md#create_portfolio_relationship_mapping) | **POST** /datahub/portfolio-relationship-mappings | Creates a new hub-spoke portfolio relationship mapping
[**delete_portfolio_relationship_mapping**](PortfolioRelationshipMappingsApi.md#delete_portfolio_relationship_mapping) | **DELETE** /datahub/portfolio-relationship-mappings/portfolio/{portfolioId} | Delete portfolio relationship mapping
[**get_all_mappings**](PortfolioRelationshipMappingsApi.md#get_all_mappings) | **GET** /datahub/portfolio-relationship-mappings | Retrieves all hub-spoke portfolio relationship mappings
[**get_available_mapping_fields**](PortfolioRelationshipMappingsApi.md#get_available_mapping_fields) | **GET** /datahub/portfolio-relationship-mappings/available-mapping-fields/{portfolioId} | Get available mapping fields for a portfolio
[**get_mapped_categories**](PortfolioRelationshipMappingsApi.md#get_mapped_categories) | **GET** /datahub/portfolio-relationship-mappings/{hubPortfolioId}/mapped-categories | Get mapped CATEGORY fields across hub and spoke portfolios
[**get_portfolio_relationship_mapping_by_id**](PortfolioRelationshipMappingsApi.md#get_portfolio_relationship_mapping_by_id) | **GET** /datahub/portfolio-relationship-mappings/{id} | Get portfolio relationship mapping by ID
[**get_portfolio_relationship_mappings_by_portfolio**](PortfolioRelationshipMappingsApi.md#get_portfolio_relationship_mappings_by_portfolio) | **GET** /datahub/portfolio-relationship-mappings/portfolio/{portfolioId} | Get portfolio relationship mappings by portfolio ID
[**update_portfolio_relationship_mapping**](PortfolioRelationshipMappingsApi.md#update_portfolio_relationship_mapping) | **PUT** /datahub/portfolio-relationship-mappings/{id} | Updates an existing hub-spoke portfolio relationship mapping
[**update_portfolio_relationship_mapping_with_operations**](PortfolioRelationshipMappingsApi.md#update_portfolio_relationship_mapping_with_operations) | **PATCH** /datahub/portfolio-relationship-mappings/{id} | Update portfolio relationship mapping with operations

# **create_portfolio_relationship_mapping**
> PortfolioRelationshipMapping create_portfolio_relationship_mapping(body)

Creates a new hub-spoke portfolio relationship mapping

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
api_instance = dlxapi.PortfolioRelationshipMappingsApi(dlxapi.ApiClient(configuration))
body = dlxapi.CreatePortfolioRelationshipMapping() # CreatePortfolioRelationshipMapping | Portfolio relationship mapping to create using hub-spoke model (one hub portfolio to multiple spoke portfolios)

try:
    # Creates a new hub-spoke portfolio relationship mapping
    api_response = api_instance.create_portfolio_relationship_mapping(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioRelationshipMappingsApi->create_portfolio_relationship_mapping: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreatePortfolioRelationshipMapping**](CreatePortfolioRelationshipMapping.md)| Portfolio relationship mapping to create using hub-spoke model (one hub portfolio to multiple spoke portfolios) | 

### Return type

[**PortfolioRelationshipMapping**](PortfolioRelationshipMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_portfolio_relationship_mapping**
> delete_portfolio_relationship_mapping(portfolio_id, id)

Delete portfolio relationship mapping

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
api_instance = dlxapi.PortfolioRelationshipMappingsApi(dlxapi.ApiClient(configuration))
portfolio_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Portfolio ID whose relationship mappings should be returned
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the portfolio relationship mapping to delete

try:
    # Delete portfolio relationship mapping
    api_instance.delete_portfolio_relationship_mapping(portfolio_id, id)
except ApiException as e:
    print("Exception when calling PortfolioRelationshipMappingsApi->delete_portfolio_relationship_mapping: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**str**](.md)| Portfolio ID whose relationship mappings should be returned | 
 **id** | [**str**](.md)| ID of the portfolio relationship mapping to delete | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_mappings**
> list[PortfolioRelationshipMapping] get_all_mappings()

Retrieves all hub-spoke portfolio relationship mappings

Gets all portfolio relationship mappings in the system (hub-spoke model) without requiring any query parameters or filters

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
api_instance = dlxapi.PortfolioRelationshipMappingsApi(dlxapi.ApiClient(configuration))

try:
    # Retrieves all hub-spoke portfolio relationship mappings
    api_response = api_instance.get_all_mappings()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioRelationshipMappingsApi->get_all_mappings: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[PortfolioRelationshipMapping]**](PortfolioRelationshipMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_available_mapping_fields**
> PortfolioMappingFieldsResponse get_available_mapping_fields(portfolio_id)

Get available mapping fields for a portfolio

Returns a list of fields that can be used for mapping between portfolios

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
api_instance = dlxapi.PortfolioRelationshipMappingsApi(dlxapi.ApiClient(configuration))
portfolio_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Portfolio ID to analyze for available mapping fields

try:
    # Get available mapping fields for a portfolio
    api_response = api_instance.get_available_mapping_fields(portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioRelationshipMappingsApi->get_available_mapping_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**str**](.md)| Portfolio ID to analyze for available mapping fields | 

### Return type

[**PortfolioMappingFieldsResponse**](PortfolioMappingFieldsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_mapped_categories**
> MappedCategoriesResponse get_mapped_categories(hub_portfolio_id, spoke_portfolio_ids)

Get mapped CATEGORY fields across hub and spoke portfolios

Returns CATEGORY fields and category options that exist across the hub portfolio and the specified spoke portfolios

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
api_instance = dlxapi.PortfolioRelationshipMappingsApi(dlxapi.ApiClient(configuration))
hub_portfolio_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Hub portfolio ID
spoke_portfolio_ids = 'spoke_portfolio_ids_example' # str | Comma separated list of spoke portfolio IDs

try:
    # Get mapped CATEGORY fields across hub and spoke portfolios
    api_response = api_instance.get_mapped_categories(hub_portfolio_id, spoke_portfolio_ids)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioRelationshipMappingsApi->get_mapped_categories: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hub_portfolio_id** | [**str**](.md)| Hub portfolio ID | 
 **spoke_portfolio_ids** | **str**| Comma separated list of spoke portfolio IDs | 

### Return type

[**MappedCategoriesResponse**](MappedCategoriesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_relationship_mapping_by_id**
> PortfolioRelationshipMapping get_portfolio_relationship_mapping_by_id(id)

Get portfolio relationship mapping by ID

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
api_instance = dlxapi.PortfolioRelationshipMappingsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the portfolio relationship mapping

try:
    # Get portfolio relationship mapping by ID
    api_response = api_instance.get_portfolio_relationship_mapping_by_id(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioRelationshipMappingsApi->get_portfolio_relationship_mapping_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| ID of the portfolio relationship mapping | 

### Return type

[**PortfolioRelationshipMapping**](PortfolioRelationshipMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_relationship_mappings_by_portfolio**
> list[PortfolioRelationshipMapping] get_portfolio_relationship_mappings_by_portfolio(portfolio_id)

Get portfolio relationship mappings by portfolio ID

Returns all portfolio relationship mappings connected to the specified portfolio, regardless of whether it is the hub or a spoke.

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
api_instance = dlxapi.PortfolioRelationshipMappingsApi(dlxapi.ApiClient(configuration))
portfolio_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Portfolio ID whose relationship mappings should be returned

try:
    # Get portfolio relationship mappings by portfolio ID
    api_response = api_instance.get_portfolio_relationship_mappings_by_portfolio(portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioRelationshipMappingsApi->get_portfolio_relationship_mappings_by_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**str**](.md)| Portfolio ID whose relationship mappings should be returned | 

### Return type

[**list[PortfolioRelationshipMapping]**](PortfolioRelationshipMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_relationship_mapping**
> PortfolioRelationshipMapping update_portfolio_relationship_mapping(body, id)

Updates an existing hub-spoke portfolio relationship mapping

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
api_instance = dlxapi.PortfolioRelationshipMappingsApi(dlxapi.ApiClient(configuration))
body = dlxapi.UpdatePortfolioRelationshipMapping() # UpdatePortfolioRelationshipMapping | Updated portfolio relationship mapping data using hub-spoke model
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Portfolio relationship mapping ID

try:
    # Updates an existing hub-spoke portfolio relationship mapping
    api_response = api_instance.update_portfolio_relationship_mapping(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioRelationshipMappingsApi->update_portfolio_relationship_mapping: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdatePortfolioRelationshipMapping**](UpdatePortfolioRelationshipMapping.md)| Updated portfolio relationship mapping data using hub-spoke model | 
 **id** | [**str**](.md)| Portfolio relationship mapping ID | 

### Return type

[**PortfolioRelationshipMapping**](PortfolioRelationshipMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_relationship_mapping_with_operations**
> PortfolioRelationshipMapping update_portfolio_relationship_mapping_with_operations(body, id)

Update portfolio relationship mapping with operations

Updates a portfolio relationship mapping by applying a list of operations.  Supported operations: - ADD: Add a new value to an array or object - REMOVE: Remove a value from an array or object - REPLACE: Replace a value in an array or object  The operations follow the JSON Patch (RFC 6902) specification. 

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
api_instance = dlxapi.PortfolioRelationshipMappingsApi(dlxapi.ApiClient(configuration))
body = [dlxapi.PortfolioRelationshipMappingOperation()] # list[PortfolioRelationshipMappingOperation] | List of operations to perform on the portfolio relationship mapping
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the portfolio relationship mapping to update

try:
    # Update portfolio relationship mapping with operations
    api_response = api_instance.update_portfolio_relationship_mapping_with_operations(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioRelationshipMappingsApi->update_portfolio_relationship_mapping_with_operations: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[PortfolioRelationshipMappingOperation]**](PortfolioRelationshipMappingOperation.md)| List of operations to perform on the portfolio relationship mapping | 
 **id** | [**str**](.md)| ID of the portfolio relationship mapping to update | 

### Return type

[**PortfolioRelationshipMapping**](PortfolioRelationshipMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

