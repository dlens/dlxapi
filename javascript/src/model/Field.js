/**
 * Decision Lens API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.7
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/CalculationType', 'model/CategoryOptions', 'model/DataType', 'model/DlResource', 'model/Field', 'model/FieldAttributes', 'model/FieldType', 'model/FieldValues', 'model/Portfolio', 'model/Scale', 'model/Source', 'model/TargetType'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CalculationType'), require('./CategoryOptions'), require('./DataType'), require('./DlResource'), require('./Field'), require('./FieldAttributes'), require('./FieldType'), require('./FieldValues'), require('./Portfolio'), require('./Scale'), require('./Source'), require('./TargetType'));
  } else {
    // Browser globals (root is window)
    if (!root.DecisionLensApi) {
      root.DecisionLensApi = {};
    }
    root.DecisionLensApi.Field = factory(root.DecisionLensApi.ApiClient, root.DecisionLensApi.CalculationType, root.DecisionLensApi.CategoryOptions, root.DecisionLensApi.DataType, root.DecisionLensApi.DlResource, root.DecisionLensApi.Field, root.DecisionLensApi.FieldAttributes, root.DecisionLensApi.FieldType, root.DecisionLensApi.FieldValues, root.DecisionLensApi.Portfolio, root.DecisionLensApi.Scale, root.DecisionLensApi.Source, root.DecisionLensApi.TargetType);
  }
}(this, function(ApiClient, CalculationType, CategoryOptions, DataType, DlResource, Field, FieldAttributes, FieldType, FieldValues, Portfolio, Scale, Source, TargetType) {
  'use strict';




  /**
   * The Field model module.
   * @module model/Field
   * @version 1.0
   */

  /**
   * Constructs a new <code>Field</code>.
   * @alias module:model/Field
   * @class
   * @extends module:model/DlResource
   */
  var exports = function() {
    var _this = this;
    DlResource.call(_this);




















  };

  /**
   * Constructs a <code>Field</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Field} obj Optional instance to populate.
   * @return {module:model/Field} The populated <code>Field</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      DlResource.constructFromObject(data, obj);
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = FieldType.constructFromObject(data['type']);
      }
      if (data.hasOwnProperty('source')) {
        obj['source'] = Source.constructFromObject(data['source']);
      }
      if (data.hasOwnProperty('portfolio')) {
        obj['portfolio'] = Portfolio.constructFromObject(data['portfolio']);
      }
      if (data.hasOwnProperty('parent')) {
        obj['parent'] = Field.constructFromObject(data['parent']);
      }
      if (data.hasOwnProperty('position')) {
        obj['position'] = ApiClient.convertToType(data['position'], 'Number');
      }
      if (data.hasOwnProperty('typePosition')) {
        obj['typePosition'] = ApiClient.convertToType(data['typePosition'], 'Number');
      }
      if (data.hasOwnProperty('fieldValues')) {
        obj['fieldValues'] = FieldValues.constructFromObject(data['fieldValues']);
      }
      if (data.hasOwnProperty('targetType')) {
        obj['targetType'] = TargetType.constructFromObject(data['targetType']);
      }
      if (data.hasOwnProperty('dataType')) {
        obj['dataType'] = DataType.constructFromObject(data['dataType']);
      }
      if (data.hasOwnProperty('calculationType')) {
        obj['calculationType'] = CalculationType.constructFromObject(data['calculationType']);
      }
      if (data.hasOwnProperty('isFieldTypeApproved')) {
        obj['isFieldTypeApproved'] = ApiClient.convertToType(data['isFieldTypeApproved'], 'Boolean');
      }
      if (data.hasOwnProperty('tagIds')) {
        obj['tagIds'] = ApiClient.convertToType(data['tagIds'], ['String']);
      }
      if (data.hasOwnProperty('categoryOptions')) {
        obj['categoryOptions'] = CategoryOptions.constructFromObject(data['categoryOptions']);
      }
      if (data.hasOwnProperty('isIdeaField')) {
        obj['isIdeaField'] = ApiClient.convertToType(data['isIdeaField'], 'Boolean');
      }
      if (data.hasOwnProperty('ideaFieldPosition')) {
        obj['ideaFieldPosition'] = ApiClient.convertToType(data['ideaFieldPosition'], 'Number');
      }
      if (data.hasOwnProperty('isIdeaFieldRequired')) {
        obj['isIdeaFieldRequired'] = ApiClient.convertToType(data['isIdeaFieldRequired'], 'Boolean');
      }
      if (data.hasOwnProperty('scale')) {
        obj['scale'] = Scale.constructFromObject(data['scale']);
      }
      if (data.hasOwnProperty('attributes')) {
        obj['attributes'] = FieldAttributes.constructFromObject(data['attributes']);
      }
    }
    return obj;
  }

  exports.prototype = Object.create(DlResource.prototype);
  exports.prototype.constructor = exports;

  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * @member {module:model/FieldType} type
   */
  exports.prototype['type'] = undefined;
  /**
   * @member {module:model/Source} source
   */
  exports.prototype['source'] = undefined;
  /**
   * @member {module:model/Portfolio} portfolio
   */
  exports.prototype['portfolio'] = undefined;
  /**
   * @member {module:model/Field} parent
   */
  exports.prototype['parent'] = undefined;
  /**
   * @member {Number} position
   */
  exports.prototype['position'] = undefined;
  /**
   * @member {Number} typePosition
   */
  exports.prototype['typePosition'] = undefined;
  /**
   * @member {module:model/FieldValues} fieldValues
   */
  exports.prototype['fieldValues'] = undefined;
  /**
   * @member {module:model/TargetType} targetType
   */
  exports.prototype['targetType'] = undefined;
  /**
   * @member {module:model/DataType} dataType
   */
  exports.prototype['dataType'] = undefined;
  /**
   * @member {module:model/CalculationType} calculationType
   */
  exports.prototype['calculationType'] = undefined;
  /**
   * @member {Boolean} isFieldTypeApproved
   * @default true
   */
  exports.prototype['isFieldTypeApproved'] = true;
  /**
   * @member {Array.<String>} tagIds
   */
  exports.prototype['tagIds'] = undefined;
  /**
   * @member {module:model/CategoryOptions} categoryOptions
   */
  exports.prototype['categoryOptions'] = undefined;
  /**
   * @member {Boolean} isIdeaField
   * @default false
   */
  exports.prototype['isIdeaField'] = false;
  /**
   * @member {Number} ideaFieldPosition
   */
  exports.prototype['ideaFieldPosition'] = undefined;
  /**
   * @member {Boolean} isIdeaFieldRequired
   * @default false
   */
  exports.prototype['isIdeaFieldRequired'] = false;
  /**
   * @member {module:model/Scale} scale
   */
  exports.prototype['scale'] = undefined;
  /**
   * @member {module:model/FieldAttributes} attributes
   */
  exports.prototype['attributes'] = undefined;



  return exports;
}));


