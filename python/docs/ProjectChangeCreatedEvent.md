# ProjectChangeCreatedEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**portfolio_id** | **str** |  | [optional] 
**portfolio_plan** | [**PortfolioPlan**](PortfolioPlan.md) |  | [optional] 
**project_id** | **str** |  | [optional] 
**project_change_id** | **str** | Id of the ProjectChange row this event was raised for. &#x60;id&#x60; carries the projectId (event-store convention), so this is the only exact link from a note-bearing pending-change activity back to its own change row — lets the Approvals page show a note added while the change is still PENDING. Absent on events recorded before this field was added.  | [optional] 
**project_name** | **str** | Snapshot of the project name at event time so the activity log remains readable after the project is deleted. | [optional] 
**approval_id** | **str** |  | [optional] 
**user_id** | **str** |  | [optional] 
**field_id** | **str** |  | [optional] 
**field_name** | **str** | Snapshot of the field name at event time so the activity log remains readable after the field is deleted. | [optional] 
**status** | [**ProjectChangeStatus**](ProjectChangeStatus.md) |  | [optional] 
**field_values** | [**list[FieldValue]**](FieldValue.md) |  | [optional] 
**previous_field_values** | [**list[FieldValue]**](FieldValue.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

