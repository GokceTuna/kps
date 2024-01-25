
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

import tr.gov.nvi.kpsv2.model.BilesikKutukModel;
import tr.gov.nvi.kpsv2.samples.ui.services.controller.BilesikKutukKisiSorgulaController;

public class DlgBilesikKutukKisiSorgula extends JDialog {
	private static final long serialVersionUID = 1L;

	private javax.swing.JPanel cpBilesikKutukKisiSorgula = null;

        private JPanel pnlSorguSonucu = null;
        private JPanel pnlSorguSonucu2 = null;
	private JPanel pnlButtons = null;
	private JButton btnKapat = null;
        private JButton btnSorgula = null;
        
	private JPanel pnlKimlikNo = null;
        private JPanel pnlKisiBilgileri = null;
	private JPanel pnlCuzdanBilgileri = null;
        private JPanel pnlTckk = null;
	private JPanel pnlGeciciKimlik = null;
        private JPanel pnlMavi = null;
        private JPanel pnlMaviKart = null;
	private JPanel pnlYabanci = null;
        private JPanel pnlBosluk1 = null;
	private JPanel pnlBosluk2 = null;
        private JPanel pnlBosluk3 = null;
        private JPanel pnlBosluk4 = null;
        private JPanel pnlBosluk5 = null;
        private JPanel pnlBosluk6 = null;
        private JPanel pnlBosluk7 = null;
        
	private JLabel lblKimlikNo = null;
	private JTextField txtKimlikNo = null;
	private JLabel lblTcKimlikNo = null;
        private JTextField txtTcKimlikNo = null;
	private JLabel lblAdSoyad = null;
	private JTextField txtAdSoyad = null;
	private JLabel lblDogumTarihi = null;
	private JTextField txtDogumTarihi = null;
        
        private JLabel lblCuzdanTcKimlikNo = null;
        private JTextField txtCuzdanTcKimlikNo = null;
	private JLabel lblCuzdanAdSoyad = null;
	private JTextField txtCuzdanAdSoyad = null;
	private JLabel lblCuzdanSeriNo = null;
	private JTextField txtCuzdanSeriNo = null;
        
        private JLabel lblTckkTcKimlikNo = null;
        private JTextField txtTckkTcKimlikNo = null;
	private JLabel lblTckkAdSoyad = null;
	private JTextField txtTckkAdSoyad = null;
	private JLabel lblTckkSeriNo = null;
	private JTextField txtTckkSeriNo = null;
        
        private JLabel lblGkTcKimlikNo = null;
        private JTextField txtGkTcKimlikNo = null;
	private JLabel lblGkAdSoyad = null;
	private JTextField txtGkAdSoyad = null;
        
	private JLabel lblMaviKimlikNo = null;
        private JTextField txtMaviKimlikNo = null;
	private JLabel lblMaviAdSoyad = null;
	private JTextField txtMaviAdSoyad = null;
	private JLabel lblMaviDogumTarihi = null;
	private JTextField txtMaviDogumTarihi = null;
        
        private JLabel lblMaviKartKimlikNo = null;
        private JTextField txtMaviKartKimlikNo = null;
	private JLabel lblMaviKartAdSoyad = null;
	private JTextField txtMaviKartAdSoyad = null;
	private JLabel lblMaviKartSeriNo = null;
	private JTextField txtMaviKartSeriNo = null;
        
        private JLabel lblYbKimlikNo = null;
        private JTextField txtYbKimlikNo = null;
	private JLabel lblYbAdSoyad = null;
	private JTextField txtYbAdSoyad = null;
	private JLabel lblYbDogumTarihi = null;
	private JTextField txtYbDogumTarihi = null;
	
	private BilesikKutukKisiSorgulaController controller = new BilesikKutukKisiSorgulaController(this);
	
	/**
	 * @throws java.awt.HeadlessException
	 */
	public DlgBilesikKutukKisiSorgula() throws HeadlessException {
		super();
		
		initialize();
	}

	/**
	 * @param owner
	 * @throws java.awt.HeadlessException
	 */
	public DlgBilesikKutukKisiSorgula(Dialog owner) throws HeadlessException {
		super(owner);
		
		initialize();
	}

	/**
	 * @param owner
	 * @param modal
	 * @throws java.awt.HeadlessException
	 */
	public DlgBilesikKutukKisiSorgula(Dialog owner, boolean modal)
			throws HeadlessException {
		super(owner, modal);
		
		initialize();
	}

	/**
	 * @param owner
	 * @throws java.awt.HeadlessException
	 */
	public DlgBilesikKutukKisiSorgula(Frame owner) throws HeadlessException {
		super(owner);
		
		initialize();
	}

	/**
	 * @param owner
	 * @param modal
	 * @throws java.awt.HeadlessException
	 */
	public DlgBilesikKutukKisiSorgula(Frame owner, boolean modal)
			throws HeadlessException {
		super(owner, modal);
		
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @throws java.awt.HeadlessException
	 */
	public DlgBilesikKutukKisiSorgula(Dialog owner, String title)
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
	public DlgBilesikKutukKisiSorgula(Dialog owner, String title, boolean modal)
			throws HeadlessException {
		super(owner, title, modal);
		
		initialize();
	}

	/**
	 * @param owner
	 * @param title
	 * @throws java.awt.HeadlessException
	 */
	public DlgBilesikKutukKisiSorgula(Frame owner, String title)
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
	public DlgBilesikKutukKisiSorgula(Frame owner, String title, boolean modal)
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
	public DlgBilesikKutukKisiSorgula(Dialog owner, String title, boolean modal,
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
	public DlgBilesikKutukKisiSorgula(Frame owner, String title, boolean modal,
			GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		
		initialize();
	}

	
	private void initialize() {
		this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		this.setTitle("Kimlik numarasından Bilesik Kutuk Sorgulama Servisi");
		this.setSize(900,610);//(610, 410);
		this.setModal(true);
		this.setContentPane(getCpBilesikKutukKisiSorgula());
		this.setLocationRelativeTo(getOwner());
		this.getRootPane().setDefaultButton(getBtnSorgula());
	}
	
	private javax.swing.JPanel getCpBilesikKutukKisiSorgula() {
		if(cpBilesikKutukKisiSorgula == null) {
                        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			cpBilesikKutukKisiSorgula = new javax.swing.JPanel();
			cpBilesikKutukKisiSorgula.setLayout(new GridBagLayout());
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
                        gridBagConstraints5.weightx = 1.0D;
			gridBagConstraints5.weighty = 1.0D;
			gridBagConstraints5.gridwidth = 0;
			gridBagConstraints5.fill = java.awt.GridBagConstraints.BOTH;
			cpBilesikKutukKisiSorgula.add(getPnlKimlikNo(), gridBagConstraints1);
			cpBilesikKutukKisiSorgula.add(getPnlSorguSonucu(), gridBagConstraints3);
                        cpBilesikKutukKisiSorgula.add(getPnlSorguSonucu2(), gridBagConstraints5);
			cpBilesikKutukKisiSorgula.add(getPnlButtons(), gridBagConstraints4);
		}
		return cpBilesikKutukKisiSorgula;
	}
	 
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
	   
	private JPanel getPnlSorguSonucu() {
		if (pnlSorguSonucu == null) {
			GridLayout gridLayout43 = new GridLayout();
			pnlSorguSonucu = new JPanel();
			pnlSorguSonucu.setLayout(gridLayout43);
			gridLayout43.setRows(1);
			gridLayout43.setColumns(2);
			pnlSorguSonucu.add(getPnlKisiBilgileri(), null);
                        pnlSorguSonucu.add(getPnlTckk(), null);
                        pnlSorguSonucu.add(getPnlCuzdanBilgileri(), null);
                        pnlSorguSonucu.add(getPnlGeciciKimlik(), null);
		}
		return pnlSorguSonucu;
	}

    public JPanel getPnlSorguSonucu2() {
        if (pnlSorguSonucu2 == null) {
			GridLayout gridLay2 = new GridLayout();
			pnlSorguSonucu2 = new JPanel();
			pnlSorguSonucu2.setLayout(gridLay2);
			gridLay2.setRows(1);
			gridLay2.setColumns(2);
			pnlSorguSonucu2.add(getPnlMavi(), null);
                        pnlSorguSonucu2.add(getPnlMaviKart(), null);
                        pnlSorguSonucu2.add(getPnlYabanci(), null);
		}
        return pnlSorguSonucu2;
    }
        
        
           
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
	  
	private JButton getBtnKapat() {
		if (btnKapat == null) {
			btnKapat = new JButton();
			btnKapat.setText("Kapat");
			btnKapat.setPreferredSize(new java.awt.Dimension(85,26));
			btnKapat.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					DlgBilesikKutukKisiSorgula.this.setVisible(false);
				}
			});
		}
		return btnKapat;
	}
	  
	private JPanel getPnlKisiBilgileri() {
		if (pnlKisiBilgileri == null) {
			pnlKisiBilgileri = new JPanel();
			pnlKisiBilgileri.setLayout(new GridBagLayout());
			lblTcKimlikNo = new JLabel();
                        lblAdSoyad = new JLabel();
			lblDogumTarihi = new JLabel();
                        lblTcKimlikNo.setText("T.C. Kimlik No");
			lblAdSoyad.setText("Ad Soyad");
			lblDogumTarihi.setText("Dogum Tarihi");
			
                        GridBagConstraints gbLblTcKimlikNo = new GridBagConstraints();
                        gbLblTcKimlikNo.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblTcKimlikNo.insets = new java.awt.Insets(0,2,0,2);
			
                        GridBagConstraints gbLblAdSoyad = new GridBagConstraints();
                        gbLblAdSoyad.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblAdSoyad.insets = new java.awt.Insets(0,2,0,2);
                        
                        GridBagConstraints gbLblDogumTarihi = new GridBagConstraints();
                        gbLblDogumTarihi.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblDogumTarihi.insets = new java.awt.Insets(0,2,0,2);
                        
                        GridBagConstraints gbTxtTcKimlikNo = new GridBagConstraints();
                        gbTxtTcKimlikNo.weightx = 1.0;
			gbTxtTcKimlikNo.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtTcKimlikNo.gridwidth = 0;
			gbTxtTcKimlikNo.insets = new java.awt.Insets(0,0,2,2);
                        
                        GridBagConstraints gbTxtAdSoyad = new GridBagConstraints();
                        gbTxtAdSoyad.weightx = 1.0;
			gbTxtAdSoyad.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtAdSoyad.gridwidth = 0;
			gbTxtAdSoyad.insets = new java.awt.Insets(0,0,2,2);
                        
                        GridBagConstraints gbTxtDogumTarihi = new GridBagConstraints();
                        gbTxtDogumTarihi.weightx = 1.0;
			gbTxtDogumTarihi.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtDogumTarihi.gridwidth = 0;
			gbTxtDogumTarihi.insets = new java.awt.Insets(0,0,2,2);
			
                        GridBagConstraints gbPnlBosluk1 = new GridBagConstraints();
                        gbPnlBosluk1.gridwidth = 0;
			gbPnlBosluk1.fill = java.awt.GridBagConstraints.BOTH;
			gbPnlBosluk1.weightx = 1.0D;
			gbPnlBosluk1.weighty = 1.0D;
                        
                        pnlKisiBilgileri.add(lblTcKimlikNo,gbLblTcKimlikNo);
                        pnlKisiBilgileri.add(getTxtTcKimlikNo(), gbTxtTcKimlikNo);
			pnlKisiBilgileri.add(lblAdSoyad, gbLblAdSoyad);
			pnlKisiBilgileri.add(getTxtAdSoyad(), gbTxtAdSoyad);
			pnlKisiBilgileri.add(lblDogumTarihi, gbLblDogumTarihi);
			pnlKisiBilgileri.add(getTxtDogumTarihi(), gbTxtDogumTarihi);
			pnlKisiBilgileri.add(getPnlBosluk1(), gbPnlBosluk1);
                        pnlKisiBilgileri.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED), "T.C. Vatandasi Kisi Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null));
		}
		return pnlKisiBilgileri;
	}
	   
	private JPanel getPnlCuzdanBilgileri() {
		if (pnlCuzdanBilgileri == null) {
			pnlCuzdanBilgileri = new JPanel();
			pnlCuzdanBilgileri.setLayout(new GridBagLayout());
			lblCuzdanTcKimlikNo = new JLabel();
                        lblCuzdanAdSoyad = new JLabel();
                        lblCuzdanSeriNo = new JLabel();
                        
                        lblCuzdanTcKimlikNo.setText("T.C. Kimlik No");
                        lblCuzdanAdSoyad = new JLabel("Ad Soyad");
                        lblCuzdanSeriNo = new JLabel("SeriNo");
                        
                        GridBagConstraints gbLblTcKimlikNo = new GridBagConstraints();
                        gbLblTcKimlikNo.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblTcKimlikNo.insets = new java.awt.Insets(0,2,0,2);
			
                        GridBagConstraints gbLblAdSoyad = new GridBagConstraints();
                        gbLblAdSoyad.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblAdSoyad.insets = new java.awt.Insets(0,2,0,2);
                        
                        GridBagConstraints gbLblSeriNo = new GridBagConstraints();
                        gbLblSeriNo.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblSeriNo.insets = new java.awt.Insets(0,2,0,2);
                        
                        GridBagConstraints gbTxtTcKimlikNo = new GridBagConstraints();
                        gbTxtTcKimlikNo.weightx = 1.0;
			gbTxtTcKimlikNo.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtTcKimlikNo.gridwidth = 0;
			gbTxtTcKimlikNo.insets = new java.awt.Insets(0,0,2,2);
                        
                        GridBagConstraints gbTxtAdSoyad = new GridBagConstraints();
                        gbTxtAdSoyad.weightx = 1.0;
			gbTxtAdSoyad.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtAdSoyad.gridwidth = 0;
			gbTxtAdSoyad.insets = new java.awt.Insets(0,0,2,2);
                        
                        GridBagConstraints gbTxtSeriNo = new GridBagConstraints();
                        gbTxtSeriNo.weightx = 1.0;
			gbTxtSeriNo.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtSeriNo.gridwidth = 0;
			gbTxtSeriNo.insets = new java.awt.Insets(0,0,2,2);
                        
                        GridBagConstraints gbPnlBosluk2 = new GridBagConstraints();
                        gbPnlBosluk2.gridwidth = 0;
			gbPnlBosluk2.fill = java.awt.GridBagConstraints.BOTH;
			gbPnlBosluk2.weightx = 1.0D;
			gbPnlBosluk2.weighty = 1.0D;
                        
                        pnlCuzdanBilgileri.add(lblCuzdanTcKimlikNo,gbLblTcKimlikNo);
                        pnlCuzdanBilgileri.add(getTxtCuzdanTcKimlikNo(), gbTxtTcKimlikNo);
			pnlCuzdanBilgileri.add(lblCuzdanAdSoyad, gbLblAdSoyad);
			pnlCuzdanBilgileri.add(getTxtCuzdanAdSoyad(), gbTxtAdSoyad);
			pnlCuzdanBilgileri.add(lblCuzdanSeriNo, gbLblSeriNo);
			pnlCuzdanBilgileri.add(getTxtCuzdanSeriNo(), gbTxtSeriNo);
                        
                        pnlCuzdanBilgileri.add(getPnlBosluk2(), gbPnlBosluk2);
			pnlCuzdanBilgileri.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED), "T.C. Vatandasi Cuzdan Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null));
		}
		return pnlCuzdanBilgileri;
	}

    public JPanel getPnlTckk() {
        if (pnlTckk == null) {
			pnlTckk = new JPanel();
			pnlTckk.setLayout(new GridBagLayout());
			lblTckkTcKimlikNo = new JLabel();
                        lblTckkAdSoyad = new JLabel();
                        lblTckkSeriNo = new JLabel();
                        
                        lblTckkTcKimlikNo.setText("T.C. Kimlik No");
                        lblTckkAdSoyad = new JLabel("Ad Soyad");
                        lblTckkSeriNo = new JLabel("SeriNo");
                        
                        GridBagConstraints gbLblTcKimlikNo = new GridBagConstraints();
                        gbLblTcKimlikNo.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblTcKimlikNo.insets = new java.awt.Insets(0,2,0,2);
			
                        GridBagConstraints gbLblAdSoyad = new GridBagConstraints();
                        gbLblAdSoyad.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblAdSoyad.insets = new java.awt.Insets(0,2,0,2);
                        
                        GridBagConstraints gbLblSeriNo = new GridBagConstraints();
                        gbLblSeriNo.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblSeriNo.insets = new java.awt.Insets(0,2,0,2);
                        
                        GridBagConstraints gbTxtTcKimlikNo = new GridBagConstraints();
                        gbTxtTcKimlikNo.weightx = 1.0;
			gbTxtTcKimlikNo.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtTcKimlikNo.gridwidth = 0;
			gbTxtTcKimlikNo.insets = new java.awt.Insets(0,0,2,2);
                        
                        GridBagConstraints gbTxtAdSoyad = new GridBagConstraints();
                        gbTxtAdSoyad.weightx = 1.0;
			gbTxtAdSoyad.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtAdSoyad.gridwidth = 0;
			gbTxtAdSoyad.insets = new java.awt.Insets(0,0,2,2);
                        
                        GridBagConstraints gbTxtSeriNo = new GridBagConstraints();
                        gbTxtSeriNo.weightx = 1.0;
			gbTxtSeriNo.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtSeriNo.gridwidth = 0;
			gbTxtSeriNo.insets = new java.awt.Insets(0,0,2,2);
                        
                        GridBagConstraints gbPnlBosluk3 = new GridBagConstraints();
                        gbPnlBosluk3.gridwidth = 0;
			gbPnlBosluk3.fill = java.awt.GridBagConstraints.BOTH;
			gbPnlBosluk3.weightx = 1.0D;
			gbPnlBosluk3.weighty = 1.0D;
                        
                        pnlTckk.add(lblTckkTcKimlikNo,gbLblTcKimlikNo);
                        pnlTckk.add(getTxtTckkTcKimlikNo(), gbTxtTcKimlikNo);
			pnlTckk.add(lblTckkAdSoyad, gbLblAdSoyad);
			pnlTckk.add(getTxtTckkAdSoyad(), gbTxtAdSoyad);
			pnlTckk.add(lblTckkSeriNo, gbLblSeriNo);
			pnlTckk.add(getTxtTckkSeriNo(), gbTxtSeriNo);
                        
                        pnlTckk.add(getPnlBosluk3(), gbPnlBosluk3);
			pnlTckk.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED), "T.C. Vatandasi TCKK Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null));
        }
        return pnlTckk;
    }

    public JPanel getPnlGeciciKimlik() {
        if (pnlGeciciKimlik == null) {
			pnlGeciciKimlik = new JPanel();
			pnlGeciciKimlik.setLayout(new GridBagLayout());
			lblGkTcKimlikNo = new JLabel();
                        lblGkAdSoyad = new JLabel();
                        lblGkTcKimlikNo.setText("T.C. Kimlik No");
			lblGkAdSoyad.setText("Ad Soyad");
			
                        GridBagConstraints gbLblTcKimlikNo = new GridBagConstraints();
                        gbLblTcKimlikNo.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblTcKimlikNo.insets = new java.awt.Insets(0,2,0,2);
			
                        GridBagConstraints gbLblAdSoyad = new GridBagConstraints();
                        gbLblAdSoyad.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblAdSoyad.insets = new java.awt.Insets(0,2,0,2);
                        
                        GridBagConstraints gbTxtTcKimlikNo = new GridBagConstraints();
                        gbTxtTcKimlikNo.weightx = 1.0;
			gbTxtTcKimlikNo.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtTcKimlikNo.gridwidth = 0;
			gbTxtTcKimlikNo.insets = new java.awt.Insets(0,0,2,2);
                        
                        GridBagConstraints gbTxtAdSoyad = new GridBagConstraints();
                        gbTxtAdSoyad.weightx = 1.0;
			gbTxtAdSoyad.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtAdSoyad.gridwidth = 0;
			gbTxtAdSoyad.insets = new java.awt.Insets(0,0,2,2);
			
                        GridBagConstraints gbPnlBosluk4 = new GridBagConstraints();
                        gbPnlBosluk4.gridwidth = 0;
			gbPnlBosluk4.fill = java.awt.GridBagConstraints.BOTH;
			gbPnlBosluk4.weightx = 1.0D;
			gbPnlBosluk4.weighty = 1.0D;
                        
                        pnlGeciciKimlik.add(lblGkTcKimlikNo,gbLblTcKimlikNo);
                        pnlGeciciKimlik.add(getTxtGkTcKimlikNo(), gbTxtTcKimlikNo);
			pnlGeciciKimlik.add(lblGkAdSoyad, gbLblAdSoyad);
			pnlGeciciKimlik.add(getTxtGkAdSoyad(), gbTxtAdSoyad);
			pnlGeciciKimlik.add(getPnlBosluk4(), gbPnlBosluk4);
                        pnlGeciciKimlik.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED), "T.C. Vatandasi Gecici Kimlik Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null));
		}
        return pnlGeciciKimlik;
    } 

    public JPanel getPnlMavi() {
        if (pnlMavi == null) {
			pnlMavi = new JPanel();
			pnlMavi.setLayout(new GridBagLayout());
			lblMaviKimlikNo = new JLabel();
                        lblMaviAdSoyad = new JLabel();
			lblMaviDogumTarihi = new JLabel();
                        lblMaviKimlikNo.setText("T.C. Kimlik No");
			lblMaviAdSoyad.setText("Ad Soyad");
			lblMaviDogumTarihi.setText("Dogum Tarihi");
			
                        GridBagConstraints gbLblTcKimlikNo = new GridBagConstraints();
                        gbLblTcKimlikNo.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblTcKimlikNo.insets = new java.awt.Insets(0,2,0,2);
			
                        GridBagConstraints gbLblAdSoyad = new GridBagConstraints();
                        gbLblAdSoyad.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblAdSoyad.insets = new java.awt.Insets(0,2,0,2);
                        
                        GridBagConstraints gbLblDogumTarihi = new GridBagConstraints();
                        gbLblDogumTarihi.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblDogumTarihi.insets = new java.awt.Insets(0,2,0,2);
                        
                        GridBagConstraints gbTxtTcKimlikNo = new GridBagConstraints();
                        gbTxtTcKimlikNo.weightx = 1.0;
			gbTxtTcKimlikNo.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtTcKimlikNo.gridwidth = 0;
			gbTxtTcKimlikNo.insets = new java.awt.Insets(0,0,2,2);
                        
                        GridBagConstraints gbTxtAdSoyad = new GridBagConstraints();
                        gbTxtAdSoyad.weightx = 1.0;
			gbTxtAdSoyad.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtAdSoyad.gridwidth = 0;
			gbTxtAdSoyad.insets = new java.awt.Insets(0,0,2,2);
                        
                        GridBagConstraints gbTxtDogumTarihi = new GridBagConstraints();
                        gbTxtDogumTarihi.weightx = 1.0;
			gbTxtDogumTarihi.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtDogumTarihi.gridwidth = 0;
			gbTxtDogumTarihi.insets = new java.awt.Insets(0,0,2,2);
			
                        GridBagConstraints gbPnlBosluk5 = new GridBagConstraints();
                        gbPnlBosluk5.gridwidth = 0;
			gbPnlBosluk5.fill = java.awt.GridBagConstraints.BOTH;
			gbPnlBosluk5.weightx = 1.0D;
			gbPnlBosluk5.weighty = 1.0D;
                        
                        pnlMavi.add(lblMaviKimlikNo,gbLblTcKimlikNo);
                        pnlMavi.add(getTxtMaviKimlikNo(), gbTxtTcKimlikNo);
			pnlMavi.add(lblMaviAdSoyad, gbLblAdSoyad);
			pnlMavi.add(getTxtMaviAdSoyad(), gbTxtAdSoyad);
			pnlMavi.add(lblMaviDogumTarihi, gbLblDogumTarihi);
			pnlMavi.add(getTxtMaviDogumTarihi(), gbTxtDogumTarihi);
			pnlMavi.add(getPnlBosluk5(), gbPnlBosluk5);
                        pnlMavi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED), "Mavi Kartlı Kisi Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null));
		}
        return pnlMavi;
    }

    public JPanel getPnlMaviKart() {
        if (pnlMaviKart == null) {
			pnlMaviKart = new JPanel();
			pnlMaviKart.setLayout(new GridBagLayout());
			lblMaviKartKimlikNo = new JLabel();
                        lblMaviKartAdSoyad = new JLabel();
                        lblMaviKartSeriNo = new JLabel();
                        
                        lblMaviKartKimlikNo.setText("T.C. Kimlik No");
                        lblMaviKartAdSoyad = new JLabel("Ad Soyad");
                        lblMaviKartSeriNo = new JLabel("SeriNo");
                        
                        GridBagConstraints gbLblTcKimlikNo = new GridBagConstraints();
                        gbLblTcKimlikNo.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblTcKimlikNo.insets = new java.awt.Insets(0,2,0,2);
			
                        GridBagConstraints gbLblAdSoyad = new GridBagConstraints();
                        gbLblAdSoyad.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblAdSoyad.insets = new java.awt.Insets(0,2,0,2);
                        
                        GridBagConstraints gbLblSeriNo = new GridBagConstraints();
                        gbLblSeriNo.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblSeriNo.insets = new java.awt.Insets(0,2,0,2);
                        
                        GridBagConstraints gbTxtTcKimlikNo = new GridBagConstraints();
                        gbTxtTcKimlikNo.weightx = 1.0;
			gbTxtTcKimlikNo.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtTcKimlikNo.gridwidth = 0;
			gbTxtTcKimlikNo.insets = new java.awt.Insets(0,0,2,2);
                        
                        GridBagConstraints gbTxtAdSoyad = new GridBagConstraints();
                        gbTxtAdSoyad.weightx = 1.0;
			gbTxtAdSoyad.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtAdSoyad.gridwidth = 0;
			gbTxtAdSoyad.insets = new java.awt.Insets(0,0,2,2);
                        
                        GridBagConstraints gbTxtSeriNo = new GridBagConstraints();
                        gbTxtSeriNo.weightx = 1.0;
			gbTxtSeriNo.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtSeriNo.gridwidth = 0;
			gbTxtSeriNo.insets = new java.awt.Insets(0,0,2,2);
                        
                        GridBagConstraints gbPnlBosluk6 = new GridBagConstraints();
                        gbPnlBosluk6.gridwidth = 0;
			gbPnlBosluk6.fill = java.awt.GridBagConstraints.BOTH;
			gbPnlBosluk6.weightx = 1.0D;
			gbPnlBosluk6.weighty = 1.0D;
                        
                        pnlMaviKart.add(lblMaviKartKimlikNo,gbLblTcKimlikNo);
                        pnlMaviKart.add(getTxtMaviKartKimlikNo(), gbTxtTcKimlikNo);
			pnlMaviKart.add(lblMaviKartAdSoyad, gbLblAdSoyad);
			pnlMaviKart.add(getTxtMaviKartAdSoyad(), gbTxtAdSoyad);
			pnlMaviKart.add(lblMaviKartSeriNo, gbLblSeriNo);
			pnlMaviKart.add(getTxtMaviKartSeriNo(), gbTxtSeriNo);
                        
                        pnlMaviKart.add(getPnlBosluk6(), gbPnlBosluk6);
			pnlMaviKart.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED), "Mavi Kart Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null));
		}
        return pnlMaviKart;
    }

    public JPanel getPnlYabanci() {
        if (pnlYabanci == null) {
			pnlYabanci = new JPanel();
			pnlYabanci.setLayout(new GridBagLayout());
			lblYbKimlikNo = new JLabel();
                        lblYbAdSoyad = new JLabel();
			lblYbDogumTarihi = new JLabel();
                        lblYbKimlikNo.setText("T.C. Kimlik No");
			lblYbAdSoyad.setText("Ad Soyad");
			lblYbDogumTarihi.setText("Dogum Tarihi");
			
                        GridBagConstraints gbLblTcKimlikNo = new GridBagConstraints();
                        gbLblTcKimlikNo.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblTcKimlikNo.insets = new java.awt.Insets(0,2,0,2);
			
                        GridBagConstraints gbLblAdSoyad = new GridBagConstraints();
                        gbLblAdSoyad.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblAdSoyad.insets = new java.awt.Insets(0,2,0,2);
                        
                        GridBagConstraints gbLblDogumTarihi = new GridBagConstraints();
                        gbLblDogumTarihi.anchor = java.awt.GridBagConstraints.EAST;
                        gbLblDogumTarihi.insets = new java.awt.Insets(0,2,0,2);
                        
                        GridBagConstraints gbTxtTcKimlikNo = new GridBagConstraints();
                        gbTxtTcKimlikNo.weightx = 1.0;
			gbTxtTcKimlikNo.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtTcKimlikNo.gridwidth = 0;
			gbTxtTcKimlikNo.insets = new java.awt.Insets(0,0,2,2);
                        
                        GridBagConstraints gbTxtAdSoyad = new GridBagConstraints();
                        gbTxtAdSoyad.weightx = 1.0;
			gbTxtAdSoyad.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtAdSoyad.gridwidth = 0;
			gbTxtAdSoyad.insets = new java.awt.Insets(0,0,2,2);
                        
                        GridBagConstraints gbTxtDogumTarihi = new GridBagConstraints();
                        gbTxtDogumTarihi.weightx = 1.0;
			gbTxtDogumTarihi.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbTxtDogumTarihi.gridwidth = 0;
			gbTxtDogumTarihi.insets = new java.awt.Insets(0,0,2,2);
			
                        GridBagConstraints gbPnlBosluk7 = new GridBagConstraints();
                        gbPnlBosluk7.gridwidth = 0;
			gbPnlBosluk7.fill = java.awt.GridBagConstraints.BOTH;
			gbPnlBosluk7.weightx = 1.0D;
			gbPnlBosluk7.weighty = 1.0D;
                        
                        pnlYabanci.add(lblYbKimlikNo,gbLblTcKimlikNo);
                        pnlYabanci.add(getTxtYbKimlikNo(), gbTxtTcKimlikNo);
			pnlYabanci.add(lblYbAdSoyad, gbLblAdSoyad);
			pnlYabanci.add(getTxtYbAdSoyad(), gbTxtAdSoyad);
			pnlYabanci.add(lblYbDogumTarihi, gbLblDogumTarihi);
			pnlYabanci.add(getTxtYbDogumTarihi(), gbTxtDogumTarihi);
			pnlYabanci.add(getPnlBosluk7(), gbPnlBosluk7);
                        pnlYabanci.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED), "Yabanci Kisi Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null));
		}
        return pnlYabanci;
    }
    
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

        public JTextField getTxtTcKimlikNo() {
                if (txtTcKimlikNo == null) {
			txtTcKimlikNo = new JTextField();
			txtTcKimlikNo.setEditable(false);
		}
                return txtTcKimlikNo;
            }
            
	private JTextField getTxtAdSoyad() {
		if (txtAdSoyad == null) {
			txtAdSoyad = new JTextField();
			txtAdSoyad.setEditable(false);
		}
		return txtAdSoyad;
	}

	private JTextField getTxtDogumTarihi() {
		if (txtDogumTarihi == null) {
			txtDogumTarihi = new JTextField();
			txtDogumTarihi.setEditable(false);
		}
		return txtDogumTarihi;
	}

        public JTextField getTxtCuzdanTcKimlikNo() {
            if (txtCuzdanTcKimlikNo == null) {
			txtCuzdanTcKimlikNo = new JTextField();
			txtCuzdanTcKimlikNo.setEditable(false);
		}
            return txtCuzdanTcKimlikNo;
        }

        public JTextField getTxtCuzdanAdSoyad() {
            if (txtCuzdanAdSoyad == null) {
                            txtCuzdanAdSoyad = new JTextField();
                            txtCuzdanAdSoyad.setEditable(false);
                    }
            return txtCuzdanAdSoyad;
        }

        public JTextField getTxtCuzdanSeriNo() {
            if (txtCuzdanSeriNo == null) {
                            txtCuzdanSeriNo = new JTextField();
                            txtCuzdanSeriNo.setEditable(false);
                    }
            return txtCuzdanSeriNo;
        }

    public JTextField getTxtTckkTcKimlikNo() {
        if (txtTckkTcKimlikNo == null) {
			txtTckkTcKimlikNo = new JTextField();
			txtTckkTcKimlikNo.setEditable(false);
		}
        return txtTckkTcKimlikNo;
    }

    public JTextField getTxtTckkAdSoyad() {
        if (txtTckkAdSoyad == null) {
                            txtTckkAdSoyad = new JTextField();
                            txtTckkAdSoyad.setEditable(false);
                    }
        return txtTckkAdSoyad;
    }

    public JTextField getTxtTckkSeriNo() {
        if (txtTckkSeriNo == null) {
                            txtTckkSeriNo = new JTextField();
                            txtTckkSeriNo.setEditable(false);
                    }
        return txtTckkSeriNo;
    }

    public JTextField getTxtGkTcKimlikNo() {
        if (txtGkTcKimlikNo == null) {
			txtGkTcKimlikNo = new JTextField();
			txtGkTcKimlikNo.setEditable(false);
		}
        return txtGkTcKimlikNo;
    }

    public JTextField getTxtGkAdSoyad() {
        if (txtGkAdSoyad == null) {
                            txtGkAdSoyad = new JTextField();
                            txtGkAdSoyad.setEditable(false);
                    }
        return txtGkAdSoyad;
    }

    public JTextField getTxtMaviKimlikNo() {
        if (txtMaviKimlikNo == null) {
                            txtMaviKimlikNo = new JTextField();
                            txtMaviKimlikNo.setEditable(false);
                    }
        return txtMaviKimlikNo;
    }

    public JTextField getTxtMaviAdSoyad() {
        if (txtMaviAdSoyad == null) {
                            txtMaviAdSoyad = new JTextField();
                            txtMaviAdSoyad.setEditable(false);
                    }
        return txtMaviAdSoyad;
    }

    public JTextField getTxtMaviDogumTarihi() {
        if (txtMaviDogumTarihi == null) {
                            txtMaviDogumTarihi = new JTextField();
                            txtMaviDogumTarihi.setEditable(false);
                    }
        return txtMaviDogumTarihi;
    }

    public JTextField getTxtMaviKartKimlikNo() {
        if (txtMaviKartKimlikNo == null) {
                            txtMaviKartKimlikNo = new JTextField();
                            txtMaviKartKimlikNo.setEditable(false);
                    }
        return txtMaviKartKimlikNo;
    }

    public JTextField getTxtMaviKartAdSoyad() {
        if (txtMaviKartAdSoyad == null) {
                            txtMaviKartAdSoyad = new JTextField();
                            txtMaviKartAdSoyad.setEditable(false);
                    }
        return txtMaviKartAdSoyad;
    }

    public JTextField getTxtMaviKartSeriNo() {
        if (txtMaviKartSeriNo == null) {
                            txtMaviKartSeriNo = new JTextField();
                            txtMaviKartSeriNo.setEditable(false);
                    }
        return txtMaviKartSeriNo;
    }

    public JTextField getTxtYbKimlikNo() {
        if (txtYbKimlikNo == null) {
                            txtYbKimlikNo = new JTextField();
                            txtYbKimlikNo.setEditable(false);
                    }
        return txtYbKimlikNo;
    }

    public JTextField getTxtYbAdSoyad() {
        if (txtYbAdSoyad == null) {
                            txtYbAdSoyad = new JTextField();
                            txtYbAdSoyad.setEditable(false);
                    }
        return txtYbAdSoyad;
    }

    public JTextField getTxtYbDogumTarihi() {
        if (txtYbDogumTarihi == null) {
                            txtYbDogumTarihi = new JTextField();
                            txtYbDogumTarihi.setEditable(false);
                    }
        return txtYbDogumTarihi;
    }
    
	private JPanel getPnlBosluk1() {
		if (pnlBosluk1 == null) {
			pnlBosluk1 = new JPanel();
		}
		return pnlBosluk1;
	}

	private JPanel getPnlBosluk2() {
		if (pnlBosluk2 == null) {
			pnlBosluk2 = new JPanel();
		}
		return pnlBosluk2;
	}

    public JPanel getPnlBosluk3() {
        if (pnlBosluk3 == null) {
			pnlBosluk3 = new JPanel();
		}
        return pnlBosluk3;
    }

    public JPanel getPnlBosluk4() {
        if (pnlBosluk4 == null) {
			pnlBosluk4 = new JPanel();
		}
        return pnlBosluk4;
    }

    public JPanel getPnlBosluk5() {
        if (pnlBosluk5 == null) {
			pnlBosluk5 = new JPanel();
		}
        return pnlBosluk5;
    }

    public JPanel getPnlBosluk6() {
        if (pnlBosluk6 == null) {
			pnlBosluk6 = new JPanel();
		}
        return pnlBosluk6;
    }

    public JPanel getPnlBosluk7() {
        if (pnlBosluk7 == null) {
			pnlBosluk7 = new JPanel();
		}
        return pnlBosluk7;
    }
    
    
        
        

	public void setKutukBilgisi(BilesikKutukModel kutukBilgisi) {
		if (kutukBilgisi == null) {
                        txtKimlikNo.setText(null);
                        txtTcKimlikNo.setText(null);
                        txtAdSoyad.setText(null);
                        txtDogumTarihi.setText(null);
                        txtCuzdanTcKimlikNo.setText(null);
                        txtCuzdanAdSoyad.setText(null);
                        txtCuzdanSeriNo.setText(null);
                        txtTckkTcKimlikNo.setText(null);
                        txtTckkAdSoyad.setText(null);
                        txtTckkSeriNo.setText(null);
                        txtGkTcKimlikNo.setText(null);
                        txtGkAdSoyad.setText(null);
                        txtMaviKimlikNo.setText(null);
                        txtMaviAdSoyad.setText(null);
                        txtMaviDogumTarihi.setText(null);
                        txtMaviKartKimlikNo.setText(null);
                        txtMaviKartAdSoyad.setText(null);
                        txtMaviKartSeriNo.setText(null);
                        txtYbKimlikNo.setText(null);
                        txtYbAdSoyad.setText(null);
                        txtYbDogumTarihi.setText(null);
		} else {
                    if (String.valueOf(kutukBilgisi.getKimlikNo()) != null) {
                        txtKimlikNo.setText(String.valueOf(kutukBilgisi.getKimlikNo()));
                    }
                    if (String.valueOf(kutukBilgisi.getTcKimlikNo()) != null && !"0".equals(String.valueOf(kutukBilgisi.getTcKimlikNo()))) {
                        txtTcKimlikNo.setText(String.valueOf(kutukBilgisi.getTcKimlikNo()));
                    }
                    if (kutukBilgisi.getAd() != null || kutukBilgisi.getSoyad() != null ) {
                        txtAdSoyad.setText(kutukBilgisi.getAd() + " " + kutukBilgisi.getSoyad());
                    }
                    if (kutukBilgisi.getDogumTarih() != null) {
                        txtDogumTarihi.setText(kutukBilgisi.getDogumTarih().toString()); 
                    }
                    if (String.valueOf(kutukBilgisi.getCuzdanTcKimlikNo()) != null && !"0".equals(String.valueOf(kutukBilgisi.getCuzdanTcKimlikNo()))) {
                        txtCuzdanTcKimlikNo.setText(String.valueOf(kutukBilgisi.getCuzdanTcKimlikNo()));
                    }
                    if (kutukBilgisi.getCuzdanAd() != null || kutukBilgisi.getCuzdanSoyad() != null ) {
                        txtCuzdanAdSoyad.setText(kutukBilgisi.getCuzdanAd() + " " + kutukBilgisi.getCuzdanSoyad());
                    }
                    if (kutukBilgisi.getSeri() != null && String.valueOf(kutukBilgisi.getNo()) != null ) {
                        txtCuzdanSeriNo.setText(kutukBilgisi.getSeri() + String.valueOf(kutukBilgisi.getNo()));
                    }
                    if (String.valueOf(kutukBilgisi.getTckkTcKimlikNo()) != null && !"0".equals(String.valueOf(kutukBilgisi.getTckkTcKimlikNo()))) {
                        txtTckkTcKimlikNo.setText(String.valueOf(kutukBilgisi.getTckkTcKimlikNo()));
                    }
                    if (kutukBilgisi.getTckkAd() != null || kutukBilgisi.getTckkSoyad() != null) {
                        txtTckkAdSoyad.setText(kutukBilgisi.getTckkAd() + " " + kutukBilgisi.getTckkSoyad());
                    }
                    if (kutukBilgisi.getTckkSeriNo() != null) {
                        txtTckkSeriNo.setText(kutukBilgisi.getTckkSeriNo());
                    }
                    if (String.valueOf(kutukBilgisi.getGeciciKimlikTcKimlikNo()) != null && !"0".equals(String.valueOf(kutukBilgisi.getGeciciKimlikTcKimlikNo()))) {
                        txtGkTcKimlikNo.setText(String.valueOf(kutukBilgisi.getGeciciKimlikTcKimlikNo()));
                    }
                    if (kutukBilgisi.getGeciciKimlikAd() != null || kutukBilgisi.getGeciciKimlikSoyad() != null) {
                        txtGkAdSoyad.setText(kutukBilgisi.getGeciciKimlikAd() + " " + kutukBilgisi.getGeciciKimlikSoyad());
                    }
                    if (String.valueOf(kutukBilgisi.getMaviKartliKimlikNo()) != null && !"0".equals(String.valueOf(kutukBilgisi.getMaviKartliKimlikNo()))) {
                        txtMaviKimlikNo.setText(String.valueOf(kutukBilgisi.getMaviKartliKimlikNo()));
                    }
                    if (kutukBilgisi.getMaviKartliAd() != null || kutukBilgisi.getMaviKartliSoyad() != null) {
                        txtMaviAdSoyad.setText(kutukBilgisi.getMaviKartliAd() + " " + kutukBilgisi.getMaviKartliSoyad());
                    }
                    if (kutukBilgisi.getMaviKartliDogumTarih() != null) {
                        txtMaviDogumTarihi.setText(kutukBilgisi.getMaviKartliDogumTarih().toString());
                    }
                    if (String.valueOf(kutukBilgisi.getMaviKartKimlikNo()) != null && !"0".equals(String.valueOf(kutukBilgisi.getMaviKartKimlikNo()))) {
                        txtMaviKartKimlikNo.setText(String.valueOf(kutukBilgisi.getMaviKartKimlikNo()));
                    }
                    if (kutukBilgisi.getMaviKartAd() != null || kutukBilgisi.getMaviKartSoyad() !=  null) {
                        txtMaviKartAdSoyad.setText(kutukBilgisi.getMaviKartAd() + " " + kutukBilgisi.getMaviKartSoyad());
                    }
                    if (kutukBilgisi.getMaviKartSeri() != null && String.valueOf(kutukBilgisi.getMaviKartNo()) != null) {
                        txtMaviKartSeriNo.setText(kutukBilgisi.getMaviKartSeri() + kutukBilgisi.getMaviKartNo());
                    }
                    if (String.valueOf(kutukBilgisi.getYbKimlikNo()) != null && !"0".equals(String.valueOf(kutukBilgisi.getYbKimlikNo()))) {
                        txtYbKimlikNo.setText(String.valueOf(kutukBilgisi.getYbKimlikNo()));
                    }
                    if (kutukBilgisi.getYbAd() != null || kutukBilgisi.getYbSoyad() != null) {
                        txtYbAdSoyad.setText(kutukBilgisi.getYbAd() + " " + kutukBilgisi.getYbSoyad());
                    }
                    if (kutukBilgisi.getYbDogumTarih() != null) {
                        txtYbDogumTarihi.setText(kutukBilgisi.getYbDogumTarih().toString());
                    }
                        
		}
		
	}
	
}  //  @jve:decl-index=0:visual-constraint="33,12"
