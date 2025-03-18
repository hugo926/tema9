package clases;

import java.util.ArrayList;
import java.util.List;

public class particular2 {
	
	//propiedades
	private String nombre;
	private int edad;
	private String email;
	private List<String> Listatelefonos = new ArrayList<String>();
	
	
	//constructor
	public particular2(String nombre, int edad, String email, List<String> telefonos) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
		this.Listatelefonos = telefonos;
		
	}

	public particular2() {
		super();
	}
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getTelefonos() {
		return Listatelefonos;
	}

	public void setTelefonos(List<String> telefonos) {
		this.Listatelefonos = telefonos;
	} 
	
	//metodo
	public double seguro () { //no le meto nada, q coja edad q le meto al principio
		double seguro = 1000/edad;
		
	return seguro;
	}
	
	public List<String> addtelefono (String telefono) {
		Listatelefonos.add(telefono);
		return Listatelefonos;
	}
	
	//pa mostrar todo en main
	@Override
	public String toString() {
		return "particular2 [nombre=" + nombre + ", edad=" + edad + ", email=" + email + ", Listatelefonos="
				+ Listatelefonos + "]";
	}

}
