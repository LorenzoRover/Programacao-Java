package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCardLayout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCardLayout window = new TelaCardLayout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCardLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 51, 434, 210);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel.add(panel_1, "rosa");
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		panel.add(panel_2, "vermelho");
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLUE);
		panel.add(panel_3, "azul");
		panel_3.setLayout(null);
		
		JButton btnRosa = new JButton("Rosa");
		btnRosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CardLayout cl = (CardLayout) panel.getLayout();
				cl.show(panel,"rosa");
				
			}
		});
		btnRosa.setBounds(33, 11, 89, 23);
		frame.getContentPane().add(btnRosa);
		
		JButton btnVermelho = new JButton("Vermelho");
		btnVermelho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CardLayout cl = (CardLayout) panel.getLayout();
				cl.show(panel,"vermelho");
			}
		});
		btnVermelho.setBounds(156, 11, 89, 23);
		frame.getContentPane().add(btnVermelho);
		
		JButton btnNewAzul = new JButton("Azul");
		btnNewAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CardLayout cl = (CardLayout) panel.getLayout();
				cl.show(panel,"azul");
			}
		});
		btnNewAzul.setBounds(275, 11, 89, 23);
		frame.getContentPane().add(btnNewAzul);
	}
}
