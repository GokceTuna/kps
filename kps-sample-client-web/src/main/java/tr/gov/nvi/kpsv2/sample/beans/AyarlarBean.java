package tr.gov.nvi.kpsv2.sample.beans;

import java.io.Serializable;

import tr.gov.nvi.kps.sts.NviConfiguration;
import tr.gov.nvi.kps.sts.NviConfigurationItem;

public class AyarlarBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String kpsEndpointUri;
	private String stsEndpointUri;
	private String username;
	private String password;
	
	private boolean ayarlandi;
	
	public AyarlarBean() {
		this.kpsEndpointUri = "https://kpsv2test.nvi.gov.tr/Services/RoutingService.svc";
		this.stsEndpointUri = "https://kimlikdogrulama.nvi.gov.tr/Services/Issuer.svc/IWSTrust13";
		this.username = null;
		this.password = null;
	}
	
	public String getKpsEndpointUri() {
		return kpsEndpointUri;
	}
	
	public void setKpsEndpointUri(String kpsEndpointUri) {
		this.kpsEndpointUri = kpsEndpointUri;
	}
	
	public String getStsEndpointUri() {
		return stsEndpointUri;
	}
	
	public void setStsEndpointUri(String stsEndpointUri) {
		this.stsEndpointUri = stsEndpointUri;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isAyarlandi() {
		return ayarlandi;
	}
	
	public String ayarla() {
		NviConfigurationItem item = new NviConfigurationItem();
		item.setTokenServiceEndpoint(stsEndpointUri);
		item.setUsername(username);
		item.setPassword(password.toCharArray());
		
		NviConfiguration.Instance.clear();
		NviConfiguration.Instance.addConfiguration(kpsEndpointUri, item);
		
		ayarlandi = true;
		
		return "menu";
	}
	
}
