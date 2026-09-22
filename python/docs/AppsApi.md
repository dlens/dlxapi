# dlxapi.AppsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_app_users**](AppsApi.md#add_app_users) | **POST** /apps/{id}/users | Add users to an application for the current group.
[**app_registration**](AppsApi.md#app_registration) | **POST** /apps | Register an application in the auth database.
[**archive_apps_in_tenants**](AppsApi.md#archive_apps_in_tenants) | **POST** /apps/archive/tenants | Archive applications across multiple tenants.
[**create_app_property**](AppsApi.md#create_app_property) | **POST** /apps/{id}/properties | Create an application property
[**create_apps**](AppsApi.md#create_apps) | **POST** /apps/bulk | Register multiple applications in the auth database.
[**delete_app_property**](AppsApi.md#delete_app_property) | **DELETE** /apps/{id}/properties/{propertyId} | Delete an application property
[**delete_app_user**](AppsApi.md#delete_app_user) | **DELETE** /apps/{id}/users/{userId} | Remove a user from an application.
[**get_app_management_access**](AppsApi.md#get_app_management_access) | **GET** /apps/management-access | Check if the current user can access the App Management page.
[**get_app_runtime_property**](AppsApi.md#get_app_runtime_property) | **GET** /apps/{id}/runtime-properties/{name} | Get one runtime property for an application
[**get_app_users**](AppsApi.md#get_app_users) | **GET** /apps/{id}/users | List users with access to an application.
[**get_apps**](AppsApi.md#get_apps) | **GET** /apps | List applications the current user may access in the authenticated group context.
[**list_app_properties**](AppsApi.md#list_app_properties) | **GET** /apps/{id}/properties | List the properties defined for an application
[**update_app**](AppsApi.md#update_app) | **PUT** /apps/{id} | Update an application name and description.
[**update_app_property**](AppsApi.md#update_app_property) | **PATCH** /apps/{id}/properties/{propertyId} | Update an application property
[**update_app_user_roles**](AppsApi.md#update_app_user_roles) | **PUT** /apps/{id}/users/{userId} | Update roles for a user in an application.

# **add_app_users**
> AppUsers add_app_users(body, id)

Add users to an application for the current group.

Ensures each user exists in the authenticated group (creating or updating them like tenant user creation), then grants application access for this app. Requires group administrator, system administrator, or application administrator privileges. 

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
api_instance = dlxapi.AppsApi(dlxapi.ApiClient(configuration))
body = dlxapi.AddAppUsersRequest() # AddAppUsersRequest | Users to add, identified by email (username).
id = 'id_example' # str | Application id

try:
    # Add users to an application for the current group.
    api_response = api_instance.add_app_users(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppsApi->add_app_users: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddAppUsersRequest**](AddAppUsersRequest.md)| Users to add, identified by email (username). | 
 **id** | **str**| Application id | 

### Return type

[**AppUsers**](AppUsers.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **app_registration**
> App app_registration(body)

Register an application in the auth database.

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
api_instance = dlxapi.AppsApi(dlxapi.ApiClient(configuration))
body = dlxapi.App() # App | App to register

try:
    # Register an application in the auth database.
    api_response = api_instance.app_registration(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppsApi->app_registration: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**App**](App.md)| App to register | 

### Return type

[**App**](App.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **archive_apps_in_tenants**
> archive_apps_in_tenants(body)

Archive applications across multiple tenants.

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
api_instance = dlxapi.AppsApi(dlxapi.ApiClient(configuration))
body = dlxapi.AppsTenantArchive() # AppsTenantArchive | Application and group ids to archive

try:
    # Archive applications across multiple tenants.
    api_instance.archive_apps_in_tenants(body)
except ApiException as e:
    print("Exception when calling AppsApi->archive_apps_in_tenants: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppsTenantArchive**](AppsTenantArchive.md)| Application and group ids to archive | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_app_property**
> AppProperty create_app_property(body, id)

Create an application property

The name is canonicalized to ASCII uppercase. Sensitivity is fixed here and no later update can change it. Requires App Admin access to the application. 

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
api_instance = dlxapi.AppsApi(dlxapi.ApiClient(configuration))
body = dlxapi.AppProperty() # AppProperty | Property to create; name and value are required
id = 'id_example' # str | Application id

try:
    # Create an application property
    api_response = api_instance.create_app_property(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppsApi->create_app_property: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppProperty**](AppProperty.md)| Property to create; name and value are required | 
 **id** | **str**| Application id | 

### Return type

[**AppProperty**](AppProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_apps**
> list[App] create_apps(body)

Register multiple applications in the auth database.

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
api_instance = dlxapi.AppsApi(dlxapi.ApiClient(configuration))
body = [dlxapi.App()] # list[App] | Applications to create

try:
    # Register multiple applications in the auth database.
    api_response = api_instance.create_apps(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppsApi->create_apps: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[App]**](App.md)| Applications to create | 

### Return type

[**list[App]**](App.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_app_property**
> delete_app_property(id, property_id)

Delete an application property

Requires App Admin access to the application.

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
api_instance = dlxapi.AppsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Application id
property_id = 'property_id_example' # str | Property id

try:
    # Delete an application property
    api_instance.delete_app_property(id, property_id)
except ApiException as e:
    print("Exception when calling AppsApi->delete_app_property: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Application id | 
 **property_id** | **str**| Property id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_app_user**
> delete_app_user(id, user_id)

Remove a user from an application.

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
api_instance = dlxapi.AppsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Application id
user_id = 'user_id_example' # str | User id

try:
    # Remove a user from an application.
    api_instance.delete_app_user(id, user_id)
except ApiException as e:
    print("Exception when calling AppsApi->delete_app_user: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Application id | 
 **user_id** | **str**| User id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_app_management_access**
> AppManagementAccess get_app_management_access()

Check if the current user can access the App Management page.

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
api_instance = dlxapi.AppsApi(dlxapi.ApiClient(configuration))

try:
    # Check if the current user can access the App Management page.
    api_response = api_instance.get_app_management_access()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppsApi->get_app_management_access: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AppManagementAccess**](AppManagementAccess.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_app_runtime_property**
> AppRuntimeProperty get_app_runtime_property(id, name)

Get one runtime property for an application

The value of a single property, read by AppHost on behalf of a running application. This is the sole read path for a sensitive value. 

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
api_instance = dlxapi.AppsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Application id
name = 'name_example' # str | Property name, canonicalized to ASCII uppercase before lookup

try:
    # Get one runtime property for an application
    api_response = api_instance.get_app_runtime_property(id, name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppsApi->get_app_runtime_property: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Application id | 
 **name** | **str**| Property name, canonicalized to ASCII uppercase before lookup | 

### Return type

[**AppRuntimeProperty**](AppRuntimeProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_app_users**
> AppUsers get_app_users(id)

List users with access to an application.

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
api_instance = dlxapi.AppsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Application id

try:
    # List users with access to an application.
    api_response = api_instance.get_app_users(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppsApi->get_app_users: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Application id | 

### Return type

[**AppUsers**](AppUsers.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_apps**
> Apps get_apps()

List applications the current user may access in the authenticated group context.

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
api_instance = dlxapi.AppsApi(dlxapi.ApiClient(configuration))

try:
    # List applications the current user may access in the authenticated group context.
    api_response = api_instance.get_apps()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppsApi->get_apps: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Apps**](Apps.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_app_properties**
> AppProperties list_app_properties(id)

List the properties defined for an application

Sensitive values are omitted from the response; non-sensitive values are returned. Requires App Admin access to the application. 

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
api_instance = dlxapi.AppsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Application id

try:
    # List the properties defined for an application
    api_response = api_instance.list_app_properties(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppsApi->list_app_properties: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Application id | 

### Return type

[**AppProperties**](AppProperties.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_app**
> App update_app(body, id)

Update an application name and description.

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
api_instance = dlxapi.AppsApi(dlxapi.ApiClient(configuration))
body = dlxapi.App() # App | App fields to update
id = 'id_example' # str | Application id

try:
    # Update an application name and description.
    api_response = api_instance.update_app(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppsApi->update_app: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**App**](App.md)| App fields to update | 
 **id** | **str**| Application id | 

### Return type

[**App**](App.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_app_property**
> AppProperty update_app_property(body, id, property_id)

Update an application property

Replaces the name, the value, or both. Only /name and /value are patchable, since sensitivity is fixed at create. Patching the name alone is the only way to rename a sensitive property, whose value cannot be read back to be resubmitted. Requires App Admin access to the application. 

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
api_instance = dlxapi.AppsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | JSON Patch replace operations on /name and/or /value
id = 'id_example' # str | Application id
property_id = 'property_id_example' # str | Property id

try:
    # Update an application property
    api_response = api_instance.update_app_property(body, id, property_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppsApi->update_app_property: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch replace operations on /name and/or /value | 
 **id** | **str**| Application id | 
 **property_id** | **str**| Property id | 

### Return type

[**AppProperty**](AppProperty.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_app_user_roles**
> AppUser update_app_user_roles(body, id, user_id)

Update roles for a user in an application.

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
api_instance = dlxapi.AppsApi(dlxapi.ApiClient(configuration))
body = dlxapi.UpdateAppUserRoleRequest() # UpdateAppUserRoleRequest | Role to set for the user in the application.
id = 'id_example' # str | Application id
user_id = 'user_id_example' # str | User id

try:
    # Update roles for a user in an application.
    api_response = api_instance.update_app_user_roles(body, id, user_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AppsApi->update_app_user_roles: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateAppUserRoleRequest**](UpdateAppUserRoleRequest.md)| Role to set for the user in the application. | 
 **id** | **str**| Application id | 
 **user_id** | **str**| User id | 

### Return type

[**AppUser**](AppUser.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

