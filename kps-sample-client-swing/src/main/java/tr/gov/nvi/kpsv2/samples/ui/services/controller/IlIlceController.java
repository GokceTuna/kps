
package tr.gov.nvi.kpsv2.samples.ui.services.controller;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Window;
import java.util.List;

import javax.swing.SwingUtilities;

import tr.gov.nvi.kpsv2.IlListeleme;
import tr.gov.nvi.kpsv2.IlceListeleme;
import tr.gov.nvi.kpsv2.model.IlModel;
import tr.gov.nvi.kpsv2.model.IlceModel;
import tr.gov.nvi.kpsv2.ws.client.exceptions.NviServiceException;
import foxtrot.Task;
import foxtrot.Worker;


public class IlIlceController {
	private Component ui;
	
	public IlIlceController(Component ui) {
		super();
		
		this.ui = ui;
	}

	@SuppressWarnings("unchecked")
	public List<IlModel> getIlListesi() throws NviServiceException {
		try {
			if (ui != null)
			{
				ui.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			}
			
			return (List<IlModel>)Worker.post(
					new Task() {
						@Override
						public Object run() throws Exception {
							return IlListeleme.ilListesiGetir();
						}
					});
		} catch (Throwable t) {
			throw new NviServiceException(t);
		} finally {
			if (ui != null)
			{
				ui.setCursor(Cursor.getDefaultCursor());
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<IlceModel> getIlceListesiFor(final IlModel il) throws NviServiceException {
		try {
			if (ui != null)
			{
				ui.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			}
			
			return (List<IlceModel>)Worker.post(
					new Task() {
						@Override
						public Object run() throws Exception {
							return IlceListeleme.ilceListesiGetir(il.getKod());
						}
					});
		} catch (Throwable t) {
			throw new NviServiceException(t);
		} finally {
			if (ui != null)
			{
				ui.setCursor(Cursor.getDefaultCursor());
			}
		}
	}
	
}
