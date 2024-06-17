package view;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

public class Tela {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
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
	public Tela() {
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
		panel.setBounds(0, 0, 434, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel floresta = new JPanel();
		floresta.setBackground(new Color(0, 128, 64));
		panel.add(floresta, "floresta");
		floresta.setLayout(null);
		
		JLabel lblFloresta = new JLabel("");
		lblFloresta.setBounds(243, 11, 157, 166);
		lblFloresta.setIcon(new ImageIcon(Tela.class.getResource("/img/floresta.jfif")));
		floresta.add(lblFloresta);
		
		JCheckBox chckbxPyton = new JCheckBox("Pyton");
		chckbxPyton.setBounds(6, 36, 97, 23);
		floresta.add(chckbxPyton);
		
		JCheckBox chckbxCPlus = new JCheckBox("C++");
		chckbxCPlus.setBounds(6, 62, 97, 23);
		floresta.add(chckbxCPlus);
		
		JCheckBox chckbxJava = new JCheckBox("Java");
		chckbxJava.setBounds(6, 88, 97, 23);
		floresta.add(chckbxJava);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxPyton.isSelected()) {
					String opcao = chckbxPyton.getText();
					
					JOptionPane.showMessageDialog(null, opcao + " selecionado");
				}
			}
		});
		
		btnNewButton.setBounds(6, 118, 89, 23);
		floresta.add(btnNewButton);
		
		JRadioButton rdbtnPyton = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnPyton);
		rdbtnPyton.setBounds(116, 36, 109, 23);
		floresta.add(rdbtnPyton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(116, 62, 109, 23);
		floresta.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(116, 88, 109, 23);
		floresta.add(rdbtnNewRadioButton_2);
		
		String[] opcoes = {"Opção 1", "Opção", "Opção3"};
		//List<Medico> medicos = dao.listarMedicos;
		JComboBox comboBox = new JComboBox(opcoes);
		
		comboBox.addItem("Opção 4");
		comboBox.addItem("Opção 5");
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String opcaoSelecionada = (String) comboBox.getSelectedItem();
				
				JOptionPane.showMessageDialog(null, "Opção selecionada " + opcaoSelecionada);
			}
		});
		comboBox.setBounds(136, 133, 89, 22);
		floresta.add(comboBox);
		
		MaskFormatter mascara;
		try {
			mascara = new MaskFormatter( "(##) #####-####");
			JFormattedTextField formattedTextField = new JFormattedTextField();
			formattedTextField.setBounds(6, 152, 89, 20);
			frame.getContentPane().add(formattedTextField);
			floresta.add(formattedTextField);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JPanel oceano = new JPanel();
		panel.add(oceano, "oceano");
		oceano.setLayout(null);
		
		JLabel lblOceano = new JLabel("");
		lblOceano.setIcon(new ImageIcon(Tela.class.getResource("/img/oceano.jfif")));
		lblOceano.setBounds(225, 36, 199, 166);
		oceano.add(lblOceano);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Exibir");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmFloresta = new JMenuItem("Floresta");
		mnNewMenu.add(mntmFloresta);
		
		mntmFloresta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)panel.getLayout();
				cl.show(panel, "floresta");
			}
		});
		
		JMenuItem mntmOceano = new JMenuItem("Oceano");
		mnNewMenu.add(mntmOceano);
		
		mntmOceano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)panel.getLayout();
				cl.show(panel, "oceano");
			}
		});
		
		
	}
}
