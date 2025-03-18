package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Jugador {
	
	private int idJugador;
	private String nombre;
	private LocalDate fecha_fichaje;
	private int num_goles;
	private List<String> recuerdos;
	
	public Jugador() {
		super();
		 recuerdos = new ArrayList<String>();
	}

	public Jugador(int idJugador, String nombre, int num_goles) {
		super();
		this.idJugador = idJugador;
		this.nombre = nombre;
		this.fecha_fichaje = fecha_fichaje;
		this.num_goles = num_goles;
		this.recuerdos = recuerdos;
	}

	public int getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha_fichaje() {
		return fecha_fichaje;
	}

	public void setFecha_fichaje(LocalDate fecha_fichaje) {
		this.fecha_fichaje = fecha_fichaje;
	}

	public int getNum_goles() {
		return num_goles;
	}

	public void setNum_goles(int num_goles) {
		this.num_goles = num_goles;
	}

	public List<String> getRecuerdos() {
		return recuerdos;
	}

	public void setRecuerdos(List<String> recuerdos) {
		this.recuerdos = recuerdos;
	}
	
	// metodo
	
	public void MarcaGol (int num_goles) {
		int gol=1;
		LocalDate hoy = LocalDate.now();
		num_goles =gol;
		recuerdos.add("Gol"+ hoy);
		
	}
	
	@Override
	public String toString() {
		return "Jugador [idJugador=" + idJugador + ", nombre=" + nombre + ", fecha_fichaje=" + fecha_fichaje
				+ ", num_goles=" + num_goles + ", recuerdos=" + recuerdos + "]";
	}
	
	
	
	

	
	

}
