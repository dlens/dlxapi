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


class PortfolioPlanDataImportedEvent(object):
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
        'file_name': 'str',
        'portfolio_id': 'str',
        'sheet_name': 'str',
        'id': 'str',
        'portfolio_plan': 'PortfolioPlan'
    }

    attribute_map = {
        'file_name': 'fileName',
        'portfolio_id': 'portfolioId',
        'sheet_name': 'sheetName',
        'id': 'id',
        'portfolio_plan': 'portfolioPlan'
    }

    def __init__(self, file_name=None, portfolio_id=None, sheet_name=None, id=None, portfolio_plan=None):  # noqa: E501
        """PortfolioPlanDataImportedEvent - a model defined in Swagger"""  # noqa: E501

        self._file_name = None
        self._portfolio_id = None
        self._sheet_name = None
        self._id = None
        self._portfolio_plan = None
        self.discriminator = None

        if file_name is not None:
            self.file_name = file_name
        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if sheet_name is not None:
            self.sheet_name = sheet_name
        if id is not None:
            self.id = id
        if portfolio_plan is not None:
            self.portfolio_plan = portfolio_plan

    @property
    def file_name(self):
        """Gets the file_name of this PortfolioPlanDataImportedEvent.  # noqa: E501


        :return: The file_name of this PortfolioPlanDataImportedEvent.  # noqa: E501
        :rtype: str
        """
        return self._file_name

    @file_name.setter
    def file_name(self, file_name):
        """Sets the file_name of this PortfolioPlanDataImportedEvent.


        :param file_name: The file_name of this PortfolioPlanDataImportedEvent.  # noqa: E501
        :type: str
        """

        self._file_name = file_name

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this PortfolioPlanDataImportedEvent.  # noqa: E501


        :return: The portfolio_id of this PortfolioPlanDataImportedEvent.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this PortfolioPlanDataImportedEvent.


        :param portfolio_id: The portfolio_id of this PortfolioPlanDataImportedEvent.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def sheet_name(self):
        """Gets the sheet_name of this PortfolioPlanDataImportedEvent.  # noqa: E501


        :return: The sheet_name of this PortfolioPlanDataImportedEvent.  # noqa: E501
        :rtype: str
        """
        return self._sheet_name

    @sheet_name.setter
    def sheet_name(self, sheet_name):
        """Sets the sheet_name of this PortfolioPlanDataImportedEvent.


        :param sheet_name: The sheet_name of this PortfolioPlanDataImportedEvent.  # noqa: E501
        :type: str
        """

        self._sheet_name = sheet_name

    @property
    def id(self):
        """Gets the id of this PortfolioPlanDataImportedEvent.  # noqa: E501


        :return: The id of this PortfolioPlanDataImportedEvent.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PortfolioPlanDataImportedEvent.


        :param id: The id of this PortfolioPlanDataImportedEvent.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def portfolio_plan(self):
        """Gets the portfolio_plan of this PortfolioPlanDataImportedEvent.  # noqa: E501


        :return: The portfolio_plan of this PortfolioPlanDataImportedEvent.  # noqa: E501
        :rtype: PortfolioPlan
        """
        return self._portfolio_plan

    @portfolio_plan.setter
    def portfolio_plan(self, portfolio_plan):
        """Sets the portfolio_plan of this PortfolioPlanDataImportedEvent.


        :param portfolio_plan: The portfolio_plan of this PortfolioPlanDataImportedEvent.  # noqa: E501
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
        if issubclass(PortfolioPlanDataImportedEvent, dict):
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
        if not isinstance(other, PortfolioPlanDataImportedEvent):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other