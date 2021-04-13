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


class Constraint(object):
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
        'type': 'ConstraintType',
        'is_active': 'bool',
        'percentage': 'float',
        'fixed_cost': 'float',
        'field': 'Field',
        'projects': 'Projects',
        'portfolio': 'Portfolio',
        'valid_values': 'list[ValidConstraintValue]'
    }

    attribute_map = {
        'type': 'type',
        'is_active': 'isActive',
        'percentage': 'percentage',
        'fixed_cost': 'fixedCost',
        'field': 'field',
        'projects': 'projects',
        'portfolio': 'portfolio',
        'valid_values': 'validValues'
    }

    def __init__(self, type=None, is_active=None, percentage=None, fixed_cost=None, field=None, projects=None, portfolio=None, valid_values=None, _configuration=None):  # noqa: E501
        """Constraint - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._type = None
        self._is_active = None
        self._percentage = None
        self._fixed_cost = None
        self._field = None
        self._projects = None
        self._portfolio = None
        self._valid_values = None
        self.discriminator = None

        if type is not None:
            self.type = type
        if is_active is not None:
            self.is_active = is_active
        if percentage is not None:
            self.percentage = percentage
        if fixed_cost is not None:
            self.fixed_cost = fixed_cost
        if field is not None:
            self.field = field
        if projects is not None:
            self.projects = projects
        if portfolio is not None:
            self.portfolio = portfolio
        if valid_values is not None:
            self.valid_values = valid_values

    @property
    def type(self):
        """Gets the type of this Constraint.  # noqa: E501


        :return: The type of this Constraint.  # noqa: E501
        :rtype: ConstraintType
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this Constraint.


        :param type: The type of this Constraint.  # noqa: E501
        :type: ConstraintType
        """

        self._type = type

    @property
    def is_active(self):
        """Gets the is_active of this Constraint.  # noqa: E501


        :return: The is_active of this Constraint.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this Constraint.


        :param is_active: The is_active of this Constraint.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def percentage(self):
        """Gets the percentage of this Constraint.  # noqa: E501


        :return: The percentage of this Constraint.  # noqa: E501
        :rtype: float
        """
        return self._percentage

    @percentage.setter
    def percentage(self, percentage):
        """Sets the percentage of this Constraint.


        :param percentage: The percentage of this Constraint.  # noqa: E501
        :type: float
        """

        self._percentage = percentage

    @property
    def fixed_cost(self):
        """Gets the fixed_cost of this Constraint.  # noqa: E501


        :return: The fixed_cost of this Constraint.  # noqa: E501
        :rtype: float
        """
        return self._fixed_cost

    @fixed_cost.setter
    def fixed_cost(self, fixed_cost):
        """Sets the fixed_cost of this Constraint.


        :param fixed_cost: The fixed_cost of this Constraint.  # noqa: E501
        :type: float
        """

        self._fixed_cost = fixed_cost

    @property
    def field(self):
        """Gets the field of this Constraint.  # noqa: E501


        :return: The field of this Constraint.  # noqa: E501
        :rtype: Field
        """
        return self._field

    @field.setter
    def field(self, field):
        """Sets the field of this Constraint.


        :param field: The field of this Constraint.  # noqa: E501
        :type: Field
        """

        self._field = field

    @property
    def projects(self):
        """Gets the projects of this Constraint.  # noqa: E501


        :return: The projects of this Constraint.  # noqa: E501
        :rtype: Projects
        """
        return self._projects

    @projects.setter
    def projects(self, projects):
        """Sets the projects of this Constraint.


        :param projects: The projects of this Constraint.  # noqa: E501
        :type: Projects
        """

        self._projects = projects

    @property
    def portfolio(self):
        """Gets the portfolio of this Constraint.  # noqa: E501


        :return: The portfolio of this Constraint.  # noqa: E501
        :rtype: Portfolio
        """
        return self._portfolio

    @portfolio.setter
    def portfolio(self, portfolio):
        """Sets the portfolio of this Constraint.


        :param portfolio: The portfolio of this Constraint.  # noqa: E501
        :type: Portfolio
        """

        self._portfolio = portfolio

    @property
    def valid_values(self):
        """Gets the valid_values of this Constraint.  # noqa: E501


        :return: The valid_values of this Constraint.  # noqa: E501
        :rtype: list[ValidConstraintValue]
        """
        return self._valid_values

    @valid_values.setter
    def valid_values(self, valid_values):
        """Sets the valid_values of this Constraint.


        :param valid_values: The valid_values of this Constraint.  # noqa: E501
        :type: list[ValidConstraintValue]
        """

        self._valid_values = valid_values

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
        if issubclass(Constraint, dict):
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
        if not isinstance(other, Constraint):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Constraint):
            return True

        return self.to_dict() != other.to_dict()
