# MessagesApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendMessages**](MessagesApi.md#sendMessages) | **POST** /messages | Send Message(s)


<a name="sendMessages"></a>
# **sendMessages**
> sendMessages(messages)

Send Message(s)

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

MessagesApi apiInstance = new MessagesApi();
List<Message> messages = Arrays.asList(new Message()); // List<Message> | 
try {
    apiInstance.sendMessages(messages);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#sendMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messages** | [**List&lt;Message&gt;**](Message.md)|  |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

