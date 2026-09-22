# ProjectChangeDeletedEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**portfolio_id** | **str** |  | [optional] 
**portfolio_plan** | [**PortfolioPlan**](PortfolioPlan.md) |  | [optional] 
**project_id** | **str** |  | [optional] 
**project_name** | **str** | Snapshot of the project name at event time so the activity log remains readable after the project is deleted. | [optional] 
**approval_id** | **str** |  | [optional] 
**user_id** | **str** |  | [optional] 
**field_id** | **str** |  | [optional] 
**field_name** | **str** | Snapshot of the field name at event time so the activity log remains readable after the field is deleted. | [optional] 
**status** | [**ProjectChangeStatus**](ProjectChangeStatus.md) |  | [optional] 
**field_values** | [**list[FieldValue]**](FieldValue.md) |  | [optional] 
**previous_field_values** | [**list[FieldValue]**](FieldValue.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

