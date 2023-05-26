package model;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private String rut;
	private int edad;
	private String prevision;
	private String genero;
	private int telefono;
	private String correoElectronico;

	public Persona(String nombre, String apellido, String rut, int edad, String prevision, String genero, int telefono, String correoElectronico) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.edad = edad;
		this.prevision = prevision;
		this.genero = genero;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPrevision() {
		return this.prevision;
	}

	public void setPrevision(String prevision) {
		this.prevision = prevision;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public abstract String getTipo();

	public String toString() {
		return "Nombre: "+nombre+
				"Apellido: "+apellido+
				"RUT: "+rut+
				"Edad: "+edad+
				"Previsión: "+prevision+
				"Género: "+genero+
				"Teléfono: "+telefono+
				"Correo electrónico: "+correoElectronico;
	}
}