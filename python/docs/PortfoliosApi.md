# swagger_client.PortfoliosApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archive_portfolio**](PortfoliosApi.md#archive_portfolio) | **DELETE** /portfolios/{id} | Archive a portfolio.
[**create_portfolio**](PortfoliosApi.md#create_portfolio) | **POST** /portfolios | Creates a new portfolio.
[**export_portfolio_data**](PortfoliosApi.md#export_portfolio_data) | **GET** /portfolios/{id}/pod | Export portfolio data in JSON format
[**get_portfolio**](PortfoliosApi.md#get_portfolio) | **GET** /portfolios/{id} | Retrieves a portfolio.
[**get_portfolio_activities**](PortfoliosApi.md#get_portfolio_activities) | **GET** /portfolios/{id}/activities | Retrieves portfolio activities log.
[**get_portfolio_resource_pools**](PortfoliosApi.md#get_portfolio_resource_pools) | **GET** /portfolios/{id}/resourcePools | (Deprecated. Use getResourcePoolsForPortfolioPlan) Retrieves resource pools in a portfolio.
[**get_portfolios**](PortfoliosApi.md#get_portfolios) | **GET** /portfolios | Get portfolios.
[**get_projects_for_portfolio**](PortfoliosApi.md#get_projects_for_portfolio) | **GET** /portfolios/{portfolioId}/projects | Retrieves projects for portfolio
[**get_spreadsheet_report_for_portfolio**](PortfoliosApi.md#get_spreadsheet_report_for_portfolio) | **GET** /portfolios/{portfolioId}/spreadsheet/{spreadsheetId}/report | Retrieves spreadsheet report for portfolio
[**import_portfolio_data**](PortfoliosApi.md#import_portfolio_data) | **POST** /portfolios/{id}/pod | Import portfolio data in JSON format
[**regenerate_user_registration_token**](PortfoliosApi.md#regenerate_user_registration_token) | **POST** /portfolios/{id}/regenerateUserRegistrationToken | Generates a new registration token
[**save_spreadsheet_for_portfolio**](PortfoliosApi.md#save_spreadsheet_for_portfolio) | **POST** /portfolios/{portfolioId}/spreadsheet/{spreadsheetId} | Saves spreadsheet for portfolio
[**save_spreadsheet_source_for_portfolio**](PortfoliosApi.md#save_spreadsheet_source_for_portfolio) | **POST** /portfolios/{id}/sources/spreadsheet | Save spreadsheet source for a portfolio
[**set_custom_names**](PortfoliosApi.md#set_custom_names) | **PUT** /portfolios/{portfolioId}/customNames | Updates custom names for portfolio
[**update_portfolio**](PortfoliosApi.md#update_portfolio) | **PATCH** /portfolios/{id} | Update a portfolio.
[**update_portfolio_field_values**](PortfoliosApi.md#update_portfolio_field_values) | **PATCH** /portfolios/{id}/fieldValues | Update field values in a portfolio
[**update_portfolio_resource_pool_budget_amounts**](PortfoliosApi.md#update_portfolio_resource_pool_budget_amounts) | **PATCH** /portfolios/{id}/resourcePoolBudgetAmounts | (Deprecated. Use updateResourcePoolBudgetAmountsForPortfolioPlan) Update resource pool budget amounts in a portfolio


# **archive_portfolio**
> Portfolio archive_portfolio(id)

Archive a portfolio.

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
api_instance = dlxapi.PortfoliosApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio id

try:
    # Archive a portfolio.
    api_response = api_instance.archive_portfolio(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->archive_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio id | 

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_portfolio**
> Portfolio create_portfolio(body)

Creates a new portfolio.

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
api_instance = dlxapi.PortfoliosApi(dlxapi.ApiClient(configuration))
body = dlxapi.Portfolio() # Portfolio | Portfolio to create

try:
    # Creates a new portfolio.
    api_response = api_instance.create_portfolio(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->create_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Portfolio**](Portfolio.md)| Portfolio to create | 

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **export_portfolio_data**
> str export_portfolio_data(id)

Export portfolio data in JSON format

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
api_instance = dlxapi.PortfoliosApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio id

try:
    # Export portfolio data in JSON format
    api_response = api_instance.export_portfolio_data(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->export_portfolio_data: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio id | 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio**
> Portfolio get_portfolio(id, expand=expand)

Retrieves a portfolio.

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
api_instance = dlxapi.PortfoliosApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio id
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Retrieves a portfolio.
    api_response = api_instance.get_portfolio(id, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->get_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio id | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_activities**
> Activities get_portfolio_activities(id, limit=limit, offset=offset, match=match)

Retrieves portfolio activities log.

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
api_instance = dlxapi.PortfoliosApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio id
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Retrieves portfolio activities log.
    api_response = api_instance.get_portfolio_activities(id, limit=limit, offset=offset, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->get_portfolio_activities: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio id | 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**Activities**](Activities.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_resource_pools**
> ResourcePools get_portfolio_resource_pools(id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)

(Deprecated. Use getResourcePoolsForPortfolioPlan) Retrieves resource pools in a portfolio.

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
api_instance = dlxapi.PortfoliosApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio id
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # (Deprecated. Use getResourcePoolsForPortfolioPlan) Retrieves resource pools in a portfolio.
    api_response = api_instance.get_portfolio_resource_pools(id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->get_portfolio_resource_pools: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio id | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**ResourcePools**](ResourcePools.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolios**
> Portfolios get_portfolios(expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)

Get portfolios.

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
api_instance = dlxapi.PortfoliosApi(dlxapi.ApiClient(configuration))
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Get portfolios.
    api_response = api_instance.get_portfolios(expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->get_portfolios: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**Portfolios**](Portfolios.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_projects_for_portfolio**
> Projects get_projects_for_portfolio(portfolio_id, limit=limit, offset=offset)

Retrieves projects for portfolio

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
api_instance = dlxapi.PortfoliosApi(dlxapi.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio id
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)

try:
    # Retrieves projects for portfolio
    api_response = api_instance.get_projects_for_portfolio(portfolio_id, limit=limit, offset=offset)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->get_projects_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 

### Return type

[**Projects**](Projects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_spreadsheet_report_for_portfolio**
> SpreadsheetReport get_spreadsheet_report_for_portfolio(portfolio_id, spreadsheet_id, sheet_name, expand=expand)

Retrieves spreadsheet report for portfolio

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
api_instance = dlxapi.PortfoliosApi(dlxapi.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio id
spreadsheet_id = 'spreadsheet_id_example' # str | Spreadsheet id
sheet_name = 'sheet_name_example' # str | Spreadsheet name
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Retrieves spreadsheet report for portfolio
    api_response = api_instance.get_spreadsheet_report_for_portfolio(portfolio_id, spreadsheet_id, sheet_name, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->get_spreadsheet_report_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 
 **spreadsheet_id** | **str**| Spreadsheet id | 
 **sheet_name** | **str**| Spreadsheet name | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**SpreadsheetReport**](SpreadsheetReport.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **import_portfolio_data**
> Portfolio import_portfolio_data(id, pod_file=pod_file, template_name=template_name)

Import portfolio data in JSON format

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
api_instance = dlxapi.PortfoliosApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio id
pod_file = '/path/to/file.txt' # file | The pod file to upload. (optional)
template_name = 'template_name_example' # str | pod template name to load (optional)

try:
    # Import portfolio data in JSON format
    api_response = api_instance.import_portfolio_data(id, pod_file=pod_file, template_name=template_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->import_portfolio_data: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio id | 
 **pod_file** | **file**| The pod file to upload. | [optional] 
 **template_name** | **str**| pod template name to load | [optional] 

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **regenerate_user_registration_token**
> Portfolio regenerate_user_registration_token(id)

Generates a new registration token

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
api_instance = dlxapi.PortfoliosApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio id

try:
    # Generates a new registration token
    api_response = api_instance.regenerate_user_registration_token(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->regenerate_user_registration_token: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio id | 

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_spreadsheet_for_portfolio**
> SpreadsheetReport save_spreadsheet_for_portfolio(portfolio_id, spreadsheet_id, sheet_name)

Saves spreadsheet for portfolio

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
api_instance = dlxapi.PortfoliosApi(dlxapi.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio id
spreadsheet_id = 'spreadsheet_id_example' # str | Spreadsheet id
sheet_name = 'sheet_name_example' # str | Spreadsheet name

try:
    # Saves spreadsheet for portfolio
    api_response = api_instance.save_spreadsheet_for_portfolio(portfolio_id, spreadsheet_id, sheet_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->save_spreadsheet_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 
 **spreadsheet_id** | **str**| Spreadsheet id | 
 **sheet_name** | **str**| Spreadsheet name | 

### Return type

[**SpreadsheetReport**](SpreadsheetReport.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_spreadsheet_source_for_portfolio**
> Source save_spreadsheet_source_for_portfolio(id, file, save_zero_as_blank=save_zero_as_blank)

Save spreadsheet source for a portfolio

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
api_instance = dlxapi.PortfoliosApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio id
file = '/path/to/file.txt' # file | 
save_zero_as_blank = true # bool |  (optional)

try:
    # Save spreadsheet source for a portfolio
    api_response = api_instance.save_spreadsheet_source_for_portfolio(id, file, save_zero_as_blank=save_zero_as_blank)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->save_spreadsheet_source_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio id | 
 **file** | **file**|  | 
 **save_zero_as_blank** | **bool**|  | [optional] 

### Return type

[**Source**](Source.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_custom_names**
> list[CustomName] set_custom_names(portfolio_id, custom_names)

Updates custom names for portfolio

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
api_instance = dlxapi.PortfoliosApi(dlxapi.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio id
custom_names = [dlxapi.CustomName()] # list[CustomName] | Custom names

try:
    # Updates custom names for portfolio
    api_response = api_instance.set_custom_names(portfolio_id, custom_names)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->set_custom_names: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 
 **custom_names** | [**list[CustomName]**](CustomName.md)| Custom names | 

### Return type

[**list[CustomName]**](CustomName.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio**
> Portfolio update_portfolio(id, body, expand=expand)

Update a portfolio.

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
api_instance = dlxapi.PortfoliosApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Portfolio id
body = dlxapi.Operations() # Operations | JSON Patch Operations to update a portfolio.
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Update a portfolio.
    api_response = api_instance.update_portfolio(id, body, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->update_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio id | 
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update a portfolio. | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_field_values**
> list[FieldValue] update_portfolio_field_values(id, body, expand=expand)

Update field values in a portfolio

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
api_instance = dlxapi.PortfoliosApi(dlxapi.ApiClient(configuration))
id = NULL # object | Portfolio id
body = [dlxapi.FieldValuePatchItem()] # list[FieldValuePatchItem] | JSON Patch Operations to update multiple field values.
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Update field values in a portfolio
    api_response = api_instance.update_portfolio_field_values(id, body, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->update_portfolio_field_values: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**object**](.md)| Portfolio id | 
 **body** | [**list[FieldValuePatchItem]**](FieldValuePatchItem.md)| JSON Patch Operations to update multiple field values. | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**list[FieldValue]**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_resource_pool_budget_amounts**
> list[ResourcePool] update_portfolio_resource_pool_budget_amounts(id, body)

(Deprecated. Use updateResourcePoolBudgetAmountsForPortfolioPlan) Update resource pool budget amounts in a portfolio

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
api_instance = dlxapi.PortfoliosApi(dlxapi.ApiClient(configuration))
id = NULL # object | Portfolio id
body = [dlxapi.ResourcePoolBudgetAmountPatchItem()] # list[ResourcePoolBudgetAmountPatchItem] | JSON Patch Operations to update multiple resource pool budget amounts

try:
    # (Deprecated. Use updateResourcePoolBudgetAmountsForPortfolioPlan) Update resource pool budget amounts in a portfolio
    api_response = api_instance.update_portfolio_resource_pool_budget_amounts(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->update_portfolio_resource_pool_budget_amounts: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**object**](.md)| Portfolio id | 
 **body** | [**list[ResourcePoolBudgetAmountPatchItem]**](ResourcePoolBudgetAmountPatchItem.md)| JSON Patch Operations to update multiple resource pool budget amounts | 

### Return type

[**list[ResourcePool]**](ResourcePool.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

