# swagger_client.PortfolioPlanUsersApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_portfolio_plan_user**](PortfolioPlanUsersApi.md#delete_portfolio_plan_user) | **DELETE** /portfolioPlanUsers/{id} | Delete a portfolio plan user
[**update_portfolio_plan_users**](PortfolioPlanUsersApi.md#update_portfolio_plan_users) | **PATCH** /portfolioPlanUsers/{id} | Update portfolio plan users


# **delete_portfolio_plan_user**
> delete_portfolio_plan_user(id)

Delete a portfolio plan user

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
api_instance = swagger_client.PortfolioPlanUsersApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | Portfolio plan user id

try:
    # Delete a portfolio plan user
    api_instance.delete_portfolio_plan_user(id)
except ApiException as e:
    print("Exception when calling PortfolioPlanUsersApi->delete_portfolio_plan_user: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio plan user id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_plan_users**
> list[PortfolioPlanUser] update_portfolio_plan_users(body)

Update portfolio plan users

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
api_instance = swagger_client.PortfolioPlanUsersApi(swagger_client.ApiClient(configuration))
body = [swagger_client.PatchItem()] # list[PatchItem] | JSON Patch Operations to update multiple portfolio plan users.

try:
    # Update portfolio plan users
    api_response = api_instance.update_portfolio_plan_users(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioPlanUsersApi->update_portfolio_plan_users: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[PatchItem]**](PatchItem.md)| JSON Patch Operations to update multiple portfolio plan users. | 

### Return type

[**list[PortfolioPlanUser]**](PortfolioPlanUser.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

