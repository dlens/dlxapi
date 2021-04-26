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


class Comment(object):
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
        'project_id': 'str',
        'user': 'User',
        'value': 'str',
        'contributors_added': 'list[PortfolioPlanUser]'
    }

    attribute_map = {
        'portfolio_id': 'portfolioId',
        'project_id': 'projectId',
        'user': 'user',
        'value': 'value',
        'contributors_added': 'contributorsAdded'
    }

    def __init__(self, portfolio_id=None, project_id=None, user=None, value=None, contributors_added=None, _configuration=None):  # noqa: E501
        """Comment - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._portfolio_id = None
        self._project_id = None
        self._user = None
        self._value = None
        self._contributors_added = None
        self.discriminator = None

        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if project_id is not None:
            self.project_id = project_id
        if user is not None:
            self.user = user
        if value is not None:
            self.value = value
        if contributors_added is not None:
            self.contributors_added = contributors_added

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this Comment.  # noqa: E501


        :return: The portfolio_id of this Comment.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this Comment.


        :param portfolio_id: The portfolio_id of this Comment.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def project_id(self):
        """Gets the project_id of this Comment.  # noqa: E501


        :return: The project_id of this Comment.  # noqa: E501
        :rtype: str
        """
        return self._project_id

    @project_id.setter
    def project_id(self, project_id):
        """Sets the project_id of this Comment.


        :param project_id: The project_id of this Comment.  # noqa: E501
        :type: str
        """

        self._project_id = project_id

    @property
    def user(self):
        """Gets the user of this Comment.  # noqa: E501


        :return: The user of this Comment.  # noqa: E501
        :rtype: User
        """
        return self._user

    @user.setter
    def user(self, user):
        """Sets the user of this Comment.


        :param user: The user of this Comment.  # noqa: E501
        :type: User
        """

        self._user = user

    @property
    def value(self):
        """Gets the value of this Comment.  # noqa: E501


        :return: The value of this Comment.  # noqa: E501
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this Comment.


        :param value: The value of this Comment.  # noqa: E501
        :type: str
        """

        self._value = value

    @property
    def contributors_added(self):
        """Gets the contributors_added of this Comment.  # noqa: E501


        :return: The contributors_added of this Comment.  # noqa: E501
        :rtype: list[PortfolioPlanUser]
        """
        return self._contributors_added

    @contributors_added.setter
    def contributors_added(self, contributors_added):
        """Sets the contributors_added of this Comment.


        :param contributors_added: The contributors_added of this Comment.  # noqa: E501
        :type: list[PortfolioPlanUser]
        """

        self._contributors_added = contributors_added

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
        if issubclass(Comment, dict):
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
        if not isinstance(other, Comment):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Comment):
            return True

        return self.to_dict() != other.to_dict()