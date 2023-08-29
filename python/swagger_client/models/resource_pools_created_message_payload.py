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


class ResourcePoolsCreatedMessagePayload(object):
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
        'resource_pools': 'list[ResourcePool]'
    }

    attribute_map = {
        'resource_pools': 'resourcePools'
    }

    def __init__(self, resource_pools=None):  # noqa: E501
        """ResourcePoolsCreatedMessagePayload - a model defined in Swagger"""  # noqa: E501

        self._resource_pools = None
        self.discriminator = None

        self.resource_pools = resource_pools

    @property
    def resource_pools(self):
        """Gets the resource_pools of this ResourcePoolsCreatedMessagePayload.  # noqa: E501


        :return: The resource_pools of this ResourcePoolsCreatedMessagePayload.  # noqa: E501
        :rtype: list[ResourcePool]
        """
        return self._resource_pools

    @resource_pools.setter
    def resource_pools(self, resource_pools):
        """Sets the resource_pools of this ResourcePoolsCreatedMessagePayload.


        :param resource_pools: The resource_pools of this ResourcePoolsCreatedMessagePayload.  # noqa: E501
        :type: list[ResourcePool]
        """
        if resource_pools is None:
            raise ValueError("Invalid value for `resource_pools`, must not be `None`")  # noqa: E501

        self._resource_pools = resource_pools

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
        if issubclass(ResourcePoolsCreatedMessagePayload, dict):
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
        if not isinstance(other, ResourcePoolsCreatedMessagePayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other