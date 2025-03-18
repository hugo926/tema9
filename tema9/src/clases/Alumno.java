package clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Random;

import util.Validarfunciones;

public class Alumno extends Persona3 {

	//solo protected nuevos
	protected int idAlumno; 
	protected String curso; 
	protected String estudiosPrevios;

	
	public Alumno() {
		super();
	}
	/**
	 * constructor con todoa los parametros
	 * @param nombre String
	 * @param apellidos String
	 * @param dni string
	 * @param fechaNacimiento date
	 * @param altura int
	 * @param idAlumno int
	 * @param curso String
	 * @param estudiosPrevios String
	 */
	public Alumno(String nombre, String apellidos, String dni, Date fechaNacimiento, int altura, int idAlumno,
			String curso, String estudiosPrevios) { //aqui poner todos los protcted

		super(nombre, apellidos, dni, fechaNacimiento, altura); //aqui poner protected de clase padre
		this.idAlumno = idAlumno; //solo de la clase hija
		this.curso = curso;
		this.estudiosPrevios = estudiosPrevios;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getEstudiosPrevios() {
		return estudiosPrevios;
	}

	public void setEstudiosPrevios(String estudiosPrevios) {
		this.estudiosPrevios = estudiosPrevios;
	}
	
	public void pasaDeCurso() {
		
		//this.curso++;
	}
	@Override
public  int calculaEdad(Date fechaNacimiento) {
		
		LocalDate hoy = LocalDate.now();
		LocalDate fechaNaci= Validarfunciones.convierte_Date_a_LocalDate(fechaNacimiento);
		int anos = (int) ChronoUnit.YEARS.between(fechaNaci, hoy);
		
		if (anos>20) {
			
		return anos-1;
		}
		return anos;
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", fechaNacimiento="
				+  fechaNacimiento + ", altura= " + altura +"cm" + " Alumno [idAlumno=" + idAlumno + ", curso=" + curso + ", estudiosPrevios=" + estudiosPrevios + "]";
	} 
	
	
	
}
