
package tr.gov.nvi.kpsv2.samples.ui.config;

import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import tr.gov.nvi.kps.sts.NviConfiguration;
import tr.gov.nvi.kps.sts.NviConfigurationItem;


public class DlgConfiguration extends JDialog {
	private static final long serialVersionUID = 1L;
	
	private javax.swing.JPanel cpDlgConfiguration = null;

	private JPanel pnlAuthenticationInfo = null;
	private JPanel pnlEndPoint = null;
	private JPanel pnlButtons = null;
	private JButton btnOk = null;
	private JButton btnClose = null;
	private JLabel lblUserId = null;
	private JTextField txtUserId = null;
	private JLabel lblPassword = null;
	private JLabel lblServiceEndpoint;
	private JTextField txtServiceEndpoint = null;
	private JPasswordField txtPassword = null;
	private JLabel lblStsEndpoint;
	private JTextField txtStsEndpoint;
	
	/**
	 * This is the default constructor
	 */
	public DlgConfiguration() {
		super();
		
		initialize();
	}

	/**
	 * Constructs a new DlgConfiguration instance.
	 * 
	 * @param parent
	 */
	public DlgConfiguration(Frame parent) {
		super(parent);
		
		initialize();
	}
	
	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setTitle("Ayarlar");
		this.setSize(508, 198);
		this.setContentPane(getCpDlgConfiguration());
		this.pack();
		this.setLocationRelativeTo(getParent());
		this.getRootPane().setDefaultButton(getBtnOk());
		
		txtServiceEndpoint.setText("https://kpsv2test.nvi.gov.tr/Services/RoutingService.svc");
		txtStsEndpoint.setText("https://kimlikdogrulama.nvi.gov.tr/Services/Issuer.svc/IWSTrust13");
	}
	
	/**
	 * This method initializes cpDlgConfiguration
	 * 
	 * @return javax.swing.JPanel
	 */
	private javax.swing.JPanel getCpDlgConfiguration() {
		if(cpDlgConfiguration == null) {
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			cpDlgConfiguration = new javax.swing.JPanel();
			cpDlgConfiguration.setLayout(new GridBagLayout());
			gridBagConstraints1.gridwidth = 0;
			gridBagConstraints1.fill = java.awt.GridBagConstraints.BOTH;
			gridBagConstraints1.weightx = 1.0D;
			gridBagConstraints1.weighty = 0.0D;
			gridBagConstraints1.insets = new java.awt.Insets(2,0,2,0);
			gridBagConstraints2.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints2.gridheight = 1;
			gridBagConstraints2.weightx = 1.0D;
			gridBagConstraints2.weighty = 0.0D;
			gridBagConstraints2.gridwidth = 0;
			gridBagConstraints2.insets = new java.awt.Insets(2,0,2,0);
			gridBagConstraints3.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints3.weightx = 1.0D;
			gridBagConstraints3.gridwidth = 0;
			gridBagConstraints3.insets = new java.awt.Insets(0,2,0,2);
			cpDlgConfiguration.add(getPnlAuthenticationInfo(), gridBagConstraints1);
			cpDlgConfiguration.add(getPnlEndPoint(), gridBagConstraints2);
			cpDlgConfiguration.add(getPnlButtons(), gridBagConstraints3);
		}
		return cpDlgConfiguration;
	}
	
	/**
	 * This method initializes pnlAuthenticationInfo	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getPnlAuthenticationInfo() {
		if (pnlAuthenticationInfo == null) {
			lblPassword = new JLabel();
			lblUserId = new JLabel();
			GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
			pnlAuthenticationInfo = new JPanel();
			pnlAuthenticationInfo.setLayout(new GridBagLayout());
			pnlAuthenticationInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kullanýcý Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null));
			lblUserId.setText("Kullanýcý Kodu");
			gridBagConstraints6.weightx = 1.0;
			gridBagConstraints6.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints6.gridwidth = 0;
			gridBagConstraints6.insets = new java.awt.Insets(2,2,2,2);
			gridBagConstraints6.anchor = java.awt.GridBagConstraints.WEST;
			lblPassword.setText("Kullanýcý Þifresi");
			gridBagConstraints12.weightx = 1.0;
			gridBagConstraints12.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gridBagConstraints12.insets = new java.awt.Insets(2,2,2,2);
			gridBagConstraints12.anchor = java.awt.GridBagConstraints.WEST;
			gridBagConstraints8.insets = new java.awt.Insets(2,2,2,2);
			gridBagConstraints8.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints9.insets = new java.awt.Insets(2,2,2,2);
			gridBagConstraints9.anchor = java.awt.GridBagConstraints.EAST;
			pnlAuthenticationInfo.add(lblUserId, gridBagConstraints8);
			pnlAuthenticationInfo.add(getTxtUserId(), gridBagConstraints6);
			pnlAuthenticationInfo.add(lblPassword, gridBagConstraints9);
			pnlAuthenticationInfo.add(getTxtPassword(), gridBagConstraints12);
		}
		return pnlAuthenticationInfo;
	}
	
	/**
	 * This method initializes pnlEndPoint	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getPnlEndPoint() {
		if (pnlEndPoint == null) {
			lblServiceEndpoint = new JLabel();
			GridBagConstraints gbc_txtServiceEndpoint = new GridBagConstraints();
			gbc_txtServiceEndpoint.gridx = 1;
			gbc_txtServiceEndpoint.gridy = 0;
			GridBagConstraints gbc_lblServiceEndpoint = new GridBagConstraints();
			gbc_lblServiceEndpoint.gridx = 0;
			gbc_lblServiceEndpoint.gridy = 0;
			pnlEndPoint = new JPanel();
			GridBagLayout gbl_pnlEndPoint = new GridBagLayout();
			gbl_pnlEndPoint.columnWeights = new double[]{0.0, 1.0};
			pnlEndPoint.setLayout(gbl_pnlEndPoint);
			pnlEndPoint.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Baðlantý Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, null));
			lblServiceEndpoint.setText("KPS Adresi");
			lblServiceEndpoint.setPreferredSize(new java.awt.Dimension(88,16));
			lblServiceEndpoint.setMaximumSize(new java.awt.Dimension(88,16));
			lblServiceEndpoint.setMinimumSize(new java.awt.Dimension(88,16));
			lblServiceEndpoint.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
			gbc_txtServiceEndpoint.weightx = 1.0;
			gbc_txtServiceEndpoint.fill = java.awt.GridBagConstraints.HORIZONTAL;
			gbc_txtServiceEndpoint.insets = new Insets(2, 2, 5, 2);
			gbc_lblServiceEndpoint.insets = new Insets(2, 2, 5, 5);
			pnlEndPoint.add(lblServiceEndpoint, gbc_lblServiceEndpoint);
			pnlEndPoint.add(getTxtServiceEndpoint(), gbc_txtServiceEndpoint);
			GridBagConstraints gbc_lblStsEndpoint = new GridBagConstraints();
			gbc_lblStsEndpoint.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblStsEndpoint.insets = new Insets(0, 0, 5, 5);
			gbc_lblStsEndpoint.gridx = 0;
			gbc_lblStsEndpoint.gridy = 1;
			pnlEndPoint.add(getLblStsEndpoint(), gbc_lblStsEndpoint);
			GridBagConstraints gbc_txtStsEndpoint = new GridBagConstraints();
			gbc_txtStsEndpoint.insets = new Insets(2, 2, 5, 2);
			gbc_txtStsEndpoint.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtStsEndpoint.gridx = 1;
			gbc_txtStsEndpoint.gridy = 1;
			pnlEndPoint.add(getTxtStsEndpoint(), gbc_txtStsEndpoint);
		}
		return pnlEndPoint;
	}
	
	/**
	 * This method initializes pnlButtons	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getPnlButtons() {
		if (pnlButtons == null) {
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			pnlButtons = new JPanel();
			pnlButtons.setLayout(new GridBagLayout());
			gridBagConstraints4.weightx = 1.0D;
			gridBagConstraints4.anchor = java.awt.GridBagConstraints.EAST;
			gridBagConstraints4.insets = new java.awt.Insets(2,0,2,4);
			gridBagConstraints5.insets = new java.awt.Insets(2,0,2,2);
			pnlButtons.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED));
			pnlButtons.add(getBtnOk(), gridBagConstraints4);
			pnlButtons.add(getBtnClose(), gridBagConstraints5);
		}
		return pnlButtons;
	}
	
	/**
	 * This method initializes btnOk	
	 * 	
	 * @return javax.swing.JButton	
	 */    
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton();
			btnOk.setText("Tamam");
			btnOk.setPreferredSize(new java.awt.Dimension(85,25));
			btnOk.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					if (checkFields()) {
						setCurrentValues();
						
						setVisible(false);
					}
				}
			});
		}
		return btnOk;
	}
	
	/**
	 * This method initializes btnClose	
	 * 	
	 * @return javax.swing.JButton	
	 */    
	private JButton getBtnClose() {
		if (btnClose == null) {
			btnClose = new JButton();
			btnClose.setText("Kapat");
			btnClose.setPreferredSize(new java.awt.Dimension(85,25));
			btnClose.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					setVisible(false);
				}
			});
		}
		return btnClose;
	}
	
	/**
	 * This method initializes txtUserId	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getTxtUserId() {
		if (txtUserId == null) {
			txtUserId = new JTextField();
			txtUserId.setPreferredSize(new java.awt.Dimension(300,20));
		}
		return txtUserId;
	}
	
	/**
	 * This method initializes txtEndPoint	
	 * 	
	 * @return javax.swing.JTextField	
	 */    
	private JTextField getTxtServiceEndpoint() {
		if (txtServiceEndpoint == null) {
			txtServiceEndpoint = new JTextField();
			txtServiceEndpoint.setPreferredSize(new java.awt.Dimension(300,20));
		}
		return txtServiceEndpoint;
	}
	
	/**
	 * This method initializes txtPassword	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */    
	private JPasswordField getTxtPassword() {
		if (txtPassword == null) {
			txtPassword = new JPasswordField();
			txtPassword.setPreferredSize(new java.awt.Dimension(300,20));
		}
		return txtPassword;
	}
	
	private boolean checkFields() {
		StringBuffer msgBuffer = new StringBuffer();
		
		String userId = txtUserId.getText();
		String password = new String(txtPassword.getPassword());
		String endPoint = txtServiceEndpoint.getText();
		
		if (userId == null || userId.trim().length() == 0) {
			msgBuffer.append("Kullanýcý Kodu girilmelidir.\n");
		}
		
		if (password == null || password.trim().length() == 0) {
			msgBuffer.append("Kullanýcý Þifresi girilmelidir.\n");
		}
		
		if (endPoint == null || endPoint.trim().length() == 0) {
			msgBuffer.append("Baðlantý Adresi girilmelidir.\n");
		} else {
			try {
				new URL(endPoint);
			} catch (MalformedURLException muEx) {
				msgBuffer.append("Baðlantý Adresi geçersizdir.\n");
			}
		}
		
		if (msgBuffer.length() > 0) {
			JOptionPane.showMessageDialog(
				this,
				msgBuffer,
				"Mernis KPS Örnek Uygulamasý",
				JOptionPane.ERROR_MESSAGE);
		}
		
		return msgBuffer.length() == 0;
	}
	
	
	private void setCurrentValues() {
		String userId = txtUserId.getText();
		char[] password = txtPassword.getPassword();
		String serviceEndpoint = txtServiceEndpoint.getText();
		String stsEndpoint = txtStsEndpoint.getText();
		
		NviConfigurationItem item = new NviConfigurationItem();
		item.setUsername(userId);
		item.setPassword(password);
		item.setTokenServiceEndpoint(stsEndpoint);
		
		NviConfiguration.Instance.clear();
		NviConfiguration.Instance.addConfiguration(serviceEndpoint, item);
	}
	
	private JLabel getLblStsEndpoint() {
		if (lblStsEndpoint == null) {
			lblStsEndpoint = new JLabel("STS Adresi");
			lblStsEndpoint.setHorizontalAlignment(SwingConstants.RIGHT);
		}
		return lblStsEndpoint;
	}
	
	private JTextField getTxtStsEndpoint() {
		if (txtStsEndpoint == null) {
			txtStsEndpoint = new JTextField();
			txtStsEndpoint.setColumns(10);
		}
		return txtStsEndpoint;
	}
}  //  @jve:decl-index=0:visual-constraint="43,44"
