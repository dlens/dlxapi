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

from swagger_client.configuration import Configuration


class SourceDeletedEvent(object):
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
        'source_type': 'SourceType',
        'name': 'str',
        'id': 'str',
        'portfolio_plan': 'PortfolioPlan'
    }

    attribute_map = {
        'source_type': 'sourceType',
        'name': 'name',
        'id': 'id',
        'portfolio_plan': 'portfolioPlan'
    }

    def __init__(self, source_type=None, name=None, id=None, portfolio_plan=None, _configuration=None):  # noqa: E501
        """SourceDeletedEvent - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._source_type = None
        self._name = None
        self._id = None
        self._portfolio_plan = None
        self.discriminator = None

        if source_type is not None:
            self.source_type = source_type
        if name is not None:
            self.name = name
        if id is not None:
            self.id = id
        if portfolio_plan is not None:
            self.portfolio_plan = portfolio_plan

    @property
    def source_type(self):
        """Gets the source_type of this SourceDeletedEvent.  # noqa: E501


        :return: The source_type of this SourceDeletedEvent.  # noqa: E501
        :rtype: SourceType
        """
        return self._source_type

    @source_type.setter
    def source_type(self, source_type):
        """Sets the source_type of this SourceDeletedEvent.


        :param source_type: The source_type of this SourceDeletedEvent.  # noqa: E501
        :type: SourceType
        """

        self._source_type = source_type

    @property
    def name(self):
        """Gets the name of this SourceDeletedEvent.  # noqa: E501


        :return: The name of this SourceDeletedEvent.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this SourceDeletedEvent.


        :param name: The name of this SourceDeletedEvent.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def id(self):
        """Gets the id of this SourceDeletedEvent.  # noqa: E501


        :return: The id of this SourceDeletedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this SourceDeletedEvent.


        :param id: The id of this SourceDeletedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def portfolio_plan(self):
        """Gets the portfolio_plan of this SourceDeletedEvent.  # noqa: E501


        :return: The portfolio_plan of this SourceDeletedEvent.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._portfolio_plan

    @portfolio_plan.setter
    def portfolio_plan(self, portfolio_plan):
        """Sets the portfolio_plan of this SourceDeletedEvent.


        :param portfolio_plan: The portfolio_plan of this SourceDeletedEvent.  # noqa: E501
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
        if issubclass(SourceDeletedEvent, dict):
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
        if not isinstance(other, SourceDeletedEvent):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, SourceDeletedEvent):
            return True

        return self.to_dict() != other.to_dict()
