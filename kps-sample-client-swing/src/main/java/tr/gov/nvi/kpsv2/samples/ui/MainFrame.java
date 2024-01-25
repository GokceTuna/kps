
package tr.gov.nvi.kpsv2.samples.ui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import tr.gov.nvi.kpsv2.samples.ui.config.DlgConfiguration;
import tr.gov.nvi.kpsv2.samples.ui.services.DlgKimlikNodanKisiSorgula;
import tr.gov.nvi.kpsv2.samples.ui.services.DlgKisiListesiSorgula;
import tr.gov.nvi.kpsv2.samples.ui.services.DlgBilesikKutukKisiSorgula;


public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private javax.swing.JPanel cpMainFrame = null;

	private JMenuBar mbMain = null;
	private JMenu mMain = null;
	private JMenu mActions = null;
	private JMenuItem miConfigure = null;
	private JMenuItem miExit = null;
	private JMenuItem miKimlikNumarasindanKisiBilgisiSorgula = null;
	private JMenuItem miKisiListesiSorgula = null;
	private JMenuItem miBilesikKutukSorgula = null;
	/**
	 * This is the default constructor
	 */
	public MainFrame() {
		super();
		initialize();
	}
	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setResizable(true);
		this.setJMenuBar(getMbMain());
		this.setSize(547, 453);
		this.setContentPane(getCpMainFrame());
		this.getGlassPane().setVisible(true);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setTitle("Mernis KPS �rnek Uygulamasi");
		this.addWindowListener(new java.awt.event.WindowAdapter() { 
			public void windowClosing(java.awt.event.WindowEvent e) {    
				close(true);
			}
		});
	}
	
	/**
	 * This method initializes cpMainFrame
	 * 
	 * @return javax.swing.JPanel
	 */
	private javax.swing.JPanel getCpMainFrame() {
		if(cpMainFrame == null) {
			cpMainFrame = new javax.swing.JPanel();
			cpMainFrame.setLayout(new java.awt.BorderLayout());
		}
		return cpMainFrame;
	}
	/**
	 * This method initializes mbMain	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */    
	private JMenuBar getMbMain() {
		if (mbMain == null) {
			mbMain = new JMenuBar();
			mbMain.add(getMMain());
			mbMain.add(getMActions());
		}
		return mbMain;
	}
	/**
	 * This method initializes mMain	
	 * 	
	 * @return javax.swing.JMenu	
	 */    
	private JMenu getMMain() {
		if (mMain == null) {
			mMain = new JMenu();
			mMain.setText("Dosya");
			mMain.add(getMiConfigure());
			mMain.add(getMiExit());
		}
		return mMain;
	}
	/**
	 * This method initializes mActions	
	 * 	
	 * @return javax.swing.JMenu	
	 */    
	private JMenu getMActions() {
		if (mActions == null) {
			mActions = new JMenu();
			mActions.setText("Servisler");
                        mActions.add(getMiBilesikKutukSorgula());
			mActions.add(getMiKimlikNumarasindanKisiBilgisiSorgula());
			mActions.add(getMiKisiListesiSorgula());
                        
		}
		return mActions;
	}
	/**
	 * This method initializes miConfigure	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getMiConfigure() {
		if (miConfigure == null) {
			miConfigure = new JMenuItem();
			miConfigure.setText("Ayarlar");
			miConfigure.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DlgConfiguration dlgConf = new DlgConfiguration(MainFrame.this);
					dlgConf.setModal(true);
					dlgConf.setVisible(true);
				}
			});
		}
		return miConfigure;
	}
	/**
	 * This method initializes miExit	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getMiExit() {
		if (miExit == null) {
			miExit = new JMenuItem();
			miExit.setText("��k��");
			miExit.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
					close(true);
				}
			});
		}
		return miExit;
	}
	/**
	 * This method initializes miKimlikNumarasindanKisiBilgisiSorgula	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getMiKimlikNumarasindanKisiBilgisiSorgula() {
		if (miKimlikNumarasindanKisiBilgisiSorgula == null) {
			miKimlikNumarasindanKisiBilgisiSorgula = new JMenuItem();
			miKimlikNumarasindanKisiBilgisiSorgula.setText("T.C. Kimlik Numaras�ndan Kisi Sorgula");
			miKimlikNumarasindanKisiBilgisiSorgula.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new DlgKimlikNodanKisiSorgula(MainFrame.this).setVisible(true);
				}
			});
		}
		return miKimlikNumarasindanKisiBilgisiSorgula;
	}
	
	private void close(boolean confirm) {
		boolean shouldClose = true;
		
		if (confirm) {
			shouldClose =
				JOptionPane.showConfirmDialog(
						MainFrame.this,
						"��kmak istedi�inizden emin misiniz?",
						"Mernis KPS �rnek Uygulamas�",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
		}
		
		if (shouldClose) {
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			dispose();
		}
	}
	
	/**
	 * This method initializes miKisiListesiSorgula	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */    
	private JMenuItem getMiKisiListesiSorgula() {
		if (miKisiListesiSorgula == null) {
			miKisiListesiSorgula = new JMenuItem();
			miKisiListesiSorgula.setText("Ki�i Listesi Sorgula");
			miKisiListesiSorgula.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new DlgKisiListesiSorgula(MainFrame.this).setVisible(true);
				}
			});
		}
		return miKisiListesiSorgula;
	}

        private JMenuItem getMiBilesikKutukSorgula() {
            if (miBilesikKutukSorgula == null) {
			miBilesikKutukSorgula = new JMenuItem();
			miBilesikKutukSorgula.setText("Bilesik Kutuk Sorgula");
			miBilesikKutukSorgula.addActionListener(new java.awt.event.ActionListener() { 
				public void actionPerformed(java.awt.event.ActionEvent e) {
					new DlgBilesikKutukKisiSorgula(MainFrame.this).setVisible(true);
				}
			});
		}
            return miBilesikKutukSorgula;
        }
        
        
	
}  //  @jve:decl-index=0:visual-constraint="10,10"
