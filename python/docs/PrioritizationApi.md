# dlxapi.PrioritizationApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_prioritization**](PrioritizationApi.md#create_prioritization) | **POST** /prioritizations | Creates a new prioritization.
[**update_portfolio_prioritizations**](PrioritizationApi.md#update_portfolio_prioritizations) | **PATCH** /prioritizations | Updates portfolio prioritizations utilizing JSON Patch Operations.

# **create_prioritization**
> Prioritization create_prioritization(body)

Creates a new prioritization.

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
api_instance = dlxapi.PrioritizationApi(dlxapi.ApiClient(configuration))
body = dlxapi.Prioritization() # Prioritization | Prioritization to create

try:
    # Creates a new prioritization.
    api_response = api_instance.create_prioritization(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationApi->create_prioritization: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Prioritization**](Prioritization.md)| Prioritization to create | 

### Return type

[**Prioritization**](Prioritization.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_prioritizations**
> update_portfolio_prioritizations(body, portfolio_id=portfolio_id)

Updates portfolio prioritizations utilizing JSON Patch Operations.

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
api_instance = dlxapi.PrioritizationApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | JSON Patch Operations to update prioritization.
portfolio_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Portfolio id (optional)

try:
    # Updates portfolio prioritizations utilizing JSON Patch Operations.
    api_instance.update_portfolio_prioritizations(body, portfolio_id=portfolio_id)
except ApiException as e:
    print("Exception when calling PrioritizationApi->update_portfolio_prioritizations: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update prioritization. | 
 **portfolio_id** | [**str**](.md)| Portfolio id | [optional] 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

