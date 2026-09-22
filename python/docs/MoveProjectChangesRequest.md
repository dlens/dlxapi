# MoveProjectChangesRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**target_approval_id** | **str** | The approval workflow to move the changes (and their project/field siblings) to. | 
**project_change_ids** | **list[str]** | The PENDING ProjectChanges under the originating approval to move — the scope of a project- or workflow-level \&quot;Move all\&quot;.  | 
**note** | **str** | Optional free-text note recorded against every Moved activity this request creates — one per moved row, all carrying the same note. Blank is treated as no note. Maximum 65,535 bytes.  | [optional] 
**attachment_ids** | **list[str]** | Ids of attachments to record with this move&#x27;s note, on every moved row&#x27;s Moved activity — the same attachments as the same note. A move may carry attachments with no note text.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

