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


class PortfolioTimeIntervalUpdatedEvent(object):
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
        'previous_time_interval': 'TimeInterval',
        'name': 'str',
        'time_interval': 'TimeInterval',
        'id': 'str',
        'portfolio_plan': 'PortfolioPlan'
    }

    attribute_map = {
        'portfolio_id': 'portfolioId',
        'previous_time_interval': 'previousTimeInterval',
        'name': 'name',
        'time_interval': 'timeInterval',
        'id': 'id',
        'portfolio_plan': 'portfolioPlan'
    }

    def __init__(self, portfolio_id=None, previous_time_interval=None, name=None, time_interval=None, id=None, portfolio_plan=None):  # noqa: E501
        """PortfolioTimeIntervalUpdatedEvent - a model defined in Swagger"""  # noqa: E501

        self._portfolio_id = None
        self._previous_time_interval = None
        self._name = None
        self._time_interval = None
        self._id = None
        self._portfolio_plan = None
        self.discriminator = None

        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if previous_time_interval is not None:
            self.previous_time_interval = previous_time_interval
        if name is not None:
            self.name = name
        if time_interval is not None:
            self.time_interval = time_interval
        if id is not None:
            self.id = id
        if portfolio_plan is not None:
            self.portfolio_plan = portfolio_plan

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501


        :return: The portfolio_id of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this PortfolioTimeIntervalUpdatedEvent.


        :param portfolio_id: The portfolio_id of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def previous_time_interval(self):
        """Gets the previous_time_interval of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501


        :return: The previous_time_interval of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501
        :rtype: TimeInterval
        """
        return self._previous_time_interval

    @previous_time_interval.setter
    def previous_time_interval(self, previous_time_interval):
        """Sets the previous_time_interval of this PortfolioTimeIntervalUpdatedEvent.


        :param previous_time_interval: The previous_time_interval of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501
        :type: TimeInterval
        """

        self._previous_time_interval = previous_time_interval

    @property
    def name(self):
        """Gets the name of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501


        :return: The name of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this PortfolioTimeIntervalUpdatedEvent.


        :param name: The name of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def time_interval(self):
        """Gets the time_interval of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501


        :return: The time_interval of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501
        :rtype: TimeInterval
        """
        return self._time_interval

    @time_interval.setter
    def time_interval(self, time_interval):
        """Sets the time_interval of this PortfolioTimeIntervalUpdatedEvent.


        :param time_interval: The time_interval of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501
        :type: TimeInterval
        """

        self._time_interval = time_interval

    @property
    def id(self):
        """Gets the id of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501


        :return: The id of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PortfolioTimeIntervalUpdatedEvent.


        :param id: The id of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def portfolio_plan(self):
        """Gets the portfolio_plan of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501


        :return: The portfolio_plan of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._portfolio_plan

    @portfolio_plan.setter
    def portfolio_plan(self, portfolio_plan):
        """Sets the portfolio_plan of this PortfolioTimeIntervalUpdatedEvent.


        :param portfolio_plan: The portfolio_plan of this PortfolioTimeIntervalUpdatedEvent.  # noqa: E501
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
        if issubclass(PortfolioTimeIntervalUpdatedEvent, dict):
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
        if not isinstance(other, PortfolioTimeIntervalUpdatedEvent):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
