package clases;

public class EstadisticasPartido {
	private int idEstadistica;
	private Partidos idPartido;
	private Equipos idEquipo;
	private int posesion;
	private int tirosPuerta;
	private int faltas;
	private int tarjetasAmarillas;
	private int tarjetasRojas;
	private int corners;
	private int goles;
	
	public EstadisticasPartido() {
		super();
	}

	public EstadisticasPartido(int idEstadistica, Partidos idPartido, Equipos idEquipo, int posesion, int tirosPuerta,
			int faltas, int tarjetasAmarillas, int tarjetasRojas, int corners, int goles) {
		super();
		this.idEstadistica = idEstadistica;
		this.idPartido = idPartido;
		this.idEquipo = idEquipo;
		this.posesion = posesion;
		this.tirosPuerta = tirosPuerta;
		this.faltas = faltas;
		this.tarjetasAmarillas = tarjetasAmarillas;
		this.tarjetasRojas = tarjetasRojas;
		this.corners = corners;
		this.goles = goles;
	}

	public int getIdEstadistica() {
		return idEstadistica;
	}

	public void setIdEstadistica(int idEstadistica) {
		this.idEstadistica = idEstadistica;
	}

	public Partidos getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(Partidos idPartido) {
		this.idPartido = idPartido;
	}

	public Equipos getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(Equipos idEquipo) {
		this.idEquipo = idEquipo;
	}

	public int getPosesion() {
		return posesion;
	}

	public void setPosesion(int posesion) {
		this.posesion = posesion;
	}

	public int getTirosPuerta() {
		return tirosPuerta;
	}

	public void setTirosPuerta(int tirosPuerta) {
		this.tirosPuerta = tirosPuerta;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}

	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

	public int getTarjetasRojas() {
		return tarjetasRojas;
	}

	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}

	public int getCorners() {
		return corners;
	}

	public void setCorners(int corners) {
		this.corners = corners;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	@Override
	public String toString() {
		return "[idEstadistica=" + idEstadistica + idPartido +
				 idEquipo + ", posesion=" + posesion + ", tirosPuerta=" + tirosPuerta + ", faltas=" + faltas
				+ ", tarjetasAmarillas=" + tarjetasAmarillas + ", tarjetasRojas=" + tarjetasRojas + ", corners="
				+ corners + ", goles=" + goles + "]";
	}
	
	

}

