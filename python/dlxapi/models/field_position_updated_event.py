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


class FieldPositionUpdatedEvent(object):
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
        'name': 'str',
        'id': 'str',
        'position': 'int',
        'field_type': 'FieldType',
        'previous_position': 'int',
        'portfolio_plan': 'PortfolioPlan'
    }

    attribute_map = {
        'portfolio_id': 'portfolioId',
        'name': 'name',
        'id': 'id',
        'position': 'position',
        'field_type': 'fieldType',
        'previous_position': 'previousPosition',
        'portfolio_plan': 'portfolioPlan'
    }

    def __init__(self, portfolio_id=None, name=None, id=None, position=None, field_type=None, previous_position=None, portfolio_plan=None, _configuration=None):  # noqa: E501
        """FieldPositionUpdatedEvent - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._portfolio_id = None
        self._name = None
        self._id = None
        self._position = None
        self._field_type = None
        self._previous_position = None
        self._portfolio_plan = None
        self.discriminator = None

        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if name is not None:
            self.name = name
        if id is not None:
            self.id = id
        if position is not None:
            self.position = position
        if field_type is not None:
            self.field_type = field_type
        if previous_position is not None:
            self.previous_position = previous_position
        if portfolio_plan is not None:
            self.portfolio_plan = portfolio_plan

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this FieldPositionUpdatedEvent.  # noqa: E501


        :return: The portfolio_id of this FieldPositionUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this FieldPositionUpdatedEvent.


        :param portfolio_id: The portfolio_id of this FieldPositionUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def name(self):
        """Gets the name of this FieldPositionUpdatedEvent.  # noqa: E501


        :return: The name of this FieldPositionUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this FieldPositionUpdatedEvent.


        :param name: The name of this FieldPositionUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def id(self):
        """Gets the id of this FieldPositionUpdatedEvent.  # noqa: E501


        :return: The id of this FieldPositionUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this FieldPositionUpdatedEvent.


        :param id: The id of this FieldPositionUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def position(self):
        """Gets the position of this FieldPositionUpdatedEvent.  # noqa: E501


        :return: The position of this FieldPositionUpdatedEvent.  # noqa: E501
        :rtype: int
        """
        return self._position

    @position.setter
    def position(self, position):
        """Sets the position of this FieldPositionUpdatedEvent.


        :param position: The position of this FieldPositionUpdatedEvent.  # noqa: E501
        :type: int
        """

        self._position = position

    @property
    def field_type(self):
        """Gets the field_type of this FieldPositionUpdatedEvent.  # noqa: E501


        :return: The field_type of this FieldPositionUpdatedEvent.  # noqa: E501
        :rtype: FieldType
        """
        return self._field_type

    @field_type.setter
    def field_type(self, field_type):
        """Sets the field_type of this FieldPositionUpdatedEvent.


        :param field_type: The field_type of this FieldPositionUpdatedEvent.  # noqa: E501
        :type: FieldType
        """

        self._field_type = field_type

    @property
    def previous_position(self):
        """Gets the previous_position of this FieldPositionUpdatedEvent.  # noqa: E501


        :return: The previous_position of this FieldPositionUpdatedEvent.  # noqa: E501
        :rtype: int
        """
        return self._previous_position

    @previous_position.setter
    def previous_position(self, previous_position):
        """Sets the previous_position of this FieldPositionUpdatedEvent.


        :param previous_position: The previous_position of this FieldPositionUpdatedEvent.  # noqa: E501
        :type: int
        """

        self._previous_position = previous_position

    @property
    def portfolio_plan(self):
        """Gets the portfolio_plan of this FieldPositionUpdatedEvent.  # noqa: E501


        :return: The portfolio_plan of this FieldPositionUpdatedEvent.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._portfolio_plan

    @portfolio_plan.setter
    def portfolio_plan(self, portfolio_plan):
        """Sets the portfolio_plan of this FieldPositionUpdatedEvent.


        :param portfolio_plan: The portfolio_plan of this FieldPositionUpdatedEvent.  # noqa: E501
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
        if issubclass(FieldPositionUpdatedEvent, dict):
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
        if not isinstance(other, FieldPositionUpdatedEvent):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, FieldPositionUpdatedEvent):
            return True

        return self.to_dict() != other.to_dict()