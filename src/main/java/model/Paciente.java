package model;

public class Paciente extends Persona {

    public Paciente(String nombre, String apellido, String rut, int edad, String prevision, String genero, int telefono, String correoElectronico) {
        super(nombre, apellido, rut, edad, prevision, genero, telefono, correoElectronico);
    }

    @Override
    public String getTipo() {
        return "Paciente";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}