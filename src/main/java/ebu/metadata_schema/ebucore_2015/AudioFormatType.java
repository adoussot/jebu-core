
package ebu.metadata_schema.ebucore_2015;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *  To provide a set of audio technical characteristics. 
 * 
 * <p>Classe Java pour audioFormatType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="audioFormatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audioEncoding" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="codec" type="{urn:ebu:metadata-schema:ebuCore_2015}codecType" minOccurs="0"/>
 *         &lt;element name="audioTrackConfiguration" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="samplingRate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sampleSize" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="sampleType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="float"/>
 *               &lt;enumeration value="integer"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bitRate" type="{urn:ebu:metadata-schema:ebuCore_2015}dimensionType" minOccurs="0"/>
 *         &lt;element name="bitRateMax" type="{urn:ebu:metadata-schema:ebuCore_2015}dimensionType" minOccurs="0"/>
 *         &lt;element name="bitRateMode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="none"/>
 *               &lt;enumeration value="constant"/>
 *               &lt;enumeration value="variable"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="audioTrack" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
 *                 &lt;attribute name="trackLanguage" type="{http://www.w3.org/2001/XMLSchema}language" />
 *                 &lt;attribute name="trackId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *                 &lt;attribute name="trackName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="channels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="filter" type="{urn:ebu:metadata-schema:ebuCore_2015}filterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{urn:ebu:metadata-schema:ebuCore_2015}technicalAttributes"/>
 *         &lt;element ref="{urn:ebu:metadata-schema:ebuCore_2015}comment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="audioFormatId" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="audioFormatVersionId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="audioFormatName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="audioFormatDefinition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="audioFormatProfile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="audioFormatProfileLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="audioPresenceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audioFormatType", propOrder = {
    "audioEncoding",
    "codec",
    "audioTrackConfiguration",
    "samplingRate",
    "sampleSize",
    "sampleType",
    "bitRate",
    "bitRateMax",
    "bitRateMode",
    "audioTracks",
    "channels",
    "filters",
    "technicalAttributeStrings",
    "technicalAttributeBytes",
    "technicalAttributeShorts",
    "technicalAttributeIntegers",
    "technicalAttributeLongs",
    "technicalAttributeUnsignedBytes",
    "technicalAttributeUnsignedShorts",
    "technicalAttributeUnsignedIntegers",
    "technicalAttributeUnsignedLongs",
    "technicalAttributeBooleen",
    "technicalAttributeFloats",
    "technicalAttributeRationals",
    "technicalAttributeUris",
    "comments"
})
public class AudioFormatType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected AudioFormatType.AudioEncoding audioEncoding;
    protected CodecType codec;
    protected AudioFormatType.AudioTrackConfiguration audioTrackConfiguration;
    protected Long samplingRate;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sampleSize;
    protected java.lang.String sampleType;
    protected DimensionType bitRate;
    protected DimensionType bitRateMax;
    protected java.lang.String bitRateMode;
    @XmlElement(name = "audioTrack")
    protected List<AudioFormatType.AudioTrack> audioTracks;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger channels;
    @XmlElement(name = "filter")
    protected List<FilterType> filters;
    @XmlElement(name = "technicalAttributeString")
    protected List<ebu.metadata_schema.ebucore_2015.String> technicalAttributeStrings;
    @XmlElement(name = "technicalAttributeByte")
    protected List<Int8> technicalAttributeBytes;
    @XmlElement(name = "technicalAttributeShort")
    protected List<Int16> technicalAttributeShorts;
    @XmlElement(name = "technicalAttributeInteger")
    protected List<Int32> technicalAttributeIntegers;
    @XmlElement(name = "technicalAttributeLong")
    protected List<Int64> technicalAttributeLongs;
    @XmlElement(name = "technicalAttributeUnsignedByte")
    protected List<UInt8> technicalAttributeUnsignedBytes;
    @XmlElement(name = "technicalAttributeUnsignedShort")
    protected List<UInt16> technicalAttributeUnsignedShorts;
    @XmlElement(name = "technicalAttributeUnsignedInteger")
    protected List<UInt32> technicalAttributeUnsignedIntegers;
    @XmlElement(name = "technicalAttributeUnsignedLong")
    protected List<UInt64> technicalAttributeUnsignedLongs;
    @XmlElement(name = "technicalAttributeBoolean")
    protected List<ebu.metadata_schema.ebucore_2015.Boolean> technicalAttributeBooleen;
    @XmlElement(name = "technicalAttributeFloat")
    protected List<Float> technicalAttributeFloats;
    @XmlElement(name = "technicalAttributeRational", defaultValue = "1")
    protected List<TechnicalAttributeRationalType> technicalAttributeRationals;
    @XmlElement(name = "technicalAttributeUri")
    protected List<TechnicalAttributeUriType> technicalAttributeUris;
    @XmlElement(name = "comment")
    protected List<Comment> comments;
    @XmlAttribute(name = "audioFormatId")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String audioFormatId;
    @XmlAttribute(name = "audioFormatVersionId")
    protected java.lang.String audioFormatVersionId;
    @XmlAttribute(name = "audioFormatName")
    protected java.lang.String audioFormatName;
    @XmlAttribute(name = "audioFormatDefinition")
    protected java.lang.String audioFormatDefinition;
    @XmlAttribute(name = "audioFormatProfile")
    protected java.lang.String audioFormatProfile;
    @XmlAttribute(name = "audioFormatProfileLevel")
    protected java.lang.String audioFormatProfileLevel;
    @XmlAttribute(name = "audioPresenceFlag")
    protected java.lang.Boolean audioPresenceFlag;

    /**
     * Obtient la valeur de la propriété audioEncoding.
     * 
     * @return
     *     possible object is
     *     {@link AudioFormatType.AudioEncoding }
     *     
     */
    public AudioFormatType.AudioEncoding getAudioEncoding() {
        return audioEncoding;
    }

    /**
     * Définit la valeur de la propriété audioEncoding.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioFormatType.AudioEncoding }
     *     
     */
    public void setAudioEncoding(AudioFormatType.AudioEncoding value) {
        this.audioEncoding = value;
    }

    /**
     * Obtient la valeur de la propriété codec.
     * 
     * @return
     *     possible object is
     *     {@link CodecType }
     *     
     */
    public CodecType getCodec() {
        return codec;
    }

    /**
     * Définit la valeur de la propriété codec.
     * 
     * @param value
     *     allowed object is
     *     {@link CodecType }
     *     
     */
    public void setCodec(CodecType value) {
        this.codec = value;
    }

    /**
     * Obtient la valeur de la propriété audioTrackConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link AudioFormatType.AudioTrackConfiguration }
     *     
     */
    public AudioFormatType.AudioTrackConfiguration getAudioTrackConfiguration() {
        return audioTrackConfiguration;
    }

    /**
     * Définit la valeur de la propriété audioTrackConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioFormatType.AudioTrackConfiguration }
     *     
     */
    public void setAudioTrackConfiguration(AudioFormatType.AudioTrackConfiguration value) {
        this.audioTrackConfiguration = value;
    }

    /**
     * Obtient la valeur de la propriété samplingRate.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSamplingRate() {
        return samplingRate;
    }

    /**
     * Définit la valeur de la propriété samplingRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSamplingRate(Long value) {
        this.samplingRate = value;
    }

    /**
     * Obtient la valeur de la propriété sampleSize.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSampleSize() {
        return sampleSize;
    }

    /**
     * Définit la valeur de la propriété sampleSize.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSampleSize(BigInteger value) {
        this.sampleSize = value;
    }

    /**
     * Obtient la valeur de la propriété sampleType.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSampleType() {
        return sampleType;
    }

    /**
     * Définit la valeur de la propriété sampleType.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSampleType(java.lang.String value) {
        this.sampleType = value;
    }

    /**
     * Obtient la valeur de la propriété bitRate.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getBitRate() {
        return bitRate;
    }

    /**
     * Définit la valeur de la propriété bitRate.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setBitRate(DimensionType value) {
        this.bitRate = value;
    }

    /**
     * Obtient la valeur de la propriété bitRateMax.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getBitRateMax() {
        return bitRateMax;
    }

    /**
     * Définit la valeur de la propriété bitRateMax.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setBitRateMax(DimensionType value) {
        this.bitRateMax = value;
    }

    /**
     * Obtient la valeur de la propriété bitRateMode.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getBitRateMode() {
        return bitRateMode;
    }

    /**
     * Définit la valeur de la propriété bitRateMode.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setBitRateMode(java.lang.String value) {
        this.bitRateMode = value;
    }

    /**
     * Gets the value of the audioTracks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioTracks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioTracks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioFormatType.AudioTrack }
     * 
     * 
     */
    public List<AudioFormatType.AudioTrack> getAudioTracks() {
        if (audioTracks == null) {
            audioTracks = new ArrayList<>();
        }
        return this.audioTracks;
    }

    /**
     * Obtient la valeur de la propriété channels.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChannels() {
        return channels;
    }

    /**
     * Définit la valeur de la propriété channels.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChannels(BigInteger value) {
        this.channels = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     */
    public List<FilterType> getFilters() {
        if (filters == null) {
            filters = new ArrayList<>();
        }
        return this.filters;
    }

    /**
     * Gets the value of the technicalAttributeStrings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeStrings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeStrings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ebu.metadata_schema.ebucore_2015.String }
     * 
     * 
     */
    public List<ebu.metadata_schema.ebucore_2015.String> getTechnicalAttributeStrings() {
        if (technicalAttributeStrings == null) {
            technicalAttributeStrings = new ArrayList<>();
        }
        return this.technicalAttributeStrings;
    }

    /**
     * Gets the value of the technicalAttributeBytes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeBytes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeBytes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Int8 }
     * 
     * 
     */
    public List<Int8> getTechnicalAttributeBytes() {
        if (technicalAttributeBytes == null) {
            technicalAttributeBytes = new ArrayList<>();
        }
        return this.technicalAttributeBytes;
    }

    /**
     * Gets the value of the technicalAttributeShorts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeShorts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeShorts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Int16 }
     * 
     * 
     */
    public List<Int16> getTechnicalAttributeShorts() {
        if (technicalAttributeShorts == null) {
            technicalAttributeShorts = new ArrayList<>();
        }
        return this.technicalAttributeShorts;
    }

    /**
     * Gets the value of the technicalAttributeIntegers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeIntegers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeIntegers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Int32 }
     * 
     * 
     */
    public List<Int32> getTechnicalAttributeIntegers() {
        if (technicalAttributeIntegers == null) {
            technicalAttributeIntegers = new ArrayList<>();
        }
        return this.technicalAttributeIntegers;
    }

    /**
     * Gets the value of the technicalAttributeLongs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeLongs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeLongs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Int64 }
     * 
     * 
     */
    public List<Int64> getTechnicalAttributeLongs() {
        if (technicalAttributeLongs == null) {
            technicalAttributeLongs = new ArrayList<>();
        }
        return this.technicalAttributeLongs;
    }

    /**
     * Gets the value of the technicalAttributeUnsignedBytes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeUnsignedBytes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeUnsignedBytes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UInt8 }
     * 
     * 
     */
    public List<UInt8> getTechnicalAttributeUnsignedBytes() {
        if (technicalAttributeUnsignedBytes == null) {
            technicalAttributeUnsignedBytes = new ArrayList<>();
        }
        return this.technicalAttributeUnsignedBytes;
    }

    /**
     * Gets the value of the technicalAttributeUnsignedShorts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeUnsignedShorts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeUnsignedShorts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UInt16 }
     * 
     * 
     */
    public List<UInt16> getTechnicalAttributeUnsignedShorts() {
        if (technicalAttributeUnsignedShorts == null) {
            technicalAttributeUnsignedShorts = new ArrayList<>();
        }
        return this.technicalAttributeUnsignedShorts;
    }

    /**
     * Gets the value of the technicalAttributeUnsignedIntegers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeUnsignedIntegers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeUnsignedIntegers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UInt32 }
     * 
     * 
     */
    public List<UInt32> getTechnicalAttributeUnsignedIntegers() {
        if (technicalAttributeUnsignedIntegers == null) {
            technicalAttributeUnsignedIntegers = new ArrayList<>();
        }
        return this.technicalAttributeUnsignedIntegers;
    }

    /**
     * Gets the value of the technicalAttributeUnsignedLongs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeUnsignedLongs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeUnsignedLongs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UInt64 }
     * 
     * 
     */
    public List<UInt64> getTechnicalAttributeUnsignedLongs() {
        if (technicalAttributeUnsignedLongs == null) {
            technicalAttributeUnsignedLongs = new ArrayList<>();
        }
        return this.technicalAttributeUnsignedLongs;
    }

    /**
     * Gets the value of the technicalAttributeBooleen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeBooleen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeBooleen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ebu.metadata_schema.ebucore_2015.Boolean }
     * 
     * 
     */
    public List<ebu.metadata_schema.ebucore_2015.Boolean> getTechnicalAttributeBooleen() {
        if (technicalAttributeBooleen == null) {
            technicalAttributeBooleen = new ArrayList<>();
        }
        return this.technicalAttributeBooleen;
    }

    /**
     * Gets the value of the technicalAttributeFloats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeFloats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeFloats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getTechnicalAttributeFloats() {
        if (technicalAttributeFloats == null) {
            technicalAttributeFloats = new ArrayList<>();
        }
        return this.technicalAttributeFloats;
    }

    /**
     * Gets the value of the technicalAttributeRationals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeRationals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeRationals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechnicalAttributeRationalType }
     * 
     * 
     */
    public List<TechnicalAttributeRationalType> getTechnicalAttributeRationals() {
        if (technicalAttributeRationals == null) {
            technicalAttributeRationals = new ArrayList<>();
        }
        return this.technicalAttributeRationals;
    }

    /**
     * Gets the value of the technicalAttributeUris property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeUris property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeUris().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechnicalAttributeUriType }
     * 
     * 
     */
    public List<TechnicalAttributeUriType> getTechnicalAttributeUris() {
        if (technicalAttributeUris == null) {
            technicalAttributeUris = new ArrayList<>();
        }
        return this.technicalAttributeUris;
    }

    /**
     *  To provide additional contextual information on the audio
     * 						format. Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getComments() {
        if (comments == null) {
            comments = new ArrayList<>();
        }
        return this.comments;
    }

    /**
     * Obtient la valeur de la propriété audioFormatId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioFormatId() {
        return audioFormatId;
    }

    /**
     * Définit la valeur de la propriété audioFormatId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioFormatId(java.lang.String value) {
        this.audioFormatId = value;
    }

    /**
     * Obtient la valeur de la propriété audioFormatVersionId.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioFormatVersionId() {
        return audioFormatVersionId;
    }

    /**
     * Définit la valeur de la propriété audioFormatVersionId.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioFormatVersionId(java.lang.String value) {
        this.audioFormatVersionId = value;
    }

    /**
     * Obtient la valeur de la propriété audioFormatName.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioFormatName() {
        return audioFormatName;
    }

    /**
     * Définit la valeur de la propriété audioFormatName.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioFormatName(java.lang.String value) {
        this.audioFormatName = value;
    }

    /**
     * Obtient la valeur de la propriété audioFormatDefinition.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioFormatDefinition() {
        return audioFormatDefinition;
    }

    /**
     * Définit la valeur de la propriété audioFormatDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioFormatDefinition(java.lang.String value) {
        this.audioFormatDefinition = value;
    }

    /**
     * Obtient la valeur de la propriété audioFormatProfile.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioFormatProfile() {
        return audioFormatProfile;
    }

    /**
     * Définit la valeur de la propriété audioFormatProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioFormatProfile(java.lang.String value) {
        this.audioFormatProfile = value;
    }

    /**
     * Obtient la valeur de la propriété audioFormatProfileLevel.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAudioFormatProfileLevel() {
        return audioFormatProfileLevel;
    }

    /**
     * Définit la valeur de la propriété audioFormatProfileLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAudioFormatProfileLevel(java.lang.String value) {
        this.audioFormatProfileLevel = value;
    }

    /**
     * Obtient la valeur de la propriété audioPresenceFlag.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isAudioPresenceFlag() {
        return audioPresenceFlag;
    }

    /**
     * Définit la valeur de la propriété audioPresenceFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setAudioPresenceFlag(java.lang.Boolean value) {
        this.audioPresenceFlag = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AudioEncoding
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

        /**
         * Obtient la valeur de la propriété typeLabel.
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
         * Définit la valeur de la propriété typeLabel.
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
         * Obtient la valeur de la propriété typeDefinition.
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
         * Définit la valeur de la propriété typeDefinition.
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
         * Obtient la valeur de la propriété typeLink.
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
         * Définit la valeur de la propriété typeLink.
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
         * Obtient la valeur de la propriété typeSource.
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
         * Définit la valeur de la propriété typeSource.
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
         * Obtient la valeur de la propriété typeNamespace.
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
         * Définit la valeur de la propriété typeNamespace.
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
         * Obtient la valeur de la propriété typeLanguage.
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
         * Définit la valeur de la propriété typeLanguage.
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


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
     *       &lt;attribute name="trackLanguage" type="{http://www.w3.org/2001/XMLSchema}language" />
     *       &lt;attribute name="trackId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
     *       &lt;attribute name="trackName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AudioTrack
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlAttribute(name = "trackLanguage")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected java.lang.String trackLanguage;
        @XmlAttribute(name = "trackId")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NMTOKEN")
        protected java.lang.String trackId;
        @XmlAttribute(name = "trackName")
        protected java.lang.String trackName;
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
         * Obtient la valeur de la propriété trackLanguage.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getTrackLanguage() {
            return trackLanguage;
        }

        /**
         * Définit la valeur de la propriété trackLanguage.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setTrackLanguage(java.lang.String value) {
            this.trackLanguage = value;
        }

        /**
         * Obtient la valeur de la propriété trackId.
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
         * Définit la valeur de la propriété trackId.
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
         * Obtient la valeur de la propriété trackName.
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
         * Définit la valeur de la propriété trackName.
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
         * Obtient la valeur de la propriété typeLabel.
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
         * Définit la valeur de la propriété typeLabel.
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
         * Obtient la valeur de la propriété typeDefinition.
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
         * Définit la valeur de la propriété typeDefinition.
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
         * Obtient la valeur de la propriété typeLink.
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
         * Définit la valeur de la propriété typeLink.
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
         * Obtient la valeur de la propriété typeSource.
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
         * Définit la valeur de la propriété typeSource.
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
         * Obtient la valeur de la propriété typeNamespace.
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
         * Définit la valeur de la propriété typeNamespace.
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
         * Obtient la valeur de la propriété typeLanguage.
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
         * Définit la valeur de la propriété typeLanguage.
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


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AudioTrackConfiguration
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

        /**
         * Obtient la valeur de la propriété typeLabel.
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
         * Définit la valeur de la propriété typeLabel.
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
         * Obtient la valeur de la propriété typeDefinition.
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
         * Définit la valeur de la propriété typeDefinition.
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
         * Obtient la valeur de la propriété typeLink.
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
         * Définit la valeur de la propriété typeLink.
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
         * Obtient la valeur de la propriété typeSource.
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
         * Définit la valeur de la propriété typeSource.
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
         * Obtient la valeur de la propriété typeNamespace.
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
         * Définit la valeur de la propriété typeNamespace.
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
         * Obtient la valeur de la propriété typeLanguage.
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
         * Définit la valeur de la propriété typeLanguage.
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

}
