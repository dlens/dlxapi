# swagger_client.MailApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**send_mail**](MailApi.md#send_mail) | **POST** /mail | Send mail
[**send_registration_mail**](MailApi.md#send_registration_mail) | **POST** /registrationMail | Send registration mail


# **send_mail**
> send_mail(mail)

Send mail

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
api_instance = swagger_client.MailApi(swagger_client.ApiClient(configuration))
mail = swagger_client.Mail() # Mail | mail request

try:
    # Send mail
    api_instance.send_mail(mail)
except ApiException as e:
    print("Exception when calling MailApi->send_mail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mail** | [**Mail**](Mail.md)| mail request | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_registration_mail**
> send_registration_mail(mail, access_token=access_token)

Send registration mail

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
api_instance = swagger_client.MailApi(swagger_client.ApiClient(configuration))
mail = swagger_client.Mail() # Mail | mail request
access_token = 'access_token_example' # str | access token (optional)

try:
    # Send registration mail
    api_instance.send_registration_mail(mail, access_token=access_token)
except ApiException as e:
    print("Exception when calling MailApi->send_registration_mail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mail** | [**Mail**](Mail.md)| mail request | 
 **access_token** | **str**| access token | [optional] 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

