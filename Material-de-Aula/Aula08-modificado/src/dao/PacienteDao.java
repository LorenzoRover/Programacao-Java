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

import entidades.Paciente;
import entidades.Produto;

public class PacienteDao {

	public Connection getConexao() throws ClassNotFoundException {

		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);

		String url = "jdbc:mysql://localhost:3306/jovem_programador";

		String user = "root";
		String password = "root";

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Conectado");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;

	}

	public List<Paciente> listarPacientes() {

		String sql = "select * from pacientes";
		List<Paciente> lista = new ArrayList<>();

		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();

			while (rs.next() == true) {
				int id = rs.getInt(1);
				String nome = rs.getString(2);
				String telefone = rs.getString(3);
				Paciente paciente = new Paciente(id, nome, telefone);
				lista.add(paciente);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}

	public int inserirProduto(Paciente pacienteNovo) {

		String insert = "INSERT INTO pacientes(nome,telefone) " + "VALUES (?,?)";

		try {
			Connection conn = getConexao();

			PreparedStatement pst = conn.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);

			pst.setString(1, pacienteNovo.getNome());
			pst.setString(2, pacienteNovo.getTelefone());

			pst.executeUpdate();

			ResultSet rs = pst.getGeneratedKeys();
			int chaveGerada;
			if (rs.next() == true) {
				chaveGerada = rs.getInt(1);
				return chaveGerada;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	public void deletarProduto(int id) {
		String sql = "delete from produtos where id = ?";

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

	public void atualizarPaciente(Paciente paciente) {

		String sql = "update pacientes set nome = ?, telefone = ? where id = ?";

		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, paciente.getNome());
			pst.setString(2, paciente.getTelefone());

			pst.executeUpdate();

			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Paciente pesquisarPorId(int id) {

		String sql = "select * from pacientes where id = ?";
		List<Paciente> lista = new ArrayList<>();
		
		Paciente paciente = null;
		
		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();

			while (rs.next() == true) {
				id = rs.getInt(1);
				String nome = rs.getString(2);
				String telefone = rs.getString(3);
				paciente = new Paciente(id, nome, telefone);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return paciente;
	}

}
