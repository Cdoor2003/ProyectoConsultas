package model;

public abstract class Consulta {
	private String rutFuncionario;
	private String rutPaciente;
	private Date fecha;
	private String hora;
	private String motivoConsulta;
	private Funcionario funcionario;
	private Paciente paciente;

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

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
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

	public Consulta(String rutFuncionario, String rutPaciente, Date fecha, String hora, String motivoConsulta) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}
}