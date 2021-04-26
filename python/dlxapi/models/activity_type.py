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


class ActivityType(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    FIELDCREATEDEVENT = "FieldCreatedEvent"
    FIELDDATATYPEUPDATEDEVENT = "FieldDataTypeUpdatedEvent"
    FIELDDELETEDEVENT = "FieldDeletedEvent"
    FIELDNAMEUPDATEDEVENT = "FieldNameUpdatedEvent"
    FIELDDESCRIPTIONUPDATEDEVENT = "FieldDescriptionUpdatedEvent"
    FIELDTYPEPOSITIONUPDATEDEVENT = "FieldTypePositionUpdatedEvent"
    FIELDPOSITIONUPDATEDEVENT = "FieldPositionUpdatedEvent"
    FIELDTARGETTYPEUPDATEDEVENT = "FieldTargetTypeUpdatedEvent"
    FIELDTYPEUPDATEDEVENT = "FieldTypeUpdatedEvent"
    FIELDCALCULATIONTYPEUPDATEDEVENT = "FieldCalculationTypeUpdatedEvent"
    FIELDISFIELDTYPEAPPROVEDUPDATEDEVENT = "FieldIsFieldTypeApprovedUpdatedEvent"
    FIELDISIDEAFIELDUPDATEDEVENT = "FieldIsIdeaFieldUpdatedEvent"
    FIELDTAGADDEDEVENT = "FieldTagAddedEvent"
    FIELDTAGREMOVEDEVENT = "FieldTagRemovedEvent"
    FIELDIDEAFIELDPOSITIONUPDATEDEVENT = "FieldIdeaFieldPositionUpdatedEvent"
    FIELDISIDEAFIELDREQUIREDUPDATEDEVENT = "FieldIsIdeaFieldRequiredUpdatedEvent"
    PORTFOLIOARCHIVEDEVENT = "PortfolioArchivedEvent"
    PORTFOLIOCREATEDEVENT = "PortfolioCreatedEvent"
    PORTFOLIONAMEUPDATEDEVENT = "PortfolioNameUpdatedEvent"
    PORTFOLIOUSERREGISTRATIONTOKENUPDATEDEVENT = "PortfolioUserRegistrationTokenUpdatedEvent"
    SUBPORTFOLIOADDEDEVENT = "SubPortfolioAddedEvent"
    SUBPORTFOLIOREMOVEDEVENT = "SubPortfolioRemovedEvent"
    PORTFOLIOPLANCREATEDEVENT = "PortfolioPlanCreatedEvent"
    PORTFOLIOPLANDELETEDEVENT = "PortfolioPlanDeletedEvent"
    PORTFOLIOPLANUSERCREATEDV2EVENT = "PortfolioPlanUserCreatedV2Event"
    PORTFOLIOPLANUSERFIELDPERMISSIONSUPDATEDEVENT = "PortfolioPlanUserFieldPermissionsUpdatedEvent"
    PORTFOLIOPLANUSERPROJECTPERMISSIONSUPDATEDEVENT = "PortfolioPlanUserProjectPermissionsUpdatedEvent"
    PORTFOLIOPLANUSERROLESUPDATEDNEWEVENT = "PortfolioPlanUserRolesUpdatedNewEvent"
    PORTFOLIOPLANUSERDELETEDEVENT = "PortfolioPlanUserDeletedEvent"
    PROJECTCREATEDEVENT = "ProjectCreatedEvent"
    PROJECTDELETEDEVENT = "ProjectDeletedEvent"
    PROJECTFIELDVALUEDELETEDEVENT = "ProjectFieldValueDeletedEvent"
    PROJECTFIELDVALUEUPDATEDEVENT = "ProjectFieldValueUpdatedEvent"
    PROJECTTAGADDEDEVENT = "ProjectTagAddedEvent"
    PROJECTTAGREMOVEDEVENT = "ProjectTagRemovedEvent"
    PROJECTPORTFOLIOPLANFIELDVALUESCOPIEDEVENT = "ProjectPortfolioPlanFieldValuesCopiedEvent"
    PROJECTPORTFOLIOPLANFIELDVALUEUPDATEDEVENT = "ProjectPortfolioPlanFieldValueUpdatedEvent"
    PROJECTPORTFOLIOPLANFIELDVALUEDELETEDEVENT = "ProjectPortfolioPlanFieldValueDeletedEvent"
    PROJECTPORTFOLIOPLANDELETEDEVENT = "ProjectPortfolioPlanDeletedEvent"
    PROJECTPORTFOLIOPLANISDRAFTUPDATEDEVENT = "ProjectPortfolioPlanIsDraftUpdatedEvent"
    RESOURCEPOOLBUDGETAMOUNTUPDATEDEVENT = "ResourcePoolBudgetAmountUpdatedEvent"
    RESOURCEPOOLPLANBUDGETAMOUNTUPDATEDEVENT = "ResourcePoolPlanBudgetAmountUpdatedEvent"
    RESOURCEPOOLPLANBUDGETCOPIEDEVENT = "ResourcePoolPlanBudgetCopiedEvent"
    RESOURCEPOOLCREATEDEVENT = "ResourcePoolCreatedEvent"
    RESOURCEPOOLNAMEUPDATEDEVENT = "ResourcePoolNameUpdatedEvent"
    RESOURCEPOOLDELETEDEVENT = "ResourcePoolDeletedEvent"
    SOURCECREATEDEVENT = "SourceCreatedEvent"
    SOURCEDELETEDEVENT = "SourceDeletedEvent"
    SOURCENAMEUPDATEDEVENT = "SourceNameUpdatedEvent"
    USERADDEDEVENT = "UserAddedEvent"
    USERAPPROVALADDEDEVENT = "UserApprovalAddedEvent"
    USERAUTHENTICATEDEVENT = "UserAuthenticatedEvent"
    USERGROUPADDEDEVENT = "UserGroupAddedEvent"
    AUTHORIZATIONCODEGENERATEDEVENT = "AuthorizationCodeGeneratedEvent"
    ACCESSTOKENGENERATEDEVENT = "AccessTokenGeneratedEvent"
    PLANCREATEDEVENT = "PlanCreatedEvent"
    PLANDELETEDEVENT = "PlanDeletedEvent"
    PLANGENERATEDEVENT = "PlanGeneratedEvent"
    PLANNAMEUPDATEDEVENT = "PlanNameUpdatedEvent"
    PLANCOPIEDEVENT = "PlanCopiedEvent"
    PLANPROJECTFUNDINGUPDATEDEVENT = "PlanProjectFundingUpdatedEvent"
    PLANTYPEUPDATEDEVENT = "PlanTypeUpdatedEvent"
    PLANCOMPARISONCREATEDEVENT = "PlanComparisonCreatedEvent"
    PLANCOMPARISONNAMEUPDATEDEVENT = "PlanComparisonNameUpdatedEvent"
    PLANCOMPARISONPLANSUPDATEDEVENT = "PlanComparisonPlansUpdatedEvent"
    PORTFOLIOPLANNAMEUPDATEDEVENT = "PortfolioPlanNameUpdatedEvent"
    PORTFOLIOPLANDESCRIPTIONUPDATEDEVENT = "PortfolioPlanDescriptionUpdatedEvent"
    PORTFOLIOTIMEINTERVALUPDATEDEVENT = "PortfolioTimeIntervalUpdatedEvent"
    PORTFOLIOBUDGETTIMEPERIODTYPEUPDATEDEVENT = "PortfolioBudgetTimePeriodTypeUpdatedEvent"
    PORTFOLIOISMONTHLYSPENDPLANUPDATEDEVENT = "PortfolioIsMonthlySpendPlanUpdatedEvent"
    PORTFOLIOPLANREBASELINEDEVENT = "PortfolioPlanRebaselinedEvent"
    PORTFOLIOPLANDATAIMPORTEDEVENT = "PortfolioPlanDataImportedEvent"
    PORTFOLIOPLANUSERDRAFTPROJECTIDSUPDATEDEVENT = "PortfolioPlanUserDraftProjectIdsUpdatedEvent"
    COMMENTADDEDEVENT = "CommentAddedEvent"
    COMMENTEDITEDEVENT = "CommentEditedEvent"
    COMMENTDELETEDEVENT = "CommentDeletedEvent"
    TAGCREATEDEVENT = "TagCreatedEvent"
    TAGNAMEUPDATEDEVENT = "TagNameUpdatedEvent"
    TAGCOLORUPDATEDEVENT = "TagColorUpdatedEvent"
    TAGPARENTUPDATEDEVENT = "TagParentUpdatedEvent"
    TAGDELETEDEVENT = "TagDeletedEvent"
    CATEGORYOPTIONCREATEDEVENT = "CategoryOptionCreatedEvent"
    FIELDCATEGORYOPTIONSUPDATEDEVENT = "FieldCategoryOptionsUpdatedEvent"
    CATEGORYOPTIONNAMEUPDATEDEVENT = "CategoryOptionNameUpdatedEvent"
    CATEGORYOPTIONDELETEDEVENT = "CategoryOptionDeletedEvent"
    PROJECTCONTRIBUTINGUSERADDEDEVENT = "ProjectContributingUserAddedEvent"
    PROJECTCONTRIBUTINGUSERDELETEDEVENT = "ProjectContributingUserDeletedEvent"
    ATTACHMENTDELETEDEVENT = "AttachmentDeletedEvent"
    ATTACHMENTCREATEDEVENT = "AttachmentCreatedEvent"
    ATTACHMENTNAMEUPDATEDEVENT = "AttachmentNameUpdatedEvent"
    PROJECTATTACHMENTADDEDEVENT = "ProjectAttachmentAddedEvent"
    PROJECTATTACHMENTREMOVEDEVENT = "ProjectAttachmentRemovedEvent"
    CUSTOMNAMEADDEDEVENT = "CustomNameAddedEvent"
    CUSTOMNAMEUPDATEDEVENT = "CustomNameUpdatedEvent"
    CUSTOMNAMEDELETEDEVENT = "CustomNameDeletedEvent"
    PROJECTDEPENDSONADDEDEVENT = "ProjectDependsOnAddedEvent"
    PROJECTDEPENDSONREMOVEDEVENT = "ProjectDependsOnRemovedEvent"

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
    }

    attribute_map = {
    }

    def __init__(self, _configuration=None):  # noqa: E501
        """ActivityType - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration
        self.discriminator = None

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
        if issubclass(ActivityType, dict):
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
        if not isinstance(other, ActivityType):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ActivityType):
            return True

        return self.to_dict() != other.to_dict()