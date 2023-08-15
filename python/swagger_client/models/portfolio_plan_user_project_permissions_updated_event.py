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


class PortfolioPlanUserProjectPermissionsUpdatedEvent(object):
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
        'project_permissions': 'list[Permission]',
        'portfolio_id': 'str',
        'previous_permissions': 'list[Permission]',
        'id': 'str',
        'user': 'User',
        'portfolio_plan': 'PortfolioPlan'
    }

    attribute_map = {
        'portfolio_plan_user_role_list': 'portfolioPlanUserRoleList',
        'project_permissions': 'projectPermissions',
        'portfolio_id': 'portfolioId',
        'previous_permissions': 'previousPermissions',
        'id': 'id',
        'user': 'user',
        'portfolio_plan': 'portfolioPlan'
    }

    def __init__(self, portfolio_plan_user_role_list=None, project_permissions=None, portfolio_id=None, previous_permissions=None, id=None, user=None, portfolio_plan=None):  # noqa: E501
        """PortfolioPlanUserProjectPermissionsUpdatedEvent - a model defined in Swagger"""  # noqa: E501

        self._portfolio_plan_user_role_list = None
        self._project_permissions = None
        self._portfolio_id = None
        self._previous_permissions = None
        self._id = None
        self._user = None
        self._portfolio_plan = None
        self.discriminator = None

        if portfolio_plan_user_role_list is not None:
            self.portfolio_plan_user_role_list = portfolio_plan_user_role_list
        if project_permissions is not None:
            self.project_permissions = project_permissions
        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if previous_permissions is not None:
            self.previous_permissions = previous_permissions
        if id is not None:
            self.id = id
        if user is not None:
            self.user = user
        if portfolio_plan is not None:
            self.portfolio_plan = portfolio_plan

    @property
    def portfolio_plan_user_role_list(self):
        """Gets the portfolio_plan_user_role_list of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501


        :return: The portfolio_plan_user_role_list of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501
        :rtype: list[PortfolioPlanUserRole]
        """
        return self._portfolio_plan_user_role_list

    @portfolio_plan_user_role_list.setter
    def portfolio_plan_user_role_list(self, portfolio_plan_user_role_list):
        """Sets the portfolio_plan_user_role_list of this PortfolioPlanUserProjectPermissionsUpdatedEvent.


        :param portfolio_plan_user_role_list: The portfolio_plan_user_role_list of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501
        :type: list[PortfolioPlanUserRole]
        """

        self._portfolio_plan_user_role_list = portfolio_plan_user_role_list

    @property
    def project_permissions(self):
        """Gets the project_permissions of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501


        :return: The project_permissions of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501
        :rtype: list[Permission]
        """
        return self._project_permissions

    @project_permissions.setter
    def project_permissions(self, project_permissions):
        """Sets the project_permissions of this PortfolioPlanUserProjectPermissionsUpdatedEvent.


        :param project_permissions: The project_permissions of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501
        :type: list[Permission]
        """

        self._project_permissions = project_permissions

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501


        :return: The portfolio_id of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this PortfolioPlanUserProjectPermissionsUpdatedEvent.


        :param portfolio_id: The portfolio_id of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def previous_permissions(self):
        """Gets the previous_permissions of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501


        :return: The previous_permissions of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501
        :rtype: list[Permission]
        """
        return self._previous_permissions

    @previous_permissions.setter
    def previous_permissions(self, previous_permissions):
        """Sets the previous_permissions of this PortfolioPlanUserProjectPermissionsUpdatedEvent.


        :param previous_permissions: The previous_permissions of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501
        :type: list[Permission]
        """

        self._previous_permissions = previous_permissions

    @property
    def id(self):
        """Gets the id of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501


        :return: The id of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PortfolioPlanUserProjectPermissionsUpdatedEvent.


        :param id: The id of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def user(self):
        """Gets the user of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501


        :return: The user of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501
        :rtype: User
        """
        return self._user

    @user.setter
    def user(self, user):
        """Sets the user of this PortfolioPlanUserProjectPermissionsUpdatedEvent.


        :param user: The user of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501
        :type: User
        """

        self._user = user

    @property
    def portfolio_plan(self):
        """Gets the portfolio_plan of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501


        :return: The portfolio_plan of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._portfolio_plan

    @portfolio_plan.setter
    def portfolio_plan(self, portfolio_plan):
        """Sets the portfolio_plan of this PortfolioPlanUserProjectPermissionsUpdatedEvent.


        :param portfolio_plan: The portfolio_plan of this PortfolioPlanUserProjectPermissionsUpdatedEvent.  # noqa: E501
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
        if issubclass(PortfolioPlanUserProjectPermissionsUpdatedEvent, dict):
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
        if not isinstance(other, PortfolioPlanUserProjectPermissionsUpdatedEvent):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
