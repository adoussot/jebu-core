
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour coefficientType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="coefficientType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREF">
 *       &lt;attribute name="gain" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="gainVar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="phase" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="phaseVar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coefficientType", propOrder = {
    "value"
})
public class CoefficientType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlValue
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object value;
    @XmlAttribute(name = "gain")
    protected java.lang.Float gain;
    @XmlAttribute(name = "gainVar")
    protected java.lang.String gainVar;
    @XmlAttribute(name = "phase")
    protected java.lang.Float phase;
    @XmlAttribute(name = "phaseVar")
    protected java.lang.String phaseVar;

    /**
     * Obtient la valeur de la propri�t� value.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * D�finit la valeur de la propri�t� value.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propri�t� gain.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getGain() {
        return gain;
    }

    /**
     * D�finit la valeur de la propri�t� gain.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setGain(java.lang.Float value) {
        this.gain = value;
    }

    /**
     * Obtient la valeur de la propri�t� gainVar.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getGainVar() {
        return gainVar;
    }

    /**
     * D�finit la valeur de la propri�t� gainVar.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setGainVar(java.lang.String value) {
        this.gainVar = value;
    }

    /**
     * Obtient la valeur de la propri�t� phase.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getPhase() {
        return phase;
    }

    /**
     * D�finit la valeur de la propri�t� phase.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setPhase(java.lang.Float value) {
        this.phase = value;
    }

    /**
     * Obtient la valeur de la propri�t� phaseVar.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPhaseVar() {
        return phaseVar;
    }

    /**
     * D�finit la valeur de la propri�t� phaseVar.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPhaseVar(java.lang.String value) {
        this.phaseVar = value;
    }

}
