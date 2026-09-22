# dlxapi.UserProfileApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_user_profile**](UserProfileApi.md#get_user_profile) | **GET** /userProfile | Get authenticated user profile

# **get_user_profile**
> UserProfile get_user_profile()

Get authenticated user profile

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
api_instance = dlxapi.UserProfileApi(dlxapi.ApiClient(configuration))

try:
    # Get authenticated user profile
    api_response = api_instance.get_user_profile()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserProfileApi->get_user_profile: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserProfile**](UserProfile.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

