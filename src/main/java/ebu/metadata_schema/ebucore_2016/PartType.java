
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *  To describe e.g. editorial segment / fragments (to be identified or
 * 				located using e.g. W3C's Media Fragment URIs, timelines e.g. for dynamic technical
 * 				metadata, play lists, elements of a group (itself described at root level) such as
 * 				"tracks" of a record, episodes of a series or season, etc. It can also be sued to
 * 				split data into user defined clusters. It can be used to describe different
 * 				instantiations of the same asset in different locations possibly in a different
 * 				formats with different rights. Etc. 
 * 
 *  Each part can be described using the same level of detiled
 * 						information as provided by the coreMetadata element. 
 * 
 * <p>Classe Java pour partType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="partType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebu:metadata-schema:ebuCore_2016}coreMetadataType">
 *       &lt;sequence>
 *         &lt;element name="partStartTime" type="{urn:ebu:metadata-schema:ebuCore_2016}timeType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="partDuration" type="{urn:ebu:metadata-schema:ebuCore_2016}durationType" minOccurs="0"/>
 *           &lt;element name="partEndTime" type="{urn:ebu:metadata-schema:ebuCore_2016}timeType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}typeGroup"/>
 *       &lt;attribute name="partId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="partName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="partDefinition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="partNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="partTotalNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partType", propOrder = {
    "partStartTime",
    "partEndTime",
    "partDuration"
})
public class PartType
    extends CoreMetadataType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected TimeType partStartTime;
    protected TimeType partEndTime;
    protected DurationType partDuration;
    @XmlAttribute(name = "partId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected java.lang.String partId;
    @XmlAttribute(name = "partName")
    protected java.lang.String partName;
    @XmlAttribute(name = "partDefinition")
    protected java.lang.String partDefinition;
    @XmlAttribute(name = "partNumber")
    protected BigInteger partNumber;
    @XmlAttribute(name = "partTotalNumber")
    protected BigInteger partTotalNumber;
    @XmlAttribute(name = "typeLabel")
    protected java.lang.String typeLabel;
    @XmlAttribute(name = "typeDefinition")
    protected java.lang.String typeDefinition;
    @XmlAttribute(name = "typeLink")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String typeLink;
    @XmlAttribute(name = "typeSource")
    protected java.lang.String typeSource;
    @XmlAttribute(name = "typeNamespace")
    protected java.lang.String typeNamespace;
    @XmlAttribute(name = "typeLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected java.lang.String typeLanguage;
    @XmlAttribute(name = "typeThesaurus")
    protected java.lang.String typeThesaurus;

    /**
     * Obtient la valeur de la propri�t� partStartTime.
     * 
     * @return
     *     possible object is
     *     {@link TimeType }
     *     
     */
    public TimeType getPartStartTime() {
        return partStartTime;
    }

    /**
     * D�finit la valeur de la propri�t� partStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType }
     *     
     */
    public void setPartStartTime(TimeType value) {
        this.partStartTime = value;
    }

    /**
     * Obtient la valeur de la propri�t� partEndTime.
     * 
     * @return
     *     possible object is
     *     {@link TimeType }
     *     
     */
    public TimeType getPartEndTime() {
        return partEndTime;
    }

    /**
     * D�finit la valeur de la propri�t� partEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType }
     *     
     */
    public void setPartEndTime(TimeType value) {
        this.partEndTime = value;
    }

    /**
     * Obtient la valeur de la propri�t� partDuration.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getPartDuration() {
        return partDuration;
    }

    /**
     * D�finit la valeur de la propri�t� partDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setPartDuration(DurationType value) {
        this.partDuration = value;
    }

    /**
     * Obtient la valeur de la propri�t� partId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPartId() {
        return partId;
    }

    /**
     * D�finit la valeur de la propri�t� partId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPartId(java.lang.String value) {
        this.partId = value;
    }

    /**
     * Obtient la valeur de la propri�t� partName.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPartName() {
        return partName;
    }

    /**
     * D�finit la valeur de la propri�t� partName.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPartName(java.lang.String value) {
        this.partName = value;
    }

    /**
     * Obtient la valeur de la propri�t� partDefinition.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPartDefinition() {
        return partDefinition;
    }

    /**
     * D�finit la valeur de la propri�t� partDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPartDefinition(java.lang.String value) {
        this.partDefinition = value;
    }

    /**
     * Obtient la valeur de la propri�t� partNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPartNumber() {
        return partNumber;
    }

    /**
     * D�finit la valeur de la propri�t� partNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPartNumber(BigInteger value) {
        this.partNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� partTotalNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPartTotalNumber() {
        return partTotalNumber;
    }

    /**
     * D�finit la valeur de la propri�t� partTotalNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPartTotalNumber(BigInteger value) {
        this.partTotalNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeLabel.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeLabel() {
        return typeLabel;
    }

    /**
     * D�finit la valeur de la propri�t� typeLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeLabel(java.lang.String value) {
        this.typeLabel = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeDefinition.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeDefinition() {
        return typeDefinition;
    }

    /**
     * D�finit la valeur de la propri�t� typeDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeDefinition(java.lang.String value) {
        this.typeDefinition = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeLink.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeLink() {
        return typeLink;
    }

    /**
     * D�finit la valeur de la propri�t� typeLink.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeLink(java.lang.String value) {
        this.typeLink = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeSource.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeSource() {
        return typeSource;
    }

    /**
     * D�finit la valeur de la propri�t� typeSource.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeSource(java.lang.String value) {
        this.typeSource = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeNamespace.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeNamespace() {
        return typeNamespace;
    }

    /**
     * D�finit la valeur de la propri�t� typeNamespace.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeNamespace(java.lang.String value) {
        this.typeNamespace = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeLanguage.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeLanguage() {
        return typeLanguage;
    }

    /**
     * D�finit la valeur de la propri�t� typeLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeLanguage(java.lang.String value) {
        this.typeLanguage = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeThesaurus.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeThesaurus() {
        return typeThesaurus;
    }

    /**
     * D�finit la valeur de la propri�t� typeThesaurus.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeThesaurus(java.lang.String value) {
        this.typeThesaurus = value;
    }

}
