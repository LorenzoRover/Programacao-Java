package entidades;

import java.sql.Date;

public class Consulta {
	
	private int id;
	private Date data;
	private String descricao;
	private Paciente paciente;
	private Medico medico;
	
	
	public Consulta(int id, Date data, String descricao, Paciente paciente, Medico medico) {
		super();
		this.id = id;
		this.data = data;
		this.descricao = descricao;
		this.paciente = paciente;
		this.medico = medico;
	}
	
	public Consulta(Date data, String descricao, Paciente paciente, Medico medico) {
		super();
		this.data = data;
		this.descricao = descricao;
		this.paciente = paciente;
		this.medico = medico;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	@Override
	public String toString() {
		return "Consulta [id=" + id + ", data=" + data + ", descricao=" + descricao + ", paciente=" + paciente
				+ ", medico=" + medico + "]";
	}
	
	
	
	
	
	

}
