package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
		
		try {
			Image IconImage = ImageIO.read(getClass().getResource("/image/fantasma.png"));
			this.setIconImage(IconImage);
		
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		JMenuBar barra = new JMenuBar();
		this.setJMenuBar(barra);
		
		JMenu menu1 = new JMenu("Archivo");
		barra.add(menu1);
		
		JMenu menu2 = new JMenu("Ayuda");
		barra.add(menu2);
		
		JMenuItem opt1_mi = new JMenuItem("Abrir");
		menu1.add(opt1_mi);
		
		JMenuItem opt2_mi = new JMenuItem("Nuevo");
		menu1.add(opt2_mi);
		
		JMenuItem opt3_mi = new JMenuItem("Cerrar");
		menu1.add(opt3_mi);
		
		menu1.addSeparator();
		
		JMenu menu3 = new JMenu("Guardar");
		menu1.add(menu3);
		
		JMenuItem opt4_mi = new JMenuItem("Guardar");
		menu3.add(opt4_mi);
		
		JMenuItem opt5_mi = new JMenuItem("Guardar como");
		menu3.add(opt5_mi);
		
		this.paint();
		
		this.setVisible(true);
		this.repaint();
	}
	
	public void login() {
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
	}

	public void registro() {
		JPanel rgs_container = new JPanel();
		rgs_container.setBounds(520, 50, 400, 520);
		rgs_container.setBackground(Color.GREEN);
		rgs_container.setLayout(null);
		this.add(rgs_container);
		
		JButton register_btn = new JButton("Crear cuenta");
		register_btn.setBounds(50, 465, 300, 40);
		register_btn.setBackground(Color.LIGHT_GRAY);
		register_btn.setFont(new Font("Arial", Font.PLAIN, 18));
		rgs_container.add(register_btn);
		
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
	}

	public void user() {
		JPanel user_container = new JPanel();
		user_container.setSize(900, 570);
		user_container.setLocation(50, 50);
		user_container.setBackground(Color.pink);
		user_container.setLayout(null);
		this.add(user_container);
		
		JLabel tag_title = new JLabel("USUARIOS");
		tag_title.setSize(300, 40);
		tag_title.setLocation(270, 30);
		tag_title.setFont(new Font("Segoe Script", Font.BOLD, 26));
		tag_title.setHorizontalAlignment(SwingConstants.CENTER);
		user_container.add(tag_title);
		
		JLabel tag_users = new JLabel("USUARIOS");
		tag_users.setSize(200, 200);
		tag_users.setLocation(90, 20);
		tag_users.setFont(new Font("Segoe Script", Font.BOLD, 26));
		tag_users.setHorizontalAlignment(SwingConstants.CENTER);
		user_container.add(tag_users);
		
		JLabel tag_number = new JLabel("11");
		tag_number.setSize(200, 200);
		tag_number.setLocation(90, 50);
		tag_number.setFont(new Font("Segoe Script", Font.BOLD, 26));
		tag_number.setHorizontalAlignment(SwingConstants.CENTER);
		user_container.add(tag_number);
		
		JButton download_btn = new JButton("Descargar");
		download_btn.setSize(120, 35);
		download_btn.setLocation(550, 120);
		download_btn.setFont(new Font("Arial", Font.ITALIC, 14));
		user_container.add(download_btn);
		
		JButton add_btn = new JButton("Añadir");
		add_btn.setSize(120, 35);
		add_btn.setLocation(700, 120);
		add_btn.setFont(new Font("Arial", Font.ITALIC, 14));
		user_container.add(add_btn);
		
		String [] table_head = {"No. Control", "Nombre", "Apellidos", "Correo electronico", "Semestre", "Carrera", "Acciones"};
		
		Object[][] table_body = {
				{"21210450", "Ana", "García López", "ana.garcia@instituto.edu.mx", "6", "Ingeniería en Sistemas", "Editar/Eliminar"},
				{"21210451", "Luis", "Martínez Ruiz", "luis.mtz@instituto.edu.mx", "4", "Licenciatura en Administración", "Editar/Eliminar"},
				{"21210452", "Carla", "Estrada Solís", "c.estrada@instituto.edu.mx", "8", "Ingeniería Industrial", "Editar/Eliminar"},
				{"21210453", "Jorge", "Pérez Gómez", "jorge.perez@instituto.edu.mx", "2", "Ingeniería Mecatrónica", "Editar/Eliminar"},
				{"21210454", "Sofía", "Hernández Vera", "sofia.hdez@instituto.edu.mx", "5", "Arquitectura", "Editar/Eliminar"},
				{"21210455", "Ricardo", "Mendoza Soto", "r.mendoza@instituto.edu.mx", "3", "Ingeniería Eléctrica", "Editar/Eliminar"},
				{"21210456", "Elena", "Torres Blanca", "e.torres@instituto.edu.mx", "7", "Ingeniería Química", "Editar/Eliminar"},
				{"21210457", "Mauricio", "Rivas Castro", "m.rivas@instituto.edu.mx", "1", "Ingeniería Civil", "Editar/Eliminar"},
				{"21210458", "Valeria", "Luna Parra", "v.luna@instituto.edu.mx", "9", "Ingeniería Biomédica", "Editar/Eliminar"},
				{"21210459", "Andrés", "Cano Duarte", "a.cano@instituto.edu.mx", "4", "Ingeniería Ambiental", "Editar/Eliminar"},
				{"21210460", "Beatriz", "Salas Peña", "b.salas@instituto.edu.mx", "2", "Licenciatura en Derecho", "Editar/Eliminar"}
			};
		
		JTable students = new JTable(table_body,table_head);
		
		JScrollPane final_table = new JScrollPane(students);
		final_table.setSize(700, 200);
		final_table.setLocation(100, 175);
		
		user_container.add(final_table);
	}
	
	public void calculadora() {
		JPanel baseCalc = new JPanel();
		baseCalc.setLayout(null);
		baseCalc.setSize(400, 550);
		baseCalc.setLocation(300, 50);
		baseCalc.setBackground(Color.gray);
		this.add(baseCalc);
		
		JLabel field = new JLabel("180.00");
		field.setSize(365, 60);
		field.setLocation(10, 10);
		field.setOpaque(true);
		field.setBackground(Color.white);
		field.setFont(new Font("Arial", Font.BOLD,22));
		field.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
		baseCalc.add(field);
		
		int cor_x = 10, cor_y = 80;
		
		for (int i = 0; i < 20; i++) {
			String[] botones = {"CE","","","","7","8","9","÷","4","5","6","X","1","2","3","-","0",".","=","+"};
			
			JButton ce = new JButton(botones[i]);
			ce.setSize(85, 85);
			ce.setLocation(cor_x, cor_y);
			
			cor_x += 95;
			baseCalc.add(ce);
			
			if ((i + 1) % 4 == 0) {
	            cor_x = 10;
	            cor_y += 95;
			}
		}
	
	
	}
	
	public void paint() {

        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                Graphics2D g2d = (Graphics2D) g;
                
                g.drawLine(0, 0, 1000, 700);
                
                g2d.setColor(Color.orange);
                g2d.drawOval(100, 100, 150, 50);
                
                g2d.setStroke(new BasicStroke(3));
                g2d.setColor(Color.MAGENTA);
                g2d.drawPolygon(new int [] {300, 100, 500},new int [] {100, 300, 300},3);
                
                g2d.drawRect(250, 300, 100, 100);
                
                g2d.drawRoundRect(500, 150, 100, 100, 10, 10);
                
                g2d.drawArc(400, 100, 100, 100, 0, 90);
                
                g2d.setFont(new Font("Arial",Font.BOLD,22));
                g2d.drawString("Hola", 100, 100);
                
                g2d.setColor(Color.red);
                g2d.fillOval(500, 50, 50, 50);
                
                g2d.fillPolygon(new int [] {500, 300, 700},new int [] {300, 500, 500},3);
                
                g2d.fillRect(500, 500, 500, 500);
                
                g2d.setColor(Color.orange);
                g2d.fillRoundRect(500, 500, 100, 100, 10, 10);
                
                g2d.fillArc(400, 150, 100, 100, 0, 300);
                
                BufferedImage image;
				try {
					image = ImageIO.read(new File("src/image/jarvis.png"));
					  g2d.drawImage(image, 0, 0, null);
					  
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
              
            }
        };
        pane.setSize(1000, 700);
        pane.setLocation(0, 0);
        this.add(pane);
	}
}

