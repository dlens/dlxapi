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


class AddedToPortfolioMessagePayload(object):
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
        'portfolio': 'Portfolio'
    }

    attribute_map = {
        'portfolio': 'portfolio'
    }

    def __init__(self, portfolio=None):  # noqa: E501
        """AddedToPortfolioMessagePayload - a model defined in Swagger"""  # noqa: E501

        self._portfolio = None
        self.discriminator = None

        self.portfolio = portfolio

    @property
    def portfolio(self):
        """Gets the portfolio of this AddedToPortfolioMessagePayload.  # noqa: E501


        :return: The portfolio of this AddedToPortfolioMessagePayload.  # noqa: E501
        :rtype: Portfolio
        """
        return self._portfolio

    @portfolio.setter
    def portfolio(self, portfolio):
        """Sets the portfolio of this AddedToPortfolioMessagePayload.


        :param portfolio: The portfolio of this AddedToPortfolioMessagePayload.  # noqa: E501
        :type: Portfolio
        """
        if portfolio is None:
            raise ValueError("Invalid value for `portfolio`, must not be `None`")  # noqa: E501

        self._portfolio = portfolio

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
        if issubclass(AddedToPortfolioMessagePayload, dict):
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
        if not isinstance(other, AddedToPortfolioMessagePayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
