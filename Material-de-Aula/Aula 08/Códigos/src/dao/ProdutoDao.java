package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

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
			System.out.println("Conexão realizada com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();		
		}			
		return conn;
	}
	
	
	public int inserirProduto (Produto produtoNovo) {
		
		// SQL
		String insert = "INSERT INTO"
				+ " produtos(nome,marca,preco,quantidade,data,categoria) "
				+ "VALUES (?,?,?,?,?,?)";
		
		try {
			Connection conn = getConexao();
			
			PreparedStatement pst = 
					conn.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
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
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return 0;
		
	}
	

}
