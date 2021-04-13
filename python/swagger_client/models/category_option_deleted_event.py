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


class CategoryOptionDeletedEvent(object):
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
        'field_id': 'str'
    }

    attribute_map = {
        'portfolio_id': 'portfolioId',
        'name': 'name',
        'id': 'id',
        'field_id': 'fieldId'
    }

    def __init__(self, portfolio_id=None, name=None, id=None, field_id=None, _configuration=None):  # noqa: E501
        """CategoryOptionDeletedEvent - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._portfolio_id = None
        self._name = None
        self._id = None
        self._field_id = None
        self.discriminator = None

        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if name is not None:
            self.name = name
        if id is not None:
            self.id = id
        if field_id is not None:
            self.field_id = field_id

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this CategoryOptionDeletedEvent.  # noqa: E501


        :return: The portfolio_id of this CategoryOptionDeletedEvent.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this CategoryOptionDeletedEvent.


        :param portfolio_id: The portfolio_id of this CategoryOptionDeletedEvent.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def name(self):
        """Gets the name of this CategoryOptionDeletedEvent.  # noqa: E501


        :return: The name of this CategoryOptionDeletedEvent.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this CategoryOptionDeletedEvent.


        :param name: The name of this CategoryOptionDeletedEvent.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def id(self):
        """Gets the id of this CategoryOptionDeletedEvent.  # noqa: E501


        :return: The id of this CategoryOptionDeletedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this CategoryOptionDeletedEvent.


        :param id: The id of this CategoryOptionDeletedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def field_id(self):
        """Gets the field_id of this CategoryOptionDeletedEvent.  # noqa: E501


        :return: The field_id of this CategoryOptionDeletedEvent.  # noqa: E501
        :rtype: str
        """
        return self._field_id

    @field_id.setter
    def field_id(self, field_id):
        """Sets the field_id of this CategoryOptionDeletedEvent.


        :param field_id: The field_id of this CategoryOptionDeletedEvent.  # noqa: E501
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
        if issubclass(CategoryOptionDeletedEvent, dict):
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
        if not isinstance(other, CategoryOptionDeletedEvent):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, CategoryOptionDeletedEvent):
            return True

        return self.to_dict() != other.to_dict()
