package model;

import java.util.ArrayList;
import java.util.Date;

import model.Funcionario;
import model.Paciente;
import model.Consulta;
import model.Diagnostico;

public class AdministradorPagina {
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	private ArrayList<Consulta> consultas = new ArrayList<Consulta>();
	private ArrayList<Diagnostico> diagnosticos = new ArrayList<Diagnostico>();

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public ArrayList<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(ArrayList<Consulta> consultas) {
		this.consultas = consultas;
	}

	public ArrayList<Diagnostico> getDiagnosticos() {
		return diagnosticos;
	}

	public void setDiagnosticos(ArrayList<Diagnostico> diagnosticos) {
		this.diagnosticos = diagnosticos;
	}

	public void registroFuncionario(Funcionario funcionario) {
		if(buscarFuncionarioPorRut(funcionario.getRut()) == null){
			funcionarios.add(funcionario);
			System.out.println("Se registrado correctamente al funcionario");
		}else {
			System.out.println("El funcionario ya ha sido registrado previamente");
		}
	}

	public void registroPaciente(Paciente paciente) {
		if(buscarPaciente(paciente.getRut()) == null){
			pacientes.add(paciente);
			System.out.println("Se registrado correctamente al paciente");
		}else {
			System.out.println("El paciente ya ha sido registrado previamente");
		}	}

	public void agendarConsulta(Consulta consulta) {
		if(buscarConsulta(consulta) == null){
			consultas.add(consulta);
			System.out.println("La consulta ha sido agendada con exito");
		}else{
			System.out.println("Ya ha ingresado una consulta previamente por los mismos motivos");
		}
	}

	public void hacerDiagnostico(Diagnostico diagnostico) {
		diagnosticos.add(diagnostico);
		System.out.println("Se ha emitido el diagnostico con exito");
	}

	public Paciente buscarPaciente(String rutPaciente) {
		for (Paciente paciente : pacientes){
			if(paciente.getRut().equals(rutPaciente)){
				return paciente;
			}
		}
		return null;
	}

	public Funcionario buscarFuncionarioPorRut(String  rutFuncionario){
		for (Funcionario funcionario : funcionarios){
			if (funcionario.getRut().equals(rutFuncionario)){
				return funcionario;
			}
		}
		return null;
	}

	public Consulta buscarConsulta(Consulta consulta) {
		for (Consulta consulta1 : consultas){
			if (consulta1.getRutPaciente().equals(consulta.getRutPaciente()) && consulta1.getMotivoConsulta().equals(consulta.getMotivoConsulta())){
				return consulta;
			}
		}
		return null;
	}

	public Consulta buscarConsultaPorRutYMotivo(String rutPaciente, String motivoConsulta){
		for (Consulta consulta1 : consultas){
			if (consulta1.getRutPaciente().equals(rutPaciente) && consulta1.getMotivoConsulta().equals(motivoConsulta)){
				return consulta1;
			}
		}
		return null;
	}

	public void buscarDiagnosticos(Paciente paciente) {
		for (Diagnostico diagnostico: diagnosticos){
			if(diagnostico.getRutPaciente().equals(paciente.getRut())) {
				Funcionario funcionario = buscarFuncionarioPorRut(diagnostico.getRutFuncionario());
				System.out.println("Paciente: "+paciente.getNombre()+" "+paciente.getApellido()+"\n"+
						"Funcionario: "+funcionario.getNombre()+" "+funcionario.getApellido()+"\n"+
						"Fecha: "+diagnostico.getFecha()+"\n"+
						"Hora: "+diagnostico.getHora()+"\n"+
						"Diagnostico: "+diagnostico.getDiagnostico()+"\n"+
						"Receta: "+diagnostico.getReceta()+"\n");
			}
		}
	}

	public void removerFuncionario(String rutFuncionario) {
		Funcionario funcionario = buscarFuncionarioPorRut(rutFuncionario);
		if(funcionario != null){
			funcionarios.remove(funcionario);
			System.out.println("El funcionario ha sido removido con exito");
		}else{
			System.out.println("El funcionario no existe");
		}
	}

	public void removerPaciente(String rutPaciente) {
		Paciente paciente = buscarPaciente(rutPaciente);
		if(paciente != null){
			pacientes.remove(paciente);
			System.out.println("El paciente ha sido removido con exito");
		}else{
			System.out.println("El paciente no existe");
		}
	}

	public void removerConsulta(Consulta consulta) {
		if(buscarConsulta(consulta) != null){
			consultas.remove(consulta);
			System.out.println("La consulta ha sido removida con exito");
		}else{
			System.out.println("La consulta no existe");
		}
	}

	public void mostrarConsulta(String rutPaciente, String movitoConsulta) {
		Consulta consulta = buscarConsultaPorRutYMotivo(rutPaciente,movitoConsulta);
		Paciente paciente = buscarPaciente(rutPaciente);
		Funcionario funcionario = buscarFuncionarioPorRut(consulta.getRutFuncionario());
		if(consulta != null){
			System.out.println("Paciente: "+paciente.getNombre()+" "+paciente.getApellido()+"\n"+
					"Funcionario: "+funcionario.getNombre()+" "+funcionario.getApellido()+"\n"+
					"Fecha: "+consulta.getFecha()+"\n"+
					"Hora: "+consulta.getHora()+"\n"+
					"Motivo consulta: "+consulta.getMotivoConsulta()+"\n");
		}
	}

	public void mostrarDiagnostico(String rutPaciente, String motivoConsulta) {
		Paciente paciente = buscarPaciente(rutPaciente);
		for (Diagnostico diagnostico: diagnosticos){
			if(diagnostico.getRutPaciente().equals(paciente.getRut()) && diagnostico.getMotivoConsulta().equals(motivoConsulta)) {
				Funcionario funcionario = buscarFuncionarioPorRut(diagnostico.getRutFuncionario());
				System.out.println("Paciente: "+paciente.getNombre()+" "+paciente.getApellido()+"\n"+
						"Funcionario: "+funcionario.getNombre()+" "+funcionario.getApellido()+"\n"+
						"Fecha: "+diagnostico.getFecha()+"\n"+
						"Hora: "+diagnostico.getHora()+"\n"+
						"Diagnostico: "+diagnostico.getDiagnostico()+"\n"+
						"Receta: "+diagnostico.getReceta()+"\n");
			}
		}
	}
}