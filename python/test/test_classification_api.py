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
from swagger_client.api.classification_api import ClassificationApi  # noqa: E501
from swagger_client.rest import ApiException


class TestClassificationApi(unittest.TestCase):
    """ClassificationApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.classification_api.ClassificationApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_classification_data(self):
        """Test case for get_classification_data

        Fetch classification training or testing data.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
