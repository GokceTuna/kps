
package tr.gov.nvi.kpsv2.samples.ui.services;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import tr.gov.nvi.kpsv2.model.IlModel;
import tr.gov.nvi.kpsv2.model.IlceModel;
import tr.gov.nvi.kpsv2.model.KisiModel;
import tr.gov.nvi.kpsv2.model.SayfalamaModel;
import tr.gov.nvi.kpsv2.samples.ui.error.DlgError;
import tr.gov.nvi.kpsv2.samples.ui.services.controller.IlIlceController;
import tr.gov.nvi.kpsv2.samples.ui.services.controller.KisiListesiSorgulaController;
import tr.gov.nvi.kpsv2.ws.client.exceptions.NviServiceException;
import tr.gov.nvi.kpsv2.ws.kisilistele.CstCinsiyet;

public class DlgKisiListesiSorgula extends JDialog {
	private static final long serialVersionUID = 1L;

	private javax.swing.JPanel cpKisiListesiSorgula = null;

	private JPanel pnlSorguKriterleri = null;
	private JPanel pnlSonuclar = null;
	private JPanel pnlButtons = null;
	private JButton btnSorgula = null;
	private JButton btnKapat = null;
	private JComboBox cmbIlListesi = null;
	private JLabel lblIl = null;
	private JLabel lblIlce = null;
	private JComboBox cmbIlceListesi = null;
	private JLabel lblBaslangicTarihi = null;
	private JFormattedTextField txtBaslangicTarihi = null;
	private JLabel lblBitisTarihi = null;
	private JFormattedTextField txtBitisTarihi = null;
	private JLabel lblCinsiyet = null;
	private JComboBox cmbCinsiyet = null;
	private JTable tblKisiListesi = null;
	private JScrollPane spKisiListesi = null;
	private JPanel pnlSayfa = null;
	private JLabel lblSayfaBilgisi = null;
	private JButton btnSonrakiSayfa = null;
	
	private KisiListesiSorgulaController controller = new KisiListesiSorgulaController(this);	
	
	/**
	 * @throws java.awt.HeadlessException
	 */
	public DlgKisiListesiSorgula() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param owner
	 * @throws java.awt.HeadlessException
	 */
	public DlgKisiListesiSorgula(Dialog owner) throws HeadlessException {
		super(owner);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param owner
	 * @param modal
	 * @throws java.awt.HeadlessException
	 */
	public DlgKisiListesiSorgula(Dialog owner, boolean modal)
			throws HeadlessException {
		super(owner, modal);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param owner
	 * @throws java.awt.HeadlessException
	 */
	public DlgKisiListesiSorgula(Frame owner) throws HeadlessException {
		super(owner);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param owner
	 * @param modal
	 * @throws java.awt.HeadlessException
	 */
	public DlgKisiListesiSorgula(Frame owner, boolean modal)
			throws HeadlessException {
		super(owner, modal);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @throws java.awt.HeadlessException
	 */
	public DlgKisiListesiSorgula(Dialog owner, String title)
			throws HeadlessException {
		super(owner, title);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @throws java.awt.HeadlessException
	 */
	public DlgKisiListesiSorgula(Dialog owner, String title, boolean modal)
			throws HeadlessException {
		super(owner, title, modal);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @throws java.awt.HeadlessException
	 */
	public DlgKisiListesiSorgula(Frame owner, String title)
			throws HeadlessException {
		super(owner, title);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @throws java.awt.HeadlessException
	 */
	public DlgKisiListesiSorgula(Frame owner, String title, boolean modal)
			throws HeadlessException {
		super(owner, title, modal);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @param gc
	 * @throws java.awt.HeadlessException
	 */
	public DlgKisiListesiSorgula(Dialog owner, String title, boolean modal,
			GraphicsConfiguration gc) throws HeadlessException {
		super(owner, title, modal, gc);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @param gc
	 */
	public DlgKisiListesiSorgula(Frame owner, String title, boolean modal,
			GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		// TODO Auto-generated constructor stub
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setTitle("Kiþi Listesi Sorgula");
		this.setSize(573, 427);
		this.setModal(true);
		this.setContentPane(getCpKisiListesiSorgula());
		this.getRootPane().setDefaultButton(btnSorgula);
		this.setLocationRelativeTo(getOwner());
	}
	/**
	 * This method initializes cpKisiListesiSorgula
	 * 
	 * @return javax.swing.JPanel
	 */
	private javax.swing.JPanel getCpKisiListesiSorgula() {
		if(cpKisiListesiSorgula == null) {
			cpKisiListesiSorgula = new javax.swing.JPanel();
			cpKisiListesiSorgula.setLayout(new BorderLayout());
			cpKisiListesiSorgula.add(getPnlSorguKriterleri(), java.awt.BorderLayout.NORTH);
			cpKisiListesiSorgula.add(getPnlSonuclar(), java.awt.BorderLayout.CENTER);
			cpKisiListesiSorgula.add(getPnlButtons(), java.awt.BorderLayout.SOUTH);
		}
		return cpKisiListesiSorgula;
	}
	/**
	 * This method initializes pnlSorguKriterleri	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getPnlSorguKriterleri() {
		if (pnlSorguKriterleri == null) {
			lblCinsiyet = new JLabel();
			lblBitisTarihi = new JLabel();
			lblBaslangicTarihi = new JLabel();
			lblIlce = new JLabel();
			lblIl = new JLabel();
			GridBagConstraints gridBagConstraints45 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints46 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints47 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints48 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints49 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints50 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints51 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints52 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints53 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints54 = new GridBagConstraints();
			pnlSorguKriterleri = new JPanel();
			pnlSorguKriterleri.setLayout(new GridBagLayout());
			pnlSorguKriterleri.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED), "Sorgu Kriterleri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null));
			gridBagConstraints45.weightx = 1.0;
			gridBagConstraints45.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints45.insets = new java.awt.Insets(2,0,2,0);
			lblIlce.setText("Ýlçe Adý");
			gridBagConstraints46.weightx = 1.0;
			gridBagConstraints46.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints46.gridwidth = 0;
			gridBagConstraints46.insets = new java.awt.Insets(2,0,2,0);
			lblIl.setText("Ýl Adý");
			lblBaslangicTarihi.setText("Baþlangýç Tarihi");
			gridBagConstraints47.weightx = 1.0;
			gridBagConstraints47.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints47.insets = new java.awt.Insets(2,0,2,0);
			lblBitisTarihi.setText("Bitiþ Tarihi");
			gridBagConstraints48.weightx = 1.0;
			gridBagConstraints48.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints48.gridwidth = 0;
			gridBagConstraints48.insets = new java.awt.Insets(2,0,2,0);
			lblCinsiyet.setText("Cinsiyet");
			gridBagConstraints49.weightx = 1.0;
			gridBagConstraints49.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints49.insets = new java.awt.Insets(2,0,2,0);
			gridBagConstraints50.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints50.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints51.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints51.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints52.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints52.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints53.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints53.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints54.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints54.insets = new java.awt.Insets(0,2,0,2);
			pnlSorguKriterleri.add(lblIl, gridBagConstraints50);
			pnlSorguKriterleri.add(getCmbIlListesi(), gridBagConstraints45);
			pnlSorguKriterleri.add(lblIlce, gridBagConstraints53);
			pnlSorguKriterleri.add(getCmbIlceListesi(), gridBagConstraints46);
			pnlSorguKriterleri.add(lblBaslangicTarihi, gridBagConstraints51);
			pnlSorguKriterleri.add(getTxtBaslangicTarihi(), gridBagConstraints47);
			pnlSorguKriterleri.add(lblBitisTarihi, gridBagConstraints54);
			pnlSorguKriterleri.add(getTxtBitisTarihi(), gridBagConstraints48);
			pnlSorguKriterleri.add(lblCinsiyet, gridBagConstraints52);
			pnlSorguKriterleri.add(getCmbCinsiyet(), gridBagConstraints49);
		}
		return pnlSorguKriterleri;
	}
	/**
	 * This method initializes pnlSonuclar	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getPnlSonuclar() {
		if (pnlSonuclar == null) {
			pnlSonuclar = new JPanel();
			pnlSonuclar.setLayout(new BorderLayout());
			pnlSonuclar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED), "Kiþi Listesi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null));
			pnlSonuclar.add(getSpKisiListesi(), java.awt.BorderLayout.CENTER);
			pnlSonuclar.add(getPnlSayfa(), java.awt.BorderLayout.SOUTH);
		}
		return pnlSonuclar;
	}
	/**
	 * This method initializes pnlButtons	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getPnlButtons() {
		if (pnlButtons == null) {
			FlowLayout flowLayout44 = new FlowLayout();
			pnlButtons = new JPanel();
			pnlButtons.setLayout(flowLayout44);
			flowLayout44.setAlignment(java.awt.FlowLayout.RIGHT);
			flowLayout44.setHgap(3);
			flowLayout44.setVgap(3);
			pnlButtons.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED));
			pnlButtons.add(getBtnSorgula(), null);
			pnlButtons.add(getBtnKapat(), null);
		}
		return pnlButtons;
	}
	/**
	 * This method initializes btnSorgula	
	 * 	
	 * @return javax.swing.JButton	
	 */    
	private JButton getBtnSorgula() {
		if (btnSorgula == null) {
			btnSorgula = new JButton();
			btnSorgula.setText("Sorgula");
			btnSorgula.setPreferredSize(new java.awt.Dimension(85,26));
			btnSorgula.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					try {
						IlceBilgisiItem ilceItem = (IlceBilgisiItem) cmbIlceListesi.getSelectedItem();
						CstCinsiyet cinsiyet = (CstCinsiyet) cmbCinsiyet.getSelectedItem();
						Date baslangicTarihi = (Date) txtBaslangicTarihi.getValue();
						Date bitisTarihi = (Date) txtBitisTarihi.getValue();
						
						if (ilceItem == null) {
							throw new IllegalArgumentException("Ýlçe Seçiniz.");
						}
						
						if (baslangicTarihi.compareTo(bitisTarihi) == 1) {
							throw new IllegalArgumentException("Baþlangýç Tarihi Bitiþ Tarihinden Büyük Olamaz.");
						}

						controller.kisiListesiSorgula(ilceItem.ilceBilgisi, baslangicTarihi, bitisTarihi, cinsiyet);
					} catch (Throwable t) {
						new DlgError(DlgKisiListesiSorgula.this, t).setVisible(true);
					}
				}
			});
		}
		return btnSorgula;
	}
	/**
	 * This method initializes btnKapat	
	 * 	
	 * @return javax.swing.JButton	
	 */    
	private JButton getBtnKapat() {
		if (btnKapat == null) {
			btnKapat = new JButton();
			btnKapat.setText("Kapat");
			btnKapat.setPreferredSize(new java.awt.Dimension(85,26));
			btnKapat.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					DlgKisiListesiSorgula.this.setVisible(false);
				}
			});
		}
		return btnKapat;
	}
	/**
	 * This method initializes cmbIlListesi	
	 * 	
	 * @return javax.swing.JComboBox	
	 */    
	private JComboBox getCmbIlListesi() {
		if (cmbIlListesi == null) {
			cmbIlListesi = new JComboBox();
			cmbIlListesi.setModel(new IlComboboxModel());
			cmbIlListesi.setSelectedItem(null);
			cmbIlListesi.addItemListener(new java.awt.event.ItemListener() { 
				public void itemStateChanged(java.awt.event.ItemEvent e) {    
					if (e.getStateChange() == ItemEvent.SELECTED) {
						((IlceComboboxModel) cmbIlceListesi.getModel()).setIl((IlBilgisiItem) e.getItem());
					}
				}
			});
			cmbIlListesi.setPreferredSize(new java.awt.Dimension(31,20));
			
		}
		
		return cmbIlListesi;
	}
	
	/**
	 * This method initializes cmbIlceListesi	
	 * 	
	 * @return javax.swing.JComboBox	
	 */    
	private JComboBox getCmbIlceListesi() {
		if (cmbIlceListesi == null) {
			cmbIlceListesi = new JComboBox();
			cmbIlceListesi.setModel(new IlceComboboxModel());
			cmbIlceListesi.setSelectedItem(null);
			cmbIlceListesi.setPreferredSize(new java.awt.Dimension(31,20));
		}
		return cmbIlceListesi;
	}
	/**
	 * This method initializes txtBaslangicTarihi	
	 * 	
	 * @return javax.swing.JFormattedTextField	
	 */    
	private JFormattedTextField getTxtBaslangicTarihi() {
		if (txtBaslangicTarihi == null) {
			txtBaslangicTarihi = new JFormattedTextField();
			txtBaslangicTarihi.setFormatterFactory(new JFormattedTextField.AbstractFormatterFactory() {
				public AbstractFormatter getFormatter(JFormattedTextField tf) {
					return new JFormattedTextField.AbstractFormatter() {
						private static final long serialVersionUID = 1L;
						
						private final DateFormat dateFormat = SimpleDateFormat.getDateInstance(SimpleDateFormat.SHORT);
						
						public Object stringToValue(String text) throws ParseException {
							return dateFormat.parse(text);
						}

						public String valueToString(Object value) throws ParseException {
							return value == null ? null : dateFormat.format(value);
						}
					};
				}
			});
			txtBaslangicTarihi.setValue(new Date());
		}
		return txtBaslangicTarihi;
	}
	/**
	 * This method initializes txtBitisTarihi	
	 * 	
	 * @return javax.swing.JFormattedTextField	
	 */    
	private JFormattedTextField getTxtBitisTarihi() {
		if (txtBitisTarihi == null) {
			txtBitisTarihi = new JFormattedTextField();
			txtBitisTarihi.setFormatterFactory(new JFormattedTextField.AbstractFormatterFactory() {
				public AbstractFormatter getFormatter(JFormattedTextField tf) {
					return new JFormattedTextField.AbstractFormatter() {
						private static final long serialVersionUID = 1L;
						
						private final DateFormat dateFormat = SimpleDateFormat.getDateInstance(SimpleDateFormat.SHORT);
						
						public Object stringToValue(String text) throws ParseException {
							return dateFormat.parse(text);
						}

						public String valueToString(Object value) throws ParseException {
							return value == null ? null : dateFormat.format(value);
						}
					};
				}
			});
			txtBitisTarihi.setValue(new Date());
		}
		return txtBitisTarihi;
	}
	/**
	 * This method initializes cmbCinsiyet	
	 * 	
	 * @return javax.swing.JComboBox	
	 */    
	private JComboBox getCmbCinsiyet() {
		if (cmbCinsiyet == null) {
			cmbCinsiyet = new JComboBox();
			cmbCinsiyet.setModel(new CinsiyetComboboxModel());
			cmbCinsiyet.setPreferredSize(new java.awt.Dimension(31,20));
		}
		return cmbCinsiyet;
	}
	
	/**
	 * This method initializes tblKisiListesi	
	 * 	
	 * @return javax.swing.JTable	
	 */    
	private JTable getTblKisiListesi() {
		if (tblKisiListesi == null) {
			tblKisiListesi = new JTable();
			tblKisiListesi.setModel(new KisiBilgisiTableModel());
			tblKisiListesi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		}
		return tblKisiListesi;
	}
	/**
	 * This method initializes spKisiListesi	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */    
	private JScrollPane getSpKisiListesi() {
		if (spKisiListesi == null) {
			spKisiListesi = new JScrollPane();
			spKisiListesi.setViewportView(getTblKisiListesi());
		}
		return spKisiListesi;
	}
	/**
	 * This method initializes pnlSayfa	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getPnlSayfa() {
		if (pnlSayfa == null) {
			lblSayfaBilgisi = new JLabel();
			GridBagConstraints gridBagConstraints55 = new GridBagConstraints();
			pnlSayfa = new JPanel();
			pnlSayfa.setLayout(new GridBagLayout());
			lblSayfaBilgisi.setText("");
			gridBagConstraints55.weightx = 1.0D;
			gridBagConstraints55.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints55.insets = new java.awt.Insets(2,0,2,2);
			pnlSayfa.add(lblSayfaBilgisi, new GridBagConstraints());
			pnlSayfa.add(getBtnSonrakiSayfa(), gridBagConstraints55);
		}
		return pnlSayfa;
	}
	/**
	 * This method initializes btnSonrakiSayfa	
	 * 	
	 * @return javax.swing.JButton	
	 */    
	private JButton getBtnSonrakiSayfa() {
		if (btnSonrakiSayfa == null) {
			btnSonrakiSayfa = new JButton();
			btnSonrakiSayfa.setText(">>");
			btnSonrakiSayfa.setVisible(true);
			btnSonrakiSayfa.setEnabled(false);
			btnSonrakiSayfa.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					controller.sonrakiSayfa();
				}
			});
		}
		return btnSonrakiSayfa;
	}
	
	public void setKisiListesi(SayfalamaModel<KisiModel> kisiBilgisiSayfasi) {
		KisiBilgisiTableModel kisiBilgisiTableModel = (KisiBilgisiTableModel) tblKisiListesi.getModel();
		
		if (kisiBilgisiSayfasi != null) {
			if (kisiBilgisiSayfasi.getList().size() == 0) {
				btnSonrakiSayfa.setEnabled(false);
			} else {
				btnSonrakiSayfa.setEnabled(true);
				kisiBilgisiTableModel.setKisiBilgileri(kisiBilgisiSayfasi.getList());
			}
		} else {
			btnSonrakiSayfa.setEnabled(false);
			kisiBilgisiTableModel.setKisiBilgileri(null);
		}
	}

	private class KisiBilgisiTableModel extends AbstractTableModel {
		private static final long serialVersionUID = 1L;
		
		private final String[] arrColumns = new String[] {
			"T.C. Kimlik No", "Adý Soyadý", "Baba Adý Soyadý", "Anne Adý Soyadý",
			"Doðum Yeri", "Doðum Tarihi", "Cinsiyeti", "Durumu", "Medeni Hali",
			"Ölüm Tarihi", "Ýl Adý", "Ýlçe Adý", "Mahalle / Köy", 
			"Cilt No", "Aile Sýra No", "Birey Sýra No"
		};
		
		private final Class<?>[] arrColumnClasses = new Class[] {
			Long.class, String.class, String.class, String.class, 
			String.class, String.class, String.class, String.class, String.class, 
			String.class, String.class, String.class, String.class, 
			Integer.class, Integer.class, Integer.class
		};
		private List<KisiModel> kisiBilgileri = new ArrayList<KisiModel>();
		

		/* (non-Javadoc)
		 * @see javax.swing.table.TableModel#getColumnCount()
		 */
		public int getColumnCount() {
			return arrColumns.length;
		}

		/* (non-Javadoc)
		 * @see javax.swing.table.TableModel#getColumnName(int)
		 */
		public String getColumnName(int column) {
			return arrColumns[column];
		}
		
		/* (non-Javadoc)
		 * @see javax.swing.table.TableModel#getRowCount()
		 */
		public int getRowCount() {
			return kisiBilgileri == null ? 0 : kisiBilgileri.size();
		}

		/* (non-Javadoc)
		 * @see javax.swing.table.TableModel#getColumnClass(int)
		 */
		public Class<?> getColumnClass(int columnIndex) {
			return arrColumnClasses[columnIndex];
		}
		
		/* (non-Javadoc)
		 * @see javax.swing.table.TableModel#isCellEditable(int, int)
		 */
		public boolean isCellEditable(int rowIndex, int columnIndex) {
			return false;
		}
		
		/* (non-Javadoc)
		 * @see javax.swing.table.TableModel#getValueAt(int, int)
		 */
		public Object getValueAt(int rowIndex, int columnIndex) {
			KisiModel kisiBilgisi = kisiBilgileri.get(rowIndex);
			
			Object value = null;
			
			try {
			switch (columnIndex) {
				case 0:
					value = kisiBilgisi.getTcKimlikNo();
					break;
				case 1:
					value = kisiBilgisi.getAd() + " " + kisiBilgisi.getSoyad();
					break;
				case 2:
					value = kisiBilgisi.getBabaAd();
					break;
				case 3:
					value = kisiBilgisi.getAnneAd();
					break;
				case 4:
					value = kisiBilgisi.getDogumYer();
					break;
				case 5:
					value = kisiBilgisi.getDogumTarih();
					break;
				case 6:
					value = kisiBilgisi.getCinsiyet().getAciklama();
					break;
				case 7:
					value = kisiBilgisi.getDurum().getAciklama();
					break;
				case 8:
					value = kisiBilgisi.getMedeniHal().getAciklama();
					break;
				case 9:
					value = kisiBilgisi.getOlumTarih();
					break;
				case 10:
					value = kisiBilgisi.getKayitYerIl().getAciklama();
					break;
				case 11:
					value = kisiBilgisi.getKayitYerIlce().getAciklama();
					break;
				case 12:
					value = kisiBilgisi.getKayitYerCilt().getAciklama();
					break;
				case 13:
					value = String.valueOf(kisiBilgisi.getKayitYerCilt().getKod());
					break;
				case 14:
					value = String.valueOf(kisiBilgisi.getAileSiraNo());
					break;
				case 15:
					value = String.valueOf(kisiBilgisi.getBireySiraNo());
					break;
			}
			} catch (Throwable t) {
				t.printStackTrace();
			}

			if (value != null && value instanceof String) {
				value = ((String) value).trim();
			}
			
			return value;
		}
		
		void setKisiBilgileri(List<KisiModel> kisiBilgileri) {
			if (kisiBilgileri != null) {
				this.kisiBilgileri = kisiBilgileri;
			} else {
				this.kisiBilgileri = null;
			}
			
			fireTableDataChanged();
		}
	}
	
	private class CinsiyetComboboxModel extends DefaultComboBoxModel {
		private static final long serialVersionUID = 1L;

		CinsiyetComboboxModel() {
			super();
			
			initialize();
		}
		
		private void initialize() {
			addElement(CstCinsiyet.BILINMEYEN);
			addElement(CstCinsiyet.ERKEK);
			addElement(CstCinsiyet.KADIN);
		}
	}
	
	private class IlComboboxModel extends DefaultComboBoxModel {
		private static final long serialVersionUID = 1L;
		
		private IlIlceController ilIlceController = 
			new IlIlceController(isVisible() ? DlgKisiListesiSorgula.this : getOwner());
		
		IlComboboxModel() {
			super();
			
			initialize();
		}
		
		private void initialize() {
			try {
				List<IlModel> ilListesi = ilIlceController.getIlListesi();
				
				for (int i = 0; i < ilListesi.size(); i++) {
					addElement(new IlBilgisiItem(ilListesi.get(i)));
				}
				
			} catch (NviServiceException sEx) {
				new DlgError(DlgKisiListesiSorgula.this, sEx).setVisible(true);
			}
		}
		
	}
	
	private class IlceComboboxModel extends DefaultComboBoxModel {
		private static final long serialVersionUID = 1L;
		
		private IlIlceController ilIlceController = 
			new IlIlceController(DlgKisiListesiSorgula.this);
		
		IlceComboboxModel() {
			super();
		}
		
		void setIl(IlBilgisiItem ilBilgisiItem) {
			removeAllElements();
			
			try {
				List<IlceModel> ilceListesi = 
					ilIlceController.getIlceListesiFor(ilBilgisiItem.ilBilgisi);
				
				for (int i = 0; i < ilceListesi.size(); i++) {
					addElement(new IlceBilgisiItem(ilceListesi.get(i)));
				}
			} catch (NviServiceException sEx) {
				new DlgError(DlgKisiListesiSorgula.this, sEx).setVisible(true);
			}
		}
		
	}
	
	private class IlBilgisiItem {
		private IlModel ilBilgisi;
		
		IlBilgisiItem(IlModel ilBilgisi) {
			super();
			
			this.ilBilgisi = ilBilgisi;
		}
		
		public String toString() {
			return ilBilgisi.getAd();
		}
		
	}

	private class IlceBilgisiItem {
		private IlceModel ilceBilgisi;
		
		IlceBilgisiItem(IlceModel ilceBilgisi) {
			super();
			
			this.ilceBilgisi = ilceBilgisi;
		}
		
		public String toString() {
			return ilceBilgisi.getAd();
		}
		
	}
	
}  //  @jve:decl-index=0:visual-constraint="10,10"
