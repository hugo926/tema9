package clases;

import java.time.LocalDate;

public class Enfermero extends PersonaHospital {
	
	protected String especialidad;
	protected LocalDate AnoFinEstudios;
	
	public Enfermero() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Enfermero(String nif, String nombre, String apellidos, int edad, int cantidadSangre,
			String especialidad, LocalDate AnoFinEstudios) {
		super(nif, nombre, apellidos, edad, cantidadSangre);
		this.especialidad = especialidad;
		this.AnoFinEstudios = AnoFinEstudios;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public LocalDate getAnoFinEstudios() {
		return AnoFinEstudios;
	}

	public void setAnoFinEstudios(LocalDate AnoFinEstudios) {
		this.AnoFinEstudios = AnoFinEstudios;
	}
	
	@Override
	public int donarSangre(int cantPedida) {
		
		if (cantidadSangre-cantPedida<3 ) {
			return 0;
		}
		
	cantidadSangre= cantidadSangre-cantPedida;
	return cantPedida;
	}

	@Override
	public String toString() {
		return "Enfermero [especialidad=" + especialidad + ", anoFinEstudios=" + AnoFinEstudios + ", nif=" + nif
				+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", cantidadSangre="
				+ cantidadSangre + "]";
	}

	

}
