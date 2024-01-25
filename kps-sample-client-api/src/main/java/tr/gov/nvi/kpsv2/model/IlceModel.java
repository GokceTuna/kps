package tr.gov.nvi.kpsv2.model;

public class IlceModel extends BaseModel {
	private static final long serialVersionUID = 1L;
	
	private int ilKod;
	private int kod;
	private String ad;
	
	public int getIlKod() {
		return ilKod;
	}
	
	public void setIlKod(int ilKod) {
		this.ilKod = ilKod;
	}
	
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
