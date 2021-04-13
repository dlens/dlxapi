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


class DlResource(object):
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
        'href': 'str',
        'id': 'str',
        'created_at': 'str',
        'modified_at': 'str'
    }

    attribute_map = {
        'href': 'href',
        'id': 'id',
        'created_at': 'createdAt',
        'modified_at': 'modifiedAt'
    }

    discriminator_value_class_map = {
        'Activity': 'Activity',
        'Project': 'Project',
        'Group': 'Group',
        'Constraint': 'Constraint',
        'FileAttachment': 'FileAttachment',
        'Attachment': 'Attachment',
        'PortfolioPlanUser': 'PortfolioPlanUser',
        'PortfolioPlanInsights': 'PortfolioPlanInsights',
        'Field': 'Field',
        'PortfolioPlan': 'PortfolioPlan',
        'Spreadsheet': 'Spreadsheet',
        'Portfolio': 'Portfolio',
        'Tag': 'Tag',
        'PlanGrade': 'PlanGrade',
        'Mapping': 'Mapping',
        'ResourcePool': 'ResourcePool',
        'User': 'User',
        'Source': 'Source',
        'CategoryOption': 'CategoryOption',
        'Comment': 'Comment'
    }

    def __init__(self, href=None, id=None, created_at=None, modified_at=None, _configuration=None):  # noqa: E501
        """DlResource - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._href = None
        self._id = None
        self._created_at = None
        self._modified_at = None
        self.discriminator = 'href'

        if href is not None:
            self.href = href
        if id is not None:
            self.id = id
        if created_at is not None:
            self.created_at = created_at
        if modified_at is not None:
            self.modified_at = modified_at

    @property
    def href(self):
        """Gets the href of this DlResource.  # noqa: E501


        :return: The href of this DlResource.  # noqa: E501
        :rtype: str
        """
        return self._href

    @href.setter
    def href(self, href):
        """Sets the href of this DlResource.


        :param href: The href of this DlResource.  # noqa: E501
        :type: str
        """

        self._href = href

    @property
    def id(self):
        """Gets the id of this DlResource.  # noqa: E501


        :return: The id of this DlResource.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this DlResource.


        :param id: The id of this DlResource.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def created_at(self):
        """Gets the created_at of this DlResource.  # noqa: E501


        :return: The created_at of this DlResource.  # noqa: E501
        :rtype: str
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at):
        """Sets the created_at of this DlResource.


        :param created_at: The created_at of this DlResource.  # noqa: E501
        :type: str
        """

        self._created_at = created_at

    @property
    def modified_at(self):
        """Gets the modified_at of this DlResource.  # noqa: E501


        :return: The modified_at of this DlResource.  # noqa: E501
        :rtype: str
        """
        return self._modified_at

    @modified_at.setter
    def modified_at(self, modified_at):
        """Sets the modified_at of this DlResource.


        :param modified_at: The modified_at of this DlResource.  # noqa: E501
        :type: str
        """

        self._modified_at = modified_at

    def get_real_child_model(self, data):
        """Returns the real base class specified by the discriminator"""
        discriminator_value = data[self.discriminator].lower()
        return self.discriminator_value_class_map.get(discriminator_value)

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
        if issubclass(DlResource, dict):
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
        if not isinstance(other, DlResource):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, DlResource):
            return True

        return self.to_dict() != other.to_dict()
