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

public class Herencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Persona3> listaProfes = new ArrayList<Persona3>();
		List<Alumno> listaAlum = new ArrayList<Alumno>();
		
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
			
			listaAlum.add(alumno);
			
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
			
			//profesor.setnombre es para cambiar el nombre o ponerle nombre
			
			listaProfes.add(profesor);
			
			System.out.println(profesor);
			
			System.out.println("Tiene " + Persona3.calculaEdad(fechaNacimiento) + " años"); 
			
			System.out.println("Ahora mide " + Persona3.cambiaAltura(altura) + " cm");
			
		}
	
		
	}

}
