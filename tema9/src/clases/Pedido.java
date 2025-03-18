package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private LocalDate fecha;
	private List <Producto> ListaProducto; //lista NO CREAR
	private double precio_gastos_de_envio;
	private Persona2 persona;
	

	public Pedido() {
		super();
		ListaProducto = new ArrayList<Producto>();
	}


	public Pedido(LocalDate fecha, List<Producto> listaProducto, double precio_gastos_de_envio, Persona2 persona) {
		super();
		this.fecha = fecha;
		ListaProducto = listaProducto;
		this.precio_gastos_de_envio = precio_gastos_de_envio;
		this.persona = persona;
	}
	

	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public List<Producto> getListaProducto() {
		return ListaProducto;
	}


	public void setListaProducto(List<Producto> listaProducto) {
		ListaProducto = listaProducto;
	}


	public double getPrecio_gastos_de_envio() {
		return precio_gastos_de_envio;
	}


	public void setPrecio_gastos_de_envio(double precio_gastos_de_envio) {
		this.precio_gastos_de_envio = precio_gastos_de_envio;
	}


	public Persona2 getPersona() {
		return persona;
	}


	public void setPersona(Persona2 persona) {
		this.persona = persona;
	}


	//metodo
	public static double totalPrecio(double precio_gastos_de_envio) {
		double total = precio_gastos_de_envio;
		return total;
	}


	@Override
	public String toString() {
		return "Pedido [fecha=" + fecha + ", Producto=" + ListaProducto + ", precio_gastos_de_envio="
				+ precio_gastos_de_envio + ", persona=" + persona + "]";
	}
	
	public static void addProducto(int producto) {
		
	}
	
}

