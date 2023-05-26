package model;

public class Funcionario extends Persona {
	private String tipoContrato;
	private String profesion;
	private Consulta consulta;

	public Funcionario(String nombre, String apellido, String rut, int edad, String prevision, String genero, int telefono, String correoElectronico, String tipoContrato, String profesion) {
		super(nombre, apellido, rut, edad, prevision, genero, telefono, correoElectronico);
		this.tipoContrato = tipoContrato;
		this.profesion = profesion;
	}

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
		return "Funcionario";
	}

	@Override
	public String toString() {
		return super.toString()+
				"Tipo contrato: "+tipoContrato+
				"Profesión: "+profesion;
	}
}