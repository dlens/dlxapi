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
from dlxapi.api.activities_api import ActivitiesApi  # noqa: E501
from dlxapi.rest import ApiException


class TestActivitiesApi(unittest.TestCase):
    """ActivitiesApi unit test stubs"""

    def setUp(self):
        self.api = dlxapi.api.activities_api.ActivitiesApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_reindex_activities(self):
        """Test case for reindex_activities

        Reindex activities. System Administator operation.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
