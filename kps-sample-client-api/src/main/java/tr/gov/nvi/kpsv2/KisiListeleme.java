package tr.gov.nvi.kpsv2;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import tr.gov.nvi.kpsv2.model.KisiModel;
import tr.gov.nvi.kpsv2.model.ParametreModel;
import tr.gov.nvi.kpsv2.model.SayfalamaModel;
import tr.gov.nvi.kpsv2.model.TarihModel;
import tr.gov.nvi.kpsv2.ws.client.exceptions.NviServiceException;
import tr.gov.nvi.kpsv2.ws.client.factory.KPSClientFactory2;
import tr.gov.nvi.kpsv2.ws.kisilistele.CstCinsiyet;
import tr.gov.nvi.kpsv2.ws.kisilistele.DogumTarihveCinsiyeteGoreKisiBilgisi;
import tr.gov.nvi.kpsv2.ws.kisilistele.KisiListeleServis;
import tr.gov.nvi.kpsv2.ws.kisilistele.KisiListeleSorguKriteri;
import tr.gov.nvi.kpsv2.ws.kisilistele.KisiListesi;
import tr.gov.nvi.kpsv2.ws.kisilistele.KisiListesiSonucu;
import tr.gov.nvi.kpsv2.ws.kisilistele.ObjectFactory;
import tr.gov.nvi.kpsv2.ws.kisilistele.Parametre;
import tr.gov.nvi.kpsv2.ws.kisilistele.TarihBilgisi;

public class KisiListeleme {
	private static ObjectFactory kisiListeleObjectFactory = new ObjectFactory();
	
	private KisiListeleme() {
		
	}
	
	public static SayfalamaModel<KisiModel> kisiListele(int ilce, Date baslangicTarih, Date bitisTarih, CstCinsiyet cinsiyet)
	throws NviServiceException {
		SayfalamaModel<KisiModel> result = null;
		
		try {
			DatatypeFactory dtFactory = DatatypeFactory.newInstance();
			GregorianCalendar baslangicCal = new GregorianCalendar(TimeZone.getDefault());
			baslangicCal.setTime(baslangicTarih);
			GregorianCalendar bitisCal = new GregorianCalendar(TimeZone.getDefault());
			bitisCal.setTime(bitisTarih);
			
			KisiListeleSorguKriteri kriter = kisiListeleObjectFactory.createKisiListeleSorguKriteri();
			kriter.setIlce(kisiListeleObjectFactory.createKisiListeleSorguKriteriIlce(Integer.valueOf(ilce)));
			kriter.setBaslangicTarih(kisiListeleObjectFactory.createKisiListeleSorguKriteriBaslangicTarih(dtFactory.newXMLGregorianCalendar(baslangicCal)));
			kriter.setBitisTarih(kisiListeleObjectFactory.createKisiListeleSorguKriteriBitisTarih(dtFactory.newXMLGregorianCalendar(bitisCal)));
			kriter.setCinsiyet(kisiListeleObjectFactory.createKisiListeleSorguKriteriCinsiyet(cinsiyet));
			kriter.setSayfaAnahtari(null);
			
			KisiListeleServis servis = KPSClientFactory2.Instance.newKisiListele();
			
			KisiListesiSonucu sonuc = servis.sayfala(kriter);
		
			if (sonuc.getHataBilgisi().getValue() == null) {
				KisiListesi sonucListe = sonuc.getSorguSonucu().getValue();
				List<DogumTarihveCinsiyeteGoreKisiBilgisi> kisiBilgisiListesi = sonucListe.getSonuc().getValue().getDogumTarihveCinsiyeteGoreKisiBilgisi();
				
				result = new SayfalamaModel<KisiModel>();
				result.setKriter(kriter);
				result.setAnahtar(sonucListe.getSayfaAnahtari().getValue().longValue());
				for (int i = 0; i < kisiBilgisiListesi.size(); i++) {
					result.getList().add(convertToKisiModel(kisiBilgisiListesi.get(i)));
				}
				
				return result;
			} else {
				String hataMesaji = 
						String.format("%d: %s", 
								sonuc.getHataBilgisi().getValue().getKod().getValue(), 
								sonuc.getHataBilgisi().getValue().getAciklama().getValue());
				
				throw new NviServiceException(hataMesaji);
			}
		} catch (DatatypeConfigurationException dtcEx) {
			throw new NviServiceException("DatatypeFactory oluþturulamadý.", dtcEx);
		}
	}
	
	public static SayfalamaModel<KisiModel> kisiListele(SayfalamaModel<KisiModel> oncekiSayfa)
	throws NviServiceException {
		SayfalamaModel<KisiModel> result = null;
		
		KisiListeleSorguKriteri kriter = (KisiListeleSorguKriteri)oncekiSayfa.getKriter();
		
		kriter.setSayfaAnahtari(kisiListeleObjectFactory.createKisiListeleSorguKriteriSayfaAnahtari(Long.valueOf(oncekiSayfa.getAnahtar())));
		
		KisiListeleServis servis = KPSClientFactory2.Instance.newKisiListele();
		
		KisiListesiSonucu sonuc = servis.sayfala(kriter);
	
		if (sonuc.getHataBilgisi().getValue() == null) {
			KisiListesi sonucListe = sonuc.getSorguSonucu().getValue();
			List<DogumTarihveCinsiyeteGoreKisiBilgisi> kisiBilgisiListesi = sonucListe.getSonuc().getValue().getDogumTarihveCinsiyeteGoreKisiBilgisi();
			
			result = new SayfalamaModel<KisiModel>();
			result.setKriter(kriter);
			result.setAnahtar(sonucListe.getSayfaAnahtari().getValue().longValue());
			for (int i = 0; i < kisiBilgisiListesi.size(); i++) {
				result.getList().add(convertToKisiModel(kisiBilgisiListesi.get(i)));
			}
			
			return result;
		} else {
			String hataMesaji = 
					String.format("%d: %s", 
							sonuc.getHataBilgisi().getValue().getKod().getValue(), 
							sonuc.getHataBilgisi().getValue().getAciklama().getValue());
			
			throw new NviServiceException(hataMesaji);
		}
	}
	
	private static KisiModel convertToKisiModel(DogumTarihveCinsiyeteGoreKisiBilgisi kisi) {
		KisiModel result = new KisiModel();
		
		result.setHata(convertToParametreModel(kisi.getHataBilgisi()));
		
		result.setTcKimlikNo(kisi.getTCKimlikNo().getValue().longValue());
		result.setAd(kisi.getTemelBilgisi().getValue().getAd().getValue());
		result.setSoyad(kisi.getTemelBilgisi().getValue().getSoyad().getValue());
		result.setAnneAd(kisi.getTemelBilgisi().getValue().getAnneAd().getValue());
		result.setBabaAd(kisi.getTemelBilgisi().getValue().getBabaAd().getValue());
		result.setDogumYer(kisi.getTemelBilgisi().getValue().getDogumYer().getValue());
		result.setDogumTarih(convertToTarihModel(kisi.getTemelBilgisi().getValue().getDogumTarih()));
		result.setCinsiyet(convertToParametreModel(kisi.getTemelBilgisi().getValue().getCinsiyet()));
		result.setDurum(convertToParametreModel(kisi.getDurumBilgisi().getValue().getDurum()));
		result.setMedeniHal(convertToParametreModel(kisi.getDurumBilgisi().getValue().getMedeniHal()));
		result.setOlumTarih(convertToTarihModel(kisi.getDurumBilgisi().getValue().getOlumTarih()));
		
		result.setKayitYerIl(convertToParametreModel(kisi.getKayitYeriBilgisi().getValue().getIl()));
		result.setKayitYerIlce(convertToParametreModel(kisi.getKayitYeriBilgisi().getValue().getIlce()));
		result.setKayitYerCilt(convertToParametreModel(kisi.getKayitYeriBilgisi().getValue().getCilt()));
		result.setAileSiraNo(kisi.getKayitYeriBilgisi().getValue().getAileSiraNo().getValue().intValue());
		result.setBireySiraNo(kisi.getKayitYeriBilgisi().getValue().getBireySiraNo().getValue().intValue());
		
		return result;
	}
	
	private static TarihModel convertToTarihModel(JAXBElement<TarihBilgisi> tarihElement) {
		if (tarihElement == null) {
			return null;
		}
		
		TarihBilgisi tarih = tarihElement.getValue();
		if (tarih == null || (tarih.getAy() == null && tarih.getGun() == null && tarih.getYil() == null)) {
			return null;
		}
		
		TarihModel result = new TarihModel();
		
		result.setGun(tarih.getGun().getValue());
		result.setAy(tarih.getAy().getValue());
		result.setYil(tarih.getYil().getValue());
		
		return result;
	}
	
	private static ParametreModel convertToParametreModel(JAXBElement<Parametre> parametreElement) {
		if (parametreElement == null) {
			return null;
		}
		
		Parametre parametre = parametreElement.getValue();
		if (parametre == null || (parametre.getKod().getValue() == null && parametre.getAciklama().getValue() == null)) {
			return null;
		}
		
		ParametreModel result = new ParametreModel();
		
		result.setKod(parametre.getKod().getValue().intValue());
		result.setAciklama(parametre.getAciklama().getValue());
		
		return result;
	}
	
}
