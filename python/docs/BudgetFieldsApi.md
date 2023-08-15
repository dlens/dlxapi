# swagger_client.BudgetFieldsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_budget_field**](BudgetFieldsApi.md#create_budget_field) | **POST** /fields/budgets | Creates a new budget field
[**delete_budget_field**](BudgetFieldsApi.md#delete_budget_field) | **DELETE** /fields/budgets/{id} | Delete a budget field
[**get_budget_field**](BudgetFieldsApi.md#get_budget_field) | **GET** /fields/budgets/{id} | Retrieves a budget field
[**get_budget_fields_for_portfolio**](BudgetFieldsApi.md#get_budget_fields_for_portfolio) | **GET** /fields/budgets | Retrieves budget fields for a portfolio.
[**update_budget_field**](BudgetFieldsApi.md#update_budget_field) | **PATCH** /fields/budgets/{id} | Updates a budget field utilizing JSON Patch Operations.
[**update_budget_fields**](BudgetFieldsApi.md#update_budget_fields) | **PATCH** /fields/budgets | Update budget fields


# **create_budget_field**
> list[Field] create_budget_field(body, expand=expand)

Creates a new budget field

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
api_instance = swagger_client.BudgetFieldsApi(swagger_client.ApiClient(configuration))
body = swagger_client.Field() # Field | Budget field to create
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Creates a new budget field
    api_response = api_instance.create_budget_field(body, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BudgetFieldsApi->create_budget_field: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Field**](Field.md)| Budget field to create | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**list[Field]**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_budget_field**
> delete_budget_field(id)

Delete a budget field

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
api_instance = swagger_client.BudgetFieldsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | Budget field id

try:
    # Delete a budget field
    api_instance.delete_budget_field(id)
except ApiException as e:
    print("Exception when calling BudgetFieldsApi->delete_budget_field: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Budget field id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_budget_field**
> Field get_budget_field(id, expand=expand)

Retrieves a budget field

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
api_instance = swagger_client.BudgetFieldsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | Budget field id
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Retrieves a budget field
    api_response = api_instance.get_budget_field(id, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BudgetFieldsApi->get_budget_field: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Budget field id | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**Field**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_budget_fields_for_portfolio**
> Fields get_budget_fields_for_portfolio(portfolio_id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)

Retrieves budget fields for a portfolio.

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
api_instance = swagger_client.BudgetFieldsApi(swagger_client.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio id
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Retrieves budget fields for a portfolio.
    api_response = api_instance.get_budget_fields_for_portfolio(portfolio_id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BudgetFieldsApi->get_budget_fields_for_portfolio: %s\n" % e)
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

# **update_budget_field**
> list[Field] update_budget_field(id, body, expand=expand)

Updates a budget field utilizing JSON Patch Operations.

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
api_instance = swagger_client.BudgetFieldsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | Budget field id
body = swagger_client.Operations() # Operations | JSON Patch Operations to update budget field.
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Updates a budget field utilizing JSON Patch Operations.
    api_response = api_instance.update_budget_field(id, body, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BudgetFieldsApi->update_budget_field: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Budget field id | 
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update budget field. | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**list[Field]**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_budget_fields**
> list[Field] update_budget_fields(body, expand=expand)

Update budget fields

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
api_instance = swagger_client.BudgetFieldsApi(swagger_client.ApiClient(configuration))
body = [swagger_client.PatchItem()] # list[PatchItem] | JSON Patch Operations to update multiple budgeet fields.
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Update budget fields
    api_response = api_instance.update_budget_fields(body, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BudgetFieldsApi->update_budget_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[PatchItem]**](PatchItem.md)| JSON Patch Operations to update multiple budgeet fields. | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**list[Field]**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

