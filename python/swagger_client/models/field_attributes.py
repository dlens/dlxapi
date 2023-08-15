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


class FieldAttributes(object):
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
        'planning_window': 'PlanningWindow',
        'time_period': 'TimePeriod',
        'category_display_order': 'CategoryDisplayOrder',
        'data_formats': 'DataFormats'
    }

    attribute_map = {
        'planning_window': 'planningWindow',
        'time_period': 'timePeriod',
        'category_display_order': 'categoryDisplayOrder',
        'data_formats': 'dataFormats'
    }

    def __init__(self, planning_window=None, time_period=None, category_display_order=None, data_formats=None):  # noqa: E501
        """FieldAttributes - a model defined in Swagger"""  # noqa: E501

        self._planning_window = None
        self._time_period = None
        self._category_display_order = None
        self._data_formats = None
        self.discriminator = None

        if planning_window is not None:
            self.planning_window = planning_window
        if time_period is not None:
            self.time_period = time_period
        if category_display_order is not None:
            self.category_display_order = category_display_order
        if data_formats is not None:
            self.data_formats = data_formats

    @property
    def planning_window(self):
        """Gets the planning_window of this FieldAttributes.  # noqa: E501


        :return: The planning_window of this FieldAttributes.  # noqa: E501
        :rtype: PlanningWindow
        """
        return self._planning_window

    @planning_window.setter
    def planning_window(self, planning_window):
        """Sets the planning_window of this FieldAttributes.


        :param planning_window: The planning_window of this FieldAttributes.  # noqa: E501
        :type: PlanningWindow
        """

        self._planning_window = planning_window

    @property
    def time_period(self):
        """Gets the time_period of this FieldAttributes.  # noqa: E501


        :return: The time_period of this FieldAttributes.  # noqa: E501
        :rtype: TimePeriod
        """
        return self._time_period

    @time_period.setter
    def time_period(self, time_period):
        """Sets the time_period of this FieldAttributes.


        :param time_period: The time_period of this FieldAttributes.  # noqa: E501
        :type: TimePeriod
        """

        self._time_period = time_period

    @property
    def category_display_order(self):
        """Gets the category_display_order of this FieldAttributes.  # noqa: E501


        :return: The category_display_order of this FieldAttributes.  # noqa: E501
        :rtype: CategoryDisplayOrder
        """
        return self._category_display_order

    @category_display_order.setter
    def category_display_order(self, category_display_order):
        """Sets the category_display_order of this FieldAttributes.


        :param category_display_order: The category_display_order of this FieldAttributes.  # noqa: E501
        :type: CategoryDisplayOrder
        """

        self._category_display_order = category_display_order

    @property
    def data_formats(self):
        """Gets the data_formats of this FieldAttributes.  # noqa: E501


        :return: The data_formats of this FieldAttributes.  # noqa: E501
        :rtype: DataFormats
        """
        return self._data_formats

    @data_formats.setter
    def data_formats(self, data_formats):
        """Sets the data_formats of this FieldAttributes.


        :param data_formats: The data_formats of this FieldAttributes.  # noqa: E501
        :type: DataFormats
        """

        self._data_formats = data_formats

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
        if issubclass(FieldAttributes, dict):
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
        if not isinstance(other, FieldAttributes):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
