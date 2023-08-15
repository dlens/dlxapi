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


class MailApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def send_mail(self, mail, **kwargs):  # noqa: E501
        """Send mail  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.send_mail(mail, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Mail mail: mail request (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.send_mail_with_http_info(mail, **kwargs)  # noqa: E501
        else:
            (data) = self.send_mail_with_http_info(mail, **kwargs)  # noqa: E501
            return data

    def send_mail_with_http_info(self, mail, **kwargs):  # noqa: E501
        """Send mail  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.send_mail_with_http_info(mail, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Mail mail: mail request (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['mail']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method send_mail" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'mail' is set
        if ('mail' not in params or
                params['mail'] is None):
            raise ValueError("Missing the required parameter `mail` when calling `send_mail`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'mail' in params:
            body_params = params['mail']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['OAuth2']  # noqa: E501

        return self.api_client.call_api(
            '/mail', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def send_registration_mail(self, mail, **kwargs):  # noqa: E501
        """Send registration mail  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.send_registration_mail(mail, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Mail mail: mail request (required)
        :param str access_token: access token
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.send_registration_mail_with_http_info(mail, **kwargs)  # noqa: E501
        else:
            (data) = self.send_registration_mail_with_http_info(mail, **kwargs)  # noqa: E501
            return data

    def send_registration_mail_with_http_info(self, mail, **kwargs):  # noqa: E501
        """Send registration mail  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.send_registration_mail_with_http_info(mail, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Mail mail: mail request (required)
        :param str access_token: access token
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['mail', 'access_token']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method send_registration_mail" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'mail' is set
        if ('mail' not in params or
                params['mail'] is None):
            raise ValueError("Missing the required parameter `mail` when calling `send_registration_mail`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'access_token' in params:
            query_params.append(('accessToken', params['access_token']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'mail' in params:
            body_params = params['mail']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['OAuth2']  # noqa: E501

        return self.api_client.call_api(
            '/registrationMail', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
