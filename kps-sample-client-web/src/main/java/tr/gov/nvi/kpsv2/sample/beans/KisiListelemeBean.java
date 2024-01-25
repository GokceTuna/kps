package tr.gov.nvi.kpsv2.sample.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import tr.gov.nvi.kpsv2.IlListeleme;
import tr.gov.nvi.kpsv2.IlceListeleme;
import tr.gov.nvi.kpsv2.KisiListeleme;
import tr.gov.nvi.kpsv2.model.IlModel;
import tr.gov.nvi.kpsv2.model.IlceModel;
import tr.gov.nvi.kpsv2.model.KisiModel;
import tr.gov.nvi.kpsv2.model.SayfalamaModel;
import tr.gov.nvi.kpsv2.ws.client.exceptions.NviServiceException;
import tr.gov.nvi.kpsv2.ws.kisilistele.CstCinsiyet;

public class KisiListelemeBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int ilKodu;
	private int ilceKodu;
	private Date baslangicTarih;
	private Date bitisTarih;
	private CstCinsiyet cinsiyet;
	
	private SayfalamaModel<KisiModel> kisiListesi;
	
	public KisiListelemeBean() {
		
	}

	public int getIlKodu() {
		return ilKodu;
	}

	public void setIlKodu(int ilKodu) {
		this.ilKodu = ilKodu;
		this.ilceListesi = null;
	}
	
	public boolean isIlKoduNotSet() {
		return ilKodu <= 0;
	}

	public int getIlceKodu() {
		return ilceKodu;
	}

	public void setIlceKodu(int ilceKodu) {
		this.ilceKodu = ilceKodu;
	}

	public Date getBaslangicTarih() {
		return baslangicTarih;
	}

	public void setBaslangicTarih(Date baslangicTarih) {
		this.baslangicTarih = baslangicTarih;
	}

	public Date getBitisTarih() {
		return bitisTarih;
	}

	public void setBitisTarih(Date bitisTarih) {
		this.bitisTarih = bitisTarih;
	}

	public CstCinsiyet getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(CstCinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public SayfalamaModel<KisiModel> getKisiListesi() {
		return kisiListesi;
	}

	private List<SelectItem> ilListesi = null;
	public List<SelectItem> getIlListesi() 
	throws NviServiceException {
		if (ilListesi == null) {
			List<IlModel> iller = IlListeleme.ilListesiGetir();
			List<SelectItem> secimlikIller = new ArrayList<SelectItem>();
			
			secimlikIller.add(new SelectItem("0", "Seçiniz"));
			for (int i = 0; i < iller.size(); i++) {
				IlModel il = iller.get(i);
				
				secimlikIller.add(new SelectItem(il.getKod(), il.getAd()));
			}
			
			ilListesi = secimlikIller;
		}
		
		return ilListesi;
	}
	
	private List<SelectItem> ilceListesi = null;
	public List<SelectItem> getIlceListesi() 
	throws NviServiceException {
		if (ilceListesi == null) {
			if (ilKodu != 0) {
				List<IlceModel> ilceler = IlceListeleme.ilceListesiGetir(ilKodu);
				List<SelectItem> secimlikIlceler = new ArrayList<SelectItem>();
				
				secimlikIlceler.add(new SelectItem("0", "Seçiniz"));
				for (int i = 0; i < ilceler.size(); i++) {
					IlceModel ilce = ilceler.get(i);
					
					secimlikIlceler.add(new SelectItem(ilce.getKod(), ilce.getAd()));
				}
				
				ilceListesi = secimlikIlceler;
			} else {
				ilceListesi = Collections.emptyList();
			}
		}
		
		return ilceListesi;
	}
	
	private List<SelectItem> cinsiyetListesi = null;
	public List<SelectItem> getCinsiyetListesi() {
		if (cinsiyetListesi == null) {
			List<SelectItem> secimlikCinsiyet = new ArrayList<SelectItem>();
			
			secimlikCinsiyet.add(new SelectItem(CstCinsiyet.BILINMEYEN, "Seçiniz"));
			secimlikCinsiyet.add(new SelectItem(CstCinsiyet.ERKEK, "Erkek"));
			secimlikCinsiyet.add(new SelectItem(CstCinsiyet.KADIN, "Kadýn"));
			
			cinsiyetListesi = secimlikCinsiyet;
		}
		
		return cinsiyetListesi;
	}
	
	public void ilKoduChanged(ValueChangeEvent e) {
		ilceKodu = 0;
	}
	
	public String sorgula() {
		try {
			kisiListesi = 
					KisiListeleme.kisiListele(ilceKodu, baslangicTarih, bitisTarih, cinsiyet);
			
			if (kisiListesi.hasHata()) {
				FacesMessage message = new FacesMessage();
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				message.setSummary("KPS Hatasý: ");
				message.setDetail(kisiListesi.getHata().toString());
				
				FacesContext.getCurrentInstance().addMessage("", message);
				
				return null;
			} else {
				if (kisiListesi.getList().size() == 0) {
					FacesMessage message = new FacesMessage();
					message.setSeverity(FacesMessage.SEVERITY_ERROR);
					message.setDetail("Kayýt Bulunamadý.");
					
					FacesContext.getCurrentInstance().addMessage("", message);
					
					return null;
				}
				
				return "sonuc";
			}
		} catch (Throwable t) {
			t.printStackTrace();
			
			FacesMessage message = new FacesMessage();
			message.setSeverity(FacesMessage.SEVERITY_FATAL);
			message.setSummary("Beklenmeyen Hata: ");
			message.setDetail(t.getMessage());
			
			FacesContext.getCurrentInstance().addMessage("", message);
			
			return null;
		}
	}
	
	public String sayfala() {
		try {
			SayfalamaModel<KisiModel> newKisiListesi = 
					KisiListeleme.kisiListele(kisiListesi);
			
			if (newKisiListesi.hasHata()) {
				FacesMessage message = new FacesMessage();
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				message.setSummary("KPS Hatasý: ");
				message.setDetail(kisiListesi.getHata().toString());
				
				FacesContext.getCurrentInstance().addMessage("", message);
			} else {
				if (newKisiListesi.getList().size() == 0) {
					FacesMessage message = new FacesMessage();
					message.setSeverity(FacesMessage.SEVERITY_ERROR);
					message.setDetail("Baþka Kayýt Bulunamadý.");
					
					FacesContext.getCurrentInstance().addMessage("", message);
				} else {
					kisiListesi = newKisiListesi;
				}
			}
		} catch (Throwable t) {
			t.printStackTrace();
			
			FacesMessage message = new FacesMessage();
			message.setSeverity(FacesMessage.SEVERITY_FATAL);
			message.setSummary("Beklenmeyen Hata: ");
			message.setDetail(t.getMessage());
			
			FacesContext.getCurrentInstance().addMessage("", message);
		}
		
		return null;
	}
	
}
