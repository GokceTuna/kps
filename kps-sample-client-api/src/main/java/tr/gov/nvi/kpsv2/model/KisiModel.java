package tr.gov.nvi.kpsv2.model;

public class KisiModel extends BaseModel {
	private static final long serialVersionUID = 1L;
	
	private long tcKimlikNo;
	private String ad;
	private String soyad;
	private String anneAd;
	private String babaAd;
	private String dogumYer;
	private TarihModel dogumTarih;
	private ParametreModel cinsiyet;
	private ParametreModel durum;
	private ParametreModel medeniHal;
	private TarihModel olumTarih;
	
	private ParametreModel kayitYerIl;
	private ParametreModel kayitYerIlce;
	private ParametreModel kayitYerCilt;
	private int aileSiraNo;
	private int bireySiraNo;
	
	public long getTcKimlikNo() {
		return tcKimlikNo;
	}
	
	public void setTcKimlikNo(long tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public String getAnneAd() {
		return anneAd;
	}
	
	public void setAnneAd(String anneAd) {
		this.anneAd = anneAd;
	}
	
	public String getBabaAd() {
		return babaAd;
	}
	
	public void setBabaAd(String babaAd) {
		this.babaAd = babaAd;
	}
	
	public String getDogumYer() {
		return dogumYer;
	}
	
	public void setDogumYer(String dogumYer) {
		this.dogumYer = dogumYer;
	}
	
	public TarihModel getDogumTarih() {
		return dogumTarih;
	}
	
	public void setDogumTarih(TarihModel dogumTarih) {
		this.dogumTarih = dogumTarih;
	}
	
	public ParametreModel getCinsiyet() {
		return cinsiyet;
	}
	
	public void setCinsiyet(ParametreModel cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	
	public ParametreModel getDurum() {
		return durum;
	}
	
	public void setDurum(ParametreModel durum) {
		this.durum = durum;
	}
	
	public ParametreModel getMedeniHal() {
		return medeniHal;
	}
	
	public void setMedeniHal(ParametreModel medeniHal) {
		this.medeniHal = medeniHal;
	}
	
	public TarihModel getOlumTarih() {
		return olumTarih;
	}
	
	public void setOlumTarih(TarihModel olumTarih) {
		this.olumTarih = olumTarih;
	}
	
	public ParametreModel getKayitYerIl() {
		return kayitYerIl;
	}
	
	public void setKayitYerIl(ParametreModel kayitYerIl) {
		this.kayitYerIl = kayitYerIl;
	}
	
	public ParametreModel getKayitYerIlce() {
		return kayitYerIlce;
	}
	
	public void setKayitYerIlce(ParametreModel kayitYerIlce) {
		this.kayitYerIlce = kayitYerIlce;
	}
	
	public ParametreModel getKayitYerCilt() {
		return kayitYerCilt;
	}
	
	public void setKayitYerCilt(ParametreModel kayitYerCilt) {
		this.kayitYerCilt = kayitYerCilt;
	}
	
	public int getAileSiraNo() {
		return aileSiraNo;
	}
	
	public void setAileSiraNo(int aileSiraNo) {
		this.aileSiraNo = aileSiraNo;
	}
	
	public int getBireySiraNo() {
		return bireySiraNo;
	}
	
	public void setBireySiraNo(int bireySiraNo) {
		this.bireySiraNo = bireySiraNo;
	}
	
}
