# UploadResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**success** | **bool** | Whether the upload was successful | 
**table_name** | **str** | Generated table name | 
**row_count** | **int** | Number of rows parsed from the file | 
**column_count** | **int** | Number of columns parsed from the file | 
**table_display_name** | **str** | User-friendly display name (resolved for uniqueness) | 
**source_type** | **str** | Source type distinguishing how the table was created (&#x27;upload&#x27; | &#x27;portfolio&#x27;) | [optional] 
**message** | **str** | Human-readable message about the upload | 
**tables** | [**list[UploadResultSheet]**](UploadResultSheet.md) | Present when an XLSX upload created more than one table (one per non-empty sheet). Omitted for CSV, JSON, Parquet, or single-sheet XLSX uploads. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

