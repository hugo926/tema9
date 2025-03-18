package clases;

public class Equipos {
	
	private int id_equipo;
	private Estadios id_estadio;
	private Entrenadores id_entrenador;
	private String nombre;
	
	public Equipos() {
		super();
	}

	public Equipos(int id_equipo, Estadios id_estadio, Entrenadores id_entrenador, String nombre) {
		super();
		this.id_equipo = id_equipo;
		this.id_estadio = id_estadio;
		this.id_entrenador = id_entrenador;
		this.nombre = nombre;
	}

	public int getId_equipo() {
		return id_equipo;
	}

	public void setId_equipo(int id_equipo) {
		this.id_equipo = id_equipo;
	}

	public Estadios getId_estadio() {
		return id_estadio;
	}

	public void setId_estadio(Estadios id_estadio) {
		this.id_estadio = id_estadio;
	}

	public Entrenadores getId_entrenador() {
		return id_entrenador;
	}

	public void setId_entrenador(Entrenadores id_entrenador) {
		this.id_entrenador = id_entrenador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return " id_equipo=" + id_equipo + ", nombre= " + nombre + "," ;
	}
	
	

}
