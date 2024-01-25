
package tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKisiBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKisiBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KisiBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}KisiBilgisi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKisiBilgisi", propOrder = {
    "kisiBilgisi"
})
public class ArrayOfKisiBilgisi
    implements Serializable
{

    @XmlElement(name = "KisiBilgisi", nillable = true)
    protected List<KisiBilgisi> kisiBilgisi;

    /**
     * Gets the value of the kisiBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kisiBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKisiBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KisiBilgisi }
     * 
     * 
     */
    public List<KisiBilgisi> getKisiBilgisi() {
        if (kisiBilgisi == null) {
            kisiBilgisi = new ArrayList<KisiBilgisi>();
        }
        return this.kisiBilgisi;
    }

}
