
package tr.gov.nvi.kpsv2.ws.aksokutumilebagliilce;

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
 *         &lt;element name="ListeleResult" type="{http://kps.nvi.gov.tr/2011/01/01}IlceSonucu" minOccurs="0"/>
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
    "listeleResult"
})
@XmlRootElement(name = "ListeleResponse")
public class ListeleResponse
    implements Serializable
{

    @XmlElementRef(name = "ListeleResult", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<IlceSonucu> listeleResult;

    /**
     * Gets the value of the listeleResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IlceSonucu }{@code >}
     *     
     */
    public JAXBElement<IlceSonucu> getListeleResult() {
        return listeleResult;
    }

    /**
     * Sets the value of the listeleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IlceSonucu }{@code >}
     *     
     */
    public void setListeleResult(JAXBElement<IlceSonucu> value) {
        this.listeleResult = value;
    }

}
