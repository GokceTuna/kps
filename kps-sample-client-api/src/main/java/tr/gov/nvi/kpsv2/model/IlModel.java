package tr.gov.nvi.kpsv2.model;

public class IlModel extends BaseModel {
	private static final long serialVersionUID = 1L;
	
	private int kod;
	private String ad;
	
	public int getKod() {
		return kod;
	}
	
	public void setKod(int kod) {
		this.kod = kod;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
}
