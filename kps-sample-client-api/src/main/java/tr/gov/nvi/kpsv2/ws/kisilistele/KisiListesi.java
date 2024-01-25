
package tr.gov.nvi.kpsv2.ws.kisilistele;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KisiListesi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KisiListesi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SayfaAnahtari" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Sonuc" type="{http://kps.nvi.gov.tr/2011/01/01}ArrayOfDogumTarihveCinsiyeteGoreKisiBilgisi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KisiListesi", propOrder = {
    "sayfaAnahtari",
    "sonuc"
})
public class KisiListesi
    implements Serializable
{

    @XmlElementRef(name = "SayfaAnahtari", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<Long> sayfaAnahtari;
    @XmlElementRef(name = "Sonuc", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<ArrayOfDogumTarihveCinsiyeteGoreKisiBilgisi> sonuc;

    /**
     * Gets the value of the sayfaAnahtari property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSayfaAnahtari() {
        return sayfaAnahtari;
    }

    /**
     * Sets the value of the sayfaAnahtari property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSayfaAnahtari(JAXBElement<Long> value) {
        this.sayfaAnahtari = value;
    }

    /**
     * Gets the value of the sonuc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDogumTarihveCinsiyeteGoreKisiBilgisi }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDogumTarihveCinsiyeteGoreKisiBilgisi> getSonuc() {
        return sonuc;
    }

    /**
     * Sets the value of the sonuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDogumTarihveCinsiyeteGoreKisiBilgisi }{@code >}
     *     
     */
    public void setSonuc(JAXBElement<ArrayOfDogumTarihveCinsiyeteGoreKisiBilgisi> value) {
        this.sonuc = value;
    }

}
