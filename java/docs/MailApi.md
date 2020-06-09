# MailApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendMail**](MailApi.md#sendMail) | **POST** /mail | Send mail
[**sendRegistrationMail**](MailApi.md#sendRegistrationMail) | **POST** /registrationMail | Send registration mail


<a name="sendMail"></a>
# **sendMail**
> sendMail(mail)

Send mail

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.MailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

MailApi apiInstance = new MailApi();
Mail mail = new Mail(); // Mail | mail request
try {
    apiInstance.sendMail(mail);
} catch (ApiException e) {
    System.err.println("Exception when calling MailApi#sendMail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mail** | [**Mail**](Mail.md)| mail request |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendRegistrationMail"></a>
# **sendRegistrationMail**
> sendRegistrationMail(mail, accessToken)

Send registration mail

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.MailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

MailApi apiInstance = new MailApi();
Mail mail = new Mail(); // Mail | mail request
String accessToken = "accessToken_example"; // String | access token
try {
    apiInstance.sendRegistrationMail(mail, accessToken);
} catch (ApiException e) {
    System.err.println("Exception when calling MailApi#sendRegistrationMail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mail** | [**Mail**](Mail.md)| mail request |
 **accessToken** | **String**| access token | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

