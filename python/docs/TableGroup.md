# TableGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique identifier for the table group (UUID) | 
**group_id** | **str** | Tenant/group ID for row-level multi-tenancy | [optional] 
**table_group_number** | **int** | Display number for the table group (per tenant, starts at 1) | 
**name** | **str** | Name of the table group | 
**description** | **str** | Optional description of the table group | [optional] 
**mappings** | **dict(str, str)** | Map of user-friendly keys to table names | 
**source_type** | **str** | Source type for the table group | [optional] 
**source_portfolio_id** | **str** | Source portfolio ID when the table group is portfolio-backed | [optional] 
**source_portfolio_name** | **str** | Source portfolio name when the table group is portfolio-backed | [optional] 
**created_at** | **datetime** | Timestamp when the group was created | 
**updated_at** | **datetime** | Timestamp when the group was last updated | 
**last_refreshed_at** | **datetime** | Timestamp when the group was last refreshed from its source portfolio | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

