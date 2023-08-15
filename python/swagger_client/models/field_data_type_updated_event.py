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


class FieldDataTypeUpdatedEvent(object):
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
        'previous_data_type': 'DataType',
        'data_type': 'DataType',
        'name': 'str',
        'id': 'str',
        'field_type': 'FieldType',
        'portfolio_plan': 'PortfolioPlan'
    }

    attribute_map = {
        'portfolio_id': 'portfolioId',
        'previous_data_type': 'previousDataType',
        'data_type': 'dataType',
        'name': 'name',
        'id': 'id',
        'field_type': 'fieldType',
        'portfolio_plan': 'portfolioPlan'
    }

    def __init__(self, portfolio_id=None, previous_data_type=None, data_type=None, name=None, id=None, field_type=None, portfolio_plan=None):  # noqa: E501
        """FieldDataTypeUpdatedEvent - a model defined in Swagger"""  # noqa: E501

        self._portfolio_id = None
        self._previous_data_type = None
        self._data_type = None
        self._name = None
        self._id = None
        self._field_type = None
        self._portfolio_plan = None
        self.discriminator = None

        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if previous_data_type is not None:
            self.previous_data_type = previous_data_type
        if data_type is not None:
            self.data_type = data_type
        if name is not None:
            self.name = name
        if id is not None:
            self.id = id
        if field_type is not None:
            self.field_type = field_type
        if portfolio_plan is not None:
            self.portfolio_plan = portfolio_plan

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this FieldDataTypeUpdatedEvent.  # noqa: E501


        :return: The portfolio_id of this FieldDataTypeUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this FieldDataTypeUpdatedEvent.


        :param portfolio_id: The portfolio_id of this FieldDataTypeUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def previous_data_type(self):
        """Gets the previous_data_type of this FieldDataTypeUpdatedEvent.  # noqa: E501


        :return: The previous_data_type of this FieldDataTypeUpdatedEvent.  # noqa: E501
        :rtype: DataType
        """
        return self._previous_data_type

    @previous_data_type.setter
    def previous_data_type(self, previous_data_type):
        """Sets the previous_data_type of this FieldDataTypeUpdatedEvent.


        :param previous_data_type: The previous_data_type of this FieldDataTypeUpdatedEvent.  # noqa: E501
        :type: DataType
        """

        self._previous_data_type = previous_data_type

    @property
    def data_type(self):
        """Gets the data_type of this FieldDataTypeUpdatedEvent.  # noqa: E501


        :return: The data_type of this FieldDataTypeUpdatedEvent.  # noqa: E501
        :rtype: DataType
        """
        return self._data_type

    @data_type.setter
    def data_type(self, data_type):
        """Sets the data_type of this FieldDataTypeUpdatedEvent.


        :param data_type: The data_type of this FieldDataTypeUpdatedEvent.  # noqa: E501
        :type: DataType
        """

        self._data_type = data_type

    @property
    def name(self):
        """Gets the name of this FieldDataTypeUpdatedEvent.  # noqa: E501


        :return: The name of this FieldDataTypeUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this FieldDataTypeUpdatedEvent.


        :param name: The name of this FieldDataTypeUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def id(self):
        """Gets the id of this FieldDataTypeUpdatedEvent.  # noqa: E501


        :return: The id of this FieldDataTypeUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this FieldDataTypeUpdatedEvent.


        :param id: The id of this FieldDataTypeUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def field_type(self):
        """Gets the field_type of this FieldDataTypeUpdatedEvent.  # noqa: E501


        :return: The field_type of this FieldDataTypeUpdatedEvent.  # noqa: E501
        :rtype: FieldType
        """
        return self._field_type

    @field_type.setter
    def field_type(self, field_type):
        """Sets the field_type of this FieldDataTypeUpdatedEvent.


        :param field_type: The field_type of this FieldDataTypeUpdatedEvent.  # noqa: E501
        :type: FieldType
        """

        self._field_type = field_type

    @property
    def portfolio_plan(self):
        """Gets the portfolio_plan of this FieldDataTypeUpdatedEvent.  # noqa: E501


        :return: The portfolio_plan of this FieldDataTypeUpdatedEvent.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._portfolio_plan

    @portfolio_plan.setter
    def portfolio_plan(self, portfolio_plan):
        """Sets the portfolio_plan of this FieldDataTypeUpdatedEvent.


        :param portfolio_plan: The portfolio_plan of this FieldDataTypeUpdatedEvent.  # noqa: E501
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
        if issubclass(FieldDataTypeUpdatedEvent, dict):
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
        if not isinstance(other, FieldDataTypeUpdatedEvent):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
