# Chart

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**name** | **str** |  | 
**source_type** | [**ChartSourceType**](ChartSourceType.md) |  | 
**source_id** | **str** |  | 
**source_name** | **str** | Resolved display name of the chart&#x27;s data source (e.g. the portfolio name). Populated by the list endpoint for the Manage Visualizations page; falls back to the sourceId when the source name cannot be resolved. Read-only — ignored on create/update. | [optional] 
**source_archived** | **bool** | True when the chart&#x27;s data source is archived (a soft-deleted portfolio), so the chart has no data to draw and the client renders an explanatory message instead of a blank canvas. Set only on a POSITIVE archived read: a source that cannot be resolved at all — missing, forbidden, or the portfolio service unreachable — leaves the property ABSENT rather than true, because a false positive would blank a working chart. Populated by the list and by-id endpoints. Read-only — ignored on create/update. | [optional] 
**chart_type** | **str** | WHAT this record is: a &#x60;ChartType&#x60; value (\&quot;COLUMN\&quot;) when it is a plotted chart, or an &#x60;ElementType&#x60; value (\&quot;NUMERIC_TILE\&quot;, \&quot;TEXT\&quot;) when it is a custom element. The two vocabularies share this one field, and readers tell them apart by the value. Deliberately an open string rather than a &#x60;$ref&#x60; to either enum. A generated client closes over the values it was built with, so a service reading a value added after its own build drops it to null and silently loses the record&#x27;s type (POD export/import did exactly that for the first element). Read it case-insensitively: rows written before the enum migration are stored lower case. | 
**axes** | [**AxesConfig**](AxesConfig.md) |  | 
**content** | **dict(str, object)** | What a CONTENT element renders, for the &#x60;ElementType&#x60; values that draw from no source. A chart, and a NUMERIC_TILE, leave it empty — their subject is &#x60;axes&#x60; and the data compute. Server-opaque: stored and returned verbatim, never inspected, and never scanned for field references, because nothing in here names a portfolio field. It is therefore the one part of a chart record that portfolio duplication copies without remapping. Deliberately untyped rather than a &#x60;$ref&#x60; to a per-element schema, for the reason &#x60;chartType&#x60; is an open string: a generated client closes over the shape it was built with, and a client that predates an element would drop the keys it does not know and silently empty the record. The shapes, by &#x60;chartType&#x60; — TEXT &#x60;{markdown}&#x60;, LINK &#x60;{url, label}&#x60;, IMAGE &#x60;{source: \&quot;url\&quot;, url, alt}&#x60;, DIVIDER &#x60;{}&#x60; — match the element vocabulary the dashboards side already persists, which is what lets one renderer serve both surfaces. | [optional] 
**filters** | [**list[FilterConfig]**](FilterConfig.md) |  | [optional] 
**created_by** | **str** |  | [optional] 
**created_at** | **int** | Millisecond timestamp | [optional] 
**updated_at** | **int** | Millisecond timestamp | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

