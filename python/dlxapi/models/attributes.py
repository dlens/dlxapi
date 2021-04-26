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


class Attributes(object):
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
        'time_interval': 'TimeInterval',
        'budget_time_period_type': 'TimePeriodType',
        'is_monthly_spend_plan': 'bool'
    }

    attribute_map = {
        'time_interval': 'timeInterval',
        'budget_time_period_type': 'budgetTimePeriodType',
        'is_monthly_spend_plan': 'isMonthlySpendPlan'
    }

    def __init__(self, time_interval=None, budget_time_period_type=None, is_monthly_spend_plan=None, _configuration=None):  # noqa: E501
        """Attributes - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._time_interval = None
        self._budget_time_period_type = None
        self._is_monthly_spend_plan = None
        self.discriminator = None

        if time_interval is not None:
            self.time_interval = time_interval
        if budget_time_period_type is not None:
            self.budget_time_period_type = budget_time_period_type
        if is_monthly_spend_plan is not None:
            self.is_monthly_spend_plan = is_monthly_spend_plan

    @property
    def time_interval(self):
        """Gets the time_interval of this Attributes.  # noqa: E501


        :return: The time_interval of this Attributes.  # noqa: E501
        :rtype: TimeInterval
        """
        return self._time_interval

    @time_interval.setter
    def time_interval(self, time_interval):
        """Sets the time_interval of this Attributes.


        :param time_interval: The time_interval of this Attributes.  # noqa: E501
        :type: TimeInterval
        """

        self._time_interval = time_interval

    @property
    def budget_time_period_type(self):
        """Gets the budget_time_period_type of this Attributes.  # noqa: E501


        :return: The budget_time_period_type of this Attributes.  # noqa: E501
        :rtype: TimePeriodType
        """
        return self._budget_time_period_type

    @budget_time_period_type.setter
    def budget_time_period_type(self, budget_time_period_type):
        """Sets the budget_time_period_type of this Attributes.


        :param budget_time_period_type: The budget_time_period_type of this Attributes.  # noqa: E501
        :type: TimePeriodType
        """

        self._budget_time_period_type = budget_time_period_type

    @property
    def is_monthly_spend_plan(self):
        """Gets the is_monthly_spend_plan of this Attributes.  # noqa: E501


        :return: The is_monthly_spend_plan of this Attributes.  # noqa: E501
        :rtype: bool
        """
        return self._is_monthly_spend_plan

    @is_monthly_spend_plan.setter
    def is_monthly_spend_plan(self, is_monthly_spend_plan):
        """Sets the is_monthly_spend_plan of this Attributes.


        :param is_monthly_spend_plan: The is_monthly_spend_plan of this Attributes.  # noqa: E501
        :type: bool
        """

        self._is_monthly_spend_plan = is_monthly_spend_plan

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
        if issubclass(Attributes, dict):
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
        if not isinstance(other, Attributes):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Attributes):
            return True

        return self.to_dict() != other.to_dict()