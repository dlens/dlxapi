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


class UserRegistrationToken(object):
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
        'portfolio_id': 'str',
        'group': 'Group',
        'role': 'PortfolioPlanUserRole',
        'expires_at': 'int'
    }

    attribute_map = {
        'portfolio_id': 'portfolioId',
        'group': 'group',
        'role': 'role',
        'expires_at': 'expiresAt'
    }

    def __init__(self, portfolio_id=None, group=None, role=None, expires_at=None, _configuration=None):  # noqa: E501
        """UserRegistrationToken - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._portfolio_id = None
        self._group = None
        self._role = None
        self._expires_at = None
        self.discriminator = None

        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if group is not None:
            self.group = group
        if role is not None:
            self.role = role
        if expires_at is not None:
            self.expires_at = expires_at

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this UserRegistrationToken.  # noqa: E501

        portfolio id  # noqa: E501

        :return: The portfolio_id of this UserRegistrationToken.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this UserRegistrationToken.

        portfolio id  # noqa: E501

        :param portfolio_id: The portfolio_id of this UserRegistrationToken.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def group(self):
        """Gets the group of this UserRegistrationToken.  # noqa: E501


        :return: The group of this UserRegistrationToken.  # noqa: E501
        :rtype: Group
        """
        return self._group

    @group.setter
    def group(self, group):
        """Sets the group of this UserRegistrationToken.


        :param group: The group of this UserRegistrationToken.  # noqa: E501
        :type: Group
        """

        self._group = group

    @property
    def role(self):
        """Gets the role of this UserRegistrationToken.  # noqa: E501

        portfolio plan user role  # noqa: E501

        :return: The role of this UserRegistrationToken.  # noqa: E501
        :rtype: PortfolioPlanUserRole
        """
        return self._role

    @role.setter
    def role(self, role):
        """Sets the role of this UserRegistrationToken.

        portfolio plan user role  # noqa: E501

        :param role: The role of this UserRegistrationToken.  # noqa: E501
        :type: PortfolioPlanUserRole
        """

        self._role = role

    @property
    def expires_at(self):
        """Gets the expires_at of this UserRegistrationToken.  # noqa: E501


        :return: The expires_at of this UserRegistrationToken.  # noqa: E501
        :rtype: int
        """
        return self._expires_at

    @expires_at.setter
    def expires_at(self, expires_at):
        """Sets the expires_at of this UserRegistrationToken.


        :param expires_at: The expires_at of this UserRegistrationToken.  # noqa: E501
        :type: int
        """

        self._expires_at = expires_at

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
        if issubclass(UserRegistrationToken, dict):
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
        if not isinstance(other, UserRegistrationToken):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, UserRegistrationToken):
            return True

        return self.to_dict() != other.to_dict()