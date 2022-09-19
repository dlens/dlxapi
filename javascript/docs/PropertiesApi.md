# DecisionLensApi.PropertiesApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProperties**](PropertiesApi.md#getProperties) | **GET** /properties | Get configuration properties for user if userId and groupId are present, otherwise properties for authenticated user will be returned
[**setProperties**](PropertiesApi.md#setProperties) | **PUT** /properties | Set configuration properties


<a name="getProperties"></a>
# **getProperties**
> Properties getProperties(opts)

Get configuration properties for user if userId and groupId are present, otherwise properties for authenticated user will be returned

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PropertiesApi();

var opts = { 
  'userId': "userId_example" // String | User id
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getProperties(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User id | [optional] 

### Return type

[**Properties**](Properties.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setProperties"></a>
# **setProperties**
> [Property] setProperties(body)

Set configuration properties

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PropertiesApi();

var body = [new DecisionLensApi.Property()]; // [Property] | Properties that needed to be created/updated for the current user.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.setProperties(body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**[Property]**](Property.md)| Properties that needed to be created/updated for the current user. | 

### Return type

[**[Property]**](Property.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

