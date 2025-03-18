package clases;

public class particular {
	
	//propiedades
	private String nombre;
	private int edad;
	private String email;
	
	//constructores generate
	public particular(String nombre, int edad, String email) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
	}

	public particular() { //crear esto siempre
		super();
	}
	
	//getters ans detters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//metodos
	public double seguro ( ) { //no le meto nada, q coja edad q le meto al principio
		double seguro = 1000/edad;
	return seguro;
	}
	
}
