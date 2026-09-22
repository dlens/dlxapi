# ProjectChangeApprovedEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**portfolio_id** | **str** |  | [optional] 
**portfolio_plan** | [**PortfolioPlan**](PortfolioPlan.md) |  | [optional] 
**project_id** | **str** |  | [optional] 
**project_change_id** | **str** | Id of the ProjectChange row this decision resolved. &#x60;id&#x60; carries the projectId (event-store convention), so this is the only exact link from a note-bearing decision activity back to its own change row — the Approvals page uses it to show a row&#x27;s own note. Absent on events recorded before this field was added.  | [optional] 
**project_name** | **str** | Snapshot of the project name at event time so the activity log remains readable after the project is deleted. | [optional] 
**approval_id** | **str** |  | [optional] 
**approver_user_id** | **str** |  | [optional] 
**field_id** | **str** |  | [optional] 
**field_name** | **str** | Snapshot of the field name at event time so the activity log remains readable after the field is deleted. | [optional] 
**field_values** | [**list[FieldValue]**](FieldValue.md) | The field values that were approved and applied. | [optional] 
**previous_field_values** | [**list[FieldValue]**](FieldValue.md) | The field values that existed before the approval. | [optional] 
**advanced_to_approval_name** | **str** | Name of the follow-on workflow this approval handed the change to, present only when it did — a multistage sign-off that did not end the review. The activity log appends \&quot;sent to {name}\&quot; so the entry cannot be read as a final decision. A name snapshot rather than an id for the same reason as projectName and fieldName: the log must stay readable after the workflow is renamed or deleted, and the activity page holds no approvals to resolve an id against.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

