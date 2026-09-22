# dlxapi.AttachmentsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copy_attachments**](AttachmentsApi.md#copy_attachments) | **POST** /attachments/copyAttachments | Copies attachments to a list of portfolio ids
[**create_attachment**](AttachmentsApi.md#create_attachment) | **POST** /attachments | Creates a new attachment from a file upload
[**download_attachment**](AttachmentsApi.md#download_attachment) | **GET** /attachments/{id}/download | Downloads the file content of an Attachment
[**get_attachment**](AttachmentsApi.md#get_attachment) | **GET** /attachments/{id} | Get Attachment by id
[**get_attachments**](AttachmentsApi.md#get_attachments) | **GET** /attachments | Get Attachment by portfolio id
[**update_attachment**](AttachmentsApi.md#update_attachment) | **PATCH** /attachments/{id} | Update a single attachment

# **copy_attachments**
> CopyAttachmentsResponse copy_attachments(body)

Copies attachments to a list of portfolio ids

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
api_instance = dlxapi.AttachmentsApi(dlxapi.ApiClient(configuration))
body = dlxapi.CopyAttachmentsRequest() # CopyAttachmentsRequest | Copy Attachments Request

try:
    # Copies attachments to a list of portfolio ids
    api_response = api_instance.copy_attachments(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AttachmentsApi->copy_attachments: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CopyAttachmentsRequest**](CopyAttachmentsRequest.md)| Copy Attachments Request | 

### Return type

[**CopyAttachmentsResponse**](CopyAttachmentsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_attachment**
> Attachment create_attachment(file, portfolio_id)

Creates a new attachment from a file upload

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
api_instance = dlxapi.AttachmentsApi(dlxapi.ApiClient(configuration))
file = 'file_example' # str | 
portfolio_id = 'portfolio_id_example' # str | the portfolio id that the attachment belongs to

try:
    # Creates a new attachment from a file upload
    api_response = api_instance.create_attachment(file, portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AttachmentsApi->create_attachment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **str**|  | 
 **portfolio_id** | **str**| the portfolio id that the attachment belongs to | 

### Return type

[**Attachment**](Attachment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_attachment**
> str download_attachment(id)

Downloads the file content of an Attachment

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
api_instance = dlxapi.AttachmentsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Attachment id

try:
    # Downloads the file content of an Attachment
    api_response = api_instance.download_attachment(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AttachmentsApi->download_attachment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Attachment id | 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_attachment**
> Attachment get_attachment(id)

Get Attachment by id

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
api_instance = dlxapi.AttachmentsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Attachment id

try:
    # Get Attachment by id
    api_response = api_instance.get_attachment(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AttachmentsApi->get_attachment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Attachment id | 

### Return type

[**Attachment**](Attachment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_attachments**
> Attachments get_attachments(portfolio_id=portfolio_id, attachment_ids=attachment_ids, offset=offset, limit=limit, order_by=order_by, match=match)

Get Attachment by portfolio id

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
api_instance = dlxapi.AttachmentsApi(dlxapi.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio id (optional)
attachment_ids = ['attachment_ids_example'] # list[str] | List of attachment ids (optional)
offset = 56 # int | Pagination offset (optional)
limit = 56 # int | Pagination limit (optional)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Get Attachment by portfolio id
    api_response = api_instance.get_attachments(portfolio_id=portfolio_id, attachment_ids=attachment_ids, offset=offset, limit=limit, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AttachmentsApi->get_attachments: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | [optional] 
 **attachment_ids** | [**list[str]**](str.md)| List of attachment ids | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **limit** | **int**| Pagination limit | [optional] 
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#x27;-&#x27; in front of expression for reverse order. | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**Attachments**](Attachments.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_attachment**
> Attachment update_attachment(body, id)

Update a single attachment

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
api_instance = dlxapi.AttachmentsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | JSON Patch operations to update value field.
id = 'id_example' # str | Attachment ID

try:
    # Update a single attachment
    api_response = api_instance.update_attachment(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AttachmentsApi->update_attachment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch operations to update value field. | 
 **id** | **str**| Attachment ID | 

### Return type

[**Attachment**](Attachment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

