# DecisionLensApi.RegistrationApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registerPortfolioUser**](RegistrationApi.md#registerPortfolioUser) | **POST** /registerPortfolioUser | Register Portfolio User
[**registerUser**](RegistrationApi.md#registerUser) | **POST** /registerUser | Register User


<a name="registerPortfolioUser"></a>
# **registerPortfolioUser**
> PortfolioPlanUser registerPortfolioUser(registerUserRequest)

Register Portfolio User

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.RegistrationApi();

var registerUserRequest = new DecisionLensApi.RegisterUserRequest(); // RegisterUserRequest | Register user request


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.registerPortfolioUser(registerUserRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registerUserRequest** | [**RegisterUserRequest**](RegisterUserRequest.md)| Register user request | 

### Return type

[**PortfolioPlanUser**](PortfolioPlanUser.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registerUser"></a>
# **registerUser**
> User registerUser(registerUserRequest)

Register User

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.RegistrationApi();

var registerUserRequest = new DecisionLensApi.RegisterUserRequest(); // RegisterUserRequest | Register user request


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.registerUser(registerUserRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registerUserRequest** | [**RegisterUserRequest**](RegisterUserRequest.md)| Register user request | 

### Return type

[**User**](User.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

