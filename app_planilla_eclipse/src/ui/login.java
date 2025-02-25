package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controler.EmpleadoDAO;
import model.Empleado;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtDni;
	JPasswordField txtPasswordd;
	private JPanel contentPane;

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
		setBounds(0, 0, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);

		JPanel pnlLogin = new JPanel();
		pnlLogin.setBounds(0, 0, 400, 60);
		pnlLogin.setBackground(new Color(94, 17, 90));
		pnlLogin.setLayout(null);
		getContentPane().add(pnlLogin);

		JLabel imgLogo = new JLabel();
		imgLogo.setIcon(new ImageIcon(login.class.getResource("/ui/img/logo.png")));
		imgLogo.setBounds(96, 8, 208, 43);
		pnlLogin.add(imgLogo);

		JLabel imgCerrar = new JLabel();
		imgCerrar.setIcon(new ImageIcon(login.class.getResource("/ui/img/salir.png")));
		imgCerrar.setBounds(370, 18, 24, 24);
		pnlLogin.add(imgCerrar);

		JLabel lblDni = new JLabel("Dni :");
		lblDni.setBounds(135, 110, 80, 30);
		getContentPane().add(lblDni);

		JLabel lblPasswordd = new JLabel("Password :");
		lblPasswordd.setBounds(135, 160, 80, 30);
		getContentPane().add(lblPasswordd);

		txtDni = new JTextField();
		txtDni.setBounds(220, 110, 80, 30);
		txtDni.setColumns(8);
		txtDni.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDni);

		txtPasswordd = new JPasswordField();
		txtPasswordd.setBounds(220, 160, 80, 30);
		txtPasswordd.setColumns(6);
		txtPasswordd.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPasswordd);

		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(90, 220, 100, 30);
		btnIniciar.setBackground(new Color(94, 17, 90));
		btnIniciar.setForeground(Color.WHITE);
		btnIniciar.setBorderPainted(false);
		btnIniciar.setFocusPainted(false);
		btnIniciar.setMnemonic('i');
		btnIniciar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		getContentPane().add(btnIniciar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(210, 220, 100, 30);
		btnCancelar.setBackground(new Color(94, 17, 90));
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setBorderPainted(false);
		btnCancelar.setFocusPainted(false);
		btnCancelar.setMnemonic('a');
		btnCancelar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCancelar.addActionListener(e -> System.exit(0));
		getContentPane().add(btnCancelar);

		txtDni.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txt_focus(txtDni, true);
			}

			@Override
			public void focusLost(FocusEvent e) {
				txt_focus(txtDni, false);
			}
		});

		txtDni.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				txt_keyTyped(txtDni, e);
			}
		});

		txtPasswordd.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				txt_keyTyped(txtPasswordd, e);
			}
		});

		txtPasswordd.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txt_focus(txtPasswordd, true);
			}

			@Override
			public void focusLost(FocusEvent e) {
				txt_focus(txtPasswordd, false);
			}
		});

		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIniciar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btn_focus(btnIniciar, true);
			}

			public void mouseExited(MouseEvent e) {
				btn_focus(btnIniciar, false);
			}
		});
		btnIniciar.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				btn_focus(btnIniciar, true);
			}

			@Override
			public void focusLost(FocusEvent e) {
				btn_focus(btnIniciar, false);
			}
		});

		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btn_focus(btnCancelar, true);
			}

			public void mouseExited(MouseEvent e) {
				btn_focus(btnCancelar, false);
			}
		});
		btnCancelar.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				btn_focus(btnCancelar, true);
			}

			@Override
			public void focusLost(FocusEvent e) {
				btn_focus(btnCancelar, false);
			}
		});
	}

	protected void btn_focus(JButton btn, boolean bFocus) {
		btn.setBackground(bFocus ? Color.BLACK : new Color(94, 17, 90));

	}

	protected void txt_focus(JTextField txt, boolean bFocus) {
		txt.setBackground(bFocus ? Color.YELLOW : Color.WHITE);

	}
	protected void btnIniciar_actionPerformed() {
		String sDni = txtDni.getText();
		String sPasswordd = String.valueOf(txtPasswordd.getPassword());
		String sMensaje = "";
		
		if (sDni.isEmpty()) sMensaje = "Ingrese Dni";
		else if(sPasswordd.isEmpty() || sPasswordd.length() < 6) sMensaje = "ingrese passwordd";
		
		if( sMensaje.isEmpty()) {
			Empleado empleado =new Empleado();
			empleado.setDni(sDni);
			empleado.setPasswordd(sPasswordd);
			if(new EmpleadoDAO().login(empleado)) {
				planilla planilla = new planilla();
				planilla.setEmpleado(empleado);
				planilla.setVisible(true);
				
			}else sMensaje = "DNI Y/O password invalido";
					
		}
		
		
		if(sMensaje.isEmpty()) {
			
			
		}else btnCancelar_actionPerformed();
		
		
		
		
	}

	
	protected void btnCancelar_actionPerformed() {
		txtDni.setText("");
		txtPasswordd.setText("");
		txtDni.requestFocus();
		
	}
	
	private void txt_keyTyped(JTextField txt, KeyEvent e) {
		char tecla = e.getKeyChar();
		if (!Character.isDigit(tecla) || txt.getText().length() >= txt.getColumns()) {
			e.consume();
		}
	}

}