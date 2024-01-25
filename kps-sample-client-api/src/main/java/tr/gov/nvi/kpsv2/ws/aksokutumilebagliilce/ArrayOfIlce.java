
package tr.gov.nvi.kpsv2.ws.aksokutumilebagliilce;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIlce complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIlce">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ilce" type="{http://kps.nvi.gov.tr/2011/01/01}Ilce" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIlce", propOrder = {
    "ilce"
})
public class ArrayOfIlce
    implements Serializable
{

    @XmlElement(name = "Ilce", nillable = true)
    protected List<Ilce> ilce;

    /**
     * Gets the value of the ilce property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ilce property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIlce().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ilce }
     * 
     * 
     */
    public List<Ilce> getIlce() {
        if (ilce == null) {
            ilce = new ArrayList<Ilce>();
        }
        return this.ilce;
    }

}
