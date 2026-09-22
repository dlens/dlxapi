# TaskAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**survey_type** | [**TaskSurveyType**](TaskSurveyType.md) |  | [optional] 
**approval_id** | **str** | Id of the source Approval this task was created from | [optional] 
**survey_id** | **str** | Id of the source Survey this task was created from | [optional] 
**project_change_counts** | **dict(str, int)** | For APPROVAL tasks, ProjectChange counts keyed by status (PENDING, APPROVED, REJECTED, MOVED). Computed at read time; not persisted. | [optional] 
**progress** | [**TaskProgress**](TaskProgress.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

