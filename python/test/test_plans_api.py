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
from dlxapi.api.plans_api import PlansApi  # noqa: E501
from dlxapi.rest import ApiException


class TestPlansApi(unittest.TestCase):
    """PlansApi unit test stubs"""

    def setUp(self):
        self.api = dlxapi.api.plans_api.PlansApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_export_whats_in(self):
        """Test case for export_whats_in

        Export Whats In Comparison  # noqa: E501
        """
        pass

    def test_get_grades_for_portfolio_plan(self):
        """Test case for get_grades_for_portfolio_plan

        Retrieves grades for portfolio plan.  # noqa: E501
        """
        pass

    def test_get_insights_for_portfolio_plan(self):
        """Test case for get_insights_for_portfolio_plan

        Retrieves insights for portfolio plan.  # noqa: E501
        """
        pass

    def test_get_value_insights_for_portfolio_plan(self):
        """Test case for get_value_insights_for_portfolio_plan

        Retrieves value insights for portfolio plan.  # noqa: E501
        """
        pass

    def test_get_whats_in(self):
        """Test case for get_whats_in

        Retrieves portfolioPlans with projects for WhatsIn  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
