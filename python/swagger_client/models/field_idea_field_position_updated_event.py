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


class FieldIdeaFieldPositionUpdatedEvent(object):
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
        'name': 'str',
        'previous_idea_field_position': 'int',
        'id': 'str',
        'idea_field_position': 'int',
        'portfolio_plan': 'PortfolioPlan'
    }

    attribute_map = {
        'portfolio_id': 'portfolioId',
        'name': 'name',
        'previous_idea_field_position': 'previousIdeaFieldPosition',
        'id': 'id',
        'idea_field_position': 'ideaFieldPosition',
        'portfolio_plan': 'portfolioPlan'
    }

    def __init__(self, portfolio_id=None, name=None, previous_idea_field_position=None, id=None, idea_field_position=None, portfolio_plan=None, _configuration=None):  # noqa: E501
        """FieldIdeaFieldPositionUpdatedEvent - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._portfolio_id = None
        self._name = None
        self._previous_idea_field_position = None
        self._id = None
        self._idea_field_position = None
        self._portfolio_plan = None
        self.discriminator = None

        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if name is not None:
            self.name = name
        if previous_idea_field_position is not None:
            self.previous_idea_field_position = previous_idea_field_position
        if id is not None:
            self.id = id
        if idea_field_position is not None:
            self.idea_field_position = idea_field_position
        if portfolio_plan is not None:
            self.portfolio_plan = portfolio_plan

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501


        :return: The portfolio_id of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this FieldIdeaFieldPositionUpdatedEvent.


        :param portfolio_id: The portfolio_id of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def name(self):
        """Gets the name of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501


        :return: The name of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this FieldIdeaFieldPositionUpdatedEvent.


        :param name: The name of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def previous_idea_field_position(self):
        """Gets the previous_idea_field_position of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501


        :return: The previous_idea_field_position of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501
        :rtype: int
        """
        return self._previous_idea_field_position

    @previous_idea_field_position.setter
    def previous_idea_field_position(self, previous_idea_field_position):
        """Sets the previous_idea_field_position of this FieldIdeaFieldPositionUpdatedEvent.


        :param previous_idea_field_position: The previous_idea_field_position of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501
        :type: int
        """

        self._previous_idea_field_position = previous_idea_field_position

    @property
    def id(self):
        """Gets the id of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501


        :return: The id of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this FieldIdeaFieldPositionUpdatedEvent.


        :param id: The id of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def idea_field_position(self):
        """Gets the idea_field_position of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501


        :return: The idea_field_position of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501
        :rtype: int
        """
        return self._idea_field_position

    @idea_field_position.setter
    def idea_field_position(self, idea_field_position):
        """Sets the idea_field_position of this FieldIdeaFieldPositionUpdatedEvent.


        :param idea_field_position: The idea_field_position of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501
        :type: int
        """

        self._idea_field_position = idea_field_position

    @property
    def portfolio_plan(self):
        """Gets the portfolio_plan of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501


        :return: The portfolio_plan of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._portfolio_plan

    @portfolio_plan.setter
    def portfolio_plan(self, portfolio_plan):
        """Sets the portfolio_plan of this FieldIdeaFieldPositionUpdatedEvent.


        :param portfolio_plan: The portfolio_plan of this FieldIdeaFieldPositionUpdatedEvent.  # noqa: E501
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
        if issubclass(FieldIdeaFieldPositionUpdatedEvent, dict):
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
        if not isinstance(other, FieldIdeaFieldPositionUpdatedEvent):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, FieldIdeaFieldPositionUpdatedEvent):
            return True

        return self.to_dict() != other.to_dict()
