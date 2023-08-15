# swagger_client.ScoreWeightsApi

All URIs are relative to *http://localhost:9005/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_score_weights_for_portfolio**](ScoreWeightsApi.md#get_score_weights_for_portfolio) | **GET** /scoreWeights | Fetch score weights for portfolio
[**update_score_weights_for_portfolio**](ScoreWeightsApi.md#update_score_weights_for_portfolio) | **PATCH** /scoreWeights | Updates Score Weights for portfolio


# **get_score_weights_for_portfolio**
> ScoreWeights get_score_weights_for_portfolio(portfolio_id, limit=limit, offset=offset, order_by=order_by, match=match)

Fetch score weights for portfolio

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: OAuth2
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.ScoreWeightsApi(swagger_client.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio id
limit = 56 # int | Pagination limit (optional)
offset = 56 # int | Pagination offset (optional)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)
match = 'match_example' # str | Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. (optional)

try:
    # Fetch score weights for portfolio
    api_response = api_instance.get_score_weights_for_portfolio(portfolio_id, limit=limit, offset=offset, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ScoreWeightsApi->get_score_weights_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 
 **limit** | **int**| Pagination limit | [optional] 
 **offset** | **int**| Pagination offset | [optional] 
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#39;-&#39; in front of expression for reverse order. | [optional] 
 **match** | **str**| Semi-colon delimited list of expressions to include in the response only the items in a collections that satisfy the expression(s). All other items should be exluded. | [optional] 

### Return type

[**ScoreWeights**](ScoreWeights.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_score_weights_for_portfolio**
> list[ScoreWeight] update_score_weights_for_portfolio(score_weights)

Updates Score Weights for portfolio

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: OAuth2
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.ScoreWeightsApi(swagger_client.ApiClient(configuration))
score_weights = [swagger_client.ScoreWeight()] # list[ScoreWeight] | Score Weights

try:
    # Updates Score Weights for portfolio
    api_response = api_instance.update_score_weights_for_portfolio(score_weights)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ScoreWeightsApi->update_score_weights_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **score_weights** | [**list[ScoreWeight]**](ScoreWeight.md)| Score Weights | 

### Return type

[**list[ScoreWeight]**](ScoreWeight.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

