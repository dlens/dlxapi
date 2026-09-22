# dlxapi.PrioritizationsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_prioritization_users**](PrioritizationsApi.md#add_prioritization_users) | **POST** /prioritizations/{id}/users | Add users to prioritization
[**copy_prioritization**](PrioritizationsApi.md#copy_prioritization) | **POST** /prioritizations/{id}/copy | Copy prioritization
[**create_framework_for_prioritization**](PrioritizationsApi.md#create_framework_for_prioritization) | **POST** /prioritizations/{id}/framework | Create the value framework using the fields provided.
[**create_preview_prioritization**](PrioritizationsApi.md#create_preview_prioritization) | **POST** /prioritizations/{id}/preview | Creates a new preview prioritization.
[**create_prioritization_field**](PrioritizationsApi.md#create_prioritization_field) | **POST** /prioritizations/{id}/fields | Create a prioritization field
[**delete_prioritization_comments**](PrioritizationsApi.md#delete_prioritization_comments) | **DELETE** /prioritizations/{id}/ratingComments | Deletes prioritization comments
[**delete_prioritization_fields**](PrioritizationsApi.md#delete_prioritization_fields) | **DELETE** /prioritizations/{id}/fields | Deletes prioritization fields
[**delete_prioritization_pairwise_vote_comments**](PrioritizationsApi.md#delete_prioritization_pairwise_vote_comments) | **DELETE** /prioritizations/{id}/pairwiseVoteComments | Deletes prioritization pairwise vote comments
[**delete_prioritization_users**](PrioritizationsApi.md#delete_prioritization_users) | **DELETE** /prioritizations/{id}/users | Deletes prioritization users
[**delete_ui_settings_for_prioritization**](PrioritizationsApi.md#delete_ui_settings_for_prioritization) | **DELETE** /prioritizations/{id}/uiSettings | Deletes user prioritization UI settings
[**export_prioritization_data**](PrioritizationsApi.md#export_prioritization_data) | **GET** /prioritizations/{id}/export | Export prioritization data
[**get_pairwise_votes_for_prioritization**](PrioritizationsApi.md#get_pairwise_votes_for_prioritization) | **GET** /prioritizations/{id}/pairwiseVotes | Retrieves pairwise votes for prioritization
[**get_preview_prioritization_for_user**](PrioritizationsApi.md#get_preview_prioritization_for_user) | **GET** /prioritizations/{id}/preview | Retrieves preview prioritization.
[**get_prioritization**](PrioritizationsApi.md#get_prioritization) | **GET** /prioritizations/{id} | Retrieves a prioritization.
[**get_prioritization_comments**](PrioritizationsApi.md#get_prioritization_comments) | **GET** /prioritizations/{id}/ratingComments | Retrieves prioritization comments
[**get_prioritization_fields**](PrioritizationsApi.md#get_prioritization_fields) | **GET** /prioritizations/{id}/fields | Retrieves prioritization fields
[**get_prioritization_inconsistencies**](PrioritizationsApi.md#get_prioritization_inconsistencies) | **GET** /prioritizations/{id}/inconsistencies | Retrieves prioritization inconsistencies
[**get_prioritization_inconsistency_recommendations**](PrioritizationsApi.md#get_prioritization_inconsistency_recommendations) | **GET** /prioritizations/{id}/inconsistencyRecommendations | Retrieves prioritization inconsistency recommendations
[**get_prioritization_insights**](PrioritizationsApi.md#get_prioritization_insights) | **GET** /prioritizations/{id}/pairwiseInsights | Generate AI insights for pairwise comparison results
[**get_prioritization_pairwise_vote_comments**](PrioritizationsApi.md#get_prioritization_pairwise_vote_comments) | **GET** /prioritizations/{id}/pairwiseVoteComments | Retrieves prioritization pairwise vote comments
[**get_prioritization_project**](PrioritizationsApi.md#get_prioritization_project) | **GET** /prioritizations/{id}/projects/{projectId} | Retrieves prioritization project
[**get_prioritization_projects**](PrioritizationsApi.md#get_prioritization_projects) | **GET** /prioritizations/{id}/projects | Retrieves prioritization projects
[**get_prioritization_reference_fields**](PrioritizationsApi.md#get_prioritization_reference_fields) | **GET** /prioritizations/{id}/referenceFields | Retrieves prioritization reference fields
[**get_prioritization_results**](PrioritizationsApi.md#get_prioritization_results) | **GET** /prioritizations/{id}/results | Retrieves prioritization results
[**get_prioritization_users**](PrioritizationsApi.md#get_prioritization_users) | **GET** /prioritizations/{id}/users | Retrieves prioritization users
[**get_prioritizations**](PrioritizationsApi.md#get_prioritizations) | **GET** /prioritizations | Retrieves prioritizations
[**get_score_weights_for_prioritization**](PrioritizationsApi.md#get_score_weights_for_prioritization) | **GET** /prioritizations/{id}/scoreWeights | Retrieves prioritization score weights
[**get_ui_settings_for_prioritization**](PrioritizationsApi.md#get_ui_settings_for_prioritization) | **GET** /prioritizations/{id}/uiSettings | Gets user prioritization UI settings
[**update_portfolio_data_for_prioritization**](PrioritizationsApi.md#update_portfolio_data_for_prioritization) | **POST** /prioritizations/{id}/portfolioData | Update portfolio data
[**update_portfolio_score_for_prioritization**](PrioritizationsApi.md#update_portfolio_score_for_prioritization) | **POST** /prioritizations/{id}/portfolioScore | Update portfolio score
[**update_prioritization**](PrioritizationsApi.md#update_prioritization) | **PATCH** /prioritizations/{id} | Updates a prioritization utilizing JSON Patch Operations.
[**update_prioritization_fields**](PrioritizationsApi.md#update_prioritization_fields) | **PATCH** /prioritizations/{id}/fields | Updates a prioritization field utilizing JSON Patch Operations.
[**update_prioritization_pairwise_vote_for_user**](PrioritizationsApi.md#update_prioritization_pairwise_vote_for_user) | **PATCH** /prioritizations/{id}/pairwiseVote | Updates prioritization pairwise vote for a user utilizing JSON Patch Operations.
[**update_prioritization_projects**](PrioritizationsApi.md#update_prioritization_projects) | **POST** /prioritizations/{id}/projects | Update prioritization projects
[**update_prioritization_survey_field_values_for_user**](PrioritizationsApi.md#update_prioritization_survey_field_values_for_user) | **PATCH** /prioritizations/{id}/fieldValues | Updates prioritization field values for a user utilizing JSON Patch Operations.
[**update_score_weights_for_prioritization**](PrioritizationsApi.md#update_score_weights_for_prioritization) | **PATCH** /prioritizations/{id}/scoreWeights | Updates prioritization score weights
[**update_ui_settings_for_prioritization**](PrioritizationsApi.md#update_ui_settings_for_prioritization) | **PATCH** /prioritizations/{id}/uiSettings | Updates user prioritization UI settings

# **add_prioritization_users**
> list[PrioritizationUser] add_prioritization_users(id, body=body)

Add users to prioritization

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id
body = ['body_example'] # list[str] | An array of user ids. (optional)

try:
    # Add users to prioritization
    api_response = api_instance.add_prioritization_users(id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->add_prioritization_users: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 
 **body** | [**list[str]**](str.md)| An array of user ids. | [optional] 

### Return type

[**list[PrioritizationUser]**](PrioritizationUser.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **copy_prioritization**
> Prioritization copy_prioritization(body, id)

Copy prioritization

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
body = dlxapi.CopyPrioritizationRequest() # CopyPrioritizationRequest | 
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id

try:
    # Copy prioritization
    api_response = api_instance.copy_prioritization(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->copy_prioritization: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CopyPrioritizationRequest**](CopyPrioritizationRequest.md)|  | 
 **id** | [**str**](.md)| Prioritization id | 

### Return type

[**Prioritization**](Prioritization.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_framework_for_prioritization**
> PrioritizationFields create_framework_for_prioritization(body, id)

Create the value framework using the fields provided.

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
body = [dlxapi.PrioritizationField()] # list[PrioritizationField] | Collection of PrioritizationField that represents the framework
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id

try:
    # Create the value framework using the fields provided.
    api_response = api_instance.create_framework_for_prioritization(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->create_framework_for_prioritization: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[PrioritizationField]**](PrioritizationField.md)| Collection of PrioritizationField that represents the framework | 
 **id** | [**str**](.md)| Prioritization id | 

### Return type

[**PrioritizationFields**](PrioritizationFields.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_preview_prioritization**
> Prioritization create_preview_prioritization(id)

Creates a new preview prioritization.

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id

try:
    # Creates a new preview prioritization.
    api_response = api_instance.create_preview_prioritization(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->create_preview_prioritization: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 

### Return type

[**Prioritization**](Prioritization.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_prioritization_field**
> PrioritizationField create_prioritization_field(body, id)

Create a prioritization field

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
body = dlxapi.PrioritizationField() # PrioritizationField | 
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id

try:
    # Create a prioritization field
    api_response = api_instance.create_prioritization_field(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->create_prioritization_field: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrioritizationField**](PrioritizationField.md)|  | 
 **id** | [**str**](.md)| Prioritization id | 

### Return type

[**PrioritizationField**](PrioritizationField.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_prioritization_comments**
> delete_prioritization_comments(id, body=body)

Deletes prioritization comments

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id
body = ['body_example'] # list[str] | An array of comment ids (optional)

try:
    # Deletes prioritization comments
    api_instance.delete_prioritization_comments(id, body=body)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->delete_prioritization_comments: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 
 **body** | [**list[str]**](str.md)| An array of comment ids | [optional] 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_prioritization_fields**
> delete_prioritization_fields(id, body=body)

Deletes prioritization fields

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id
body = ['body_example'] # list[str] | An array of PrioritizationField ids. (optional)

try:
    # Deletes prioritization fields
    api_instance.delete_prioritization_fields(id, body=body)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->delete_prioritization_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 
 **body** | [**list[str]**](str.md)| An array of PrioritizationField ids. | [optional] 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_prioritization_pairwise_vote_comments**
> delete_prioritization_pairwise_vote_comments(id, body=body)

Deletes prioritization pairwise vote comments

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id
body = ['body_example'] # list[str] | An array of pairwise vote comment ids (optional)

try:
    # Deletes prioritization pairwise vote comments
    api_instance.delete_prioritization_pairwise_vote_comments(id, body=body)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->delete_prioritization_pairwise_vote_comments: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 
 **body** | [**list[str]**](str.md)| An array of pairwise vote comment ids | [optional] 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_prioritization_users**
> delete_prioritization_users(id, body=body)

Deletes prioritization users

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id
body = ['body_example'] # list[str] | An array of user ids. (optional)

try:
    # Deletes prioritization users
    api_instance.delete_prioritization_users(id, body=body)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->delete_prioritization_users: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 
 **body** | [**list[str]**](str.md)| An array of user ids. | [optional] 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_ui_settings_for_prioritization**
> delete_ui_settings_for_prioritization(id)

Deletes user prioritization UI settings

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id

try:
    # Deletes user prioritization UI settings
    api_instance.delete_ui_settings_for_prioritization(id)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->delete_ui_settings_for_prioritization: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **export_prioritization_data**
> str export_prioritization_data(id, export_type, export_format=export_format, survey_id=survey_id)

Export prioritization data

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | prioritization id
export_type = 'export_type_example' # str | export type (SCORE_SHEET, INDIVIDUAL_RATINGS, RATING_COMMENTS, PRIORITIES_DATA)
export_format = 'XLSX' # str | export format type (XLSX) (optional) (default to XLSX)
survey_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | survey id to filter results by specific survey's group ratings fields (optional)

try:
    # Export prioritization data
    api_response = api_instance.export_prioritization_data(id, export_type, export_format=export_format, survey_id=survey_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->export_prioritization_data: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| prioritization id | 
 **export_type** | **str**| export type (SCORE_SHEET, INDIVIDUAL_RATINGS, RATING_COMMENTS, PRIORITIES_DATA) | 
 **export_format** | **str**| export format type (XLSX) | [optional] [default to XLSX]
 **survey_id** | [**str**](.md)| survey id to filter results by specific survey&#x27;s group ratings fields | [optional] 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_pairwise_votes_for_prioritization**
> GetPairwiseVotesResponse get_pairwise_votes_for_prioritization(id, dominant_field_id=dominant_field_id, recessive_field_id=recessive_field_id)

Retrieves pairwise votes for prioritization

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id
dominant_field_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Dominant comparison field (optional)
recessive_field_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Recessive comparison field (optional)

try:
    # Retrieves pairwise votes for prioritization
    api_response = api_instance.get_pairwise_votes_for_prioritization(id, dominant_field_id=dominant_field_id, recessive_field_id=recessive_field_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->get_pairwise_votes_for_prioritization: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 
 **dominant_field_id** | [**str**](.md)| Dominant comparison field | [optional] 
 **recessive_field_id** | [**str**](.md)| Recessive comparison field | [optional] 

### Return type

[**GetPairwiseVotesResponse**](GetPairwiseVotesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_preview_prioritization_for_user**
> Prioritization get_preview_prioritization_for_user(id)

Retrieves preview prioritization.

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id

try:
    # Retrieves preview prioritization.
    api_response = api_instance.get_preview_prioritization_for_user(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->get_preview_prioritization_for_user: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 

### Return type

[**Prioritization**](Prioritization.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_prioritization**
> Prioritization get_prioritization(id)

Retrieves a prioritization.

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id

try:
    # Retrieves a prioritization.
    api_response = api_instance.get_prioritization(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->get_prioritization: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 

### Return type

[**Prioritization**](Prioritization.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_prioritization_comments**
> RatingComments get_prioritization_comments(id, project_id=project_id, field_id=field_id, survey_id=survey_id)

Retrieves prioritization comments

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id
project_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Project id (optional)
field_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Field id (optional)
survey_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Optional survey id. When provided, comments are filtered to users and fields of that survey. (optional)

try:
    # Retrieves prioritization comments
    api_response = api_instance.get_prioritization_comments(id, project_id=project_id, field_id=field_id, survey_id=survey_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->get_prioritization_comments: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 
 **project_id** | [**str**](.md)| Project id | [optional] 
 **field_id** | [**str**](.md)| Field id | [optional] 
 **survey_id** | [**str**](.md)| Optional survey id. When provided, comments are filtered to users and fields of that survey. | [optional] 

### Return type

[**RatingComments**](RatingComments.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_prioritization_fields**
> PrioritizationFields get_prioritization_fields(id)

Retrieves prioritization fields

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id

try:
    # Retrieves prioritization fields
    api_response = api_instance.get_prioritization_fields(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->get_prioritization_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 

### Return type

[**PrioritizationFields**](PrioritizationFields.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_prioritization_inconsistencies**
> dict(str, float) get_prioritization_inconsistencies(id)

Retrieves prioritization inconsistencies

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id

try:
    # Retrieves prioritization inconsistencies
    api_response = api_instance.get_prioritization_inconsistencies(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->get_prioritization_inconsistencies: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 

### Return type

**dict(str, float)**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_prioritization_inconsistency_recommendations**
> list[PairwiseInconsistency] get_prioritization_inconsistency_recommendations(id)

Retrieves prioritization inconsistency recommendations

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id

try:
    # Retrieves prioritization inconsistency recommendations
    api_response = api_instance.get_prioritization_inconsistency_recommendations(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->get_prioritization_inconsistency_recommendations: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 

### Return type

[**list[PairwiseInconsistency]**](PairwiseInconsistency.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_prioritization_insights**
> PrioritizationInsights get_prioritization_insights(id, dominant_field_id=dominant_field_id, recessive_field_id=recessive_field_id)

Generate AI insights for pairwise comparison results

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id
dominant_field_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Dominant field id (optional)
recessive_field_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Recessive field id (optional)

try:
    # Generate AI insights for pairwise comparison results
    api_response = api_instance.get_prioritization_insights(id, dominant_field_id=dominant_field_id, recessive_field_id=recessive_field_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->get_prioritization_insights: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 
 **dominant_field_id** | [**str**](.md)| Dominant field id | [optional] 
 **recessive_field_id** | [**str**](.md)| Recessive field id | [optional] 

### Return type

[**PrioritizationInsights**](PrioritizationInsights.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_prioritization_pairwise_vote_comments**
> PairwiseVoteComments get_prioritization_pairwise_vote_comments(id, dominant_field_id, recessive_field_id)

Retrieves prioritization pairwise vote comments

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id
dominant_field_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Dominant field id
recessive_field_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Recessive field id

try:
    # Retrieves prioritization pairwise vote comments
    api_response = api_instance.get_prioritization_pairwise_vote_comments(id, dominant_field_id, recessive_field_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->get_prioritization_pairwise_vote_comments: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 
 **dominant_field_id** | [**str**](.md)| Dominant field id | 
 **recessive_field_id** | [**str**](.md)| Recessive field id | 

### Return type

[**PairwiseVoteComments**](PairwiseVoteComments.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_prioritization_project**
> PrioritizationProject get_prioritization_project(id, project_id)

Retrieves prioritization project

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id
project_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Project id

try:
    # Retrieves prioritization project
    api_response = api_instance.get_prioritization_project(id, project_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->get_prioritization_project: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 
 **project_id** | [**str**](.md)| Project id | 

### Return type

[**PrioritizationProject**](PrioritizationProject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_prioritization_projects**
> PrioritizationProjects get_prioritization_projects(id, expand=expand)

Retrieves prioritization projects

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id
expand = 'expand_example' # str | JSON string containing an array expand specifications for projects. (optional)

try:
    # Retrieves prioritization projects
    api_response = api_instance.get_prioritization_projects(id, expand=expand)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->get_prioritization_projects: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 
 **expand** | **str**| JSON string containing an array expand specifications for projects. | [optional] 

### Return type

[**PrioritizationProjects**](PrioritizationProjects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_prioritization_reference_fields**
> ReferenceFields get_prioritization_reference_fields(id)

Retrieves prioritization reference fields

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id

try:
    # Retrieves prioritization reference fields
    api_response = api_instance.get_prioritization_reference_fields(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->get_prioritization_reference_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 

### Return type

[**ReferenceFields**](ReferenceFields.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_prioritization_results**
> PrioritizationResults get_prioritization_results(id, project_id=project_id, field_id=field_id, survey_id=survey_id)

Retrieves prioritization results

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id
project_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | project id (optional)
field_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | field id (optional)
survey_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | survey id to filter results by specific survey's group ratings fields (optional)

try:
    # Retrieves prioritization results
    api_response = api_instance.get_prioritization_results(id, project_id=project_id, field_id=field_id, survey_id=survey_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->get_prioritization_results: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 
 **project_id** | [**str**](.md)| project id | [optional] 
 **field_id** | [**str**](.md)| field id | [optional] 
 **survey_id** | [**str**](.md)| survey id to filter results by specific survey&#x27;s group ratings fields | [optional] 

### Return type

[**PrioritizationResults**](PrioritizationResults.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_prioritization_users**
> PrioritizationUsers get_prioritization_users(id)

Retrieves prioritization users

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id

try:
    # Retrieves prioritization users
    api_response = api_instance.get_prioritization_users(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->get_prioritization_users: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 

### Return type

[**PrioritizationUsers**](PrioritizationUsers.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_prioritizations**
> Prioritizations get_prioritizations(expand=expand, portfolio_id=portfolio_id)

Retrieves prioritizations

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
expand = 'expand_example' # str | JSON string containing an array expand specifications. (optional)
portfolio_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Optional portfolio id to filter prioritizations. (optional)

try:
    # Retrieves prioritizations
    api_response = api_instance.get_prioritizations(expand=expand, portfolio_id=portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->get_prioritizations: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expand** | **str**| JSON string containing an array expand specifications. | [optional] 
 **portfolio_id** | [**str**](.md)| Optional portfolio id to filter prioritizations. | [optional] 

### Return type

[**Prioritizations**](Prioritizations.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_score_weights_for_prioritization**
> ScoreWeights get_score_weights_for_prioritization(id)

Retrieves prioritization score weights

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id

try:
    # Retrieves prioritization score weights
    api_response = api_instance.get_score_weights_for_prioritization(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->get_score_weights_for_prioritization: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 

### Return type

[**ScoreWeights**](ScoreWeights.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ui_settings_for_prioritization**
> dict(str, object) get_ui_settings_for_prioritization(id)

Gets user prioritization UI settings

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id

try:
    # Gets user prioritization UI settings
    api_response = api_instance.get_ui_settings_for_prioritization(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->get_ui_settings_for_prioritization: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 

### Return type

**dict(str, object)**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_data_for_prioritization**
> Prioritization update_portfolio_data_for_prioritization(id)

Update portfolio data

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id

try:
    # Update portfolio data
    api_response = api_instance.update_portfolio_data_for_prioritization(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->update_portfolio_data_for_prioritization: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 

### Return type

[**Prioritization**](Prioritization.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_score_for_prioritization**
> list[Field] update_portfolio_score_for_prioritization(id, survey_id=survey_id)

Update portfolio score

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id
survey_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Optional ratings survey id used to filter scores sent to the portfolio. When provided, only data tied to this survey is included; when omitted, no survey filter is applied. (optional)

try:
    # Update portfolio score
    api_response = api_instance.update_portfolio_score_for_prioritization(id, survey_id=survey_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->update_portfolio_score_for_prioritization: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Prioritization id | 
 **survey_id** | [**str**](.md)| Optional ratings survey id used to filter scores sent to the portfolio. When provided, only data tied to this survey is included; when omitted, no survey filter is applied. | [optional] 

### Return type

[**list[Field]**](Field.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_prioritization**
> Prioritization update_prioritization(body, id)

Updates a prioritization utilizing JSON Patch Operations.

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | JSON Patch Operations to update prioritization.
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | prioritization id

try:
    # Updates a prioritization utilizing JSON Patch Operations.
    api_response = api_instance.update_prioritization(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->update_prioritization: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update prioritization. | 
 **id** | [**str**](.md)| prioritization id | 

### Return type

[**Prioritization**](Prioritization.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_prioritization_fields**
> list[PrioritizationField] update_prioritization_fields(body, id)

Updates a prioritization field utilizing JSON Patch Operations.

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
body = [dlxapi.PatchItem()] # list[PatchItem] | JSON Patch Operations to update prioritization field.
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | prioritization id

try:
    # Updates a prioritization field utilizing JSON Patch Operations.
    api_response = api_instance.update_prioritization_fields(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->update_prioritization_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[PatchItem]**](PatchItem.md)| JSON Patch Operations to update prioritization field. | 
 **id** | [**str**](.md)| prioritization id | 

### Return type

[**list[PrioritizationField]**](PrioritizationField.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_prioritization_pairwise_vote_for_user**
> PairwiseProgress update_prioritization_pairwise_vote_for_user(body, user_id, id)

Updates prioritization pairwise vote for a user utilizing JSON Patch Operations.

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
body = [dlxapi.PairwiseVotePatchItem()] # list[PairwiseVotePatchItem] | JSON Patch Operations to update prioritization pairwise vote.
user_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | userId to update pairwise vote for
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | prioritization id

try:
    # Updates prioritization pairwise vote for a user utilizing JSON Patch Operations.
    api_response = api_instance.update_prioritization_pairwise_vote_for_user(body, user_id, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->update_prioritization_pairwise_vote_for_user: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[PairwiseVotePatchItem]**](PairwiseVotePatchItem.md)| JSON Patch Operations to update prioritization pairwise vote. | 
 **user_id** | [**str**](.md)| userId to update pairwise vote for | 
 **id** | [**str**](.md)| prioritization id | 

### Return type

[**PairwiseProgress**](PairwiseProgress.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_prioritization_projects**
> list[PrioritizationProject] update_prioritization_projects(body, id, preview=preview)

Update prioritization projects

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
body = dlxapi.UpdatePrioritizationProjectsRequest() # UpdatePrioritizationProjectsRequest | 
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id
preview = false # bool |  (optional) (default to false)

try:
    # Update prioritization projects
    api_response = api_instance.update_prioritization_projects(body, id, preview=preview)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->update_prioritization_projects: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdatePrioritizationProjectsRequest**](UpdatePrioritizationProjectsRequest.md)|  | 
 **id** | [**str**](.md)| Prioritization id | 
 **preview** | **bool**|  | [optional] [default to false]

### Return type

[**list[PrioritizationProject]**](PrioritizationProject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_prioritization_survey_field_values_for_user**
> PrioritizationResults update_prioritization_survey_field_values_for_user(body, user_id, id)

Updates prioritization field values for a user utilizing JSON Patch Operations.

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
body = [dlxapi.FieldValuePatchItem()] # list[FieldValuePatchItem] | JSON Patch Operations to update field values.
user_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | userId to update field values for
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | prioritization id

try:
    # Updates prioritization field values for a user utilizing JSON Patch Operations.
    api_response = api_instance.update_prioritization_survey_field_values_for_user(body, user_id, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->update_prioritization_survey_field_values_for_user: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[FieldValuePatchItem]**](FieldValuePatchItem.md)| JSON Patch Operations to update field values. | 
 **user_id** | [**str**](.md)| userId to update field values for | 
 **id** | [**str**](.md)| prioritization id | 

### Return type

[**PrioritizationResults**](PrioritizationResults.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_score_weights_for_prioritization**
> list[ScoreWeight] update_score_weights_for_prioritization(body, id)

Updates prioritization score weights

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
body = [dlxapi.ScoreWeight()] # list[ScoreWeight] | Score Weights
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id

try:
    # Updates prioritization score weights
    api_response = api_instance.update_score_weights_for_prioritization(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->update_score_weights_for_prioritization: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[ScoreWeight]**](ScoreWeight.md)| Score Weights | 
 **id** | [**str**](.md)| Prioritization id | 

### Return type

[**list[ScoreWeight]**](ScoreWeight.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_ui_settings_for_prioritization**
> dict(str, object) update_ui_settings_for_prioritization(body, id)

Updates user prioritization UI settings

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
api_instance = dlxapi.PrioritizationsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | JSON Patch Operations to update multiple UI settings
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id

try:
    # Updates user prioritization UI settings
    api_response = api_instance.update_ui_settings_for_prioritization(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PrioritizationsApi->update_ui_settings_for_prioritization: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update multiple UI settings | 
 **id** | [**str**](.md)| Prioritization id | 

### Return type

**dict(str, object)**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

