# swagger_client.FieldsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_field**](FieldsApi.md#create_field) | **POST** /fields | Creates a new field in a portfolio.
[**create_fields**](FieldsApi.md#create_fields) | **POST** /fields/bulk | Create new fields in a portfolio.
[**delete_field**](FieldsApi.md#delete_field) | **DELETE** /fields/{id} | Delete a field. Also deletes the values for every project.
[**get_field**](FieldsApi.md#get_field) | **GET** /fields/{id} | Retrieves a field.
[**get_fields_for_portfolio**](FieldsApi.md#get_fields_for_portfolio) | **GET** /fields | Retrieves fields for a portfolio.
[**set_idea_form_fields**](FieldsApi.md#set_idea_form_fields) | **PUT** /fields/ideaForm | Set idea form fields for a portfolio.
[**update_field**](FieldsApi.md#update_field) | **PATCH** /fields/{id} | Updates a field utilizing JSON Patch Operations. If the update logic makes changes to other fields, all updated fields will be returned in the response. 
[**update_fields**](FieldsApi.md#update_fields) | **PATCH** /fields | Update fields associated with a portfolio.


# **create_field**
> list[Field] create_field(body, expand=expand)

Creates a new field in a portfolio.

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
api_instance = swagger_client.FieldsApi(swagger_client.ApiClient(configuration))
body = swagger_client.Field() # Field | Field to create
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Creates a new field in a portfolio.
    api_response = api_instance.create_field(body, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FieldsApi->create_field: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Field**](Field.md)| Field to create | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**list[Field]**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_fields**
> list[Field] create_fields(fields, expand=expand)

Create new fields in a portfolio.

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
api_instance = swagger_client.FieldsApi(swagger_client.ApiClient(configuration))
fields = [swagger_client.Field()] # list[Field] | Field to create
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Create new fields in a portfolio.
    api_response = api_instance.create_fields(fields, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FieldsApi->create_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**list[Field]**](Field.md)| Field to create | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**list[Field]**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_field**
> delete_field(id)

Delete a field. Also deletes the values for every project.

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
api_instance = swagger_client.FieldsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | Field id

try:
    # Delete a field. Also deletes the values for every project.
    api_instance.delete_field(id)
except ApiException as e:
    print("Exception when calling FieldsApi->delete_field: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Field id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_field**
> Field get_field(id, expand=expand)

Retrieves a field.

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
api_instance = swagger_client.FieldsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | Field id
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Retrieves a field.
    api_response = api_instance.get_field(id, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FieldsApi->get_field: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Field id | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**Field**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fields_for_portfolio**
> Fields get_fields_for_portfolio(portfolio_id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)

Retrieves fields for a portfolio.

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
api_instance = swagger_client.FieldsApi(swagger_client.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio id
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Retrieves fields for a portfolio.
    api_response = api_instance.get_fields_for_portfolio(portfolio_id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FieldsApi->get_fields_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**Fields**](Fields.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_idea_form_fields**
> list[Field] set_idea_form_fields(body, expand=expand)

Set idea form fields for a portfolio.

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
api_instance = swagger_client.FieldsApi(swagger_client.ApiClient(configuration))
body = swagger_client.IdeaFormFieldRequest() # IdeaFormFieldRequest | Idea form field request
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Set idea form fields for a portfolio.
    api_response = api_instance.set_idea_form_fields(body, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FieldsApi->set_idea_form_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdeaFormFieldRequest**](IdeaFormFieldRequest.md)| Idea form field request | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**list[Field]**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_field**
> list[Field] update_field(id, body, expand=expand)

Updates a field utilizing JSON Patch Operations. If the update logic makes changes to other fields, all updated fields will be returned in the response. 

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
api_instance = swagger_client.FieldsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | Field id
body = swagger_client.Operations() # Operations | JSON Patch Operations to update field.
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Updates a field utilizing JSON Patch Operations. If the update logic makes changes to other fields, all updated fields will be returned in the response. 
    api_response = api_instance.update_field(id, body, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FieldsApi->update_field: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Field id | 
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update field. | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**list[Field]**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_fields**
> list[Field] update_fields(body, expand=expand)

Update fields associated with a portfolio.

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
api_instance = swagger_client.FieldsApi(swagger_client.ApiClient(configuration))
body = [swagger_client.PatchItem()] # list[PatchItem] | JSON Patch Operations to update multiple fields.
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Update fields associated with a portfolio.
    api_response = api_instance.update_fields(body, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FieldsApi->update_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[PatchItem]**](PatchItem.md)| JSON Patch Operations to update multiple fields. | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**list[Field]**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

