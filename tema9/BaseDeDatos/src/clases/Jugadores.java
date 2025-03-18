package clases;

public class Jugadores {
	private int id_jugador;
	private Equipos id_equipo;
	private String nombreJug;
	private String posicion;
	private int goles;
	
	public Jugadores() {
		super();
	}

	public Jugadores(int id_jugador, Equipos id_equipo, String nombreJug, String posicion, int goles) {
		super();
		this.id_jugador = id_jugador;
		this.id_equipo = id_equipo;
		this.nombreJug = nombreJug;
		this.posicion = posicion;
		this.goles = goles;
	}

	public int getId_jugador() {
		return id_jugador;
	}

	public void setId_jugador(int id_jugador) {
		this.id_jugador = id_jugador;
	}

	public Equipos getId_equipo() {
		return id_equipo;
	}

	public void setId_equipo(Equipos id_equipo) {
		this.id_equipo = id_equipo;
	}

	public String getNombreJug() {
		return nombreJug;
	}

	public void setNombreJug(String nombreJug) {
		this.nombreJug = nombreJug;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}
	
}

