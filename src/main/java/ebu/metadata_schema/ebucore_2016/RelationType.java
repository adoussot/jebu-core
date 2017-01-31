
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.purl.dc.elements._1.ElementType;


/**
 * Recommended best practice is to reference the resource by means of a
 * 				string or number conforming to a formal identification system. Relation is used to
 * 				show the relation in content to another resource. For example, "IsPartOf" is used to
 * 				show the relation between a part of a radio programme and the whole programme, or
 * 				between a track and a record album. A resource can be identified by its title, or
 * 				preferably by an identifier. Relation is used to provide a name, locator, accession,
 * 				identification number or ID where the related item can be obtained or found.
 * 			
 * 
 * <p>Classe Java pour relationType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="relationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}relation"/>
 *         &lt;element name="relationIdentifier" type="{urn:ebu:metadata-schema:ebuCore_2016}identifierType"/>
 *         &lt;element name="relationLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}typeGroup"/>
 *       &lt;attribute name="runningOrderNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="totalNumberOfGroupMembers" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="orderedGroupFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="note" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relationType", propOrder = {
    "relationLink",
    "relationIdentifier",
    "relation"
})
@XmlSeeAlso({
    ebu.metadata_schema.ebucore_2016.CoreMetadataType.HasTrackPart.class
})
public class RelationType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String relationLink;
    protected IdentifierType relationIdentifier;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/")
    protected ElementType relation;
    @XmlAttribute(name = "runningOrderNumber")
    protected BigInteger runningOrderNumber;
    @XmlAttribute(name = "totalNumberOfGroupMembers")
    protected BigInteger totalNumberOfGroupMembers;
    @XmlAttribute(name = "orderedGroupFlag")
    protected java.lang.Boolean orderedGroupFlag;
    @XmlAttribute(name = "note")
    protected java.lang.String note;
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
     * Obtient la valeur de la propri�t� relationLink.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRelationLink() {
        return relationLink;
    }

    /**
     * D�finit la valeur de la propri�t� relationLink.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRelationLink(java.lang.String value) {
        this.relationLink = value;
    }

    /**
     * Obtient la valeur de la propri�t� relationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getRelationIdentifier() {
        return relationIdentifier;
    }

    /**
     * D�finit la valeur de la propri�t� relationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setRelationIdentifier(IdentifierType value) {
        this.relationIdentifier = value;
    }

    /**
     *  The EBU core metadata set is built as a refinement of the Dublin
     * 						Core. A title would be given using this element.
     * 
     * @return
     *     possible object is
     *     {@link ElementType }
     *     
     */
    public ElementType getRelation() {
        return relation;
    }

    /**
     * D�finit la valeur de la propri�t� relation.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementType }
     *     
     */
    public void setRelation(ElementType value) {
        this.relation = value;
    }

    /**
     * Obtient la valeur de la propri�t� runningOrderNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRunningOrderNumber() {
        return runningOrderNumber;
    }

    /**
     * D�finit la valeur de la propri�t� runningOrderNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRunningOrderNumber(BigInteger value) {
        this.runningOrderNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� totalNumberOfGroupMembers.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfGroupMembers() {
        return totalNumberOfGroupMembers;
    }

    /**
     * D�finit la valeur de la propri�t� totalNumberOfGroupMembers.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfGroupMembers(BigInteger value) {
        this.totalNumberOfGroupMembers = value;
    }

    /**
     * Obtient la valeur de la propri�t� orderedGroupFlag.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isOrderedGroupFlag() {
        return orderedGroupFlag;
    }

    /**
     * D�finit la valeur de la propri�t� orderedGroupFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOrderedGroupFlag(java.lang.Boolean value) {
        this.orderedGroupFlag = value;
    }

    /**
     * Obtient la valeur de la propri�t� note.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNote() {
        return note;
    }

    /**
     * D�finit la valeur de la propri�t� note.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNote(java.lang.String value) {
        this.note = value;
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
