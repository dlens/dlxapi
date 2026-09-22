# Connector

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Connector ID | [optional] 
**group_id** | **str** | UUID of the domain this connector belongs to | [optional] 
**name** | **str** | Connector name, unique within the domain | 
**spec_name** | **str** | Connector type (ConnectorSpec name) | 
**spec_version** | **int** | Spec version the stored parameter values were written against | [optional] 
**parameter_values** | **dict(str, object)** | Connector-scoped parameter values keyed by the spec (e.g. instanceUrl, authEmail, apiToken for Jira). Secret values are write-only — encrypted at rest and structurally excluded from responses. | 
**last_synced_at** | **datetime** | When the connector was last synced (\&quot;Synced 2h ago\&quot; display) | [optional] 
**last_sync_status** | **str** | Outcome of the last connector-level sync (&#x27;success&#x27; | &#x27;partial&#x27; | &#x27;failed&#x27;) | [optional] 
**table_count** | **int** | Number of tables this connector powers | [optional] 
**connections** | [**list[Connection]**](Connection.md) | Connections (pulls) this connector powers | [optional] 
**created_at** | **datetime** |  | [optional] 
**updated_at** | **datetime** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

