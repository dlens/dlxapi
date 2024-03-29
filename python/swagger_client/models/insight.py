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


class Insight(object):
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
        'insight_type': 'InsightType',
        'grade': 'Grade',
        'score': 'float',
        'field_insights': 'list[FieldInsight]'
    }

    attribute_map = {
        'insight_type': 'insightType',
        'grade': 'grade',
        'score': 'score',
        'field_insights': 'fieldInsights'
    }

    def __init__(self, insight_type=None, grade=None, score=0.0, field_insights=None):  # noqa: E501
        """Insight - a model defined in Swagger"""  # noqa: E501

        self._insight_type = None
        self._grade = None
        self._score = None
        self._field_insights = None
        self.discriminator = None

        if insight_type is not None:
            self.insight_type = insight_type
        if grade is not None:
            self.grade = grade
        if score is not None:
            self.score = score
        if field_insights is not None:
            self.field_insights = field_insights

    @property
    def insight_type(self):
        """Gets the insight_type of this Insight.  # noqa: E501


        :return: The insight_type of this Insight.  # noqa: E501
        :rtype: InsightType
        """
        return self._insight_type

    @insight_type.setter
    def insight_type(self, insight_type):
        """Sets the insight_type of this Insight.


        :param insight_type: The insight_type of this Insight.  # noqa: E501
        :type: InsightType
        """

        self._insight_type = insight_type

    @property
    def grade(self):
        """Gets the grade of this Insight.  # noqa: E501


        :return: The grade of this Insight.  # noqa: E501
        :rtype: Grade
        """
        return self._grade

    @grade.setter
    def grade(self, grade):
        """Sets the grade of this Insight.


        :param grade: The grade of this Insight.  # noqa: E501
        :type: Grade
        """

        self._grade = grade

    @property
    def score(self):
        """Gets the score of this Insight.  # noqa: E501


        :return: The score of this Insight.  # noqa: E501
        :rtype: float
        """
        return self._score

    @score.setter
    def score(self, score):
        """Sets the score of this Insight.


        :param score: The score of this Insight.  # noqa: E501
        :type: float
        """

        self._score = score

    @property
    def field_insights(self):
        """Gets the field_insights of this Insight.  # noqa: E501


        :return: The field_insights of this Insight.  # noqa: E501
        :rtype: list[FieldInsight]
        """
        return self._field_insights

    @field_insights.setter
    def field_insights(self, field_insights):
        """Sets the field_insights of this Insight.


        :param field_insights: The field_insights of this Insight.  # noqa: E501
        :type: list[FieldInsight]
        """

        self._field_insights = field_insights

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
        if issubclass(Insight, dict):
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
        if not isinstance(other, Insight):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
