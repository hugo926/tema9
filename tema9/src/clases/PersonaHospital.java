package clases;

public class PersonaHospital {
	
	protected String nif;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	protected int cantidadSangre;
	
	public PersonaHospital() {
		super();
	}

	public PersonaHospital(String nif, String nombre, String apellidos, int edad, int cantidadSangre) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.cantidadSangre = cantidadSangre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCantidadSangre() {
		return cantidadSangre;
	}

	public void setCantidadSangre(int cantidadSangre) {
		this.cantidadSangre = cantidadSangre;
	}
	
	public int donarSangre(int cantPedida) {
		
		if (cantidadSangre<cantPedida) {
			return 0;
		}
		
		cantidadSangre = cantidadSangre-cantPedida;
		return cantPedida;
	}

	@Override
	public String toString() {
		return "PersonaHospital [nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", cantidadSangre=" + cantidadSangre + "]";
	}
	
	//para pooner en paciente el string de cada uno
	public String medicoString() {
	
		return "";
	}
	
	public String enfermeroString() {
		
		return "";
	}
	
}
		
