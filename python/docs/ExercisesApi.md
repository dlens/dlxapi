# dlxapi.ExercisesApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_exercise**](ExercisesApi.md#create_exercise) | **POST** /exercises | Creates a new exercise
[**delete_exercise**](ExercisesApi.md#delete_exercise) | **DELETE** /exercises/{id} | Deletes an exercise by ID
[**get_all_exercises**](ExercisesApi.md#get_all_exercises) | **GET** /exercises | Retrieves all exercises
[**update_dlx_portfolio**](ExercisesApi.md#update_dlx_portfolio) | **PATCH** /exercise/{id}/update-dlx-portfolio | Update DLX Portfolio for an exercise
[**update_exercise**](ExercisesApi.md#update_exercise) | **PATCH** /exercises/{id} | Updates an exercise&#x27;s name and/or description

# **create_exercise**
> Exercise create_exercise(body)

Creates a new exercise

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
api_instance = dlxapi.ExercisesApi(dlxapi.ApiClient(configuration))
body = dlxapi.Exercise() # Exercise | Exercise to create

try:
    # Creates a new exercise
    api_response = api_instance.create_exercise(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExercisesApi->create_exercise: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Exercise**](Exercise.md)| Exercise to create | 

### Return type

[**Exercise**](Exercise.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_exercise**
> delete_exercise(id)

Deletes an exercise by ID

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
api_instance = dlxapi.ExercisesApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the exercise to delete

try:
    # Deletes an exercise by ID
    api_instance.delete_exercise(id)
except ApiException as e:
    print("Exception when calling ExercisesApi->delete_exercise: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| ID of the exercise to delete | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_exercises**
> list[Exercise] get_all_exercises()

Retrieves all exercises

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
api_instance = dlxapi.ExercisesApi(dlxapi.ApiClient(configuration))

try:
    # Retrieves all exercises
    api_response = api_instance.get_all_exercises()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExercisesApi->get_all_exercises: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Exercise]**](Exercise.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_dlx_portfolio**
> UpdateDlxPortfolioResponse update_dlx_portfolio(id)

Update DLX Portfolio for an exercise

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
api_instance = dlxapi.ExercisesApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | ID of the exercise

try:
    # Update DLX Portfolio for an exercise
    api_response = api_instance.update_dlx_portfolio(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExercisesApi->update_dlx_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the exercise | 

### Return type

[**UpdateDlxPortfolioResponse**](UpdateDlxPortfolioResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_exercise**
> Exercise update_exercise(body, id)

Updates an exercise's name and/or description

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
api_instance = dlxapi.ExercisesApi(dlxapi.ApiClient(configuration))
body = dlxapi.UpdateExerciseRequest() # UpdateExerciseRequest | Exercise fields to update (name and/or description)
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | ID of the exercise to update

try:
    # Updates an exercise's name and/or description
    api_response = api_instance.update_exercise(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExercisesApi->update_exercise: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateExerciseRequest**](UpdateExerciseRequest.md)| Exercise fields to update (name and/or description) | 
 **id** | [**str**](.md)| ID of the exercise to update | 

### Return type

[**Exercise**](Exercise.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

