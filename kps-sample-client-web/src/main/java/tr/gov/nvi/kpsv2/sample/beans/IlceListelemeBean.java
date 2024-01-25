package tr.gov.nvi.kpsv2.sample.beans;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import tr.gov.nvi.kpsv2.IlceListeleme;
import tr.gov.nvi.kpsv2.model.IlceModel;

public class IlceListelemeBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<IlceModel> ilceListesi;
	private Integer ilKodu;
	private String ilAdi;
	private boolean initialized = false;
	
	public IlceListelemeBean() {
		
	}

	public List<IlceModel> getIlceListesi() {
		initialize();
		
		if (ilceListesi == null) {
			try {
				ilceListesi = IlceListeleme.ilceListesiGetir(ilKodu);
			} catch (Throwable t) {
				t.printStackTrace();
				
				FacesMessage message = new FacesMessage();
				message.setSeverity(FacesMessage.SEVERITY_FATAL);
				message.setSummary("Beklenmeyen Hata: ");
				message.setDetail(t.getMessage());
				
				FacesContext.getCurrentInstance().addMessage("", message);
			}
		}
		
		return ilceListesi;
	}

	public Integer getIlKodu() {
		initialize();
		
		return ilKodu;
	}

	public String getIlAdi() {
		initialize();
		
		return ilAdi;
	}

	private void initialize() {
		try {
			if (initialized == false) {
				Map<String, String> requestMap = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap(); 
				String ilKoduString = requestMap.get("ilKodu");
				String ilAdiString = requestMap.get("ilAdi");
				
				this.ilKodu = Integer.valueOf(ilKoduString);
				this.ilAdi = ilAdiString;
				
				this.initialized = true;
			}
		} catch (NumberFormatException nfEx) {
			this.ilKodu = Integer.valueOf(0);
			this.ilAdi = "";
		}
	}
}
