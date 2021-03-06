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
from dlxapi.api.spreadsheet_api import SpreadsheetApi  # noqa: E501
from dlxapi.rest import ApiException


class TestSpreadsheetApi(unittest.TestCase):
    """SpreadsheetApi unit test stubs"""

    def setUp(self):
        self.api = dlxapi.api.spreadsheet_api.SpreadsheetApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_spreadsheet(self):
        """Test case for create_spreadsheet

        """
        pass

    def test_create_spreadsheet_for_kloudless_file(self):
        """Test case for create_spreadsheet_for_kloudless_file

        """
        pass

    def test_delete_spreadsheet(self):
        """Test case for delete_spreadsheet

        Delete spreadsheet and mappings  # noqa: E501
        """
        pass

    def test_get_mappings_for_spreadsheet(self):
        """Test case for get_mappings_for_spreadsheet

        """
        pass

    def test_get_spreadsheet(self):
        """Test case for get_spreadsheet

        """
        pass


if __name__ == '__main__':
    unittest.main()
