package clases;

import java.util.Date;

public class Profesor extends Persona3 {
	
	protected int idProfesor;  
	protected int sueldo; 
	protected int saldo;
	
	
	public Profesor() {
		super();
	}

	public Profesor(String nombre, String apellidos, String dni, Date fechaNacimiento, int altura, 
			int idProfesor, int sueldo, int saldo) {
		super(nombre, apellidos, dni, fechaNacimiento, altura);
		this.idProfesor = idProfesor;
		this.sueldo = sueldo;
		this.saldo = saldo;
	}

	public int getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	} 
	
	public static void cobraSueldo () {
	//this.saldo+=this.sueldo;	
	}
	
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", fechaNacimiento="
				+  fechaNacimiento + ", altura= " + altura +"cm"+ " Profesor [idProfesor=" + idProfesor + ", sueldo=" + sueldo + ", saldo=" + saldo + "]";
	}
	
}
