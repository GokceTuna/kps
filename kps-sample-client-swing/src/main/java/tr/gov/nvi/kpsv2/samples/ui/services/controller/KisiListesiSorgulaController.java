
package tr.gov.nvi.kpsv2.samples.ui.services.controller;

import java.awt.Cursor;
import java.util.Date;

import tr.gov.nvi.kpsv2.KisiListeleme;
import tr.gov.nvi.kpsv2.model.IlceModel;
import tr.gov.nvi.kpsv2.model.KisiModel;
import tr.gov.nvi.kpsv2.model.SayfalamaModel;
import tr.gov.nvi.kpsv2.samples.ui.error.DlgError;
import tr.gov.nvi.kpsv2.samples.ui.services.DlgKisiListesiSorgula;
import tr.gov.nvi.kpsv2.ws.client.exceptions.NviServiceException;
import tr.gov.nvi.kpsv2.ws.kisilistele.CstCinsiyet;
import foxtrot.Task;
import foxtrot.Worker;

public class KisiListesiSorgulaController {
	private DlgKisiListesiSorgula ui;
	private SayfalamaModel<KisiModel> currentPage;

	public KisiListesiSorgulaController(DlgKisiListesiSorgula ui) {
		super();

		this.ui = ui;
	}

	@SuppressWarnings("unchecked")
	public void kisiListesiSorgula(final IlceModel ilce, final Date baslangicTarih, final Date bitisTarih, final CstCinsiyet cinsiyet) {
		this.currentPage = null;
		
		try {
			if (ui != null)
			{
				ui.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			}
			
			currentPage = (SayfalamaModel<KisiModel>) Worker.post(
				new Task() {
					public Object run() throws Exception {
						return KisiListeleme.kisiListele(ilce.getKod(), baslangicTarih, bitisTarih, cinsiyet);
					}
				});
			
			if (currentPage.hasHata()) {
				throw new NviServiceException(currentPage.getHata().toString());
			} else {
				if (currentPage.getList().size() == 0) {
					throw new NviServiceException("Kayýt bulunamadý.");
				}
				
				ui.setKisiListesi(currentPage);
			}
		} catch (Throwable t) {
			ui.setKisiListesi(null);
			
			new DlgError(ui, t).setVisible(true);
		} finally {
			if (ui != null)
			{
				ui.setCursor(Cursor.getDefaultCursor());
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public void sonrakiSayfa() {
		try {
			if (currentPage == null) {
				throw new IllegalStateException("Lütfen öncelikle Kiþi Sorgulayýnýz...");
			}
			
			if (ui != null)
			{
				ui.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			}
			
			currentPage = (SayfalamaModel<KisiModel>) Worker.post(
				new Task() {
					public Object run() throws Exception {
						return KisiListeleme.kisiListele(currentPage);
					}
				});
				
			if (currentPage.hasHata()) {
				throw new NviServiceException(currentPage.getHata().toString());
			} else {
				if (currentPage.getList().size() == 0) {
					throw new NviServiceException("Baþka kayýt bulunamadý.");
				}
				
				ui.setKisiListesi(currentPage);
			}
		} catch (Throwable t) {
			new DlgError(ui, t).setVisible(true);
		} finally {
			if (ui != null)
			{
				ui.setCursor(Cursor.getDefaultCursor());
			}
		}
	}
	
}
