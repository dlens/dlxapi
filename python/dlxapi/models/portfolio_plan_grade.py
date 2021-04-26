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


class PortfolioPlanGrade(object):
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
        'type': 'PlanType',
        'grade': 'Grade',
        'field_grades': 'FieldGrades',
        'score': 'float'
    }

    attribute_map = {
        'type': 'type',
        'grade': 'grade',
        'field_grades': 'fieldGrades',
        'score': 'score'
    }

    def __init__(self, type=None, grade=None, field_grades=None, score=0.0, _configuration=None):  # noqa: E501
        """PortfolioPlanGrade - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._type = None
        self._grade = None
        self._field_grades = None
        self._score = None
        self.discriminator = None

        if type is not None:
            self.type = type
        if grade is not None:
            self.grade = grade
        if field_grades is not None:
            self.field_grades = field_grades
        if score is not None:
            self.score = score

    @property
    def type(self):
        """Gets the type of this PortfolioPlanGrade.  # noqa: E501


        :return: The type of this PortfolioPlanGrade.  # noqa: E501
        :rtype: PlanType
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this PortfolioPlanGrade.


        :param type: The type of this PortfolioPlanGrade.  # noqa: E501
        :type: PlanType
        """

        self._type = type

    @property
    def grade(self):
        """Gets the grade of this PortfolioPlanGrade.  # noqa: E501


        :return: The grade of this PortfolioPlanGrade.  # noqa: E501
        :rtype: Grade
        """
        return self._grade

    @grade.setter
    def grade(self, grade):
        """Sets the grade of this PortfolioPlanGrade.


        :param grade: The grade of this PortfolioPlanGrade.  # noqa: E501
        :type: Grade
        """

        self._grade = grade

    @property
    def field_grades(self):
        """Gets the field_grades of this PortfolioPlanGrade.  # noqa: E501


        :return: The field_grades of this PortfolioPlanGrade.  # noqa: E501
        :rtype: FieldGrades
        """
        return self._field_grades

    @field_grades.setter
    def field_grades(self, field_grades):
        """Sets the field_grades of this PortfolioPlanGrade.


        :param field_grades: The field_grades of this PortfolioPlanGrade.  # noqa: E501
        :type: FieldGrades
        """

        self._field_grades = field_grades

    @property
    def score(self):
        """Gets the score of this PortfolioPlanGrade.  # noqa: E501


        :return: The score of this PortfolioPlanGrade.  # noqa: E501
        :rtype: float
        """
        return self._score

    @score.setter
    def score(self, score):
        """Sets the score of this PortfolioPlanGrade.


        :param score: The score of this PortfolioPlanGrade.  # noqa: E501
        :type: float
        """

        self._score = score

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
        if issubclass(PortfolioPlanGrade, dict):
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
        if not isinstance(other, PortfolioPlanGrade):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PortfolioPlanGrade):
            return True

        return self.to_dict() != other.to_dict()