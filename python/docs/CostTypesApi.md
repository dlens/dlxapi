# dlxapi.CostTypesApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_cost_type**](CostTypesApi.md#create_cost_type) | **POST** /costTypes | Creates a new Cost Type in a portfolio.
[**delete_cost_type**](CostTypesApi.md#delete_cost_type) | **DELETE** /costTypes/{id} | Deletes cost type
[**get_cost_types_for_portfolio**](CostTypesApi.md#get_cost_types_for_portfolio) | **GET** /costTypes | Retrieves Cost Types for a portfolio.
[**update_cost_type**](CostTypesApi.md#update_cost_type) | **PATCH** /costTypes/{id} | Updates a Cost Type utilizing JSON Patch Operations.

# **create_cost_type**
> CostType create_cost_type(body)

Creates a new Cost Type in a portfolio.

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
api_instance = dlxapi.CostTypesApi(dlxapi.ApiClient(configuration))
body = dlxapi.CostType() # CostType | Cost Type to create

try:
    # Creates a new Cost Type in a portfolio.
    api_response = api_instance.create_cost_type(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CostTypesApi->create_cost_type: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CostType**](CostType.md)| Cost Type to create | 

### Return type

[**CostType**](CostType.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_cost_type**
> delete_cost_type(id)

Deletes cost type

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
api_instance = dlxapi.CostTypesApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | cost type id

try:
    # Deletes cost type
    api_instance.delete_cost_type(id)
except ApiException as e:
    print("Exception when calling CostTypesApi->delete_cost_type: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| cost type id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_cost_types_for_portfolio**
> CostTypes get_cost_types_for_portfolio(portfolio_id)

Retrieves Cost Types for a portfolio.

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
api_instance = dlxapi.CostTypesApi(dlxapi.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio id

try:
    # Retrieves Cost Types for a portfolio.
    api_response = api_instance.get_cost_types_for_portfolio(portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CostTypesApi->get_cost_types_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 

### Return type

[**CostTypes**](CostTypes.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_cost_type**
> list[CostType] update_cost_type(body, id)

Updates a Cost Type utilizing JSON Patch Operations.

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
api_instance = dlxapi.CostTypesApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | JSON Patch Operations to update Cost Type.
id = 'id_example' # str | Cost Type id

try:
    # Updates a Cost Type utilizing JSON Patch Operations.
    api_response = api_instance.update_cost_type(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CostTypesApi->update_cost_type: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update Cost Type. | 
 **id** | **str**| Cost Type id | 

### Return type

[**list[CostType]**](CostType.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

