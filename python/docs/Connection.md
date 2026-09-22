# Connection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**connector_id** | **str** |  | [optional] 
**app_id** | **str** | Application whose App Tables receive the materialized table | 
**parameter_values** | **dict(str, object)** | Connection-scoped parameter values keyed by the spec, including captured display labels (e.g. filterLabel) | 
**sink** | [**ConnectionSink**](ConnectionSink.md) |  | [optional] 
**source_label** | **str** | Human-readable source label captured at validate time (for the \&quot;connector · source\&quot; display) | [optional] 
**last_refreshed_at** | **datetime** |  | [optional] 
**last_refresh_status** | **str** | &#x27;success&#x27; | &#x27;failed&#x27; — denormalized from the latest execution | [optional] 
**last_refresh_message** | **str** |  | [optional] 
**table** | [**DataTable**](DataTable.md) |  | [optional] 
**created_at** | **datetime** |  | [optional] 
**updated_at** | **datetime** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

