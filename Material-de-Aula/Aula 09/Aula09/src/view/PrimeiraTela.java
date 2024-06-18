package view;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class PrimeiraTela {

	private JFrame frame;
	private JTextField tfNome;
	private JButton btnSair;
	private JButton btnCadastrar;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraTela window = new PrimeiraTela();
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
	public PrimeiraTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 618, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(166, 88, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfNome = new JTextField();
		tfNome.setBounds(126, 119, 139, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Pegando o valor digitado no campo de texto
				String nome = tfNome.getText();	
				
				
				// Abrindo painel de opções
				JOptionPane.
				showMessageDialog(
				null, "Bem vindo "+ nome );
				
				JOptionPane.showMessageDialog
				(null, "Esta é uma mensagem de aviso", "AVISO",
				JOptionPane.WARNING_MESSAGE);
				
				JOptionPane.showMessageDialog
				(null, "Esta é uma mensagem de ERRO", "ERRO",
				JOptionPane.ERROR_MESSAGE);
				
				
				
				
				
				tfNome.setText("");
				
				
				
			}
		});
		btnMostrar.setBounds(155, 150, 89, 23);
		frame.getContentPane().add(btnMostrar);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int resultado = 
				JOptionPane.showConfirmDialog(
				null,"Tem certeza que deseja sair","Confirmação",
				JOptionPane.YES_NO_CANCEL_OPTION);
				
				if (resultado == JOptionPane.YES_OPTION) {
					frame.dispose();
				} else if( resultado == JOptionPane.NO_OPTION) {
					System.out.println("Usuario escolheu a opção não");
				} else if( resultado == JOptionPane.CANCEL_OPTION) {
					System.out.println("Usuario escolheu a opção cancelar");
				} else if( resultado == JOptionPane.CLOSED_OPTION) {
					System.out.println("Usuario fechou a janela");
				}
				
				
				
			}
		});
		btnSair.setBounds(32, 193, 89, 23);
		frame.getContentPane().add(btnSair);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Criando o painel
				JPanel painel = new JPanel( new GridLayout(0,1));
				
				// Criando os labels e campos de texto
				JLabel lblNome = new JLabel("Nome");
				JTextField tfName = new JTextField();
				JLabel lblIdade = new JLabel("Idade");
				JTextField tfIdade = new JTextField();
				
				// Adicionando os labels e campos de texto no painel
				painel.add(lblNome);
				painel.add(tfName);
				painel.add(lblIdade);
				painel.add(tfIdade);
				
				// Criando caixa de dialogo com o painel criado
				int resultado = JOptionPane.showConfirmDialog
				(null,painel, "Cadastro de pessoa",
				JOptionPane.OK_CANCEL_OPTION);
				
				if (resultado == JOptionPane.OK_OPTION) {
					
					String nome = tfName.getText();
					int idade = Integer.parseInt(tfIdade.getText());
//					Pessoa pessoa = new Pessoa(nome,idade);					
//					dao.cadastrarPessoa(pessoa);
					
					System.out.println(nome);
					System.out.println(idade);
					
					
					
					
					
					
					
				}
				
				
				
				
			}
		});
		btnCadastrar.setBounds(271, 193, 89, 23);
		frame.getContentPane().add(btnCadastrar);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Pressionar");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				// Analisar se o botão esta selecionado
				 if (tglbtnNewToggleButton.isSelected()) {
					 JOptionPane.
					 showMessageDialog(
					 null,"O botão esta pressionado" );
				 } else {
					 JOptionPane.
					 showMessageDialog(
					 null,"O botão não esta pressionado" );					 
				 }
				
				
			}
		});
		tglbtnNewToggleButton.setBounds(48, 268, 121, 23);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		JRadioButton rdbtnPython = new JRadioButton("Python");
		buttonGroup.add(rdbtnPython);
		rdbtnPython.setBounds(32, 29, 109, 23);
		frame.getContentPane().add(rdbtnPython);
		
		JRadioButton rdbtnJava = new JRadioButton("Java");
		buttonGroup.add(rdbtnJava);
		rdbtnJava.setBounds(32, 53, 109, 23);
		frame.getContentPane().add(rdbtnJava);
		
		JRadioButton rdbtnCplus = new JRadioButton("C++");
		buttonGroup.add(rdbtnCplus);
		rdbtnCplus.setBounds(32, 79, 109, 23);
		frame.getContentPane().add(rdbtnCplus);
		
		JButton btnMostrar1 = new JButton("Mostrar");
		btnMostrar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				if (rdbtnPython.isSelected()) {
					
					String nome = rdbtnPython.getText();					
					JOptionPane.showMessageDialog(
					null, nome + " foi selecionado");
				}
				
				if (rdbtnJava.isSelected()) {
					
					String nome = rdbtnJava.getText();
					JOptionPane.showMessageDialog(
					null, nome + " foi selecionado");
				}
				
				if (rdbtnCplus.isSelected()) {
					JOptionPane.showMessageDialog(
					null, "C++ foi selecionado");
				}
				
			}
		});
		btnMostrar1.setBounds(27, 104, 89, 23);
		frame.getContentPane().add(btnMostrar1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Amarelo");
		chckbxNewCheckBox.setBounds(168, 7, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxAzul = new JCheckBox("Azul");
		chckbxAzul.setBounds(166, 29, 97, 23);
		frame.getContentPane().add(chckbxAzul);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Vermelho");
		chckbxNewCheckBox_1_1.setBounds(166, 53, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1_1);
		
		String[] opcoes = {"Opção 1","Opção 2","Opção 3", "Opção 4"};
		
		JComboBox comboBox = new JComboBox(opcoes);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String opcaoSelecionada 
				= (String) comboBox.getSelectedItem();
				
				JOptionPane.showMessageDialog
				(null, "Selecionado: " + opcaoSelecionada);
				
			}
		});
		comboBox.setBounds(402, 104, 89, 22);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("Opção 5");
		comboBox.addItem("Opção 6");
		
		
		
		JButton btnAnalisar = new JButton("Analisar");
		btnAnalisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String opcaoSelecionada 
				= (String) comboBox.getSelectedItem();
				
				JOptionPane.showMessageDialog
				(null, "Selecionado: " + opcaoSelecionada);
				
				
			}
		});
		btnAnalisar.setBounds(402, 68, 89, 23);
		frame.getContentPane().add(btnAnalisar);
	}
}
