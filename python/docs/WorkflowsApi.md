# dlxapi.WorkflowsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_workflow**](WorkflowsApi.md#create_workflow) | **POST** /workflows | Creates a new workflow
[**delete_workflow**](WorkflowsApi.md#delete_workflow) | **DELETE** /workflows/{id} | Deletes a workflow by ID
[**get_all_workflows**](WorkflowsApi.md#get_all_workflows) | **GET** /workflows | Retrieves workflows filtered by state

# **create_workflow**
> Workflow create_workflow(body)

Creates a new workflow

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
api_instance = dlxapi.WorkflowsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Workflow() # Workflow | Workflow to create

try:
    # Creates a new workflow
    api_response = api_instance.create_workflow(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WorkflowsApi->create_workflow: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Workflow**](Workflow.md)| Workflow to create | 

### Return type

[**Workflow**](Workflow.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_workflow**
> delete_workflow(id)

Deletes a workflow by ID

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
api_instance = dlxapi.WorkflowsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the workflow to delete

try:
    # Deletes a workflow by ID
    api_instance.delete_workflow(id)
except ApiException as e:
    print("Exception when calling WorkflowsApi->delete_workflow: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| ID of the workflow to delete | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_workflows**
> list[Workflow] get_all_workflows(state=state)

Retrieves workflows filtered by state

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
api_instance = dlxapi.WorkflowsApi(dlxapi.ApiClient(configuration))
state = [dlxapi.WorkflowState()] # list[WorkflowState] | Filter workflows by state(s) (optional)

try:
    # Retrieves workflows filtered by state
    api_response = api_instance.get_all_workflows(state=state)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WorkflowsApi->get_all_workflows: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | [**list[WorkflowState]**](WorkflowState.md)| Filter workflows by state(s) | [optional] 

### Return type

[**list[Workflow]**](Workflow.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

