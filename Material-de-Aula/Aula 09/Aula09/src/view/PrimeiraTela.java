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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class PrimeiraTela {

	private JFrame frame;
	private JTextField tfNome;
	private JButton btnCadastrar;

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
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tfNome = new JTextField();
		tfNome.setHorizontalAlignment(SwingConstants.CENTER);
		tfNome.setBounds(135, 105, 146, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		tfNome.setText("Digite seu nome aqui");

		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nome digitado: " + tfNome.getText());

				JOptionPane.showMessageDialog(null, "Cuidado! Isto é uma mensagem de aviso", "Aviso",
						JOptionPane.WARNING_MESSAGE);

				JOptionPane.showMessageDialog(null, "Cuidado! Isto é uma mensagem de Erro", "ERRO",
						JOptionPane.ERROR_MESSAGE);

				tfNome.setText("");

			}
		});
		btnMostrar.setBounds(165, 138, 89, 23);
		frame.getContentPane().add(btnMostrar);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// PAINEL COM CONFIRMAÇÃO
				int resultado = JOptionPane.showConfirmDialog(null, "Deseja salvar o arquivo?", "Confirmação",
						JOptionPane.YES_NO_CANCEL_OPTION);

				// Verificando a opção escolhida
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
		btnSalvar.setBounds(31, 194, 89, 23);
		frame.getContentPane().add(btnSalvar);

		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JTextField tfName = new JTextField();
				JTextField tfIdade = new JTextField();

				JPanel painel = new JPanel(new GridLayout(0, 1));
				painel.add(new JLabel("Nome"));
				painel.add(tfName);
				painel.add(new JLabel("Idade"));
				painel.add(tfIdade);

				int resultado = JOptionPane.showConfirmDialog(null, painel, "Cadastro de Pessoa",
						JOptionPane.OK_CANCEL_OPTION);

				if (resultado == JOptionPane.OK_OPTION) {
					String nome = tfName.getText();
					int idade = Integer.parseInt(tfIdade.getText());

					System.out.println(nome);
					System.out.println(idade);

				}

			}
		});
		btnCadastrar.setBounds(289, 194, 108, 23);
		frame.getContentPane().add(btnCadastrar);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(186, 80, 46, 14);
		frame.getContentPane().add(lblNome);

		JLabel lblImagem = new JLabel("");
		lblImagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagem.setIcon(new ImageIcon(PrimeiraTela.class.getResource("/img/cidade.png")));
		lblImagem.setBounds(10, 39, 96, 85);
		frame.getContentPane().add(lblImagem);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnMenu1 = new JMenu("Opções");
		mnMenu1.setIcon(new ImageIcon(PrimeiraTela.class.getResource("/img/arquivo.png")));
		menuBar.add(mnMenu1);

		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int resultado = JOptionPane.showConfirmDialog(null, "Desejar sair?", "Confirmação",
						JOptionPane.YES_NO_OPTION);

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

	}
}
