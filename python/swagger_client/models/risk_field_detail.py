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


class RiskFieldDetail(object):
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
        'type': 'RiskType',
        'project_count': 'int',
        'allocation': 'float'
    }

    attribute_map = {
        'type': 'type',
        'project_count': 'projectCount',
        'allocation': 'allocation'
    }

    def __init__(self, type=None, project_count=0, allocation=0.0):  # noqa: E501
        """RiskFieldDetail - a model defined in Swagger"""  # noqa: E501

        self._type = None
        self._project_count = None
        self._allocation = None
        self.discriminator = None

        if type is not None:
            self.type = type
        if project_count is not None:
            self.project_count = project_count
        if allocation is not None:
            self.allocation = allocation

    @property
    def type(self):
        """Gets the type of this RiskFieldDetail.  # noqa: E501


        :return: The type of this RiskFieldDetail.  # noqa: E501
        :rtype: RiskType
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this RiskFieldDetail.


        :param type: The type of this RiskFieldDetail.  # noqa: E501
        :type: RiskType
        """

        self._type = type

    @property
    def project_count(self):
        """Gets the project_count of this RiskFieldDetail.  # noqa: E501


        :return: The project_count of this RiskFieldDetail.  # noqa: E501
        :rtype: int
        """
        return self._project_count

    @project_count.setter
    def project_count(self, project_count):
        """Sets the project_count of this RiskFieldDetail.


        :param project_count: The project_count of this RiskFieldDetail.  # noqa: E501
        :type: int
        """

        self._project_count = project_count

    @property
    def allocation(self):
        """Gets the allocation of this RiskFieldDetail.  # noqa: E501


        :return: The allocation of this RiskFieldDetail.  # noqa: E501
        :rtype: float
        """
        return self._allocation

    @allocation.setter
    def allocation(self, allocation):
        """Sets the allocation of this RiskFieldDetail.


        :param allocation: The allocation of this RiskFieldDetail.  # noqa: E501
        :type: float
        """

        self._allocation = allocation

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
        if issubclass(RiskFieldDetail, dict):
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
        if not isinstance(other, RiskFieldDetail):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
