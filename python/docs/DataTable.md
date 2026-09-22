# DataTable

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**table_name** | **str** | Unique identifier/name for the table | 
**file_name** | **str** | Original uploaded file name | 
**created_at** | **datetime** | Timestamp when the table was uploaded | 
**row_count** | **int** | Number of rows in the table | 
**column_count** | **int** | Number of columns in the table | 
**user_id** | **str** | ID of the user who uploaded the table | [optional] 
**group_id** | **str** | UUID of the domain this table belongs to | [optional] 
**group_name** | **str** | Name of the domain this table belongs to | [optional] 
**source_type** | **str** | Source type distinguishing how the table was created (&#x27;upload&#x27; | &#x27;portfolio&#x27; | &#x27;connector&#x27;) | [optional] 
**source_connector_id** | **str** | Connector this table was created from (sourceType&#x3D;connector) | [optional] 
**source_connector_name** | **str** | Connector name for the \&quot;connector · source\&quot; label | [optional] 
**source_label** | **str** | Human-readable source label (e.g. the saved-filter name) for the source display | [optional] 
**source_portfolio_id** | **str** | DLX portfolio ID this table was created from | [optional] 
**source_portfolio_name** | **str** | Human-readable portfolio name at time of creation | [optional] 
**last_refreshed_at** | **datetime** | Timestamp of when the table data was last refreshed from the portfolio source | [optional] 
**table_display_name** | **str** | User-defined display name for the table. When multiple tables are created from the same portfolio, the sheet name is appended; e.g. myTableName_scoresheet. Resolved for uniqueness if collisions occur. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

