package tr.gov.nvi.kpsv2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;

import tr.gov.nvi.kpsv2.model.KisiModel;
import tr.gov.nvi.kpsv2.model.ParametreModel;
import tr.gov.nvi.kpsv2.model.TarihModel;
import tr.gov.nvi.kpsv2.ws.client.exceptions.NviServiceException;
import tr.gov.nvi.kpsv2.ws.client.factory.KPSClientFactory2;
import tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno.ArrayOfKisiSorgulaTCKimlikNoSorguKriteri;
import tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno.KisiBilgisi;
import tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno.KisiBilgisiSonucu;
import tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno.KisiSorgulaTCKimlikNoServis;
import tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno.KisiSorgulaTCKimlikNoSorguKriteri;
import tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno.ObjectFactory;
import tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno.Parametre;
import tr.gov.nvi.kpsv2.ws.kisisorgulatckimlikno.TarihBilgisi;

public class KisiSorgulama {
	private static ObjectFactory kisiSorgulaObjectFactory = new ObjectFactory();
	
	private KisiSorgulama() {
		
	}
	
	public static KisiModel kisiBilgisiSorgula(long tcKimlikNo)
	throws NviServiceException {
		List<KisiModel> result = kisiBilgisiSorgula(new long[] { tcKimlikNo });
		
		if (result.size() == 1) {
			return result.get(0);
		}
		
		return null;
	}
	
	public static List<KisiModel> kisiBilgisiSorgula(long[] tcKimlikNoList)
	throws NviServiceException {
		ArrayOfKisiSorgulaTCKimlikNoSorguKriteri kriterListesi = kisiSorgulaObjectFactory.createArrayOfKisiSorgulaTCKimlikNoSorguKriteri();
		
		for (int i = 0; i < tcKimlikNoList.length; i++) {
			KisiSorgulaTCKimlikNoSorguKriteri kriter = kisiSorgulaObjectFactory.createKisiSorgulaTCKimlikNoSorguKriteri();
			kriter.setTCKimlikNo(kisiSorgulaObjectFactory.createKisiSorgulaTCKimlikNoSorguKriteriTCKimlikNo(Long.valueOf(tcKimlikNoList[i])));
			
			kriterListesi.getKisiSorgulaTCKimlikNoSorguKriteri().add(kriter);
		}
		
		KisiSorgulaTCKimlikNoServis servis = KPSClientFactory2.Instance.newKisiSorgulaTCKimlikNo();
		
		KisiBilgisiSonucu sonuc = servis.listeleCoklu(kriterListesi);
		
		if (sonuc.getHataBilgisi().getValue() == null) {
			List<KisiModel> result = new ArrayList<KisiModel>();
			
			for (int i = 0; i < tcKimlikNoList.length; i++) {
				KisiBilgisi kisi = sonuc.getSorguSonucu().getValue().getKisiBilgisi().get(i);
				
				result.add(convertToKisiModel(kisi));
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
	
	private static KisiModel convertToKisiModel(KisiBilgisi kisi) {
		KisiModel result = new KisiModel();
		
		result.setHata(convertToParametreModel(kisi.getHataBilgisi()));
		
		if (result.hasHata() == false) {
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
		}
		
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
