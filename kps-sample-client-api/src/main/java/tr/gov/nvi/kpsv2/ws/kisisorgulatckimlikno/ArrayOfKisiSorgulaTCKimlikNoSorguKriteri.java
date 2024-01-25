
package tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKisiSorgulaTCKimlikNoSorguKriteri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKisiSorgulaTCKimlikNoSorguKriteri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KisiSorgulaTCKimlikNoSorguKriteri" type="{http://kps.nvi.gov.tr/2011/01/01}KisiSorgulaTCKimlikNoSorguKriteri" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKisiSorgulaTCKimlikNoSorguKriteri", propOrder = {
    "kisiSorgulaTCKimlikNoSorguKriteri"
})
public class ArrayOfKisiSorgulaTCKimlikNoSorguKriteri
    implements Serializable
{

    @XmlElement(name = "KisiSorgulaTCKimlikNoSorguKriteri", nillable = true)
    protected List<KisiSorgulaTCKimlikNoSorguKriteri> kisiSorgulaTCKimlikNoSorguKriteri;

    /**
     * Gets the value of the kisiSorgulaTCKimlikNoSorguKriteri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kisiSorgulaTCKimlikNoSorguKriteri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKisiSorgulaTCKimlikNoSorguKriteri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KisiSorgulaTCKimlikNoSorguKriteri }
     * 
     * 
     */
    public List<KisiSorgulaTCKimlikNoSorguKriteri> getKisiSorgulaTCKimlikNoSorguKriteri() {
        if (kisiSorgulaTCKimlikNoSorguKriteri == null) {
            kisiSorgulaTCKimlikNoSorguKriteri = new ArrayList<KisiSorgulaTCKimlikNoSorguKriteri>();
        }
        return this.kisiSorgulaTCKimlikNoSorguKriteri;
    }

}
