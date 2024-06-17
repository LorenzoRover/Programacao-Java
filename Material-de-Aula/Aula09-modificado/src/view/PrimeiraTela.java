package view;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class PrimeiraTela {

	private JFrame frame;
	private JTextField tfNome;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Mostrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ola mundo");
			}
		});
		btnNewButton.setBounds(165, 125, 76, 34);
		frame.getContentPane().add(btnNewButton);
		
		tfNome = new JTextField("");
		tfNome.setBounds(155, 52, 86, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Painel com confirmação
				int resultado = JOptionPane.showConfirmDialog
						(null,"Deseja salvar o arquivo?","Confirmação",JOptionPane.YES_NO_CANCEL_OPTION);
				
				if (resultado == JOptionPane.YES_OPTION) {
					System.out.println("Você escolheu a opção sim");
				} else if (resultado == JOptionPane.NO_OPTION) {
					System.out.println("Você escolheu a opção não");
				} else if (resultado == JOptionPane.CANCEL_OPTION) {
					System.out.println("Você escolheu a opção cancelar");
				} else if (resultado == JOptionPane.CLOSED_OPTION) {
					System.out.println("Você fechou a janela");
				}
			}
		});
		btnSalvar.setBounds(33, 197, 89, 23);
		frame.getContentPane().add(btnSalvar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JTextField tfName = new JTextField();
				JTextField tfIdade = new JTextField();
				
				JPanel painel = new JPanel(new GridLayout(0,1));
				painel.add(new JLabel("Nome"));
				painel.add(tfName);
				painel.add(new JLabel("Idade"));
				painel.add(tfIdade);
				
				int resultado = JOptionPane.showConfirmDialog
						(null, painel,"Cadastro de Pessoa", JOptionPane.OK_CANCEL_OPTION);
				
				if (resultado == JOptionPane.OK_OPTION) {
					
					String nome = tfName.getText();
					int idade = Integer.parseInt(tfIdade.getText());
					
					//Pessoa pessoa = new Pessoa(nome,idade);
					//dao.cadastrarPessoa(pessoa);
				}
			}
		});
		btnCadastrar.setBounds(310, 199, 89, 23);
		frame.getContentPane().add(btnCadastrar);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		frame.getContentPane().add(menuBar);
		
		JMenu mnMenu1 = new JMenu("Opções");
		menuBar.add(mnMenu1);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int resultado = JOptionPane.showConfirmDialog
						(null, "Deseja sair?","Confirmação",JOptionPane.YES_NO_OPTION);
				
				if (resultado == JOptionPane.YES_OPTION) {
					
					frame.dispose();
				}
			}
		});
		mnMenu1.add(mntmSair);
		
		JMenu mnMenu2 = new JMenu("Editar");
		menuBar.add(mnMenu2);
		
		JMenu mnMenu3 = new JMenu("Exibir");
		menuBar.add(mnMenu3);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setIcon(new ImageIcon(PrimeiraTela.class.getResource("/img/cidade.png")));
		lblImagem.setBounds(33, 52, 24, 23);
		frame.getContentPane().add(lblImagem);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"Nome digitado: " + tfNome.getText());
		
		JOptionPane.showMessageDialog(null, "Cuidado! Isto é uma mensagem de aviso", "Aviso", JOptionPane.WARNING_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Cuidado! Isto é uma mensagem de Erro", "ERRO", JOptionPane.ERROR_MESSAGE);
		
		tfNome.setText("");
	}
}
