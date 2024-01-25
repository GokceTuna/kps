
package tr.gov.nvi.kpsv2.samples.ui.services.controller;

import tr.gov.nvi.kpsv2.BilesikKutuk;
import tr.gov.nvi.kpsv2.model.BilesikKutukModel;
import tr.gov.nvi.kpsv2.samples.ui.error.DlgError;
import tr.gov.nvi.kpsv2.samples.ui.services.DlgBilesikKutukKisiSorgula;
import tr.gov.nvi.kpsv2.ws.client.exceptions.NviServiceException;
import foxtrot.Task;
import foxtrot.Worker;
import java.awt.Cursor;


public class BilesikKutukKisiSorgulaController {
	DlgBilesikKutukKisiSorgula ui;

	public BilesikKutukKisiSorgulaController(DlgBilesikKutukKisiSorgula ui) {
		super();
		
		this.ui = ui;
	}

	public void kisiSorgula(final long kimlikNo) {
		try {
                    if (ui != null)
			{
				ui.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			}
                    
			BilesikKutukModel kutukBilgisi = (BilesikKutukModel)Worker.post(
					new Task() {
						@Override
						public Object run() throws Exception {
							return BilesikKutuk.BilesikKutukBilgileriSorgula(kimlikNo);
						}
					});
			
			if (kutukBilgisi.hasHata()) {
				throw new NviServiceException(kutukBilgisi.getHata().toString());
			} else {
				ui.setKutukBilgisi(kutukBilgisi);
			}
		} catch (Throwable t) {
			ui.setKutukBilgisi(null);
			
			new DlgError(ui, t).setVisible(true);
		}
	}
	
}
