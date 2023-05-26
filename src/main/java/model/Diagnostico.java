package model;

import java.util.Date;

public class Diagnostico extends Consulta {
	private String diagnostico;
	private String receta;

	public Diagnostico(String rutFuncionario, String rutPaciente, String fecha, String hora, String motivoConsulta, String diagnostico, String receta) {
		super(rutFuncionario, rutPaciente, fecha, hora, motivoConsulta);
		this.diagnostico = diagnostico;
		this.receta = receta;
	}

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

	public String toString() {
		throw new UnsupportedOperationException();
	}
}