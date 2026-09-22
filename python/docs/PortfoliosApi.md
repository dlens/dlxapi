# dlxapi.PortfoliosApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archive_portfolio**](PortfoliosApi.md#archive_portfolio) | **DELETE** /portfolios/{id} | Archive a portfolio.
[**copy_portfolio**](PortfoliosApi.md#copy_portfolio) | **POST** /portfolios/{id}/copy | Creates a deep copy of the portfolio
[**create_portfolio**](PortfoliosApi.md#create_portfolio) | **POST** /portfolios | Creates a new portfolio.
[**create_ui_settings_for_portfolios**](PortfoliosApi.md#create_ui_settings_for_portfolios) | **POST** /portfolios/uiSettings | Creates UI settings for portfolios
[**create_view**](PortfoliosApi.md#create_view) | **POST** /portfolios/{portfolioId}/savedViews | Create a saved view for a portfolio
[**delete_spreadsheet_report_for_portfolio**](PortfoliosApi.md#delete_spreadsheet_report_for_portfolio) | **DELETE** /portfolios/{portfolioId}/spreadsheet/{spreadsheetId}/report | Deletes the spreadsheet report for a portfolio
[**delete_ui_settings_for_portfolio**](PortfoliosApi.md#delete_ui_settings_for_portfolio) | **DELETE** /portfolios/{portfolioId}/uiSettings | Deletes user portfolio UI settings
[**delete_view**](PortfoliosApi.md#delete_view) | **DELETE** /portfolios/{portfolioId}/savedViews/{viewId} | Delete a saved view
[**download_spreadsheet_template**](PortfoliosApi.md#download_spreadsheet_template) | **GET** /portfolios/{portfolioId}/spreadsheet/template | Download spreadsheet template for portfolio
[**export_portfolio_data**](PortfoliosApi.md#export_portfolio_data) | **GET** /portfolios/{id}/pod | Export portfolio data in JSON format
[**generate_ai_insights**](PortfoliosApi.md#generate_ai_insights) | **POST** /portfolios/{id}/aiInsights | Generate ai insights for projects and portfolio plans.
[**get_health_report_for_portfolio**](PortfoliosApi.md#get_health_report_for_portfolio) | **GET** /portfolios/{portfolioId}/healthReport | Get health report for a portfolio
[**get_latest_pod_import_for_portfolio**](PortfoliosApi.md#get_latest_pod_import_for_portfolio) | **GET** /portfolios/{id}/podImport | Get the latest pod import queued for the portfolio
[**get_latest_spreadsheet_import_for_portfolio**](PortfoliosApi.md#get_latest_spreadsheet_import_for_portfolio) | **GET** /portfolios/{portfolioId}/spreadsheetImport | Get the latest spreadsheet import queued for the portfolio
[**get_portfolio**](PortfoliosApi.md#get_portfolio) | **GET** /portfolios/{id} | Retrieves a portfolio.
[**get_portfolio_activities**](PortfoliosApi.md#get_portfolio_activities) | **GET** /portfolios/{id}/activities | Retrieves portfolio activities log.
[**get_portfolio_budgets**](PortfoliosApi.md#get_portfolio_budgets) | **GET** /portfolios/{id}/budgets | (Deprecated. Use getBudgetsForPortfolioPlan) Retrieves resource pools in a portfolio.
[**get_portfolio_plan_users_for_portfolio**](PortfoliosApi.md#get_portfolio_plan_users_for_portfolio) | **GET** /portfolios/{portfolioId}/portfolioPlanUsers | Retrieves portfolio plan users for portfolio
[**get_portfolios**](PortfoliosApi.md#get_portfolios) | **GET** /portfolios | Get portfolios.
[**get_portfolios_for_user**](PortfoliosApi.md#get_portfolios_for_user) | **GET** /portfolios/user/{id} | Retrieves portfolios for specific user.
[**get_projects_in_portfolio**](PortfoliosApi.md#get_projects_in_portfolio) | **GET** /portfolios/{portfolioId}/projects | Retrieves projects for portfolio
[**get_spreadsheet_report_for_portfolio**](PortfoliosApi.md#get_spreadsheet_report_for_portfolio) | **GET** /portfolios/{portfolioId}/spreadsheet/{spreadsheetId}/report | Retrieves spreadsheet report for portfolio
[**get_ui_settings_for_portfolio**](PortfoliosApi.md#get_ui_settings_for_portfolio) | **GET** /portfolios/{portfolioId}/uiSettings | Gets user portfolio UI settings
[**get_view**](PortfoliosApi.md#get_view) | **GET** /portfolios/{portfolioId}/savedViews/{viewId} | Get a saved view by id
[**get_views**](PortfoliosApi.md#get_views) | **GET** /portfolios/{portfolioId}/savedViews | Get saved views for a portfolio
[**import_portfolio_data**](PortfoliosApi.md#import_portfolio_data) | **POST** /portfolios/{id}/pod | Import portfolio data in JSON format
[**patch_view**](PortfoliosApi.md#patch_view) | **PATCH** /portfolios/{portfolioId}/savedViews/{viewId} | Patch view settings using JSON Patch operations
[**regenerate_user_registration_token**](PortfoliosApi.md#regenerate_user_registration_token) | **POST** /portfolios/{id}/regenerateUserRegistrationToken | Generates a new registration token
[**save_prioritization_field_scores_for_portfolio**](PortfoliosApi.md#save_prioritization_field_scores_for_portfolio) | **POST** /portfolios/{id}/prioritizationFieldScores | Save Prioritization field scores for a portfolio
[**save_spreadsheet_for_portfolio**](PortfoliosApi.md#save_spreadsheet_for_portfolio) | **POST** /portfolios/{portfolioId}/spreadsheet/{spreadsheetId} | Saves spreadsheet for portfolio
[**save_spreadsheet_source_for_portfolio**](PortfoliosApi.md#save_spreadsheet_source_for_portfolio) | **POST** /portfolios/{id}/sources/spreadsheet | Save spreadsheet source for a portfolio
[**set_custom_names**](PortfoliosApi.md#set_custom_names) | **PUT** /portfolios/{portfolioId}/customNames | Updates custom names for portfolio
[**submit_metric_job**](PortfoliosApi.md#submit_metric_job) | **POST** /portfolios/{portfolioId}/metricJob | Force recalculation of metric job type
[**update_portfolio**](PortfoliosApi.md#update_portfolio) | **PATCH** /portfolios/{id} | Update a portfolio.
[**update_portfolio_budget_amounts**](PortfoliosApi.md#update_portfolio_budget_amounts) | **PATCH** /portfolios/{id}/budgetAmounts | (Deprecated. Use updateBudgetAmountsForPortfolioPlan) Update budget amounts in a portfolio
[**update_portfolio_field_values**](PortfoliosApi.md#update_portfolio_field_values) | **PATCH** /portfolios/{id}/fieldValues | Update field values in a portfolio
[**update_spreadsheet_report_for_portfolio**](PortfoliosApi.md#update_spreadsheet_report_for_portfolio) | **PATCH** /portfolios/{portfolioId}/spreadsheet/{spreadsheetId}/report | Updates the spreadsheet report for a portfolio
[**update_ui_settings_for_portfolio**](PortfoliosApi.md#update_ui_settings_for_portfolio) | **PATCH** /portfolios/{portfolioId}/uiSettings | Updates user portfolio UI settings

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

# **copy_portfolio**
> Portfolio copy_portfolio(name, id, body=body, copy_fields=copy_fields, copy_projects=copy_projects, copy_people=copy_people, copy_comments=copy_comments)

Creates a deep copy of the portfolio

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
name = 'name_example' # str | Portfolio name
id = 'id_example' # str | Portfolio id to copy
body = dlxapi.CopyPrioritizationsRequest() # CopyPrioritizationsRequest | Optional request to copy prioritizations during portfolio copy (optional)
copy_fields = true # bool | Copy fields from a template portfolio. By default is true (optional) (default to true)
copy_projects = true # bool | Copy projects from a template portfolio. By default is true (optional) (default to true)
copy_people = true # bool | Copy people from a template portfolio. By default is true (optional) (default to true)
copy_comments = false # bool | Copy comments from a template portfolio. By default is false (optional) (default to false)

try:
    # Creates a deep copy of the portfolio
    api_response = api_instance.copy_portfolio(name, id, body=body, copy_fields=copy_fields, copy_projects=copy_projects, copy_people=copy_people, copy_comments=copy_comments)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->copy_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| Portfolio name | 
 **id** | **str**| Portfolio id to copy | 
 **body** | [**CopyPrioritizationsRequest**](CopyPrioritizationsRequest.md)| Optional request to copy prioritizations during portfolio copy | [optional] 
 **copy_fields** | **bool**| Copy fields from a template portfolio. By default is true | [optional] [default to true]
 **copy_projects** | **bool**| Copy projects from a template portfolio. By default is true | [optional] [default to true]
 **copy_people** | **bool**| Copy people from a template portfolio. By default is true | [optional] [default to true]
 **copy_comments** | **bool**| Copy comments from a template portfolio. By default is false | [optional] [default to false]

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
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

# **create_ui_settings_for_portfolios**
> list[PortfolioUiSettings] create_ui_settings_for_portfolios(body)

Creates UI settings for portfolios

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
body = [dlxapi.PortfolioUiSettings()] # list[PortfolioUiSettings] | UI settings

try:
    # Creates UI settings for portfolios
    api_response = api_instance.create_ui_settings_for_portfolios(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->create_ui_settings_for_portfolios: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[PortfolioUiSettings]**](PortfolioUiSettings.md)| UI settings | 

### Return type

[**list[PortfolioUiSettings]**](PortfolioUiSettings.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_view**
> SavedView create_view(body, portfolio_id)

Create a saved view for a portfolio

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
body = dlxapi.SavedView() # SavedView | View to create
portfolio_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Portfolio id

try:
    # Create a saved view for a portfolio
    api_response = api_instance.create_view(body, portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->create_view: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SavedView**](SavedView.md)| View to create | 
 **portfolio_id** | [**str**](.md)| Portfolio id | 

### Return type

[**SavedView**](SavedView.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_spreadsheet_report_for_portfolio**
> SpreadsheetReport delete_spreadsheet_report_for_portfolio(portfolio_id, spreadsheet_id, sheet_name)

Deletes the spreadsheet report for a portfolio

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
    # Deletes the spreadsheet report for a portfolio
    api_response = api_instance.delete_spreadsheet_report_for_portfolio(portfolio_id, spreadsheet_id, sheet_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->delete_spreadsheet_report_for_portfolio: %s\n" % e)
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

# **delete_ui_settings_for_portfolio**
> delete_ui_settings_for_portfolio(portfolio_id)

Deletes user portfolio UI settings

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
portfolio_id = 'portfolio_id_example' # str | portfolio id

try:
    # Deletes user portfolio UI settings
    api_instance.delete_ui_settings_for_portfolio(portfolio_id)
except ApiException as e:
    print("Exception when calling PortfoliosApi->delete_ui_settings_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| portfolio id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_view**
> delete_view(portfolio_id, view_id)

Delete a saved view

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
portfolio_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Portfolio id
view_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Saved view id

try:
    # Delete a saved view
    api_instance.delete_view(portfolio_id, view_id)
except ApiException as e:
    print("Exception when calling PortfoliosApi->delete_view: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**str**](.md)| Portfolio id | 
 **view_id** | [**str**](.md)| Saved view id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_spreadsheet_template**
> str download_spreadsheet_template(portfolio_id)

Download spreadsheet template for portfolio

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

try:
    # Download spreadsheet template for portfolio
    api_response = api_instance.download_spreadsheet_template(portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->download_spreadsheet_template: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **export_portfolio_data**
> str export_portfolio_data(id, include_attachments=include_attachments)

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
include_attachments = false # bool | Whether to include attachments in the export (optional) (default to false)

try:
    # Export portfolio data in JSON format
    api_response = api_instance.export_portfolio_data(id, include_attachments=include_attachments)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->export_portfolio_data: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio id | 
 **include_attachments** | **bool**| Whether to include attachments in the export | [optional] [default to false]

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_ai_insights**
> Summary generate_ai_insights(body, id)

Generate ai insights for projects and portfolio plans.

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
body = dlxapi.Prompt() # Prompt | JSON object containing project ids and portfolio plan id.
id = 'id_example' # str | Portfolio id

try:
    # Generate ai insights for projects and portfolio plans.
    api_response = api_instance.generate_ai_insights(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->generate_ai_insights: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Prompt**](Prompt.md)| JSON object containing project ids and portfolio plan id. | 
 **id** | **str**| Portfolio id | 

### Return type

[**Summary**](Summary.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_health_report_for_portfolio**
> str get_health_report_for_portfolio(portfolio_id)

Get health report for a portfolio

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

try:
    # Get health report for a portfolio
    api_response = api_instance.get_health_report_for_portfolio(portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->get_health_report_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_latest_pod_import_for_portfolio**
> PodImport get_latest_pod_import_for_portfolio(id)

Get the latest pod import queued for the portfolio

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
    # Get the latest pod import queued for the portfolio
    api_response = api_instance.get_latest_pod_import_for_portfolio(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->get_latest_pod_import_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio id | 

### Return type

[**PodImport**](PodImport.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_latest_spreadsheet_import_for_portfolio**
> SpreadsheetImport get_latest_spreadsheet_import_for_portfolio(portfolio_id)

Get the latest spreadsheet import queued for the portfolio

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

try:
    # Get the latest spreadsheet import queued for the portfolio
    api_response = api_instance.get_latest_spreadsheet_import_for_portfolio(portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->get_latest_spreadsheet_import_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 

### Return type

[**SpreadsheetImport**](SpreadsheetImport.md)

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

# **get_portfolio_budgets**
> Budgets get_portfolio_budgets(id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)

(Deprecated. Use getBudgetsForPortfolioPlan) Retrieves resource pools in a portfolio.

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
    # (Deprecated. Use getBudgetsForPortfolioPlan) Retrieves resource pools in a portfolio.
    api_response = api_instance.get_portfolio_budgets(id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->get_portfolio_budgets: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Portfolio id | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#x27;-&#x27; in front of expression for reverse order. | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**Budgets**](Budgets.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_plan_users_for_portfolio**
> PortfolioPlanUsers get_portfolio_plan_users_for_portfolio(portfolio_id)

Retrieves portfolio plan users for portfolio

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

try:
    # Retrieves portfolio plan users for portfolio
    api_response = api_instance.get_portfolio_plan_users_for_portfolio(portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->get_portfolio_plan_users_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 

### Return type

[**PortfolioPlanUsers**](PortfolioPlanUsers.md)

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
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#x27;-&#x27; in front of expression for reverse order. | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**Portfolios**](Portfolios.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolios_for_user**
> Portfolios get_portfolios_for_user(id)

Retrieves portfolios for specific user.

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
id = 'id_example' # str | User id

try:
    # Retrieves portfolios for specific user.
    api_response = api_instance.get_portfolios_for_user(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->get_portfolios_for_user: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| User id | 

### Return type

[**Portfolios**](Portfolios.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_projects_in_portfolio**
> Projects get_projects_in_portfolio(portfolio_id, limit=limit, offset=offset)

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
    api_response = api_instance.get_projects_in_portfolio(portfolio_id, limit=limit, offset=offset)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->get_projects_in_portfolio: %s\n" % e)
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
> SpreadsheetReport get_spreadsheet_report_for_portfolio(portfolio_id, spreadsheet_id, sheet_name, import_type=import_type, cost_type_id=cost_type_id, expand=expand)

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
import_type = 'import_type_example' # str | Import type (optional)
cost_type_id = 'cost_type_id_example' # str | Cost Type ID (optional)
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Retrieves spreadsheet report for portfolio
    api_response = api_instance.get_spreadsheet_report_for_portfolio(portfolio_id, spreadsheet_id, sheet_name, import_type=import_type, cost_type_id=cost_type_id, expand=expand)
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
 **import_type** | **str**| Import type | [optional] 
 **cost_type_id** | **str**| Cost Type ID | [optional] 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**SpreadsheetReport**](SpreadsheetReport.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ui_settings_for_portfolio**
> dict(str, object) get_ui_settings_for_portfolio(portfolio_id)

Gets user portfolio UI settings

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

try:
    # Gets user portfolio UI settings
    api_response = api_instance.get_ui_settings_for_portfolio(portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->get_ui_settings_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 

### Return type

**dict(str, object)**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_view**
> SavedView get_view(portfolio_id, view_id)

Get a saved view by id

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
portfolio_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Portfolio id
view_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Saved view id

try:
    # Get a saved view by id
    api_response = api_instance.get_view(portfolio_id, view_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->get_view: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**str**](.md)| Portfolio id | 
 **view_id** | [**str**](.md)| Saved view id | 

### Return type

[**SavedView**](SavedView.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_views**
> SavedViews get_views(portfolio_id, view_type=view_type)

Get saved views for a portfolio

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
portfolio_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Portfolio id
view_type = dlxapi.SavedViewType() # SavedViewType | The page these views belong to. Defaults to PROJECTS. (optional)

try:
    # Get saved views for a portfolio
    api_response = api_instance.get_views(portfolio_id, view_type=view_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->get_views: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**str**](.md)| Portfolio id | 
 **view_type** | [**SavedViewType**](.md)| The page these views belong to. Defaults to PROJECTS. | [optional] 

### Return type

[**SavedViews**](SavedViews.md)

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
pod_file = 'pod_file_example' # str |  (optional)
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
 **pod_file** | **str**|  | [optional] 
 **template_name** | **str**| pod template name to load | [optional] 

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_view**
> SavedView patch_view(body, portfolio_id, view_id)

Patch view settings using JSON Patch operations

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
body = dlxapi.Operations() # Operations | JSON Patch operations to update view settings
portfolio_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Portfolio id
view_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Saved view id

try:
    # Patch view settings using JSON Patch operations
    api_response = api_instance.patch_view(body, portfolio_id, view_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->patch_view: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch operations to update view settings | 
 **portfolio_id** | [**str**](.md)| Portfolio id | 
 **view_id** | [**str**](.md)| Saved view id | 

### Return type

[**SavedView**](SavedView.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
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

# **save_prioritization_field_scores_for_portfolio**
> list[Field] save_prioritization_field_scores_for_portfolio(body, id)

Save Prioritization field scores for a portfolio

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
body = [dlxapi.PrioritizationField()] # list[PrioritizationField] | Prioritization fields
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Portfolio id

try:
    # Save Prioritization field scores for a portfolio
    api_response = api_instance.save_prioritization_field_scores_for_portfolio(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->save_prioritization_field_scores_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[PrioritizationField]**](PrioritizationField.md)| Prioritization fields | 
 **id** | [**str**](.md)| Portfolio id | 

### Return type

[**list[Field]**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_spreadsheet_for_portfolio**
> SpreadsheetImport save_spreadsheet_for_portfolio(portfolio_id, spreadsheet_id, sheet_name, import_type=import_type, cost_type_id=cost_type_id, save_snapshot_before_import=save_snapshot_before_import)

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
import_type = 'import_type_example' # str | Import type (optional)
cost_type_id = 'cost_type_id_example' # str | Cost Type ID (optional)
save_snapshot_before_import = false # bool | When true, an automatic snapshot of the portfolio is saved before the import is applied (optional) (default to false)

try:
    # Saves spreadsheet for portfolio
    api_response = api_instance.save_spreadsheet_for_portfolio(portfolio_id, spreadsheet_id, sheet_name, import_type=import_type, cost_type_id=cost_type_id, save_snapshot_before_import=save_snapshot_before_import)
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
 **import_type** | **str**| Import type | [optional] 
 **cost_type_id** | **str**| Cost Type ID | [optional] 
 **save_snapshot_before_import** | **bool**| When true, an automatic snapshot of the portfolio is saved before the import is applied | [optional] [default to false]

### Return type

[**SpreadsheetImport**](SpreadsheetImport.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_spreadsheet_source_for_portfolio**
> Source save_spreadsheet_source_for_portfolio(file, id, sheet_name=sheet_name, import_type=import_type, cost_type_id=cost_type_id)

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
file = 'file_example' # str | 
id = 'id_example' # str | Portfolio id
sheet_name = 'sheet_name_example' # str | Spreadsheet name. Defaults to first sheet. (optional)
import_type = 'import_type_example' # str | Import type. Defaults to PROJECT. (optional)
cost_type_id = 'cost_type_id_example' # str | Cost type id. Defaults to null. (optional)

try:
    # Save spreadsheet source for a portfolio
    api_response = api_instance.save_spreadsheet_source_for_portfolio(file, id, sheet_name=sheet_name, import_type=import_type, cost_type_id=cost_type_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->save_spreadsheet_source_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **str**|  | 
 **id** | **str**| Portfolio id | 
 **sheet_name** | **str**| Spreadsheet name. Defaults to first sheet. | [optional] 
 **import_type** | **str**| Import type. Defaults to PROJECT. | [optional] 
 **cost_type_id** | **str**| Cost type id. Defaults to null. | [optional] 

### Return type

[**Source**](Source.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_custom_names**
> list[CustomName] set_custom_names(body, portfolio_id)

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
body = [dlxapi.CustomName()] # list[CustomName] | Custom names
portfolio_id = 'portfolio_id_example' # str | Portfolio id

try:
    # Updates custom names for portfolio
    api_response = api_instance.set_custom_names(body, portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->set_custom_names: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[CustomName]**](CustomName.md)| Custom names | 
 **portfolio_id** | **str**| Portfolio id | 

### Return type

[**list[CustomName]**](CustomName.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_metric_job**
> MetricJobResponse submit_metric_job(portfolio_id, metric_job_type)

Force recalculation of metric job type

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
metric_job_type = dlxapi.MetricJobType() # MetricJobType | Metric job type

try:
    # Force recalculation of metric job type
    api_response = api_instance.submit_metric_job(portfolio_id, metric_job_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->submit_metric_job: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 
 **metric_job_type** | [**MetricJobType**](.md)| Metric job type | 

### Return type

[**MetricJobResponse**](MetricJobResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio**
> Portfolio update_portfolio(body, id, expand=expand)

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
body = dlxapi.Operations() # Operations | 
id = 'id_example' # str | Portfolio id
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Update a portfolio.
    api_response = api_instance.update_portfolio(body, id, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->update_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)|  | 
 **id** | **str**| Portfolio id | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_budget_amounts**
> list[Budget] update_portfolio_budget_amounts(body, id)

(Deprecated. Use updateBudgetAmountsForPortfolioPlan) Update budget amounts in a portfolio

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
body = [dlxapi.BudgetAmountPatchItem()] # list[BudgetAmountPatchItem] | JSON Patch Operations to update multiple budgets amounts
id = 'id_example' # str | Portfolio id

try:
    # (Deprecated. Use updateBudgetAmountsForPortfolioPlan) Update budget amounts in a portfolio
    api_response = api_instance.update_portfolio_budget_amounts(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->update_portfolio_budget_amounts: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[BudgetAmountPatchItem]**](BudgetAmountPatchItem.md)| JSON Patch Operations to update multiple budgets amounts | 
 **id** | **str**| Portfolio id | 

### Return type

[**list[Budget]**](Budget.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_field_values**
> list[FieldValue] update_portfolio_field_values(body, id, expand=expand)

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
body = [dlxapi.FieldValuePatchItem()] # list[FieldValuePatchItem] | JSON Patch Operations to update multiple field values.
id = 'id_example' # str | Portfolio id
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Update field values in a portfolio
    api_response = api_instance.update_portfolio_field_values(body, id, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->update_portfolio_field_values: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[FieldValuePatchItem]**](FieldValuePatchItem.md)| JSON Patch Operations to update multiple field values. | 
 **id** | **str**| Portfolio id | 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**list[FieldValue]**](FieldValue.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_spreadsheet_report_for_portfolio**
> SpreadsheetReport update_spreadsheet_report_for_portfolio(body, sheet_name, portfolio_id, spreadsheet_id, import_type=import_type, expand=expand)

Updates the spreadsheet report for a portfolio

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
body = [dlxapi.SpreadsheetField()] # list[SpreadsheetField] | Spreadsheet fields
sheet_name = 'sheet_name_example' # str | Spreadsheet name
portfolio_id = 'portfolio_id_example' # str | Portfolio id
spreadsheet_id = 'spreadsheet_id_example' # str | Spreadsheet id
import_type = dlxapi.ImportType() # ImportType | Import type (optional)
expand = 'expand_example' # str | JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. (optional)

try:
    # Updates the spreadsheet report for a portfolio
    api_response = api_instance.update_spreadsheet_report_for_portfolio(body, sheet_name, portfolio_id, spreadsheet_id, import_type=import_type, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->update_spreadsheet_report_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[SpreadsheetField]**](SpreadsheetField.md)| Spreadsheet fields | 
 **sheet_name** | **str**| Spreadsheet name | 
 **portfolio_id** | **str**| Portfolio id | 
 **spreadsheet_id** | **str**| Spreadsheet id | 
 **import_type** | [**ImportType**](.md)| Import type | [optional] 
 **expand** | **str**| JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy. | [optional] 

### Return type

[**SpreadsheetReport**](SpreadsheetReport.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_ui_settings_for_portfolio**
> dict(str, object) update_ui_settings_for_portfolio(body, portfolio_id)

Updates user portfolio UI settings

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
body = dlxapi.Operations() # Operations | JSON Patch Operations to update multiple UI settings
portfolio_id = 'portfolio_id_example' # str | Portfolio id

try:
    # Updates user portfolio UI settings
    api_response = api_instance.update_ui_settings_for_portfolio(body, portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfoliosApi->update_ui_settings_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update multiple UI settings | 
 **portfolio_id** | **str**| Portfolio id | 

### Return type

**dict(str, object)**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

