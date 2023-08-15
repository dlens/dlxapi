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


class CommentAddedEvent(object):
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
        'id': 'str',
        'project_name': 'str',
        'user_id': 'str',
        'project_id': 'str',
        'value': 'str',
        'portfolio_plan': 'PortfolioPlan'
    }

    attribute_map = {
        'portfolio_id': 'portfolioId',
        'id': 'id',
        'project_name': 'projectName',
        'user_id': 'userId',
        'project_id': 'projectId',
        'value': 'value',
        'portfolio_plan': 'portfolioPlan'
    }

    def __init__(self, portfolio_id=None, id=None, project_name=None, user_id=None, project_id=None, value=None, portfolio_plan=None):  # noqa: E501
        """CommentAddedEvent - a model defined in Swagger"""  # noqa: E501

        self._portfolio_id = None
        self._id = None
        self._project_name = None
        self._user_id = None
        self._project_id = None
        self._value = None
        self._portfolio_plan = None
        self.discriminator = None

        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if id is not None:
            self.id = id
        if project_name is not None:
            self.project_name = project_name
        if user_id is not None:
            self.user_id = user_id
        if project_id is not None:
            self.project_id = project_id
        if value is not None:
            self.value = value
        if portfolio_plan is not None:
            self.portfolio_plan = portfolio_plan

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this CommentAddedEvent.  # noqa: E501


        :return: The portfolio_id of this CommentAddedEvent.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this CommentAddedEvent.


        :param portfolio_id: The portfolio_id of this CommentAddedEvent.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def id(self):
        """Gets the id of this CommentAddedEvent.  # noqa: E501


        :return: The id of this CommentAddedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this CommentAddedEvent.


        :param id: The id of this CommentAddedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def project_name(self):
        """Gets the project_name of this CommentAddedEvent.  # noqa: E501


        :return: The project_name of this CommentAddedEvent.  # noqa: E501
        :rtype: str
        """
        return self._project_name

    @project_name.setter
    def project_name(self, project_name):
        """Sets the project_name of this CommentAddedEvent.


        :param project_name: The project_name of this CommentAddedEvent.  # noqa: E501
        :type: str
        """

        self._project_name = project_name

    @property
    def user_id(self):
        """Gets the user_id of this CommentAddedEvent.  # noqa: E501


        :return: The user_id of this CommentAddedEvent.  # noqa: E501
        :rtype: str
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """Sets the user_id of this CommentAddedEvent.


        :param user_id: The user_id of this CommentAddedEvent.  # noqa: E501
        :type: str
        """

        self._user_id = user_id

    @property
    def project_id(self):
        """Gets the project_id of this CommentAddedEvent.  # noqa: E501


        :return: The project_id of this CommentAddedEvent.  # noqa: E501
        :rtype: str
        """
        return self._project_id

    @project_id.setter
    def project_id(self, project_id):
        """Sets the project_id of this CommentAddedEvent.


        :param project_id: The project_id of this CommentAddedEvent.  # noqa: E501
        :type: str
        """

        self._project_id = project_id

    @property
    def value(self):
        """Gets the value of this CommentAddedEvent.  # noqa: E501


        :return: The value of this CommentAddedEvent.  # noqa: E501
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this CommentAddedEvent.


        :param value: The value of this CommentAddedEvent.  # noqa: E501
        :type: str
        """

        self._value = value

    @property
    def portfolio_plan(self):
        """Gets the portfolio_plan of this CommentAddedEvent.  # noqa: E501


        :return: The portfolio_plan of this CommentAddedEvent.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._portfolio_plan

    @portfolio_plan.setter
    def portfolio_plan(self, portfolio_plan):
        """Sets the portfolio_plan of this CommentAddedEvent.


        :param portfolio_plan: The portfolio_plan of this CommentAddedEvent.  # noqa: E501
        :type: PortfolioPlan
        """

        self._portfolio_plan = portfolio_plan

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
        if issubclass(CommentAddedEvent, dict):
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
        if not isinstance(other, CommentAddedEvent):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
