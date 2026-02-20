package main;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame {

	
	public Ventana() {
		//BASIC CONFIGS
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );		
		this.setLocationRelativeTo(null);
		this.setTitle("Hola");		
		this.setLayout((null));		
		//this.setBackground(Color.RED);
		//this.setOpacity(1);
		this.getContentPane().setBackground(Color.white);
		//this.setBounds(400, 400, 500, 500);
		
		//ADDING ELEMENTS
		JLabel tag_title = new JLabel();
		tag_title.setText("Hola");
		tag_title.setSize(100, 40);
		tag_title.setLocation(190, 200);
		tag_title.setOpaque(true);
		tag_title.setVerticalAlignment(JLabel.CENTER);
		tag_title.setHorizontalAlignment(JLabel.CENTER );
		this.add(tag_title);
	}

}
