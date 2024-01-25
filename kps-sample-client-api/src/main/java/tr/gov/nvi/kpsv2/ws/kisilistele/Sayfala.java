
package tr.gov.nvi.kpsv2.ws.kisilistele;

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
 *         &lt;element name="kriter" type="{http://kps.nvi.gov.tr/2011/01/01}KisiListeleSorguKriteri" minOccurs="0"/>
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
    "kriter"
})
@XmlRootElement(name = "Sayfala")
public class Sayfala
    implements Serializable
{

    @XmlElementRef(name = "kriter", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<KisiListeleSorguKriteri> kriter;

    /**
     * Gets the value of the kriter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KisiListeleSorguKriteri }{@code >}
     *     
     */
    public JAXBElement<KisiListeleSorguKriteri> getKriter() {
        return kriter;
    }

    /**
     * Sets the value of the kriter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KisiListeleSorguKriteri }{@code >}
     *     
     */
    public void setKriter(JAXBElement<KisiListeleSorguKriteri> value) {
        this.kriter = value;
    }

}
