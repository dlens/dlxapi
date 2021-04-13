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


class AddUsersRequest(object):
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
        'email_ids': 'list[str]',
        'role': 'PortfolioPlanUserRole',
        'message': 'str',
        'do_not_notify': 'bool'
    }

    attribute_map = {
        'email_ids': 'emailIds',
        'role': 'role',
        'message': 'message',
        'do_not_notify': 'doNotNotify'
    }

    def __init__(self, email_ids=None, role=None, message=None, do_not_notify=None, _configuration=None):  # noqa: E501
        """AddUsersRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._email_ids = None
        self._role = None
        self._message = None
        self._do_not_notify = None
        self.discriminator = None

        if email_ids is not None:
            self.email_ids = email_ids
        if role is not None:
            self.role = role
        if message is not None:
            self.message = message
        if do_not_notify is not None:
            self.do_not_notify = do_not_notify

    @property
    def email_ids(self):
        """Gets the email_ids of this AddUsersRequest.  # noqa: E501


        :return: The email_ids of this AddUsersRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._email_ids

    @email_ids.setter
    def email_ids(self, email_ids):
        """Sets the email_ids of this AddUsersRequest.


        :param email_ids: The email_ids of this AddUsersRequest.  # noqa: E501
        :type: list[str]
        """

        self._email_ids = email_ids

    @property
    def role(self):
        """Gets the role of this AddUsersRequest.  # noqa: E501


        :return: The role of this AddUsersRequest.  # noqa: E501
        :rtype: PortfolioPlanUserRole
        """
        return self._role

    @role.setter
    def role(self, role):
        """Sets the role of this AddUsersRequest.


        :param role: The role of this AddUsersRequest.  # noqa: E501
        :type: PortfolioPlanUserRole
        """

        self._role = role

    @property
    def message(self):
        """Gets the message of this AddUsersRequest.  # noqa: E501


        :return: The message of this AddUsersRequest.  # noqa: E501
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """Sets the message of this AddUsersRequest.


        :param message: The message of this AddUsersRequest.  # noqa: E501
        :type: str
        """

        self._message = message

    @property
    def do_not_notify(self):
        """Gets the do_not_notify of this AddUsersRequest.  # noqa: E501


        :return: The do_not_notify of this AddUsersRequest.  # noqa: E501
        :rtype: bool
        """
        return self._do_not_notify

    @do_not_notify.setter
    def do_not_notify(self, do_not_notify):
        """Sets the do_not_notify of this AddUsersRequest.


        :param do_not_notify: The do_not_notify of this AddUsersRequest.  # noqa: E501
        :type: bool
        """

        self._do_not_notify = do_not_notify

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
        if issubclass(AddUsersRequest, dict):
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
        if not isinstance(other, AddUsersRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, AddUsersRequest):
            return True

        return self.to_dict() != other.to_dict()
