# DataFile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique identifier of the file; always present on Data Hub file endpoints | 
**name** | **str** | Display name of the file | 
**mime_type** | **str** | MIME type derived from the file extension; null when the extension is unrecognized | [optional] 
**file_extension** | **str** | Lower-cased file extension without the leading dot (e.g. \&quot;pdf\&quot;) | 
**size_bytes** | **int** | Size of the stored object in bytes | 
**uploaded_by** | [**User**](User.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

