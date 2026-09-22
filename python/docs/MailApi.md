# dlxapi.MailApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**send_mail**](MailApi.md#send_mail) | **POST** /mail | Send mail
[**send_mail_for_portfolio**](MailApi.md#send_mail_for_portfolio) | **POST** /portfolios/{id}/mail | Send mail
[**send_registration_mail**](MailApi.md#send_registration_mail) | **POST** /registrationMail | Send registration mail

# **send_mail**
> send_mail(body)

Send mail

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
api_instance = dlxapi.MailApi(dlxapi.ApiClient(configuration))
body = dlxapi.Mail() # Mail | mail request

try:
    # Send mail
    api_instance.send_mail(body)
except ApiException as e:
    print("Exception when calling MailApi->send_mail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Mail**](Mail.md)| mail request | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_mail_for_portfolio**
> list[str] send_mail_for_portfolio(body, id)

Send mail

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
api_instance = dlxapi.MailApi(dlxapi.ApiClient(configuration))
body = dlxapi.MailRequest() # MailRequest | Mail request
id = 'id_example' # str | Portfolio id

try:
    # Send mail
    api_response = api_instance.send_mail_for_portfolio(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MailApi->send_mail_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MailRequest**](MailRequest.md)| Mail request | 
 **id** | **str**| Portfolio id | 

### Return type

**list[str]**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_registration_mail**
> send_registration_mail(body, access_token=access_token)

Send registration mail

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
api_instance = dlxapi.MailApi(dlxapi.ApiClient(configuration))
body = dlxapi.Mail() # Mail | mail request
access_token = 'access_token_example' # str | access token (optional)

try:
    # Send registration mail
    api_instance.send_registration_mail(body, access_token=access_token)
except ApiException as e:
    print("Exception when calling MailApi->send_registration_mail: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Mail**](Mail.md)| mail request | 
 **access_token** | **str**| access token | [optional] 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

