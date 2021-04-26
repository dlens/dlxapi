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


class SpreadsheetReport(object):
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
        'spreadsheet_id': 'str',
        'sheet_name': 'str',
        'new_projects': 'Projects',
        'new_fields': 'Fields',
        'update_project_field_values_count': 'int',
        'update_projects': 'Projects',
        'warnings': 'Warnings'
    }

    attribute_map = {
        'portfolio_id': 'portfolioId',
        'spreadsheet_id': 'spreadsheetId',
        'sheet_name': 'sheetName',
        'new_projects': 'newProjects',
        'new_fields': 'newFields',
        'update_project_field_values_count': 'updateProjectFieldValuesCount',
        'update_projects': 'updateProjects',
        'warnings': 'warnings'
    }

    def __init__(self, portfolio_id=None, spreadsheet_id=None, sheet_name=None, new_projects=None, new_fields=None, update_project_field_values_count=None, update_projects=None, warnings=None, _configuration=None):  # noqa: E501
        """SpreadsheetReport - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._portfolio_id = None
        self._spreadsheet_id = None
        self._sheet_name = None
        self._new_projects = None
        self._new_fields = None
        self._update_project_field_values_count = None
        self._update_projects = None
        self._warnings = None
        self.discriminator = None

        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if spreadsheet_id is not None:
            self.spreadsheet_id = spreadsheet_id
        if sheet_name is not None:
            self.sheet_name = sheet_name
        if new_projects is not None:
            self.new_projects = new_projects
        if new_fields is not None:
            self.new_fields = new_fields
        if update_project_field_values_count is not None:
            self.update_project_field_values_count = update_project_field_values_count
        if update_projects is not None:
            self.update_projects = update_projects
        if warnings is not None:
            self.warnings = warnings

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this SpreadsheetReport.  # noqa: E501


        :return: The portfolio_id of this SpreadsheetReport.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this SpreadsheetReport.


        :param portfolio_id: The portfolio_id of this SpreadsheetReport.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def spreadsheet_id(self):
        """Gets the spreadsheet_id of this SpreadsheetReport.  # noqa: E501


        :return: The spreadsheet_id of this SpreadsheetReport.  # noqa: E501
        :rtype: str
        """
        return self._spreadsheet_id

    @spreadsheet_id.setter
    def spreadsheet_id(self, spreadsheet_id):
        """Sets the spreadsheet_id of this SpreadsheetReport.


        :param spreadsheet_id: The spreadsheet_id of this SpreadsheetReport.  # noqa: E501
        :type: str
        """

        self._spreadsheet_id = spreadsheet_id

    @property
    def sheet_name(self):
        """Gets the sheet_name of this SpreadsheetReport.  # noqa: E501


        :return: The sheet_name of this SpreadsheetReport.  # noqa: E501
        :rtype: str
        """
        return self._sheet_name

    @sheet_name.setter
    def sheet_name(self, sheet_name):
        """Sets the sheet_name of this SpreadsheetReport.


        :param sheet_name: The sheet_name of this SpreadsheetReport.  # noqa: E501
        :type: str
        """

        self._sheet_name = sheet_name

    @property
    def new_projects(self):
        """Gets the new_projects of this SpreadsheetReport.  # noqa: E501


        :return: The new_projects of this SpreadsheetReport.  # noqa: E501
        :rtype: Projects
        """
        return self._new_projects

    @new_projects.setter
    def new_projects(self, new_projects):
        """Sets the new_projects of this SpreadsheetReport.


        :param new_projects: The new_projects of this SpreadsheetReport.  # noqa: E501
        :type: Projects
        """

        self._new_projects = new_projects

    @property
    def new_fields(self):
        """Gets the new_fields of this SpreadsheetReport.  # noqa: E501


        :return: The new_fields of this SpreadsheetReport.  # noqa: E501
        :rtype: Fields
        """
        return self._new_fields

    @new_fields.setter
    def new_fields(self, new_fields):
        """Sets the new_fields of this SpreadsheetReport.


        :param new_fields: The new_fields of this SpreadsheetReport.  # noqa: E501
        :type: Fields
        """

        self._new_fields = new_fields

    @property
    def update_project_field_values_count(self):
        """Gets the update_project_field_values_count of this SpreadsheetReport.  # noqa: E501


        :return: The update_project_field_values_count of this SpreadsheetReport.  # noqa: E501
        :rtype: int
        """
        return self._update_project_field_values_count

    @update_project_field_values_count.setter
    def update_project_field_values_count(self, update_project_field_values_count):
        """Sets the update_project_field_values_count of this SpreadsheetReport.


        :param update_project_field_values_count: The update_project_field_values_count of this SpreadsheetReport.  # noqa: E501
        :type: int
        """

        self._update_project_field_values_count = update_project_field_values_count

    @property
    def update_projects(self):
        """Gets the update_projects of this SpreadsheetReport.  # noqa: E501


        :return: The update_projects of this SpreadsheetReport.  # noqa: E501
        :rtype: Projects
        """
        return self._update_projects

    @update_projects.setter
    def update_projects(self, update_projects):
        """Sets the update_projects of this SpreadsheetReport.


        :param update_projects: The update_projects of this SpreadsheetReport.  # noqa: E501
        :type: Projects
        """

        self._update_projects = update_projects

    @property
    def warnings(self):
        """Gets the warnings of this SpreadsheetReport.  # noqa: E501


        :return: The warnings of this SpreadsheetReport.  # noqa: E501
        :rtype: Warnings
        """
        return self._warnings

    @warnings.setter
    def warnings(self, warnings):
        """Sets the warnings of this SpreadsheetReport.


        :param warnings: The warnings of this SpreadsheetReport.  # noqa: E501
        :type: Warnings
        """

        self._warnings = warnings

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
        if issubclass(SpreadsheetReport, dict):
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
        if not isinstance(other, SpreadsheetReport):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, SpreadsheetReport):
            return True

        return self.to_dict() != other.to_dict()