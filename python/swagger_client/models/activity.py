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


class Activity(object):
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
        'type': 'ActivityType',
        'user': 'User',
        'data': 'object'
    }

    attribute_map = {
        'type': 'type',
        'user': 'user',
        'data': 'data'
    }

    def __init__(self, type=None, user=None, data=None, _configuration=None):  # noqa: E501
        """Activity - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._type = None
        self._user = None
        self._data = None
        self.discriminator = None

        if type is not None:
            self.type = type
        if user is not None:
            self.user = user
        if data is not None:
            self.data = data

    @property
    def type(self):
        """Gets the type of this Activity.  # noqa: E501


        :return: The type of this Activity.  # noqa: E501
        :rtype: ActivityType
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this Activity.


        :param type: The type of this Activity.  # noqa: E501
        :type: ActivityType
        """

        self._type = type

    @property
    def user(self):
        """Gets the user of this Activity.  # noqa: E501


        :return: The user of this Activity.  # noqa: E501
        :rtype: User
        """
        return self._user

    @user.setter
    def user(self, user):
        """Sets the user of this Activity.


        :param user: The user of this Activity.  # noqa: E501
        :type: User
        """

        self._user = user

    @property
    def data(self):
        """Gets the data of this Activity.  # noqa: E501


        :return: The data of this Activity.  # noqa: E501
        :rtype: object
        """
        return self._data

    @data.setter
    def data(self, data):
        """Sets the data of this Activity.


        :param data: The data of this Activity.  # noqa: E501
        :type: object
        """

        self._data = data

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
        if issubclass(Activity, dict):
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
        if not isinstance(other, Activity):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Activity):
            return True

        return self.to_dict() != other.to_dict()
