package tr.gov.nvi.kpsv2.model;

import java.io.Serializable;

public class ParametreModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int kod;
	private String aciklama;
	
	public int getKod() {
		return kod;
	}
	
	public void setKod(int kod) {
		this.kod = kod;
	}
	
	public String getAciklama() {
		return aciklama;
	}
	
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	@Override
	public String toString() {
		return "[" + kod + "] " + aciklama;
	}
	
}
