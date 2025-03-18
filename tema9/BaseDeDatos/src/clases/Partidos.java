package clases;

import java.sql.Date;

public class Partidos {

	private int id_partido;
	private Equipos id_equipoLocal;
	private Equipos id_equipoVisitante;
	private Competiciones id_competicion;
	private Estadios id_estadio;
	private Date fecha;
	private int goles_local;
	private int goles_visitante;
	
	public Partidos() {
		super();
	}

	public Partidos(int id_partido, Equipos id_equipoLocal, Equipos id_equipoVisitante, Competiciones id_competicion, Estadios id_estadio,
			Date fecha, int goles_local, int goles_visitante) {
		super();
		this.id_partido = id_partido;
		this.id_equipoLocal = id_equipoLocal;
		this.id_equipoVisitante = id_equipoVisitante;
		this.id_competicion = id_competicion;
		this.id_estadio = id_estadio;
		this.fecha = fecha;
		this.goles_local = goles_local;
		this.goles_visitante = goles_visitante;
	}
	
	

/*	public Partidos(Equipos id_equipoLocal, Equipos id_equipoVisitante, Competiciones id_competicion, Date fecha,
			int goles_local, int goles_visitante) {
		super();
		this.id_equipoLocal = id_equipoLocal;
		this.id_equipoVisitante = id_equipoVisitante;
		this.id_competicion = id_competicion;
		this.fecha = fecha;
		this.goles_local = goles_local;
		this.goles_visitante = goles_visitante;
	}*/

	public int getId_partido() {
		return id_partido;
	}

	public void setId_partido(int id_partido) {
		this.id_partido = id_partido;
	}

	public Equipos getId_equipoLocal() {
		return id_equipoLocal;
	}

	public void setId_equipoLocal(Equipos id_equipoLocal) {
		this.id_equipoLocal = id_equipoLocal;
	}

	public Equipos getId_equipoVisitante() {
		return id_equipoVisitante;
	}

	public void setId_equipoVisitante(Equipos id_equipoVisitante) {
		this.id_equipoVisitante = id_equipoVisitante;
	}

	public Competiciones getId_competicion() {
		return id_competicion;
	}

	public void setId_competicion(Competiciones id_competicion) {
		this.id_competicion = id_competicion;
	}

	public Estadios getId_estadio() {
		return id_estadio;
	}

	public void setId_estadio(Estadios id_estadio) {
		this.id_estadio = id_estadio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getGoles_local() {
		return goles_local;
	}

	public void setGoles_local(int goles_local) {
		this.goles_local = goles_local;
	}

	public int getGoles_visitante() {
		return goles_visitante;
	}

	public void setGoles_visitante(int goles_visitante) {
		this.goles_visitante = goles_visitante;
	}
	
	@Override
	public String toString() {
		return "" + id_equipoLocal + id_equipoVisitante + id_competicion +
				", " + fecha+ ", "  + goles_local+ "-" +  goles_visitante;
	}
	
	/*@Override
	public String toString() {
		return "Partidos [id_partido=" + id_partido + ", id_equipoLocal=" + id_equipoLocal + ", id_equipoVisitante="
				+ id_equipoVisitante + ", id_competicion=" + id_competicion + ", id_estadio=" + id_estadio + ", fecha="
				+ fecha + ", goles_local=" + goles_local + ", goles_visitante=" + goles_visitante + "]";
	}*/
	
}
