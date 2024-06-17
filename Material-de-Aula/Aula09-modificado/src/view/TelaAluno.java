package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import entidades.Aluno;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaAluno {

	private JFrame frame;
	private JTable table;
	private DefaultTableModel modelo;
	private List<Aluno> lista = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAluno window = new TelaAluno();
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
	public TelaAluno() {
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
		
		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Idade", "Email"
			}
		));
		//table.setEnabled(true);
		table.setDefaultEditor(Object.class, null);
		
		lista.add( new Aluno("Meg", 22, "meg@gmail.com"));
		lista.add( new Aluno("Bob", 19, "bobg@gmail.com"));
		lista.add( new Aluno("Meg", 22, "meg@gmail.com"));
		lista.add( new Aluno("Meg", 22, "meg@gmail.com"));
		
		atualizarTabela();
		
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int linha = table.getSelectedRow();
				int coluna = table.getSelectedColumn();
				
				System.out.println("Linha selecionada: " + linha);
				System.out.println("Coluna selecionada: " + coluna);
			}
		});
		
	}
	
	public void atualizarTabela() {
		modelo = (DefaultTableModel) table.getModel();
		
		for (Aluno aluno : lista) {
			modelo.addRow(new Object[] {aluno.getNome(), aluno.getIdade(), aluno.getEmail()});
		}
	}
	
	

}
