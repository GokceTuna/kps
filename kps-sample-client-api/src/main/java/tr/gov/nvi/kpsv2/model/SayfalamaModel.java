package tr.gov.nvi.kpsv2.model;

import java.util.ArrayList;
import java.util.List;

public class SayfalamaModel<T extends BaseModel> extends BaseModel {
	private static final long serialVersionUID = 1L;
	
	private long anahtar;
	private Object kriter;
	private List<T> list;
	
	public SayfalamaModel() {
		this.list = new ArrayList<T>();
	}
	
	public long getAnahtar() {
		return anahtar;
	}
	
	public void setAnahtar(long anahtar) {
		this.anahtar = anahtar;
	}
	
	public Object getKriter() {
		return kriter;
	}
	
	public void setKriter(Object kriter) {
		this.kriter = kriter;
	}
	
	public List<T> getList() {
		return list;
	}
	
}
