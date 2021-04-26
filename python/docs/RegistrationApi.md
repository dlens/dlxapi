# swagger_client.RegistrationApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**register_portfolio_user**](RegistrationApi.md#register_portfolio_user) | **POST** /registerPortfolioUser | Register Portfolio User
[**register_user**](RegistrationApi.md#register_user) | **POST** /registerUser | Register User


# **register_portfolio_user**
> PortfolioPlanUser register_portfolio_user(register_user_request)

Register Portfolio User

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
api_instance = dlxapi.RegistrationApi(dlxapi.ApiClient(configuration))
register_user_request = dlxapi.RegisterUserRequest() # RegisterUserRequest | Register user request

try:
    # Register Portfolio User
    api_response = api_instance.register_portfolio_user(register_user_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RegistrationApi->register_portfolio_user: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **register_user_request** | [**RegisterUserRequest**](RegisterUserRequest.md)| Register user request | 

### Return type

[**PortfolioPlanUser**](PortfolioPlanUser.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **register_user**
> User register_user(register_user_request)

Register User

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
api_instance = dlxapi.RegistrationApi(dlxapi.ApiClient(configuration))
register_user_request = dlxapi.RegisterUserRequest() # RegisterUserRequest | Register user request

try:
    # Register User
    api_response = api_instance.register_user(register_user_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RegistrationApi->register_user: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **register_user_request** | [**RegisterUserRequest**](RegisterUserRequest.md)| Register user request | 

### Return type

[**User**](User.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

