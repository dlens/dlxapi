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

from dlxapi.configuration import Configuration


class KloudlessFile(object):
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
        'account_id': 'str',
        'file_id': 'str'
    }

    attribute_map = {
        'token': 'token',
        'account_id': 'accountId',
        'file_id': 'fileId'
    }

    def __init__(self, token=None, account_id=None, file_id=None, _configuration=None):  # noqa: E501
        """KloudlessFile - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._token = None
        self._account_id = None
        self._file_id = None
        self.discriminator = None

        if token is not None:
            self.token = token
        if account_id is not None:
            self.account_id = account_id
        if file_id is not None:
            self.file_id = file_id

    @property
    def token(self):
        """Gets the token of this KloudlessFile.  # noqa: E501


        :return: The token of this KloudlessFile.  # noqa: E501
        :rtype: str
        """
        return self._token

    @token.setter
    def token(self, token):
        """Sets the token of this KloudlessFile.


        :param token: The token of this KloudlessFile.  # noqa: E501
        :type: str
        """

        self._token = token

    @property
    def account_id(self):
        """Gets the account_id of this KloudlessFile.  # noqa: E501


        :return: The account_id of this KloudlessFile.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this KloudlessFile.


        :param account_id: The account_id of this KloudlessFile.  # noqa: E501
        :type: str
        """

        self._account_id = account_id

    @property
    def file_id(self):
        """Gets the file_id of this KloudlessFile.  # noqa: E501


        :return: The file_id of this KloudlessFile.  # noqa: E501
        :rtype: str
        """
        return self._file_id

    @file_id.setter
    def file_id(self, file_id):
        """Sets the file_id of this KloudlessFile.


        :param file_id: The file_id of this KloudlessFile.  # noqa: E501
        :type: str
        """

        self._file_id = file_id

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
        if issubclass(KloudlessFile, dict):
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
        if not isinstance(other, KloudlessFile):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, KloudlessFile):
            return True

        return self.to_dict() != other.to_dict()