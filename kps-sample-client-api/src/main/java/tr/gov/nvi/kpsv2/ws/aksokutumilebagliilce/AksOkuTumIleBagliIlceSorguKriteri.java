
package tr.gov.nvi.kpsv2.ws.aksokutumilebagliilce;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AksOkuTumIleBagliIlceSorguKriteri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AksOkuTumIleBagliIlceSorguKriteri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IlKodu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AksOkuTumIleBagliIlceSorguKriteri", propOrder = {
    "ilKodu"
})
public class AksOkuTumIleBagliIlceSorguKriteri
    implements Serializable
{

    @XmlElementRef(name = "IlKodu", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<Integer> ilKodu;

    /**
     * Gets the value of the ilKodu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIlKodu() {
        return ilKodu;
    }

    /**
     * Sets the value of the ilKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIlKodu(JAXBElement<Integer> value) {
        this.ilKodu = value;
    }

}
