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


class RegisterUserRequest(object):
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
        'user_registration_token': 'str',
        'email_id': 'str',
        'landing_page': 'str',
        'do_not_notify': 'bool'
    }

    attribute_map = {
        'user_registration_token': 'userRegistrationToken',
        'email_id': 'emailId',
        'landing_page': 'landingPage',
        'do_not_notify': 'doNotNotify'
    }

    def __init__(self, user_registration_token=None, email_id=None, landing_page=None, do_not_notify=False, _configuration=None):  # noqa: E501
        """RegisterUserRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._user_registration_token = None
        self._email_id = None
        self._landing_page = None
        self._do_not_notify = None
        self.discriminator = None

        self.user_registration_token = user_registration_token
        if email_id is not None:
            self.email_id = email_id
        if landing_page is not None:
            self.landing_page = landing_page
        if do_not_notify is not None:
            self.do_not_notify = do_not_notify

    @property
    def user_registration_token(self):
        """Gets the user_registration_token of this RegisterUserRequest.  # noqa: E501


        :return: The user_registration_token of this RegisterUserRequest.  # noqa: E501
        :rtype: str
        """
        return self._user_registration_token

    @user_registration_token.setter
    def user_registration_token(self, user_registration_token):
        """Sets the user_registration_token of this RegisterUserRequest.


        :param user_registration_token: The user_registration_token of this RegisterUserRequest.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and user_registration_token is None:
            raise ValueError("Invalid value for `user_registration_token`, must not be `None`")  # noqa: E501

        self._user_registration_token = user_registration_token

    @property
    def email_id(self):
        """Gets the email_id of this RegisterUserRequest.  # noqa: E501


        :return: The email_id of this RegisterUserRequest.  # noqa: E501
        :rtype: str
        """
        return self._email_id

    @email_id.setter
    def email_id(self, email_id):
        """Sets the email_id of this RegisterUserRequest.


        :param email_id: The email_id of this RegisterUserRequest.  # noqa: E501
        :type: str
        """

        self._email_id = email_id

    @property
    def landing_page(self):
        """Gets the landing_page of this RegisterUserRequest.  # noqa: E501


        :return: The landing_page of this RegisterUserRequest.  # noqa: E501
        :rtype: str
        """
        return self._landing_page

    @landing_page.setter
    def landing_page(self, landing_page):
        """Sets the landing_page of this RegisterUserRequest.


        :param landing_page: The landing_page of this RegisterUserRequest.  # noqa: E501
        :type: str
        """

        self._landing_page = landing_page

    @property
    def do_not_notify(self):
        """Gets the do_not_notify of this RegisterUserRequest.  # noqa: E501


        :return: The do_not_notify of this RegisterUserRequest.  # noqa: E501
        :rtype: bool
        """
        return self._do_not_notify

    @do_not_notify.setter
    def do_not_notify(self, do_not_notify):
        """Sets the do_not_notify of this RegisterUserRequest.


        :param do_not_notify: The do_not_notify of this RegisterUserRequest.  # noqa: E501
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
        if issubclass(RegisterUserRequest, dict):
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
        if not isinstance(other, RegisterUserRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, RegisterUserRequest):
            return True

        return self.to_dict() != other.to_dict()
