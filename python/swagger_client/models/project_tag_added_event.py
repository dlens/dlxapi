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


class ProjectTagAddedEvent(object):
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
        'tag_parent_name': 'str',
        'tag_id': 'str',
        'tag_color': 'str',
        'name': 'str',
        'id': 'str',
        'tag_name': 'str',
        'tag_parent_id': 'str',
        'portfolio_plan': 'PortfolioPlan'
    }

    attribute_map = {
        'portfolio_id': 'portfolioId',
        'tag_parent_name': 'tagParentName',
        'tag_id': 'tagId',
        'tag_color': 'tagColor',
        'name': 'name',
        'id': 'id',
        'tag_name': 'tagName',
        'tag_parent_id': 'tagParentId',
        'portfolio_plan': 'portfolioPlan'
    }

    def __init__(self, portfolio_id=None, tag_parent_name=None, tag_id=None, tag_color=None, name=None, id=None, tag_name=None, tag_parent_id=None, portfolio_plan=None, _configuration=None):  # noqa: E501
        """ProjectTagAddedEvent - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._portfolio_id = None
        self._tag_parent_name = None
        self._tag_id = None
        self._tag_color = None
        self._name = None
        self._id = None
        self._tag_name = None
        self._tag_parent_id = None
        self._portfolio_plan = None
        self.discriminator = None

        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if tag_parent_name is not None:
            self.tag_parent_name = tag_parent_name
        if tag_id is not None:
            self.tag_id = tag_id
        if tag_color is not None:
            self.tag_color = tag_color
        if name is not None:
            self.name = name
        if id is not None:
            self.id = id
        if tag_name is not None:
            self.tag_name = tag_name
        if tag_parent_id is not None:
            self.tag_parent_id = tag_parent_id
        if portfolio_plan is not None:
            self.portfolio_plan = portfolio_plan

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this ProjectTagAddedEvent.  # noqa: E501


        :return: The portfolio_id of this ProjectTagAddedEvent.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this ProjectTagAddedEvent.


        :param portfolio_id: The portfolio_id of this ProjectTagAddedEvent.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def tag_parent_name(self):
        """Gets the tag_parent_name of this ProjectTagAddedEvent.  # noqa: E501


        :return: The tag_parent_name of this ProjectTagAddedEvent.  # noqa: E501
        :rtype: str
        """
        return self._tag_parent_name

    @tag_parent_name.setter
    def tag_parent_name(self, tag_parent_name):
        """Sets the tag_parent_name of this ProjectTagAddedEvent.


        :param tag_parent_name: The tag_parent_name of this ProjectTagAddedEvent.  # noqa: E501
        :type: str
        """

        self._tag_parent_name = tag_parent_name

    @property
    def tag_id(self):
        """Gets the tag_id of this ProjectTagAddedEvent.  # noqa: E501


        :return: The tag_id of this ProjectTagAddedEvent.  # noqa: E501
        :rtype: str
        """
        return self._tag_id

    @tag_id.setter
    def tag_id(self, tag_id):
        """Sets the tag_id of this ProjectTagAddedEvent.


        :param tag_id: The tag_id of this ProjectTagAddedEvent.  # noqa: E501
        :type: str
        """

        self._tag_id = tag_id

    @property
    def tag_color(self):
        """Gets the tag_color of this ProjectTagAddedEvent.  # noqa: E501


        :return: The tag_color of this ProjectTagAddedEvent.  # noqa: E501
        :rtype: str
        """
        return self._tag_color

    @tag_color.setter
    def tag_color(self, tag_color):
        """Sets the tag_color of this ProjectTagAddedEvent.


        :param tag_color: The tag_color of this ProjectTagAddedEvent.  # noqa: E501
        :type: str
        """

        self._tag_color = tag_color

    @property
    def name(self):
        """Gets the name of this ProjectTagAddedEvent.  # noqa: E501


        :return: The name of this ProjectTagAddedEvent.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ProjectTagAddedEvent.


        :param name: The name of this ProjectTagAddedEvent.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def id(self):
        """Gets the id of this ProjectTagAddedEvent.  # noqa: E501


        :return: The id of this ProjectTagAddedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ProjectTagAddedEvent.


        :param id: The id of this ProjectTagAddedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def tag_name(self):
        """Gets the tag_name of this ProjectTagAddedEvent.  # noqa: E501


        :return: The tag_name of this ProjectTagAddedEvent.  # noqa: E501
        :rtype: str
        """
        return self._tag_name

    @tag_name.setter
    def tag_name(self, tag_name):
        """Sets the tag_name of this ProjectTagAddedEvent.


        :param tag_name: The tag_name of this ProjectTagAddedEvent.  # noqa: E501
        :type: str
        """

        self._tag_name = tag_name

    @property
    def tag_parent_id(self):
        """Gets the tag_parent_id of this ProjectTagAddedEvent.  # noqa: E501


        :return: The tag_parent_id of this ProjectTagAddedEvent.  # noqa: E501
        :rtype: str
        """
        return self._tag_parent_id

    @tag_parent_id.setter
    def tag_parent_id(self, tag_parent_id):
        """Sets the tag_parent_id of this ProjectTagAddedEvent.


        :param tag_parent_id: The tag_parent_id of this ProjectTagAddedEvent.  # noqa: E501
        :type: str
        """

        self._tag_parent_id = tag_parent_id

    @property
    def portfolio_plan(self):
        """Gets the portfolio_plan of this ProjectTagAddedEvent.  # noqa: E501


        :return: The portfolio_plan of this ProjectTagAddedEvent.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._portfolio_plan

    @portfolio_plan.setter
    def portfolio_plan(self, portfolio_plan):
        """Sets the portfolio_plan of this ProjectTagAddedEvent.


        :param portfolio_plan: The portfolio_plan of this ProjectTagAddedEvent.  # noqa: E501
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
        if issubclass(ProjectTagAddedEvent, dict):
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
        if not isinstance(other, ProjectTagAddedEvent):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ProjectTagAddedEvent):
            return True

        return self.to_dict() != other.to_dict()
