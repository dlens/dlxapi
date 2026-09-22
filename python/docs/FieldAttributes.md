# FieldAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**planning_window** | [**PlanningWindow**](PlanningWindow.md) |  | [optional] 
**time_period** | [**TimePeriod**](TimePeriod.md) |  | [optional] 
**category_display_order** | [**CategoryDisplayOrder**](CategoryDisplayOrder.md) |  | [optional] 
**data_formats** | [**DataFormats**](DataFormats.md) |  | [optional] 
**operator** | [**Operator**](Operator.md) |  | [optional] 
**operands** | [**list[Operand]**](Operand.md) |  | [optional] 
**allow_duplicates** | **bool** |  | [optional] 
**display_type** | [**FieldDisplayType**](FieldDisplayType.md) |  | [optional] 
**global_weight** | **float** | The field&#x27;s global weight (in AHP terms — its local weight multiplied through the parent chain of the prioritization value tree) as applied when scores were saved, per the weight set used at publish time. A snapshot, not the live value — FieldWeight.globalValue is recomputed from the current weight set and may differ if weights changed since the last publish. Enables recovering the unweighted score by dividing the weighted score by this value — except at a weight of 0, meaning the criterion was zeroed out in the weight set, from which the unweighted score is not recoverable, so consumers skip the division and fall back to the weighted score. Server-derived — written by the prioritization publish flow and overwritten on every publish; the valid stored range is [0, 1] and consumers ignore values outside it. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

