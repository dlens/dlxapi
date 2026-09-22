# dlxapi.ApprovalsApi

All URIs are relative to *https://api-gov.decisionlens.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_approval**](ApprovalsApi.md#create_approval) | **POST** /approvals | Creates a new Approval in a portfolio.
[**delete_approval**](ApprovalsApi.md#delete_approval) | **DELETE** /approvals/{id} | Deletes an Approval.
[**export_approval**](ApprovalsApi.md#export_approval) | **GET** /approvals/{id}/export | Exports an Approval workflow, as a spreadsheet or as a print-ready PDF packet.
[**get_approval**](ApprovalsApi.md#get_approval) | **GET** /approvals/{id} | Retrieves an Approval by id.
[**get_approvals_for_portfolio**](ApprovalsApi.md#get_approvals_for_portfolio) | **GET** /approvals | Retrieves Approvals for a portfolio, ordered by position.
[**get_project_changes_for_approval**](ApprovalsApi.md#get_project_changes_for_approval) | **GET** /approvals/{id}/projectChanges | Retrieves all ProjectChanges for an Approval.
[**get_project_changes_for_portfolio**](ApprovalsApi.md#get_project_changes_for_portfolio) | **GET** /approvals/projectChanges | Retrieves all ProjectChanges for a portfolio.
[**move_project_change**](ApprovalsApi.md#move_project_change) | **POST** /approvals/{id}/projectChanges/{projectChangeId}/move | Moves a ProjectChange (and its project/field siblings) to a different approval workflow.
[**move_project_changes**](ApprovalsApi.md#move_project_changes) | **POST** /approvals/{id}/projectChanges/move | Moves multiple ProjectChanges to a different approval workflow (\&quot;Move all\&quot;).
[**patch_project_changes_for_approval**](ApprovalsApi.md#patch_project_changes_for_approval) | **PATCH** /approvals/{id}/projectChanges | Creates or updates ProjectChanges for an Approval.
[**update_approval**](ApprovalsApi.md#update_approval) | **PATCH** /approvals/{id} | Updates an Approval utilizing JSON Patch Operations.

# **create_approval**
> Approval create_approval(body)

Creates a new Approval in a portfolio.

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
api_instance = dlxapi.ApprovalsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Approval() # Approval | Approval to create. isActive defaults to false.

try:
    # Creates a new Approval in a portfolio.
    api_response = api_instance.create_approval(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApprovalsApi->create_approval: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Approval**](Approval.md)| Approval to create. isActive defaults to false. | 

### Return type

[**Approval**](Approval.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_approval**
> delete_approval(id)

Deletes an Approval.

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
api_instance = dlxapi.ApprovalsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Approval id

try:
    # Deletes an Approval.
    api_instance.delete_approval(id)
except ApiException as e:
    print("Exception when calling ApprovalsApi->delete_approval: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Approval id | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **export_approval**
> str export_approval(id, format=format, time_zone=time_zone)

Exports an Approval workflow, as a spreadsheet or as a print-ready PDF packet.

Returns every project change queued in the workflow — Pending, Approved, Rejected and Moved. XLSX returns the Workflow Report, a row per change. PDF returns the Change Approval Packet: a cover carrying the disposition tally, a contents page, the change register, then one section per project with its changes, approvals history, details and costs.  Portfolio owners and group admins may export at any time; the workflow's assigned approvers once it is open for approving.

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
api_instance = dlxapi.ApprovalsApi(dlxapi.ApiClient(configuration))
id = '38400000-8cf0-11bd-b23e-10b96e4ef00d' # str | Approval id
format = dlxapi.ExportFormatType() # ExportFormatType | The document to produce. XLSX is the Workflow Report; PDF is the Change Approval Packet. Defaults to XLSX. (optional)
time_zone = 'time_zone_example' # str | IANA time zone id (e.g. America/New_York) the submitted/action timestamps are rendered in, so the export reads in the same local time the app shows. Defaults to UTC when omitted or unrecognized. (optional)

try:
    # Exports an Approval workflow, as a spreadsheet or as a print-ready PDF packet.
    api_response = api_instance.export_approval(id, format=format, time_zone=time_zone)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApprovalsApi->export_approval: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| Approval id | 
 **format** | [**ExportFormatType**](.md)| The document to produce. XLSX is the Workflow Report; PDF is the Change Approval Packet. Defaults to XLSX. | [optional] 
 **time_zone** | **str**| IANA time zone id (e.g. America/New_York) the submitted/action timestamps are rendered in, so the export reads in the same local time the app shows. Defaults to UTC when omitted or unrecognized. | [optional] 

### Return type

**str**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/pdf, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_approval**
> Approval get_approval(id)

Retrieves an Approval by id.

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
api_instance = dlxapi.ApprovalsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Approval id

try:
    # Retrieves an Approval by id.
    api_response = api_instance.get_approval(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApprovalsApi->get_approval: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Approval id | 

### Return type

[**Approval**](Approval.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_approvals_for_portfolio**
> Approvals get_approvals_for_portfolio(portfolio_id)

Retrieves Approvals for a portfolio, ordered by position.

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
api_instance = dlxapi.ApprovalsApi(dlxapi.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio id

try:
    # Retrieves Approvals for a portfolio, ordered by position.
    api_response = api_instance.get_approvals_for_portfolio(portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApprovalsApi->get_approvals_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 

### Return type

[**Approvals**](Approvals.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_changes_for_approval**
> ProjectChanges get_project_changes_for_approval(id)

Retrieves all ProjectChanges for an Approval.

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
api_instance = dlxapi.ApprovalsApi(dlxapi.ApiClient(configuration))
id = 'id_example' # str | Approval id

try:
    # Retrieves all ProjectChanges for an Approval.
    api_response = api_instance.get_project_changes_for_approval(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApprovalsApi->get_project_changes_for_approval: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Approval id | 

### Return type

[**ProjectChanges**](ProjectChanges.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_project_changes_for_portfolio**
> ProjectChanges get_project_changes_for_portfolio(portfolio_id, status=status)

Retrieves all ProjectChanges for a portfolio.

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
api_instance = dlxapi.ApprovalsApi(dlxapi.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio id
status = dlxapi.ProjectChangeStatus() # ProjectChangeStatus | Filter by status (PENDING, APPROVED, REJECTED). Returns all statuses when omitted. (optional)

try:
    # Retrieves all ProjectChanges for a portfolio.
    api_response = api_instance.get_project_changes_for_portfolio(portfolio_id, status=status)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApprovalsApi->get_project_changes_for_portfolio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | **str**| Portfolio id | 
 **status** | [**ProjectChangeStatus**](.md)| Filter by status (PENDING, APPROVED, REJECTED). Returns all statuses when omitted. | [optional] 

### Return type

[**ProjectChanges**](ProjectChanges.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **move_project_change**
> ProjectChanges move_project_change(body, id, project_change_id)

Moves a ProjectChange (and its project/field siblings) to a different approval workflow.

Sends the given ProjectChange to targetApprovalId instead of approving/rejecting it. All PENDING changes for the same project and field are moved together. The originating rows are marked MOVED (tombstones linking to the target) and fresh PENDING copies are created under the target workflow. Returns the affected ProjectChanges for both the originating and target workflows. 

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
api_instance = dlxapi.ApprovalsApi(dlxapi.ApiClient(configuration))
body = dlxapi.MoveProjectChangeRequest() # MoveProjectChangeRequest | The target approval workflow to move the change to.
id = 'id_example' # str | Originating approval id
project_change_id = 'project_change_id_example' # str | The ProjectChange being moved

try:
    # Moves a ProjectChange (and its project/field siblings) to a different approval workflow.
    api_response = api_instance.move_project_change(body, id, project_change_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApprovalsApi->move_project_change: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MoveProjectChangeRequest**](MoveProjectChangeRequest.md)| The target approval workflow to move the change to. | 
 **id** | **str**| Originating approval id | 
 **project_change_id** | **str**| The ProjectChange being moved | 

### Return type

[**ProjectChanges**](ProjectChanges.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **move_project_changes**
> ProjectChanges move_project_changes(body, id)

Moves multiple ProjectChanges to a different approval workflow (\"Move all\").

Bulk counterpart of moveProjectChange: sends the given PENDING ProjectChanges — the scope of a project- or workflow-level \"Move all\" — to targetApprovalId instead of approving/rejecting them. All PENDING changes for each affected project and field are moved together. The originating rows are marked MOVED (tombstones linking to the target) and fresh PENDING copies are created under the target workflow. Returns the affected ProjectChanges for both the originating and target workflows. 

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
api_instance = dlxapi.ApprovalsApi(dlxapi.ApiClient(configuration))
body = dlxapi.MoveProjectChangesRequest() # MoveProjectChangesRequest | The target approval workflow and the ProjectChanges to move.
id = 'id_example' # str | Originating approval id

try:
    # Moves multiple ProjectChanges to a different approval workflow (\"Move all\").
    api_response = api_instance.move_project_changes(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApprovalsApi->move_project_changes: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MoveProjectChangesRequest**](MoveProjectChangesRequest.md)| The target approval workflow and the ProjectChanges to move. | 
 **id** | **str**| Originating approval id | 

### Return type

[**ProjectChanges**](ProjectChanges.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_project_changes_for_approval**
> ProjectChanges patch_project_changes_for_approval(body, id)

Creates or updates ProjectChanges for an Approval.

Accepts one Operation per affected ProjectChange id at \"/{id}/status\" to record an approve/reject decision, or at \"/{id}/fieldValues\" to merge new field values.  The value of a \"/{id}/status\" operation is EITHER the bare status string (\"APPROVED\" or \"REJECTED\"), OR a ProjectChangeStatusDecision object — { \"status\": \"APPROVED\", \"note\": \"optional free text\" } — when the approver attached a note. Both shapes are accepted; the bare string is the no-note form. Attach the note HERE rather than posting it afterwards: a note supplied with its decision reaches the activity's search document at index time, so it displays regardless of index timing, which a follow-up POST cannot guarantee for a bulk decision. A blank note is treated as no note. A note over 65,535 bytes fails the whole request before any change is decided.  Editing a note on an already-decided row still goes through POST .../activities/{noteEventId}/notes, using the `noteEventId` this response returns for the affected item — the same activity-notes endpoint the activity log's add/edit-note action uses, so both surfaces edit the identical row. 

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
api_instance = dlxapi.ApprovalsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | JSON Patch Operations to update a ProjectChange.
id = 'id_example' # str | Approval id

try:
    # Creates or updates ProjectChanges for an Approval.
    api_response = api_instance.patch_project_changes_for_approval(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApprovalsApi->patch_project_changes_for_approval: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update a ProjectChange. | 
 **id** | **str**| Approval id | 

### Return type

[**ProjectChanges**](ProjectChanges.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_approval**
> Approval update_approval(body, id, do_not_notify=do_not_notify)

Updates an Approval utilizing JSON Patch Operations.

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
api_instance = dlxapi.ApprovalsApi(dlxapi.ApiClient(configuration))
body = dlxapi.Operations() # Operations | JSON Patch Operations to update Approval.
id = 'id_example' # str | Approval id
do_not_notify = false # bool | When opening an Approval (isOpen false to true), suppress the email notification to approvers. Defaults to notifying. (optional) (default to false)

try:
    # Updates an Approval utilizing JSON Patch Operations.
    api_response = api_instance.update_approval(body, id, do_not_notify=do_not_notify)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApprovalsApi->update_approval: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Operations**](Operations.md)| JSON Patch Operations to update Approval. | 
 **id** | **str**| Approval id | 
 **do_not_notify** | **bool**| When opening an Approval (isOpen false to true), suppress the email notification to approvers. Defaults to notifying. | [optional] [default to false]

### Return type

[**Approval**](Approval.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

