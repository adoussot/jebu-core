
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour timeType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="timeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="timecode" type="{urn:ebu:metadata-schema:ebuCore_2016}timecodeType"/>
 *         &lt;element name="normalPlayTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="editUnitNumber" type="{urn:ebu:metadata-schema:ebuCore_2016}editUnitNumberType"/>
 *         &lt;element name="time">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}formatGroup"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}typeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeType", propOrder = {
    "time",
    "editUnitNumber",
    "normalPlayTime",
    "timecode"
})
public class TimeType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected TimeType.Time time;
    protected EditUnitNumberType editUnitNumber;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar normalPlayTime;
    protected TimecodeType timecode;
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
     * Obtient la valeur de la propri�t� time.
     * 
     * @return
     *     possible object is
     *     {@link TimeType.Time }
     *     
     */
    public TimeType.Time getTime() {
        return time;
    }

    /**
     * D�finit la valeur de la propri�t� time.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType.Time }
     *     
     */
    public void setTime(TimeType.Time value) {
        this.time = value;
    }

    /**
     * Obtient la valeur de la propri�t� editUnitNumber.
     * 
     * @return
     *     possible object is
     *     {@link EditUnitNumberType }
     *     
     */
    public EditUnitNumberType getEditUnitNumber() {
        return editUnitNumber;
    }

    /**
     * D�finit la valeur de la propri�t� editUnitNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link EditUnitNumberType }
     *     
     */
    public void setEditUnitNumber(EditUnitNumberType value) {
        this.editUnitNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� normalPlayTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNormalPlayTime() {
        return normalPlayTime;
    }

    /**
     * D�finit la valeur de la propri�t� normalPlayTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNormalPlayTime(XMLGregorianCalendar value) {
        this.normalPlayTime = value;
    }

    /**
     * Obtient la valeur de la propri�t� timecode.
     * 
     * @return
     *     possible object is
     *     {@link TimecodeType }
     *     
     */
    public TimecodeType getTimecode() {
        return timecode;
    }

    /**
     * D�finit la valeur de la propri�t� timecode.
     * 
     * @param value
     *     allowed object is
     *     {@link TimecodeType }
     *     
     */
    public void setTimecode(TimecodeType value) {
        this.timecode = value;
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
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}formatGroup"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Time
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlValue
        protected java.lang.String value;
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
         * Obtient la valeur de la propri�t� value.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getValue() {
            return value;
        }

        /**
         * D�finit la valeur de la propri�t� value.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setValue(java.lang.String value) {
            this.value = value;
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

}
