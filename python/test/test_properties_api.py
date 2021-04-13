# coding: utf-8

"""
    Decision Lens API

    No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)  # noqa: E501

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import swagger_client
from swagger_client.api.properties_api import PropertiesApi  # noqa: E501
from swagger_client.rest import ApiException


class TestPropertiesApi(unittest.TestCase):
    """PropertiesApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.properties_api.PropertiesApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_properties(self):
        """Test case for get_properties

        Get configuration properties for user if userId and groupId are present, otherwise properties for authenticated user will be returned  # noqa: E501
        """
        pass

    def test_set_properties(self):
        """Test case for set_properties

        Set configuration properties  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
