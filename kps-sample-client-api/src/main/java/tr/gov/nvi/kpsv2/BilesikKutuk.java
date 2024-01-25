package tr.gov.nvi.kpsv2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;

import tr.gov.nvi.kpsv2.model.BilesikKutukModel;
import tr.gov.nvi.kpsv2.model.ParametreModel;
import tr.gov.nvi.kpsv2.model.TarihModel;
import tr.gov.nvi.kpsv2.ws.client.exceptions.NviServiceException;
import tr.gov.nvi.kpsv2.ws.client.factory.KPSClientFactory;
import tr.gov.nvi.kpsv2.ws.bilesikkutuksorgulakimlikno.ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri; 
import tr.gov.nvi.kpsv2.ws.bilesikkutuksorgulakimlikno.BilesikKutukBilgileri;
import tr.gov.nvi.kpsv2.ws.bilesikkutuksorgulakimlikno.BilesikKutukBilgileriSonucu;
import tr.gov.nvi.kpsv2.ws.bilesikkutuksorgulakimlikno.BilesikKutukSorgulaKimlikNoServis;
import tr.gov.nvi.kpsv2.ws.bilesikkutuksorgulakimlikno.BilesikKutukSorgulaKimlikNoSorguKriteri;
import tr.gov.nvi.kpsv2.ws.bilesikkutuksorgulakimlikno.ObjectFactory;
import tr.gov.nvi.kpsv2.ws.bilesikkutuksorgulakimlikno.Parametre;
import tr.gov.nvi.kpsv2.ws.bilesikkutuksorgulakimlikno.TarihBilgisi;

public class BilesikKutuk {
	private static ObjectFactory bilesikKutukSorgulaSorgulaObjectFactory = new ObjectFactory();
	
	private BilesikKutuk() {
		
	}
	
	public static BilesikKutukModel BilesikKutukBilgileriSorgula(long tcKimlikNo)
	throws NviServiceException {
		List<BilesikKutukModel> result = BilesikKutukBilgileriSorgula(new long[] { tcKimlikNo });
		
		if (result.size() == 1) {
			return result.get(0);
		}
		
		return null;
	}
	
	public static List<BilesikKutukModel> BilesikKutukBilgileriSorgula(long[] tcKimlikNoList)
	throws NviServiceException {
		ArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri kriterListesi = bilesikKutukSorgulaSorgulaObjectFactory.createArrayOfBilesikKutukSorgulaKimlikNoSorguKriteri();
		
		for (int i = 0; i < tcKimlikNoList.length; i++) {
			BilesikKutukSorgulaKimlikNoSorguKriteri kriter = bilesikKutukSorgulaSorgulaObjectFactory.createBilesikKutukSorgulaKimlikNoSorguKriteri();
			kriter.setKimlikNo(bilesikKutukSorgulaSorgulaObjectFactory.createBilesikKutukBilgileriKimlikNo(Long.valueOf(tcKimlikNoList[i])));
			
			kriterListesi.getBilesikKutukSorgulaKimlikNoSorguKriteri().add(kriter);
		}
		
                BilesikKutukSorgulaKimlikNoServis servis = KPSClientFactory.Instance.newBilesikKutukKimlikNo();
		
		BilesikKutukBilgileriSonucu sonuc = servis.sorgula(kriterListesi);
		
		if (sonuc.getHataBilgisi().getValue() == null) {
			List<BilesikKutukModel> result = new ArrayList<BilesikKutukModel>();
			
			for (int i = 0; i < tcKimlikNoList.length; i++) {
				BilesikKutukBilgileri kisi = sonuc.getSorguSonucu().getValue().getBilesikKutukBilgileri().get(i);
				
				result.add(convertToBilesikKutukModel(kisi));
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
	
	private static BilesikKutukModel convertToBilesikKutukModel(BilesikKutukBilgileri kisi) {
		BilesikKutukModel result = new BilesikKutukModel();
		
		result.setHata(convertToParametreModel(kisi.getHataBilgisi()));
		
		if (result.hasHata() == false) {
                    
                        result.setKimlikNo(kisi.getKimlikNo().getValue().longValue());
                        if (kisi.getTCVatandasiKisiKutukleri().getValue() != null) {
                            if (kisi.getTCVatandasiKisiKutukleri().getValue().getKisiBilgisi().getValue() != null) {
                                result.setTcKimlikNo(kisi.getTCVatandasiKisiKutukleri().getValue().getKisiBilgisi().getValue().getTCKimlikNo().getValue().longValue());
                                result.setAd(kisi.getTCVatandasiKisiKutukleri().getValue().getKisiBilgisi().getValue().getTemelBilgisi().getValue().getAd().getValue());
                                result.setSoyad(kisi.getTCVatandasiKisiKutukleri().getValue().getKisiBilgisi().getValue().getTemelBilgisi().getValue().getSoyad().getValue());
                                result.setDogumTarih(convertToTarihModel(kisi.getTCVatandasiKisiKutukleri().getValue().getKisiBilgisi().getValue().getTemelBilgisi().getValue().getDogumTarih()));
                            }
                        }
			
                        if (kisi.getTCVatandasiKisiKutukleri().getValue().getNufusCuzdaniBilgisi().getValue() != null) {
                            result.setCuzdanTcKimlikNo(kisi.getTCVatandasiKisiKutukleri().getValue().getNufusCuzdaniBilgisi().getValue().getTCKimlikNo().getValue().longValue());
                            result.setCuzdanAd(kisi.getTCVatandasiKisiKutukleri().getValue().getNufusCuzdaniBilgisi().getValue().getAd().getValue());
                            result.setCuzdanSoyad(kisi.getTCVatandasiKisiKutukleri().getValue().getNufusCuzdaniBilgisi().getValue().getSoyad().getValue());
                            result.setSeri(kisi.getTCVatandasiKisiKutukleri().getValue().getNufusCuzdaniBilgisi().getValue().getSeri().getValue());
                            result.setNo(kisi.getTCVatandasiKisiKutukleri().getValue().getNufusCuzdaniBilgisi().getValue().getNo().getValue());
                        }
                        
                        if(kisi.getTCVatandasiKisiKutukleri().getValue().getTCKKBilgisi().getValue() != null)   {
                            result.setTckkTcKimlikNo(kisi.getTCVatandasiKisiKutukleri().getValue().getTCKKBilgisi().getValue().getTCKimlikNo().getValue().longValue());
                            result.setTckkAd(kisi.getTCVatandasiKisiKutukleri().getValue().getTCKKBilgisi().getValue().getAd().getValue());
                            result.setTckkSoyad(kisi.getTCVatandasiKisiKutukleri().getValue().getTCKKBilgisi().getValue().getSoyad().getValue());
                            result.setTckkSeriNo(kisi.getTCVatandasiKisiKutukleri().getValue().getTCKKBilgisi().getValue().getSeriNo().getValue());
                        }
                        
                        if (kisi.getTCVatandasiKisiKutukleri().getValue().getGeciciKimlikBilgisi().getValue() != null) {
                            result.setGeciciKimlikTcKimlikNo(kisi.getTCVatandasiKisiKutukleri().getValue().getGeciciKimlikBilgisi().getValue().getTCKimlikNo().getValue().longValue());
                            result.setGeciciKimlikAd(kisi.getTCVatandasiKisiKutukleri().getValue().getGeciciKimlikBilgisi().getValue().getAd().getValue());
                            result.setGeciciKimlikSoyad(kisi.getTCVatandasiKisiKutukleri().getValue().getGeciciKimlikBilgisi().getValue().getSoyad().getValue());
                        }
                        
                        if (kisi.getMaviKartliKisiKutukleri().getValue() != null) {
                            if (kisi.getMaviKartliKisiKutukleri().getValue().getKisiBilgisi().getValue() != null) {
                                result.setMaviKartliKimlikNo(kisi.getMaviKartliKisiKutukleri().getValue().getKisiBilgisi().getValue().getKimlikNo().getValue().longValue());
                                result.setMaviKartliAd(kisi.getMaviKartliKisiKutukleri().getValue().getKisiBilgisi().getValue().getTemelBilgisi().getValue().getAd().getValue());
                                result.setMaviKartliSoyad(kisi.getMaviKartliKisiKutukleri().getValue().getKisiBilgisi().getValue().getTemelBilgisi().getValue().getSoyad().getValue());
                                result.setMaviKartliDogumTarih(convertToTarihModel(kisi.getMaviKartliKisiKutukleri().getValue().getKisiBilgisi().getValue().getTemelBilgisi().getValue().getDogumTarih()));
                            }
                            if (kisi.getMaviKartliKisiKutukleri().getValue().getMaviKartBilgisi().getValue() != null) {
                                result.setMaviKartKimlikNo(kisi.getMaviKartliKisiKutukleri().getValue().getMaviKartBilgisi().getValue().getKimlikNo().getValue().longValue());
                                result.setMaviKartAd(kisi.getMaviKartliKisiKutukleri().getValue().getMaviKartBilgisi().getValue().getAd().getValue());
                                result.setMaviKartSoyad(kisi.getMaviKartliKisiKutukleri().getValue().getMaviKartBilgisi().getValue().getSoyad().getValue());
                                result.setMaviKartSeri(kisi.getMaviKartliKisiKutukleri().getValue().getMaviKartBilgisi().getValue().getSeri().getValue());
                                result.setMaviKartNo(kisi.getMaviKartliKisiKutukleri().getValue().getMaviKartBilgisi().getValue().getNo().getValue());
                            }
                        }
                        
                        if (kisi.getYabanciKisiKutukleri().getValue() != null) {
                            if (kisi.getYabanciKisiKutukleri().getValue().getKisiBilgisi().getValue() != null) {
                                result.setYbKimlikNo(kisi.getYabanciKisiKutukleri().getValue().getKisiBilgisi().getValue().getKimlikNo().getValue().longValue());
                                result.setYbAd(kisi.getYabanciKisiKutukleri().getValue().getKisiBilgisi().getValue().getTemelBilgisi().getValue().getAd().getValue());
                                result.setYbSoyad(kisi.getYabanciKisiKutukleri().getValue().getKisiBilgisi().getValue().getTemelBilgisi().getValue().getSoyad().getValue());
                                result.setYbDogumTarih(convertToTarihModel(kisi.getYabanciKisiKutukleri().getValue().getKisiBilgisi().getValue().getDogumTarih()));
                            }
                        }
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
