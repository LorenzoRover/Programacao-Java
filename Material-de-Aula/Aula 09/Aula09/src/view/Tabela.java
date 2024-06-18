package view;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import entidades.Pessoa;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tabela {

	private JFrame frame;
	private DefaultTableModel modelo;
	private List<Pessoa> listaPessoas = new ArrayList<>();
	private JTable table;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();

		scrollPane.setBounds(44, 59, 336, 137);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
				new Object[][] { { "Rogério", 29, "rogerio@gmail.com" }, { "Fabio", 45, "fabio@gmail.com" } },
				new String[] { "Nome", "Idade", "Email" }));

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int linha = table.getSelectedRow();
				int coluna = table.getSelectedColumn();

				System.out.println("Linha selecionada: " + linha);
				System.out.println("Coluna selecionada:" + coluna);

			}
		});

		// Redimensionar as colunas para ajustar com os valores
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

		// Centralizando os dados dos campos
		DefaultTableCellRenderer centralizar = new DefaultTableCellRenderer();
		centralizar.setHorizontalAlignment(SwingConstants.CENTER);
		table.getColumnModel().getColumn(0).setCellRenderer(centralizar);
		table.getColumnModel().getColumn(1).setCellRenderer(centralizar);
		table.getColumnModel().getColumn(2).setCellRenderer(centralizar);

		// Impedindo edição
		table.setDefaultEditor(Object.class, null);

		// Adicionando pessoas na lista
		listaPessoas.add(new Pessoa("Meg", 25, "meg@gmail.com"));
		listaPessoas.add(new Pessoa("Bob", 19, "bob@gmail.com"));
		listaPessoas.add(new Pessoa("Charlie", 22, "charlie@gmail.com"));
		listaPessoas.add(new Pessoa("Maria", 28, "maria@gmail.com"));

		atualizarTabela();

	}

	public void atualizarTabela() {

		// Pegando o modelo da tabela
		modelo = (DefaultTableModel) table.getModel();

		// Adicionando pessoas da lista na tabela
		for (Pessoa pessoa : listaPessoas) {
			modelo.addRow(new Object[] { pessoa.getNome(), pessoa.getIdade(), pessoa.getEmail() });

		}

	}

}
