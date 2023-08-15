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


class UserGroupAddedEvent(object):
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
        'user': 'User',
        'added_by_user': 'User',
        'group_id': 'str',
        'locked': 'bool'
    }

    attribute_map = {
        'id': 'id',
        'user': 'user',
        'added_by_user': 'addedByUser',
        'group_id': 'groupId',
        'locked': 'locked'
    }

    def __init__(self, id=None, user=None, added_by_user=None, group_id=None, locked=None):  # noqa: E501
        """UserGroupAddedEvent - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._user = None
        self._added_by_user = None
        self._group_id = None
        self._locked = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if user is not None:
            self.user = user
        if added_by_user is not None:
            self.added_by_user = added_by_user
        if group_id is not None:
            self.group_id = group_id
        if locked is not None:
            self.locked = locked

    @property
    def id(self):
        """Gets the id of this UserGroupAddedEvent.  # noqa: E501


        :return: The id of this UserGroupAddedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this UserGroupAddedEvent.


        :param id: The id of this UserGroupAddedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def user(self):
        """Gets the user of this UserGroupAddedEvent.  # noqa: E501


        :return: The user of this UserGroupAddedEvent.  # noqa: E501
        :rtype: User
        """
        return self._user

    @user.setter
    def user(self, user):
        """Sets the user of this UserGroupAddedEvent.


        :param user: The user of this UserGroupAddedEvent.  # noqa: E501
        :type: User
        """

        self._user = user

    @property
    def added_by_user(self):
        """Gets the added_by_user of this UserGroupAddedEvent.  # noqa: E501


        :return: The added_by_user of this UserGroupAddedEvent.  # noqa: E501
        :rtype: User
        """
        return self._added_by_user

    @added_by_user.setter
    def added_by_user(self, added_by_user):
        """Sets the added_by_user of this UserGroupAddedEvent.


        :param added_by_user: The added_by_user of this UserGroupAddedEvent.  # noqa: E501
        :type: User
        """

        self._added_by_user = added_by_user

    @property
    def group_id(self):
        """Gets the group_id of this UserGroupAddedEvent.  # noqa: E501


        :return: The group_id of this UserGroupAddedEvent.  # noqa: E501
        :rtype: str
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id):
        """Sets the group_id of this UserGroupAddedEvent.


        :param group_id: The group_id of this UserGroupAddedEvent.  # noqa: E501
        :type: str
        """

        self._group_id = group_id

    @property
    def locked(self):
        """Gets the locked of this UserGroupAddedEvent.  # noqa: E501


        :return: The locked of this UserGroupAddedEvent.  # noqa: E501
        :rtype: bool
        """
        return self._locked

    @locked.setter
    def locked(self, locked):
        """Sets the locked of this UserGroupAddedEvent.


        :param locked: The locked of this UserGroupAddedEvent.  # noqa: E501
        :type: bool
        """

        self._locked = locked

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
        if issubclass(UserGroupAddedEvent, dict):
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
        if not isinstance(other, UserGroupAddedEvent):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
