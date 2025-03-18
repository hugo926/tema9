package clases;

public class Entrenadores {
	
	private int id_entrenador;
	private String nombre;
	private String nacionalidad;
	private int experiencia;
	
	public Entrenadores() {
		super();
	}

	public Entrenadores(int id_entrenador, String nombre, String nacionalidad, int experiencia) {
		super();
		this.id_entrenador = id_entrenador;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.experiencia = experiencia;
	}

	public int getId_entrenador() {
		return id_entrenador;
	}

	public void setId_entrenador(int id_entrenador) {
		this.id_entrenador = id_entrenador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Entrenadores [id_entrenador=" + id_entrenador + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad
				+ ", experiencia=" + experiencia + "]";
	}
	
	

}
