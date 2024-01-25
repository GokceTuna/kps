
package tr.gov.nvi.kpsv2.samples.ui.services;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import tr.gov.nvi.kpsv2.model.KisiModel;
import tr.gov.nvi.kpsv2.samples.ui.services.controller.KimlikNodanKisiSorgulaController;

public class DlgKimlikNodanKisiSorgula extends JDialog {
	private static final long serialVersionUID = 1L;

	private javax.swing.JPanel cpKimlikNodanKisiSorgula = null;

	private JPanel pnlKimlikNo = null;
	private JLabel lblKimlikNo = null;
	private JTextField txtKimlikNo = null;
	private JButton btnSorgula = null;
	private JPanel pnlSorguSonucu = null;
	private JPanel pnlButtons = null;
	private JButton btnKapat = null;
	private JPanel pnlKisiBilgileri = null;
	private JPanel pnlKayitYeriBilgileri = null;
	private JLabel lblAdSoyad = null;
	private JTextField txtAdSoyad = null;
	private JLabel lblBabaAdSoyad = null;
	private JTextField txtBabaAdSoyad = null;
	private JLabel lblAnaAdSoyad = null;
	private JTextField txtAnaAdSoyad = null;
	private JLabel lblDogumTarihi = null;
	private JTextField txtDogumTarihi = null;
	private JLabel lblDogumYeri = null;
	private JTextField txtDogumYeri = null;
	private JLabel lblCinsiyet = null;
	private JTextField txtCinsiyet = null;
	private JLabel lblDurum = null;
	private JTextField txtDurum = null;
	private JLabel lblMedeniHal = null;
	private JTextField txtMedeniHal = null;
	private JLabel lblOlumTarih = null;
	private JTextField txtOlumTarih = null;
	private JLabel lblIlAdi = null;
	private JTextField txtIlAdi = null;
	private JLabel lblIlceAdi = null;
	private JTextField txtIlceAdi = null;
	private JLabel lblMahalleKoy = null;
	private JTextField txtMahalleKoy = null;
	private JLabel lblCiltNo = null;
	private JTextField txtCiltNo = null;
	private JLabel lblAileSiraNo = null;
	private JTextField txtAileSiraNo = null;
	private JLabel lblBireySiraNo = null;
	private JTextField txtBireySiraNo = null;
	private JPanel pnlBosluk1 = null;
	private JPanel pnlBosluk2 = null;
	
	private KimlikNodanKisiSorgulaController controller = new KimlikNodanKisiSorgulaController(this);
	
	/**
	 * @throws java.awt.HeadlessException
	 */
	public DlgKimlikNodanKisiSorgula() throws HeadlessException {
		super();
		
		initialize();
	}

	/**
	 * @param owner
	 * @throws java.awt.HeadlessException
	 */
	public DlgKimlikNodanKisiSorgula(Dialog owner) throws HeadlessException {
		super(owner);
		
		initialize();
	}

	/**
	 * @param owner
	 * @param modal
	 * @throws java.awt.HeadlessException
	 */
	public DlgKimlikNodanKisiSorgula(Dialog owner, boolean modal)
			throws HeadlessException {
		super(owner, modal);
		
		initialize();
	}

	/**
	 * @param owner
	 * @throws java.awt.HeadlessException
	 */
	public DlgKimlikNodanKisiSorgula(Frame owner) throws HeadlessException {
		super(owner);
		
		initialize();
	}

	/**
	 * @param owner
	 * @param modal
	 * @throws java.awt.HeadlessException
	 */
	public DlgKimlikNodanKisiSorgula(Frame owner, boolean modal)
			throws HeadlessException {
		super(owner, modal);
		
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @throws java.awt.HeadlessException
	 */
	public DlgKimlikNodanKisiSorgula(Dialog owner, String title)
			throws HeadlessException {
		super(owner, title);
		
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @throws java.awt.HeadlessException
	 */
	public DlgKimlikNodanKisiSorgula(Dialog owner, String title, boolean modal)
			throws HeadlessException {
		super(owner, title, modal);
		
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @throws java.awt.HeadlessException
	 */
	public DlgKimlikNodanKisiSorgula(Frame owner, String title)
			throws HeadlessException {
		super(owner, title);
		
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @throws java.awt.HeadlessException
	 */
	public DlgKimlikNodanKisiSorgula(Frame owner, String title, boolean modal)
			throws HeadlessException {
		super(owner, title, modal);
		
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @param gc
	 * @throws java.awt.HeadlessException
	 */
	public DlgKimlikNodanKisiSorgula(Dialog owner, String title, boolean modal,
			GraphicsConfiguration gc) throws HeadlessException {
		super(owner, title, modal, gc);
		
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @param gc
	 */
	public DlgKimlikNodanKisiSorgula(Frame owner, String title, boolean modal,
			GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		this.setTitle("T.C. Kimlik Numarasýndan Kiþi Sorgula");
		this.setSize(610, 410);
		this.setModal(true);
		this.setContentPane(getCpKimlikNodanKisiSorgula());
		this.setLocationRelativeTo(getOwner());
		this.getRootPane().setDefaultButton(getBtnSorgula());
	}
	
	/**
	 * This method initializes cpKimlikNodanKisiSorgula
	 * 
	 * @return javax.swing.JPanel
	 */
	private javax.swing.JPanel getCpKimlikNodanKisiSorgula() {
		if(cpKimlikNodanKisiSorgula == null) {
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			cpKimlikNodanKisiSorgula = new javax.swing.JPanel();
			cpKimlikNodanKisiSorgula.setLayout(new GridBagLayout());
			gridBagConstraints1.weightx = 1.0D;
			gridBagConstraints1.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints1.gridwidth = 0;
			gridBagConstraints1.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints3.weightx = 1.0D;
			gridBagConstraints3.weighty = 1.0D;
			gridBagConstraints3.gridwidth = 0;
			gridBagConstraints3.fill = java.awt.GridBagConstraints.BOTH;
			gridBagConstraints4.weightx = 1.0D;
			gridBagConstraints4.gridwidth = 0;
			gridBagConstraints4.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints4.insets = new java.awt.Insets(0,2,0,2);
			cpKimlikNodanKisiSorgula.add(getPnlKimlikNo(), gridBagConstraints1);
			cpKimlikNodanKisiSorgula.add(getPnlSorguSonucu(), gridBagConstraints3);
			cpKimlikNodanKisiSorgula.add(getPnlButtons(), gridBagConstraints4);
		}
		return cpKimlikNodanKisiSorgula;
	}
	
	/**
	 * This method initializes pnlKimlikNo	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getPnlKimlikNo() {
		if (pnlKimlikNo == null) {
			lblKimlikNo = new JLabel();
			FlowLayout flowLayout2 = new FlowLayout();
			pnlKimlikNo = new JPanel();
			pnlKimlikNo.setLayout(flowLayout2);
			lblKimlikNo.setText("T.C. Kimlik No");
			flowLayout2.setHgap(2);
			flowLayout2.setVgap(2);
			pnlKimlikNo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED));
			pnlKimlikNo.add(lblKimlikNo, null);
			pnlKimlikNo.add(getTxtKimlikNo(), null);
		}
		return pnlKimlikNo;
	}
	/**
	 * This method initializes txtKimlikNo	
	 * 	
	 * @return javax.swing.JFormattedTextField	
	 */    
	private JTextField getTxtKimlikNo() {
		if (txtKimlikNo == null) {
			txtKimlikNo = new JTextField();
			txtKimlikNo.setPreferredSize(new java.awt.Dimension(150,20));
			txtKimlikNo.setText(String.valueOf(27085520100L));
			txtKimlikNo.getDocument().addDocumentListener(new DocumentListener() {
				public void changedUpdate(DocumentEvent e) {
					// Do Nothing...
				}

				public void insertUpdate(DocumentEvent e) {
					checkValidness();
				}

				public void removeUpdate(DocumentEvent e) {
					checkValidness();
				}
				
				private void checkValidness() {
					boolean isValid = true;
					String kimlikNo = txtKimlikNo.getText().trim();
					
					if (kimlikNo.length() == 11) {
						try { 
							Long.parseLong(kimlikNo);
						} catch (NumberFormatException nfEx) {
							isValid = false;
						}
					} else {
						isValid = false;
					}
					
					btnSorgula.setEnabled(isValid);
				}
			});
		}
		return txtKimlikNo;
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
			btnSorgula.setEnabled(true);
			btnSorgula.addActionListener(new java.awt.event.ActionListener() {   
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					controller.kisiSorgula(Long.parseLong(txtKimlikNo.getText().trim()));
				} 
			
			});
		}
		return btnSorgula;
	}
	/**
	 * This method initializes pnlSorguSonucu	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getPnlSorguSonucu() {
		if (pnlSorguSonucu == null) {
			GridLayout gridLayout43 = new GridLayout();
			lblCiltNo = new JLabel();
			lblIlceAdi = new JLabel();
			pnlSorguSonucu = new JPanel();
			pnlSorguSonucu.setLayout(gridLayout43);
			lblIlceAdi.setText("Ýlçe Adý");
			lblCiltNo.setText("Cilt No");
			gridLayout43.setRows(1);
			gridLayout43.setColumns(2);
			pnlSorguSonucu.add(getPnlKisiBilgileri(), null);
			pnlSorguSonucu.add(getPnlKayitYeriBilgileri(), null);
		}
		return pnlSorguSonucu;
	}
	/**
	 * This method initializes pnlButtons	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getPnlButtons() {
		if (pnlButtons == null) {
			FlowLayout flowLayout5 = new FlowLayout();
			pnlButtons = new JPanel();
			pnlButtons.setLayout(flowLayout5);
			flowLayout5.setHgap(2);
			flowLayout5.setVgap(2);
			flowLayout5.setAlignment(java.awt.FlowLayout.RIGHT);
			pnlButtons.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED));
			pnlButtons.add(getBtnSorgula(), null);
			pnlButtons.add(getBtnKapat(), null);
		}
		return pnlButtons;
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
					DlgKimlikNodanKisiSorgula.this.setVisible(false);
				}
			});
		}
		return btnKapat;
	}
	/**
	 * This method initializes pnlKisiBilgileri	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getPnlKisiBilgileri() {
		if (pnlKisiBilgileri == null) {
			GridBagConstraints gridBagConstraints38 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints36 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints35 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints34 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints33 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints32 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints30 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints29 = new GridBagConstraints();
			lblAnaAdSoyad = new JLabel();
			lblBabaAdSoyad = new JLabel();
			lblOlumTarih = new JLabel();
			lblMedeniHal = new JLabel();
			lblDurum = new JLabel();
			lblCinsiyet = new JLabel();
			lblDogumYeri = new JLabel();
			lblDogumTarihi = new JLabel();
			lblAdSoyad = new JLabel();
			GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints27 = new GridBagConstraints();
			pnlKisiBilgileri = new JPanel();
			pnlKisiBilgileri.setLayout(new GridBagLayout());
			lblAdSoyad.setText("Adý Soyadý");
			gridBagConstraints9.weightx = 1.0;
			gridBagConstraints9.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints9.gridwidth = 0;
			gridBagConstraints9.insets = new java.awt.Insets(0,0,2,2);
			lblBabaAdSoyad.setText("Baba Adý Soyadý");
			gridBagConstraints10.weightx = 1.0;
			gridBagConstraints10.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints10.gridwidth = 0;
			gridBagConstraints10.insets = new java.awt.Insets(0,0,2,2);
			lblAnaAdSoyad.setText("Anne Adý Soyadý");
			lblDogumTarihi.setText("Doðum Tarihi");
			gridBagConstraints11.gridwidth = 0;
			gridBagConstraints12.weightx = 1.0;
			gridBagConstraints12.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints12.gridwidth = 0;
			gridBagConstraints12.insets = new java.awt.Insets(0,0,2,2);
			lblDogumYeri.setText("Doðum Yeri");
			gridBagConstraints13.weightx = 1.0;
			gridBagConstraints13.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints13.gridwidth = 0;
			gridBagConstraints13.insets = new java.awt.Insets(0,0,2,2);
			lblCinsiyet.setText("Cinsiyeti");
			gridBagConstraints14.weightx = 1.0;
			gridBagConstraints14.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints14.gridwidth = 0;
			gridBagConstraints14.insets = new java.awt.Insets(0,0,2,2);
			lblDurum.setText("Durumu");
			gridBagConstraints15.weightx = 1.0;
			gridBagConstraints15.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints15.gridwidth = 0;
			gridBagConstraints15.insets = new java.awt.Insets(0,0,2,2);
			lblMedeniHal.setText("Medeni Hali");
			gridBagConstraints16.weightx = 1.0;
			gridBagConstraints16.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints16.gridwidth = 0;
			gridBagConstraints16.insets = new java.awt.Insets(0,0,2,2);
			lblOlumTarih.setText("Ölüm Tarihi");
			gridBagConstraints18.weightx = 1.0;
			gridBagConstraints18.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints18.gridwidth = 0;
			gridBagConstraints18.insets = new java.awt.Insets(0,0,2,2);
			gridBagConstraints27.gridwidth = 0;
			gridBagConstraints27.fill = java.awt.GridBagConstraints.BOTH;
			gridBagConstraints27.weightx = 1.0D;
			gridBagConstraints27.weighty = 1.0D;
			gridBagConstraints11.weightx = 1.0;
			gridBagConstraints11.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints11.insets = new java.awt.Insets(0,0,2,2);
			pnlKisiBilgileri.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED), "Kiþi Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null));
			gridBagConstraints29.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints29.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints30.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints30.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints31.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints31.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints32.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints32.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints33.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints33.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints34.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints34.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints35.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints35.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints36.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints36.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints38.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints38.insets = new java.awt.Insets(0,2,0,2);
			pnlKisiBilgileri.add(lblAdSoyad, gridBagConstraints29);
			pnlKisiBilgileri.add(getTxtAdSoyad(), gridBagConstraints9);
			pnlKisiBilgileri.add(lblBabaAdSoyad, gridBagConstraints30);
			pnlKisiBilgileri.add(getTxtBabaAdSoyad(), gridBagConstraints10);
			pnlKisiBilgileri.add(lblAnaAdSoyad, gridBagConstraints31);
			pnlKisiBilgileri.add(getTxtAnaAdSoyad(), gridBagConstraints11);
			pnlKisiBilgileri.add(lblDogumYeri, gridBagConstraints32);
			pnlKisiBilgileri.add(getTxtDogumYeri(), gridBagConstraints13);
			pnlKisiBilgileri.add(lblDogumTarihi, gridBagConstraints33);
			pnlKisiBilgileri.add(getTxtDogumTarihi(), gridBagConstraints12);
			pnlKisiBilgileri.add(lblCinsiyet, gridBagConstraints34);
			pnlKisiBilgileri.add(getTxtCinsiyet(), gridBagConstraints14);
			pnlKisiBilgileri.add(lblDurum, gridBagConstraints35);
			pnlKisiBilgileri.add(getTxtDurum(), gridBagConstraints15);
			pnlKisiBilgileri.add(lblMedeniHal, gridBagConstraints36);
			pnlKisiBilgileri.add(getTxtMedeniHal(), gridBagConstraints16);
			pnlKisiBilgileri.add(lblOlumTarih, gridBagConstraints38);
			pnlKisiBilgileri.add(getTxtOlumTarih(), gridBagConstraints18);
			pnlKisiBilgileri.add(getPnlBosluk1(), gridBagConstraints27);
		}
		return pnlKisiBilgileri;
	}
	/**
	 * This method initializes pnlKayitYeriBilgileri	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getPnlKayitYeriBilgileri() {
		if (pnlKayitYeriBilgileri == null) {
			GridBagConstraints gridBagConstraints42 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints41 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints40 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints39 = new GridBagConstraints();
			lblBireySiraNo = new JLabel();
			lblAileSiraNo = new JLabel();
			lblMahalleKoy = new JLabel();
			lblIlAdi = new JLabel();
			GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints20 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints22 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints23 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints24 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints25 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints26 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints28 = new GridBagConstraints();
			pnlKayitYeriBilgileri = new JPanel();
			pnlKayitYeriBilgileri.setLayout(new GridBagLayout());
			lblIlAdi.setText("Ýl Adý");
			gridBagConstraints19.weightx = 1.0;
			gridBagConstraints19.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints19.gridwidth = 0;
			gridBagConstraints19.insets = new java.awt.Insets(0,0,2,2);
			gridBagConstraints20.gridx = -1;
			gridBagConstraints20.gridy = -1;
			gridBagConstraints20.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints20.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints21.weightx = 1.0;
			gridBagConstraints21.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints21.gridwidth = 0;
			gridBagConstraints21.insets = new java.awt.Insets(0,0,2,2);
			lblMahalleKoy.setText("Mahalle / Köy");
			gridBagConstraints22.weightx = 1.0;
			gridBagConstraints22.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints22.gridwidth = 0;
			gridBagConstraints22.insets = new java.awt.Insets(0,0,2,2);
			gridBagConstraints23.gridx = -1;
			gridBagConstraints23.gridy = -1;
			gridBagConstraints23.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints23.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints24.weightx = 1.0;
			gridBagConstraints24.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints24.gridwidth = 0;
			gridBagConstraints24.insets = new java.awt.Insets(0,0,2,2);
			lblAileSiraNo.setText("Aile Sýra No");
			gridBagConstraints25.weightx = 1.0;
			gridBagConstraints25.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints25.gridwidth = 0;
			gridBagConstraints25.insets = new java.awt.Insets(0,0,2,2);
			lblBireySiraNo.setText("Birey Sýra No");
			gridBagConstraints26.weightx = 1.0;
			gridBagConstraints26.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints26.gridwidth = 0;
			gridBagConstraints26.insets = new java.awt.Insets(0,0,2,2);
			gridBagConstraints28.fill = java.awt.GridBagConstraints.BOTH;
			gridBagConstraints28.gridwidth = 0;
			gridBagConstraints28.weightx = 1.0D;
			gridBagConstraints28.weighty = 1.0D;
			pnlKayitYeriBilgileri.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED), "Nüfusa Kayýtlý Olduðu Yer Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null));
			gridBagConstraints39.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints39.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints40.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints40.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints41.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints41.insets = new java.awt.Insets(0,2,0,2);
			gridBagConstraints42.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints42.insets = new java.awt.Insets(0,2,0,2);
			pnlKayitYeriBilgileri.add(lblIlAdi, gridBagConstraints39);
			pnlKayitYeriBilgileri.add(getTxtIlAdi(), gridBagConstraints19);
			pnlKayitYeriBilgileri.add(lblIlceAdi, gridBagConstraints20);
			pnlKayitYeriBilgileri.add(getTxtIlceAdi(), gridBagConstraints21);
			pnlKayitYeriBilgileri.add(lblMahalleKoy, gridBagConstraints40);
			pnlKayitYeriBilgileri.add(getTxtMahalleKoy(), gridBagConstraints22);
			pnlKayitYeriBilgileri.add(lblCiltNo, gridBagConstraints23);
			pnlKayitYeriBilgileri.add(getTxtCiltNo(), gridBagConstraints24);
			pnlKayitYeriBilgileri.add(lblAileSiraNo, gridBagConstraints41);
			pnlKayitYeriBilgileri.add(getTxtAileSiraNo(), gridBagConstraints25);
			pnlKayitYeriBilgileri.add(lblBireySiraNo, gridBagConstraints42);
			pnlKayitYeriBilgileri.add(getTxtBireySiraNo(), gridBagConstraints26);
			pnlKayitYeriBilgileri.add(getPnlBosluk2(), gridBagConstraints28);
		}
		return pnlKayitYeriBilgileri;
	}
	/**
	 * This method initializes txtAdSoyad	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getTxtAdSoyad() {
		if (txtAdSoyad == null) {
			txtAdSoyad = new JTextField();
			txtAdSoyad.setEditable(false);
		}
		return txtAdSoyad;
	}
	/**
	 * This method initializes txtBabaAdSoyad	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getTxtBabaAdSoyad() {
		if (txtBabaAdSoyad == null) {
			txtBabaAdSoyad = new JTextField();
			txtBabaAdSoyad.setEditable(false);
		}
		return txtBabaAdSoyad;
	}
	/**
	 * This method initializes txtAnaAdSoyad	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getTxtAnaAdSoyad() {
		if (txtAnaAdSoyad == null) {
			txtAnaAdSoyad = new JTextField();
			txtAnaAdSoyad.setEditable(false);
		}
		return txtAnaAdSoyad;
	}
	/**
	 * This method initializes txtDogumTarihi	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getTxtDogumTarihi() {
		if (txtDogumTarihi == null) {
			txtDogumTarihi = new JTextField();
			txtDogumTarihi.setEditable(false);
		}
		return txtDogumTarihi;
	}
	/**
	 * This method initializes txtDogumYeri	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getTxtDogumYeri() {
		if (txtDogumYeri == null) {
			txtDogumYeri = new JTextField();
			txtDogumYeri.setEditable(false);
		}
		return txtDogumYeri;
	}
	/**
	 * This method initializes txtCinsiyet	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getTxtCinsiyet() {
		if (txtCinsiyet == null) {
			txtCinsiyet = new JTextField();
			txtCinsiyet.setEditable(false);
		}
		return txtCinsiyet;
	}
	/**
	 * This method initializes txtDurum	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getTxtDurum() {
		if (txtDurum == null) {
			txtDurum = new JTextField();
			txtDurum.setEditable(false);
		}
		return txtDurum;
	}
	/**
	 * This method initializes txtMedeniHal	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getTxtMedeniHal() {
		if (txtMedeniHal == null) {
			txtMedeniHal = new JTextField();
			txtMedeniHal.setEditable(false);
		}
		return txtMedeniHal;
	}
	/**
	 * This method initializes txtOlumTarih	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getTxtOlumTarih() {
		if (txtOlumTarih == null) {
			txtOlumTarih = new JTextField();
			txtOlumTarih.setEditable(false);
		}
		return txtOlumTarih;
	}
	/**
	 * This method initializes txtIlAdi	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getTxtIlAdi() {
		if (txtIlAdi == null) {
			txtIlAdi = new JTextField();
			txtIlAdi.setEditable(false);
		}
		return txtIlAdi;
	}
	/**
	 * This method initializes txtIlceAdi	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getTxtIlceAdi() {
		if (txtIlceAdi == null) {
			txtIlceAdi = new JTextField();
			txtIlceAdi.setEditable(false);
		}
		return txtIlceAdi;
	}
	/**
	 * This method initializes txtMahalleKoy	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getTxtMahalleKoy() {
		if (txtMahalleKoy == null) {
			txtMahalleKoy = new JTextField();
			txtMahalleKoy.setEditable(false);
		}
		return txtMahalleKoy;
	}
	/**
	 * This method initializes txtCiltNo	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getTxtCiltNo() {
		if (txtCiltNo == null) {
			txtCiltNo = new JTextField();
			txtCiltNo.setEditable(false);
		}
		return txtCiltNo;
	}
	/**
	 * This method initializes txtAileSiraNo	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getTxtAileSiraNo() {
		if (txtAileSiraNo == null) {
			txtAileSiraNo = new JTextField();
			txtAileSiraNo.setEditable(false);
		}
		return txtAileSiraNo;
	}
	/**
	 * This method initializes txtBireySiraNo	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getTxtBireySiraNo() {
		if (txtBireySiraNo == null) {
			txtBireySiraNo = new JTextField();
			txtBireySiraNo.setEditable(false);
		}
		return txtBireySiraNo;
	}
	/**
	 * This method initializes pnlBosluk1	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getPnlBosluk1() {
		if (pnlBosluk1 == null) {
			pnlBosluk1 = new JPanel();
		}
		return pnlBosluk1;
	}
	/**
	 * This method initializes pnlBosluk2	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getPnlBosluk2() {
		if (pnlBosluk2 == null) {
			pnlBosluk2 = new JPanel();
		}
		return pnlBosluk2;
	}

	public void setKisiBilgisi(KisiModel kisiBilgisi) {
		if (kisiBilgisi == null) {
			txtAdSoyad.setText(null);
			txtBabaAdSoyad.setText(null);
			txtAnaAdSoyad.setText(null);
			txtDogumYeri.setText(null);
			txtDogumTarihi.setText(null);
			txtCinsiyet.setText(null);
			txtDurum.setText(null);
			txtMedeniHal.setText(null);
			txtOlumTarih.setText(null);
			txtIlAdi.setText(null);
			txtIlceAdi.setText(null);
			txtMahalleKoy.setText(null);
			txtCiltNo.setText(null);
			txtAileSiraNo.setText(null);
			txtBireySiraNo.setText(null);
		} else {
			txtAdSoyad.setText(kisiBilgisi.getAd() + " " + kisiBilgisi.getSoyad());
			txtBabaAdSoyad.setText(kisiBilgisi.getBabaAd());
			txtAnaAdSoyad.setText(kisiBilgisi.getAnneAd());
			txtDogumYeri.setText(kisiBilgisi.getDogumYer());
			txtDogumTarihi.setText(kisiBilgisi.getDogumTarih().toString());
			txtCinsiyet.setText(kisiBilgisi.getCinsiyet().toString());
			txtDurum.setText(kisiBilgisi.getDurum().toString());
			txtMedeniHal.setText(kisiBilgisi.getMedeniHal().toString());
			if (kisiBilgisi.getOlumTarih() != null) {
				txtOlumTarih.setText(kisiBilgisi.getOlumTarih().toString());
			} else {
				txtOlumTarih.setText(null);
			}
			
			txtIlAdi.setText(kisiBilgisi.getKayitYerIl().toString());
			txtIlceAdi.setText(kisiBilgisi.getKayitYerIlce().toString());
			txtMahalleKoy.setText(kisiBilgisi.getKayitYerCilt().toString());
			txtCiltNo.setText(String.valueOf(kisiBilgisi.getKayitYerCilt().getKod()));
			txtAileSiraNo.setText(String.valueOf(kisiBilgisi.getAileSiraNo()));
			txtBireySiraNo.setText(String.valueOf(kisiBilgisi.getBireySiraNo()));
		}
		
	}
	
}  //  @jve:decl-index=0:visual-constraint="33,12"
