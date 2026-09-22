# MultiPortfolioCopyAndSyncRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_portfolio_id** | **str** | Source portfolio ID to copy/sync projects from | 
**project_ids** | **list[str]** | List of project IDs to process across all destination portfolios. The API will automatically determine which to copy vs sync for each destination. | 
**destination_portfolio_mappings** | [**list[MultiPortfolioCopyAndSyncRequestDestinationPortfolioMappings]**](MultiPortfolioCopyAndSyncRequestDestinationPortfolioMappings.md) | Destination portfolio mappings. Each destination can use a different mapping configuration. | 
**field_ids** | **list[str]** | Optional list of field IDs from the source portfolio to copy/sync. If not provided, all mapped fields will be copied/synced. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

