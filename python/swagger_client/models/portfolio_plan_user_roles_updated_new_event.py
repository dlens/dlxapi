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


class PortfolioPlanUserRolesUpdatedNewEvent(object):
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
        'previous_portfolio_plan_user_role_list': 'list[PortfolioPlanUserRole]',
        'portfolio_plan_user_role_list': 'list[PortfolioPlanUserRole]',
        'portfolio_id': 'str',
        'id': 'str',
        'user': 'User',
        'portfolio_plan': 'PortfolioPlan'
    }

    attribute_map = {
        'previous_portfolio_plan_user_role_list': 'previousPortfolioPlanUserRoleList',
        'portfolio_plan_user_role_list': 'portfolioPlanUserRoleList',
        'portfolio_id': 'portfolioId',
        'id': 'id',
        'user': 'user',
        'portfolio_plan': 'portfolioPlan'
    }

    def __init__(self, previous_portfolio_plan_user_role_list=None, portfolio_plan_user_role_list=None, portfolio_id=None, id=None, user=None, portfolio_plan=None):  # noqa: E501
        """PortfolioPlanUserRolesUpdatedNewEvent - a model defined in Swagger"""  # noqa: E501

        self._previous_portfolio_plan_user_role_list = None
        self._portfolio_plan_user_role_list = None
        self._portfolio_id = None
        self._id = None
        self._user = None
        self._portfolio_plan = None
        self.discriminator = None

        if previous_portfolio_plan_user_role_list is not None:
            self.previous_portfolio_plan_user_role_list = previous_portfolio_plan_user_role_list
        if portfolio_plan_user_role_list is not None:
            self.portfolio_plan_user_role_list = portfolio_plan_user_role_list
        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if id is not None:
            self.id = id
        if user is not None:
            self.user = user
        if portfolio_plan is not None:
            self.portfolio_plan = portfolio_plan

    @property
    def previous_portfolio_plan_user_role_list(self):
        """Gets the previous_portfolio_plan_user_role_list of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501


        :return: The previous_portfolio_plan_user_role_list of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501
        :rtype: list[PortfolioPlanUserRole]
        """
        return self._previous_portfolio_plan_user_role_list

    @previous_portfolio_plan_user_role_list.setter
    def previous_portfolio_plan_user_role_list(self, previous_portfolio_plan_user_role_list):
        """Sets the previous_portfolio_plan_user_role_list of this PortfolioPlanUserRolesUpdatedNewEvent.


        :param previous_portfolio_plan_user_role_list: The previous_portfolio_plan_user_role_list of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501
        :type: list[PortfolioPlanUserRole]
        """

        self._previous_portfolio_plan_user_role_list = previous_portfolio_plan_user_role_list

    @property
    def portfolio_plan_user_role_list(self):
        """Gets the portfolio_plan_user_role_list of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501


        :return: The portfolio_plan_user_role_list of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501
        :rtype: list[PortfolioPlanUserRole]
        """
        return self._portfolio_plan_user_role_list

    @portfolio_plan_user_role_list.setter
    def portfolio_plan_user_role_list(self, portfolio_plan_user_role_list):
        """Sets the portfolio_plan_user_role_list of this PortfolioPlanUserRolesUpdatedNewEvent.


        :param portfolio_plan_user_role_list: The portfolio_plan_user_role_list of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501
        :type: list[PortfolioPlanUserRole]
        """

        self._portfolio_plan_user_role_list = portfolio_plan_user_role_list

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501


        :return: The portfolio_id of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this PortfolioPlanUserRolesUpdatedNewEvent.


        :param portfolio_id: The portfolio_id of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def id(self):
        """Gets the id of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501


        :return: The id of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PortfolioPlanUserRolesUpdatedNewEvent.


        :param id: The id of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def user(self):
        """Gets the user of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501


        :return: The user of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501
        :rtype: User
        """
        return self._user

    @user.setter
    def user(self, user):
        """Sets the user of this PortfolioPlanUserRolesUpdatedNewEvent.


        :param user: The user of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501
        :type: User
        """

        self._user = user

    @property
    def portfolio_plan(self):
        """Gets the portfolio_plan of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501


        :return: The portfolio_plan of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._portfolio_plan

    @portfolio_plan.setter
    def portfolio_plan(self, portfolio_plan):
        """Sets the portfolio_plan of this PortfolioPlanUserRolesUpdatedNewEvent.


        :param portfolio_plan: The portfolio_plan of this PortfolioPlanUserRolesUpdatedNewEvent.  # noqa: E501
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
        if issubclass(PortfolioPlanUserRolesUpdatedNewEvent, dict):
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
        if not isinstance(other, PortfolioPlanUserRolesUpdatedNewEvent):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
