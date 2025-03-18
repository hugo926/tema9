package ejercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import clases.Alumno;
import clases.Persona3;
import clases.Profesor;
import util.Validarfunciones;

public class Herencia2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Scanner sc = new Scanner(System.in);
		//	List<Persona3> listaProfes = new ArrayList<Persona3>();
		//	List<Alumno> listaAlum = new ArrayList<Alumno>();
			
			Persona3 alu = new Profesor();
			List<Persona3> listaAlumProfe = new ArrayList<Persona3>();
			//lista.add(alu);	//guardo un alumno
		//	lista.add(new Profesor());
			
			int numAlumnos = Validarfunciones.dimeEntero("Cuantos alumnos quieres", sc);
			int numProfes = Validarfunciones.dimeEntero("Cuantos profesores quieres", sc);
			
			//creo alumno
			for (int i = 0; i < numAlumnos; i++) {
				Random r = new Random();
				String nombre="Pepe" + i;
				String apellidos="Antoran" + i;
				String dni="76474399T" + i;
				
				LocalDate fecha = LocalDate.of(r.nextInt(1925,2026),r.nextInt(1,12),r.nextInt(1,28));
				Date fechaNacimiento = Validarfunciones.convierte_LocalDate_a_Date(fecha);
				
				int altura = r.nextInt(130,211);
				int idAlumno= i;
				String curso= r.nextInt(1,5) +"ESO";
				String estudiosPrevios= r.nextInt(1,7) +"Primaria";
				
				Alumno alumno = new Alumno(nombre, apellidos, dni, fechaNacimiento, altura, idAlumno,
					 curso,  estudiosPrevios);
				
				listaAlumProfe.add(alu);
				//listaAlum.add(alumno);
				
				System.out.println(alumno);
				
				System.out.println("Tiene " + Persona3.calculaEdad(fechaNacimiento) + " años");
				
				System.out.println("Ahora mide " + Persona3.cambiaAltura(altura) + " cm");
				
			//	System.out.println(Alumno.pasaDeCurso(r.nextInt(1,7), curso));
			}
			
			//creo profe
			for (int i = 0; i < numProfes; i++) {
				Random r = new Random();
				String nombre="Antonio" + i;
				String apellidos="Lopez" + i;
				String dni="76474399T" + i;
				
				LocalDate fecha = LocalDate.of(r.nextInt(1925,2026),r.nextInt(1,12),r.nextInt(1,28));
				Date fechaNacimiento = Validarfunciones.convierte_LocalDate_a_Date(fecha);
				
				int altura = r.nextInt(130,211);
				int idProfesor= i;
				int sueldo= r.nextInt(1200,3001);
				int saldo= r.nextInt(0,100001);
				
				Profesor profesor = new Profesor(nombre, apellidos, dni, fechaNacimiento, altura, 
						 idProfesor, sueldo, saldo);
				
				listaAlumProfe.add(new Profesor());//casteado pa meterlo en la misma lista(al)
				
			//	listaProfes.add(profesor);
				
				System.out.println(profesor);
				
				System.out.println("Tiene " + Persona3.calculaEdad(fechaNacimiento) + " años"); 
				
				System.out.println("Ahora mide " + Persona3.cambiaAltura(altura) + " cm");
				
			}
			*/
		List<Persona3> listaAlumProfe = new ArrayList<Persona3>();
		
		for (int i = 0; i < 1; i++) {
			Random r = new Random();
			String nombre="Pepe" + i;
			String apellidos="Antoran" + i;
			String dni="76474399T" + i;
			
			LocalDate fecha = LocalDate.of(r.nextInt(1925,2026),r.nextInt(1,12),r.nextInt(1,28));
			Date fechaNacimiento = Validarfunciones.convierte_LocalDate_a_Date(fecha);
			
			int altura = r.nextInt(130,211);
			int idAlumno= i;
			String curso= r.nextInt(1,5) +"ESO";
			String estudiosPrevios= r.nextInt(1,7) +"Primaria";
		
			Persona3 alu = new Alumno(nombre, apellidos, dni, fechaNacimiento, altura, idAlumno,
				 curso,  estudiosPrevios); //alu es tipo persona en lista va a tner los metodos getters y eso de Alum
			
			listaAlumProfe.add(alu);
	}
		for (int i = 0; i < 1; i++) {
			Random r = new Random();
			String nombre="Antonio" + i;
			String apellidos="Lopez" + i;
			String dni="76474399T" + i;
			
			LocalDate fecha = LocalDate.of(r.nextInt(1925,2026),r.nextInt(1,12),r.nextInt(1,28));
			Date fechaNacimiento = Validarfunciones.convierte_LocalDate_a_Date(fecha);
			
			int altura = r.nextInt(130,211);
			int idProfesor= i;
			int sueldo= r.nextInt(1200,3001);
			int saldo= r.nextInt(0,100001);
		
			Persona3 prof = new Profesor(nombre, apellidos, dni, fechaNacimiento, altura, 
					 idProfesor, sueldo, saldo); //alu es tipo persona en lista va a tner los metodos getters y eso de Alum
		
			listaAlumProfe.add(prof);
	}
		System.out.println(listaAlumProfe);
		
		
		Persona3 p = new Alumno();

		//cuando los creo en el mismo for y tengo q crear un pasaCurso y un cobraSueldo
		// si me da error el segundo cast exception in thread main, hayq poner esto
		if(p instanceof Alumno)
			System.out.println("Es alumno");
		
		((Alumno)p).pasaDeCurso();
		
		/* si tengo profes y alumnos y ambos son personas, fuerzo q la persona sea un alumno para pasarCurso
		 *o para q la persona sea profesor y puedo pagarSueldo */
		
}
}
