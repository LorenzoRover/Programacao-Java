package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaLogin {

	private JFrame frame;
	private JTextField tfNome;
	private JPasswordField pfSenha;
	private JLabel lblBemvindo;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
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
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Tela de acesso");
		frame.setBounds(100, 100, 441, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(116, 86, 89, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSenha.setBounds(116, 139, 89, 28);
		frame.getContentPane().add(lblSenha);
		
		tfNome = new JTextField();
		tfNome.setBounds(140, 113, 154, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				// Analisa o evento do teclado
				// Se teclar entrer, ele acessa a condicional
				if (e.getKeyCode()  == KeyEvent.VK_ENTER ) {
					checkLogin();
				}
				
			}
		});
		pfSenha.setBounds(140, 165, 154, 20);
		frame.getContentPane().add(pfSenha);		
		
		JButton btnAcessar = new JButton("Acessar");
		btnAcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkLogin();
				
				
			}
		});
		btnAcessar.setForeground(Color.WHITE);
		btnAcessar.setBackground(Color.RED);
		btnAcessar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAcessar.setBounds(205, 198, 89, 23);
		frame.getContentPane().add(btnAcessar);
		
		lblBemvindo = new JLabel("Bem-Vindo");
		lblBemvindo.setForeground(Color.RED);
		lblBemvindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemvindo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBemvindo.setBounds(139, 36, 133, 28);
		frame.getContentPane().add(lblBemvindo);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/senacc.png")));
		lblNewLabel_1.setBounds(10, 0, 123, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/cidade.png")));
		lblNewLabel_2.setBounds(29, 86, 77, 52);
		frame.getContentPane().add(lblNewLabel_2);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		mnArquivo.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/arquivo.png")));
		menuBar.add(mnArquivo);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		mnArquivo.add(mntmSair);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnArquivo.add(mntmNewMenuItem_1);
		
		JMenu mnEditar = new JMenu("Editar");
		mnEditar.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/edit.png")));
		menuBar.add(mnEditar);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnEditar.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		mnEditar.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("New menu item");
		mnEditar.add(mntmNewMenuItem_4);
		
		JMenu mnExibir = new JMenu("Exibir");
		mnExibir.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/contato.png")));
		menuBar.add(mnExibir);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("New menu item");
		mnExibir.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("New menu item");
		mnExibir.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("New menu item");
		mnExibir.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("New menu item");
		mnExibir.add(mntmNewMenuItem_8);
	}
	
	
	public void checkLogin() {
		
		String loginCorreto = "admin";
		String senhaCorreta = "root";
		
		String  loginTentativa =  tfNome.getText();
		String senhaTentativa = 
				String.valueOf(pfSenha.getPassword());
		
		if (loginTentativa.equals(loginCorreto)   
				&& senhaTentativa.equals(senhaCorreta) ) {
			JOptionPane.
			showMessageDialog(
			null, "Bem vindo "+ loginTentativa );
		} else {
			JOptionPane.
			showMessageDialog(
			null, "Credenciais inválidas", "Erro", JOptionPane.ERROR_MESSAGE );
		}
		
		
		
		
		
	}
}
