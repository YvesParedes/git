package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    private JMenuItem itemLogin, itemRegistro, itemRecuperar, itemAlta, itemBaja, itemConsultar, itemAyuda1, itemAyuda2, itemAyuda3;

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
            System.err.println("Icono no encontrado");
        }

        JMenuBar barra = new JMenuBar();
        this.setJMenuBar(barra);

        JMenu menu1 = new JMenu("Archivo");
        JMenu menu2 = new JMenu("Ayuda");
        JMenu menuUsuarios = new JMenu("Usuarios");
        barra.add(menu1);
        barra.add(menuUsuarios);
        barra.add(menu2);

        itemLogin = new JMenuItem("Login");
        itemRegistro = new JMenuItem("Registro");
        itemRecuperar = new JMenuItem("Recuperar");
        menu1.add(itemLogin);
        menu1.add(itemRegistro);
        menu1.add(itemRecuperar);

        itemAlta = new JMenuItem("Alta");
        itemBaja = new JMenuItem("Baja");
        itemConsultar = new JMenuItem("Consultar");
        menuUsuarios.add(itemAlta);
        menuUsuarios.add(itemBaja);
        menuUsuarios.add(itemConsultar);

        itemAyuda1 = new JMenuItem("Crear Usuario");
        itemAyuda2 = new JMenuItem("Acceso");
        itemAyuda3 = new JMenuItem("Recuperar Pass");
        menu2.add(itemAyuda1);
        menu2.add(itemAyuda2);
        menu2.add(itemAyuda3);

        ActionListener eventosMenu = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if (src == itemLogin) login();
                else if (src == itemRegistro) registro();
                else if (src == itemRecuperar) recuperacion();
                else if (src == itemAlta) altaUsuario();
                else if (src == itemBaja) bajaUsuario();
                else if (src == itemConsultar) consultarUsuario();
                else if (src == itemAyuda1) ayudaCrearUsuario();
                else if (src == itemAyuda2) ayudaAcceso();
                else if (src == itemAyuda3) ayudaRecuperar();
            }
        };

        itemLogin.addActionListener(eventosMenu);
        itemRegistro.addActionListener(eventosMenu);
        itemRecuperar.addActionListener(eventosMenu);
        itemAlta.addActionListener(eventosMenu);
        itemBaja.addActionListener(eventosMenu);
        itemConsultar.addActionListener(eventosMenu);
        itemAyuda1.addActionListener(eventosMenu);
        itemAyuda2.addActionListener(eventosMenu);
        itemAyuda3.addActionListener(eventosMenu);

        login();
        this.setVisible(true);
    }

    private void cambiarPanel(JPanel nuevoPanel) {
        this.getContentPane().removeAll();
        this.add(nuevoPanel);
        this.revalidate();
        this.repaint();
    }

    public void login() {
        JPanel principal = new JPanel(null);
        principal.setSize(1000, 700);
        principal.setBackground(Color.BLACK);

        JPanel login_container = new JPanel();
        login_container.setLayout(null);
        login_container.setSize(400, 520);
        login_container.setLocation(50, 50);
        login_container.setBackground(new Color(255, 192, 203));
        principal.add(login_container);

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

        JButton access_btn = new JButton("ACCEDER");
        access_btn.setSize(200, 45);
        access_btn.setLocation(100, 440);
        access_btn.setFont(new Font("Arial", Font.ITALIC, 18));
        access_btn.addActionListener(e -> {
            if (email_input.getText().isEmpty()) email_input.setBorder(BorderFactory.createLineBorder(Color.red, 3));
            else email_input.setBorder(BorderFactory.createLineBorder(Color.green, 3));
            
            if (new String(password_input.getPassword()).isEmpty()) password_input.setBorder(BorderFactory.createLineBorder(Color.red, 3));
            else password_input.setBorder(BorderFactory.createLineBorder(Color.green, 3));
        });
        login_container.add(access_btn);

        cambiarPanel(principal);
    }

    public void registro() {
        JPanel principal = new JPanel(null);
        principal.setSize(1000, 700);
        principal.setBackground(Color.BLACK);

        JPanel rgs_container = new JPanel();
        rgs_container.setBounds(520, 50, 400, 520);
        rgs_container.setBackground(Color.GREEN);
        rgs_container.setLayout(null);
        principal.add(rgs_container);

        JLabel bio_tag = new JLabel("REGISTRO");
        bio_tag.setBounds(50, 20, 300, 50);
        bio_tag.setHorizontalAlignment(JLabel.CENTER);
        bio_tag.setFont(new Font("Arial", Font.PLAIN, 24));
        rgs_container.add(bio_tag);

        JTextField name_input = new JTextField();
        name_input.setBounds(50, 130, 300, 35);
        rgs_container.add(name_input);

        JTextArea bio_text = new JTextArea();
        bio_text.setBounds(50, 210, 300, 70);
        rgs_container.add(bio_text);

        JCheckBox opt_sweet = new JCheckBox("Dulces");
        opt_sweet.setBounds(50, 320, 100, 30);
        opt_sweet.setOpaque(false);
        rgs_container.add(opt_sweet);

        JRadioButton accept_terms = new JRadioButton("Acepto");
        accept_terms.setBounds(50, 395, 100, 30);
        accept_terms.setOpaque(false);
        rgs_container.add(accept_terms);

        ButtonGroup terms = new ButtonGroup();
        terms.add(accept_terms);

        JButton register_btn = new JButton("Crear cuenta");
        register_btn.setBounds(50, 465, 300, 40);
        rgs_container.add(register_btn);

        cambiarPanel(principal);
    }

    public void recuperacion() {
        JPanel p = crearPanelBase("Recuperación de Cuenta");
        cambiarPanel(p);
    }

    public void altaUsuario() {
        JPanel p = crearPanelBase("Alta de Usuario");
        cambiarPanel(p);
    }

    public void bajaUsuario() {
        JPanel p = crearPanelBase("Baja de Usuario");
        cambiarPanel(p);
    }

    public void consultarUsuario() {
        JPanel p = crearPanelBase("Consultar Usuarios");
        cambiarPanel(p);
    }

    public void ayudaCrearUsuario() {
        JPanel p = crearPanelBase("Ayuda: Crear Usuario");
        cambiarPanel(p);
    }

    public void ayudaAcceso() {
        JPanel p = crearPanelBase("Ayuda: Acceso Sistema");
        cambiarPanel(p);
    }

    public void ayudaRecuperar() {
        JPanel p = crearPanelBase("Ayuda: Recuperar Contraseña");
        cambiarPanel(p);
    }

    private JPanel crearPanelBase(String tituloTexto) {
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.LIGHT_GRAY);
        p.setSize(1000, 700);

        JLabel titulo = new JLabel(tituloTexto);
        titulo.setBounds(300, 50, 400, 40);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setHorizontalAlignment(JLabel.CENTER);
        p.add(titulo);

        JButton volver = new JButton("Volver al Login");
        volver.setBounds(400, 150, 200, 40);
        volver.addActionListener(e -> login());
        p.add(volver);

        return p;
    }
}