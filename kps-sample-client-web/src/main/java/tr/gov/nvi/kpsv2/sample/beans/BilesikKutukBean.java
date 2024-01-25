package tr.gov.nvi.kpsv2.sample.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import tr.gov.nvi.kpsv2.BilesikKutuk;
import tr.gov.nvi.kpsv2.model.BilesikKutukModel;

public class BilesikKutukBean implements Serializable {
    private static final long serialVersionUID = 1L;
	
    private long tcKimlikNo;
    private BilesikKutukModel bilesikKutukBilgisi;

    public BilesikKutukBean() {
        this.tcKimlikNo = 27085520100L;
    }

    public long getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(long tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public BilesikKutukModel getBilesikKutukBilgisi() {
        return bilesikKutukBilgisi;
    }

    public void setBilesikKutukBilgisi(BilesikKutukModel bilesikKutukBilgisi) {
        this.bilesikKutukBilgisi = bilesikKutukBilgisi;
    }
    
    public String sorgula() {
		try {
			bilesikKutukBilgisi = BilesikKutuk.BilesikKutukBilgileriSorgula(tcKimlikNo);
			
			if (bilesikKutukBilgisi.hasHata()) {
				FacesMessage message = new FacesMessage();
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				message.setSummary("KPS Hatasý: ");
				message.setDetail(bilesikKutukBilgisi.getHata().toString());
				
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
