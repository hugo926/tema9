package clases;

public class Estadios {
	
	private int id_estadio;
	private String nombre;
	private String ubicacion;
	private int capacidad;
	
	public Estadios() {
		super();
	}

	public Estadios(int id_estadio, String nombre, String ubicacion, int capacidad) {
		super();
		this.id_estadio = id_estadio;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.capacidad = capacidad;
	}

	public int getId_estadio() {
		return id_estadio;
	}

	public void setId_estadio(int id_estadio) {
		this.id_estadio = id_estadio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return " id_estadio=" + id_estadio + " nombre: " + nombre + ", ubicacion=" + ubicacion + ", capacidad="
				+ capacidad;
	}
	
	
	
}
