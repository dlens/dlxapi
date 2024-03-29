# coding: utf-8

"""
    Decision Lens API

    No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)  # noqa: E501

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from swagger_client.api_client import ApiClient


class MappingsApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def spreadsheet_to_mappings(self, file, **kwargs):  # noqa: E501
        """Accepts upload of spreadsheet and converts data into mappings.  # noqa: E501

        Maps the fields in the spreadsheet to appropriate buckets  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.spreadsheet_to_mappings(file, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param file file: maybe put supported file types here? (required)
        :param bool columns_only: return columns only the case for cost import
        :return: Mappings
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.spreadsheet_to_mappings_with_http_info(file, **kwargs)  # noqa: E501
        else:
            (data) = self.spreadsheet_to_mappings_with_http_info(file, **kwargs)  # noqa: E501
            return data

    def spreadsheet_to_mappings_with_http_info(self, file, **kwargs):  # noqa: E501
        """Accepts upload of spreadsheet and converts data into mappings.  # noqa: E501

        Maps the fields in the spreadsheet to appropriate buckets  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.spreadsheet_to_mappings_with_http_info(file, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param file file: maybe put supported file types here? (required)
        :param bool columns_only: return columns only the case for cost import
        :return: Mappings
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['file', 'columns_only']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method spreadsheet_to_mappings" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'file' is set
        if ('file' not in params or
                params['file'] is None):
            raise ValueError("Missing the required parameter `file` when calling `spreadsheet_to_mappings`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'columns_only' in params:
            query_params.append(('columnsOnly', params['columns_only']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}
        if 'file' in params:
            local_var_files['file'] = params['file']  # noqa: E501

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['multipart/form-data'])  # noqa: E501

        # Authentication setting
        auth_settings = ['OAuth2']  # noqa: E501

        return self.api_client.call_api(
            '/mappings/spreadsheet', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Mappings',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def update_mapping(self, id, body, **kwargs):  # noqa: E501
        """Update mapping  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_mapping(id, body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Mapping id (required)
        :param Operations body: JSON Patch Operations to update mapping. (required)
        :param str expand: JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
        :return: list[Mapping]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.update_mapping_with_http_info(id, body, **kwargs)  # noqa: E501
        else:
            (data) = self.update_mapping_with_http_info(id, body, **kwargs)  # noqa: E501
            return data

    def update_mapping_with_http_info(self, id, body, **kwargs):  # noqa: E501
        """Update mapping  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_mapping_with_http_info(id, body, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str id: Mapping id (required)
        :param Operations body: JSON Patch Operations to update mapping. (required)
        :param str expand: JSON string containing an array expand specifications for fields.  An expand specification must have a path and includes optional properties match, unique, allPossible, limit, offset, orderBy.
        :return: list[Mapping]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['id', 'body', 'expand']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method update_mapping" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `update_mapping`")  # noqa: E501
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `update_mapping`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in params:
            path_params['id'] = params['id']  # noqa: E501

        query_params = []
        if 'expand' in params:
            query_params.append(('expand', params['expand']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json-patch+json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['OAuth2']  # noqa: E501

        return self.api_client.call_api(
            '/mappings/{id}', 'PATCH',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[Mapping]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
