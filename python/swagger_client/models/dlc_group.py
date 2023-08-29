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


class DLCGroup(object):
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
        'domain_name': 'str',
        'sso_principal_transmit_method': 'SSOPrincipalTransmitMethod',
        'sso_principal_key': 'str',
        'dl4_domain': 'str'
    }

    attribute_map = {
        'id': 'id',
        'name': 'name',
        'domain_name': 'domainName',
        'sso_principal_transmit_method': 'ssoPrincipalTransmitMethod',
        'sso_principal_key': 'ssoPrincipalKey',
        'dl4_domain': 'dl4Domain'
    }

    def __init__(self, id=None, name=None, domain_name=None, sso_principal_transmit_method=None, sso_principal_key=None, dl4_domain=None):  # noqa: E501
        """DLCGroup - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._name = None
        self._domain_name = None
        self._sso_principal_transmit_method = None
        self._sso_principal_key = None
        self._dl4_domain = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if name is not None:
            self.name = name
        if domain_name is not None:
            self.domain_name = domain_name
        if sso_principal_transmit_method is not None:
            self.sso_principal_transmit_method = sso_principal_transmit_method
        if sso_principal_key is not None:
            self.sso_principal_key = sso_principal_key
        if dl4_domain is not None:
            self.dl4_domain = dl4_domain

    @property
    def id(self):
        """Gets the id of this DLCGroup.  # noqa: E501


        :return: The id of this DLCGroup.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this DLCGroup.


        :param id: The id of this DLCGroup.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def name(self):
        """Gets the name of this DLCGroup.  # noqa: E501


        :return: The name of this DLCGroup.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this DLCGroup.


        :param name: The name of this DLCGroup.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def domain_name(self):
        """Gets the domain_name of this DLCGroup.  # noqa: E501


        :return: The domain_name of this DLCGroup.  # noqa: E501
        :rtype: str
        """
        return self._domain_name

    @domain_name.setter
    def domain_name(self, domain_name):
        """Sets the domain_name of this DLCGroup.


        :param domain_name: The domain_name of this DLCGroup.  # noqa: E501
        :type: str
        """

        self._domain_name = domain_name

    @property
    def sso_principal_transmit_method(self):
        """Gets the sso_principal_transmit_method of this DLCGroup.  # noqa: E501


        :return: The sso_principal_transmit_method of this DLCGroup.  # noqa: E501
        :rtype: SSOPrincipalTransmitMethod
        """
        return self._sso_principal_transmit_method

    @sso_principal_transmit_method.setter
    def sso_principal_transmit_method(self, sso_principal_transmit_method):
        """Sets the sso_principal_transmit_method of this DLCGroup.


        :param sso_principal_transmit_method: The sso_principal_transmit_method of this DLCGroup.  # noqa: E501
        :type: SSOPrincipalTransmitMethod
        """

        self._sso_principal_transmit_method = sso_principal_transmit_method

    @property
    def sso_principal_key(self):
        """Gets the sso_principal_key of this DLCGroup.  # noqa: E501


        :return: The sso_principal_key of this DLCGroup.  # noqa: E501
        :rtype: str
        """
        return self._sso_principal_key

    @sso_principal_key.setter
    def sso_principal_key(self, sso_principal_key):
        """Sets the sso_principal_key of this DLCGroup.


        :param sso_principal_key: The sso_principal_key of this DLCGroup.  # noqa: E501
        :type: str
        """

        self._sso_principal_key = sso_principal_key

    @property
    def dl4_domain(self):
        """Gets the dl4_domain of this DLCGroup.  # noqa: E501


        :return: The dl4_domain of this DLCGroup.  # noqa: E501
        :rtype: str
        """
        return self._dl4_domain

    @dl4_domain.setter
    def dl4_domain(self, dl4_domain):
        """Sets the dl4_domain of this DLCGroup.


        :param dl4_domain: The dl4_domain of this DLCGroup.  # noqa: E501
        :type: str
        """

        self._dl4_domain = dl4_domain

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
        if issubclass(DLCGroup, dict):
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
        if not isinstance(other, DLCGroup):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other