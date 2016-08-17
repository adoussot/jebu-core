
package ebu.metadata_schema.ebucore_2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *  To provide information to the language used for signing and its purpose
 * 			
 * 
 * <p>Java class for signingFormatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="signingFormatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}formatGroup"/>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *       &lt;attribute name="signingFormatId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="signingFormatVersionId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signingFormatName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="trackId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="trackName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signingSourceUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="signingPresenceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signingFormatType")
public class SigningFormatType {

    @XmlAttribute(name = "signingFormatId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String signingFormatId;
    @XmlAttribute(name = "signingFormatVersionId")
    protected java.lang.String signingFormatVersionId;
    @XmlAttribute(name = "signingFormatName")
    protected java.lang.String signingFormatName;
    @XmlAttribute(name = "trackId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected java.lang.String trackId;
    @XmlAttribute(name = "trackName")
    protected java.lang.String trackName;
    @XmlAttribute(name = "signingSourceUri")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String signingSourceUri;
    @XmlAttribute(name = "language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected java.lang.String language;
    @XmlAttribute(name = "signingPresenceFlag")
    protected java.lang.Boolean signingPresenceFlag;
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

    /**
     * Gets the value of the signingFormatId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSigningFormatId() {
        return signingFormatId;
    }

    /**
     * Sets the value of the signingFormatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSigningFormatId(java.lang.String value) {
        this.signingFormatId = value;
    }

    /**
     * Gets the value of the signingFormatVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSigningFormatVersionId() {
        return signingFormatVersionId;
    }

    /**
     * Sets the value of the signingFormatVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSigningFormatVersionId(java.lang.String value) {
        this.signingFormatVersionId = value;
    }

    /**
     * Gets the value of the signingFormatName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSigningFormatName() {
        return signingFormatName;
    }

    /**
     * Sets the value of the signingFormatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSigningFormatName(java.lang.String value) {
        this.signingFormatName = value;
    }

    /**
     * Gets the value of the trackId property.
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
     * Sets the value of the trackId property.
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
     * Gets the value of the trackName property.
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
     * Sets the value of the trackName property.
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
     * Gets the value of the signingSourceUri property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSigningSourceUri() {
        return signingSourceUri;
    }

    /**
     * Sets the value of the signingSourceUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSigningSourceUri(java.lang.String value) {
        this.signingSourceUri = value;
    }

    /**
     * Gets the value of the language property.
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
     * Sets the value of the language property.
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
     * Gets the value of the signingPresenceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean getSigningPresenceFlag() {
        return signingPresenceFlag;
    }

    /**
     * Sets the value of the signingPresenceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setSigningPresenceFlag(java.lang.Boolean value) {
        this.signingPresenceFlag = value;
    }

    /**
     * Gets the value of the formatLabel property.
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
     * Sets the value of the formatLabel property.
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
     * Gets the value of the formatDefinition property.
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
     * Sets the value of the formatDefinition property.
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
     * Gets the value of the formatLink property.
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
     * Sets the value of the formatLink property.
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
     * Gets the value of the formatSource property.
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
     * Sets the value of the formatSource property.
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
     * Gets the value of the formatNamespace property.
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
     * Sets the value of the formatNamespace property.
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
     * Gets the value of the formatLanguage property.
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
     * Sets the value of the formatLanguage property.
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
     * Gets the value of the typeLabel property.
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
     * Sets the value of the typeLabel property.
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
     * Gets the value of the typeDefinition property.
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
     * Sets the value of the typeDefinition property.
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
     * Gets the value of the typeLink property.
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
     * Sets the value of the typeLink property.
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
     * Gets the value of the typeSource property.
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
     * Sets the value of the typeSource property.
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
     * Gets the value of the typeNamespace property.
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
     * Sets the value of the typeNamespace property.
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
     * Gets the value of the typeLanguage property.
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
     * Sets the value of the typeLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeLanguage(java.lang.String value) {
        this.typeLanguage = value;
    }

}