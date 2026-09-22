# ChartColumn

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**label** | **str** |  | 
**type** | [**ChartColumnType**](ChartColumnType.md) |  | 
**aggregatable** | **bool** |  | 
**default_aggregation** | **AllOfChartColumnDefaultAggregation** | For aggregatable (numeric) columns, the aggregation the chart builder should default to. Prioritization score measures (Value Score, Group/per-survey Scores) default to AVG; other numeric fields derive from the field&#x27;s calculationType (SUM-&gt;SUM, AVERAGE-&gt;AVG). Numeric fields whose calculationType is NONE are omitted from the structure entirely and never appear here. | [optional] 
**data_type** | **AllOfChartColumnDataType** | The portfolio field&#x27;s underlying data type, echoed so the builder can distinguish a CATEGORY dimension from a NUMERIC measure. Present on portfolio-sourced columns; omitted for built-ins (name/status). | [optional] 
**category_options** | [**list[ChartCategoryOption]**](ChartCategoryOption.md) | For CATEGORY dimension columns, the selectable option values. For a Value Score dimension this is the fixed Likert banding (very-low ... very-high). | [optional] 
**value_format** | **AllOfChartColumnValueFormat** | For aggregatable (measure) columns, the backing field&#x27;s Display Settings, so a measure reads the same on a chart axis or a Numeric Tile as it does in a portfolio table (DL4-34750). Omitted when the column is not a measure or the field configures no format. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

