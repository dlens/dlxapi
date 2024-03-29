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


class ResourcePoolBudgetAmountPatchItem(object):
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
        'resource_pool_id': 'str',
        'time_period': 'TimePeriod',
        'operations': 'Operations'
    }

    attribute_map = {
        'resource_pool_id': 'resourcePoolId',
        'time_period': 'timePeriod',
        'operations': 'operations'
    }

    def __init__(self, resource_pool_id=None, time_period=None, operations=None):  # noqa: E501
        """ResourcePoolBudgetAmountPatchItem - a model defined in Swagger"""  # noqa: E501

        self._resource_pool_id = None
        self._time_period = None
        self._operations = None
        self.discriminator = None

        if resource_pool_id is not None:
            self.resource_pool_id = resource_pool_id
        if time_period is not None:
            self.time_period = time_period
        if operations is not None:
            self.operations = operations

    @property
    def resource_pool_id(self):
        """Gets the resource_pool_id of this ResourcePoolBudgetAmountPatchItem.  # noqa: E501


        :return: The resource_pool_id of this ResourcePoolBudgetAmountPatchItem.  # noqa: E501
        :rtype: str
        """
        return self._resource_pool_id

    @resource_pool_id.setter
    def resource_pool_id(self, resource_pool_id):
        """Sets the resource_pool_id of this ResourcePoolBudgetAmountPatchItem.


        :param resource_pool_id: The resource_pool_id of this ResourcePoolBudgetAmountPatchItem.  # noqa: E501
        :type: str
        """

        self._resource_pool_id = resource_pool_id

    @property
    def time_period(self):
        """Gets the time_period of this ResourcePoolBudgetAmountPatchItem.  # noqa: E501


        :return: The time_period of this ResourcePoolBudgetAmountPatchItem.  # noqa: E501
        :rtype: TimePeriod
        """
        return self._time_period

    @time_period.setter
    def time_period(self, time_period):
        """Sets the time_period of this ResourcePoolBudgetAmountPatchItem.


        :param time_period: The time_period of this ResourcePoolBudgetAmountPatchItem.  # noqa: E501
        :type: TimePeriod
        """

        self._time_period = time_period

    @property
    def operations(self):
        """Gets the operations of this ResourcePoolBudgetAmountPatchItem.  # noqa: E501


        :return: The operations of this ResourcePoolBudgetAmountPatchItem.  # noqa: E501
        :rtype: Operations
        """
        return self._operations

    @operations.setter
    def operations(self, operations):
        """Sets the operations of this ResourcePoolBudgetAmountPatchItem.


        :param operations: The operations of this ResourcePoolBudgetAmountPatchItem.  # noqa: E501
        :type: Operations
        """

        self._operations = operations

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
        if issubclass(ResourcePoolBudgetAmountPatchItem, dict):
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
        if not isinstance(other, ResourcePoolBudgetAmountPatchItem):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
