# UpdatePortfolioRelationshipMapping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Unique name for the portfolio relationship mapping | 
**hub_portfolio** | **str** | Hub portfolio ID (central portfolio) | 
**spoke_portfolios** | **list[str]** | Array of spoke portfolio IDs (portfolios that connect to the hub) | 
**project_ids_to_map** | **list[str]** | Optional parameter for updating project associations. If null, maps all matching projects. If empty array, clears mappings. | [optional] 
**mapping_field_name** | **str** | Optional field name to use for mapping instead of project name. Field must be TEXT type with unique values. If not provided, defaults to project name mapping. | [optional] 
**direction** | [**PortfolioRelationshipDirection**](PortfolioRelationshipDirection.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

