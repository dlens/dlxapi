# dlxapi.ExerciseStepExecutionsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_exercise_step_execution**](ExerciseStepExecutionsApi.md#create_exercise_step_execution) | **POST** /exercise-step-executions | Creates new workflow step executions
[**get_exercise_execution_history**](ExerciseStepExecutionsApi.md#get_exercise_execution_history) | **GET** /exercise-step-executions/{exerciseId}/history | Retrieves exercise execution history summary for a specific exercise
[**get_exercise_step_execution_by_combo**](ExerciseStepExecutionsApi.md#get_exercise_step_execution_by_combo) | **GET** /exercise-step-executions/exercise/{exerciseId}/workflow-step/{workflowStepId} | Retrieves workflow step execution by exercise ID and workflow step ID combination
[**get_exercise_step_execution_by_id**](ExerciseStepExecutionsApi.md#get_exercise_step_execution_by_id) | **GET** /exercise-step-executions/{id} | Retrieves a specific workflow step execution by ID
[**get_exercise_step_executions_by_exercise_id**](ExerciseStepExecutionsApi.md#get_exercise_step_executions_by_exercise_id) | **GET** /exercise-step-executions/exercise/{exerciseId} | Retrieves all exercise step executions for a specific exercise
[**update_exercise_step_execution_by_combo**](ExerciseStepExecutionsApi.md#update_exercise_step_execution_by_combo) | **PUT** /exercise-step-executions/exercise/{exerciseId}/workflow-step/{workflowStepId} | Updates workflow step execution by exercise workflow ID and workflow step ID combination

# **create_exercise_step_execution**
> list[ExerciseStepExecution] create_exercise_step_execution(body)

Creates new workflow step executions

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
api_instance = dlxapi.ExerciseStepExecutionsApi(dlxapi.ApiClient(configuration))
body = dlxapi.ExerciseStepExecutions() # ExerciseStepExecutions | Workflow step executions to create

try:
    # Creates new workflow step executions
    api_response = api_instance.create_exercise_step_execution(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExerciseStepExecutionsApi->create_exercise_step_execution: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExerciseStepExecutions**](ExerciseStepExecutions.md)| Workflow step executions to create | 

### Return type

[**list[ExerciseStepExecution]**](ExerciseStepExecution.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_exercise_execution_history**
> list[ExerciseExecutionSummary] get_exercise_execution_history(exercise_id)

Retrieves exercise execution history summary for a specific exercise

Returns a summary of all sync executions for an exercise, including who ran it, when it was run, portfolios included, and sync direction. Results are sorted by most recent syncs at the top.

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
api_instance = dlxapi.ExerciseStepExecutionsApi(dlxapi.ApiClient(configuration))
exercise_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the exercise to get execution history for

try:
    # Retrieves exercise execution history summary for a specific exercise
    api_response = api_instance.get_exercise_execution_history(exercise_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExerciseStepExecutionsApi->get_exercise_execution_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exercise_id** | [**str**](.md)| ID of the exercise to get execution history for | 

### Return type

[**list[ExerciseExecutionSummary]**](ExerciseExecutionSummary.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_exercise_step_execution_by_combo**
> ExerciseStepExecution get_exercise_step_execution_by_combo(exercise_id, workflow_step_id)

Retrieves workflow step execution by exercise ID and workflow step ID combination

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
api_instance = dlxapi.ExerciseStepExecutionsApi(dlxapi.ApiClient(configuration))
exercise_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the exercise workflow
workflow_step_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the workflow step

try:
    # Retrieves workflow step execution by exercise ID and workflow step ID combination
    api_response = api_instance.get_exercise_step_execution_by_combo(exercise_id, workflow_step_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExerciseStepExecutionsApi->get_exercise_step_execution_by_combo: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exercise_id** | [**str**](.md)| ID of the exercise workflow | 
 **workflow_step_id** | [**str**](.md)| ID of the workflow step | 

### Return type

[**ExerciseStepExecution**](ExerciseStepExecution.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_exercise_step_execution_by_id**
> ExerciseStepExecution get_exercise_step_execution_by_id(id)

Retrieves a specific workflow step execution by ID

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
api_instance = dlxapi.ExerciseStepExecutionsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the workflow step execution

try:
    # Retrieves a specific workflow step execution by ID
    api_response = api_instance.get_exercise_step_execution_by_id(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExerciseStepExecutionsApi->get_exercise_step_execution_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| ID of the workflow step execution | 

### Return type

[**ExerciseStepExecution**](ExerciseStepExecution.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_exercise_step_executions_by_exercise_id**
> ExerciseStepExecutions get_exercise_step_executions_by_exercise_id(exercise_id)

Retrieves all exercise step executions for a specific exercise

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
api_instance = dlxapi.ExerciseStepExecutionsApi(dlxapi.ApiClient(configuration))
exercise_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the exercise to get step executions for

try:
    # Retrieves all exercise step executions for a specific exercise
    api_response = api_instance.get_exercise_step_executions_by_exercise_id(exercise_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExerciseStepExecutionsApi->get_exercise_step_executions_by_exercise_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exercise_id** | [**str**](.md)| ID of the exercise to get step executions for | 

### Return type

[**ExerciseStepExecutions**](ExerciseStepExecutions.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_exercise_step_execution_by_combo**
> ExerciseStepExecution update_exercise_step_execution_by_combo(body, exercise_id, workflow_step_id)

Updates workflow step execution by exercise workflow ID and workflow step ID combination

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
api_instance = dlxapi.ExerciseStepExecutionsApi(dlxapi.ApiClient(configuration))
body = dlxapi.ExerciseStepExecution() # ExerciseStepExecution | Workflow step execution data to update
exercise_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the exercise workflow
workflow_step_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the workflow step

try:
    # Updates workflow step execution by exercise workflow ID and workflow step ID combination
    api_response = api_instance.update_exercise_step_execution_by_combo(body, exercise_id, workflow_step_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExerciseStepExecutionsApi->update_exercise_step_execution_by_combo: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExerciseStepExecution**](ExerciseStepExecution.md)| Workflow step execution data to update | 
 **exercise_id** | [**str**](.md)| ID of the exercise workflow | 
 **workflow_step_id** | [**str**](.md)| ID of the workflow step | 

### Return type

[**ExerciseStepExecution**](ExerciseStepExecution.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

