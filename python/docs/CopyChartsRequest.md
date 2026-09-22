# CopyChartsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_type** | [**ChartSourceType**](ChartSourceType.md) |  | 
**from_source_id** | **str** | Source id whose charts should be copied (e.g. the source portfolio id) | 
**target_type** | [**ChartSourceType**](ChartSourceType.md) |  | [optional] 
**to_source_id** | **str** | Target id the copied charts should point at (e.g. the new portfolio id or snapshot id) | 
**field_id_mapping** | **dict(str, str)** | Mapping of source field ids to target field ids. Column ids inside axes/filters that match a key are rewritten to the mapped value; unmapped column ids are left unchanged. Only applied when remapFieldReferences is true. | [optional] 
**remap_field_references** | **bool** | When true (default, portfolio duplication / create-from-snapshot), field references inside axes/filters are remapped via fieldIdMapping and charts whose field references are unmapped are skipped. When false (snapshot capture / restore-in-place, where field ids are unchanged), charts are copied verbatim and never skipped. | [optional] [default to True]
**replace_target_charts** | **bool** | When true, existing charts of the target (targetType/toSourceId) are deleted before the copy so the target ends up with exactly the source&#x27;s charts. Used for restore-in-place. Defaults to false. | [optional] [default to False]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

