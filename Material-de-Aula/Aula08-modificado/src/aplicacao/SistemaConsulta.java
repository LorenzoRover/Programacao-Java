package aplicacao;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import dao.ConsultaDao;
import dao.MedicoDao;
import dao.PacienteDao;
import entidades.Consulta;
import entidades.Medico;
import entidades.Paciente;
import entidades.Produto;

public class SistemaConsulta {

	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		
		ConsultaDao consultaDao = new ConsultaDao();
		PacienteDao pacienteDao = new PacienteDao();
		MedicoDao medicoDao = new MedicoDao();
		
		List<Paciente> pacientes = pacienteDao.listarPacientes();
		for (Paciente paciente : pacientes) {
			System.out.println(paciente);
		}
		
		List<Medico> medicos = medicoDao.listarMedicos();
		for (Medico medico : medicos) {
			System.out.println(medico);
		}
		
		Paciente paciente = pacienteDao.pesquisarPorId(2);
		Medico medico = medicoDao.pesquisarPorId(1);
		
		Consulta consulta = new Consulta(Date.valueOf("2024-06-07"), "Rotina", paciente, medico);
		
		consultaDao.inserirConsulta(consulta);
		
		List<Consulta> consultas = consultaDao.listarConsultas();
		for (Consulta consulta1 : consultas) {
			System.out.println(consulta1);
		}
		
	}

}
