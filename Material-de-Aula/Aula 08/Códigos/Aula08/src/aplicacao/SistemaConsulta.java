package aplicacao;

import java.sql.Date;
import java.util.List;

import dao.ConsultaDao;
import dao.MedicoDao;
import dao.PacienteDao;
import entidades.Consulta;
import entidades.Medico;
import entidades.Paciente;

public class SistemaConsulta {

	public static void main(String[] args) {
		
		MedicoDao medicoDao = new MedicoDao();
		PacienteDao pacienteDao = new PacienteDao();
		ConsultaDao consultaDao = new ConsultaDao();
		
		
		// Buscando todos os medicos
		List<Medico> medicos =  medicoDao.listaMedicos();
		System.out.println("Listando todos os médicos");
		for (Medico medico : medicos) {
			System.out.println(medico);
		}		
		// Buscando todos os pacientes
		List<Paciente> pacientes =  pacienteDao.listaPacientes();
		System.out.println("Listando todos os pacientes");
		for (Paciente paciente : pacientes) {
			System.out.println(paciente);
		}

		
		// TRABALHANDO COM A CLASSE CONSULTADAO
		Paciente paciente = pacienteDao.pesquisarPorId(2);		
		Medico medico = medicoDao.pesquisarPorId(1);
		
		Consulta consulta = 
				new Consulta(Date.valueOf("2024-06-07"),
							"Rotina", paciente, medico);
		
		consultaDao.inserirConsulta(consulta);
		
		
		
		
		
		

	}

}
