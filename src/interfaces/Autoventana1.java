package interfaces;



import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import java.awt.SystemColor;
import javax.swing.JLayeredPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Autoventana1 {

	private JFrame frmPasword;
	private JPasswordField passwordField;
	private JTextField txtIntroduceLaContrasea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Autoventana1 window = new Autoventana1();
					window.frmPasword.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Autoventana1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPasword = new JFrame();
		frmPasword.setTitle("\t\t\t\t\t\t\t\t\tPASWORD");
		frmPasword.setBounds(100, 100, 543, 307);
		frmPasword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.activeCaption);
		frmPasword.setJMenuBar(menuBar);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setToolTipText("");
		frmPasword.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(119, 151, 294, 31);
		layeredPane.add(passwordField);
		
		txtIntroduceLaContrasea = new JTextField();
		txtIntroduceLaContrasea.setBounds(119, 69, 294, 31);
		layeredPane.add(txtIntroduceLaContrasea);
		txtIntroduceLaContrasea.setColumns(10);
	}
}
