package clases;

public class Competiciones {
	private int id_competicion;
	private Equipos id_equipoGanador;
	private String nombreCompeticion;
	
	public Competiciones() {
		super();
	}
	
	//antes de tener ganador
		public Competiciones(int id_competicion, String nombreCompeticion) {
			super();
			this.id_competicion = id_competicion;
			this.nombreCompeticion = nombreCompeticion;
		}
	
	//post equipo ganador
	public Competiciones(int id_competicion, Equipos id_equipoGanador, String nombreCompeticion) {
		super();
		this.id_competicion = id_competicion;
		this.id_equipoGanador = id_equipoGanador;
		this.nombreCompeticion = nombreCompeticion;
	}

	public int getId_competicion() {
		return id_competicion;
	}

	public void setId_competicion(int id_competicion) {
		this.id_competicion = id_competicion;
	}

	public Equipos getId_equipoGanador() {
		return id_equipoGanador;
	}

	public void setId_equipoGanador(Equipos id_equipoGanador) {
		this.id_equipoGanador = id_equipoGanador;
	}

	public String getNombreCompeticion() {
		return nombreCompeticion;
	}

	public void setNombreCompeticion(String nombreCompeticion) {
		this.nombreCompeticion = nombreCompeticion;
	}

	/*@Override
	public String toString() {
	    return "Competición {" +
	           "ID: " + id_competicion + ", " +
	           "Nombre: '" + nombreCompeticion + "'" +
	           "}";
	}*/

	@Override
	public String toString() {
		return " id_competicion=" + id_competicion + ", nombreCompeticion= " + nombreCompeticion + "";
	}

	
	
}
