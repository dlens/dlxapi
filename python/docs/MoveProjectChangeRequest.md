# MoveProjectChangeRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**target_approval_id** | **str** | The approval workflow to move the change (and its project/field siblings) to. | 
**note** | **str** | Optional free-text note recorded against the Moved activity this request creates. Blank is treated as no note. Maximum 65,535 bytes.  | [optional] 
**attachment_ids** | **list[str]** | Ids of attachments to record with this move&#x27;s note, already uploaded through the attachment endpoints. A move may carry attachments with no note text at all, in which case note is absent and this is not.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

