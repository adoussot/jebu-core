
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour positionType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="positionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
 *       &lt;attribute name="coordinate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bound" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="screenEdgeLock" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positionType", propOrder = {
    "value"
})
public class PositionType implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlValue
    protected float value;
    @XmlAttribute(name = "coordinate")
    protected java.lang.String coordinate;
    @XmlAttribute(name = "bound")
    protected java.lang.String bound;
    @XmlAttribute(name = "screenEdgeLock")
    protected java.lang.String screenEdgeLock;

    /**
     * Obtient la valeur de la propri�t� value.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * D�finit la valeur de la propri�t� value.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propri�t� coordinate.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCoordinate() {
        return coordinate;
    }

    /**
     * D�finit la valeur de la propri�t� coordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCoordinate(java.lang.String value) {
        this.coordinate = value;
    }

    /**
     * Obtient la valeur de la propri�t� bound.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getBound() {
        return bound;
    }

    /**
     * D�finit la valeur de la propri�t� bound.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setBound(java.lang.String value) {
        this.bound = value;
    }

    /**
     * Obtient la valeur de la propri�t� screenEdgeLock.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getScreenEdgeLock() {
        return screenEdgeLock;
    }

    /**
     * D�finit la valeur de la propri�t� screenEdgeLock.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setScreenEdgeLock(java.lang.String value) {
        this.screenEdgeLock = value;
    }

}
