# JiraApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCommentFromJira**](JiraApi.md#createCommentFromJira) | **POST** /jira/instance/{id}/comment | 
[**createJiraFieldMapping**](JiraApi.md#createJiraFieldMapping) | **POST** /jira/instance/{id}/mapping | 
[**createJiraInstance**](JiraApi.md#createJiraInstance) | **POST** /jira/instance | 
[**deleteFieldMapping**](JiraApi.md#deleteFieldMapping) | **DELETE** /jira/instance/{id}/mapping/{mappingId} | Delete jira field mapping
[**deleteJiraInstance**](JiraApi.md#deleteJiraInstance) | **DELETE** /jira/instance/{id} | Delete jira instance
[**disableJiraInstance**](JiraApi.md#disableJiraInstance) | **POST** /jira/instance/{id}/disable | 
[**enableJiraInstance**](JiraApi.md#enableJiraInstance) | **POST** /jira/instance/{id}/enable | 
[**getFieldMapping**](JiraApi.md#getFieldMapping) | **GET** /jira/instance/{id}/mapping/{mappingId} | 
[**getFieldMappings**](JiraApi.md#getFieldMappings) | **GET** /jira/instance/{id}/mappings | 
[**getJiraInstance**](JiraApi.md#getJiraInstance) | **GET** /jira/instance/{id} | 
[**getMappedProjectForEpic**](JiraApi.md#getMappedProjectForEpic) | **GET** /jira/instance/{id}/mappedProject/{epicId} | 
[**startSyncForJiraInstance**](JiraApi.md#startSyncForJiraInstance) | **POST** /jira/instance/{id}/sync | 


<a name="createCommentFromJira"></a>
# **createCommentFromJira**
> createCommentFromJira(id, body)



Creates a comment in Decision Lens based on a Jira comment.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.JiraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

JiraApi apiInstance = new JiraApi();
String id = "id_example"; // String | jira instance id
JiraComment body = new JiraComment(); // JiraComment | Comment to create
try {
    apiInstance.createCommentFromJira(id, body);
} catch (ApiException e) {
    System.err.println("Exception when calling JiraApi#createCommentFromJira");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira instance id |
 **body** | [**JiraComment**](JiraComment.md)| Comment to create |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createJiraFieldMapping"></a>
# **createJiraFieldMapping**
> JiraFieldMapping createJiraFieldMapping(id, body)



Creates jira field mapping.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.JiraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

JiraApi apiInstance = new JiraApi();
String id = "id_example"; // String | jira instance id
JiraFieldMapping body = new JiraFieldMapping(); // JiraFieldMapping | Field mapping to create
try {
    JiraFieldMapping result = apiInstance.createJiraFieldMapping(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JiraApi#createJiraFieldMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira instance id |
 **body** | [**JiraFieldMapping**](JiraFieldMapping.md)| Field mapping to create |

### Return type

[**JiraFieldMapping**](JiraFieldMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createJiraInstance"></a>
# **createJiraInstance**
> JiraInstance createJiraInstance(body)



Creates jira instance.

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.JiraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

JiraApi apiInstance = new JiraApi();
JiraInstance body = new JiraInstance(); // JiraInstance | Jira instance to create
try {
    JiraInstance result = apiInstance.createJiraInstance(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JiraApi#createJiraInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JiraInstance**](JiraInstance.md)| Jira instance to create |

### Return type

[**JiraInstance**](JiraInstance.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFieldMapping"></a>
# **deleteFieldMapping**
> deleteFieldMapping(id)

Delete jira field mapping

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.JiraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

JiraApi apiInstance = new JiraApi();
String id = "id_example"; // String | jira field mapping id
try {
    apiInstance.deleteFieldMapping(id);
} catch (ApiException e) {
    System.err.println("Exception when calling JiraApi#deleteFieldMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira field mapping id |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteJiraInstance"></a>
# **deleteJiraInstance**
> deleteJiraInstance(id)

Delete jira instance

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.JiraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

JiraApi apiInstance = new JiraApi();
String id = "id_example"; // String | jira instance id
try {
    apiInstance.deleteJiraInstance(id);
} catch (ApiException e) {
    System.err.println("Exception when calling JiraApi#deleteJiraInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira instance id |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="disableJiraInstance"></a>
# **disableJiraInstance**
> disableJiraInstance(id)



Disable Jira Instance

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.JiraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

JiraApi apiInstance = new JiraApi();
String id = "id_example"; // String | jira instance id
try {
    apiInstance.disableJiraInstance(id);
} catch (ApiException e) {
    System.err.println("Exception when calling JiraApi#disableJiraInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira instance id |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enableJiraInstance"></a>
# **enableJiraInstance**
> enableJiraInstance(id)



Enable Jira Instance

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.JiraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

JiraApi apiInstance = new JiraApi();
String id = "id_example"; // String | jira instance id
try {
    apiInstance.enableJiraInstance(id);
} catch (ApiException e) {
    System.err.println("Exception when calling JiraApi#enableJiraInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira instance id |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFieldMapping"></a>
# **getFieldMapping**
> JiraFieldMapping getFieldMapping(id, mappingId)



Get Jira field mapping

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.JiraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

JiraApi apiInstance = new JiraApi();
String id = "id_example"; // String | jira integration instance id
String mappingId = "mappingId_example"; // String | jira field mapping id
try {
    JiraFieldMapping result = apiInstance.getFieldMapping(id, mappingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JiraApi#getFieldMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira integration instance id |
 **mappingId** | **String**| jira field mapping id |

### Return type

[**JiraFieldMapping**](JiraFieldMapping.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFieldMappings"></a>
# **getFieldMappings**
> JiraFieldMappings getFieldMappings(id)



Get Jira field mappings for an instance

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.JiraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

JiraApi apiInstance = new JiraApi();
String id = "id_example"; // String | jira instance id
try {
    JiraFieldMappings result = apiInstance.getFieldMappings(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JiraApi#getFieldMappings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira instance id |

### Return type

[**JiraFieldMappings**](JiraFieldMappings.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJiraInstance"></a>
# **getJiraInstance**
> JiraInstance getJiraInstance(id)



Get Jira Instance

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.JiraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

JiraApi apiInstance = new JiraApi();
String id = "id_example"; // String | jira instance id
try {
    JiraInstance result = apiInstance.getJiraInstance(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JiraApi#getJiraInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira instance id |

### Return type

[**JiraInstance**](JiraInstance.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMappedProjectForEpic"></a>
# **getMappedProjectForEpic**
> MappedProject getMappedProjectForEpic(id, epicId)



Return mapped Decision Lens project for a Jira epic

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.JiraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

JiraApi apiInstance = new JiraApi();
String id = "id_example"; // String | Jira integration instance id
String epicId = "epicId_example"; // String | Epic key from Jira
try {
    MappedProject result = apiInstance.getMappedProjectForEpic(id, epicId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JiraApi#getMappedProjectForEpic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Jira integration instance id |
 **epicId** | **String**| Epic key from Jira |

### Return type

[**MappedProject**](MappedProject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startSyncForJiraInstance"></a>
# **startSyncForJiraInstance**
> startSyncForJiraInstance(id)



Run synchronization process for Jira Instance

### Example
```java
// Import classes:
//import com.decisionlens.client.ApiClient;
//import com.decisionlens.client.ApiException;
//import com.decisionlens.client.Configuration;
//import com.decisionlens.client.auth.*;
//import com.decisionlens.client.api.JiraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

JiraApi apiInstance = new JiraApi();
String id = "id_example"; // String | jira instance id
try {
    apiInstance.startSyncForJiraInstance(id);
} catch (ApiException e) {
    System.err.println("Exception when calling JiraApi#startSyncForJiraInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| jira instance id |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

