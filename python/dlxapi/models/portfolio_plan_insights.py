# coding: utf-8

"""
    Decision Lens API

    No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)  # noqa: E501

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from dlxapi.configuration import Configuration


class PortfolioPlanInsights(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'status_counts': 'list[ValueCount]',
        'budget': 'float',
        'allocation': 'float',
        'portfolio': 'Portfolio',
        'details': 'list[PortfolioPlanInsights]',
        'cost_budget_allocation': 'list[CostBudgetAllocation]',
        'value_insights': 'ValueInsights',
        'wiwo': 'Wiwo'
    }

    attribute_map = {
        'status_counts': 'statusCounts',
        'budget': 'budget',
        'allocation': 'allocation',
        'portfolio': 'portfolio',
        'details': 'details',
        'cost_budget_allocation': 'costBudgetAllocation',
        'value_insights': 'valueInsights',
        'wiwo': 'wiwo'
    }

    def __init__(self, status_counts=None, budget=None, allocation=None, portfolio=None, details=None, cost_budget_allocation=None, value_insights=None, wiwo=None, _configuration=None):  # noqa: E501
        """PortfolioPlanInsights - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._status_counts = None
        self._budget = None
        self._allocation = None
        self._portfolio = None
        self._details = None
        self._cost_budget_allocation = None
        self._value_insights = None
        self._wiwo = None
        self.discriminator = None

        if status_counts is not None:
            self.status_counts = status_counts
        if budget is not None:
            self.budget = budget
        if allocation is not None:
            self.allocation = allocation
        if portfolio is not None:
            self.portfolio = portfolio
        if details is not None:
            self.details = details
        if cost_budget_allocation is not None:
            self.cost_budget_allocation = cost_budget_allocation
        if value_insights is not None:
            self.value_insights = value_insights
        if wiwo is not None:
            self.wiwo = wiwo

    @property
    def status_counts(self):
        """Gets the status_counts of this PortfolioPlanInsights.  # noqa: E501


        :return: The status_counts of this PortfolioPlanInsights.  # noqa: E501
        :rtype: list[ValueCount]
        """
        return self._status_counts

    @status_counts.setter
    def status_counts(self, status_counts):
        """Sets the status_counts of this PortfolioPlanInsights.


        :param status_counts: The status_counts of this PortfolioPlanInsights.  # noqa: E501
        :type: list[ValueCount]
        """

        self._status_counts = status_counts

    @property
    def budget(self):
        """Gets the budget of this PortfolioPlanInsights.  # noqa: E501


        :return: The budget of this PortfolioPlanInsights.  # noqa: E501
        :rtype: float
        """
        return self._budget

    @budget.setter
    def budget(self, budget):
        """Sets the budget of this PortfolioPlanInsights.


        :param budget: The budget of this PortfolioPlanInsights.  # noqa: E501
        :type: float
        """

        self._budget = budget

    @property
    def allocation(self):
        """Gets the allocation of this PortfolioPlanInsights.  # noqa: E501


        :return: The allocation of this PortfolioPlanInsights.  # noqa: E501
        :rtype: float
        """
        return self._allocation

    @allocation.setter
    def allocation(self, allocation):
        """Sets the allocation of this PortfolioPlanInsights.


        :param allocation: The allocation of this PortfolioPlanInsights.  # noqa: E501
        :type: float
        """

        self._allocation = allocation

    @property
    def portfolio(self):
        """Gets the portfolio of this PortfolioPlanInsights.  # noqa: E501


        :return: The portfolio of this PortfolioPlanInsights.  # noqa: E501
        :rtype: Portfolio
        """
        return self._portfolio

    @portfolio.setter
    def portfolio(self, portfolio):
        """Sets the portfolio of this PortfolioPlanInsights.


        :param portfolio: The portfolio of this PortfolioPlanInsights.  # noqa: E501
        :type: Portfolio
        """

        self._portfolio = portfolio

    @property
    def details(self):
        """Gets the details of this PortfolioPlanInsights.  # noqa: E501


        :return: The details of this PortfolioPlanInsights.  # noqa: E501
        :rtype: list[PortfolioPlanInsights]
        """
        return self._details

    @details.setter
    def details(self, details):
        """Sets the details of this PortfolioPlanInsights.


        :param details: The details of this PortfolioPlanInsights.  # noqa: E501
        :type: list[PortfolioPlanInsights]
        """

        self._details = details

    @property
    def cost_budget_allocation(self):
        """Gets the cost_budget_allocation of this PortfolioPlanInsights.  # noqa: E501


        :return: The cost_budget_allocation of this PortfolioPlanInsights.  # noqa: E501
        :rtype: list[CostBudgetAllocation]
        """
        return self._cost_budget_allocation

    @cost_budget_allocation.setter
    def cost_budget_allocation(self, cost_budget_allocation):
        """Sets the cost_budget_allocation of this PortfolioPlanInsights.


        :param cost_budget_allocation: The cost_budget_allocation of this PortfolioPlanInsights.  # noqa: E501
        :type: list[CostBudgetAllocation]
        """

        self._cost_budget_allocation = cost_budget_allocation

    @property
    def value_insights(self):
        """Gets the value_insights of this PortfolioPlanInsights.  # noqa: E501


        :return: The value_insights of this PortfolioPlanInsights.  # noqa: E501
        :rtype: ValueInsights
        """
        return self._value_insights

    @value_insights.setter
    def value_insights(self, value_insights):
        """Sets the value_insights of this PortfolioPlanInsights.


        :param value_insights: The value_insights of this PortfolioPlanInsights.  # noqa: E501
        :type: ValueInsights
        """

        self._value_insights = value_insights

    @property
    def wiwo(self):
        """Gets the wiwo of this PortfolioPlanInsights.  # noqa: E501


        :return: The wiwo of this PortfolioPlanInsights.  # noqa: E501
        :rtype: Wiwo
        """
        return self._wiwo

    @wiwo.setter
    def wiwo(self, wiwo):
        """Sets the wiwo of this PortfolioPlanInsights.


        :param wiwo: The wiwo of this PortfolioPlanInsights.  # noqa: E501
        :type: Wiwo
        """

        self._wiwo = wiwo

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(PortfolioPlanInsights, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, PortfolioPlanInsights):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PortfolioPlanInsights):
            return True

        return self.to_dict() != other.to_dict()
