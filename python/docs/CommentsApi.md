# dlxapi.CommentsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_comment**](CommentsApi.md#create_comment) | **POST** /comments | Creates a new comment
[**delete_comment**](CommentsApi.md#delete_comment) | **DELETE** /comments/{id} | Delete a single comment
[**get_comments**](CommentsApi.md#get_comments) | **GET** /comments | Retrieves comments based on params
[**get_comments_summary**](CommentsApi.md#get_comments_summary) | **GET** /comments/summary | Retrieves comments summary based on params
[**update_comment**](CommentsApi.md#update_comment) | **PATCH** /comments/{id} | Update a single comment

# **create_comment**
> Comment create_comment(body)

Creates a new comment

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
api_instance = dlxapi.CommentsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Comment() # Comment | Comment to create

try:
    # Creates a new comment
    api_response = api_instance.create_comment(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->create_comment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Comment**](Comment.md)| Comment to create | 

### Return type

[**Comment**](Comment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_comment**
> delete_comment(id)

Delete a single comment

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
api_instance = dlxapi.CommentsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Comment ID

try:
    # Delete a single comment
    api_instance.delete_comment(id)
except ApiException as e:
    print("Exception when calling CommentsApi->delete_comment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Comment ID | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_comments**
> Comments get_comments(portfolio_id=portfolio_id, project_id=project_id, offset=offset, limit=limit, order_by=order_by, match=match, only_mentioned=only_mentioned)

Retrieves comments based on params

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
api_instance = dlxapi.CommentsApi(dlxapi.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Use when you want all comments from all projects inside this portfolio (optional)
project_id = 'project_id_example' # str | Use when you want comments for a specific project (optional)
offset = 56 # int | The page number from where the search will be done (optional)
limit = 56 # int | Max number of comments which will be returned (optional)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)
match = 'match_example' # str |  (optional)
only_mentioned = true # bool |  (optional)

try:
    # Retrieves comments based on params
    api_response = api_instance.get_comments(portfolio_id=portfolio_id, project_id=project_id, offset=offset, limit=limit, order_by=order_by, match=match, only_mentioned=only_mentioned)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->get_comments: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Use when you want all comments from all projects inside this portfolio | [optional] 
 **project_id** | **str**| Use when you want comments for a specific project | [optional] 
 **offset** | **int**| The page number from where the search will be done | [optional] 
 **limit** | **int**| Max number of comments which will be returned | [optional] 
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#x27;-&#x27; in front of expression for reverse order. | [optional] 
 **match** | **str**|  | [optional] 
 **only_mentioned** | **bool**|  | [optional] 

### Return type

[**Comments**](Comments.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_comments_summary**
> Summary get_comments_summary(portfolio_id=portfolio_id, project_id=project_id, match=match, only_mentioned=only_mentioned)

Retrieves comments summary based on params

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
api_instance = dlxapi.CommentsApi(dlxapi.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Use when you want all comments from all projects inside this portfolio (optional)
project_id = 'project_id_example' # str | Use when you want comments for a specific project (optional)
match = 'match_example' # str |  (optional)
only_mentioned = true # bool |  (optional)

try:
    # Retrieves comments summary based on params
    api_response = api_instance.get_comments_summary(portfolio_id=portfolio_id, project_id=project_id, match=match, only_mentioned=only_mentioned)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->get_comments_summary: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Use when you want all comments from all projects inside this portfolio | [optional] 
 **project_id** | **str**| Use when you want comments for a specific project | [optional] 
 **match** | **str**|  | [optional] 
 **only_mentioned** | **bool**|  | [optional] 

### Return type

[**Summary**](Summary.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_comment**
> Comment update_comment(body, id)

Update a single comment

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
api_instance = dlxapi.CommentsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | JSON Patch operations to update value field.
id = 'id_example' # str | Comment ID

try:
    # Update a single comment
    api_response = api_instance.update_comment(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CommentsApi->update_comment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch operations to update value field. | 
 **id** | **str**| Comment ID | 

### Return type

[**Comment**](Comment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

