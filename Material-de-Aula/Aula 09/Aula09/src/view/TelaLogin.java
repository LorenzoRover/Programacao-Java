package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
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
		frame = new JFrame("Tela de Login");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/remove.png")));

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(140, 79, 46, 25);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(140, 134, 46, 25);
		frame.getContentPane().add(lblSenha);

		tfLogin = new JTextField();
		tfLogin.setBounds(140, 103, 156, 20);
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
		pfSenha.setBounds(140, 156, 156, 20);
		frame.getContentPane().add(pfSenha);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				checkLogin();

			}
		});
		btnEntrar.setBounds(207, 187, 89, 23);
		frame.getContentPane().add(btnEntrar);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/senacc.png")));
		lblNewLabel_1.setBounds(182, 31, 107, 52);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Bem vindo");
		lblNewLabel_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(76, 0, 257, 41);
		frame.getContentPane().add(lblNewLabel_2);
	}

	public void checkLogin() {

		String senhaCorreta = "admin";
		String loginCorreto = "admin";

		String loginTentativa = tfLogin.getText();
		String senhaTentativa = new String(pfSenha.getPassword());

		if (loginTentativa.equals(loginCorreto) && senhaTentativa.equals(senhaCorreta)) {
			JOptionPane.showMessageDialog(null, "Bem vindo " + loginTentativa);

		} else {
			JOptionPane.showMessageDialog(null, "Credenciais inválidas", "Erro", JOptionPane.ERROR_MESSAGE);
		}

	}

}
