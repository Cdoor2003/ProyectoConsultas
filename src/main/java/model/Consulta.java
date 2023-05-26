package model;

import java.util.Date;

public class Consulta {
	private String rutFuncionario;
	private String rutPaciente;
	private String fecha;
	private String hora;
	private String motivoConsulta;
	private Funcionario funcionario;
	private Paciente paciente;

	public Consulta(String rutFuncionario, String rutPaciente, String fecha, String hora, String motivoConsulta) {
		this.rutFuncionario = rutFuncionario;
		this.rutPaciente = rutPaciente;
		this.fecha = fecha;
		this.hora = hora;
		this.motivoConsulta = motivoConsulta;
	}

	public String getRutFuncionario() {
		return this.rutFuncionario;
	}

	public void setRutFuncionario(String rutFuncionario) {
		this.rutFuncionario = rutFuncionario;
	}

	public String getRutPaciente() {
		return this.rutPaciente;
	}

	public void setRutPaciente(String rutPaciente) {
		this.rutPaciente = rutPaciente;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return this.hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getMotivoConsulta() {
		return this.motivoConsulta;
	}

	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}
}