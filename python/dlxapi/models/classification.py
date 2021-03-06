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


class Classification(object):
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
        'phrase': 'str',
        'type': 'str',
        'target_type': 'str',
        'plan_feature': 'str'
    }

    attribute_map = {
        'phrase': 'phrase',
        'type': 'type',
        'target_type': 'targetType',
        'plan_feature': 'planFeature'
    }

    def __init__(self, phrase=None, type=None, target_type=None, plan_feature=None, _configuration=None):  # noqa: E501
        """Classification - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._phrase = None
        self._type = None
        self._target_type = None
        self._plan_feature = None
        self.discriminator = None

        if phrase is not None:
            self.phrase = phrase
        if type is not None:
            self.type = type
        if target_type is not None:
            self.target_type = target_type
        if plan_feature is not None:
            self.plan_feature = plan_feature

    @property
    def phrase(self):
        """Gets the phrase of this Classification.  # noqa: E501


        :return: The phrase of this Classification.  # noqa: E501
        :rtype: str
        """
        return self._phrase

    @phrase.setter
    def phrase(self, phrase):
        """Sets the phrase of this Classification.


        :param phrase: The phrase of this Classification.  # noqa: E501
        :type: str
        """

        self._phrase = phrase

    @property
    def type(self):
        """Gets the type of this Classification.  # noqa: E501


        :return: The type of this Classification.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this Classification.


        :param type: The type of this Classification.  # noqa: E501
        :type: str
        """

        self._type = type

    @property
    def target_type(self):
        """Gets the target_type of this Classification.  # noqa: E501


        :return: The target_type of this Classification.  # noqa: E501
        :rtype: str
        """
        return self._target_type

    @target_type.setter
    def target_type(self, target_type):
        """Sets the target_type of this Classification.


        :param target_type: The target_type of this Classification.  # noqa: E501
        :type: str
        """

        self._target_type = target_type

    @property
    def plan_feature(self):
        """Gets the plan_feature of this Classification.  # noqa: E501


        :return: The plan_feature of this Classification.  # noqa: E501
        :rtype: str
        """
        return self._plan_feature

    @plan_feature.setter
    def plan_feature(self, plan_feature):
        """Sets the plan_feature of this Classification.


        :param plan_feature: The plan_feature of this Classification.  # noqa: E501
        :type: str
        """

        self._plan_feature = plan_feature

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
        if issubclass(Classification, dict):
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
        if not isinstance(other, Classification):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Classification):
            return True

        return self.to_dict() != other.to_dict()
