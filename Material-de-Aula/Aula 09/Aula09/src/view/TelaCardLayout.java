package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.CardLayout;
import javax.swing.JLabel;
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
		panel.setBackground(SystemColor.activeCaptionBorder);
		panel.setBounds(0, 49, 434, 212);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "tela1");
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Este é o painel 1");
		lblNewLabel.setBounds(135, 67, 132, 63);
		panel_1.add(lblNewLabel);

		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "tela2");
		panel_2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Este é o painel 2");
		lblNewLabel_1.setBounds(139, 61, 130, 75);
		panel_2.add(lblNewLabel_1);

		JPanel panel_3 = new JPanel();
		panel.add(panel_3, "tela3");
		panel_3.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Este é o painel 3");
		lblNewLabel_2.setBounds(145, 60, 122, 88);
		panel_3.add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Painel 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CardLayout cl = (CardLayout) panel.getLayout();
				cl.show(panel, "tela1");

			}
		});
		btnNewButton.setBounds(34, 11, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnPainel = new JButton("Painel 2");
		btnPainel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) panel.getLayout();
				cl.show(panel, "tela2");
			}
		});
		btnPainel.setBounds(161, 11, 89, 23);
		frame.getContentPane().add(btnPainel);

		JButton btnNewButton_1_1 = new JButton("Painel 3");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) panel.getLayout();
				cl.show(panel, "tela3");
			}
		});
		btnNewButton_1_1.setBounds(286, 11, 89, 23);
		frame.getContentPane().add(btnNewButton_1_1);
	}
}
