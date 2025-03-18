package clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import util.Validarfunciones;

public class Persona3 {

	protected String nombre;
	protected String apellidos;
	protected String dni;
	protected Date fechaNacimiento;
	protected int altura; //en cm

	public Persona3() {
		super();
	}
	
	public Persona3(String nombre, String apellidos, String dni, Date fechaNacimiento, int altura) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int calculaEdad(Date fechaNacimiento) {
		
		LocalDate hoy = LocalDate.now();
		LocalDate fechaNaci= Validarfunciones.convierte_Date_a_LocalDate(fechaNacimiento);
		int anos = (int) ChronoUnit.YEARS.between(fechaNaci, hoy);

		return anos;
	}
	
	public  int cambiaAltura (int altura) {
		
		altura= altura + 5;
		
		return altura;
	}
	
	
	@Override
	public String toString() {
		return "Persona3 [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", fechaNacimiento="
				+ fechaNacimiento + ", altura=" + altura + "]";
	}
	
	
	
}
