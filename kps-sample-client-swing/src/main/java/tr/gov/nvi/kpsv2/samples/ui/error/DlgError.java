
package tr.gov.nvi.kpsv2.samples.ui.error;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.HeadlessException;

import javax.swing.JDialog;

public class DlgError extends JDialog {
	private static final long serialVersionUID = 1L;

	private javax.swing.JPanel jContentPane = null;

	private javax.swing.JToggleButton btnDetails = null;
	private javax.swing.JButton btnClose = null;
	private javax.swing.JScrollPane spDetails = null;
	private javax.swing.JScrollPane spErrorMessage = null;
	private javax.swing.JTextArea txtErrorMessage = null;
	private javax.swing.JTextArea txtDetails = null;
  /**
   * @throws java.awt.HeadlessException
   */
  public DlgError() throws HeadlessException {
    super();

    initialize();
  }

	public DlgError(Throwable t) throws HeadlessException {
		super();

		initialize();
		
		setThrowable(t);
	}

  /**
   * @param owner
   * @throws java.awt.HeadlessException
   */
  public DlgError(Dialog owner, Throwable t) throws HeadlessException {
    super(owner);

    initialize();
    
    setThrowable(t);
  }

  /**
   * @param owner
   * @throws java.awt.HeadlessException
   */
  public DlgError(Frame owner, Throwable t) throws HeadlessException {
    super(owner);

    initialize();
    
    setThrowable(t);
  }

  /**
   * This method initializes this
   * 
   * @return void
   */
  private void initialize() {
    this.setSize(390, 244);
    this.setContentPane(getJContentPane());
    this.setName("dlgError");
    this.setTitle("Hata Bilgisi");
    this.setModal(true);
    this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    this.getRootPane().setDefaultButton(getBtnClose());
    this.pack();
    this.setLocationRelativeTo(getOwner());
  }
  /**
   * This method initializes jContentPane
   * 
   * @return javax.swing.JPanel
   */
  private javax.swing.JPanel getJContentPane() {
    if (jContentPane == null) {
      jContentPane = new javax.swing.JPanel();
      java.awt.GridBagConstraints consGridBagConstraints3 = new java.awt.GridBagConstraints();
      java.awt.GridBagConstraints consGridBagConstraints4 = new java.awt.GridBagConstraints();
      java.awt.GridBagConstraints consGridBagConstraints1 = new java.awt.GridBagConstraints();
      java.awt.GridBagConstraints consGridBagConstraints5 = new java.awt.GridBagConstraints();
      consGridBagConstraints1.fill = java.awt.GridBagConstraints.BOTH;
      consGridBagConstraints1.weighty = 0.25D;
      consGridBagConstraints1.weightx = 1.0;
      consGridBagConstraints1.gridwidth = 0;
      consGridBagConstraints3.insets = new java.awt.Insets(4,4,4,4);
      consGridBagConstraints3.anchor = java.awt.GridBagConstraints.EAST;
      consGridBagConstraints3.gridwidth = 1;
      consGridBagConstraints3.weightx = 1.0D;
      consGridBagConstraints4.insets = new java.awt.Insets(4,4,4,4);
      consGridBagConstraints4.gridwidth = 0;
      consGridBagConstraints5.fill = java.awt.GridBagConstraints.BOTH;
      consGridBagConstraints5.weighty = 0.75D;
      consGridBagConstraints5.weightx = 1.0;
      consGridBagConstraints5.gridwidth = 0;
      consGridBagConstraints5.insets = new java.awt.Insets(4,4,4,4);
      consGridBagConstraints1.insets = new java.awt.Insets(4,4,4,4);
      jContentPane.setLayout(new java.awt.GridBagLayout());
      jContentPane.add(getSpErrorMessage(), consGridBagConstraints1);
      jContentPane.add(getBtnDetails(), consGridBagConstraints3);
      jContentPane.add(getBtnClose(), consGridBagConstraints4);
      jContentPane.add(getSpDetails(), consGridBagConstraints5);
    }
    return jContentPane;
  }
	/**
	 * This method initializes btnDetails
	 * 
	 * @return javax.swing.JToggleButton
	 */
	private javax.swing.JToggleButton getBtnDetails() {
		if(btnDetails == null) {
			btnDetails = new javax.swing.JToggleButton();
			btnDetails.setText("Detaylar");
			btnDetails.setMaximumSize(new java.awt.Dimension(90,25));
			btnDetails.setMinimumSize(new java.awt.Dimension(90,25));
			btnDetails.setPreferredSize(new java.awt.Dimension(90,25));
			btnDetails.setMnemonic(java.awt.event.KeyEvent.VK_D);
			btnDetails.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					spDetails.setVisible(btnDetails.isSelected());
					pack();
				}
			});
		}
		return btnDetails;
	}
	/**
	 * This method initializes btnClose
	 * 
	 * @return javax.swing.JButton
	 */
	private javax.swing.JButton getBtnClose() {
		if(btnClose == null) {
			btnClose = new javax.swing.JButton();
			btnClose.setText("Kapat");
			btnClose.setMaximumSize(new java.awt.Dimension(90,25));
			btnClose.setMinimumSize(new java.awt.Dimension(90,25));
			btnClose.setPreferredSize(new java.awt.Dimension(90,25));
			btnClose.setMnemonic(java.awt.event.KeyEvent.VK_K);
			btnClose.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					setVisible(false);
				}
			});
		}
		return btnClose;
	}
	/**
	 * This method initializes spDetails
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private javax.swing.JScrollPane getSpDetails() {
		if(spDetails == null) {
			spDetails = new javax.swing.JScrollPane();
			spDetails.setViewportView(getTxtDetails());
			spDetails.setVisible(false);
			spDetails.setAutoscrolls(false);
			spDetails.setPreferredSize(new java.awt.Dimension(24,150));
			spDetails.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			spDetails.setMinimumSize(new java.awt.Dimension(24,150));
		}
		return spDetails;
	}
	/**
	 * This method initializes spErrorMessage
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private javax.swing.JScrollPane getSpErrorMessage() {
		if(spErrorMessage == null) {
			spErrorMessage = new javax.swing.JScrollPane();
			spErrorMessage.setViewportView(getTxtErrorMessage());
			spErrorMessage.setPreferredSize(new java.awt.Dimension(350,75));
			spErrorMessage.setMinimumSize(new java.awt.Dimension(350,75));
		}
		return spErrorMessage;
	}
	/**
	 * This method initializes txtErrorMessage
	 * 
	 * @return javax.swing.JTextArea
	 */
	private javax.swing.JTextArea getTxtErrorMessage() {
		if(txtErrorMessage == null) {
			txtErrorMessage = new javax.swing.JTextArea();
			txtErrorMessage.setOpaque(false);
			txtErrorMessage.setEditable(false);
			txtErrorMessage.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12));
			txtErrorMessage.setLineWrap(true);
			txtErrorMessage.setWrapStyleWord(true);
		}
		return txtErrorMessage;
	}
	
	public void setThrowable(Throwable t) {
		StringBuffer detailsBuf = new StringBuffer(256);
		StringBuffer messageBuf = new StringBuffer(128);
		
		addMessage(t, messageBuf, 0);
		
		Throwable cause = t.getCause(); int indent = 0;
		while (cause != null) {
			if (indent > 0) {
				detailsBuf.append('\n');
			}
			
			addMessage(cause, detailsBuf, indent);
			
			cause = cause.getCause(); indent++;
		}
		
		txtErrorMessage.setText(messageBuf.toString());
		txtDetails.setText(detailsBuf.toString());
		btnDetails.setVisible(detailsBuf.length() > 0);
	}
	
	private void addMessage(Throwable t, StringBuffer buffer, int indent) {
		String msg = 
			t.getMessage() == null
				? t.getClass().getName()
				: t.getMessage();
		
		if (msg != null && msg.indexOf('\n') > -1) {
			msg = msg.replace('\n', ' ');
		}
		
		if (msg != null) {
			for (int i = 0; i < indent; i++) {
				buffer.append("...");
			}
			
			buffer.append(msg);
		}
	}

	/**
	 * This method initializes txtDetails
	 * 
	 * @return javax.swing.JTextArea
	 */
	private javax.swing.JTextArea getTxtDetails() {
		if(txtDetails == null) {
			txtDetails = new javax.swing.JTextArea();
			txtDetails.setOpaque(false);
			txtDetails.setEditable(false);
			txtDetails.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12));
		}
		return txtDetails;
	}
}  //  @jve:visual-info  decl-index=0 visual-constraint="10,10"
