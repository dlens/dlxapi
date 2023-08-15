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


class FieldAttributesCategoryDisplayOrderUpdatedEvent(object):
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
        'category_display_order': 'CategoryDisplayOrder',
        'previous_category_display_order': 'CategoryDisplayOrder',
        'name': 'str',
        'id': 'str',
        'portfolio_plan': 'PortfolioPlan'
    }

    attribute_map = {
        'portfolio_id': 'portfolioId',
        'category_display_order': 'categoryDisplayOrder',
        'previous_category_display_order': 'previousCategoryDisplayOrder',
        'name': 'name',
        'id': 'id',
        'portfolio_plan': 'portfolioPlan'
    }

    def __init__(self, portfolio_id=None, category_display_order=None, previous_category_display_order=None, name=None, id=None, portfolio_plan=None):  # noqa: E501
        """FieldAttributesCategoryDisplayOrderUpdatedEvent - a model defined in Swagger"""  # noqa: E501

        self._portfolio_id = None
        self._category_display_order = None
        self._previous_category_display_order = None
        self._name = None
        self._id = None
        self._portfolio_plan = None
        self.discriminator = None

        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if category_display_order is not None:
            self.category_display_order = category_display_order
        if previous_category_display_order is not None:
            self.previous_category_display_order = previous_category_display_order
        if name is not None:
            self.name = name
        if id is not None:
            self.id = id
        if portfolio_plan is not None:
            self.portfolio_plan = portfolio_plan

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501


        :return: The portfolio_id of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this FieldAttributesCategoryDisplayOrderUpdatedEvent.


        :param portfolio_id: The portfolio_id of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def category_display_order(self):
        """Gets the category_display_order of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501


        :return: The category_display_order of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501
        :rtype: CategoryDisplayOrder
        """
        return self._category_display_order

    @category_display_order.setter
    def category_display_order(self, category_display_order):
        """Sets the category_display_order of this FieldAttributesCategoryDisplayOrderUpdatedEvent.


        :param category_display_order: The category_display_order of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501
        :type: CategoryDisplayOrder
        """

        self._category_display_order = category_display_order

    @property
    def previous_category_display_order(self):
        """Gets the previous_category_display_order of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501


        :return: The previous_category_display_order of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501
        :rtype: CategoryDisplayOrder
        """
        return self._previous_category_display_order

    @previous_category_display_order.setter
    def previous_category_display_order(self, previous_category_display_order):
        """Sets the previous_category_display_order of this FieldAttributesCategoryDisplayOrderUpdatedEvent.


        :param previous_category_display_order: The previous_category_display_order of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501
        :type: CategoryDisplayOrder
        """

        self._previous_category_display_order = previous_category_display_order

    @property
    def name(self):
        """Gets the name of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501


        :return: The name of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this FieldAttributesCategoryDisplayOrderUpdatedEvent.


        :param name: The name of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def id(self):
        """Gets the id of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501


        :return: The id of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this FieldAttributesCategoryDisplayOrderUpdatedEvent.


        :param id: The id of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def portfolio_plan(self):
        """Gets the portfolio_plan of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501


        :return: The portfolio_plan of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._portfolio_plan

    @portfolio_plan.setter
    def portfolio_plan(self, portfolio_plan):
        """Sets the portfolio_plan of this FieldAttributesCategoryDisplayOrderUpdatedEvent.


        :param portfolio_plan: The portfolio_plan of this FieldAttributesCategoryDisplayOrderUpdatedEvent.  # noqa: E501
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
        if issubclass(FieldAttributesCategoryDisplayOrderUpdatedEvent, dict):
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
        if not isinstance(other, FieldAttributesCategoryDisplayOrderUpdatedEvent):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
