
package tr.gov.nvi.kpsv2.ws.aksokutumilebagliilce;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tr.gov.nvi.kpsv2.ws.aksokutumilebagliilce package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _IlceSonucu_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "IlceSonucu");
    private final static QName _Ilce_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Ilce");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfIlce_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "ArrayOfIlce");
    private final static QName _AksOkuTumIleBagliIlceSorguKriteri_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "AksOkuTumIleBagliIlceSorguKriteri");
    private final static QName _Parametre_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Parametre");
    private final static QName _IlceSonucuHataBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "HataBilgisi");
    private final static QName _IlceSonucuSorguSonucu_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "SorguSonucu");
    private final static QName _ListeleResponseListeleResult_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "ListeleResult");
    private final static QName _IlceIlKod_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "IlKod");
    private final static QName _IlceAd_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Ad");
    private final static QName _IlceKod_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Kod");
    private final static QName _AksOkuTumIleBagliIlceSorguKriteriIlKodu_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "IlKodu");
    private final static QName _ParametreAciklama_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Aciklama");
    private final static QName _ListeleKriter_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "kriter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tr.gov.nvi.kpsv2.ws.aksokutumilebagliilce
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Listele }
     * 
     */
    public Listele createListele() {
        return new Listele();
    }

    /**
     * Create an instance of {@link AksOkuTumIleBagliIlceSorguKriteri }
     * 
     */
    public AksOkuTumIleBagliIlceSorguKriteri createAksOkuTumIleBagliIlceSorguKriteri() {
        return new AksOkuTumIleBagliIlceSorguKriteri();
    }

    /**
     * Create an instance of {@link IlceSonucu }
     * 
     */
    public IlceSonucu createIlceSonucu() {
        return new IlceSonucu();
    }

    /**
     * Create an instance of {@link Ilce }
     * 
     */
    public Ilce createIlce() {
        return new Ilce();
    }

    /**
     * Create an instance of {@link ListeleResponse }
     * 
     */
    public ListeleResponse createListeleResponse() {
        return new ListeleResponse();
    }

    /**
     * Create an instance of {@link ArrayOfIlce }
     * 
     */
    public ArrayOfIlce createArrayOfIlce() {
        return new ArrayOfIlce();
    }

    /**
     * Create an instance of {@link Parametre }
     * 
     */
    public Parametre createParametre() {
        return new Parametre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IlceSonucu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "IlceSonucu")
    public JAXBElement<IlceSonucu> createIlceSonucu(IlceSonucu value) {
        return new JAXBElement<IlceSonucu>(_IlceSonucu_QNAME, IlceSonucu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ilce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Ilce")
    public JAXBElement<Ilce> createIlce(Ilce value) {
        return new JAXBElement<Ilce>(_Ilce_QNAME, Ilce.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIlce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "ArrayOfIlce")
    public JAXBElement<ArrayOfIlce> createArrayOfIlce(ArrayOfIlce value) {
        return new JAXBElement<ArrayOfIlce>(_ArrayOfIlce_QNAME, ArrayOfIlce.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AksOkuTumIleBagliIlceSorguKriteri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "AksOkuTumIleBagliIlceSorguKriteri")
    public JAXBElement<AksOkuTumIleBagliIlceSorguKriteri> createAksOkuTumIleBagliIlceSorguKriteri(AksOkuTumIleBagliIlceSorguKriteri value) {
        return new JAXBElement<AksOkuTumIleBagliIlceSorguKriteri>(_AksOkuTumIleBagliIlceSorguKriteri_QNAME, AksOkuTumIleBagliIlceSorguKriteri.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Parametre")
    public JAXBElement<Parametre> createParametre(Parametre value) {
        return new JAXBElement<Parametre>(_Parametre_QNAME, Parametre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "HataBilgisi", scope = IlceSonucu.class)
    public JAXBElement<Parametre> createIlceSonucuHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_IlceSonucuHataBilgisi_QNAME, Parametre.class, IlceSonucu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIlce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "SorguSonucu", scope = IlceSonucu.class)
    public JAXBElement<ArrayOfIlce> createIlceSonucuSorguSonucu(ArrayOfIlce value) {
        return new JAXBElement<ArrayOfIlce>(_IlceSonucuSorguSonucu_QNAME, ArrayOfIlce.class, IlceSonucu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IlceSonucu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "ListeleResult", scope = ListeleResponse.class)
    public JAXBElement<IlceSonucu> createListeleResponseListeleResult(IlceSonucu value) {
        return new JAXBElement<IlceSonucu>(_ListeleResponseListeleResult_QNAME, IlceSonucu.class, ListeleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "HataBilgisi", scope = Ilce.class)
    public JAXBElement<Parametre> createIlceHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_IlceSonucuHataBilgisi_QNAME, Parametre.class, Ilce.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "IlKod", scope = Ilce.class)
    public JAXBElement<Integer> createIlceIlKod(Integer value) {
        return new JAXBElement<Integer>(_IlceIlKod_QNAME, Integer.class, Ilce.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Ad", scope = Ilce.class)
    public JAXBElement<String> createIlceAd(String value) {
        return new JAXBElement<String>(_IlceAd_QNAME, String.class, Ilce.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Kod", scope = Ilce.class)
    public JAXBElement<Integer> createIlceKod(Integer value) {
        return new JAXBElement<Integer>(_IlceKod_QNAME, Integer.class, Ilce.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "IlKodu", scope = AksOkuTumIleBagliIlceSorguKriteri.class)
    public JAXBElement<Integer> createAksOkuTumIleBagliIlceSorguKriteriIlKodu(Integer value) {
        return new JAXBElement<Integer>(_AksOkuTumIleBagliIlceSorguKriteriIlKodu_QNAME, Integer.class, AksOkuTumIleBagliIlceSorguKriteri.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Kod", scope = Parametre.class)
    public JAXBElement<Integer> createParametreKod(Integer value) {
        return new JAXBElement<Integer>(_IlceKod_QNAME, Integer.class, Parametre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Aciklama", scope = Parametre.class)
    public JAXBElement<String> createParametreAciklama(String value) {
        return new JAXBElement<String>(_ParametreAciklama_QNAME, String.class, Parametre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AksOkuTumIleBagliIlceSorguKriteri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "kriter", scope = Listele.class)
    public JAXBElement<AksOkuTumIleBagliIlceSorguKriteri> createListeleKriter(AksOkuTumIleBagliIlceSorguKriteri value) {
        return new JAXBElement<AksOkuTumIleBagliIlceSorguKriteri>(_ListeleKriter_QNAME, AksOkuTumIleBagliIlceSorguKriteri.class, Listele.class, value);
    }

}
