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


class PortfolioPlan(object):
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
        'name': 'str',
        'is_baseline': 'bool',
        'portfolio': 'Portfolio',
        'parent_portfolio_plan': 'PortfolioPlan',
        'portfolio_plan_users': 'PortfolioPlanUsers',
        'current_portfolio_plan_user': 'PortfolioPlanUser',
        'description': 'str'
    }

    attribute_map = {
        'name': 'name',
        'is_baseline': 'isBaseline',
        'portfolio': 'portfolio',
        'parent_portfolio_plan': 'parentPortfolioPlan',
        'portfolio_plan_users': 'portfolioPlanUsers',
        'current_portfolio_plan_user': 'currentPortfolioPlanUser',
        'description': 'description'
    }

    def __init__(self, name=None, is_baseline=None, portfolio=None, parent_portfolio_plan=None, portfolio_plan_users=None, current_portfolio_plan_user=None, description=None):  # noqa: E501
        """PortfolioPlan - a model defined in Swagger"""  # noqa: E501

        self._name = None
        self._is_baseline = None
        self._portfolio = None
        self._parent_portfolio_plan = None
        self._portfolio_plan_users = None
        self._current_portfolio_plan_user = None
        self._description = None
        self.discriminator = None

        if name is not None:
            self.name = name
        if is_baseline is not None:
            self.is_baseline = is_baseline
        if portfolio is not None:
            self.portfolio = portfolio
        if parent_portfolio_plan is not None:
            self.parent_portfolio_plan = parent_portfolio_plan
        if portfolio_plan_users is not None:
            self.portfolio_plan_users = portfolio_plan_users
        if current_portfolio_plan_user is not None:
            self.current_portfolio_plan_user = current_portfolio_plan_user
        if description is not None:
            self.description = description

    @property
    def name(self):
        """Gets the name of this PortfolioPlan.  # noqa: E501


        :return: The name of this PortfolioPlan.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this PortfolioPlan.


        :param name: The name of this PortfolioPlan.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def is_baseline(self):
        """Gets the is_baseline of this PortfolioPlan.  # noqa: E501


        :return: The is_baseline of this PortfolioPlan.  # noqa: E501
        :rtype: bool
        """
        return self._is_baseline

    @is_baseline.setter
    def is_baseline(self, is_baseline):
        """Sets the is_baseline of this PortfolioPlan.


        :param is_baseline: The is_baseline of this PortfolioPlan.  # noqa: E501
        :type: bool
        """

        self._is_baseline = is_baseline

    @property
    def portfolio(self):
        """Gets the portfolio of this PortfolioPlan.  # noqa: E501


        :return: The portfolio of this PortfolioPlan.  # noqa: E501
        :rtype: Portfolio
        """
        return self._portfolio

    @portfolio.setter
    def portfolio(self, portfolio):
        """Sets the portfolio of this PortfolioPlan.


        :param portfolio: The portfolio of this PortfolioPlan.  # noqa: E501
        :type: Portfolio
        """

        self._portfolio = portfolio

    @property
    def parent_portfolio_plan(self):
        """Gets the parent_portfolio_plan of this PortfolioPlan.  # noqa: E501


        :return: The parent_portfolio_plan of this PortfolioPlan.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._parent_portfolio_plan

    @parent_portfolio_plan.setter
    def parent_portfolio_plan(self, parent_portfolio_plan):
        """Sets the parent_portfolio_plan of this PortfolioPlan.


        :param parent_portfolio_plan: The parent_portfolio_plan of this PortfolioPlan.  # noqa: E501
        :type: PortfolioPlan
        """

        self._parent_portfolio_plan = parent_portfolio_plan

    @property
    def portfolio_plan_users(self):
        """Gets the portfolio_plan_users of this PortfolioPlan.  # noqa: E501


        :return: The portfolio_plan_users of this PortfolioPlan.  # noqa: E501
        :rtype: PortfolioPlanUsers
        """
        return self._portfolio_plan_users

    @portfolio_plan_users.setter
    def portfolio_plan_users(self, portfolio_plan_users):
        """Sets the portfolio_plan_users of this PortfolioPlan.


        :param portfolio_plan_users: The portfolio_plan_users of this PortfolioPlan.  # noqa: E501
        :type: PortfolioPlanUsers
        """

        self._portfolio_plan_users = portfolio_plan_users

    @property
    def current_portfolio_plan_user(self):
        """Gets the current_portfolio_plan_user of this PortfolioPlan.  # noqa: E501


        :return: The current_portfolio_plan_user of this PortfolioPlan.  # noqa: E501
        :rtype: PortfolioPlanUser
        """
        return self._current_portfolio_plan_user

    @current_portfolio_plan_user.setter
    def current_portfolio_plan_user(self, current_portfolio_plan_user):
        """Sets the current_portfolio_plan_user of this PortfolioPlan.


        :param current_portfolio_plan_user: The current_portfolio_plan_user of this PortfolioPlan.  # noqa: E501
        :type: PortfolioPlanUser
        """

        self._current_portfolio_plan_user = current_portfolio_plan_user

    @property
    def description(self):
        """Gets the description of this PortfolioPlan.  # noqa: E501


        :return: The description of this PortfolioPlan.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this PortfolioPlan.


        :param description: The description of this PortfolioPlan.  # noqa: E501
        :type: str
        """

        self._description = description

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
        if issubclass(PortfolioPlan, dict):
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
        if not isinstance(other, PortfolioPlan):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other