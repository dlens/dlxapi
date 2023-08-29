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
from swagger_client.api.jira_api import JiraApi  # noqa: E501
from swagger_client.rest import ApiException


class TestJiraApi(unittest.TestCase):
    """JiraApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.jira_api.JiraApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_comment_from_jira(self):
        """Test case for create_comment_from_jira

        """
        pass

    def test_create_jira_field_mapping(self):
        """Test case for create_jira_field_mapping

        """
        pass

    def test_create_jira_instance(self):
        """Test case for create_jira_instance

        """
        pass

    def test_delete_field_mapping(self):
        """Test case for delete_field_mapping

        Delete jira field mapping  # noqa: E501
        """
        pass

    def test_delete_jira_instance(self):
        """Test case for delete_jira_instance

        Delete jira instance  # noqa: E501
        """
        pass

    def test_disable_jira_instance(self):
        """Test case for disable_jira_instance

        """
        pass

    def test_enable_jira_instance(self):
        """Test case for enable_jira_instance

        """
        pass

    def test_get_field_mapping(self):
        """Test case for get_field_mapping

        """
        pass

    def test_get_field_mappings(self):
        """Test case for get_field_mappings

        """
        pass

    def test_get_jira_instance(self):
        """Test case for get_jira_instance

        """
        pass

    def test_get_mapped_project_for_epic(self):
        """Test case for get_mapped_project_for_epic

        """
        pass

    def test_start_sync_for_jira_instance(self):
        """Test case for start_sync_for_jira_instance

        """
        pass


if __name__ == '__main__':
    unittest.main()