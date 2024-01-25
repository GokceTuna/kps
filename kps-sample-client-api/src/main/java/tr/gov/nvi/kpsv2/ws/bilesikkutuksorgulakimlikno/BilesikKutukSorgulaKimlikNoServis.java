
package tr.gov.nvi.kpsv2.ws.bilesikkutuksorgulakimlikno;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.5-b01 
 * Generated source version: 2.1
 * 
 */
@WebService(name = "BilesikKutukSorgulaKimlikNoServis", targetNamespace = "http://kps.nvi.gov.tr/2011/01/01")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BilesikKutukSorgulaKimlikNoServis {


    /**
     * 
     * @param kriterListesi
     * @return
     *     returns tr.gov.nvi.kpsv2.ws.bilesikkutuksorgulakimlikno.BilesikKutukBilgileriSonucu
     */
    @WebMethod(operationName = "Sorgula", action = "http://kps.nvi.gov.tr/2011/01/01/BilesikKutukSorgulaKimlikNoServis/Sorgula")
    @WebResult(name = "SorgulaResult", targetNamespace = "http://kps.nvi.gov.tr/2011/01/01")
    @RequestWrapper(localName = "Sorgula", targetNamespace = "http://kps.nvi.gov.tr/2011/01/01", className = "tr.gov.nvi.kpsv2.ws.bilesikkutuksorgulakimlikno.Sorgula")
    @ResponseWrapper(localName = "SorgulaResponse", targetNamespace = "http://kps.nvi.gov.tr/2011/01/01", className = "tr.gov.nvi.kpsv2.ws.bilesikkutuksorgulakimlikno.SorgulaResponse")
    public BilesikKutukBilgileriSonucu sorgula(
        @WebParam(name = "kriterListesi", targetNamespace = "http://kps.nvi.gov.tr/2011/01/01")
        ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri kriterListesi);

}
