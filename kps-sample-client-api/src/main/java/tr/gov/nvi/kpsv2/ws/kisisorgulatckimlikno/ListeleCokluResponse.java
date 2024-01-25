
package tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListeleCokluResult" type="{http://kps.nvi.gov.tr/2011/01/01}KisiBilgisiSonucu" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listeleCokluResult"
})
@XmlRootElement(name = "ListeleCokluResponse")
public class ListeleCokluResponse
    implements Serializable
{

    @XmlElementRef(name = "ListeleCokluResult", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<KisiBilgisiSonucu> listeleCokluResult;

    /**
     * Gets the value of the listeleCokluResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KisiBilgisiSonucu }{@code >}
     *     
     */
    public JAXBElement<KisiBilgisiSonucu> getListeleCokluResult() {
        return listeleCokluResult;
    }

    /**
     * Sets the value of the listeleCokluResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KisiBilgisiSonucu }{@code >}
     *     
     */
    public void setListeleCokluResult(JAXBElement<KisiBilgisiSonucu> value) {
        this.listeleCokluResult = value;
    }

}
