# Dashboard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**name** | **str** | Unique among the creator&#x27;s own dashboards within the tenant | 
**description** | **str** |  | [optional] 
**created_by** | **str** | Id of the user who created the dashboard. Read-only. | 
**created_at** | **str** | Creation time in epoch milliseconds, serialized as a string (e.g. \&quot;1781084949103\&quot;). The column is a BIGINT and the MySQL driver returns BIGINTs as strings, so the wire value is a string, not a number. | 
**updated_at** | **str** | Last-update time in epoch milliseconds, serialized as a string for the same reason as createdAt. | 
**content** | **dict(str, object)** | Opaque dashboard layout payload — the grid of placed charts (DL4-34455). Its shape is owned by the client and echoed back verbatim (no server schema). Empty ({}) on a shell dashboard with no layout saved yet. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

