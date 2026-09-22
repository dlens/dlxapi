# CopyPrioritizationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**copy_fields** | **bool** | Whether to copy fields from the source prioritization. Defaults to false. | [optional] 
**copy_priority_surveys** | **bool** | Whether to copy priority surveys from the source prioritization. Defaults to false. | [optional] 
**copy_priority_survey_voters** | **bool** | Whether to copy priority survey voters (raters) from the source prioritization. Defaults to false. | [optional] 
**copy_priority_survey_votes** | **bool** | Whether to copy priority survey votes (pairwise comparisons) from the source prioritization. Defaults to false. | [optional] 
**copy_rating_surveys** | **bool** | Whether to copy rating surveys (Group Ratings) from the source prioritization. Defaults to false. | [optional] 
**copy_rating_survey_voters** | **bool** | Whether to copy rating survey voters (Group Raters) from the source prioritization. When true, includes all Raters. Defaults to false. | [optional] 
**copy_rating_survey_votes** | **bool** | Whether to copy rating survey votes (rating data and comments) from the source prioritization. When true, includes all rating values and comments. Defaults to false. | [optional] 
**to_portfolio_id** | **str** | Optional target portfolio ID for cross-portfolio copy. When provided, portfolioContext is required. | [optional] 
**portfolio_context** | **dict(str, str)** | Mapping of source portfolio IDs to target portfolio IDs. Required when toPortfolioId is provided. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

