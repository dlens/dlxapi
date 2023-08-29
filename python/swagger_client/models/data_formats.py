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


class DataFormats(object):
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
        'decimal_places': 'int',
        'currency': 'Currency',
        'negatives': 'Negatives',
        'date_format': 'DateFormat'
    }

    attribute_map = {
        'decimal_places': 'decimalPlaces',
        'currency': 'currency',
        'negatives': 'negatives',
        'date_format': 'dateFormat'
    }

    def __init__(self, decimal_places=None, currency=None, negatives=None, date_format=None):  # noqa: E501
        """DataFormats - a model defined in Swagger"""  # noqa: E501

        self._decimal_places = None
        self._currency = None
        self._negatives = None
        self._date_format = None
        self.discriminator = None

        if decimal_places is not None:
            self.decimal_places = decimal_places
        if currency is not None:
            self.currency = currency
        if negatives is not None:
            self.negatives = negatives
        if date_format is not None:
            self.date_format = date_format

    @property
    def decimal_places(self):
        """Gets the decimal_places of this DataFormats.  # noqa: E501


        :return: The decimal_places of this DataFormats.  # noqa: E501
        :rtype: int
        """
        return self._decimal_places

    @decimal_places.setter
    def decimal_places(self, decimal_places):
        """Sets the decimal_places of this DataFormats.


        :param decimal_places: The decimal_places of this DataFormats.  # noqa: E501
        :type: int
        """

        self._decimal_places = decimal_places

    @property
    def currency(self):
        """Gets the currency of this DataFormats.  # noqa: E501


        :return: The currency of this DataFormats.  # noqa: E501
        :rtype: Currency
        """
        return self._currency

    @currency.setter
    def currency(self, currency):
        """Sets the currency of this DataFormats.


        :param currency: The currency of this DataFormats.  # noqa: E501
        :type: Currency
        """

        self._currency = currency

    @property
    def negatives(self):
        """Gets the negatives of this DataFormats.  # noqa: E501


        :return: The negatives of this DataFormats.  # noqa: E501
        :rtype: Negatives
        """
        return self._negatives

    @negatives.setter
    def negatives(self, negatives):
        """Sets the negatives of this DataFormats.


        :param negatives: The negatives of this DataFormats.  # noqa: E501
        :type: Negatives
        """

        self._negatives = negatives

    @property
    def date_format(self):
        """Gets the date_format of this DataFormats.  # noqa: E501


        :return: The date_format of this DataFormats.  # noqa: E501
        :rtype: DateFormat
        """
        return self._date_format

    @date_format.setter
    def date_format(self, date_format):
        """Sets the date_format of this DataFormats.


        :param date_format: The date_format of this DataFormats.  # noqa: E501
        :type: DateFormat
        """

        self._date_format = date_format

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
        if issubclass(DataFormats, dict):
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
        if not isinstance(other, DataFormats):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other