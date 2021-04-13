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
from swagger_client.api.resource_pools_api import ResourcePoolsApi  # noqa: E501
from swagger_client.rest import ApiException


class TestResourcePoolsApi(unittest.TestCase):
    """ResourcePoolsApi unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.resource_pools_api.ResourcePoolsApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_resource_pool(self):
        """Test case for get_resource_pool

        Retrieves a resource pool.  # noqa: E501
        """
        pass

    def test_get_resource_pools_for_portfolio_plan(self):
        """Test case for get_resource_pools_for_portfolio_plan

        Fetch resource pools for portfolio plan  # noqa: E501
        """
        pass

    def test_update_resource_pool_budget_amounts_for_portfolio_plan(self):
        """Test case for update_resource_pool_budget_amounts_for_portfolio_plan

        Update resource pool budget amounts in a portfolio plan  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
