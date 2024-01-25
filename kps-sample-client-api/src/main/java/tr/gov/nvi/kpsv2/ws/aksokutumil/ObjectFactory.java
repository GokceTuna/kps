
package tr.gov.nvi.kpsv2.ws.aksokutumil;

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
 * generated in the tr.gov.nvi.kpsv2.ws.aksokutumil package. 
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

    private final static QName _AksOkuTumIlSorguKriteri_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "AksOkuTumIlSorguKriteri");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Il_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Il");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ArrayOfIl_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "ArrayOfIl");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _IlSonucu_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "IlSonucu");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Parametre_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Parametre");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _IlSonucuSorguSonucu_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "SorguSonucu");
    private final static QName _IlSonucuHataBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "HataBilgisi");
    private final static QName _ListeleKriter_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "kriter");
    private final static QName _ParametreAciklama_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Aciklama");
    private final static QName _ParametreKod_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Kod");
    private final static QName _IlAd_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Ad");
    private final static QName _ListeleResponseListeleResult_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "ListeleResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tr.gov.nvi.kpsv2.ws.aksokutumil
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IlSonucu }
     * 
     */
    public IlSonucu createIlSonucu() {
        return new IlSonucu();
    }

    /**
     * Create an instance of {@link Listele }
     * 
     */
    public Listele createListele() {
        return new Listele();
    }

    /**
     * Create an instance of {@link AksOkuTumIlSorguKriteri }
     * 
     */
    public AksOkuTumIlSorguKriteri createAksOkuTumIlSorguKriteri() {
        return new AksOkuTumIlSorguKriteri();
    }

    /**
     * Create an instance of {@link ArrayOfIl }
     * 
     */
    public ArrayOfIl createArrayOfIl() {
        return new ArrayOfIl();
    }

    /**
     * Create an instance of {@link Il }
     * 
     */
    public Il createIl() {
        return new Il();
    }

    /**
     * Create an instance of {@link ListeleResponse }
     * 
     */
    public ListeleResponse createListeleResponse() {
        return new ListeleResponse();
    }

    /**
     * Create an instance of {@link Parametre }
     * 
     */
    public Parametre createParametre() {
        return new Parametre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AksOkuTumIlSorguKriteri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "AksOkuTumIlSorguKriteri")
    public JAXBElement<AksOkuTumIlSorguKriteri> createAksOkuTumIlSorguKriteri(AksOkuTumIlSorguKriteri value) {
        return new JAXBElement<AksOkuTumIlSorguKriteri>(_AksOkuTumIlSorguKriteri_QNAME, AksOkuTumIlSorguKriteri.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Il }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Il")
    public JAXBElement<Il> createIl(Il value) {
        return new JAXBElement<Il>(_Il_QNAME, Il.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "ArrayOfIl")
    public JAXBElement<ArrayOfIl> createArrayOfIl(ArrayOfIl value) {
        return new JAXBElement<ArrayOfIl>(_ArrayOfIl_QNAME, ArrayOfIl.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link IlSonucu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "IlSonucu")
    public JAXBElement<IlSonucu> createIlSonucu(IlSonucu value) {
        return new JAXBElement<IlSonucu>(_IlSonucu_QNAME, IlSonucu.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Parametre")
    public JAXBElement<Parametre> createParametre(Parametre value) {
        return new JAXBElement<Parametre>(_Parametre_QNAME, Parametre.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "SorguSonucu", scope = IlSonucu.class)
    public JAXBElement<ArrayOfIl> createIlSonucuSorguSonucu(ArrayOfIl value) {
        return new JAXBElement<ArrayOfIl>(_IlSonucuSorguSonucu_QNAME, ArrayOfIl.class, IlSonucu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "HataBilgisi", scope = IlSonucu.class)
    public JAXBElement<Parametre> createIlSonucuHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_IlSonucuHataBilgisi_QNAME, Parametre.class, IlSonucu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AksOkuTumIlSorguKriteri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "kriter", scope = Listele.class)
    public JAXBElement<AksOkuTumIlSorguKriteri> createListeleKriter(AksOkuTumIlSorguKriteri value) {
        return new JAXBElement<AksOkuTumIlSorguKriteri>(_ListeleKriter_QNAME, AksOkuTumIlSorguKriteri.class, Listele.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Kod", scope = Parametre.class)
    public JAXBElement<Integer> createParametreKod(Integer value) {
        return new JAXBElement<Integer>(_ParametreKod_QNAME, Integer.class, Parametre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Ad", scope = Il.class)
    public JAXBElement<String> createIlAd(String value) {
        return new JAXBElement<String>(_IlAd_QNAME, String.class, Il.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "HataBilgisi", scope = Il.class)
    public JAXBElement<Parametre> createIlHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_IlSonucuHataBilgisi_QNAME, Parametre.class, Il.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Kod", scope = Il.class)
    public JAXBElement<Integer> createIlKod(Integer value) {
        return new JAXBElement<Integer>(_ParametreKod_QNAME, Integer.class, Il.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IlSonucu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "ListeleResult", scope = ListeleResponse.class)
    public JAXBElement<IlSonucu> createListeleResponseListeleResult(IlSonucu value) {
        return new JAXBElement<IlSonucu>(_ListeleResponseListeleResult_QNAME, IlSonucu.class, ListeleResponse.class, value);
    }

}
