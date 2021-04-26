# coding: utf-8

"""
    Decision Lens API

    No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)  # noqa: E501

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import dlxapi
from dlxapi.api.user_api import UserApi  # noqa: E501
from dlxapi.rest import ApiException


class TestUserApi(unittest.TestCase):
    """UserApi unit test stubs"""

    def setUp(self):
        self.api = dlxapi.api.user_api.UserApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_user(self):
        """Test case for get_user

        Get user  # noqa: E501
        """
        pass

    def test_get_user_activities(self):
        """Test case for get_user_activities

        Get user activities  # noqa: E501
        """
        pass

    def test_get_user_activities_for_group(self):
        """Test case for get_user_activities_for_group

        Get user activities for group  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()