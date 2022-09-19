# DecisionLensApi.PortfolioPlanUsersApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePortfolioPlanUser**](PortfolioPlanUsersApi.md#deletePortfolioPlanUser) | **DELETE** /portfolioPlanUsers/{id} | Delete a portfolio plan user
[**updatePortfolioPlanUsers**](PortfolioPlanUsersApi.md#updatePortfolioPlanUsers) | **PATCH** /portfolioPlanUsers/{id} | Update portfolio plan users


<a name="deletePortfolioPlanUser"></a>
# **deletePortfolioPlanUser**
> deletePortfolioPlanUser(id)

Delete a portfolio plan user

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlanUsersApi();

var id = "id_example"; // String | Portfolio plan user id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deletePortfolioPlanUser(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Portfolio plan user id | 

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updatePortfolioPlanUsers"></a>
# **updatePortfolioPlanUsers**
> [PortfolioPlanUser] updatePortfolioPlanUsers(body)

Update portfolio plan users

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.PortfolioPlanUsersApi();

var body = [new DecisionLensApi.PatchItem()]; // [PatchItem] | JSON Patch Operations to update multiple portfolio plan users.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updatePortfolioPlanUsers(body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**[PatchItem]**](PatchItem.md)| JSON Patch Operations to update multiple portfolio plan users. | 

### Return type

[**[PortfolioPlanUser]**](PortfolioPlanUser.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

