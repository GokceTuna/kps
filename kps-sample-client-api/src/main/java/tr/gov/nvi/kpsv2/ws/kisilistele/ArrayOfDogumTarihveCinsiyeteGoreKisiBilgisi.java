
package tr.gov.nvi.kpsv2.ws.kisilistele;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDogumTarihveCinsiyeteGoreKisiBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDogumTarihveCinsiyeteGoreKisiBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DogumTarihveCinsiyeteGoreKisiBilgisi" type="{http://kps.nvi.gov.tr/2011/01/01}DogumTarihveCinsiyeteGoreKisiBilgisi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDogumTarihveCinsiyeteGoreKisiBilgisi", propOrder = {
    "dogumTarihveCinsiyeteGoreKisiBilgisi"
})
public class ArrayOfDogumTarihveCinsiyeteGoreKisiBilgisi
    implements Serializable
{

    @XmlElement(name = "DogumTarihveCinsiyeteGoreKisiBilgisi", nillable = true)
    protected List<DogumTarihveCinsiyeteGoreKisiBilgisi> dogumTarihveCinsiyeteGoreKisiBilgisi;

    /**
     * Gets the value of the dogumTarihveCinsiyeteGoreKisiBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dogumTarihveCinsiyeteGoreKisiBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDogumTarihveCinsiyeteGoreKisiBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DogumTarihveCinsiyeteGoreKisiBilgisi }
     * 
     * 
     */
    public List<DogumTarihveCinsiyeteGoreKisiBilgisi> getDogumTarihveCinsiyeteGoreKisiBilgisi() {
        if (dogumTarihveCinsiyeteGoreKisiBilgisi == null) {
            dogumTarihveCinsiyeteGoreKisiBilgisi = new ArrayList<DogumTarihveCinsiyeteGoreKisiBilgisi>();
        }
        return this.dogumTarihveCinsiyeteGoreKisiBilgisi;
    }

}
