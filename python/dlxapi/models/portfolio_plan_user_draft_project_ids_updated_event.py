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


class PortfolioPlanUserDraftProjectIdsUpdatedEvent(object):
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
        'previous_draft_project_ids': 'list[str]',
        'id': 'str',
        'user': 'User',
        'draft_project_ids': 'list[str]',
        'portfolio_plan': 'PortfolioPlan'
    }

    attribute_map = {
        'portfolio_id': 'portfolioId',
        'previous_draft_project_ids': 'previousDraftProjectIds',
        'id': 'id',
        'user': 'user',
        'draft_project_ids': 'draftProjectIds',
        'portfolio_plan': 'portfolioPlan'
    }

    def __init__(self, portfolio_id=None, previous_draft_project_ids=None, id=None, user=None, draft_project_ids=None, portfolio_plan=None, _configuration=None):  # noqa: E501
        """PortfolioPlanUserDraftProjectIdsUpdatedEvent - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._portfolio_id = None
        self._previous_draft_project_ids = None
        self._id = None
        self._user = None
        self._draft_project_ids = None
        self._portfolio_plan = None
        self.discriminator = None

        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if previous_draft_project_ids is not None:
            self.previous_draft_project_ids = previous_draft_project_ids
        if id is not None:
            self.id = id
        if user is not None:
            self.user = user
        if draft_project_ids is not None:
            self.draft_project_ids = draft_project_ids
        if portfolio_plan is not None:
            self.portfolio_plan = portfolio_plan

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501


        :return: The portfolio_id of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.


        :param portfolio_id: The portfolio_id of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def previous_draft_project_ids(self):
        """Gets the previous_draft_project_ids of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501


        :return: The previous_draft_project_ids of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501
        :rtype: list[str]
        """
        return self._previous_draft_project_ids

    @previous_draft_project_ids.setter
    def previous_draft_project_ids(self, previous_draft_project_ids):
        """Sets the previous_draft_project_ids of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.


        :param previous_draft_project_ids: The previous_draft_project_ids of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501
        :type: list[str]
        """

        self._previous_draft_project_ids = previous_draft_project_ids

    @property
    def id(self):
        """Gets the id of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501


        :return: The id of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.


        :param id: The id of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def user(self):
        """Gets the user of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501


        :return: The user of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501
        :rtype: User
        """
        return self._user

    @user.setter
    def user(self, user):
        """Sets the user of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.


        :param user: The user of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501
        :type: User
        """

        self._user = user

    @property
    def draft_project_ids(self):
        """Gets the draft_project_ids of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501


        :return: The draft_project_ids of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501
        :rtype: list[str]
        """
        return self._draft_project_ids

    @draft_project_ids.setter
    def draft_project_ids(self, draft_project_ids):
        """Sets the draft_project_ids of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.


        :param draft_project_ids: The draft_project_ids of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501
        :type: list[str]
        """

        self._draft_project_ids = draft_project_ids

    @property
    def portfolio_plan(self):
        """Gets the portfolio_plan of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501


        :return: The portfolio_plan of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._portfolio_plan

    @portfolio_plan.setter
    def portfolio_plan(self, portfolio_plan):
        """Sets the portfolio_plan of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.


        :param portfolio_plan: The portfolio_plan of this PortfolioPlanUserDraftProjectIdsUpdatedEvent.  # noqa: E501
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
        if issubclass(PortfolioPlanUserDraftProjectIdsUpdatedEvent, dict):
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
        if not isinstance(other, PortfolioPlanUserDraftProjectIdsUpdatedEvent):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PortfolioPlanUserDraftProjectIdsUpdatedEvent):
            return True

        return self.to_dict() != other.to_dict()