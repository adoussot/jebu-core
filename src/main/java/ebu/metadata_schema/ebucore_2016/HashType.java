
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *  To provide hash details. 
 * 
 * <p>Classe Java pour hashType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="hashType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hashValue" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *         &lt;element name="hashFunction">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}typeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hashType", propOrder = {
    "hashValue",
    "hashFunction"
})
public class HashType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true, type = java.lang.String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] hashValue;
    @XmlElement(required = true)
    protected HashType.HashFunction hashFunction;

    /**
     * Obtient la valeur de la propri�t� hashValue.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public byte[] getHashValue() {
        return hashValue;
    }

    /**
     * D�finit la valeur de la propri�t� hashValue.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setHashValue(byte[] value) {
        this.hashValue = value;
    }

    /**
     * Obtient la valeur de la propri�t� hashFunction.
     * 
     * @return
     *     possible object is
     *     {@link HashType.HashFunction }
     *     
     */
    public HashType.HashFunction getHashFunction() {
        return hashFunction;
    }

    /**
     * D�finit la valeur de la propri�t� hashFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link HashType.HashFunction }
     *     
     */
    public void setHashFunction(HashType.HashFunction value) {
        this.hashFunction = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2016}typeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HashFunction
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
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

}
