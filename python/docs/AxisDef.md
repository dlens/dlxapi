# AxisDef

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**table_id** | **str** | ID of the source table | 
**column_id** | **str** | ID of the column within the table | 
**aggregation** | [**AxisAggregation**](AxisAggregation.md) |  | [optional] 
**label** | **str** | Optional display label for this axis | [optional] 
**colors** | [**list[ChartCategoryColor]**](ChartCategoryColor.md) | Per-category colour overrides (x or groupBy axis), chart-scoped. Presentation-only; stored and returned verbatim by the chart service, not interpreted server-side. | [optional] 
**default_color** | **str** | x-axis only: single fallback colour applied to every category without its own override. Presentation-only; round-trips unchanged. | [optional] 
**sort_categories** | **bool** | x-axis only: sort the rendered categories alphabetically (omitted &#x3D;&#x3D;&#x3D; true). Presentation-only. | [optional] 
**stacked** | **bool** | groupBy-axis only: true stacks the group series into one bar per category; false/absent renders them grouped side-by-side. Presentation-only; round-trips unchanged. | [optional] 
**scope** | **str** | y-axis only: which projects the measure aggregates. Absent &#x3D;&#x3D;&#x3D; every project in the plan, which is what every measure did before this existed and what every already-saved chart and tile keeps doing. &#x27;funded&#x27; restricts it to projects whose current status is funded — the population plan-service reports for a numeric field&#x27;s summary figure (\&quot;Funded Total\&quot; / \&quot;Funded Avg\&quot;). Unlike the presentation-only siblings above this one IS interpreted server-side, but only on the measure-only (numeric tile) path; a dimensioned chart&#x27;s buckets are never narrowed by it. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

