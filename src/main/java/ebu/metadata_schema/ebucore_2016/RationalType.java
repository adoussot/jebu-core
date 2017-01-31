
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 *  A complex Type defining the structure of a technical attribute ot type
 * 				rational 
 * 
 * <p>Classe Java pour rationalType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="rationalType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>long">
 *       &lt;attribute name="factorNumerator" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="factorDenominator" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rationalType", propOrder = {
    "value"
})
@XmlSeeAlso({
    TechnicalAttributeRationalType.class
})
public class RationalType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlValue
    protected long value;
    @XmlAttribute(name = "factorNumerator")
    protected BigInteger factorNumerator;
    @XmlAttribute(name = "factorDenominator")
    protected BigInteger factorDenominator;
    @XmlAttribute(name = "unit")
    protected java.lang.String unit;

    /**
     * Obtient la valeur de la propri�t� value.
     * 
     */
    public long getValue() {
        return value;
    }

    /**
     * D�finit la valeur de la propri�t� value.
     * 
     */
    public void setValue(long value) {
        this.value = value;
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

    /**
     * Obtient la valeur de la propri�t� unit.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getUnit() {
        return unit;
    }

    /**
     * D�finit la valeur de la propri�t� unit.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setUnit(java.lang.String value) {
        this.unit = value;
    }

}
