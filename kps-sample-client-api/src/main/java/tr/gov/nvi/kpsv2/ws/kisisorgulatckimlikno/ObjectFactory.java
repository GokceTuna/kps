
package tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno;

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
 * generated in the tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno package. 
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

    private final static QName _KisiKayitYeriBilgisiIlce_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Ilce");
    private final static QName _KisiKayitYeriBilgisiIl_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Il");
    private final static QName _KisiKayitYeriBilgisiCilt_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Cilt");
    private final static QName _KisiKayitYeriBilgisiBireySiraNo_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "BireySiraNo");
    private final static QName _KisiKayitYeriBilgisiAileSiraNo_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "AileSiraNo");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _KisiSorgulaTCKimlikNoSorguKriteri_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "KisiSorgulaTCKimlikNoSorguKriteri");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _ArrayOfKisiBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "ArrayOfKisiBilgisi");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _KisiTemelBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "KisiTemelBilgisi");
    private final static QName _KisiDurumBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "KisiDurumBilgisi");
    private final static QName _KisiBilgisiSonucu_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "KisiBilgisiSonucu");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _KisiKayitYeriBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "KisiKayitYeriBilgisi");
    private final static QName _KisiBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "KisiBilgisi");
    private final static QName _TarihBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "TarihBilgisi");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfKisiSorgulaTCKimlikNoSorguKriteri_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "ArrayOfKisiSorgulaTCKimlikNoSorguKriteri");
    private final static QName _Parametre_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Parametre");
    private final static QName _KisiTemelBilgisiAnneAd_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "AnneAd");
    private final static QName _KisiTemelBilgisiCinsiyet_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Cinsiyet");
    private final static QName _KisiTemelBilgisiSoyad_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Soyad");
    private final static QName _KisiTemelBilgisiDogumTarih_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "DogumTarih");
    private final static QName _KisiTemelBilgisiAd_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Ad");
    private final static QName _KisiTemelBilgisiBabaAd_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "BabaAd");
    private final static QName _KisiTemelBilgisiDogumYer_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "DogumYer");
    private final static QName _ListeleCokluResponseListeleCokluResult_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "ListeleCokluResult");
    private final static QName _ListeleCokluKriterListesi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "kriterListesi");
    private final static QName _TarihBilgisiGun_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Gun");
    private final static QName _TarihBilgisiYil_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Yil");
    private final static QName _TarihBilgisiAy_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Ay");
    private final static QName _KisiBilgisiHataBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "HataBilgisi");
    private final static QName _KisiBilgisiTCKimlikNo_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "TCKimlikNo");
    private final static QName _KisiBilgisiBabaTCKimlikNo_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "BabaTCKimlikNo");
    private final static QName _KisiBilgisiAnneTCKimlikNo_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "AnneTCKimlikNo");
    private final static QName _KisiBilgisiDurumBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "DurumBilgisi");
    private final static QName _KisiBilgisiDogumYerKod_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "DogumYerKod");
    private final static QName _KisiBilgisiKayitYeriBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "KayitYeriBilgisi");
    private final static QName _KisiBilgisiEsTCKimlikNo_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "EsTCKimlikNo");
    private final static QName _KisiBilgisiTemelBilgisi_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "TemelBilgisi");
    private final static QName _KisiDurumBilgisiOlumTarih_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "OlumTarih");
    private final static QName _KisiDurumBilgisiDin_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Din");
    private final static QName _KisiDurumBilgisiMedeniHal_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "MedeniHal");
    private final static QName _KisiDurumBilgisiDurum_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Durum");
    private final static QName _ParametreKod_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Kod");
    private final static QName _ParametreAciklama_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "Aciklama");
    private final static QName _KisiBilgisiSonucuSorguSonucu_QNAME = new QName("http://kps.nvi.gov.tr/2011/01/01", "SorguSonucu");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KisiDurumBilgisi }
     * 
     */
    public KisiDurumBilgisi createKisiDurumBilgisi() {
        return new KisiDurumBilgisi();
    }

    /**
     * Create an instance of {@link KisiBilgisiSonucu }
     * 
     */
    public KisiBilgisiSonucu createKisiBilgisiSonucu() {
        return new KisiBilgisiSonucu();
    }

    /**
     * Create an instance of {@link ListeleCoklu }
     * 
     */
    public ListeleCoklu createListeleCoklu() {
        return new ListeleCoklu();
    }

    /**
     * Create an instance of {@link ArrayOfKisiSorgulaTCKimlikNoSorguKriteri }
     * 
     */
    public ArrayOfKisiSorgulaTCKimlikNoSorguKriteri createArrayOfKisiSorgulaTCKimlikNoSorguKriteri() {
        return new ArrayOfKisiSorgulaTCKimlikNoSorguKriteri();
    }

    /**
     * Create an instance of {@link KisiBilgisi }
     * 
     */
    public KisiBilgisi createKisiBilgisi() {
        return new KisiBilgisi();
    }

    /**
     * Create an instance of {@link TarihBilgisi }
     * 
     */
    public TarihBilgisi createTarihBilgisi() {
        return new TarihBilgisi();
    }

    /**
     * Create an instance of {@link KisiKayitYeriBilgisi }
     * 
     */
    public KisiKayitYeriBilgisi createKisiKayitYeriBilgisi() {
        return new KisiKayitYeriBilgisi();
    }

    /**
     * Create an instance of {@link ArrayOfKisiBilgisi }
     * 
     */
    public ArrayOfKisiBilgisi createArrayOfKisiBilgisi() {
        return new ArrayOfKisiBilgisi();
    }

    /**
     * Create an instance of {@link ListeleCokluResponse }
     * 
     */
    public ListeleCokluResponse createListeleCokluResponse() {
        return new ListeleCokluResponse();
    }

    /**
     * Create an instance of {@link KisiSorgulaTCKimlikNoSorguKriteri }
     * 
     */
    public KisiSorgulaTCKimlikNoSorguKriteri createKisiSorgulaTCKimlikNoSorguKriteri() {
        return new KisiSorgulaTCKimlikNoSorguKriteri();
    }

    /**
     * Create an instance of {@link KisiTemelBilgisi }
     * 
     */
    public KisiTemelBilgisi createKisiTemelBilgisi() {
        return new KisiTemelBilgisi();
    }

    /**
     * Create an instance of {@link Parametre }
     * 
     */
    public Parametre createParametre() {
        return new Parametre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Ilce", scope = KisiKayitYeriBilgisi.class)
    public JAXBElement<Parametre> createKisiKayitYeriBilgisiIlce(Parametre value) {
        return new JAXBElement<Parametre>(_KisiKayitYeriBilgisiIlce_QNAME, Parametre.class, KisiKayitYeriBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Il", scope = KisiKayitYeriBilgisi.class)
    public JAXBElement<Parametre> createKisiKayitYeriBilgisiIl(Parametre value) {
        return new JAXBElement<Parametre>(_KisiKayitYeriBilgisiIl_QNAME, Parametre.class, KisiKayitYeriBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Cilt", scope = KisiKayitYeriBilgisi.class)
    public JAXBElement<Parametre> createKisiKayitYeriBilgisiCilt(Parametre value) {
        return new JAXBElement<Parametre>(_KisiKayitYeriBilgisiCilt_QNAME, Parametre.class, KisiKayitYeriBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "BireySiraNo", scope = KisiKayitYeriBilgisi.class)
    public JAXBElement<Integer> createKisiKayitYeriBilgisiBireySiraNo(Integer value) {
        return new JAXBElement<Integer>(_KisiKayitYeriBilgisiBireySiraNo_QNAME, Integer.class, KisiKayitYeriBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "AileSiraNo", scope = KisiKayitYeriBilgisi.class)
    public JAXBElement<Integer> createKisiKayitYeriBilgisiAileSiraNo(Integer value) {
        return new JAXBElement<Integer>(_KisiKayitYeriBilgisiAileSiraNo_QNAME, Integer.class, KisiKayitYeriBilgisi.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link KisiSorgulaTCKimlikNoSorguKriteri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "KisiSorgulaTCKimlikNoSorguKriteri")
    public JAXBElement<KisiSorgulaTCKimlikNoSorguKriteri> createKisiSorgulaTCKimlikNoSorguKriteri(KisiSorgulaTCKimlikNoSorguKriteri value) {
        return new JAXBElement<KisiSorgulaTCKimlikNoSorguKriteri>(_KisiSorgulaTCKimlikNoSorguKriteri_QNAME, KisiSorgulaTCKimlikNoSorguKriteri.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKisiBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "ArrayOfKisiBilgisi")
    public JAXBElement<ArrayOfKisiBilgisi> createArrayOfKisiBilgisi(ArrayOfKisiBilgisi value) {
        return new JAXBElement<ArrayOfKisiBilgisi>(_ArrayOfKisiBilgisi_QNAME, ArrayOfKisiBilgisi.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link KisiTemelBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "KisiTemelBilgisi")
    public JAXBElement<KisiTemelBilgisi> createKisiTemelBilgisi(KisiTemelBilgisi value) {
        return new JAXBElement<KisiTemelBilgisi>(_KisiTemelBilgisi_QNAME, KisiTemelBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KisiDurumBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "KisiDurumBilgisi")
    public JAXBElement<KisiDurumBilgisi> createKisiDurumBilgisi(KisiDurumBilgisi value) {
        return new JAXBElement<KisiDurumBilgisi>(_KisiDurumBilgisi_QNAME, KisiDurumBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KisiBilgisiSonucu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "KisiBilgisiSonucu")
    public JAXBElement<KisiBilgisiSonucu> createKisiBilgisiSonucu(KisiBilgisiSonucu value) {
        return new JAXBElement<KisiBilgisiSonucu>(_KisiBilgisiSonucu_QNAME, KisiBilgisiSonucu.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link KisiKayitYeriBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "KisiKayitYeriBilgisi")
    public JAXBElement<KisiKayitYeriBilgisi> createKisiKayitYeriBilgisi(KisiKayitYeriBilgisi value) {
        return new JAXBElement<KisiKayitYeriBilgisi>(_KisiKayitYeriBilgisi_QNAME, KisiKayitYeriBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KisiBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "KisiBilgisi")
    public JAXBElement<KisiBilgisi> createKisiBilgisi(KisiBilgisi value) {
        return new JAXBElement<KisiBilgisi>(_KisiBilgisi_QNAME, KisiBilgisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "TarihBilgisi")
    public JAXBElement<TarihBilgisi> createTarihBilgisi(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_TarihBilgisi_QNAME, TarihBilgisi.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKisiSorgulaTCKimlikNoSorguKriteri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "ArrayOfKisiSorgulaTCKimlikNoSorguKriteri")
    public JAXBElement<ArrayOfKisiSorgulaTCKimlikNoSorguKriteri> createArrayOfKisiSorgulaTCKimlikNoSorguKriteri(ArrayOfKisiSorgulaTCKimlikNoSorguKriteri value) {
        return new JAXBElement<ArrayOfKisiSorgulaTCKimlikNoSorguKriteri>(_ArrayOfKisiSorgulaTCKimlikNoSorguKriteri_QNAME, ArrayOfKisiSorgulaTCKimlikNoSorguKriteri.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "AnneAd", scope = KisiTemelBilgisi.class)
    public JAXBElement<String> createKisiTemelBilgisiAnneAd(String value) {
        return new JAXBElement<String>(_KisiTemelBilgisiAnneAd_QNAME, String.class, KisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Cinsiyet", scope = KisiTemelBilgisi.class)
    public JAXBElement<Parametre> createKisiTemelBilgisiCinsiyet(Parametre value) {
        return new JAXBElement<Parametre>(_KisiTemelBilgisiCinsiyet_QNAME, Parametre.class, KisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Soyad", scope = KisiTemelBilgisi.class)
    public JAXBElement<String> createKisiTemelBilgisiSoyad(String value) {
        return new JAXBElement<String>(_KisiTemelBilgisiSoyad_QNAME, String.class, KisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "DogumTarih", scope = KisiTemelBilgisi.class)
    public JAXBElement<TarihBilgisi> createKisiTemelBilgisiDogumTarih(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_KisiTemelBilgisiDogumTarih_QNAME, TarihBilgisi.class, KisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Ad", scope = KisiTemelBilgisi.class)
    public JAXBElement<String> createKisiTemelBilgisiAd(String value) {
        return new JAXBElement<String>(_KisiTemelBilgisiAd_QNAME, String.class, KisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "BabaAd", scope = KisiTemelBilgisi.class)
    public JAXBElement<String> createKisiTemelBilgisiBabaAd(String value) {
        return new JAXBElement<String>(_KisiTemelBilgisiBabaAd_QNAME, String.class, KisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "DogumYer", scope = KisiTemelBilgisi.class)
    public JAXBElement<String> createKisiTemelBilgisiDogumYer(String value) {
        return new JAXBElement<String>(_KisiTemelBilgisiDogumYer_QNAME, String.class, KisiTemelBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KisiBilgisiSonucu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "ListeleCokluResult", scope = ListeleCokluResponse.class)
    public JAXBElement<KisiBilgisiSonucu> createListeleCokluResponseListeleCokluResult(KisiBilgisiSonucu value) {
        return new JAXBElement<KisiBilgisiSonucu>(_ListeleCokluResponseListeleCokluResult_QNAME, KisiBilgisiSonucu.class, ListeleCokluResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKisiSorgulaTCKimlikNoSorguKriteri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "kriterListesi", scope = ListeleCoklu.class)
    public JAXBElement<ArrayOfKisiSorgulaTCKimlikNoSorguKriteri> createListeleCokluKriterListesi(ArrayOfKisiSorgulaTCKimlikNoSorguKriteri value) {
        return new JAXBElement<ArrayOfKisiSorgulaTCKimlikNoSorguKriteri>(_ListeleCokluKriterListesi_QNAME, ArrayOfKisiSorgulaTCKimlikNoSorguKriteri.class, ListeleCoklu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Gun", scope = TarihBilgisi.class)
    public JAXBElement<Integer> createTarihBilgisiGun(Integer value) {
        return new JAXBElement<Integer>(_TarihBilgisiGun_QNAME, Integer.class, TarihBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Yil", scope = TarihBilgisi.class)
    public JAXBElement<Integer> createTarihBilgisiYil(Integer value) {
        return new JAXBElement<Integer>(_TarihBilgisiYil_QNAME, Integer.class, TarihBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Ay", scope = TarihBilgisi.class)
    public JAXBElement<Integer> createTarihBilgisiAy(Integer value) {
        return new JAXBElement<Integer>(_TarihBilgisiAy_QNAME, Integer.class, TarihBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "HataBilgisi", scope = KisiBilgisi.class)
    public JAXBElement<Parametre> createKisiBilgisiHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_KisiBilgisiHataBilgisi_QNAME, Parametre.class, KisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "TCKimlikNo", scope = KisiBilgisi.class)
    public JAXBElement<Long> createKisiBilgisiTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_KisiBilgisiTCKimlikNo_QNAME, Long.class, KisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "BabaTCKimlikNo", scope = KisiBilgisi.class)
    public JAXBElement<Long> createKisiBilgisiBabaTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_KisiBilgisiBabaTCKimlikNo_QNAME, Long.class, KisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "AnneTCKimlikNo", scope = KisiBilgisi.class)
    public JAXBElement<Long> createKisiBilgisiAnneTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_KisiBilgisiAnneTCKimlikNo_QNAME, Long.class, KisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KisiDurumBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "DurumBilgisi", scope = KisiBilgisi.class)
    public JAXBElement<KisiDurumBilgisi> createKisiBilgisiDurumBilgisi(KisiDurumBilgisi value) {
        return new JAXBElement<KisiDurumBilgisi>(_KisiBilgisiDurumBilgisi_QNAME, KisiDurumBilgisi.class, KisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "DogumYerKod", scope = KisiBilgisi.class)
    public JAXBElement<Integer> createKisiBilgisiDogumYerKod(Integer value) {
        return new JAXBElement<Integer>(_KisiBilgisiDogumYerKod_QNAME, Integer.class, KisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KisiKayitYeriBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "KayitYeriBilgisi", scope = KisiBilgisi.class)
    public JAXBElement<KisiKayitYeriBilgisi> createKisiBilgisiKayitYeriBilgisi(KisiKayitYeriBilgisi value) {
        return new JAXBElement<KisiKayitYeriBilgisi>(_KisiBilgisiKayitYeriBilgisi_QNAME, KisiKayitYeriBilgisi.class, KisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "EsTCKimlikNo", scope = KisiBilgisi.class)
    public JAXBElement<Long> createKisiBilgisiEsTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_KisiBilgisiEsTCKimlikNo_QNAME, Long.class, KisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KisiTemelBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "TemelBilgisi", scope = KisiBilgisi.class)
    public JAXBElement<KisiTemelBilgisi> createKisiBilgisiTemelBilgisi(KisiTemelBilgisi value) {
        return new JAXBElement<KisiTemelBilgisi>(_KisiBilgisiTemelBilgisi_QNAME, KisiTemelBilgisi.class, KisiBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarihBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "OlumTarih", scope = KisiDurumBilgisi.class)
    public JAXBElement<TarihBilgisi> createKisiDurumBilgisiOlumTarih(TarihBilgisi value) {
        return new JAXBElement<TarihBilgisi>(_KisiDurumBilgisiOlumTarih_QNAME, TarihBilgisi.class, KisiDurumBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Din", scope = KisiDurumBilgisi.class)
    public JAXBElement<Parametre> createKisiDurumBilgisiDin(Parametre value) {
        return new JAXBElement<Parametre>(_KisiDurumBilgisiDin_QNAME, Parametre.class, KisiDurumBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "MedeniHal", scope = KisiDurumBilgisi.class)
    public JAXBElement<Parametre> createKisiDurumBilgisiMedeniHal(Parametre value) {
        return new JAXBElement<Parametre>(_KisiDurumBilgisiMedeniHal_QNAME, Parametre.class, KisiDurumBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Durum", scope = KisiDurumBilgisi.class)
    public JAXBElement<Parametre> createKisiDurumBilgisiDurum(Parametre value) {
        return new JAXBElement<Parametre>(_KisiDurumBilgisiDurum_QNAME, Parametre.class, KisiDurumBilgisi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "TCKimlikNo", scope = KisiSorgulaTCKimlikNoSorguKriteri.class)
    public JAXBElement<Long> createKisiSorgulaTCKimlikNoSorguKriteriTCKimlikNo(Long value) {
        return new JAXBElement<Long>(_KisiBilgisiTCKimlikNo_QNAME, Long.class, KisiSorgulaTCKimlikNoSorguKriteri.class, value);
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
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "Aciklama", scope = Parametre.class)
    public JAXBElement<String> createParametreAciklama(String value) {
        return new JAXBElement<String>(_ParametreAciklama_QNAME, String.class, Parametre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parametre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "HataBilgisi", scope = KisiBilgisiSonucu.class)
    public JAXBElement<Parametre> createKisiBilgisiSonucuHataBilgisi(Parametre value) {
        return new JAXBElement<Parametre>(_KisiBilgisiHataBilgisi_QNAME, Parametre.class, KisiBilgisiSonucu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKisiBilgisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kps.nvi.gov.tr/2011/01/01", name = "SorguSonucu", scope = KisiBilgisiSonucu.class)
    public JAXBElement<ArrayOfKisiBilgisi> createKisiBilgisiSonucuSorguSonucu(ArrayOfKisiBilgisi value) {
        return new JAXBElement<ArrayOfKisiBilgisi>(_KisiBilgisiSonucuSorguSonucu_QNAME, ArrayOfKisiBilgisi.class, KisiBilgisiSonucu.class, value);
    }

}
