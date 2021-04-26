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


class SetDependenciesRequest(object):
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
        'depends_on_project_ids': 'list[str]',
        'has_dependent_project_ids': 'list[str]'
    }

    attribute_map = {
        'depends_on_project_ids': 'dependsOnProjectIds',
        'has_dependent_project_ids': 'hasDependentProjectIds'
    }

    def __init__(self, depends_on_project_ids=None, has_dependent_project_ids=None, _configuration=None):  # noqa: E501
        """SetDependenciesRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._depends_on_project_ids = None
        self._has_dependent_project_ids = None
        self.discriminator = None

        if depends_on_project_ids is not None:
            self.depends_on_project_ids = depends_on_project_ids
        if has_dependent_project_ids is not None:
            self.has_dependent_project_ids = has_dependent_project_ids

    @property
    def depends_on_project_ids(self):
        """Gets the depends_on_project_ids of this SetDependenciesRequest.  # noqa: E501


        :return: The depends_on_project_ids of this SetDependenciesRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._depends_on_project_ids

    @depends_on_project_ids.setter
    def depends_on_project_ids(self, depends_on_project_ids):
        """Sets the depends_on_project_ids of this SetDependenciesRequest.


        :param depends_on_project_ids: The depends_on_project_ids of this SetDependenciesRequest.  # noqa: E501
        :type: list[str]
        """

        self._depends_on_project_ids = depends_on_project_ids

    @property
    def has_dependent_project_ids(self):
        """Gets the has_dependent_project_ids of this SetDependenciesRequest.  # noqa: E501


        :return: The has_dependent_project_ids of this SetDependenciesRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._has_dependent_project_ids

    @has_dependent_project_ids.setter
    def has_dependent_project_ids(self, has_dependent_project_ids):
        """Sets the has_dependent_project_ids of this SetDependenciesRequest.


        :param has_dependent_project_ids: The has_dependent_project_ids of this SetDependenciesRequest.  # noqa: E501
        :type: list[str]
        """

        self._has_dependent_project_ids = has_dependent_project_ids

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
        if issubclass(SetDependenciesRequest, dict):
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
        if not isinstance(other, SetDependenciesRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, SetDependenciesRequest):
            return True

        return self.to_dict() != other.to_dict()