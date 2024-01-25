package tr.gov.nvi.kpsv2.sample.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import tr.gov.nvi.kpsv2.KisiSorgulama;
import tr.gov.nvi.kpsv2.model.KisiModel;

public class KisiSorgulamaBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long tcKimlikNo;
	private KisiModel kisiBilgisi;
	
	public KisiSorgulamaBean() {
		this.tcKimlikNo = 27085520100L;
	}

	public long getTcKimlikNo() {
		return tcKimlikNo;
	}

	public void setTcKimlikNo(long tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}
	
	public KisiModel getKisiBilgisi() {
		return kisiBilgisi;
	}

	public void setKisiBilgisi(KisiModel kisiBilgisi) {
		this.kisiBilgisi = kisiBilgisi;
	}

	public String sorgula() {
		try {
			kisiBilgisi = 
					KisiSorgulama.kisiBilgisiSorgula(tcKimlikNo);
			
			if (kisiBilgisi.hasHata()) {
				FacesMessage message = new FacesMessage();
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				message.setSummary("KPS Hatasý: ");
				message.setDetail(kisiBilgisi.getHata().toString());
				
				FacesContext.getCurrentInstance().addMessage("", message);
				
				return null;
			} else {
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
	
}
