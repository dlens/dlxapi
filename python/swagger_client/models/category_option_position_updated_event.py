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


class CategoryOptionPositionUpdatedEvent(object):
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
        'id': 'str',
        'position': 'int',
        'previous_position': 'int',
        'field_id': 'str'
    }

    attribute_map = {
        'portfolio_id': 'portfolioId',
        'id': 'id',
        'position': 'position',
        'previous_position': 'previousPosition',
        'field_id': 'fieldId'
    }

    def __init__(self, portfolio_id=None, id=None, position=None, previous_position=None, field_id=None):  # noqa: E501
        """CategoryOptionPositionUpdatedEvent - a model defined in Swagger"""  # noqa: E501

        self._portfolio_id = None
        self._id = None
        self._position = None
        self._previous_position = None
        self._field_id = None
        self.discriminator = None

        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if id is not None:
            self.id = id
        if position is not None:
            self.position = position
        if previous_position is not None:
            self.previous_position = previous_position
        if field_id is not None:
            self.field_id = field_id

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this CategoryOptionPositionUpdatedEvent.  # noqa: E501


        :return: The portfolio_id of this CategoryOptionPositionUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this CategoryOptionPositionUpdatedEvent.


        :param portfolio_id: The portfolio_id of this CategoryOptionPositionUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def id(self):
        """Gets the id of this CategoryOptionPositionUpdatedEvent.  # noqa: E501


        :return: The id of this CategoryOptionPositionUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this CategoryOptionPositionUpdatedEvent.


        :param id: The id of this CategoryOptionPositionUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def position(self):
        """Gets the position of this CategoryOptionPositionUpdatedEvent.  # noqa: E501


        :return: The position of this CategoryOptionPositionUpdatedEvent.  # noqa: E501
        :rtype: int
        """
        return self._position

    @position.setter
    def position(self, position):
        """Sets the position of this CategoryOptionPositionUpdatedEvent.


        :param position: The position of this CategoryOptionPositionUpdatedEvent.  # noqa: E501
        :type: int
        """

        self._position = position

    @property
    def previous_position(self):
        """Gets the previous_position of this CategoryOptionPositionUpdatedEvent.  # noqa: E501


        :return: The previous_position of this CategoryOptionPositionUpdatedEvent.  # noqa: E501
        :rtype: int
        """
        return self._previous_position

    @previous_position.setter
    def previous_position(self, previous_position):
        """Sets the previous_position of this CategoryOptionPositionUpdatedEvent.


        :param previous_position: The previous_position of this CategoryOptionPositionUpdatedEvent.  # noqa: E501
        :type: int
        """

        self._previous_position = previous_position

    @property
    def field_id(self):
        """Gets the field_id of this CategoryOptionPositionUpdatedEvent.  # noqa: E501


        :return: The field_id of this CategoryOptionPositionUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._field_id

    @field_id.setter
    def field_id(self, field_id):
        """Sets the field_id of this CategoryOptionPositionUpdatedEvent.


        :param field_id: The field_id of this CategoryOptionPositionUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._field_id = field_id

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
        if issubclass(CategoryOptionPositionUpdatedEvent, dict):
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
        if not isinstance(other, CategoryOptionPositionUpdatedEvent):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
