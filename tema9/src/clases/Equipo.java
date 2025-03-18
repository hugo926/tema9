package clases;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	
	private int idEquipo;
	private String nombre;
	private Entrenador entrenador;
	private List<Jugador> jugadores;
	private double presupuesto;
	
	public Equipo() {
		super();
		 jugadores = new ArrayList<Jugador>();
	}

	public Equipo(int idEquipo, double presupuesto) {
		super();
		this.idEquipo = idEquipo;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	//metodo
	public boolean FicharJugador(Jugador jugador1) {
		if (jugadores.size()<3) {
		jugadores.add(jugador1);
			return true;
		}
		return false;
		
	}
	
	public boolean FicharEntrenador(Entrenador entrenador1) {
		// no tiene entrenador hay q fichar
		if (entrenador == null) {
			if (presupuesto > entrenador1.getSueldo() * 12) {
				setPresupuesto(presupuesto-entrenador1.getSueldo()*12); //le pago
				setEntrenador(entrenador1);// le ficho entrenador1
				return true;
			} else {
				return false;
			}
			
		//si hay entrendor
		} else {
			if ((entrenador.getSueldo() * 2) + (entrenador1.getSueldo() * 12) <= presupuesto) { // hay entrenador lo despido (*2) + para pagar nuevo entrenador menor q presupuesto
				setPresupuesto(presupuesto - ((entrenador.getSueldo() * 2) + (entrenador1.getSueldo() * 12))); //el presupuesto q tengo q sea: - lo q me cuesta despedir + lo q me cuesta contratar al nuevo
				setEntrenador(entrenador1); // ficho al nuevo
				return true;
			} else {
				return false;
			}
		}

	}
	
	
	public boolean DespedirJugador(Jugador jugador2, double indemnizacion) {
	
		if (presupuesto>indemnizacion) {
			jugadores.remove(jugador2);
			presupuesto -= indemnizacion; //para restarlw la indem... al presupuesto
			return true;
		}
		return false;
	}

	
	@Override
	public String toString() {
		return "Equipo idEquipo=" + idEquipo + ", presupuesto=" + presupuesto;
	}
	
	

	
	
	
	
	
	
	
	

}
