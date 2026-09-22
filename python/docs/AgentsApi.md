# dlxapi.AgentsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**criteria_agent**](AgentsApi.md#criteria_agent) | **POST** /agents/criteria | Criteria Agent
[**get_agent_messages**](AgentsApi.md#get_agent_messages) | **GET** /agents/messages | Get agent messages for the thread id (example prioritizationId)
[**stream_criteria_agent**](AgentsApi.md#stream_criteria_agent) | **POST** /agents/stream/criteria | Criteria Agent (Streaming)

# **criteria_agent**
> AgentResponse criteria_agent(body)

Criteria Agent

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
api_instance = dlxapi.AgentsApi(dlxapi.ApiClient(configuration))
body = dlxapi.CriteriaAgentRequest() # CriteriaAgentRequest | 

try:
    # Criteria Agent
    api_response = api_instance.criteria_agent(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AgentsApi->criteria_agent: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CriteriaAgentRequest**](CriteriaAgentRequest.md)|  | 

### Return type

[**AgentResponse**](AgentResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_agent_messages**
> AgentResponse get_agent_messages(thread_id)

Get agent messages for the thread id (example prioritizationId)

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
api_instance = dlxapi.AgentsApi(dlxapi.ApiClient(configuration))
thread_id = 'thread_id_example' # str | 

try:
    # Get agent messages for the thread id (example prioritizationId)
    api_response = api_instance.get_agent_messages(thread_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AgentsApi->get_agent_messages: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **thread_id** | **str**|  | 

### Return type

[**AgentResponse**](AgentResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stream_criteria_agent**
> AgentMessage stream_criteria_agent(body)

Criteria Agent (Streaming)

Streams the final LLM response using Server-Sent Events (SSE).  Each SSE `data:` line contains a JSON-encoded `AgentStreamEvent` with these type values: - `ASSISTANT` — streamed text chunks as the LLM generates (`content` field) - `SYSTEM` — system events: CRITERIA_FRAMEWORK_SAVED or DONE to signal end of stream (`message` field) - `SUGGESTION` — one per suggestion, sent after stream completes (`message` field) - `ERROR` — if an error occurs mid-stream (`message` field) 

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
api_instance = dlxapi.AgentsApi(dlxapi.ApiClient(configuration))
body = dlxapi.CriteriaAgentRequest() # CriteriaAgentRequest | 

try:
    # Criteria Agent (Streaming)
    api_response = api_instance.stream_criteria_agent(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AgentsApi->stream_criteria_agent: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CriteriaAgentRequest**](CriteriaAgentRequest.md)|  | 

### Return type

[**AgentMessage**](AgentMessage.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/event-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

