# ProjectChangeRejectedEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**portfolio_id** | **str** |  | [optional] 
**portfolio_plan** | [**PortfolioPlan**](PortfolioPlan.md) |  | [optional] 
**project_id** | **str** |  | [optional] 
**project_change_id** | **str** | Id of the ProjectChange row this decision resolved. See ProjectChangeApprovedEvent.projectChangeId.  | [optional] 
**project_name** | **str** | Snapshot of the project name at event time so the activity log remains readable after the project is deleted. | [optional] 
**approval_id** | **str** |  | [optional] 
**approver_user_id** | **str** |  | [optional] 
**field_id** | **str** |  | [optional] 
**field_name** | **str** | Snapshot of the field name at event time so the activity log remains readable after the field is deleted. | [optional] 
**field_values** | [**list[FieldValue]**](FieldValue.md) | The field values that were rejected. | [optional] 
**previous_field_values** | [**list[FieldValue]**](FieldValue.md) | The field values that existed before the rejected change. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

