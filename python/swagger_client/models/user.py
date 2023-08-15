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


class User(object):
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
        'username': 'str',
        'email': 'str',
        'first_name': 'str',
        'last_name': 'str',
        'status': 'UserStatus',
        'last_login_at': 'int',
        'invitation_url': 'str',
        'invitation_url_expiration': 'int',
        'role': 'RoleType'
    }

    attribute_map = {
        'username': 'username',
        'email': 'email',
        'first_name': 'firstName',
        'last_name': 'lastName',
        'status': 'status',
        'last_login_at': 'lastLoginAt',
        'invitation_url': 'invitationUrl',
        'invitation_url_expiration': 'invitationUrlExpiration',
        'role': 'role'
    }

    def __init__(self, username=None, email=None, first_name=None, last_name=None, status=None, last_login_at=None, invitation_url=None, invitation_url_expiration=None, role=None):  # noqa: E501
        """User - a model defined in Swagger"""  # noqa: E501

        self._username = None
        self._email = None
        self._first_name = None
        self._last_name = None
        self._status = None
        self._last_login_at = None
        self._invitation_url = None
        self._invitation_url_expiration = None
        self._role = None
        self.discriminator = None

        if username is not None:
            self.username = username
        if email is not None:
            self.email = email
        if first_name is not None:
            self.first_name = first_name
        if last_name is not None:
            self.last_name = last_name
        if status is not None:
            self.status = status
        if last_login_at is not None:
            self.last_login_at = last_login_at
        if invitation_url is not None:
            self.invitation_url = invitation_url
        if invitation_url_expiration is not None:
            self.invitation_url_expiration = invitation_url_expiration
        if role is not None:
            self.role = role

    @property
    def username(self):
        """Gets the username of this User.  # noqa: E501


        :return: The username of this User.  # noqa: E501
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """Sets the username of this User.


        :param username: The username of this User.  # noqa: E501
        :type: str
        """

        self._username = username

    @property
    def email(self):
        """Gets the email of this User.  # noqa: E501


        :return: The email of this User.  # noqa: E501
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this User.


        :param email: The email of this User.  # noqa: E501
        :type: str
        """

        self._email = email

    @property
    def first_name(self):
        """Gets the first_name of this User.  # noqa: E501


        :return: The first_name of this User.  # noqa: E501
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name):
        """Sets the first_name of this User.


        :param first_name: The first_name of this User.  # noqa: E501
        :type: str
        """

        self._first_name = first_name

    @property
    def last_name(self):
        """Gets the last_name of this User.  # noqa: E501


        :return: The last_name of this User.  # noqa: E501
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name):
        """Sets the last_name of this User.


        :param last_name: The last_name of this User.  # noqa: E501
        :type: str
        """

        self._last_name = last_name

    @property
    def status(self):
        """Gets the status of this User.  # noqa: E501


        :return: The status of this User.  # noqa: E501
        :rtype: UserStatus
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this User.


        :param status: The status of this User.  # noqa: E501
        :type: UserStatus
        """

        self._status = status

    @property
    def last_login_at(self):
        """Gets the last_login_at of this User.  # noqa: E501


        :return: The last_login_at of this User.  # noqa: E501
        :rtype: int
        """
        return self._last_login_at

    @last_login_at.setter
    def last_login_at(self, last_login_at):
        """Sets the last_login_at of this User.


        :param last_login_at: The last_login_at of this User.  # noqa: E501
        :type: int
        """

        self._last_login_at = last_login_at

    @property
    def invitation_url(self):
        """Gets the invitation_url of this User.  # noqa: E501


        :return: The invitation_url of this User.  # noqa: E501
        :rtype: str
        """
        return self._invitation_url

    @invitation_url.setter
    def invitation_url(self, invitation_url):
        """Sets the invitation_url of this User.


        :param invitation_url: The invitation_url of this User.  # noqa: E501
        :type: str
        """

        self._invitation_url = invitation_url

    @property
    def invitation_url_expiration(self):
        """Gets the invitation_url_expiration of this User.  # noqa: E501


        :return: The invitation_url_expiration of this User.  # noqa: E501
        :rtype: int
        """
        return self._invitation_url_expiration

    @invitation_url_expiration.setter
    def invitation_url_expiration(self, invitation_url_expiration):
        """Sets the invitation_url_expiration of this User.


        :param invitation_url_expiration: The invitation_url_expiration of this User.  # noqa: E501
        :type: int
        """

        self._invitation_url_expiration = invitation_url_expiration

    @property
    def role(self):
        """Gets the role of this User.  # noqa: E501


        :return: The role of this User.  # noqa: E501
        :rtype: RoleType
        """
        return self._role

    @role.setter
    def role(self, role):
        """Sets the role of this User.


        :param role: The role of this User.  # noqa: E501
        :type: RoleType
        """

        self._role = role

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
        if issubclass(User, dict):
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
        if not isinstance(other, User):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
