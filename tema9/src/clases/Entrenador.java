package clases;

public class Entrenador {
	
	private int idEntrenador;
	private String nombre;
	private double sueldo;
	private double saldo_cuenta;
	
	public Entrenador(int idEntrenador, double sueldo, double saldo_cuenta) {
		super();
		this.idEntrenador = idEntrenador;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.saldo_cuenta = saldo_cuenta;
	}
	
	public Entrenador() {
		super();
	}

	public int getIdEntrenador() {
		return idEntrenador;
	}
	public void setIdEntrenador(int idEntrenador) {
		this.idEntrenador = idEntrenador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public double getSaldo_cuenta() {
		return saldo_cuenta;
	}
	public void setSaldo_cuenta(double saldo_cuenta) {
		this.saldo_cuenta = saldo_cuenta;
	}
	
	//metodo
	public void CobraSueldo(double sueldo) {
		saldo_cuenta+=sueldo; //acumulo sueldo en saldo
	}

	@Override
	public String toString() {
		return "Entrenador [idEntrenador=" + idEntrenador  + ", sueldo=" + sueldo
				+ ", saldo_cuenta=" + saldo_cuenta + "]";
	}
	
	
	
	
	
	

}
