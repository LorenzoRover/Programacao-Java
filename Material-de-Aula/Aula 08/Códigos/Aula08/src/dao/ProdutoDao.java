package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entidades.Produto;

public class ProdutoDao {

	public Connection getConexao() throws ClassNotFoundException {

		// Driver
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);

		// Endereço do banco de dados
		String url = "jdbc:mysql://localhost:3306/jovem_programador";

		// Usuario
		String user = "root";

		// Senha
		String password = "root";

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
//			System.out.println("Conexão realizada com sucesso");
		} catch (SQLException e) {
			System.out.println("O banco de dados ta errado");
			e.printStackTrace();
		}
		return conn;
	}

	public int inserirProduto(Produto produtoNovo) {

		// SQL
		String insert = "INSERT INTO" + " produtos(nome,marca,preco,quantidade,data,categoria) "
				+ "VALUES (?,?,?,?,?,?)";

		try {
			Connection conn = getConexao();

			PreparedStatement pst = conn.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
			// Atribuindo os valores aos ?????
			pst.setString(1, produtoNovo.getNome());
			pst.setString(2, produtoNovo.getMarca());
			pst.setDouble(3, produtoNovo.getPreco());
			pst.setInt(4, produtoNovo.getQuantidade());
			pst.setDate(5, produtoNovo.getData());
			pst.setString(6, produtoNovo.getCategoria());

			// Executando consulta
			pst.executeUpdate();

			// Retornar a chave (Fazer próxima aula)
			ResultSet rs = pst.getGeneratedKeys();
			int chaveGerada;
			if (rs.next() == true) {
				chaveGerada = rs.getInt(1);
				return chaveGerada;
			}

			rs.close();
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;

	}

	public List<Produto> listarProdutos() {

		String sql = "select * from produtos";
		List<Produto> lista = new ArrayList<>();

		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();

			while (rs.next() == true) {
				int id = rs.getInt(1);
				String nome = rs.getString(2);
				String marca = rs.getString(3);
				double preco = rs.getDouble(4);
				int quantidade = rs.getInt(5);
				Date data = rs.getDate(6);
				String categoria = rs.getString(7);
				Produto produto = new Produto(id, nome, marca, preco, quantidade, data, categoria);
				lista.add(produto);
			}

			rs.close();
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}

	public void deletarProduto(int id) {

		String sql = "delete from produtos where id = ? ";

		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();

			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public void atualizarProduto(Produto produto) {
		
		String sql = 
		"update produtos set nome = ?, marca = ?, preco = ?,"
		+ " quantidade = ?, data = ?, categoria = ? where id = ?";
		
		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, produto.getNome());
			pst.setString(2, produto.getMarca());
			pst.setDouble(3, produto.getPreco());
			pst.setInt(4, produto.getQuantidade());
			pst.setDate(5, produto.getData());
			pst.setString(6, produto.getCategoria());
			pst.setInt(7, produto.getId());
			
			pst.executeUpdate();
			
			
			pst.close();
			conn.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Produto pesquisarPorId (int id) {
		
		String sql = "select * from produtos where id = ?";
		
		Produto produto = null;
		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();

			while (rs.next() == true) {
				id = rs.getInt(1);
				String nome = rs.getString(2);
				String marca = rs.getString(3);
				double preco = rs.getDouble(4);
				int quantidade = rs.getInt(5);
				Date data = rs.getDate(6);
				String categoria = rs.getString(7);
				produto = new Produto(id, nome, marca, preco, quantidade, data, categoria);
				
			}

			rs.close();
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return produto;
	}
	
	

}
