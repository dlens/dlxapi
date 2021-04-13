# swagger_client.MessageTokensApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_message_token**](MessageTokensApi.md#get_message_token) | **GET** /messageTokens | Get message authorization token for a destination


# **get_message_token**
> MessageToken get_message_token(destination_type, portfolio_id=portfolio_id, portfolio_plan_id=portfolio_plan_id)

Get message authorization token for a destination

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: OAuth2
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.MessageTokensApi(swagger_client.ApiClient(configuration))
destination_type = NULL # object | Message destination type
portfolio_id = 'portfolio_id_example' # str | Portfolio id for PORTFOLIO destination type (optional)
portfolio_plan_id = 'portfolio_plan_id_example' # str | Portfolio plan id for PORTFOLIOPLAN destination type (optional)

try:
    # Get message authorization token for a destination
    api_response = api_instance.get_message_token(destination_type, portfolio_id=portfolio_id, portfolio_plan_id=portfolio_plan_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MessageTokensApi->get_message_token: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **destination_type** | [**object**](.md)| Message destination type | 
 **portfolio_id** | **str**| Portfolio id for PORTFOLIO destination type | [optional] 
 **portfolio_plan_id** | **str**| Portfolio plan id for PORTFOLIOPLAN destination type | [optional] 

### Return type

[**MessageToken**](MessageToken.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

