package tr.gov.nvi.kpsv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import tr.gov.nvi.kpsv2.model.IlceModel;
import tr.gov.nvi.kpsv2.model.ParametreModel;
import tr.gov.nvi.kpsv2.ws.aksokutumilebagliilce.AksOkuTumIleBagliIlceServis;
import tr.gov.nvi.kpsv2.ws.aksokutumilebagliilce.AksOkuTumIleBagliIlceSorguKriteri;
import tr.gov.nvi.kpsv2.ws.aksokutumilebagliilce.Ilce;
import tr.gov.nvi.kpsv2.ws.aksokutumilebagliilce.IlceSonucu;
import tr.gov.nvi.kpsv2.ws.aksokutumilebagliilce.ObjectFactory;
import tr.gov.nvi.kpsv2.ws.aksokutumilebagliilce.Parametre;
import tr.gov.nvi.kpsv2.ws.client.exceptions.NviServiceException;
import tr.gov.nvi.kpsv2.ws.client.factory.KPSClientFactory2;


public class IlceListeleme {
	private static Object syncObject = new Object();
	private static ObjectFactory ilceListelemeObjectFactory = new ObjectFactory();
	private static Map<Integer, List<IlceModel>> ilceListesi = new HashMap<Integer, List<IlceModel>>();
	
	private IlceListeleme() {
		
	}
	
	public static List<IlceModel> ilceListesiGetir(int ilKod)
	throws NviServiceException {
		Integer ilKey = Integer.valueOf(ilKod);
		
		if (ilceListesi.containsKey(ilKey) == false) {
			synchronized (syncObject) {
				if (ilceListesi.containsKey(ilKey) == false) {
					AksOkuTumIleBagliIlceSorguKriteri kriter = ilceListelemeObjectFactory.createAksOkuTumIleBagliIlceSorguKriteri();
					kriter.setIlKodu(ilceListelemeObjectFactory.createAksOkuTumIleBagliIlceSorguKriteriIlKodu(ilKey));
					
					AksOkuTumIleBagliIlceServis servis = KPSClientFactory2.Instance.newOkuTumIleBagliIlce();
					
					IlceSonucu sonuc = servis.listele(kriter);
					
					if (sonuc.getHataBilgisi().getValue() == null) {
						List<IlceModel> result = new ArrayList<IlceModel>();
						List<Ilce> ilceListesiSonucu = sonuc.getSorguSonucu().getValue().getIlce();
						
						for (int i = 0; i < ilceListesiSonucu.size(); i++) {
							result.add(convertToIlceModel(ilceListesiSonucu.get(i)));
						}
						
						ilceListesi.put(ilKey, result);
					} else {
						String hataMesaji = 
								String.format("%d: %s", 
										sonuc.getHataBilgisi().getValue().getKod().getValue(), 
										sonuc.getHataBilgisi().getValue().getAciklama().getValue());
						
						throw new NviServiceException(hataMesaji);
					}
				}
			}
		}
		
		
		return ilceListesi.get(Integer.valueOf(ilKod));
	}
	
	private static IlceModel convertToIlceModel(Ilce ilce) {
		IlceModel result = new IlceModel();
		
		result.setHata(convertToParametreModel(ilce.getHataBilgisi()));
		result.setKod(ilce.getKod().getValue().intValue());
		result.setAd(ilce.getAd().getValue());
		result.setIlKod(ilce.getIlKod().getValue().intValue());
		
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
