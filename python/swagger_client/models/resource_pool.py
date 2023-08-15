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


class ResourcePool(object):
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
        'budget_amounts': 'ResourcePoolBudgetAmounts',
        'field': 'Field',
        'field_values': 'list[ResourcePoolFieldValue]'
    }

    attribute_map = {
        'name': 'name',
        'budget_amounts': 'budgetAmounts',
        'field': 'field',
        'field_values': 'fieldValues'
    }

    def __init__(self, name=None, budget_amounts=None, field=None, field_values=None):  # noqa: E501
        """ResourcePool - a model defined in Swagger"""  # noqa: E501

        self._name = None
        self._budget_amounts = None
        self._field = None
        self._field_values = None
        self.discriminator = None

        if name is not None:
            self.name = name
        if budget_amounts is not None:
            self.budget_amounts = budget_amounts
        if field is not None:
            self.field = field
        if field_values is not None:
            self.field_values = field_values

    @property
    def name(self):
        """Gets the name of this ResourcePool.  # noqa: E501


        :return: The name of this ResourcePool.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ResourcePool.


        :param name: The name of this ResourcePool.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def budget_amounts(self):
        """Gets the budget_amounts of this ResourcePool.  # noqa: E501


        :return: The budget_amounts of this ResourcePool.  # noqa: E501
        :rtype: ResourcePoolBudgetAmounts
        """
        return self._budget_amounts

    @budget_amounts.setter
    def budget_amounts(self, budget_amounts):
        """Sets the budget_amounts of this ResourcePool.


        :param budget_amounts: The budget_amounts of this ResourcePool.  # noqa: E501
        :type: ResourcePoolBudgetAmounts
        """

        self._budget_amounts = budget_amounts

    @property
    def field(self):
        """Gets the field of this ResourcePool.  # noqa: E501


        :return: The field of this ResourcePool.  # noqa: E501
        :rtype: Field
        """
        return self._field

    @field.setter
    def field(self, field):
        """Sets the field of this ResourcePool.


        :param field: The field of this ResourcePool.  # noqa: E501
        :type: Field
        """

        self._field = field

    @property
    def field_values(self):
        """Gets the field_values of this ResourcePool.  # noqa: E501


        :return: The field_values of this ResourcePool.  # noqa: E501
        :rtype: list[ResourcePoolFieldValue]
        """
        return self._field_values

    @field_values.setter
    def field_values(self, field_values):
        """Sets the field_values of this ResourcePool.


        :param field_values: The field_values of this ResourcePool.  # noqa: E501
        :type: list[ResourcePoolFieldValue]
        """

        self._field_values = field_values

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
        if issubclass(ResourcePool, dict):
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
        if not isinstance(other, ResourcePool):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
