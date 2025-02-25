package ui;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;

import javax.swing.border.EmptyBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class login extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txtDni;
	JPasswordField txtPasswordd;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300); /*posicion y tamaño*/
		getContentPane().setLayout(null);                 /*posicionar los objetos donde quiera*/
		setLocationRelativeTo(null);      /* centra el formulario en la pantalla*/
		setUndecorated(true);          /*quita el borde*/
		
		JPanel pnlLogin = new JPanel();
		pnlLogin.setBounds(0 , 0, 450, 60);
		pnlLogin.setBackground(new Color(94, 17, 90 ));
		getContentPane().add(pnlLogin);
				
		JLabel imgLogo = new JLabel();
		imgLogo.setIcon(new ImageIcon(login.class.getResource(getName())));
		imgLogo.setBounds(96, 8, 208, 43);
		pnlLogin.add(imgLogo);
		
		JLabel imgCerrar = new JLabel();
		imgLogo.setIcon(new ImageIcon(login.class.getResource(getName())));
		imgLogo.setBounds(370, 18, 24, 24);
		pnlLogin.add(imgLogo);
		
		JLabel lblDni = new JLabel("DNI :");
		lblDni.setBounds(135,80,80,30);
		getContentPane().add(lblDni);
		
		JLabel lblPasswordd = new JLabel("Password :");
		lblPasswordd.setBounds(135,160,80,30);
		getContentPane().add(lblPasswordd);
		
		
		txtDni = new JPasswordField();
		txtDni.setBounds(212, 80, 80, 30);
		txtDni.setColumns(6);
		txtDni.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDni);
		
		txtPasswordd = new JPasswordField();
		txtPasswordd.setBounds(212, 160, 80, 30);
		txtPasswordd.setColumns(6);
		txtPasswordd.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPasswordd);
	
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(90,220,100,30);
		btnIniciar.setBackground(new Color(94, 17, 90));
		btnIniciar.setBorderPainted(false);
		btnIniciar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnIniciar.setFocusPainted(false);
		btnIniciar.setForeground(Color.WHITE);
		btnIniciar.setMnemonic(0);
		getContentPane().add(btnIniciar);
		
		JButton btnCerrar = new JButton("cerrar");
		btnCerrar.setBounds(300,220,100,30);
		btnCerrar.setBackground(new Color(94, 17, 90));
		btnCerrar.setBorderPainted(false);
		btnCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCerrar.setFocusPainted(false);
		btnCerrar.setForeground(Color.WHITE);
		btnCerrar.setMnemonic(0);
		getContentPane().add(btnCerrar);
		
		
		
		
		
		
	}
}
