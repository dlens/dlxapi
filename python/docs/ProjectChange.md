# ProjectChange

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio_id** | **str** |  | [optional] 
**project_id** | **str** |  | [optional] 
**approval_id** | **str** |  | [optional] 
**field_id** | **str** | The field this change applies to. | [optional] 
**status** | [**ProjectChangeStatus**](ProjectChangeStatus.md) |  | [optional] 
**field_values** | [**list[FieldValue]**](FieldValue.md) | The new field values awaiting approval. | [optional] 
**previous_field_values** | [**list[FieldValue]**](FieldValue.md) | The previous field values before the change was queued. | [optional] 
**user_id** | **str** | User who submitted the project change. | [optional] 
**approver_user_id** | **str** | User who approved or rejected the project change. | [optional] 
**moved_to_approval_id** | **str** | When status is MOVED, the id of the approval workflow this change was sent to. The row remains a tombstone under approvalId (the originating workflow) while a fresh PENDING copy lives under this workflow.  | [optional] 
**advanced_to_approval_id** | **str** | Read-only. For a multistage workflow, the follow-on workflow this change advanced to when it was APPROVED: the row stays under approvalId as the record of that stage&#x27;s sign-off while a fresh PENDING copy awaits the next one. Resolved at read time from the copy that points back via advancedFromProjectChangeId — the one stored link carries both directions — so it is never stored and cannot outlive the copy it names. Absent once that copy is gone (a re-edit sent the change back to the start of the chain, or the follow-on was deleted). Unlike movedToApprovalId, which a move persists because routing consults it, nothing but display reads this.  | [optional] 
**advanced_from_project_change_id** | **str** | The id of the earlier-stage ProjectChange this row was created from when that stage was approved. The back-pointer that makes priorStage resolvable; a chain of stages is walked one hop at a time through it.  | [optional] 
**prior_stage** | [**ProjectChangePriorStage**](ProjectChangePriorStage.md) |  | [optional] 
**reviewed_at** | **str** | Timestamp when the project change was reviewed. | [optional] 
**note_event_id** | **str** | Event-store id of the activity this change&#x27;s decision created — the approve/reject event on a patch, the Moved event on a move — usable as the activityId for posting a follow-up note (POST .../activities/{activityId}/notes). Also returned on reads for any change already resolved to APPROVED, REJECTED or MOVED, so a note can still be added to a decision made in an earlier session. Absent on a PENDING change (no decision activity exists yet), and absent on a resolved change whose decision was recorded before its event carried projectChangeId (needs a reindex to resolve). When the change already has a note, this is the id of the activity THAT NOTE lives on rather than the decision&#x27;s — a note added while the change was still pending sits on its Created/Updated event, and editing through the decision instead would write a second note row and shadow the first.  | [optional] 
**note** | **str** | The Approval Action Note recorded against this change — the note supplied with its approve/reject/move decision, or one added afterwards (or beforehand, from project details) through POST .../activities/{activityId}/notes. Absent when the change has no note. Read from the durable note store, so it is neither capped nor subject to search-index lag. Returned on the approval-scoped reads and on the decision responses.  | [optional] 
**attachment_ids** | **list[str]** | Ids of the attachments recorded with this change&#x27;s note, in the order they were added. Fetch each one through the attachment endpoints — the note store keeps only ids. Empty when the note has no attachments; a note can consist of attachments alone, in which case note is absent and this is not.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

