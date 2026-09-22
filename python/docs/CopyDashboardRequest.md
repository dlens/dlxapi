# CopyDashboardRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Unique among the creator&#x27;s own dashboards within the tenant. Trimmed server-side before it is measured and before the uniqueness check, so surrounding whitespace is not part of the value and a 255-character name padded with spaces is accepted. No &#x60;maxLength&#x60; here on purpose: the limit (255) applies to the TRIMMED value, and a generated client validating the raw string would reject padded input the server accepts. | 
**description** | **str** | Trimmed server-side before it is measured; the limit (1024) applies to the trimmed value, so &#x60;maxLength&#x60; is omitted for the same reason as &#x60;name&#x60;. &#x60;null&#x60; and omission both mean \&quot;no description\&quot; and clear the field. | [optional] 
**content** | **dict(str, object)** | The layout to save into the copy — the same opaque shape as Dashboard.content. Sent in full, and &#x60;orientation&#x60; must be included: content is persisted as a whole-object replace, so omitting it lands the copy as PORTRAIT regardless of the source. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

