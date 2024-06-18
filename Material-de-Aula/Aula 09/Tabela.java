package view;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import entidades.Aluno;
import entidades.Pessoa;

public class Tabela {

	private JFrame frame;
	private JTable table;
	private DefaultTableModel modelo;
	private List<Pessoa> lista = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabela window = new Tabela();
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
	public Tabela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 629, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setEnabled(false);
		scrollPane.setBounds(69, 41, 481, 133);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Nome", "Idade", "Email"
			}
		));
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(43, 196, 111, 23);
		frame.getContentPane().add(btnCadastrar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(164, 196, 89, 23);
		frame.getContentPane().add(btnRemover);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(263, 196, 89, 23);
		frame.getContentPane().add(btnEditar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(362, 196, 89, 23);
		frame.getContentPane().add(btnListar);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(461, 196, 103, 23);
		frame.getContentPane().add(btnPesquisar);
		//table.setEnabled(false);
		
		// Impedindo edição
		table.setDefaultEditor(Object.class, null);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				int linha = table.getSelectedRow();
				int coluna = table.getSelectedColumn();
				
				System.out.println("Linha selecionada: " + linha);
				System.out.println("Coluna selecionada: " + coluna);
				
				
				
				
			}
		});
		
		
		
		atualizarTabela();
		
		
		
		
		
		
		
		
	}
	
	public void atualizarTabela() {
		
		modelo = (DefaultTableModel) table.getModel();		
		
		
		for(Pessoa pessoa : lista) {			
			modelo.addRow
			(new Object[] 
			{pessoa.getId(), pessoa.getNome(),pessoa.getIdade(),pessoa.getEmail()});			
		}
		
	}
}
