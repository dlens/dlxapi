# dlxapi.DashboardsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copy_dashboard**](DashboardsApi.md#copy_dashboard) | **POST** /dashboards/{id}/copy | Copy a dashboard (\&quot;Save As\&quot;)
[**create_dashboard**](DashboardsApi.md#create_dashboard) | **POST** /dashboards | Create dashboard
[**delete_dashboard**](DashboardsApi.md#delete_dashboard) | **DELETE** /dashboards/{id} | Delete dashboard
[**delete_dashboard_image**](DashboardsApi.md#delete_dashboard_image) | **DELETE** /dashboards/{id}/images/{imageId} | Delete a dashboard image
[**download_dashboard_image**](DashboardsApi.md#download_dashboard_image) | **GET** /dashboards/{id}/images/{imageId}/content | Download dashboard image content
[**get_dashboard**](DashboardsApi.md#get_dashboard) | **GET** /dashboards/{id} | Get dashboard by ID
[**get_dashboards**](DashboardsApi.md#get_dashboards) | **GET** /dashboards | List dashboards
[**update_dashboard**](DashboardsApi.md#update_dashboard) | **PATCH** /dashboards/{id} | Update a dashboard using JSON Patch operations
[**upload_dashboard_image**](DashboardsApi.md#upload_dashboard_image) | **POST** /dashboards/{id}/images | Upload a dashboard image

# **copy_dashboard**
> Dashboard copy_dashboard(body, id)

Copy a dashboard (\"Save As\")

Creates a new dashboard owned by the authenticated user from the layout supplied in the request body, leaving the source dashboard completely untouched (DL4-34797). The name must be unique among the caller's own dashboards within the tenant. Uploaded images referenced by the supplied content are duplicated onto the new dashboard — `dashboardimage` rows are scoped by dashboardId, so a verbatim client-side copy would leave the new dashboard's elements pointing at rows it does not own. Only images the supplied layout still references are carried over; the returned `content` has their imageIds rewritten. The copy is compensated on failure, so a partially-built dashboard is never left behind.

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
api_instance = dlxapi.DashboardsApi(dlxapi.ApiClient(configuration))
body = dlxapi.CopyDashboardRequest() # CopyDashboardRequest | Name, optional description, and the layout to save into the copy
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | The dashboard to copy FROM. Never modified.

try:
    # Copy a dashboard (\"Save As\")
    api_response = api_instance.copy_dashboard(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DashboardsApi->copy_dashboard: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CopyDashboardRequest**](CopyDashboardRequest.md)| Name, optional description, and the layout to save into the copy | 
 **id** | [**str**](.md)| The dashboard to copy FROM. Never modified. | 

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_dashboard**
> Dashboard create_dashboard(body)

Create dashboard

Creates a dashboard owned by the authenticated user. The name must be unique among that user's own dashboards within the tenant.

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
api_instance = dlxapi.DashboardsApi(dlxapi.ApiClient(configuration))
body = dlxapi.CreateDashboardRequest() # CreateDashboardRequest | Dashboard to create

try:
    # Create dashboard
    api_response = api_instance.create_dashboard(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DashboardsApi->create_dashboard: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateDashboardRequest**](CreateDashboardRequest.md)| Dashboard to create | 

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_dashboard**
> delete_dashboard(id)

Delete dashboard

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
api_instance = dlxapi.DashboardsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Delete dashboard
    api_instance.delete_dashboard(id)
except ApiException as e:
    print("Exception when calling DashboardsApi->delete_dashboard: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_dashboard_image**
> delete_dashboard_image(id, image_id)

Delete a dashboard image

Deletes the image row and removes the underlying object from storage.

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
api_instance = dlxapi.DashboardsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 
image_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Delete a dashboard image
    api_instance.delete_dashboard_image(id, image_id)
except ApiException as e:
    print("Exception when calling DashboardsApi->delete_dashboard_image: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 
 **image_id** | [**str**](.md)|  | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_dashboard_image**
> str download_dashboard_image(id, image_id)

Download dashboard image content

Streams the image bytes inline with the stored image/* Content-Type and X-Content-Type-Options: nosniff. An imageId belonging to a different dashboard returns 404.

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
api_instance = dlxapi.DashboardsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 
image_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Download dashboard image content
    api_response = api_instance.download_dashboard_image(id, image_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DashboardsApi->download_dashboard_image: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 
 **image_id** | [**str**](.md)|  | 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dashboard**
> Dashboard get_dashboard(id)

Get dashboard by ID

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
api_instance = dlxapi.DashboardsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Get dashboard by ID
    api_response = api_instance.get_dashboard(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DashboardsApi->get_dashboard: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)|  | 

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dashboards**
> Dashboards get_dashboards()

List dashboards

Returns the authenticated user's dashboards in the current tenant, most-recently-updated first. Dashboards are creator-private until sharing lands (DL4-34420), so the collection never contains another user's dashboards.

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
api_instance = dlxapi.DashboardsApi(dlxapi.ApiClient(configuration))

try:
    # List dashboards
    api_response = api_instance.get_dashboards()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DashboardsApi->get_dashboards: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Dashboards**](Dashboards.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_dashboard**
> Dashboard update_dashboard(body, id)

Update a dashboard using JSON Patch operations

Partially updates a dashboard the authenticated user owns via a JSON Patch (RFC 6902) operations array — the same convention as PATCH /charts/{id}. Only REPLACE on /name, /description and /content (the grid layout of placed charts, DL4-34455) is supported.

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
api_instance = dlxapi.DashboardsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | JSON Patch operations to apply to the dashboard.
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Update a dashboard using JSON Patch operations
    api_response = api_instance.update_dashboard(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DashboardsApi->update_dashboard: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch operations to apply to the dashboard. | 
 **id** | [**str**](.md)|  | 

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_dashboard_image**
> DashboardImage upload_dashboard_image(file, id)

Upload a dashboard image

Uploads a raster image to a dashboard the authenticated user owns and stores the bytes in the tenant's object storage. PNG, JPEG, GIF and WebP are accepted, up to 20 MB (configurable). The extension allow-list, a magic-byte check that must agree with the extension, and a virus scan all run before the bytes are persisted. SVG is rejected — the content endpoint serves inline, where an SVG can execute script.

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
api_instance = dlxapi.DashboardsApi(dlxapi.ApiClient(configuration))
file = 'file_example' # str | 
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | 

try:
    # Upload a dashboard image
    api_response = api_instance.upload_dashboard_image(file, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DashboardsApi->upload_dashboard_image: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **str**|  | 
 **id** | [**str**](.md)|  | 

### Return type

[**DashboardImage**](DashboardImage.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

