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

import entidades.Medico;
import entidades.Produto;

public class MedicoDao {

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

	public List<Medico> listarMedicos() {

		String sql = "select * from medicos";
		List<Medico> lista = new ArrayList<>();

		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();

			while (rs.next() == true) {
				int id = rs.getInt(1);
				String nome = rs.getString(2);
				String especialidade = rs.getString(3);
				Medico medico = new Medico(id, nome, especialidade);
				lista.add(medico);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}

	public int inserirProduto(Medico medicoNovo) {

		String insert = "INSERT INTO medicos(nome,especialidade) " + "VALUES (?,?)";

		try {
			Connection conn = getConexao();

			PreparedStatement pst = conn.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);

			pst.setString(1, medicoNovo.getNome());
			pst.setString(2, medicoNovo.getEspecialidade());

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

	public void deletarMedico(int id) {
		String sql = "delete from medicos where id = ?";

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

	public void atualizarProduto(Medico medico) {

		String sql = "update medicos set nome = ?, especialidade = ? where id = ?";

		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, medico.getNome());
			pst.setString(2, medico.getEspecialidade());

			pst.executeUpdate();

			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Medico pesquisarPorId(int id) {

		String sql = "select * from medicos where id = ?";
		List<Medico> lista = new ArrayList<>();
		
		Medico medico = null;
		
		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();

			while (rs.next() == true) {
				id = rs.getInt(1);
				String nome = rs.getString(2);
				String especialidade = rs.getString(3);
				medico = new Medico(id, nome, especialidade);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return medico;
	}

}
