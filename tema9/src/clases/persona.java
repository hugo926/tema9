package clases;

import java.time.LocalDate;

public class persona {
	//propiedades
	private String nombre;
	private LocalDate fecha_nacimiento;
	private double altura;
	
	//constructor
	public persona(String nombre, LocalDate fecha_nacimiento, double altura) {
		super();
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.altura = altura;
	}

	public persona() {
		super();
	}

	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//metodo
	public boolean cumpleAnios() {
		LocalDate hoy = LocalDate.now();
		if(hoy.getMonth().equals(fecha_nacimiento.getMonth()) && hoy.getDayOfMonth()==fecha_nacimiento.getDayOfMonth())  
		{
			return true;
		}
		return false;
	}
}
