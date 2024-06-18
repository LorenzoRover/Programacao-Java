package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Paciente;
import entidades.Produto;

public class PacienteDao {

	public Connection getConexao() throws ClassNotFoundException {

		// Driver
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);

		// Endereço do meu servidor de banco de dados
		String url = "jdbc:mysql://localhost:3306/jovem_programador02";

		String user = "root";

		String password = "root";
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(url, user, password);
//			System.out.println("CONECTADO!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void cadastrarProduto(Paciente paciente) {

		String insert = "INSERT INTO pacientes" 
		+ "(nome,telefone) "
				+ "VALUES(?,?)";

		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(insert);

			// Trocando os ?,?,?,?,?,? pelos valores
			pst.setString(1, paciente.getNome());
			pst.setString(2, paciente.getTelefone());
			

			// Executando a consulta
			pst.executeUpdate();

			// Fechamento da conexão
			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Paciente> listaPacientes() {
		List<Paciente> pacientes = new ArrayList<>();
		String sql = "SELECT * FROM pacientes";

		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String nome = rs.getString(2);				
				String telefone = rs.getString(3);
				

				Paciente paciente = new Paciente(id, nome, telefone);
				pacientes.add(paciente);

			}
			rs.close();
			pst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pacientes;
	}

	public void alterarPaciente(Paciente paciente) {

		String sql = "UPDATE pacientes SET nome = ? , telefone = ? WHERE id = ?";

		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setString(1, paciente.getNome());
			pst.setString(2, paciente.getTelefone());
			pst.setInt(3, paciente.getId());
			pst.executeUpdate();

			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public void deletarPaciente (int id) {
		
		String sql = "delete from pacientes where id = ?";
		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			
			// Executando minha consulta
			pst.executeUpdate();
			
			pst.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public Paciente pesquisarPorId(int id) {
		
		String sql = "SELECT * FROM pacientes where id = ?";

		Paciente paciente = null;
		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				id = rs.getInt(1);
				String nome = rs.getString(2);				
				String telefone = rs.getString(3);
				paciente = new Paciente(id, nome, telefone);
				
			}
			rs.close();
			pst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return paciente;
	}
	
	
	
	
	
	
	
	
	

}
