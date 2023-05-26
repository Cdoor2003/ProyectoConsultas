package model;

public class Diagnostico extends Consulta {
	private String diagnostico;
	private String receta;

	public String getDiagnostico() {
		return this.diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getReceta() {
		return this.receta;
	}

	public void setReceta(String receta) {
		this.receta = receta;
	}

	public Diagnostico(String rutFuncionario, String rutPaciente, Date fecha, String hora, String motivoConsulta, String diagnostico, String receta) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}
}