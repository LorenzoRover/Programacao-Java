package view;

import java.awt.EventQueue;
import java.awt.JobAttributes;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TelaLogin {

	private JFrame frame;
	private JTextField tfLogin;
	private JPasswordField pfSenha;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tfLogin = new JTextField();
		tfLogin.setBounds(172, 106, 86, 20);
		frame.getContentPane().add(tfLogin);
		tfLogin.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					checkLogin();
				}
			}
		});
		pfSenha.setBounds(172, 158, 86, 20);
		frame.getContentPane().add(pfSenha);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(172, 81, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(172, 137, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int resultado = JOptionPane.showConfirmDialog
						(null,"Confirmar cadastro?","Cadastro",JOptionPane.OK_CANCEL_OPTION);
				
				if (resultado == JOptionPane.OK_OPTION) {
					if (tfLogin.getText() != null && pfSenha.getPassword() != null) {
						String nome = tfLogin.getText();
						String senha = new String(pfSenha.getPassword());
						
						JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Login ou senha em branco", "ERRO", JOptionPane.ERROR_MESSAGE);
					}
					
				}
				
				
				
			}
		});
		btnCadastrar.setBounds(309, 211, 89, 23);
		frame.getContentPane().add(btnCadastrar);
	}
	
	public void checkLogin() {
		
		String senhaCorreta = "admin";
		String loginCorreto = "admin";
		
		String loginTentativa = tfLogin.getText();
		String senhaTentativa = new String(pfSenha.getPassword());
		
		if (loginCorreto.equals(loginCorreto) && senhaTentativa.equals(senhaCorreta)) {
			JOptionPane.showMessageDialog(null, "Bem vindo " + loginTentativa);
			
		} else {
			JOptionPane.showMessageDialog(null, "Credenciais inválidas", "Erro", JOptionPane.ERROR_MESSAGE);
			
		}
		
	}
}
