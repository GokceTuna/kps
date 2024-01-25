
package tr.gov.nvi.kpsv2.ws.aksokutumil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Il" type="{http://kps.nvi.gov.tr/2011/01/01}Il" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIl", propOrder = {
    "il"
})
public class ArrayOfIl
    implements Serializable
{

    @XmlElement(name = "Il", nillable = true)
    protected List<Il> il;

    /**
     * Gets the value of the il property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the il property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Il }
     * 
     * 
     */
    public List<Il> getIl() {
        if (il == null) {
            il = new ArrayList<Il>();
        }
        return this.il;
    }

}
