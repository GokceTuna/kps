package tr.gov.nvi.kpsv2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;

import tr.gov.nvi.kpsv2.model.IlModel;
import tr.gov.nvi.kpsv2.model.ParametreModel;
import tr.gov.nvi.kpsv2.ws.aksokutumil.AksOkuTumIlServis;
import tr.gov.nvi.kpsv2.ws.aksokutumil.AksOkuTumIlSorguKriteri;
import tr.gov.nvi.kpsv2.ws.aksokutumil.Il;
import tr.gov.nvi.kpsv2.ws.aksokutumil.IlSonucu;
import tr.gov.nvi.kpsv2.ws.aksokutumil.ObjectFactory;
import tr.gov.nvi.kpsv2.ws.aksokutumil.Parametre;
import tr.gov.nvi.kpsv2.ws.client.exceptions.NviServiceException;
import tr.gov.nvi.kpsv2.ws.client.factory.KPSClientFactory2;


public class IlListeleme {
	private static Object syncObject = new Object();
	private static ObjectFactory ilListelemeObjectFactory = new ObjectFactory();
	private static volatile List<IlModel> ilListesi = null;
	
	private IlListeleme() {
		
	}
	
	public static List<IlModel> ilListesiGetir() 
	throws NviServiceException {
		if (ilListesi == null) {
			synchronized (syncObject) {
				if (ilListesi == null) {
					AksOkuTumIlSorguKriteri kriter = ilListelemeObjectFactory.createAksOkuTumIlSorguKriteri();
					
					AksOkuTumIlServis servis = KPSClientFactory2.Instance.newOkuTumIl();
					
					IlSonucu sonuc = servis.listele(kriter);
					
					if (sonuc.getHataBilgisi().getValue() == null) {
						List<IlModel> result = new ArrayList<IlModel>();
						List<Il> ilListesiSonucu = sonuc.getSorguSonucu().getValue().getIl();
						
						for (int i = 0; i < ilListesiSonucu.size(); i++) {
							result.add(convertToIlModel(ilListesiSonucu.get(i)));
						}
						
						ilListesi = result;
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
		
		return ilListesi;
	}
	
	private static IlModel convertToIlModel(Il il) {
		IlModel result = new IlModel();
		
		result.setHata(convertToParametreModel(il.getHataBilgisi()));
		result.setKod(il.getKod().getValue().intValue());
		result.setAd(il.getAd().getValue());
		
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
