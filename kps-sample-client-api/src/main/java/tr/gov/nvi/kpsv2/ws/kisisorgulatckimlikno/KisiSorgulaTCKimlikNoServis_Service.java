
package tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.5-b01 
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "KisiSorgulaTCKimlikNoServis", targetNamespace = "http://kps.nvi.gov.tr/2011/01/01", wsdlLocation = "/tr/gov/nvi/kpsv2/ws/wsdl/KisiSorgulaTCKimlikNoServis.wsdl")
public class KisiSorgulaTCKimlikNoServis_Service
    extends Service
{

    private final static URL KISISORGULATCKIMLIKNOSERVIS_WSDL_LOCATION;
    private final static WebServiceException KISISORGULATCKIMLIKNOSERVIS_EXCEPTION;
    private final static QName KISISORGULATCKIMLIKNOSERVIS_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "KisiSorgulaTCKimlikNoServis");

    static {
        KISISORGULATCKIMLIKNOSERVIS_WSDL_LOCATION = tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno.KisiSorgulaTCKimlikNoServis_Service.class.getResource("/tr/gov/nvi/kpsv2/ws/wsdl/KisiSorgulaTCKimlikNoServis.wsdl");
        WebServiceException e = null;
        if (KISISORGULATCKIMLIKNOSERVIS_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find '/tr/gov/nvi/kpsv2/ws/wsdl/KisiSorgulaTCKimlikNoServis.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        KISISORGULATCKIMLIKNOSERVIS_EXCEPTION = e;
    }

    public KisiSorgulaTCKimlikNoServis_Service() {
        super(__getWsdlLocation(), KISISORGULATCKIMLIKNOSERVIS_QNAME);
    }

    public KisiSorgulaTCKimlikNoServis_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns KisiSorgulaTCKimlikNoServis
     */
    @WebEndpoint(name = "CustomBinding_KisiSorgulaTCKimlikNoServis")
    public KisiSorgulaTCKimlikNoServis getCustomBindingKisiSorgulaTCKimlikNoServis() {
        return super.getPort(new QName("http://kps.nvi.gov.tr/2011/01/01", "CustomBinding_KisiSorgulaTCKimlikNoServis"), KisiSorgulaTCKimlikNoServis.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns KisiSorgulaTCKimlikNoServis
     */
    @WebEndpoint(name = "CustomBinding_KisiSorgulaTCKimlikNoServis")
    public KisiSorgulaTCKimlikNoServis getCustomBindingKisiSorgulaTCKimlikNoServis(WebServiceFeature... features) {
        return super.getPort(new QName("http://kps.nvi.gov.tr/2011/01/01", "CustomBinding_KisiSorgulaTCKimlikNoServis"), KisiSorgulaTCKimlikNoServis.class, features);
    }

    private static URL __getWsdlLocation() {
        if (KISISORGULATCKIMLIKNOSERVIS_EXCEPTION!= null) {
            throw KISISORGULATCKIMLIKNOSERVIS_EXCEPTION;
        }
        return KISISORGULATCKIMLIKNOSERVIS_WSDL_LOCATION;
    }

}
