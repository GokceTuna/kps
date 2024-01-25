package tr.gov.nvi.kpsv2.model;

import java.io.Serializable;

public class BaseModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private ParametreModel hata;

	public ParametreModel getHata() {
		return hata;
	}

	public void setHata(ParametreModel hata) {
		this.hata = hata;
	}
	
	public boolean hasHata() {
		return hata != null;
	}
	
}
