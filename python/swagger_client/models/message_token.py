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


class MessageToken(object):
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
        'token': 'str',
        'expiration_in_millis': 'int',
        'destination': 'str'
    }

    attribute_map = {
        'token': 'token',
        'expiration_in_millis': 'expirationInMillis',
        'destination': 'destination'
    }

    def __init__(self, token=None, expiration_in_millis=None, destination=None, _configuration=None):  # noqa: E501
        """MessageToken - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._token = None
        self._expiration_in_millis = None
        self._destination = None
        self.discriminator = None

        self.token = token
        self.expiration_in_millis = expiration_in_millis
        self.destination = destination

    @property
    def token(self):
        """Gets the token of this MessageToken.  # noqa: E501


        :return: The token of this MessageToken.  # noqa: E501
        :rtype: str
        """
        return self._token

    @token.setter
    def token(self, token):
        """Sets the token of this MessageToken.


        :param token: The token of this MessageToken.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and token is None:
            raise ValueError("Invalid value for `token`, must not be `None`")  # noqa: E501

        self._token = token

    @property
    def expiration_in_millis(self):
        """Gets the expiration_in_millis of this MessageToken.  # noqa: E501


        :return: The expiration_in_millis of this MessageToken.  # noqa: E501
        :rtype: int
        """
        return self._expiration_in_millis

    @expiration_in_millis.setter
    def expiration_in_millis(self, expiration_in_millis):
        """Sets the expiration_in_millis of this MessageToken.


        :param expiration_in_millis: The expiration_in_millis of this MessageToken.  # noqa: E501
        :type: int
        """
        if self._configuration.client_side_validation and expiration_in_millis is None:
            raise ValueError("Invalid value for `expiration_in_millis`, must not be `None`")  # noqa: E501

        self._expiration_in_millis = expiration_in_millis

    @property
    def destination(self):
        """Gets the destination of this MessageToken.  # noqa: E501


        :return: The destination of this MessageToken.  # noqa: E501
        :rtype: str
        """
        return self._destination

    @destination.setter
    def destination(self, destination):
        """Sets the destination of this MessageToken.


        :param destination: The destination of this MessageToken.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and destination is None:
            raise ValueError("Invalid value for `destination`, must not be `None`")  # noqa: E501

        self._destination = destination

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
        if issubclass(MessageToken, dict):
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
        if not isinstance(other, MessageToken):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, MessageToken):
            return True

        return self.to_dict() != other.to_dict()
