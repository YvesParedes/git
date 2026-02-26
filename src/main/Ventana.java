package main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

	public Ventana() {
		this.setSize(1000, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setLocationRelativeTo(null);
		this.setTitle("Login y Registro");		
		this.setLayout(null);		
		this.getContentPane().setBackground(Color.BLACK);
		
		JPanel login_container = new JPanel();
		login_container.setLayout(null);
		login_container.setSize(400, 520);
		login_container.setLocation(50, 50);
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

		JLabel tag_passwordIncorrect = new JLabel("¿Olvido su contraseña?");
		tag_passwordIncorrect.setSize(150, 30);
		tag_passwordIncorrect.setLocation(200, 250);
		tag_passwordIncorrect.setFont(new Font("Arial", Font.PLAIN, 12));
		login_container.add(tag_passwordIncorrect);
		
		JCheckBox rememberme = new JCheckBox("Recordarme");
		rememberme.setSize(150, 30);
		rememberme.setLocation(55, 250);
		rememberme.setOpaque(false);
		login_container.add(rememberme);
		
		JButton access_btn = new JButton("ACCEDER");
		access_btn.setSize(200, 45);
		access_btn.setLocation(100, 440);
		access_btn.setFont(new Font("Arial", Font.ITALIC, 18));
		login_container.add(access_btn);

		JPanel rgs_container = new JPanel();
		rgs_container.setBounds(520, 50, 400, 520);
		rgs_container.setBackground(Color.GREEN);
		rgs_container.setLayout(null);
		this.add(rgs_container);

		JLabel bio_tag = new JLabel("REGISTRO");
		bio_tag.setBounds(50, 20, 300, 50);
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setFont(new Font("Arial", Font.PLAIN, 24));
		bio_tag.setForeground(Color.BLACK);
		rgs_container.add(bio_tag);

		JLabel name_label = new JLabel("NOMBRE DE USUARIO:");
		name_label.setBounds(50, 90, 300, 35);
		name_label.setHorizontalAlignment(JLabel.CENTER);
		name_label.setFont(new Font("Arial", Font.PLAIN, 14));
		rgs_container.add(name_label);

		JTextField name_input = new JTextField();
		name_input.setBounds(50, 130, 300, 35);
		name_input.setBackground(Color.WHITE);
		name_input.setFont(new Font("Arial", Font.PLAIN, 14));
		rgs_container.add(name_input);

		JLabel bio_label = new JLabel("BIO");
		bio_label.setBounds(50, 180, 300, 25);
		bio_label.setHorizontalAlignment(JLabel.CENTER);
		bio_label.setFont(new Font("Arial", Font.PLAIN, 14));
		rgs_container.add(bio_label);

		JTextArea bio_text = new JTextArea();
		bio_text.setBounds(50, 210, 300, 70);
		bio_text.setBackground(Color.WHITE);
		bio_text.setFont(new Font("Arial", Font.PLAIN, 14));
		rgs_container.add(bio_text);

		JLabel pref_label = new JLabel("PREFERENCIAS");
		pref_label.setBounds(50, 290, 300, 25);
		pref_label.setHorizontalAlignment(JLabel.CENTER);
		pref_label.setFont(new Font("Arial", Font.PLAIN, 14));
		rgs_container.add(pref_label);

		JCheckBox opt_sweet = new JCheckBox("Dulces");
		opt_sweet.setBounds(50, 320, 100, 30);
		opt_sweet.setOpaque(false);
		opt_sweet.setFont(new Font("Arial", Font.PLAIN, 12));
		rgs_container.add(opt_sweet);

		JCheckBox opt_salty = new JCheckBox("Salado");
		opt_salty.setBounds(150, 320, 100, 30);
		opt_salty.setOpaque(false);
		opt_salty.setFont(new Font("Arial", Font.PLAIN, 12));
		rgs_container.add(opt_salty);

		JCheckBox opt_healty = new JCheckBox("Saludable");
		opt_healty.setBounds(250, 320, 100, 30);
		opt_healty.setOpaque(false);
		opt_healty.setFont(new Font("Arial", Font.PLAIN, 12));
		rgs_container.add(opt_healty);

		JLabel terms_label = new JLabel("TÉRMINOS");
		terms_label.setBounds(50, 360, 300, 30);
		terms_label.setHorizontalAlignment(JLabel.CENTER);
		terms_label.setFont(new Font("Arial", Font.PLAIN, 14));
		rgs_container.add(terms_label);

		JRadioButton accept_terms = new JRadioButton("Acepto los términos");
		accept_terms.setBounds(50, 395, 160, 30);
		accept_terms.setOpaque(false);
		accept_terms.setFont(new Font("Arial", Font.PLAIN, 12));
		rgs_container.add(accept_terms);

		JRadioButton reject_terms = new JRadioButton("No acepto los términos");
		reject_terms.setBounds(210, 395, 170, 30);
		reject_terms.setOpaque(false);
		reject_terms.setFont(new Font("Arial", Font.PLAIN, 12));
		rgs_container.add(reject_terms);

		ButtonGroup terms = new ButtonGroup();
		terms.add(accept_terms);
		terms.add(reject_terms);

		String[] colonias = {"Camino Real", "Arcoiris", "Villas del Encanto", "8 de Octubre"};
		JComboBox<String> colonias_combo = new JComboBox<>(colonias);
		colonias_combo.setBounds(50, 430, 300, 30);
		colonias_combo.setFont(new Font("Arial", Font.PLAIN, 14));
		rgs_container.add(colonias_combo);

		JButton register_btn = new JButton("Crear cuenta");
		register_btn.setBounds(50, 465, 300, 40);
		register_btn.setBackground(Color.LIGHT_GRAY);
		register_btn.setFont(new Font("Arial", Font.PLAIN, 18));
		rgs_container.add(register_btn);
		
		this.setVisible(true);
		this.repaint();
	}
}
