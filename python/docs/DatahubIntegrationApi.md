# dlxapi.DatahubIntegrationApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_portfolio_relationship_mappings**](DatahubIntegrationApi.md#get_portfolio_relationship_mappings) | **GET** /datahub-integration/portfolio-relationship-mappings/portfolio/{portfolioId} | Get portfolio relationship mappings (Datahub Integration)

# **get_portfolio_relationship_mappings**
> list[PortfolioRelationshipMapping] get_portfolio_relationship_mappings(portfolio_id)

Get portfolio relationship mappings (Datahub Integration)

Returns all portfolio relationship mappings connected to the specified portfolio. This endpoint integrates with the datahub-service to retrieve mappings where the  portfolio is either a hub or a spoke in a hub-spoke relationship model.  **Integration Note:** This is a proxy endpoint implemented in portfolio-service  that calls the datahub-service API internally. 

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
api_instance = dlxapi.DatahubIntegrationApi(dlxapi.ApiClient(configuration))
portfolio_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Portfolio ID whose relationship mappings should be returned

try:
    # Get portfolio relationship mappings (Datahub Integration)
    api_response = api_instance.get_portfolio_relationship_mappings(portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DatahubIntegrationApi->get_portfolio_relationship_mappings: %s\n" % e)
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

