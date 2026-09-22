# MinifiedProjectChange

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | ProjectChange id | [optional] 
**fid** | **str** | Field index (key into fidx) for the field this change targets | [optional] 
**aid** | **str** | Approval id | [optional] 
**s** | [**ProjectChangeStatus**](ProjectChangeStatus.md) |  | [optional] 
**fv** | [**MinifiedFieldValue**](MinifiedFieldValue.md) |  | [optional] 
**pfv** | [**MinifiedFieldValue**](MinifiedFieldValue.md) |  | [optional] 
**uid** | **str** | User index (key into uidx) for the user who submitted the change | [optional] 
**auid** | **str** | User index (key into uidx) for the approver | [optional] 
**rt** | **str** | Reviewed-at timestamp (ISO-8601, matching ProjectChange.reviewedAt) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

