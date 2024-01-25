
package tr.gov.nvi.kpsv2.samples.ui.services.controller;

import tr.gov.nvi.kpsv2.KisiSorgulama;
import tr.gov.nvi.kpsv2.model.KisiModel;
import tr.gov.nvi.kpsv2.samples.ui.error.DlgError;
import tr.gov.nvi.kpsv2.samples.ui.services.DlgKimlikNodanKisiSorgula;
import tr.gov.nvi.kpsv2.ws.client.exceptions.NviServiceException;

import java.awt.Cursor;

import foxtrot.Task;
import foxtrot.Worker;


public class KimlikNodanKisiSorgulaController {
	DlgKimlikNodanKisiSorgula ui;

	public KimlikNodanKisiSorgulaController(DlgKimlikNodanKisiSorgula ui) {
		super();
		
		this.ui = ui;
	}

	public void kisiSorgula(final long kimlikNo) {
		try {
			if (ui != null)
			{
				ui.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			}
			
			KisiModel kisiBilgisi = (KisiModel)Worker.post(
					new Task() {
						@Override
						public Object run() throws Exception {
							return KisiSorgulama.kisiBilgisiSorgula(kimlikNo);
						}
					});
			
			if (kisiBilgisi.hasHata()) {
				throw new NviServiceException(kisiBilgisi.getHata().toString());
			} else {
				ui.setKisiBilgisi(kisiBilgisi);
			}
		} catch (Throwable t) {
			ui.setKisiBilgisi(null);
			
			new DlgError(ui, t).setVisible(true);
		} finally {
			if (ui != null)
			{
				ui.setCursor(Cursor.getDefaultCursor());
			}
		}
	}
	
}
