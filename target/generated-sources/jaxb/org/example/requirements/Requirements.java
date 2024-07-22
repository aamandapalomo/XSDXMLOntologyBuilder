//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.05.09 a las 09:10:52 AM CEST 
//


package org.example.requirements;

import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="documentation_requirement" type="{edu.upc.dmag}DocumentationRequirement"/&gt;
 *         &lt;element name="publish_requirement" type="{edu.upc.dmag}PublishRequirement"/&gt;
 *         &lt;element name="ensuring_requirement" type="{edu.upc.dmag}EnsuringRequirement"/&gt;
 *         &lt;element name="design_goal_requirement" type="{edu.upc.dmag}DesignGoalRequirement"/&gt;
 *         &lt;element name="provisioning_goal_requirement" type="{edu.upc.dmag}ProvisioningDesignGoalRequirement"/&gt;
 *         &lt;element name="avoiding_event_design_requirement" type="{edu.upc.dmag}AvoidingEventDesignRequirement"/&gt;
 *         &lt;element name="definition_requirement" type="{edu.upc.dmag}DefinitionRequirement"/&gt;
 *         &lt;element name="maintenance_requirement" type="{edu.upc.dmag}MaintenanceRequirement"/&gt;
 *         &lt;element name="implementation_requirement" type="{edu.upc.dmag}ImplementationRequirement"/&gt;
 *         &lt;element name="communication_requirement" type="{edu.upc.dmag}CommunicationRequirement"/&gt;
 *         &lt;element name="verification_requirement" type="{edu.upc.dmag}VerificationRequirement"/&gt;
 *         &lt;element name="validation_requirement" type="{edu.upc.dmag}ValidationRequirement"/&gt;
 *         &lt;element name="identification_requirement" type="{edu.upc.dmag}IdentificationRequirement"/&gt;
 *         &lt;element name="monitoring_requirement" type="{edu.upc.dmag}MonitoringRequirement"/&gt;
 *         &lt;element name="mitigation_requirement" type="{edu.upc.dmag}MitigationRequirement"/&gt;
 *         &lt;element name="following_requirement" type="{edu.upc.dmag}FollowingRequirement"/&gt;
 *         &lt;element name="managing_requirement" type="{edu.upc.dmag}ManagingRequirement"/&gt;
 *         &lt;element name="establishment_requirement" type="{edu.upc.dmag}EstablishmentRequirement"/&gt;
 *         &lt;element name="evaluation_requirement" type="{edu.upc.dmag}EvaluationRequirement"/&gt;
 *         &lt;element name="consideration_requirement" type="{edu.upc.dmag}ConsiderationRequirement"/&gt;
 *         &lt;element name="performing_requirement" type="{edu.upc.dmag}PerformingRequirement"/&gt;
 *         &lt;element name="prohibited_performing_requirement" type="{edu.upc.dmag}ProhibitedPerformingRequirement"/&gt;
 *         &lt;element name="confirmation_requirement" type="{edu.upc.dmag}ConfirmationRequirement"/&gt;
 *         &lt;element name="collaboration_requirement" type="{edu.upc.dmag}CollaborationRequirement"/&gt;
 *         &lt;element name="implement_communication_requirement" type="{edu.upc.dmag}ImplementCommunicationRequirement"/&gt;
 *         &lt;element name="prohibited_implementation_requirement" type="{edu.upc.dmag}ProhibitedImplementationRequirement"/&gt;
 *         &lt;element name="organization_property_requirement" type="{edu.upc.dmag}OrganizationPropertyRequirement"/&gt;
 *         &lt;element name="organization_requirement" type="{edu.upc.dmag}OrganizationRequirement"/&gt;
 *         &lt;element name="organization_control_requirement" type="{edu.upc.dmag}OrganizationControlRequirement"/&gt;
 *         &lt;element name="archival_requirement" type="{edu.upc.dmag}ArchivalRequirement"/&gt;
 *         &lt;element name="determination_requirement" type="{edu.upc.dmag}DeterminationRequirement"/&gt;
 *         &lt;element name="information_collection_requirement" type="{edu.upc.dmag}InformationCollectionRequirement"/&gt;
 *         &lt;element name="demonstration_requirement" type="{edu.upc.dmag}DemonstrationRequirement"/&gt;
 *         &lt;element name="facilitation_requirement" type="{edu.upc.dmag}FacilitationRequirement"/&gt;
 *         &lt;element name="protection_requirement" type="{edu.upc.dmag}ProtectionRequirement"/&gt;
 *         &lt;element name="defence_against_requirement" type="{edu.upc.dmag}DefenceAgainstRequirement"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentationRequirementOrPublishRequirementOrEnsuringRequirement"
})
@XmlRootElement(name = "Requirements")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
public class Requirements {

    @XmlElements({
        @XmlElement(name = "documentation_requirement", type = DocumentationRequirement.class),
        @XmlElement(name = "publish_requirement", type = PublishRequirement.class),
        @XmlElement(name = "ensuring_requirement", type = EnsuringRequirement.class),
        @XmlElement(name = "design_goal_requirement", type = DesignGoalRequirement.class),
        @XmlElement(name = "provisioning_goal_requirement", type = ProvisioningDesignGoalRequirement.class),
        @XmlElement(name = "avoiding_event_design_requirement", type = AvoidingEventDesignRequirement.class),
        @XmlElement(name = "definition_requirement", type = DefinitionRequirement.class),
        @XmlElement(name = "maintenance_requirement", type = MaintenanceRequirement.class),
        @XmlElement(name = "implementation_requirement", type = ImplementationRequirement.class),
        @XmlElement(name = "communication_requirement", type = CommunicationRequirement.class),
        @XmlElement(name = "verification_requirement", type = VerificationRequirement.class),
        @XmlElement(name = "validation_requirement", type = ValidationRequirement.class),
        @XmlElement(name = "identification_requirement", type = IdentificationRequirement.class),
        @XmlElement(name = "monitoring_requirement", type = MonitoringRequirement.class),
        @XmlElement(name = "mitigation_requirement", type = MitigationRequirement.class),
        @XmlElement(name = "following_requirement", type = FollowingRequirement.class),
        @XmlElement(name = "managing_requirement", type = ManagingRequirement.class),
        @XmlElement(name = "establishment_requirement", type = EstablishmentRequirement.class),
        @XmlElement(name = "evaluation_requirement", type = EvaluationRequirement.class),
        @XmlElement(name = "consideration_requirement", type = ConsiderationRequirement.class),
        @XmlElement(name = "performing_requirement", type = PerformingRequirement.class),
        @XmlElement(name = "prohibited_performing_requirement", type = ProhibitedPerformingRequirement.class),
        @XmlElement(name = "confirmation_requirement", type = ConfirmationRequirement.class),
        @XmlElement(name = "collaboration_requirement", type = CollaborationRequirement.class),
        @XmlElement(name = "implement_communication_requirement", type = ImplementCommunicationRequirement.class),
        @XmlElement(name = "prohibited_implementation_requirement", type = ProhibitedImplementationRequirement.class),
        @XmlElement(name = "organization_property_requirement", type = OrganizationPropertyRequirement.class),
        @XmlElement(name = "organization_requirement", type = OrganizationRequirement.class),
        @XmlElement(name = "organization_control_requirement", type = OrganizationControlRequirement.class),
        @XmlElement(name = "archival_requirement", type = ArchivalRequirement.class),
        @XmlElement(name = "determination_requirement", type = DeterminationRequirement.class),
        @XmlElement(name = "information_collection_requirement", type = InformationCollectionRequirement.class),
        @XmlElement(name = "demonstration_requirement", type = DemonstrationRequirement.class),
        @XmlElement(name = "facilitation_requirement", type = FacilitationRequirement.class),
        @XmlElement(name = "protection_requirement", type = ProtectionRequirement.class),
        @XmlElement(name = "defence_against_requirement", type = DefenceAgainstRequirement.class)
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    protected List<Requirement> documentationRequirementOrPublishRequirementOrEnsuringRequirement;

    /**
     * Gets the value of the documentationRequirementOrPublishRequirementOrEnsuringRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the documentationRequirementOrPublishRequirementOrEnsuringRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentationRequirementOrPublishRequirementOrEnsuringRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentationRequirement }
     * {@link PublishRequirement }
     * {@link EnsuringRequirement }
     * {@link DesignGoalRequirement }
     * {@link ProvisioningDesignGoalRequirement }
     * {@link AvoidingEventDesignRequirement }
     * {@link DefinitionRequirement }
     * {@link MaintenanceRequirement }
     * {@link ImplementationRequirement }
     * {@link CommunicationRequirement }
     * {@link VerificationRequirement }
     * {@link ValidationRequirement }
     * {@link IdentificationRequirement }
     * {@link MonitoringRequirement }
     * {@link MitigationRequirement }
     * {@link FollowingRequirement }
     * {@link ManagingRequirement }
     * {@link EstablishmentRequirement }
     * {@link EvaluationRequirement }
     * {@link ConsiderationRequirement }
     * {@link PerformingRequirement }
     * {@link ProhibitedPerformingRequirement }
     * {@link ConfirmationRequirement }
     * {@link CollaborationRequirement }
     * {@link ImplementCommunicationRequirement }
     * {@link ProhibitedImplementationRequirement }
     * {@link OrganizationPropertyRequirement }
     * {@link OrganizationRequirement }
     * {@link OrganizationControlRequirement }
     * {@link ArchivalRequirement }
     * {@link DeterminationRequirement }
     * {@link InformationCollectionRequirement }
     * {@link DemonstrationRequirement }
     * {@link FacilitationRequirement }
     * {@link ProtectionRequirement }
     * {@link DefenceAgainstRequirement }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2024-05-09T09:10:52+02:00")
    public List<Requirement> getDocumentationRequirementOrPublishRequirementOrEnsuringRequirement() {
        if (documentationRequirementOrPublishRequirementOrEnsuringRequirement == null) {
            documentationRequirementOrPublishRequirementOrEnsuringRequirement = new ArrayList<Requirement>();
        }
        return this.documentationRequirementOrPublishRequirementOrEnsuringRequirement;
    }

}
