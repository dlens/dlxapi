# dlxapi.LocationApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**geocode**](LocationApi.md#geocode) | **POST** /location/geocode | Forward geocoding – resolve a text query to coordinates and an address.
[**get_map_glyphs**](LocationApi.md#get_map_glyphs) | **GET** /location/maps/glyphs/{fontStack}/{range} | Font glyph range PBF, proxied from Amazon Location Service.
[**get_map_sprite**](LocationApi.md#get_map_sprite) | **GET** /location/maps/sprite/{fileName} | Sprite sheet or index, proxied from Amazon Location Service.
[**get_map_style**](LocationApi.md#get_map_style) | **GET** /location/maps/style | Basemap style descriptor, proxied from Amazon Location Service with source/glyph/sprite URLs rewritten to this service.
[**get_map_tile**](LocationApi.md#get_map_tile) | **GET** /location/maps/tiles/{z}/{x}/{y} | Vector basemap tile, proxied from Amazon Location Service.
[**reverse_geocode**](LocationApi.md#reverse_geocode) | **POST** /location/geocode/reverse | Reverse geocoding – resolve coordinates to a human-readable address.
[**upload_project_location**](LocationApi.md#upload_project_location) | **POST** /location/upload | Parse a file containing a single location and return it.

# **geocode**
> GeoPoint geocode(body)

Forward geocoding – resolve a text query to coordinates and an address.

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
api_instance = dlxapi.LocationApi(dlxapi.ApiClient(configuration))
body = dlxapi.GeoPoint() # GeoPoint | Geocoding query

try:
    # Forward geocoding – resolve a text query to coordinates and an address.
    api_response = api_instance.geocode(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LocationApi->geocode: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GeoPoint**](GeoPoint.md)| Geocoding query | 

### Return type

[**GeoPoint**](GeoPoint.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_map_glyphs**
> str get_map_glyphs(font_stack, range, if_none_match=if_none_match)

Font glyph range PBF, proxied from Amazon Location Service.

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
api_instance = dlxapi.LocationApi(dlxapi.ApiClient(configuration))
font_stack = 'font_stack_example' # str | Comma-separated font stack
range = 'range_example' # str | Unicode range file name, e.g. 0-255.pbf
if_none_match = 'if_none_match_example' # str | ETag for conditional requests; a match returns 304 Not Modified. (optional)

try:
    # Font glyph range PBF, proxied from Amazon Location Service.
    api_response = api_instance.get_map_glyphs(font_stack, range, if_none_match=if_none_match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LocationApi->get_map_glyphs: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **font_stack** | **str**| Comma-separated font stack | 
 **range** | **str**| Unicode range file name, e.g. 0-255.pbf | 
 **if_none_match** | **str**| ETag for conditional requests; a match returns 304 Not Modified. | [optional] 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_map_sprite**
> str get_map_sprite(file_name, if_none_match=if_none_match)

Sprite sheet or index, proxied from Amazon Location Service.

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
api_instance = dlxapi.LocationApi(dlxapi.ApiClient(configuration))
file_name = 'file_name_example' # str | Sprite file name, e.g. sprite.json, sprite.png, sprite@2x.png
if_none_match = 'if_none_match_example' # str | ETag for conditional requests; a match returns 304 Not Modified. (optional)

try:
    # Sprite sheet or index, proxied from Amazon Location Service.
    api_response = api_instance.get_map_sprite(file_name, if_none_match=if_none_match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LocationApi->get_map_sprite: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_name** | **str**| Sprite file name, e.g. sprite.json, sprite.png, sprite@2x.png | 
 **if_none_match** | **str**| ETag for conditional requests; a match returns 304 Not Modified. | [optional] 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_map_style**
> str get_map_style(if_none_match=if_none_match)

Basemap style descriptor, proxied from Amazon Location Service with source/glyph/sprite URLs rewritten to this service.

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
api_instance = dlxapi.LocationApi(dlxapi.ApiClient(configuration))
if_none_match = 'if_none_match_example' # str | ETag for conditional requests; a match returns 304 Not Modified. (optional)

try:
    # Basemap style descriptor, proxied from Amazon Location Service with source/glyph/sprite URLs rewritten to this service.
    api_response = api_instance.get_map_style(if_none_match=if_none_match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LocationApi->get_map_style: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **if_none_match** | **str**| ETag for conditional requests; a match returns 304 Not Modified. | [optional] 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_map_tile**
> str get_map_tile(z, x, y, if_none_match=if_none_match)

Vector basemap tile, proxied from Amazon Location Service.

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
api_instance = dlxapi.LocationApi(dlxapi.ApiClient(configuration))
z = 'z_example' # str | Tile zoom level
x = 'x_example' # str | Tile column
y = 'y_example' # str | Tile row
if_none_match = 'if_none_match_example' # str | ETag for conditional requests; a match returns 304 Not Modified. (optional)

try:
    # Vector basemap tile, proxied from Amazon Location Service.
    api_response = api_instance.get_map_tile(z, x, y, if_none_match=if_none_match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LocationApi->get_map_tile: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **z** | **str**| Tile zoom level | 
 **x** | **str**| Tile column | 
 **y** | **str**| Tile row | 
 **if_none_match** | **str**| ETag for conditional requests; a match returns 304 Not Modified. | [optional] 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reverse_geocode**
> GeoPoint reverse_geocode(body)

Reverse geocoding – resolve coordinates to a human-readable address.

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
api_instance = dlxapi.LocationApi(dlxapi.ApiClient(configuration))
body = dlxapi.GeoPoint() # GeoPoint | Geocoding query

try:
    # Reverse geocoding – resolve coordinates to a human-readable address.
    api_response = api_instance.reverse_geocode(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LocationApi->reverse_geocode: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GeoPoint**](GeoPoint.md)| Geocoding query | 

### Return type

[**GeoPoint**](GeoPoint.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_project_location**
> Location upload_project_location(project_id, file)

Parse a file containing a single location and return it.

Accepts a CSV (.csv), Excel (.xlsx), GeoJSON (.geojson, .json), KML (.kml), or zipped Shapefile (.zip containing .shp + .shx + .dbf + .prj) file containing exactly one location, parses it, geocodes address-style inputs, and returns the resulting Location DTO. **The location is not persisted by this endpoint** — the client is responsible for saving it via the standard field-values patch flow once the user confirms.  Tabular formats (CSV, Excel) accept a single Point with columns address, city, state, country, lat, lng (case-insensitive); lat/lng take precedence over address. Address-style inputs are forward-geocoded via the platform geocoding service.  Geospatial formats (GeoJSON, KML, Shapefile) additionally accept LineString and Polygon geometries. Shapefiles must be in WGS84 / EPSG:4326. Files containing more than one location, multi-part geometries, or interior polygon rings are rejected. 

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
api_instance = dlxapi.LocationApi(dlxapi.ApiClient(configuration))
project_id = 'project_id_example' # str | 
file = 'file_example' # str | 

try:
    # Parse a file containing a single location and return it.
    api_response = api_instance.upload_project_location(project_id, file)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LocationApi->upload_project_location: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **str**|  | 
 **file** | **str**|  | 

### Return type

[**Location**](Location.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

