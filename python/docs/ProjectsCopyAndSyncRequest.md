# ProjectsCopyAndSyncRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapping_id** | **str** | ID for the portfolio relationship mapping configuration to use during project copy and sync | 
**portfolio1_id** | **str** | First portfolio ID in the mapping relationship | 
**portfolio2_id** | **str** | Second portfolio ID in the mapping relationship | 
**projects_copy_to_portfolio1** | **list[str]** | List of project IDs to copy from portfolio2 to portfolio1 | 
**projects_copy_to_portfolio2** | **list[str]** | List of project IDs to copy from portfolio1 to portfolio2 | 
**field_ids** | **list[str]** | Optional list of field IDs from the source portfolio to copy. If not provided, all mapped fields will be copied. | [optional] 
**save_snapshot_for_portfolio1** | **bool** | If true, a snapshot is saved on portfolio1 before any data is copied/synced into it. | [optional] [default to False]
**save_snapshot_for_portfolio2** | **bool** | If true, a snapshot is saved on portfolio2 before any data is copied/synced into it. | [optional] [default to False]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

