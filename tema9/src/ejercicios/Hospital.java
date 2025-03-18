package ejercicios;

import java.time.LocalDate;
import java.util.Random;

import clases.Enfermero;
import clases.Medico;
import clases.Paciente;
import clases.PersonaHospital;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creo medico
		Medico medico = new Medico();
		medico.setNif("845792Y");
		medico.setNombre("pepe");
		medico.setApellidos("lopez");
		medico.setCantidadSangre(40);
		medico.setEdad(32);
		medico.setEspecialidad("Ojos");
		medico.setNumColegiado(5);
		
		System.out.println(medico);
		
		//creo enfermero
		Enfermero enfermero = new Enfermero();
		enfermero.setNif("723411Q");
		enfermero.setNombre("Pedro");
		enfermero.setApellidos("Gonzalez");
		enfermero.setCantidadSangre(25);
		enfermero.setEdad(20);
		enfermero.setEspecialidad("Oidos");
		enfermero.setAnoFinEstudios(LocalDate.of(2000, 06, 12));
				
		System.out.println(enfermero);
				
		//creo paciente
		Paciente paciente = new Paciente();
		paciente.setNombre("Juan");
		paciente.setApellidos("Hernandez");
		paciente.setEdad(20);
		paciente.setNif("347914A");
		paciente.setEnfermeroAtiende(enfermero);
		paciente.setMedicoTrata(medico);
		paciente.setCausaIngreso("dolor");
		paciente.setFechaIngreso(LocalDate.of(2002, 04, 22));
		paciente.setCantidadSangre(2);
		
		System.out.println(paciente);
		
		System.out.println();
		
		donarSangre(medico, enfermero, paciente); 
	}

	public static void donarSangre(Medico medico, Enfermero enfermero, Paciente paciente) {
		Random r = new Random();
		
		int sangreMedico = r.nextInt(1,6);
        int sangreEnfermero = r.nextInt(1,6);
        int sangrePaciente = r.nextInt(1,6);
        
		System.out.println("sangre a donar del medico: "+sangreMedico); 
		System.out.println("sangre a donar del enfermero: "+sangreEnfermero); 
		System.out.println("sangre a donar del paciente: "+sangrePaciente);
		
		if (medico.donarSangre(sangreMedico)>2) {
			System.out.println("el medico si puede");
		}
		else {
			System.out.println("el medico no puede");
		}
		
		if (enfermero.donarSangre(sangreEnfermero)>3) {
			System.out.println("el enfermero si puede");
		}
		else {
			System.out.println("el enfermero no puede");
		}
		
		if (paciente.donarSangre(sangrePaciente)>5) {
			System.out.println("el paciente si puede");
		}
		else {
			System.out.println("el paciente no puede");
		}
		
		int total = sangreMedico + sangreEnfermero + sangrePaciente;
		System.out.println("sangre total: "+total);
		
	}
	

}
