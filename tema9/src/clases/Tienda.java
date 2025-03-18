package clases;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	
	private String nombre;
	private String direccion;
	private List<Empleado> listaEmpleados;
	
	public Tienda() {
		super();
		listaEmpleados = new ArrayList<Empleado>();
	}

	public Tienda(String nombre, String direccion, List<Empleado> listaEmpleados) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaEmpleados = listaEmpleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
	//metodos
	public static void AniadirEmpleados(List<Empleado> listaEmpleados, Empleado Empleado) {
		listaEmpleados.add(Empleado);
	}
	
	public static double PagoMensual(double sueldo, double comision) {
		double pagoSueldo;
		double PagoComision;
		double totalPago;
		
		pagoSueldo = sueldo+= 
		
		PagoComision = sueldo*comision;
		
		totalPago = pagoSueldo+PagoComision;
		
		return totalPago;
	}
	
	public static void EstablecerComision (double totalPago, double comision) {
		if (totalPago>2000) {
			comision += 5/100;
		}
		else {
			
		}
	}

	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", direccion=" + direccion + ", listaEmpleados=" + listaEmpleados + "]";
	}
	
	
}


