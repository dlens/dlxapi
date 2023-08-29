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


class ProjectRankFieldValueUpdatedEvent(object):
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
        'previous_data_type': 'DataType',
        'numeric_value': 'float',
        'previous_numeric_value': 'float',
        'is_rebaseline': 'bool',
        'previous_value': 'str',
        'is_from_import': 'bool',
        'portfolio_id': 'str',
        'field': 'Field',
        'name': 'str',
        'time_period': 'TimePeriod',
        'id': 'str',
        'value': 'str',
        'portfolio_plan': 'PortfolioPlan'
    }

    attribute_map = {
        'previous_data_type': 'previousDataType',
        'numeric_value': 'numericValue',
        'previous_numeric_value': 'previousNumericValue',
        'is_rebaseline': 'isRebaseline',
        'previous_value': 'previousValue',
        'is_from_import': 'isFromImport',
        'portfolio_id': 'portfolioId',
        'field': 'field',
        'name': 'name',
        'time_period': 'timePeriod',
        'id': 'id',
        'value': 'value',
        'portfolio_plan': 'portfolioPlan'
    }

    def __init__(self, previous_data_type=None, numeric_value=None, previous_numeric_value=None, is_rebaseline=None, previous_value=None, is_from_import=None, portfolio_id=None, field=None, name=None, time_period=None, id=None, value=None, portfolio_plan=None):  # noqa: E501
        """ProjectRankFieldValueUpdatedEvent - a model defined in Swagger"""  # noqa: E501

        self._previous_data_type = None
        self._numeric_value = None
        self._previous_numeric_value = None
        self._is_rebaseline = None
        self._previous_value = None
        self._is_from_import = None
        self._portfolio_id = None
        self._field = None
        self._name = None
        self._time_period = None
        self._id = None
        self._value = None
        self._portfolio_plan = None
        self.discriminator = None

        if previous_data_type is not None:
            self.previous_data_type = previous_data_type
        if numeric_value is not None:
            self.numeric_value = numeric_value
        if previous_numeric_value is not None:
            self.previous_numeric_value = previous_numeric_value
        if is_rebaseline is not None:
            self.is_rebaseline = is_rebaseline
        if previous_value is not None:
            self.previous_value = previous_value
        if is_from_import is not None:
            self.is_from_import = is_from_import
        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if field is not None:
            self.field = field
        if name is not None:
            self.name = name
        if time_period is not None:
            self.time_period = time_period
        if id is not None:
            self.id = id
        if value is not None:
            self.value = value
        if portfolio_plan is not None:
            self.portfolio_plan = portfolio_plan

    @property
    def previous_data_type(self):
        """Gets the previous_data_type of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501


        :return: The previous_data_type of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :rtype: DataType
        """
        return self._previous_data_type

    @previous_data_type.setter
    def previous_data_type(self, previous_data_type):
        """Sets the previous_data_type of this ProjectRankFieldValueUpdatedEvent.


        :param previous_data_type: The previous_data_type of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :type: DataType
        """

        self._previous_data_type = previous_data_type

    @property
    def numeric_value(self):
        """Gets the numeric_value of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501


        :return: The numeric_value of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :rtype: float
        """
        return self._numeric_value

    @numeric_value.setter
    def numeric_value(self, numeric_value):
        """Sets the numeric_value of this ProjectRankFieldValueUpdatedEvent.


        :param numeric_value: The numeric_value of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :type: float
        """

        self._numeric_value = numeric_value

    @property
    def previous_numeric_value(self):
        """Gets the previous_numeric_value of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501


        :return: The previous_numeric_value of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :rtype: float
        """
        return self._previous_numeric_value

    @previous_numeric_value.setter
    def previous_numeric_value(self, previous_numeric_value):
        """Sets the previous_numeric_value of this ProjectRankFieldValueUpdatedEvent.


        :param previous_numeric_value: The previous_numeric_value of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :type: float
        """

        self._previous_numeric_value = previous_numeric_value

    @property
    def is_rebaseline(self):
        """Gets the is_rebaseline of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501


        :return: The is_rebaseline of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :rtype: bool
        """
        return self._is_rebaseline

    @is_rebaseline.setter
    def is_rebaseline(self, is_rebaseline):
        """Sets the is_rebaseline of this ProjectRankFieldValueUpdatedEvent.


        :param is_rebaseline: The is_rebaseline of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :type: bool
        """

        self._is_rebaseline = is_rebaseline

    @property
    def previous_value(self):
        """Gets the previous_value of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501


        :return: The previous_value of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._previous_value

    @previous_value.setter
    def previous_value(self, previous_value):
        """Sets the previous_value of this ProjectRankFieldValueUpdatedEvent.


        :param previous_value: The previous_value of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._previous_value = previous_value

    @property
    def is_from_import(self):
        """Gets the is_from_import of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501


        :return: The is_from_import of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :rtype: bool
        """
        return self._is_from_import

    @is_from_import.setter
    def is_from_import(self, is_from_import):
        """Sets the is_from_import of this ProjectRankFieldValueUpdatedEvent.


        :param is_from_import: The is_from_import of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :type: bool
        """

        self._is_from_import = is_from_import

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501


        :return: The portfolio_id of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this ProjectRankFieldValueUpdatedEvent.


        :param portfolio_id: The portfolio_id of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def field(self):
        """Gets the field of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501


        :return: The field of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :rtype: Field
        """
        return self._field

    @field.setter
    def field(self, field):
        """Sets the field of this ProjectRankFieldValueUpdatedEvent.


        :param field: The field of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :type: Field
        """

        self._field = field

    @property
    def name(self):
        """Gets the name of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501


        :return: The name of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ProjectRankFieldValueUpdatedEvent.


        :param name: The name of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def time_period(self):
        """Gets the time_period of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501


        :return: The time_period of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :rtype: TimePeriod
        """
        return self._time_period

    @time_period.setter
    def time_period(self, time_period):
        """Sets the time_period of this ProjectRankFieldValueUpdatedEvent.


        :param time_period: The time_period of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :type: TimePeriod
        """

        self._time_period = time_period

    @property
    def id(self):
        """Gets the id of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501


        :return: The id of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ProjectRankFieldValueUpdatedEvent.


        :param id: The id of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def value(self):
        """Gets the value of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501


        :return: The value of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this ProjectRankFieldValueUpdatedEvent.


        :param value: The value of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._value = value

    @property
    def portfolio_plan(self):
        """Gets the portfolio_plan of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501


        :return: The portfolio_plan of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._portfolio_plan

    @portfolio_plan.setter
    def portfolio_plan(self, portfolio_plan):
        """Sets the portfolio_plan of this ProjectRankFieldValueUpdatedEvent.


        :param portfolio_plan: The portfolio_plan of this ProjectRankFieldValueUpdatedEvent.  # noqa: E501
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
        if issubclass(ProjectRankFieldValueUpdatedEvent, dict):
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
        if not isinstance(other, ProjectRankFieldValueUpdatedEvent):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other