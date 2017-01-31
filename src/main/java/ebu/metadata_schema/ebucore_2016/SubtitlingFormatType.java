
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *  Used to provide information on the subtitling format and purpose, e.g.
 * 				translation in a different language 
 * 
 * <p>Classe Java pour subtitlingFormatType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="subtitlingFormatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}typeGroup"/>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}formatGroup"/>
 *       &lt;attribute name="subtitlingFormatId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="subtitlingFormatName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subtitlingFormatProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="trackId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="trackName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subtitlingSourceUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="closed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="subtitlingPresenceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subtitlingFormatType")
public class SubtitlingFormatType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlAttribute(name = "subtitlingFormatId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String subtitlingFormatId;
    @XmlAttribute(name = "subtitlingFormatName")
    protected java.lang.String subtitlingFormatName;
    @XmlAttribute(name = "subtitlingFormatProfile")
    protected java.lang.String subtitlingFormatProfile;
    @XmlAttribute(name = "trackId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected java.lang.String trackId;
    @XmlAttribute(name = "trackName")
    protected java.lang.String trackName;
    @XmlAttribute(name = "subtitlingSourceUri")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String subtitlingSourceUri;
    @XmlAttribute(name = "language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected java.lang.String language;
    @XmlAttribute(name = "closed")
    protected java.lang.Boolean closed;
    @XmlAttribute(name = "subtitlingPresenceFlag")
    protected java.lang.Boolean subtitlingPresenceFlag;
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
    @XmlAttribute(name = "formatLabel")
    protected java.lang.String formatLabel;
    @XmlAttribute(name = "formatDefinition")
    protected java.lang.String formatDefinition;
    @XmlAttribute(name = "formatLink")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String formatLink;
    @XmlAttribute(name = "formatSource")
    protected java.lang.String formatSource;
    @XmlAttribute(name = "formatNamespace")
    protected java.lang.String formatNamespace;
    @XmlAttribute(name = "formatLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected java.lang.String formatLanguage;
    @XmlAttribute(name = "formatThesaurus")
    protected java.lang.String formatThesaurus;

    /**
     * Obtient la valeur de la propri�t� subtitlingFormatId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSubtitlingFormatId() {
        return subtitlingFormatId;
    }

    /**
     * D�finit la valeur de la propri�t� subtitlingFormatId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSubtitlingFormatId(java.lang.String value) {
        this.subtitlingFormatId = value;
    }

    /**
     * Obtient la valeur de la propri�t� subtitlingFormatName.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSubtitlingFormatName() {
        return subtitlingFormatName;
    }

    /**
     * D�finit la valeur de la propri�t� subtitlingFormatName.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSubtitlingFormatName(java.lang.String value) {
        this.subtitlingFormatName = value;
    }

    /**
     * Obtient la valeur de la propri�t� subtitlingFormatProfile.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSubtitlingFormatProfile() {
        return subtitlingFormatProfile;
    }

    /**
     * D�finit la valeur de la propri�t� subtitlingFormatProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSubtitlingFormatProfile(java.lang.String value) {
        this.subtitlingFormatProfile = value;
    }

    /**
     * Obtient la valeur de la propri�t� trackId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTrackId() {
        return trackId;
    }

    /**
     * D�finit la valeur de la propri�t� trackId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTrackId(java.lang.String value) {
        this.trackId = value;
    }

    /**
     * Obtient la valeur de la propri�t� trackName.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTrackName() {
        return trackName;
    }

    /**
     * D�finit la valeur de la propri�t� trackName.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTrackName(java.lang.String value) {
        this.trackName = value;
    }

    /**
     * Obtient la valeur de la propri�t� subtitlingSourceUri.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSubtitlingSourceUri() {
        return subtitlingSourceUri;
    }

    /**
     * D�finit la valeur de la propri�t� subtitlingSourceUri.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSubtitlingSourceUri(java.lang.String value) {
        this.subtitlingSourceUri = value;
    }

    /**
     * Obtient la valeur de la propri�t� language.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLanguage() {
        return language;
    }

    /**
     * D�finit la valeur de la propri�t� language.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLanguage(java.lang.String value) {
        this.language = value;
    }

    /**
     * Obtient la valeur de la propri�t� closed.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isClosed() {
        return closed;
    }

    /**
     * D�finit la valeur de la propri�t� closed.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setClosed(java.lang.Boolean value) {
        this.closed = value;
    }

    /**
     * Obtient la valeur de la propri�t� subtitlingPresenceFlag.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isSubtitlingPresenceFlag() {
        return subtitlingPresenceFlag;
    }

    /**
     * D�finit la valeur de la propri�t� subtitlingPresenceFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setSubtitlingPresenceFlag(java.lang.Boolean value) {
        this.subtitlingPresenceFlag = value;
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

    /**
     * Obtient la valeur de la propri�t� formatLabel.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatLabel() {
        return formatLabel;
    }

    /**
     * D�finit la valeur de la propri�t� formatLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatLabel(java.lang.String value) {
        this.formatLabel = value;
    }

    /**
     * Obtient la valeur de la propri�t� formatDefinition.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatDefinition() {
        return formatDefinition;
    }

    /**
     * D�finit la valeur de la propri�t� formatDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatDefinition(java.lang.String value) {
        this.formatDefinition = value;
    }

    /**
     * Obtient la valeur de la propri�t� formatLink.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatLink() {
        return formatLink;
    }

    /**
     * D�finit la valeur de la propri�t� formatLink.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatLink(java.lang.String value) {
        this.formatLink = value;
    }

    /**
     * Obtient la valeur de la propri�t� formatSource.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatSource() {
        return formatSource;
    }

    /**
     * D�finit la valeur de la propri�t� formatSource.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatSource(java.lang.String value) {
        this.formatSource = value;
    }

    /**
     * Obtient la valeur de la propri�t� formatNamespace.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatNamespace() {
        return formatNamespace;
    }

    /**
     * D�finit la valeur de la propri�t� formatNamespace.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatNamespace(java.lang.String value) {
        this.formatNamespace = value;
    }

    /**
     * Obtient la valeur de la propri�t� formatLanguage.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatLanguage() {
        return formatLanguage;
    }

    /**
     * D�finit la valeur de la propri�t� formatLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatLanguage(java.lang.String value) {
        this.formatLanguage = value;
    }

    /**
     * Obtient la valeur de la propri�t� formatThesaurus.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFormatThesaurus() {
        return formatThesaurus;
    }

    /**
     * D�finit la valeur de la propri�t� formatThesaurus.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFormatThesaurus(java.lang.String value) {
        this.formatThesaurus = value;
    }

}
