package main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

	public Ventana() {
		this.setSize(500, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setLocationRelativeTo(null);
		this.setTitle("Login");		
		this.setLayout(null);		
		this.getContentPane().setBackground(Color.WHITE);
		
		JPanel login_container = new JPanel();
		login_container.setLayout(null);
		login_container.setSize(400, 450);
		login_container.setLocation(45, 30);
		login_container.setBackground(new Color(255, 192, 203));
		this.add(login_container);
		
		JLabel tag_title = new JLabel("BIENVENIDO");
		tag_title.setSize(300, 40);
		tag_title.setLocation(50, 30);
		tag_title.setFont(new Font("Arial", Font.BOLD, 26));
		tag_title.setHorizontalAlignment(SwingConstants.CENTER);
		login_container.add(tag_title);
		
		JLabel tag_email = new JLabel("Correo electrónico:");
		tag_email.setSize(200, 20);
		tag_email.setLocation(55, 100);
		login_container.add(tag_email);
		
		JTextField email_input = new JTextField();
		email_input.setSize(280, 35);
		email_input.setLocation(55, 125);
		login_container.add(email_input);
		
		JLabel tag_password = new JLabel("Contraseña:");
		tag_password.setSize(200, 20);
		tag_password.setLocation(55, 180);
		login_container.add(tag_password);
		
		JPasswordField password_input = new JPasswordField();
		password_input.setSize(280, 35);
		password_input.setLocation(55, 205);
		login_container.add(password_input);
		
		JCheckBox rememberme = new JCheckBox("Recordarme");
		rememberme.setSize(150, 30);
		rememberme.setLocation(55, 250);
		rememberme.setOpaque(false);
		login_container.add(rememberme);
		
		JButton access_btn = new JButton("ACCEDER");
		access_btn.setSize(200, 45);
		access_btn.setLocation(100, 320);
		login_container.add(access_btn);
		
		this.setVisible(true);
		this.repaint();
	}
}
