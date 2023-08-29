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


class MinifiedYearlyFieldValue(object):
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
        'nv': 'float',
        'ct': 'int',
        'fmn': 'str'
    }

    attribute_map = {
        'nv': 'nv',
        'ct': 'ct',
        'fmn': 'fmn'
    }

    def __init__(self, nv=None, ct=None, fmn=None):  # noqa: E501
        """MinifiedYearlyFieldValue - a model defined in Swagger"""  # noqa: E501

        self._nv = None
        self._ct = None
        self._fmn = None
        self.discriminator = None

        if nv is not None:
            self.nv = nv
        if ct is not None:
            self.ct = ct
        if fmn is not None:
            self.fmn = fmn

    @property
    def nv(self):
        """Gets the nv of this MinifiedYearlyFieldValue.  # noqa: E501

        Yearly aggregate numeric Value  # noqa: E501

        :return: The nv of this MinifiedYearlyFieldValue.  # noqa: E501
        :rtype: float
        """
        return self._nv

    @nv.setter
    def nv(self, nv):
        """Sets the nv of this MinifiedYearlyFieldValue.

        Yearly aggregate numeric Value  # noqa: E501

        :param nv: The nv of this MinifiedYearlyFieldValue.  # noqa: E501
        :type: float
        """

        self._nv = nv

    @property
    def ct(self):
        """Gets the ct of this MinifiedYearlyFieldValue.  # noqa: E501

        Number of monthly values in the year  # noqa: E501

        :return: The ct of this MinifiedYearlyFieldValue.  # noqa: E501
        :rtype: int
        """
        return self._ct

    @ct.setter
    def ct(self, ct):
        """Sets the ct of this MinifiedYearlyFieldValue.

        Number of monthly values in the year  # noqa: E501

        :param ct: The ct of this MinifiedYearlyFieldValue.  # noqa: E501
        :type: int
        """

        self._ct = ct

    @property
    def fmn(self):
        """Gets the fmn of this MinifiedYearlyFieldValue.  # noqa: E501

        TimePeriod index of the first month in the year  # noqa: E501

        :return: The fmn of this MinifiedYearlyFieldValue.  # noqa: E501
        :rtype: str
        """
        return self._fmn

    @fmn.setter
    def fmn(self, fmn):
        """Sets the fmn of this MinifiedYearlyFieldValue.

        TimePeriod index of the first month in the year  # noqa: E501

        :param fmn: The fmn of this MinifiedYearlyFieldValue.  # noqa: E501
        :type: str
        """

        self._fmn = fmn

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
        if issubclass(MinifiedYearlyFieldValue, dict):
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
        if not isinstance(other, MinifiedYearlyFieldValue):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other