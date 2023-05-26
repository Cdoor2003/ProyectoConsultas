package main;

import model.*;

public class Launcher {
    public static void main(String[] args){
        AdministradorPagina administradorPagina = new AdministradorPagina();
        Funcionario funcionario = new Funcionario("Christian","Ortega","21277106-6",20,"Fonasa c","Masculino",948013896,"c.ortega12@ufromail.cl","Planta","Odontologo");
        Funcionario funcionario1 = new Funcionario("Bastian","Vera","12345678-9",23,"Fonasa a","Masculino",123456789,"b.vera6@ufromail.cl","Contrata","Psicólogo");
        Paciente paciente = new Paciente("Jose","Mardonez","98765432-1",25,"Isapre","Masculino",987654321,"j.mardonez@ufromail.cl");
        Paciente paciente1 = new Paciente("Elezier","Rodriguez","54321678-9",21,"No tiene","FLuido",987623541,"e.rodriguez@ufromail.cl");
        Consulta consulta = new Consulta("21277106-6","98765432-1","09/06/2023","13Hrs","dolor en la rodilla");
        Consulta consulta1 = new Consulta("12345678-9","54321678-9","01/08/2023","09Hrs","dolor de riñon");
        Diagnostico diagnostico = new Diagnostico("12345678-9","54321678-9","23/04/2023","09Hrs","dolor de riñon","piedras en el riñon","paracetamol cada 8 horas");
        Diagnostico diagnostico1 = new Diagnostico("21277106-6","54321678-9","02/06/2023","12Hrs","pierna rota","piedras en el riñon","paracetamol cada 8 horas");
        administradorPagina.registroFuncionario(funcionario);
        administradorPagina.registroFuncionario(funcionario1);
        administradorPagina.registroPaciente(paciente);
        administradorPagina.registroPaciente(paciente1);
        administradorPagina.agendarConsulta(consulta);
        administradorPagina.agendarConsulta(consulta1);
        administradorPagina.hacerDiagnostico(diagnostico);
        administradorPagina.hacerDiagnostico(diagnostico1);
        administradorPagina.mostrarConsulta(paciente.getRut(),consulta.getMotivoConsulta());
        administradorPagina.mostrarDiagnostico(paciente1.getRut(),diagnostico1.getMotivoConsulta());
        administradorPagina.removerFuncionario(funcionario.getRut());
        administradorPagina.removerPaciente(paciente1.getRut());
        administradorPagina.removerConsulta(consulta1);
    }
}
