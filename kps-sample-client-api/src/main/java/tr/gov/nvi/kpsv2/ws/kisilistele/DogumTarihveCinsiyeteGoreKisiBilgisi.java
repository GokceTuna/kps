
package tr.gov.nvi.kpsv2.ws.kisilistele;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DogumTarihveCinsiyeteGoreKisiBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DogumTarihveCinsiyeteGoreKisiBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnneTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BabaTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DurumBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}KisiDurumBilgisi" minOccurs="0"/>
 *         &lt;element name="EsTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}Parametre" minOccurs="0"/>
 *         &lt;element name="KayitYeriBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}KisiKayitYeriBilgisi" minOccurs="0"/>
 *         &lt;element name="TCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TemelBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}KisiTemelBilgisi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DogumTarihveCinsiyeteGoreKisiBilgisi", propOrder = {
    "anneTCKimlikNo",
    "babaTCKimlikNo",
    "durumBilgisi",
    "esTCKimlikNo",
    "hataBilgisi",
    "kayitYeriBilgisi",
    "tcKimlikNo",
    "temelBilgisi"
})
public class DogumTarihveCinsiyeteGoreKisiBilgisi
    implements Serializable
{

    @XmlElementRef(name = "AnneTCKimlikNo", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<Long> anneTCKimlikNo;
    @XmlElementRef(name = "BabaTCKimlikNo", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<Long> babaTCKimlikNo;
    @XmlElementRef(name = "DurumBilgisi", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<KisiDurumBilgisi> durumBilgisi;
    @XmlElementRef(name = "EsTCKimlikNo", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<Long> esTCKimlikNo;
    @XmlElementRef(name = "HataBilgisi", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<Parametre> hataBilgisi;
    @XmlElementRef(name = "KayitYeriBilgisi", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<KisiKayitYeriBilgisi> kayitYeriBilgisi;
    @XmlElementRef(name = "TCKimlikNo", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<Long> tcKimlikNo;
    @XmlElementRef(name = "TemelBilgisi", namespace = "http://kps.nvi.gov.tr/2011/01/01", type = JAXBElement.class)
    protected JAXBElement<KisiTemelBilgisi> temelBilgisi;

    /**
     * Gets the value of the anneTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAnneTCKimlikNo() {
        return anneTCKimlikNo;
    }

    /**
     * Sets the value of the anneTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAnneTCKimlikNo(JAXBElement<Long> value) {
        this.anneTCKimlikNo = value;
    }

    /**
     * Gets the value of the babaTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBabaTCKimlikNo() {
        return babaTCKimlikNo;
    }

    /**
     * Sets the value of the babaTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBabaTCKimlikNo(JAXBElement<Long> value) {
        this.babaTCKimlikNo = value;
    }

    /**
     * Gets the value of the durumBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KisiDurumBilgisi }{@code >}
     *     
     */
    public JAXBElement<KisiDurumBilgisi> getDurumBilgisi() {
        return durumBilgisi;
    }

    /**
     * Sets the value of the durumBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KisiDurumBilgisi }{@code >}
     *     
     */
    public void setDurumBilgisi(JAXBElement<KisiDurumBilgisi> value) {
        this.durumBilgisi = value;
    }

    /**
     * Gets the value of the esTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEsTCKimlikNo() {
        return esTCKimlikNo;
    }

    /**
     * Sets the value of the esTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEsTCKimlikNo(JAXBElement<Long> value) {
        this.esTCKimlikNo = value;
    }

    /**
     * Gets the value of the hataBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public JAXBElement<Parametre> getHataBilgisi() {
        return hataBilgisi;
    }

    /**
     * Sets the value of the hataBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Parametre }{@code >}
     *     
     */
    public void setHataBilgisi(JAXBElement<Parametre> value) {
        this.hataBilgisi = value;
    }

    /**
     * Gets the value of the kayitYeriBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KisiKayitYeriBilgisi }{@code >}
     *     
     */
    public JAXBElement<KisiKayitYeriBilgisi> getKayitYeriBilgisi() {
        return kayitYeriBilgisi;
    }

    /**
     * Sets the value of the kayitYeriBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KisiKayitYeriBilgisi }{@code >}
     *     
     */
    public void setKayitYeriBilgisi(JAXBElement<KisiKayitYeriBilgisi> value) {
        this.kayitYeriBilgisi = value;
    }

    /**
     * Gets the value of the tcKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTCKimlikNo() {
        return tcKimlikNo;
    }

    /**
     * Sets the value of the tcKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTCKimlikNo(JAXBElement<Long> value) {
        this.tcKimlikNo = value;
    }

    /**
     * Gets the value of the temelBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KisiTemelBilgisi }{@code >}
     *     
     */
    public JAXBElement<KisiTemelBilgisi> getTemelBilgisi() {
        return temelBilgisi;
    }

    /**
     * Sets the value of the temelBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KisiTemelBilgisi }{@code >}
     *     
     */
    public void setTemelBilgisi(JAXBElement<KisiTemelBilgisi> value) {
        this.temelBilgisi = value;
    }

}
