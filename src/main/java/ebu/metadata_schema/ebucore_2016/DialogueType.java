
package ebu.metadata_schema.ebucore_2016;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour dialogueType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="dialogueType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *       &lt;attribute name="nonDialogueContentKind" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="dialogueContentKind" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="mixedContentKind" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dialogueType", propOrder = {
    "value"
})
public class DialogueType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlValue
    protected int value;
    @XmlAttribute(name = "nonDialogueContentKind")
    protected Integer nonDialogueContentKind;
    @XmlAttribute(name = "dialogueContentKind")
    protected Integer dialogueContentKind;
    @XmlAttribute(name = "mixedContentKind")
    protected Integer mixedContentKind;

    /**
     * Obtient la valeur de la propri�t� value.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * D�finit la valeur de la propri�t� value.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propri�t� nonDialogueContentKind.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNonDialogueContentKind() {
        return nonDialogueContentKind;
    }

    /**
     * D�finit la valeur de la propri�t� nonDialogueContentKind.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNonDialogueContentKind(Integer value) {
        this.nonDialogueContentKind = value;
    }

    /**
     * Obtient la valeur de la propri�t� dialogueContentKind.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDialogueContentKind() {
        return dialogueContentKind;
    }

    /**
     * D�finit la valeur de la propri�t� dialogueContentKind.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDialogueContentKind(Integer value) {
        this.dialogueContentKind = value;
    }

    /**
     * Obtient la valeur de la propri�t� mixedContentKind.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMixedContentKind() {
        return mixedContentKind;
    }

    /**
     * D�finit la valeur de la propri�t� mixedContentKind.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMixedContentKind(Integer value) {
        this.mixedContentKind = value;
    }

}
