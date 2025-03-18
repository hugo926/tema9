package clases;

import java.time.LocalDate;

public class Paciente extends PersonaHospital {
	
	protected LocalDate fechaIngreso;
	protected String causaIngreso;
	protected Medico medicoTrata;
	protected Enfermero enfermeroAtiende;
	
	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Paciente(String nif, String nombre, String apellidos, int edad, int cantidadSangre,
			LocalDate fechaIngreso, String causaIngreso, Medico medicoTrata, Enfermero enfermeroAtiende) {
		super(nif, nombre, apellidos, edad, cantidadSangre);
		this.fechaIngreso = fechaIngreso;
		this.causaIngreso = causaIngreso;
		this.medicoTrata = medicoTrata;
		this.enfermeroAtiende = enfermeroAtiende;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getCausaIngreso() {
		return causaIngreso;
	}

	public void setCausaIngreso(String causaIngreso) {
		this.causaIngreso = causaIngreso;
	}

	public Medico getMedicoTrata() {
		return medicoTrata;
	}

	public void setMedicoTrata(Medico medicoTrata) {
		this.medicoTrata = medicoTrata;
	}

	public Enfermero getEnfermeroAtiende() {
		return enfermeroAtiende;
	}

	public void setEnfermeroAtiende(Enfermero enfermeroAtiende) {
		this.enfermeroAtiende = enfermeroAtiende;
	}

	@Override
	public int donarSangre(int cantPedida) {
		if (cantidadSangre-cantPedida<5 ) {
			return 0;
		}
		
	cantidadSangre= cantidadSangre-cantPedida;
	return cantPedida;
	}
	
	@Override
	public String toString() {
		return "Paciente [fechaIngreso=" + fechaIngreso + ", causaIngreso=" + causaIngreso + ", medicoTrata="
				+ medicoString() + ", enfermeroAtiende=" + enfermeroString()+  ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", nif=" + nif +", edad=" + edad + ", cantidadSangre=" + cantidadSangre + "]";
	}
	
	//hacer en la clase padre y luego editar aqui
	 @Override
	    public String medicoString() {
	        return medicoTrata.getNombre() +" "+ medicoTrata.getApellidos();
	    }

	  @Override
	    public String enfermeroString() {
	        return enfermeroAtiende.getNombre() +" "+ enfermeroAtiende.getApellidos();
	    }

}
