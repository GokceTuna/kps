package tr.gov.nvi.kpsv2.sample.listeners;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import tr.gov.nvi.kpsv2.sample.beans.AyarlarBean;

public class ConfigurationCheck implements PhaseListener {
	private static final long serialVersionUID = 1L;

	public void afterPhase(PhaseEvent event) {
		FacesContext ctx = event.getFacesContext();
		Application app = ctx.getApplication();
		
		boolean configPage = ctx.getViewRoot().getViewId().lastIndexOf("ayarlar") > -1;
		
		if (!configPage) {
			AyarlarBean configBean = 
					(AyarlarBean)app.evaluateExpressionGet(ctx, "#{ayarlarBean}", AyarlarBean.class);
			
			if (configBean == null || configBean.isAyarlandi() == false) {
				app.getNavigationHandler().handleNavigation(ctx, null, "ayarlar");
			}
		}
	}

	public void beforePhase(PhaseEvent event) {
		
	}

	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}

}
