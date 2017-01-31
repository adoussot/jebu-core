
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour screenCentrePositionType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="screenCentrePositionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
 *       &lt;attribute name="azimuth" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="elevation" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="distance" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="X" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Y" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Z" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "screenCentrePositionType", propOrder = {
    "value"
})
public class ScreenCentrePositionType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlValue
    protected float value;
    @XmlAttribute(name = "azimuth")
    protected java.lang.Float azimuth;
    @XmlAttribute(name = "elevation")
    protected java.lang.Float elevation;
    @XmlAttribute(name = "distance")
    protected java.lang.Float distance;
    @XmlAttribute(name = "X")
    protected java.lang.Float x;
    @XmlAttribute(name = "Y")
    protected java.lang.Float y;
    @XmlAttribute(name = "Z")
    protected java.lang.Float z;

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
     * Obtient la valeur de la propri�t� azimuth.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getAzimuth() {
        return azimuth;
    }

    /**
     * D�finit la valeur de la propri�t� azimuth.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setAzimuth(java.lang.Float value) {
        this.azimuth = value;
    }

    /**
     * Obtient la valeur de la propri�t� elevation.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getElevation() {
        return elevation;
    }

    /**
     * D�finit la valeur de la propri�t� elevation.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setElevation(java.lang.Float value) {
        this.elevation = value;
    }

    /**
     * Obtient la valeur de la propri�t� distance.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getDistance() {
        return distance;
    }

    /**
     * D�finit la valeur de la propri�t� distance.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setDistance(java.lang.Float value) {
        this.distance = value;
    }

    /**
     * Obtient la valeur de la propri�t� x.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getX() {
        return x;
    }

    /**
     * D�finit la valeur de la propri�t� x.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setX(java.lang.Float value) {
        this.x = value;
    }

    /**
     * Obtient la valeur de la propri�t� y.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getY() {
        return y;
    }

    /**
     * D�finit la valeur de la propri�t� y.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setY(java.lang.Float value) {
        this.y = value;
    }

    /**
     * Obtient la valeur de la propri�t� z.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Float }
     *     
     */
    public java.lang.Float getZ() {
        return z;
    }

    /**
     * D�finit la valeur de la propri�t� z.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Float }
     *     
     */
    public void setZ(java.lang.Float value) {
        this.z = value;
    }

}
