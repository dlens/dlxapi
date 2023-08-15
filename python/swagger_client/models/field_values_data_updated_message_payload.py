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


class FieldValuesDataUpdatedMessagePayload(object):
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
        'portfolio_plan_id': 'str',
        'data_id': 'str'
    }

    attribute_map = {
        'portfolio_plan_id': 'portfolioPlanId',
        'data_id': 'dataId'
    }

    def __init__(self, portfolio_plan_id=None, data_id=None):  # noqa: E501
        """FieldValuesDataUpdatedMessagePayload - a model defined in Swagger"""  # noqa: E501

        self._portfolio_plan_id = None
        self._data_id = None
        self.discriminator = None

        self.portfolio_plan_id = portfolio_plan_id
        self.data_id = data_id

    @property
    def portfolio_plan_id(self):
        """Gets the portfolio_plan_id of this FieldValuesDataUpdatedMessagePayload.  # noqa: E501


        :return: The portfolio_plan_id of this FieldValuesDataUpdatedMessagePayload.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_plan_id

    @portfolio_plan_id.setter
    def portfolio_plan_id(self, portfolio_plan_id):
        """Sets the portfolio_plan_id of this FieldValuesDataUpdatedMessagePayload.


        :param portfolio_plan_id: The portfolio_plan_id of this FieldValuesDataUpdatedMessagePayload.  # noqa: E501
        :type: str
        """
        if portfolio_plan_id is None:
            raise ValueError("Invalid value for `portfolio_plan_id`, must not be `None`")  # noqa: E501

        self._portfolio_plan_id = portfolio_plan_id

    @property
    def data_id(self):
        """Gets the data_id of this FieldValuesDataUpdatedMessagePayload.  # noqa: E501


        :return: The data_id of this FieldValuesDataUpdatedMessagePayload.  # noqa: E501
        :rtype: str
        """
        return self._data_id

    @data_id.setter
    def data_id(self, data_id):
        """Sets the data_id of this FieldValuesDataUpdatedMessagePayload.


        :param data_id: The data_id of this FieldValuesDataUpdatedMessagePayload.  # noqa: E501
        :type: str
        """
        if data_id is None:
            raise ValueError("Invalid value for `data_id`, must not be `None`")  # noqa: E501

        self._data_id = data_id

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
        if issubclass(FieldValuesDataUpdatedMessagePayload, dict):
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
        if not isinstance(other, FieldValuesDataUpdatedMessagePayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
