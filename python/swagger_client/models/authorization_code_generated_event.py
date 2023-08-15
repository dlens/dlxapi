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


class AuthorizationCodeGeneratedEvent(object):
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
        'id': 'str',
        'user': 'User',
        'redirect_uri': 'str',
        'client_id': 'str',
        'group_id': 'str'
    }

    attribute_map = {
        'id': 'id',
        'user': 'user',
        'redirect_uri': 'redirectUri',
        'client_id': 'clientId',
        'group_id': 'groupId'
    }

    def __init__(self, id=None, user=None, redirect_uri=None, client_id=None, group_id=None):  # noqa: E501
        """AuthorizationCodeGeneratedEvent - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._user = None
        self._redirect_uri = None
        self._client_id = None
        self._group_id = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if user is not None:
            self.user = user
        if redirect_uri is not None:
            self.redirect_uri = redirect_uri
        if client_id is not None:
            self.client_id = client_id
        if group_id is not None:
            self.group_id = group_id

    @property
    def id(self):
        """Gets the id of this AuthorizationCodeGeneratedEvent.  # noqa: E501


        :return: The id of this AuthorizationCodeGeneratedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this AuthorizationCodeGeneratedEvent.


        :param id: The id of this AuthorizationCodeGeneratedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def user(self):
        """Gets the user of this AuthorizationCodeGeneratedEvent.  # noqa: E501


        :return: The user of this AuthorizationCodeGeneratedEvent.  # noqa: E501
        :rtype: User
        """
        return self._user

    @user.setter
    def user(self, user):
        """Sets the user of this AuthorizationCodeGeneratedEvent.


        :param user: The user of this AuthorizationCodeGeneratedEvent.  # noqa: E501
        :type: User
        """

        self._user = user

    @property
    def redirect_uri(self):
        """Gets the redirect_uri of this AuthorizationCodeGeneratedEvent.  # noqa: E501


        :return: The redirect_uri of this AuthorizationCodeGeneratedEvent.  # noqa: E501
        :rtype: str
        """
        return self._redirect_uri

    @redirect_uri.setter
    def redirect_uri(self, redirect_uri):
        """Sets the redirect_uri of this AuthorizationCodeGeneratedEvent.


        :param redirect_uri: The redirect_uri of this AuthorizationCodeGeneratedEvent.  # noqa: E501
        :type: str
        """

        self._redirect_uri = redirect_uri

    @property
    def client_id(self):
        """Gets the client_id of this AuthorizationCodeGeneratedEvent.  # noqa: E501


        :return: The client_id of this AuthorizationCodeGeneratedEvent.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this AuthorizationCodeGeneratedEvent.


        :param client_id: The client_id of this AuthorizationCodeGeneratedEvent.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def group_id(self):
        """Gets the group_id of this AuthorizationCodeGeneratedEvent.  # noqa: E501


        :return: The group_id of this AuthorizationCodeGeneratedEvent.  # noqa: E501
        :rtype: str
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """Sets the group_id of this AuthorizationCodeGeneratedEvent.


        :param group_id: The group_id of this AuthorizationCodeGeneratedEvent.  # noqa: E501
        :type: str
        """

        self._group_id = group_id

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
        if issubclass(AuthorizationCodeGeneratedEvent, dict):
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
        if not isinstance(other, AuthorizationCodeGeneratedEvent):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
