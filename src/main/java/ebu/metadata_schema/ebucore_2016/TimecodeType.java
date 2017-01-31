
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour timecodeType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="timecodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:ebu:metadata-schema:ebuCore_2016>timecodeStringType">
 *       &lt;attribute name="editRate" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="dropframe" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="factorNumerator" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
 *       &lt;attribute name="factorDenominator" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timecodeType", propOrder = {
    "value"
})
public class TimecodeType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlValue
    protected java.lang.String value;
    @XmlAttribute(name = "editRate")
    protected BigInteger editRate;
    @XmlAttribute(name = "dropframe")
    protected java.lang.Boolean dropframe;
    @XmlAttribute(name = "factorNumerator")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger factorNumerator;
    @XmlAttribute(name = "factorDenominator")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger factorDenominator;

    /**
     * The pattern to express the time using timecode compliant with SMPTE
     * 				ST12-1:2008
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
     * Obtient la valeur de la propri�t� editRate.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEditRate() {
        return editRate;
    }

    /**
     * D�finit la valeur de la propri�t� editRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEditRate(BigInteger value) {
        this.editRate = value;
    }

    /**
     * Obtient la valeur de la propri�t� dropframe.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isDropframe() {
        return dropframe;
    }

    /**
     * D�finit la valeur de la propri�t� dropframe.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setDropframe(java.lang.Boolean value) {
        this.dropframe = value;
    }

    /**
     * Obtient la valeur de la propri�t� factorNumerator.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFactorNumerator() {
        if (factorNumerator == null) {
            return new BigInteger("1");
        } else {
            return factorNumerator;
        }
    }

    /**
     * D�finit la valeur de la propri�t� factorNumerator.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFactorNumerator(BigInteger value) {
        this.factorNumerator = value;
    }

    /**
     * Obtient la valeur de la propri�t� factorDenominator.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFactorDenominator() {
        if (factorDenominator == null) {
            return new BigInteger("1");
        } else {
            return factorDenominator;
        }
    }

    /**
     * D�finit la valeur de la propri�t� factorDenominator.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFactorDenominator(BigInteger value) {
        this.factorDenominator = value;
    }

}
