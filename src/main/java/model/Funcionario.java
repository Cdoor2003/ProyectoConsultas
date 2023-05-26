package model;

public class Funcionario extends Persona {
	private String tipoContrato;
	private String profesion;
	private Consulta consulta;

	public String getTipoContrato() {
		return this.tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public String getProfesion() {
		return this.profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

	public Funcionario(String nombre, String apellido, String rut, int edad, String prevision, String genero, int telefono, String correoElectronico, String tipoContrato, String profesion) {
		throw new UnsupportedOperationException();
	}
}