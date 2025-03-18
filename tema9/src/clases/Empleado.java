package clases;

public class Empleado {
	
	private int idEmpleado;
	private String nombre;
	private Double sueldo;
	private Double comision;
	
	public Empleado() {
		super();
	}

	public Empleado(int idEmpleado, String nombre, Double sueldo) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public Double getComision() {
		return comision;
	}

	public void setComision(Double comision) {
		this.comision = comision;
	}
	
	//metodo calcular comision
	public static void comision(double sueldo) {
		double comision;
		if (sueldo>1000) {
			comision = 10/100;
		}
		else {
			comision = 5/100;
		}
			}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", sueldo=" + sueldo + ", comision="
				+ comision + "]";
	}

	

}
