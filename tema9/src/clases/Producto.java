package clases;

public class Producto {
	
	//propiedades
	private int codigo;
	private String nombre;
	private double precio;
	
	
	//constructores
	public Producto(int codigo, String nombre, double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto() {
		super();
	}
	
	//getters and setters
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//metodos
	
	

	//toString
	@Override
	public String toString() {
		return  codigo + " - " + nombre + " " + "(" + precio + ")" ;
	}	

}
