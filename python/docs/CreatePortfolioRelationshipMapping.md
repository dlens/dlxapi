# CreatePortfolioRelationshipMapping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Unique name for the portfolio relationship mapping | 
**hub_portfolio** | **str** | Hub portfolio ID (central portfolio) | 
**spoke_portfolios** | **list[str]** | Array of spoke portfolio IDs (portfolios that connect to the hub) | 
**project_ids_to_map** | **list[str]** | Optional parameter for auto-generating project associations. If omitted or null, creates blank mappings. | [optional] 
**mapping_field_name** | **str** | Optional field name to use for mapping instead of project name. Field must be TEXT type with unique values. If not provided, defaults to project name mapping. | [optional] 
**direction** | [**PortfolioRelationshipDirection**](PortfolioRelationshipDirection.md) |  | [optional] 
**source** | [**ConnectionSource**](ConnectionSource.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

