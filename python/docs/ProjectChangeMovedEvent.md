# ProjectChangeMovedEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**portfolio_id** | **str** |  | [optional] 
**portfolio_plan** | [**PortfolioPlan**](PortfolioPlan.md) |  | [optional] 
**project_id** | **str** |  | [optional] 
**project_change_id** | **str** | Id of the ProjectChange row (the MOVED tombstone) this move was raised for. See ProjectChangeApprovedEvent.projectChangeId — same exact-link rationale, and this event&#x27;s own id (returned to the caller as ProjectChange.noteEventId) is the note-attachable activity for the move, following the same POST .../activities/{activityId}/notes flow as approve/reject.  | [optional] 
**project_name** | **str** | Snapshot of the project name at event time so the activity log remains readable after the project is deleted. | [optional] 
**approval_id** | **str** | The originating approval the change was moved from. | [optional] 
**target_approval_id** | **str** | The approval the change was moved to. | [optional] 
**field_id** | **str** |  | [optional] 
**field_name** | **str** | Snapshot of the field name at event time so the activity log remains readable after the field is deleted. | [optional] 
**field_values** | [**list[FieldValue]**](FieldValue.md) | The field values on the moved change. | [optional] 
**previous_field_values** | [**list[FieldValue]**](FieldValue.md) | The field values that existed before the moved change. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

