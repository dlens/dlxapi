# PortfolioCopyResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio_id** | **str** | Destination portfolio ID | 
**projects_copied_count** | **int** | Number of created projects in the destination portfolio (new projects) | 
**projects_synced** | **list[str]** | List of synced project IDs in the destination portfolio (existing projects with updated data) | 
**project_count** | **int** | Total number of projects successfully processed (copied + synced) | 
**success** | **bool** | Whether the operation succeeded for this portfolio | 
**error** | **str** | Error message if the operation failed | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

