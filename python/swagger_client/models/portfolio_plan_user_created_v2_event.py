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


class PortfolioPlanUserCreatedV2Event(object):
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
        'portfolio_plan_user_role_list': 'list[PortfolioPlanUserRole]',
        'portfolio_id': 'str',
        'permissions': 'list[Permission]',
        'id': 'str',
        'contributing_project_ids': 'list[str]',
        'user': 'User',
        'portfolio_plan': 'PortfolioPlan'
    }

    attribute_map = {
        'portfolio_plan_user_role_list': 'portfolioPlanUserRoleList',
        'portfolio_id': 'portfolioId',
        'permissions': 'permissions',
        'id': 'id',
        'contributing_project_ids': 'contributingProjectIds',
        'user': 'user',
        'portfolio_plan': 'portfolioPlan'
    }

    def __init__(self, portfolio_plan_user_role_list=None, portfolio_id=None, permissions=None, id=None, contributing_project_ids=None, user=None, portfolio_plan=None):  # noqa: E501
        """PortfolioPlanUserCreatedV2Event - a model defined in Swagger"""  # noqa: E501

        self._portfolio_plan_user_role_list = None
        self._portfolio_id = None
        self._permissions = None
        self._id = None
        self._contributing_project_ids = None
        self._user = None
        self._portfolio_plan = None
        self.discriminator = None

        if portfolio_plan_user_role_list is not None:
            self.portfolio_plan_user_role_list = portfolio_plan_user_role_list
        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if permissions is not None:
            self.permissions = permissions
        if id is not None:
            self.id = id
        if contributing_project_ids is not None:
            self.contributing_project_ids = contributing_project_ids
        if user is not None:
            self.user = user
        if portfolio_plan is not None:
            self.portfolio_plan = portfolio_plan

    @property
    def portfolio_plan_user_role_list(self):
        """Gets the portfolio_plan_user_role_list of this PortfolioPlanUserCreatedV2Event.  # noqa: E501


        :return: The portfolio_plan_user_role_list of this PortfolioPlanUserCreatedV2Event.  # noqa: E501
        :rtype: list[PortfolioPlanUserRole]
        """
        return self._portfolio_plan_user_role_list

    @portfolio_plan_user_role_list.setter
    def portfolio_plan_user_role_list(self, portfolio_plan_user_role_list):
        """Sets the portfolio_plan_user_role_list of this PortfolioPlanUserCreatedV2Event.


        :param portfolio_plan_user_role_list: The portfolio_plan_user_role_list of this PortfolioPlanUserCreatedV2Event.  # noqa: E501
        :type: list[PortfolioPlanUserRole]
        """

        self._portfolio_plan_user_role_list = portfolio_plan_user_role_list

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this PortfolioPlanUserCreatedV2Event.  # noqa: E501


        :return: The portfolio_id of this PortfolioPlanUserCreatedV2Event.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this PortfolioPlanUserCreatedV2Event.


        :param portfolio_id: The portfolio_id of this PortfolioPlanUserCreatedV2Event.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def permissions(self):
        """Gets the permissions of this PortfolioPlanUserCreatedV2Event.  # noqa: E501


        :return: The permissions of this PortfolioPlanUserCreatedV2Event.  # noqa: E501
        :rtype: list[Permission]
        """
        return self._permissions

    @permissions.setter
    def permissions(self, permissions):
        """Sets the permissions of this PortfolioPlanUserCreatedV2Event.


        :param permissions: The permissions of this PortfolioPlanUserCreatedV2Event.  # noqa: E501
        :type: list[Permission]
        """

        self._permissions = permissions

    @property
    def id(self):
        """Gets the id of this PortfolioPlanUserCreatedV2Event.  # noqa: E501


        :return: The id of this PortfolioPlanUserCreatedV2Event.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PortfolioPlanUserCreatedV2Event.


        :param id: The id of this PortfolioPlanUserCreatedV2Event.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def contributing_project_ids(self):
        """Gets the contributing_project_ids of this PortfolioPlanUserCreatedV2Event.  # noqa: E501


        :return: The contributing_project_ids of this PortfolioPlanUserCreatedV2Event.  # noqa: E501
        :rtype: list[str]
        """
        return self._contributing_project_ids

    @contributing_project_ids.setter
    def contributing_project_ids(self, contributing_project_ids):
        """Sets the contributing_project_ids of this PortfolioPlanUserCreatedV2Event.


        :param contributing_project_ids: The contributing_project_ids of this PortfolioPlanUserCreatedV2Event.  # noqa: E501
        :type: list[str]
        """

        self._contributing_project_ids = contributing_project_ids

    @property
    def user(self):
        """Gets the user of this PortfolioPlanUserCreatedV2Event.  # noqa: E501


        :return: The user of this PortfolioPlanUserCreatedV2Event.  # noqa: E501
        :rtype: User
        """
        return self._user

    @user.setter
    def user(self, user):
        """Sets the user of this PortfolioPlanUserCreatedV2Event.


        :param user: The user of this PortfolioPlanUserCreatedV2Event.  # noqa: E501
        :type: User
        """

        self._user = user

    @property
    def portfolio_plan(self):
        """Gets the portfolio_plan of this PortfolioPlanUserCreatedV2Event.  # noqa: E501


        :return: The portfolio_plan of this PortfolioPlanUserCreatedV2Event.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._portfolio_plan

    @portfolio_plan.setter
    def portfolio_plan(self, portfolio_plan):
        """Sets the portfolio_plan of this PortfolioPlanUserCreatedV2Event.


        :param portfolio_plan: The portfolio_plan of this PortfolioPlanUserCreatedV2Event.  # noqa: E501
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
        if issubclass(PortfolioPlanUserCreatedV2Event, dict):
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
        if not isinstance(other, PortfolioPlanUserCreatedV2Event):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
