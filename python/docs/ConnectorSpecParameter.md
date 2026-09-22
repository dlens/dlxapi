# ConnectorSpecParameter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Parameter key within parameterValues | 
**label** | **str** | Human-readable form label | 
**scope** | **str** | &#x27;connector&#x27; (shared config + credentials) | &#x27;connection&#x27; (per-pull specifics) | &#x27;runtime&#x27; (per-execution values) | 
**type** | **str** | &#x27;string&#x27; | &#x27;boolean&#x27; | &#x27;secret&#x27; | &#x27;url&#x27; | &#x27;enum&#x27; | 
**required** | **bool** |  | 
**options** | [**list[DiscoveredOption]**](DiscoveredOption.md) | Static options (enum) | [optional] 
**options_from** | [**ConnectorSpecParameterOptionsFrom**](ConnectorSpecParameterOptionsFrom.md) |  | [optional] 
**actions** | [**list[ConnectorSpecParameterActions]**](ConnectorSpecParameterActions.md) | Parameter-level server round-trips exposed as POST /connectors/{id}/actions/{name} | [optional] 
**ui** | [**ConnectorSpecParameterUi**](ConnectorSpecParameterUi.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

