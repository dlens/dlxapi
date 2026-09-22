# dlxapi.SurveysApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_survey_fields**](SurveysApi.md#add_survey_fields) | **POST** /surveys/{id}/fields | Add survey fields
[**add_survey_reference_fields**](SurveysApi.md#add_survey_reference_fields) | **POST** /surveys/{id}/referenceFields | Add survey reference fields
[**add_survey_users**](SurveysApi.md#add_survey_users) | **POST** /surveys/{id}/users | Add survey users
[**clear_votes_ratings**](SurveysApi.md#clear_votes_ratings) | **DELETE** /surveys/{id}/clearVotesRatings | Clears all ratings or pairwise votes submitted by survey users.
[**copy_survey**](SurveysApi.md#copy_survey) | **POST** /surveys/{id}/copy | Duplicates a survey with optional components.
[**create_pairwise_vote_comment**](SurveysApi.md#create_pairwise_vote_comment) | **POST** /surveys/{surveyId}/pairwiseVoteComments | Creates a new pairwise vote comment.
[**create_rating_comment**](SurveysApi.md#create_rating_comment) | **POST** /surveys/{surveyId}/ratingComments | Creates a new rating comment.
[**create_survey**](SurveysApi.md#create_survey) | **POST** /surveys | Creates a new survey. Can optionally copy from an existing survey.
[**create_survey_attachment**](SurveysApi.md#create_survey_attachment) | **POST** /surveys/{id}/attachments | Creates a new attachment for survey from a file upload
[**delete_pairwise_vote_comment**](SurveysApi.md#delete_pairwise_vote_comment) | **DELETE** /surveys/{surveyId}/pairwiseVoteComments/{pairwiseVoteCommentId} | Deletes a pairwise vote comment
[**delete_rating_comment**](SurveysApi.md#delete_rating_comment) | **DELETE** /surveys/{surveyId}/ratingComments/{ratingCommentId} | Deletes a rating comment
[**delete_survey_attachment**](SurveysApi.md#delete_survey_attachment) | **DELETE** /surveys/{id}/attachments/{attachmentId} | Deletes a survey attachment
[**download_survey_attachment**](SurveysApi.md#download_survey_attachment) | **GET** /surveys/{id}/attachments/{attachmentId}/download | Downloads the file content of a survey attachment
[**get_my_survey**](SurveysApi.md#get_my_survey) | **GET** /surveys/my/{id} | Retrieves a survey.
[**get_my_survey_progress**](SurveysApi.md#get_my_survey_progress) | **GET** /surveys/my/{id}/progress | Retrieves survey progress for the user
[**get_my_survey_score_weights**](SurveysApi.md#get_my_survey_score_weights) | **GET** /surveys/my/{id}/scoreWeights | Retrieves user&#x27;s score weights for a survey.
[**get_my_surveys**](SurveysApi.md#get_my_surveys) | **GET** /surveys/my | Retrieves surveys across all prioritizations for the user.
[**get_pairwise_vote_comments**](SurveysApi.md#get_pairwise_vote_comments) | **GET** /surveys/{surveyId}/pairwiseVoteComments | Retrieves pairwise vote comments
[**get_rating_comments**](SurveysApi.md#get_rating_comments) | **GET** /surveys/{surveyId}/ratingComments | Retrieves rating comments
[**get_survey**](SurveysApi.md#get_survey) | **GET** /surveys/{id} | Retrieves a survey.
[**get_survey_attachment**](SurveysApi.md#get_survey_attachment) | **GET** /surveys/{id}/attachments/{attachmentId} | Get survey attachment by id
[**get_survey_attachments**](SurveysApi.md#get_survey_attachments) | **GET** /surveys/{id}/attachments | Get attachments for survey
[**get_survey_fields**](SurveysApi.md#get_survey_fields) | **GET** /surveys/{id}/fields | Retrieves survey fields
[**get_survey_progress**](SurveysApi.md#get_survey_progress) | **GET** /surveys/{id}/progress | Retrieves survey progress for all users in a survey
[**get_survey_project**](SurveysApi.md#get_survey_project) | **GET** /surveys/{id}/projects/{projectId} | Retrieves survey project
[**get_survey_projects**](SurveysApi.md#get_survey_projects) | **GET** /surveys/{id}/projects | Retrieves survey projects
[**get_survey_reference_fields**](SurveysApi.md#get_survey_reference_fields) | **GET** /surveys/{id}/referenceFields | Retrieves survey reference fields
[**get_survey_users**](SurveysApi.md#get_survey_users) | **GET** /surveys/{id}/users | Retrieves survey users
[**get_surveys**](SurveysApi.md#get_surveys) | **GET** /surveys | Retrieves surveys
[**remove_survey_fields**](SurveysApi.md#remove_survey_fields) | **DELETE** /surveys/{id}/fields | Remove survey fields
[**remove_survey_projects**](SurveysApi.md#remove_survey_projects) | **DELETE** /surveys/{id}/projects | Remove survey projects
[**remove_survey_reference_fields**](SurveysApi.md#remove_survey_reference_fields) | **DELETE** /surveys/{id}/referenceFields | Remove survey reference fields
[**remove_survey_users**](SurveysApi.md#remove_survey_users) | **DELETE** /surveys/{id}/users | Remove survey users
[**update_pairwise_vote_comment**](SurveysApi.md#update_pairwise_vote_comment) | **PATCH** /surveys/{surveyId}/pairwiseVoteComments/{pairwiseVoteCommentId} | Updated pairwise vote comment
[**update_rating_comment**](SurveysApi.md#update_rating_comment) | **PATCH** /surveys/{surveyId}/ratingComments/{ratingCommentId} | Updated rating comment
[**update_survey**](SurveysApi.md#update_survey) | **PATCH** /surveys/{id} | Updates a survey utilizing JSON Patch Operations.
[**update_survey_field_values_for_user**](SurveysApi.md#update_survey_field_values_for_user) | **PATCH** /surveys/{id}/fieldValues | Updates survey field values utilizing JSON Patch Operations.
[**update_survey_fields**](SurveysApi.md#update_survey_fields) | **PATCH** /surveys/{id}/fields | Updates a survey field utilizing JSON Patch Operations.
[**update_survey_pairwise_vote_for_user**](SurveysApi.md#update_survey_pairwise_vote_for_user) | **PATCH** /surveys/{id}/pairwiseVote | Updates survey pairwise vote utilizing JSON Patch Operations.
[**update_survey_projects**](SurveysApi.md#update_survey_projects) | **POST** /surveys/{id}/projects | Update survey projects
[**update_survey_reference_fields**](SurveysApi.md#update_survey_reference_fields) | **PATCH** /surveys/{id}/referenceFields | Updates a survey reference field utilizing JSON Patch Operations.
[**update_surveys**](SurveysApi.md#update_surveys) | **PATCH** /prioritizations/{prioritizationId}/surveys | Updates all surveys for a prioritization utilizing JSON Patch Operations.

# **add_survey_fields**
> list[PrioritizationField] add_survey_fields(id, body=body)

Add survey fields

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
body = ['body_example'] # list[str] | An array of PrioritizationField ids. (optional)

try:
    # Add survey fields
    api_response = api_instance.add_survey_fields(id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->add_survey_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 
 **body** | [**list[str]**](str.md)| An array of PrioritizationField ids. | [optional] 

### Return type

[**list[PrioritizationField]**](PrioritizationField.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **add_survey_reference_fields**
> list[ReferenceField] add_survey_reference_fields(id, body=body)

Add survey reference fields

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
body = ['body_example'] # list[str] | An array of ReferenceField ids. (optional)

try:
    # Add survey reference fields
    api_response = api_instance.add_survey_reference_fields(id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->add_survey_reference_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 
 **body** | [**list[str]**](str.md)| An array of ReferenceField ids. | [optional] 

### Return type

[**list[ReferenceField]**](ReferenceField.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **add_survey_users**
> list[PrioritizationUser] add_survey_users(id, addPrioritizationUsersRequest=addPrioritizationUsersRequest)

Add survey users

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
addPrioritizationUsersRequest = dlxapi.AddPrioritizationUsersRequest() # AddPrioritizationUsersRequest | AddPrioritizationUsersRequest with existingUserIds (UUIDs) and newUserEmails (emails). (optional)

try:
    # Add survey users
    api_response = api_instance.add_survey_users(id, addPrioritizationUsersRequest=addPrioritizationUsersRequest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->add_survey_users: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 
 **addPrioritizationUsersRequest** | [**AddPrioritizationUsersRequest**](AddPrioritizationUsersRequest.md)| AddPrioritizationUsersRequest with existingUserIds (UUIDs) and newUserEmails (emails). | [optional] 

### Return type

[**list[PrioritizationUser]**](PrioritizationUser.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **clear_votes_ratings**
> Surveys clear_votes_ratings(id)

Clears all ratings or pairwise votes submitted by survey users.

For RATINGS surveys this removes every rating submitted by users in the survey across the entire prioritization. For PRIORITIES surveys this removes every pairwise vote submitted by those users across the entire prioritization. If a user participates in multiple surveys on the same prioritization, their responses are removed from all of them. 

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id

try:
    # Clears all ratings or pairwise votes submitted by survey users.
    api_response = api_instance.clear_votes_ratings(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->clear_votes_ratings: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 

### Return type

[**Surveys**](Surveys.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **copy_survey**
> Survey copy_survey(id, body=body)

Duplicates a survey with optional components.

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id to copy
body = dlxapi.CopySurveyRequest() # CopySurveyRequest | Copy options (optional)

try:
    # Duplicates a survey with optional components.
    api_response = api_instance.copy_survey(id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->copy_survey: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id to copy | 
 **body** | [**CopySurveyRequest**](CopySurveyRequest.md)| Copy options | [optional] 

### Return type

[**Survey**](Survey.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_pairwise_vote_comment**
> PairwiseVoteComment create_pairwise_vote_comment(body, survey_id)

Creates a new pairwise vote comment.

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
body = dlxapi.AddPairwiseVoteCommentRequest() # AddPairwiseVoteCommentRequest | Pairwise vote comment to create
survey_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id

try:
    # Creates a new pairwise vote comment.
    api_response = api_instance.create_pairwise_vote_comment(body, survey_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->create_pairwise_vote_comment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddPairwiseVoteCommentRequest**](AddPairwiseVoteCommentRequest.md)| Pairwise vote comment to create | 
 **survey_id** | [**str**](.md)| Survey id | 

### Return type

[**PairwiseVoteComment**](PairwiseVoteComment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_rating_comment**
> RatingComment create_rating_comment(body, survey_id)

Creates a new rating comment.

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
body = dlxapi.AddRatingCommentRequest() # AddRatingCommentRequest | Rating comment to create
survey_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id

try:
    # Creates a new rating comment.
    api_response = api_instance.create_rating_comment(body, survey_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->create_rating_comment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddRatingCommentRequest**](AddRatingCommentRequest.md)| Rating comment to create | 
 **survey_id** | [**str**](.md)| Survey id | 

### Return type

[**RatingComment**](RatingComment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_survey**
> Survey create_survey(body, prioritization_id=prioritization_id)

Creates a new survey. Can optionally copy from an existing survey.

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
body = dlxapi.AddSurveyRequest() # AddSurveyRequest | Survey to create with optional copy settings
prioritization_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id (optional)

try:
    # Creates a new survey. Can optionally copy from an existing survey.
    api_response = api_instance.create_survey(body, prioritization_id=prioritization_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->create_survey: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddSurveyRequest**](AddSurveyRequest.md)| Survey to create with optional copy settings | 
 **prioritization_id** | [**str**](.md)| Prioritization id | [optional] 

### Return type

[**Survey**](Survey.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_survey_attachment**
> SurveyAttachment create_survey_attachment(file, id)

Creates a new attachment for survey from a file upload

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
file = 'file_example' # str | 
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id

try:
    # Creates a new attachment for survey from a file upload
    api_response = api_instance.create_survey_attachment(file, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->create_survey_attachment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **str**|  | 
 **id** | [**str**](.md)| Survey id | 

### Return type

[**SurveyAttachment**](SurveyAttachment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_pairwise_vote_comment**
> delete_pairwise_vote_comment(survey_id, pairwise_vote_comment_id)

Deletes a pairwise vote comment

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
survey_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
pairwise_vote_comment_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Pairwise vote comment id

try:
    # Deletes a pairwise vote comment
    api_instance.delete_pairwise_vote_comment(survey_id, pairwise_vote_comment_id)
except ApiException as e:
    print("Exception when calling SurveysApi->delete_pairwise_vote_comment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **survey_id** | [**str**](.md)| Survey id | 
 **pairwise_vote_comment_id** | [**str**](.md)| Pairwise vote comment id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_rating_comment**
> delete_rating_comment(survey_id, rating_comment_id)

Deletes a rating comment

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
survey_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
rating_comment_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Rating comment id

try:
    # Deletes a rating comment
    api_instance.delete_rating_comment(survey_id, rating_comment_id)
except ApiException as e:
    print("Exception when calling SurveysApi->delete_rating_comment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **survey_id** | [**str**](.md)| Survey id | 
 **rating_comment_id** | [**str**](.md)| Rating comment id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_survey_attachment**
> delete_survey_attachment(id, attachment_id)

Deletes a survey attachment

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
attachment_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Attachment id

try:
    # Deletes a survey attachment
    api_instance.delete_survey_attachment(id, attachment_id)
except ApiException as e:
    print("Exception when calling SurveysApi->delete_survey_attachment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 
 **attachment_id** | [**str**](.md)| Attachment id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_survey_attachment**
> str download_survey_attachment(id, attachment_id)

Downloads the file content of a survey attachment

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
attachment_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Attachment id

try:
    # Downloads the file content of a survey attachment
    api_response = api_instance.download_survey_attachment(id, attachment_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->download_survey_attachment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 
 **attachment_id** | [**str**](.md)| Attachment id | 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_my_survey**
> Survey get_my_survey(id)

Retrieves a survey.

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id

try:
    # Retrieves a survey.
    api_response = api_instance.get_my_survey(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->get_my_survey: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 

### Return type

[**Survey**](Survey.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_my_survey_progress**
> SurveyProgress get_my_survey_progress(id, project_id=project_id, include_first_uncompleted_project_id=include_first_uncompleted_project_id, include_all_projects_progress=include_all_projects_progress)

Retrieves survey progress for the user

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
project_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Project id (optional)
include_first_uncompleted_project_id = false # bool | Include firstUncompletedProjectId field (optional) (default to false)
include_all_projects_progress = false # bool | Include progress for all projects (optional) (default to false)

try:
    # Retrieves survey progress for the user
    api_response = api_instance.get_my_survey_progress(id, project_id=project_id, include_first_uncompleted_project_id=include_first_uncompleted_project_id, include_all_projects_progress=include_all_projects_progress)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->get_my_survey_progress: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 
 **project_id** | [**str**](.md)| Project id | [optional] 
 **include_first_uncompleted_project_id** | **bool**| Include firstUncompletedProjectId field | [optional] [default to false]
 **include_all_projects_progress** | **bool**| Include progress for all projects | [optional] [default to false]

### Return type

[**SurveyProgress**](SurveyProgress.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_my_survey_score_weights**
> ScoreWeights get_my_survey_score_weights(id)

Retrieves user's score weights for a survey.

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id

try:
    # Retrieves user's score weights for a survey.
    api_response = api_instance.get_my_survey_score_weights(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->get_my_survey_score_weights: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 

### Return type

[**ScoreWeights**](ScoreWeights.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_my_surveys**
> Surveys get_my_surveys()

Retrieves surveys across all prioritizations for the user.

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))

try:
    # Retrieves surveys across all prioritizations for the user.
    api_response = api_instance.get_my_surveys()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->get_my_surveys: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Surveys**](Surveys.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_pairwise_vote_comments**
> PairwiseVoteComments get_pairwise_vote_comments(survey_id, dominant_field_id, recessive_field_id)

Retrieves pairwise vote comments

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
survey_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
dominant_field_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Dominant field id
recessive_field_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Recessive field id

try:
    # Retrieves pairwise vote comments
    api_response = api_instance.get_pairwise_vote_comments(survey_id, dominant_field_id, recessive_field_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->get_pairwise_vote_comments: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **survey_id** | [**str**](.md)| Survey id | 
 **dominant_field_id** | [**str**](.md)| Dominant field id | 
 **recessive_field_id** | [**str**](.md)| Recessive field id | 

### Return type

[**PairwiseVoteComments**](PairwiseVoteComments.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_rating_comments**
> RatingComments get_rating_comments(survey_id, project_id=project_id, field_id=field_id)

Retrieves rating comments

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
survey_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
project_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Project id (optional)
field_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Field id (optional)

try:
    # Retrieves rating comments
    api_response = api_instance.get_rating_comments(survey_id, project_id=project_id, field_id=field_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->get_rating_comments: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **survey_id** | [**str**](.md)| Survey id | 
 **project_id** | [**str**](.md)| Project id | [optional] 
 **field_id** | [**str**](.md)| Field id | [optional] 

### Return type

[**RatingComments**](RatingComments.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_survey**
> Survey get_survey(id)

Retrieves a survey.

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id

try:
    # Retrieves a survey.
    api_response = api_instance.get_survey(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->get_survey: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 

### Return type

[**Survey**](Survey.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_survey_attachment**
> SurveyAttachment get_survey_attachment(id, attachment_id)

Get survey attachment by id

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
attachment_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Attachment id

try:
    # Get survey attachment by id
    api_response = api_instance.get_survey_attachment(id, attachment_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->get_survey_attachment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 
 **attachment_id** | [**str**](.md)| Attachment id | 

### Return type

[**SurveyAttachment**](SurveyAttachment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_survey_attachments**
> SurveyAttachments get_survey_attachments(id)

Get attachments for survey

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id

try:
    # Get attachments for survey
    api_response = api_instance.get_survey_attachments(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->get_survey_attachments: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 

### Return type

[**SurveyAttachments**](SurveyAttachments.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_survey_fields**
> PrioritizationFields get_survey_fields(id)

Retrieves survey fields

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id

try:
    # Retrieves survey fields
    api_response = api_instance.get_survey_fields(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->get_survey_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 

### Return type

[**PrioritizationFields**](PrioritizationFields.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_survey_progress**
> SurveyProgress get_survey_progress(id, project_id=project_id)

Retrieves survey progress for all users in a survey

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
project_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Project id (optional)

try:
    # Retrieves survey progress for all users in a survey
    api_response = api_instance.get_survey_progress(id, project_id=project_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->get_survey_progress: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 
 **project_id** | [**str**](.md)| Project id | [optional] 

### Return type

[**SurveyProgress**](SurveyProgress.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_survey_project**
> PrioritizationProject get_survey_project(id, project_id)

Retrieves survey project

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
project_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Project id

try:
    # Retrieves survey project
    api_response = api_instance.get_survey_project(id, project_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->get_survey_project: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 
 **project_id** | [**str**](.md)| Project id | 

### Return type

[**PrioritizationProject**](PrioritizationProject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_survey_projects**
> PrioritizationProjects get_survey_projects(id)

Retrieves survey projects

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id

try:
    # Retrieves survey projects
    api_response = api_instance.get_survey_projects(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->get_survey_projects: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 

### Return type

[**PrioritizationProjects**](PrioritizationProjects.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_survey_reference_fields**
> ReferenceFields get_survey_reference_fields(id)

Retrieves survey reference fields

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id

try:
    # Retrieves survey reference fields
    api_response = api_instance.get_survey_reference_fields(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->get_survey_reference_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 

### Return type

[**ReferenceFields**](ReferenceFields.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_survey_users**
> PrioritizationUsers get_survey_users(id)

Retrieves survey users

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id

try:
    # Retrieves survey users
    api_response = api_instance.get_survey_users(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->get_survey_users: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 

### Return type

[**PrioritizationUsers**](PrioritizationUsers.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_surveys**
> Surveys get_surveys(prioritization_id=prioritization_id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)

Retrieves surveys

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
prioritization_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Prioritization id (optional)
expand = 'expand_example' # str | JSON string containing an array expand specifications. (optional)
limit = 25 # int | Pagination limit (optional) (default to 25)
offset = 0 # int | Pagination offset (optional) (default to 0)
order_by = 'order_by_example' # str | Comma delimited list of order by expressions. Use '-' in front of expression for reverse order. (optional)
match = 'match_example' # str | Comma delimited list of match expressions. (optional)

try:
    # Retrieves surveys
    api_response = api_instance.get_surveys(prioritization_id=prioritization_id, expand=expand, limit=limit, offset=offset, order_by=order_by, match=match)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->get_surveys: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prioritization_id** | [**str**](.md)| Prioritization id | [optional] 
 **expand** | **str**| JSON string containing an array expand specifications. | [optional] 
 **limit** | **int**| Pagination limit | [optional] [default to 25]
 **offset** | **int**| Pagination offset | [optional] [default to 0]
 **order_by** | **str**| Comma delimited list of order by expressions. Use &#x27;-&#x27; in front of expression for reverse order. | [optional] 
 **match** | **str**| Comma delimited list of match expressions. | [optional] 

### Return type

[**Surveys**](Surveys.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_survey_fields**
> remove_survey_fields(id, body=body)

Remove survey fields

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
body = ['body_example'] # list[str] | An array of PrioritizationField ids. (optional)

try:
    # Remove survey fields
    api_instance.remove_survey_fields(id, body=body)
except ApiException as e:
    print("Exception when calling SurveysApi->remove_survey_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 
 **body** | [**list[str]**](str.md)| An array of PrioritizationField ids. | [optional] 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_survey_projects**
> remove_survey_projects(id, body=body)

Remove survey projects

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
body = ['body_example'] # list[str] | An array of PrioritizationProject ids. (optional)

try:
    # Remove survey projects
    api_instance.remove_survey_projects(id, body=body)
except ApiException as e:
    print("Exception when calling SurveysApi->remove_survey_projects: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 
 **body** | [**list[str]**](str.md)| An array of PrioritizationProject ids. | [optional] 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_survey_reference_fields**
> remove_survey_reference_fields(id, body=body)

Remove survey reference fields

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
body = ['body_example'] # list[str] | An array of ReferenceField ids. (optional)

try:
    # Remove survey reference fields
    api_instance.remove_survey_reference_fields(id, body=body)
except ApiException as e:
    print("Exception when calling SurveysApi->remove_survey_reference_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 
 **body** | [**list[str]**](str.md)| An array of ReferenceField ids. | [optional] 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_survey_users**
> remove_survey_users(id, body=body)

Remove survey users

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
body = ['body_example'] # list[str] | An array of PrioritizationUser ids. (optional)

try:
    # Remove survey users
    api_instance.remove_survey_users(id, body=body)
except ApiException as e:
    print("Exception when calling SurveysApi->remove_survey_users: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Survey id | 
 **body** | [**list[str]**](str.md)| An array of PrioritizationUser ids. | [optional] 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_pairwise_vote_comment**
> PairwiseVoteComment update_pairwise_vote_comment(body, survey_id, pairwise_vote_comment_id)

Updated pairwise vote comment

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | Pairwise vote comment update
survey_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
pairwise_vote_comment_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Pairwise vote comment id

try:
    # Updated pairwise vote comment
    api_response = api_instance.update_pairwise_vote_comment(body, survey_id, pairwise_vote_comment_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->update_pairwise_vote_comment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| Pairwise vote comment update | 
 **survey_id** | [**str**](.md)| Survey id | 
 **pairwise_vote_comment_id** | [**str**](.md)| Pairwise vote comment id | 

### Return type

[**PairwiseVoteComment**](PairwiseVoteComment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_rating_comment**
> RatingComment update_rating_comment(body, survey_id, rating_comment_id)

Updated rating comment

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | Rating comment update
survey_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id
rating_comment_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Rating comment id

try:
    # Updated rating comment
    api_response = api_instance.update_rating_comment(body, survey_id, rating_comment_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->update_rating_comment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| Rating comment update | 
 **survey_id** | [**str**](.md)| Survey id | 
 **rating_comment_id** | [**str**](.md)| Rating comment id | 

### Return type

[**RatingComment**](RatingComment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_survey**
> Survey update_survey(body, id, do_not_notify=do_not_notify)

Updates a survey utilizing JSON Patch Operations.

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | JSON Patch Operations to update survey.
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | survey id
do_not_notify = false # bool | Do not notify users (optional) (default to false)

try:
    # Updates a survey utilizing JSON Patch Operations.
    api_response = api_instance.update_survey(body, id, do_not_notify=do_not_notify)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->update_survey: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update survey. | 
 **id** | [**str**](.md)| survey id | 
 **do_not_notify** | **bool**| Do not notify users | [optional] [default to false]

### Return type

[**Survey**](Survey.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_survey_field_values_for_user**
> SurveyProgress update_survey_field_values_for_user(body, id)

Updates survey field values utilizing JSON Patch Operations.

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
body = [dlxapi.FieldValuePatchItem()] # list[FieldValuePatchItem] | JSON Patch Operations to update survey.
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | survey id

try:
    # Updates survey field values utilizing JSON Patch Operations.
    api_response = api_instance.update_survey_field_values_for_user(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->update_survey_field_values_for_user: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[FieldValuePatchItem]**](FieldValuePatchItem.md)| JSON Patch Operations to update survey. | 
 **id** | [**str**](.md)| survey id | 

### Return type

[**SurveyProgress**](SurveyProgress.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_survey_fields**
> list[PrioritizationField] update_survey_fields(body, id)

Updates a survey field utilizing JSON Patch Operations.

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
body = [dlxapi.PatchItem()] # list[PatchItem] | JSON Patch Operations to update survey field.
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | survey id

try:
    # Updates a survey field utilizing JSON Patch Operations.
    api_response = api_instance.update_survey_fields(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->update_survey_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[PatchItem]**](PatchItem.md)| JSON Patch Operations to update survey field. | 
 **id** | [**str**](.md)| survey id | 

### Return type

[**list[PrioritizationField]**](PrioritizationField.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_survey_pairwise_vote_for_user**
> SurveyProgress update_survey_pairwise_vote_for_user(body, id)

Updates survey pairwise vote utilizing JSON Patch Operations.

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
body = [dlxapi.PairwiseVotePatchItem()] # list[PairwiseVotePatchItem] | JSON Patch Operations to update survey.
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | survey id

try:
    # Updates survey pairwise vote utilizing JSON Patch Operations.
    api_response = api_instance.update_survey_pairwise_vote_for_user(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->update_survey_pairwise_vote_for_user: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[PairwiseVotePatchItem]**](PairwiseVotePatchItem.md)| JSON Patch Operations to update survey. | 
 **id** | [**str**](.md)| survey id | 

### Return type

[**SurveyProgress**](SurveyProgress.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_survey_projects**
> list[PrioritizationProject] update_survey_projects(body, id)

Update survey projects

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
body = dlxapi.UpdateSurveyProjectsRequest() # UpdateSurveyProjectsRequest | 
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Survey id

try:
    # Update survey projects
    api_response = api_instance.update_survey_projects(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->update_survey_projects: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateSurveyProjectsRequest**](UpdateSurveyProjectsRequest.md)|  | 
 **id** | [**str**](.md)| Survey id | 

### Return type

[**list[PrioritizationProject]**](PrioritizationProject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_survey_reference_fields**
> list[ReferenceField] update_survey_reference_fields(body, id)

Updates a survey reference field utilizing JSON Patch Operations.

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
body = [dlxapi.PatchItem()] # list[PatchItem] | JSON Patch Operations to update survey reference field.
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | survey id

try:
    # Updates a survey reference field utilizing JSON Patch Operations.
    api_response = api_instance.update_survey_reference_fields(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->update_survey_reference_fields: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**list[PatchItem]**](PatchItem.md)| JSON Patch Operations to update survey reference field. | 
 **id** | [**str**](.md)| survey id | 

### Return type

[**list[ReferenceField]**](ReferenceField.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_surveys**
> Surveys update_surveys(body, survey_type, prioritization_id, do_not_notify=do_not_notify)

Updates all surveys for a prioritization utilizing JSON Patch Operations.

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
api_instance = dlxapi.SurveysApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | JSON Patch Operations to update survey.
survey_type = dlxapi.SurveyType() # SurveyType | Survey type
prioritization_id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | prioritization id
do_not_notify = false # bool | Do not notify users (optional) (default to false)

try:
    # Updates all surveys for a prioritization utilizing JSON Patch Operations.
    api_response = api_instance.update_surveys(body, survey_type, prioritization_id, do_not_notify=do_not_notify)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SurveysApi->update_surveys: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update survey. | 
 **survey_type** | [**SurveyType**](.md)| Survey type | 
 **prioritization_id** | [**str**](.md)| prioritization id | 
 **do_not_notify** | **bool**| Do not notify users | [optional] [default to false]

### Return type

[**Surveys**](Surveys.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

