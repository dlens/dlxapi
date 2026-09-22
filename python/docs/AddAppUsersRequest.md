# AddAppUsersRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email_ids** | **list[str]** | Email addresses (usernames) to add to the tenant and grant access to the application. | [optional] 
**message** | **str** | Optional message for invitation flows where supported. | [optional] 
**do_not_notify** | **bool** | When true, suppresses registration notification where the underlying user-creation flow allows it. | [optional] 
**role** | **str** | Initial application role for added users (defaults to APP_VIEWER). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

