# PortfolioRelationshipMapping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_enabled** | **bool** | Indicates whether the mapping is enabled | [optional] [default to True]
**id** | **str** | Unique identifier for the portfolio relationship mapping | 
**name** | **str** | Unique name for the portfolio relationship mapping | 
**hub_portfolio_id** | **str** | Hub portfolio ID (central portfolio) | 
**spoke_portfolio_ids** | **list[str]** | Array of spoke portfolio IDs (portfolios that connect to the hub) | 
**direction** | [**PortfolioRelationshipDirection**](PortfolioRelationshipDirection.md) |  | [optional] 
**source** | [**ConnectionSource**](ConnectionSource.md) |  | [optional] 
**portfolio_data_id_mappings** | [**PortfolioRelationshipMappingPortfolioDataIdMappings**](PortfolioRelationshipMappingPortfolioDataIdMappings.md) |  | 
**created_at** | **int** | Timestamp when the mapping was created (epoch milliseconds) | 
**updated_at** | **int** | Timestamp when the mapping was last updated (epoch milliseconds) | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

