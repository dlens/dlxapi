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


class Project(object):
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
        'id': 'str',
        'name': 'str',
        'position': 'int',
        'field_values': 'FieldValues',
        'depends_on_project_ids': 'list[str]',
        'has_dependent_project_ids': 'list[str]',
        'contributing_user_ids': 'list[str]',
        'is_draft': 'bool',
        'rank': 'int'
    }

    attribute_map = {
        'id': 'id',
        'name': 'name',
        'position': 'position',
        'field_values': 'fieldValues',
        'depends_on_project_ids': 'dependsOnProjectIds',
        'has_dependent_project_ids': 'hasDependentProjectIds',
        'contributing_user_ids': 'contributingUserIds',
        'is_draft': 'isDraft',
        'rank': 'rank'
    }

    def __init__(self, id=None, name=None, position=None, field_values=None, depends_on_project_ids=None, has_dependent_project_ids=None, contributing_user_ids=None, is_draft=None, rank=None):  # noqa: E501
        """Project - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._name = None
        self._position = None
        self._field_values = None
        self._depends_on_project_ids = None
        self._has_dependent_project_ids = None
        self._contributing_user_ids = None
        self._is_draft = None
        self._rank = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if name is not None:
            self.name = name
        if position is not None:
            self.position = position
        if field_values is not None:
            self.field_values = field_values
        if depends_on_project_ids is not None:
            self.depends_on_project_ids = depends_on_project_ids
        if has_dependent_project_ids is not None:
            self.has_dependent_project_ids = has_dependent_project_ids
        if contributing_user_ids is not None:
            self.contributing_user_ids = contributing_user_ids
        if is_draft is not None:
            self.is_draft = is_draft
        if rank is not None:
            self.rank = rank

    @property
    def id(self):
        """Gets the id of this Project.  # noqa: E501


        :return: The id of this Project.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Project.


        :param id: The id of this Project.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def name(self):
        """Gets the name of this Project.  # noqa: E501


        :return: The name of this Project.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Project.


        :param name: The name of this Project.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def position(self):
        """Gets the position of this Project.  # noqa: E501


        :return: The position of this Project.  # noqa: E501
        :rtype: int
        """
        return self._position

    @position.setter
    def position(self, position):
        """Sets the position of this Project.


        :param position: The position of this Project.  # noqa: E501
        :type: int
        """

        self._position = position

    @property
    def field_values(self):
        """Gets the field_values of this Project.  # noqa: E501


        :return: The field_values of this Project.  # noqa: E501
        :rtype: FieldValues
        """
        return self._field_values

    @field_values.setter
    def field_values(self, field_values):
        """Sets the field_values of this Project.


        :param field_values: The field_values of this Project.  # noqa: E501
        :type: FieldValues
        """

        self._field_values = field_values

    @property
    def depends_on_project_ids(self):
        """Gets the depends_on_project_ids of this Project.  # noqa: E501


        :return: The depends_on_project_ids of this Project.  # noqa: E501
        :rtype: list[str]
        """
        return self._depends_on_project_ids

    @depends_on_project_ids.setter
    def depends_on_project_ids(self, depends_on_project_ids):
        """Sets the depends_on_project_ids of this Project.


        :param depends_on_project_ids: The depends_on_project_ids of this Project.  # noqa: E501
        :type: list[str]
        """

        self._depends_on_project_ids = depends_on_project_ids

    @property
    def has_dependent_project_ids(self):
        """Gets the has_dependent_project_ids of this Project.  # noqa: E501


        :return: The has_dependent_project_ids of this Project.  # noqa: E501
        :rtype: list[str]
        """
        return self._has_dependent_project_ids

    @has_dependent_project_ids.setter
    def has_dependent_project_ids(self, has_dependent_project_ids):
        """Sets the has_dependent_project_ids of this Project.


        :param has_dependent_project_ids: The has_dependent_project_ids of this Project.  # noqa: E501
        :type: list[str]
        """

        self._has_dependent_project_ids = has_dependent_project_ids

    @property
    def contributing_user_ids(self):
        """Gets the contributing_user_ids of this Project.  # noqa: E501


        :return: The contributing_user_ids of this Project.  # noqa: E501
        :rtype: list[str]
        """
        return self._contributing_user_ids

    @contributing_user_ids.setter
    def contributing_user_ids(self, contributing_user_ids):
        """Sets the contributing_user_ids of this Project.


        :param contributing_user_ids: The contributing_user_ids of this Project.  # noqa: E501
        :type: list[str]
        """

        self._contributing_user_ids = contributing_user_ids

    @property
    def is_draft(self):
        """Gets the is_draft of this Project.  # noqa: E501


        :return: The is_draft of this Project.  # noqa: E501
        :rtype: bool
        """
        return self._is_draft

    @is_draft.setter
    def is_draft(self, is_draft):
        """Sets the is_draft of this Project.


        :param is_draft: The is_draft of this Project.  # noqa: E501
        :type: bool
        """

        self._is_draft = is_draft

    @property
    def rank(self):
        """Gets the rank of this Project.  # noqa: E501


        :return: The rank of this Project.  # noqa: E501
        :rtype: int
        """
        return self._rank

    @rank.setter
    def rank(self, rank):
        """Sets the rank of this Project.


        :param rank: The rank of this Project.  # noqa: E501
        :type: int
        """

        self._rank = rank

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
        if issubclass(Project, dict):
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
        if not isinstance(other, Project):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
