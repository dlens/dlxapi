# RegistrationApi

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
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
RegisterUserRequest registerUserRequest = new RegisterUserRequest(); // RegisterUserRequest | Register user request
try {
    PortfolioPlanUser result = apiInstance.registerPortfolioUser(registerUserRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#registerPortfolioUser");
    e.printStackTrace();
}
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
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.RegistrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RegistrationApi apiInstance = new RegistrationApi();
RegisterUserRequest registerUserRequest = new RegisterUserRequest(); // RegisterUserRequest | Register user request
try {
    User result = apiInstance.registerUser(registerUserRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationApi#registerUser");
    e.printStackTrace();
}
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

