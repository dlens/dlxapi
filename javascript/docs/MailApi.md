# DecisionLensApi.MailApi

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
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.MailApi();

var mail = new DecisionLensApi.Mail(); // Mail | mail request


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.sendMail(mail, callback);
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
> sendRegistrationMail(mail, opts)

Send registration mail

### Example
```javascript
var DecisionLensApi = require('decision_lens_api');
var defaultClient = DecisionLensApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new DecisionLensApi.MailApi();

var mail = new DecisionLensApi.Mail(); // Mail | mail request

var opts = { 
  'accessToken': "accessToken_example" // String | access token
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.sendRegistrationMail(mail, opts, callback);
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

