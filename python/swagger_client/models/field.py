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


class Field(object):
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
        'id': 'str',
        'name': 'str',
        'original_name': 'str',
        'description': 'str',
        'type': 'FieldType',
        'source': 'Source',
        'portfolio': 'Portfolio',
        'parent': 'Field',
        'position': 'int',
        'type_position': 'int',
        'field_values': 'FieldValues',
        'target_type': 'TargetType',
        'data_type': 'DataType',
        'calculation_type': 'CalculationType',
        'is_field_type_approved': 'bool',
        'tag_ids': 'list[str]',
        'category_options': 'CategoryOptions',
        'is_idea_field': 'bool',
        'idea_field_position': 'int',
        'is_idea_field_required': 'bool',
        'scale': 'Scale',
        'attributes': 'FieldAttributes'
    }

    attribute_map = {
        'id': 'id',
        'name': 'name',
        'original_name': 'originalName',
        'description': 'description',
        'type': 'type',
        'source': 'source',
        'portfolio': 'portfolio',
        'parent': 'parent',
        'position': 'position',
        'type_position': 'typePosition',
        'field_values': 'fieldValues',
        'target_type': 'targetType',
        'data_type': 'dataType',
        'calculation_type': 'calculationType',
        'is_field_type_approved': 'isFieldTypeApproved',
        'tag_ids': 'tagIds',
        'category_options': 'categoryOptions',
        'is_idea_field': 'isIdeaField',
        'idea_field_position': 'ideaFieldPosition',
        'is_idea_field_required': 'isIdeaFieldRequired',
        'scale': 'scale',
        'attributes': 'attributes'
    }

    def __init__(self, id=None, name=None, original_name=None, description=None, type=None, source=None, portfolio=None, parent=None, position=None, type_position=None, field_values=None, target_type=None, data_type=None, calculation_type=None, is_field_type_approved=True, tag_ids=None, category_options=None, is_idea_field=False, idea_field_position=None, is_idea_field_required=False, scale=None, attributes=None):  # noqa: E501
        """Field - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._name = None
        self._original_name = None
        self._description = None
        self._type = None
        self._source = None
        self._portfolio = None
        self._parent = None
        self._position = None
        self._type_position = None
        self._field_values = None
        self._target_type = None
        self._data_type = None
        self._calculation_type = None
        self._is_field_type_approved = None
        self._tag_ids = None
        self._category_options = None
        self._is_idea_field = None
        self._idea_field_position = None
        self._is_idea_field_required = None
        self._scale = None
        self._attributes = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if name is not None:
            self.name = name
        if original_name is not None:
            self.original_name = original_name
        if description is not None:
            self.description = description
        if type is not None:
            self.type = type
        if source is not None:
            self.source = source
        if portfolio is not None:
            self.portfolio = portfolio
        if parent is not None:
            self.parent = parent
        if position is not None:
            self.position = position
        if type_position is not None:
            self.type_position = type_position
        if field_values is not None:
            self.field_values = field_values
        if target_type is not None:
            self.target_type = target_type
        if data_type is not None:
            self.data_type = data_type
        if calculation_type is not None:
            self.calculation_type = calculation_type
        if is_field_type_approved is not None:
            self.is_field_type_approved = is_field_type_approved
        if tag_ids is not None:
            self.tag_ids = tag_ids
        if category_options is not None:
            self.category_options = category_options
        if is_idea_field is not None:
            self.is_idea_field = is_idea_field
        if idea_field_position is not None:
            self.idea_field_position = idea_field_position
        if is_idea_field_required is not None:
            self.is_idea_field_required = is_idea_field_required
        if scale is not None:
            self.scale = scale
        if attributes is not None:
            self.attributes = attributes

    @property
    def id(self):
        """Gets the id of this Field.  # noqa: E501


        :return: The id of this Field.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Field.


        :param id: The id of this Field.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def name(self):
        """Gets the name of this Field.  # noqa: E501


        :return: The name of this Field.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Field.


        :param name: The name of this Field.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def original_name(self):
        """Gets the original_name of this Field.  # noqa: E501


        :return: The original_name of this Field.  # noqa: E501
        :rtype: str
        """
        return self._original_name

    @original_name.setter
    def original_name(self, original_name):
        """Sets the original_name of this Field.


        :param original_name: The original_name of this Field.  # noqa: E501
        :type: str
        """

        self._original_name = original_name

    @property
    def description(self):
        """Gets the description of this Field.  # noqa: E501


        :return: The description of this Field.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this Field.


        :param description: The description of this Field.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def type(self):
        """Gets the type of this Field.  # noqa: E501


        :return: The type of this Field.  # noqa: E501
        :rtype: FieldType
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this Field.


        :param type: The type of this Field.  # noqa: E501
        :type: FieldType
        """

        self._type = type

    @property
    def source(self):
        """Gets the source of this Field.  # noqa: E501


        :return: The source of this Field.  # noqa: E501
        :rtype: Source
        """
        return self._source

    @source.setter
    def source(self, source):
        """Sets the source of this Field.


        :param source: The source of this Field.  # noqa: E501
        :type: Source
        """

        self._source = source

    @property
    def portfolio(self):
        """Gets the portfolio of this Field.  # noqa: E501


        :return: The portfolio of this Field.  # noqa: E501
        :rtype: Portfolio
        """
        return self._portfolio

    @portfolio.setter
    def portfolio(self, portfolio):
        """Sets the portfolio of this Field.


        :param portfolio: The portfolio of this Field.  # noqa: E501
        :type: Portfolio
        """

        self._portfolio = portfolio

    @property
    def parent(self):
        """Gets the parent of this Field.  # noqa: E501


        :return: The parent of this Field.  # noqa: E501
        :rtype: Field
        """
        return self._parent

    @parent.setter
    def parent(self, parent):
        """Sets the parent of this Field.


        :param parent: The parent of this Field.  # noqa: E501
        :type: Field
        """

        self._parent = parent

    @property
    def position(self):
        """Gets the position of this Field.  # noqa: E501


        :return: The position of this Field.  # noqa: E501
        :rtype: int
        """
        return self._position

    @position.setter
    def position(self, position):
        """Sets the position of this Field.


        :param position: The position of this Field.  # noqa: E501
        :type: int
        """

        self._position = position

    @property
    def type_position(self):
        """Gets the type_position of this Field.  # noqa: E501


        :return: The type_position of this Field.  # noqa: E501
        :rtype: int
        """
        return self._type_position

    @type_position.setter
    def type_position(self, type_position):
        """Sets the type_position of this Field.


        :param type_position: The type_position of this Field.  # noqa: E501
        :type: int
        """

        self._type_position = type_position

    @property
    def field_values(self):
        """Gets the field_values of this Field.  # noqa: E501


        :return: The field_values of this Field.  # noqa: E501
        :rtype: FieldValues
        """
        return self._field_values

    @field_values.setter
    def field_values(self, field_values):
        """Sets the field_values of this Field.


        :param field_values: The field_values of this Field.  # noqa: E501
        :type: FieldValues
        """

        self._field_values = field_values

    @property
    def target_type(self):
        """Gets the target_type of this Field.  # noqa: E501


        :return: The target_type of this Field.  # noqa: E501
        :rtype: TargetType
        """
        return self._target_type

    @target_type.setter
    def target_type(self, target_type):
        """Sets the target_type of this Field.


        :param target_type: The target_type of this Field.  # noqa: E501
        :type: TargetType
        """

        self._target_type = target_type

    @property
    def data_type(self):
        """Gets the data_type of this Field.  # noqa: E501


        :return: The data_type of this Field.  # noqa: E501
        :rtype: DataType
        """
        return self._data_type

    @data_type.setter
    def data_type(self, data_type):
        """Sets the data_type of this Field.


        :param data_type: The data_type of this Field.  # noqa: E501
        :type: DataType
        """

        self._data_type = data_type

    @property
    def calculation_type(self):
        """Gets the calculation_type of this Field.  # noqa: E501


        :return: The calculation_type of this Field.  # noqa: E501
        :rtype: CalculationType
        """
        return self._calculation_type

    @calculation_type.setter
    def calculation_type(self, calculation_type):
        """Sets the calculation_type of this Field.


        :param calculation_type: The calculation_type of this Field.  # noqa: E501
        :type: CalculationType
        """

        self._calculation_type = calculation_type

    @property
    def is_field_type_approved(self):
        """Gets the is_field_type_approved of this Field.  # noqa: E501


        :return: The is_field_type_approved of this Field.  # noqa: E501
        :rtype: bool
        """
        return self._is_field_type_approved

    @is_field_type_approved.setter
    def is_field_type_approved(self, is_field_type_approved):
        """Sets the is_field_type_approved of this Field.


        :param is_field_type_approved: The is_field_type_approved of this Field.  # noqa: E501
        :type: bool
        """

        self._is_field_type_approved = is_field_type_approved

    @property
    def tag_ids(self):
        """Gets the tag_ids of this Field.  # noqa: E501


        :return: The tag_ids of this Field.  # noqa: E501
        :rtype: list[str]
        """
        return self._tag_ids

    @tag_ids.setter
    def tag_ids(self, tag_ids):
        """Sets the tag_ids of this Field.


        :param tag_ids: The tag_ids of this Field.  # noqa: E501
        :type: list[str]
        """

        self._tag_ids = tag_ids

    @property
    def category_options(self):
        """Gets the category_options of this Field.  # noqa: E501


        :return: The category_options of this Field.  # noqa: E501
        :rtype: CategoryOptions
        """
        return self._category_options

    @category_options.setter
    def category_options(self, category_options):
        """Sets the category_options of this Field.


        :param category_options: The category_options of this Field.  # noqa: E501
        :type: CategoryOptions
        """

        self._category_options = category_options

    @property
    def is_idea_field(self):
        """Gets the is_idea_field of this Field.  # noqa: E501


        :return: The is_idea_field of this Field.  # noqa: E501
        :rtype: bool
        """
        return self._is_idea_field

    @is_idea_field.setter
    def is_idea_field(self, is_idea_field):
        """Sets the is_idea_field of this Field.


        :param is_idea_field: The is_idea_field of this Field.  # noqa: E501
        :type: bool
        """

        self._is_idea_field = is_idea_field

    @property
    def idea_field_position(self):
        """Gets the idea_field_position of this Field.  # noqa: E501


        :return: The idea_field_position of this Field.  # noqa: E501
        :rtype: int
        """
        return self._idea_field_position

    @idea_field_position.setter
    def idea_field_position(self, idea_field_position):
        """Sets the idea_field_position of this Field.


        :param idea_field_position: The idea_field_position of this Field.  # noqa: E501
        :type: int
        """

        self._idea_field_position = idea_field_position

    @property
    def is_idea_field_required(self):
        """Gets the is_idea_field_required of this Field.  # noqa: E501


        :return: The is_idea_field_required of this Field.  # noqa: E501
        :rtype: bool
        """
        return self._is_idea_field_required

    @is_idea_field_required.setter
    def is_idea_field_required(self, is_idea_field_required):
        """Sets the is_idea_field_required of this Field.


        :param is_idea_field_required: The is_idea_field_required of this Field.  # noqa: E501
        :type: bool
        """

        self._is_idea_field_required = is_idea_field_required

    @property
    def scale(self):
        """Gets the scale of this Field.  # noqa: E501


        :return: The scale of this Field.  # noqa: E501
        :rtype: Scale
        """
        return self._scale

    @scale.setter
    def scale(self, scale):
        """Sets the scale of this Field.


        :param scale: The scale of this Field.  # noqa: E501
        :type: Scale
        """

        self._scale = scale

    @property
    def attributes(self):
        """Gets the attributes of this Field.  # noqa: E501


        :return: The attributes of this Field.  # noqa: E501
        :rtype: FieldAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes):
        """Sets the attributes of this Field.


        :param attributes: The attributes of this Field.  # noqa: E501
        :type: FieldAttributes
        """

        self._attributes = attributes

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
        if issubclass(Field, dict):
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
        if not isinstance(other, Field):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
