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


class ValidConstraintValue(object):
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
        'field': 'Field',
        'min_cost': 'float',
        'max_cost': 'float',
        'total_cost': 'float'
    }

    attribute_map = {
        'field': 'field',
        'min_cost': 'minCost',
        'max_cost': 'maxCost',
        'total_cost': 'totalCost'
    }

    def __init__(self, field=None, min_cost=None, max_cost=None, total_cost=None, _configuration=None):  # noqa: E501
        """ValidConstraintValue - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._field = None
        self._min_cost = None
        self._max_cost = None
        self._total_cost = None
        self.discriminator = None

        if field is not None:
            self.field = field
        if min_cost is not None:
            self.min_cost = min_cost
        if max_cost is not None:
            self.max_cost = max_cost
        if total_cost is not None:
            self.total_cost = total_cost

    @property
    def field(self):
        """Gets the field of this ValidConstraintValue.  # noqa: E501


        :return: The field of this ValidConstraintValue.  # noqa: E501
        :rtype: Field
        """
        return self._field

    @field.setter
    def field(self, field):
        """Sets the field of this ValidConstraintValue.


        :param field: The field of this ValidConstraintValue.  # noqa: E501
        :type: Field
        """

        self._field = field

    @property
    def min_cost(self):
        """Gets the min_cost of this ValidConstraintValue.  # noqa: E501


        :return: The min_cost of this ValidConstraintValue.  # noqa: E501
        :rtype: float
        """
        return self._min_cost

    @min_cost.setter
    def min_cost(self, min_cost):
        """Sets the min_cost of this ValidConstraintValue.


        :param min_cost: The min_cost of this ValidConstraintValue.  # noqa: E501
        :type: float
        """

        self._min_cost = min_cost

    @property
    def max_cost(self):
        """Gets the max_cost of this ValidConstraintValue.  # noqa: E501


        :return: The max_cost of this ValidConstraintValue.  # noqa: E501
        :rtype: float
        """
        return self._max_cost

    @max_cost.setter
    def max_cost(self, max_cost):
        """Sets the max_cost of this ValidConstraintValue.


        :param max_cost: The max_cost of this ValidConstraintValue.  # noqa: E501
        :type: float
        """

        self._max_cost = max_cost

    @property
    def total_cost(self):
        """Gets the total_cost of this ValidConstraintValue.  # noqa: E501


        :return: The total_cost of this ValidConstraintValue.  # noqa: E501
        :rtype: float
        """
        return self._total_cost

    @total_cost.setter
    def total_cost(self, total_cost):
        """Sets the total_cost of this ValidConstraintValue.


        :param total_cost: The total_cost of this ValidConstraintValue.  # noqa: E501
        :type: float
        """

        self._total_cost = total_cost

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
        if issubclass(ValidConstraintValue, dict):
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
        if not isinstance(other, ValidConstraintValue):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ValidConstraintValue):
            return True

        return self.to_dict() != other.to_dict()
