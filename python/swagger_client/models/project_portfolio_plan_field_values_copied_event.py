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


class ProjectPortfolioPlanFieldValuesCopiedEvent(object):
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
        'from_portfolio_plan': 'PortfolioPlan',
        'name': 'str',
        'id': 'str',
        'field_values': 'list[ProjectFieldValue]',
        'portfolio_plan': 'PortfolioPlan'
    }

    attribute_map = {
        'portfolio_id': 'portfolioId',
        'from_portfolio_plan': 'fromPortfolioPlan',
        'name': 'name',
        'id': 'id',
        'field_values': 'fieldValues',
        'portfolio_plan': 'portfolioPlan'
    }

    def __init__(self, portfolio_id=None, from_portfolio_plan=None, name=None, id=None, field_values=None, portfolio_plan=None, _configuration=None):  # noqa: E501
        """ProjectPortfolioPlanFieldValuesCopiedEvent - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._portfolio_id = None
        self._from_portfolio_plan = None
        self._name = None
        self._id = None
        self._field_values = None
        self._portfolio_plan = None
        self.discriminator = None

        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if from_portfolio_plan is not None:
            self.from_portfolio_plan = from_portfolio_plan
        if name is not None:
            self.name = name
        if id is not None:
            self.id = id
        if field_values is not None:
            self.field_values = field_values
        if portfolio_plan is not None:
            self.portfolio_plan = portfolio_plan

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501


        :return: The portfolio_id of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this ProjectPortfolioPlanFieldValuesCopiedEvent.


        :param portfolio_id: The portfolio_id of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def from_portfolio_plan(self):
        """Gets the from_portfolio_plan of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501


        :return: The from_portfolio_plan of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._from_portfolio_plan

    @from_portfolio_plan.setter
    def from_portfolio_plan(self, from_portfolio_plan):
        """Sets the from_portfolio_plan of this ProjectPortfolioPlanFieldValuesCopiedEvent.


        :param from_portfolio_plan: The from_portfolio_plan of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501
        :type: PortfolioPlan
        """

        self._from_portfolio_plan = from_portfolio_plan

    @property
    def name(self):
        """Gets the name of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501


        :return: The name of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ProjectPortfolioPlanFieldValuesCopiedEvent.


        :param name: The name of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def id(self):
        """Gets the id of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501


        :return: The id of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ProjectPortfolioPlanFieldValuesCopiedEvent.


        :param id: The id of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def field_values(self):
        """Gets the field_values of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501


        :return: The field_values of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501
        :rtype: list[ProjectFieldValue]
        """
        return self._field_values

    @field_values.setter
    def field_values(self, field_values):
        """Sets the field_values of this ProjectPortfolioPlanFieldValuesCopiedEvent.


        :param field_values: The field_values of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501
        :type: list[ProjectFieldValue]
        """

        self._field_values = field_values

    @property
    def portfolio_plan(self):
        """Gets the portfolio_plan of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501


        :return: The portfolio_plan of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._portfolio_plan

    @portfolio_plan.setter
    def portfolio_plan(self, portfolio_plan):
        """Sets the portfolio_plan of this ProjectPortfolioPlanFieldValuesCopiedEvent.


        :param portfolio_plan: The portfolio_plan of this ProjectPortfolioPlanFieldValuesCopiedEvent.  # noqa: E501
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
        if issubclass(ProjectPortfolioPlanFieldValuesCopiedEvent, dict):
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
        if not isinstance(other, ProjectPortfolioPlanFieldValuesCopiedEvent):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ProjectPortfolioPlanFieldValuesCopiedEvent):
            return True

        return self.to_dict() != other.to_dict()
