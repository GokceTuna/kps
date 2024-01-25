package tr.gov.nvi.kpsv2.sample.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import tr.gov.nvi.kpsv2.IlListeleme;
import tr.gov.nvi.kpsv2.model.IlModel;

public class IlListelemeBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<IlModel> ilListesi;
	
	public IlListelemeBean() {
		
	}

	public List<IlModel> getIlListesi() {
		if (ilListesi == null) {
			try {
				ilListesi = IlListeleme.ilListesiGetir();
			} catch (Throwable t) {
				t.printStackTrace();
				
				FacesMessage message = new FacesMessage();
				message.setSeverity(FacesMessage.SEVERITY_FATAL);
				message.setSummary("Beklenmeyen Hata: ");
				message.setDetail(t.getMessage());
				
				FacesContext.getCurrentInstance().addMessage("", message);
			}
		}
		
		return ilListesi;
	}
	
}
