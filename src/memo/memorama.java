package memo;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class memorama {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memorama window = new memorama();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public memorama() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(210, 210, 255));

		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(102, 230, 240));
		panelSuperior.setBounds(0, 0, 500, 60);
		panelSuperior.setLayout(null);
		frame.getContentPane().add(panelSuperior);
		
		JLabel lblPuntuacion = new JLabel("0");
		lblPuntuacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntuacion.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblPuntuacion.setBounds(0, 10, 500, 40);
		panelSuperior.add(lblPuntuacion);

		JPanel panelTablero = new JPanel();
		panelTablero.setOpaque(false);
		panelTablero.setBounds(10, 70, 465, 420);
		panelTablero.setLayout(null);
		frame.getContentPane().add(panelTablero);

		int filas = 3;
		int columnas = 4;
		int gap = 10;
		int btnAncho = (panelTablero.getWidth() - (columnas - 1) * gap) / columnas;
		int btnAlto = (panelTablero.getHeight() - (filas - 1) * gap) / filas;

		LineBorder bordeBoton = new LineBorder(new Color(190, 190, 255), 2, true);

		for (int fila = 0; fila < filas; fila++) {
			for (int col = 0; col < columnas; col++) {
				JButton btn = new JButton("");
				int x = col * (btnAncho + gap);
				int y = fila * (btnAlto + gap);
				btn.setBounds(x, y, btnAncho, btnAlto);
				btn.setBackground(Color.WHITE);
				btn.setFont(new Font("Tahoma", Font.BOLD, 12));
				btn.setFocusable(false);
				btn.setBorder(bordeBoton);
				panelTablero.add(btn);
			}
		}

		JPanel panelInferior = new JPanel();
		panelInferior.setBackground(new Color(245, 245, 170));
		panelInferior.setBounds(0, 500, 500, 65);
		panelInferior.setBorder(new MatteBorder(2, 0, 0, 0, new Color(190, 190, 255)));
		panelInferior.setLayout(null);
		frame.getContentPane().add(panelInferior);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReiniciar.setFocusable(false);
		btnReiniciar.setBackground(Color.WHITE);
		btnReiniciar.setBounds(190, 15, 120, 30);
		panelInferior.add(btnReiniciar);
	}
}