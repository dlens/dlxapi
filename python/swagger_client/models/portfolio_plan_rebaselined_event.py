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


class PortfolioPlanRebaselinedEvent(object):
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
        'portfolio_id': 'str',
        'baseline_portfolio_plan_name': 'str',
        'what_if_portfolio_plan': 'PortfolioPlan',
        'id': 'str',
        'what_if_portfolio_plan_name': 'str',
        'portfolio_plan': 'PortfolioPlan'
    }

    attribute_map = {
        'portfolio_id': 'portfolioId',
        'baseline_portfolio_plan_name': 'baselinePortfolioPlanName',
        'what_if_portfolio_plan': 'whatIfPortfolioPlan',
        'id': 'id',
        'what_if_portfolio_plan_name': 'whatIfPortfolioPlanName',
        'portfolio_plan': 'portfolioPlan'
    }

    def __init__(self, portfolio_id=None, baseline_portfolio_plan_name=None, what_if_portfolio_plan=None, id=None, what_if_portfolio_plan_name=None, portfolio_plan=None):  # noqa: E501
        """PortfolioPlanRebaselinedEvent - a model defined in Swagger"""  # noqa: E501

        self._portfolio_id = None
        self._baseline_portfolio_plan_name = None
        self._what_if_portfolio_plan = None
        self._id = None
        self._what_if_portfolio_plan_name = None
        self._portfolio_plan = None
        self.discriminator = None

        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if baseline_portfolio_plan_name is not None:
            self.baseline_portfolio_plan_name = baseline_portfolio_plan_name
        if what_if_portfolio_plan is not None:
            self.what_if_portfolio_plan = what_if_portfolio_plan
        if id is not None:
            self.id = id
        if what_if_portfolio_plan_name is not None:
            self.what_if_portfolio_plan_name = what_if_portfolio_plan_name
        if portfolio_plan is not None:
            self.portfolio_plan = portfolio_plan

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this PortfolioPlanRebaselinedEvent.  # noqa: E501


        :return: The portfolio_id of this PortfolioPlanRebaselinedEvent.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this PortfolioPlanRebaselinedEvent.


        :param portfolio_id: The portfolio_id of this PortfolioPlanRebaselinedEvent.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def baseline_portfolio_plan_name(self):
        """Gets the baseline_portfolio_plan_name of this PortfolioPlanRebaselinedEvent.  # noqa: E501


        :return: The baseline_portfolio_plan_name of this PortfolioPlanRebaselinedEvent.  # noqa: E501
        :rtype: str
        """
        return self._baseline_portfolio_plan_name

    @baseline_portfolio_plan_name.setter
    def baseline_portfolio_plan_name(self, baseline_portfolio_plan_name):
        """Sets the baseline_portfolio_plan_name of this PortfolioPlanRebaselinedEvent.


        :param baseline_portfolio_plan_name: The baseline_portfolio_plan_name of this PortfolioPlanRebaselinedEvent.  # noqa: E501
        :type: str
        """

        self._baseline_portfolio_plan_name = baseline_portfolio_plan_name

    @property
    def what_if_portfolio_plan(self):
        """Gets the what_if_portfolio_plan of this PortfolioPlanRebaselinedEvent.  # noqa: E501


        :return: The what_if_portfolio_plan of this PortfolioPlanRebaselinedEvent.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._what_if_portfolio_plan

    @what_if_portfolio_plan.setter
    def what_if_portfolio_plan(self, what_if_portfolio_plan):
        """Sets the what_if_portfolio_plan of this PortfolioPlanRebaselinedEvent.


        :param what_if_portfolio_plan: The what_if_portfolio_plan of this PortfolioPlanRebaselinedEvent.  # noqa: E501
        :type: PortfolioPlan
        """

        self._what_if_portfolio_plan = what_if_portfolio_plan

    @property
    def id(self):
        """Gets the id of this PortfolioPlanRebaselinedEvent.  # noqa: E501


        :return: The id of this PortfolioPlanRebaselinedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PortfolioPlanRebaselinedEvent.


        :param id: The id of this PortfolioPlanRebaselinedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def what_if_portfolio_plan_name(self):
        """Gets the what_if_portfolio_plan_name of this PortfolioPlanRebaselinedEvent.  # noqa: E501


        :return: The what_if_portfolio_plan_name of this PortfolioPlanRebaselinedEvent.  # noqa: E501
        :rtype: str
        """
        return self._what_if_portfolio_plan_name

    @what_if_portfolio_plan_name.setter
    def what_if_portfolio_plan_name(self, what_if_portfolio_plan_name):
        """Sets the what_if_portfolio_plan_name of this PortfolioPlanRebaselinedEvent.


        :param what_if_portfolio_plan_name: The what_if_portfolio_plan_name of this PortfolioPlanRebaselinedEvent.  # noqa: E501
        :type: str
        """

        self._what_if_portfolio_plan_name = what_if_portfolio_plan_name

    @property
    def portfolio_plan(self):
        """Gets the portfolio_plan of this PortfolioPlanRebaselinedEvent.  # noqa: E501


        :return: The portfolio_plan of this PortfolioPlanRebaselinedEvent.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._portfolio_plan

    @portfolio_plan.setter
    def portfolio_plan(self, portfolio_plan):
        """Sets the portfolio_plan of this PortfolioPlanRebaselinedEvent.


        :param portfolio_plan: The portfolio_plan of this PortfolioPlanRebaselinedEvent.  # noqa: E501
        :type: PortfolioPlan
        """

        self._portfolio_plan = portfolio_plan

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
        if issubclass(PortfolioPlanRebaselinedEvent, dict):
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
        if not isinstance(other, PortfolioPlanRebaselinedEvent):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
