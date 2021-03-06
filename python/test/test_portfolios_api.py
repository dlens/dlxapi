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
from dlxapi.api.portfolios_api import PortfoliosApi  # noqa: E501
from dlxapi.rest import ApiException


class TestPortfoliosApi(unittest.TestCase):
    """PortfoliosApi unit test stubs"""

    def setUp(self):
        self.api = dlxapi.api.portfolios_api.PortfoliosApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_archive_portfolio(self):
        """Test case for archive_portfolio

        Archive a portfolio.  # noqa: E501
        """
        pass

    def test_create_portfolio(self):
        """Test case for create_portfolio

        Creates a new portfolio.  # noqa: E501
        """
        pass

    def test_export_portfolio_data(self):
        """Test case for export_portfolio_data

        Export portfolio data in JSON format  # noqa: E501
        """
        pass

    def test_get_portfolio(self):
        """Test case for get_portfolio

        Retrieves a portfolio.  # noqa: E501
        """
        pass

    def test_get_portfolio_activities(self):
        """Test case for get_portfolio_activities

        Retrieves portfolio activities log.  # noqa: E501
        """
        pass

    def test_get_portfolio_resource_pools(self):
        """Test case for get_portfolio_resource_pools

        (Deprecated. Use getResourcePoolsForPortfolioPlan) Retrieves resource pools in a portfolio.  # noqa: E501
        """
        pass

    def test_get_portfolios(self):
        """Test case for get_portfolios

        Get portfolios.  # noqa: E501
        """
        pass

    def test_get_projects_for_portfolio(self):
        """Test case for get_projects_for_portfolio

        Retrieves projects for portfolio  # noqa: E501
        """
        pass

    def test_get_spreadsheet_report_for_portfolio(self):
        """Test case for get_spreadsheet_report_for_portfolio

        Retrieves spreadsheet report for portfolio  # noqa: E501
        """
        pass

    def test_import_portfolio_data(self):
        """Test case for import_portfolio_data

        Import portfolio data in JSON format  # noqa: E501
        """
        pass

    def test_regenerate_user_registration_token(self):
        """Test case for regenerate_user_registration_token

        Generates a new registration token  # noqa: E501
        """
        pass

    def test_save_spreadsheet_for_portfolio(self):
        """Test case for save_spreadsheet_for_portfolio

        Saves spreadsheet for portfolio  # noqa: E501
        """
        pass

    def test_save_spreadsheet_source_for_portfolio(self):
        """Test case for save_spreadsheet_source_for_portfolio

        Save spreadsheet source for a portfolio  # noqa: E501
        """
        pass

    def test_set_custom_names(self):
        """Test case for set_custom_names

        Updates custom names for portfolio  # noqa: E501
        """
        pass

    def test_update_portfolio(self):
        """Test case for update_portfolio

        Update a portfolio.  # noqa: E501
        """
        pass

    def test_update_portfolio_field_values(self):
        """Test case for update_portfolio_field_values

        Update field values in a portfolio  # noqa: E501
        """
        pass

    def test_update_portfolio_resource_pool_budget_amounts(self):
        """Test case for update_portfolio_resource_pool_budget_amounts

        (Deprecated. Use updateResourcePoolBudgetAmountsForPortfolioPlan) Update resource pool budget amounts in a portfolio  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
