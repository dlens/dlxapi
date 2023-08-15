# swagger_client.JiraApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_comment_from_jira**](JiraApi.md#create_comment_from_jira) | **POST** /jira/instance/{id}/comment | 
[**create_jira_field_mapping**](JiraApi.md#create_jira_field_mapping) | **POST** /jira/instance/{id}/mapping | 
[**create_jira_instance**](JiraApi.md#create_jira_instance) | **POST** /jira/instance | 
[**delete_field_mapping**](JiraApi.md#delete_field_mapping) | **DELETE** /jira/instance/{id}/mapping/{mappingId} | Delete jira field mapping
[**delete_jira_instance**](JiraApi.md#delete_jira_instance) | **DELETE** /jira/instance/{id} | Delete jira instance
[**disable_jira_instance**](JiraApi.md#disable_jira_instance) | **POST** /jira/instance/{id}/disable | 
[**enable_jira_instance**](JiraApi.md#enable_jira_instance) | **POST** /jira/instance/{id}/enable | 
[**get_field_mapping**](JiraApi.md#get_field_mapping) | **GET** /jira/instance/{id}/mapping/{mappingId} | 
[**get_field_mappings**](JiraApi.md#get_field_mappings) | **GET** /jira/instance/{id}/mappings | 
[**get_jira_instance**](JiraApi.md#get_jira_instance) | **GET** /jira/instance/{id} | 
[**get_mapped_project_for_epic**](JiraApi.md#get_mapped_project_for_epic) | **GET** /jira/instance/{id}/mappedProject/{epicId} | 
[**start_sync_for_jira_instance**](JiraApi.md#start_sync_for_jira_instance) | **POST** /jira/instance/{id}/sync | 


# **create_comment_from_jira**
> create_comment_from_jira(id, body)



Creates a comment in Decision Lens based on a Jira comment.

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
api_instance = swagger_client.JiraApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | jira instance id
body = swagger_client.JiraComment() # JiraComment | Comment to create

try:
    api_instance.create_comment_from_jira(id, body)
except ApiException as e:
    print("Exception when calling JiraApi->create_comment_from_jira: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| jira instance id | 
 **body** | [**JiraComment**](JiraComment.md)| Comment to create | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_jira_field_mapping**
> JiraFieldMapping create_jira_field_mapping(id, body)



Creates jira field mapping.

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
api_instance = swagger_client.JiraApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | jira instance id
body = swagger_client.JiraFieldMapping() # JiraFieldMapping | Field mapping to create

try:
    api_response = api_instance.create_jira_field_mapping(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling JiraApi->create_jira_field_mapping: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| jira instance id | 
 **body** | [**JiraFieldMapping**](JiraFieldMapping.md)| Field mapping to create | 

### Return type

[**JiraFieldMapping**](JiraFieldMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_jira_instance**
> JiraInstance create_jira_instance(body)



Creates jira instance.

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
api_instance = swagger_client.JiraApi(swagger_client.ApiClient(configuration))
body = swagger_client.JiraInstance() # JiraInstance | Jira instance to create

try:
    api_response = api_instance.create_jira_instance(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling JiraApi->create_jira_instance: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JiraInstance**](JiraInstance.md)| Jira instance to create | 

### Return type

[**JiraInstance**](JiraInstance.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_field_mapping**
> delete_field_mapping(id)

Delete jira field mapping

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
api_instance = swagger_client.JiraApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | jira field mapping id

try:
    # Delete jira field mapping
    api_instance.delete_field_mapping(id)
except ApiException as e:
    print("Exception when calling JiraApi->delete_field_mapping: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| jira field mapping id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_jira_instance**
> delete_jira_instance(id)

Delete jira instance

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
api_instance = swagger_client.JiraApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | jira instance id

try:
    # Delete jira instance
    api_instance.delete_jira_instance(id)
except ApiException as e:
    print("Exception when calling JiraApi->delete_jira_instance: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| jira instance id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **disable_jira_instance**
> disable_jira_instance(id)



Disable Jira Instance

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
api_instance = swagger_client.JiraApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | jira instance id

try:
    api_instance.disable_jira_instance(id)
except ApiException as e:
    print("Exception when calling JiraApi->disable_jira_instance: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| jira instance id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enable_jira_instance**
> enable_jira_instance(id)



Enable Jira Instance

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
api_instance = swagger_client.JiraApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | jira instance id

try:
    api_instance.enable_jira_instance(id)
except ApiException as e:
    print("Exception when calling JiraApi->enable_jira_instance: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| jira instance id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_field_mapping**
> JiraFieldMapping get_field_mapping(id, mapping_id)



Get Jira field mapping

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
api_instance = swagger_client.JiraApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | jira integration instance id
mapping_id = 'mapping_id_example' # str | jira field mapping id

try:
    api_response = api_instance.get_field_mapping(id, mapping_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling JiraApi->get_field_mapping: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| jira integration instance id | 
 **mapping_id** | **str**| jira field mapping id | 

### Return type

[**JiraFieldMapping**](JiraFieldMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_field_mappings**
> JiraFieldMappings get_field_mappings(id)



Get Jira field mappings for an instance

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
api_instance = swagger_client.JiraApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | jira instance id

try:
    api_response = api_instance.get_field_mappings(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling JiraApi->get_field_mappings: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| jira instance id | 

### Return type

[**JiraFieldMappings**](JiraFieldMappings.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_jira_instance**
> JiraInstance get_jira_instance(id)



Get Jira Instance

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
api_instance = swagger_client.JiraApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | jira instance id

try:
    api_response = api_instance.get_jira_instance(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling JiraApi->get_jira_instance: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| jira instance id | 

### Return type

[**JiraInstance**](JiraInstance.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_mapped_project_for_epic**
> MappedProject get_mapped_project_for_epic(id, epic_id)



Return mapped Decision Lens project for a Jira epic

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
api_instance = swagger_client.JiraApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | Jira integration instance id
epic_id = 'epic_id_example' # str | Epic key from Jira

try:
    api_response = api_instance.get_mapped_project_for_epic(id, epic_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling JiraApi->get_mapped_project_for_epic: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Jira integration instance id | 
 **epic_id** | **str**| Epic key from Jira | 

### Return type

[**MappedProject**](MappedProject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_sync_for_jira_instance**
> start_sync_for_jira_instance(id)



Run synchronization process for Jira Instance

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
api_instance = swagger_client.JiraApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | jira instance id

try:
    api_instance.start_sync_for_jira_instance(id)
except ApiException as e:
    print("Exception when calling JiraApi->start_sync_for_jira_instance: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| jira instance id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

