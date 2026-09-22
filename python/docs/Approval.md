# Approval

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio_id** | **str** |  | [optional] 
**name** | **str** | Approval name, unique within a portfolio | [optional] 
**description** | **str** |  | [optional] 
**is_active** | **bool** | When false, the approval is not evaluated. Defaults to false on create. | [optional] 
**is_open** | **bool** | Indicates whether queued edits are available for the assigned approvers to make approve/reject decisions | [optional] 
**position** | **int** | Read-only. Zero-based precedence order of this workflow within its portfolio, derived from the portfolio&#x27;s precedence order list. When a project change matches more than one active workflow, the lower position wins. A new workflow is appended last on create; reorder by PATCHing an individual workflow with a /position operation carrying its new index (only the moved workflow is sent, mirroring field / cost-type reorder). | [optional] 
**approver_user_ids** | **list[str]** | Users who must approve | [optional] 
**approver_emails** | **list[str]** | External approver email addresses (not yet instance users). Each is resolved to an existing instance user or invited, then folded into approverUserIds server-side. Write-only on create/update; never returned. | [optional] 
**selectors** | [**list[ApprovalSelector]**](ApprovalSelector.md) | Selectors evaluated to determine if this approval applies. Match semantics is OR across selectors. | [optional] 
**next_approval_id** | **str** | Follow-on workflow for a multistage approval. When set, approving a ProjectChange in this workflow does not end its review: the decided row is kept as the stage record and a fresh PENDING copy is created under this workflow for the next sign-off. Reject and move are unaffected — only an approval advances. Null means this is the only (or last) stage; a workflow \&quot;is multistage\&quot; exactly when this is set. The target must belong to the same portfolio and must not close a cycle back to this workflow.  | [optional] 
**project_change_counts** | **dict(str, int)** | Count of associated ProjectChange records keyed by ProjectChangeStatus (PENDING, APPROVED, REJECTED, MOVED). Only populated on GET endpoints; absent on create/update responses. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

