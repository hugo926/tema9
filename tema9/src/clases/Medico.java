package clases;

public class Medico extends PersonaHospital {

	protected String especialidad;
	protected int numColegiado;
	
	public Medico() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Medico(String nif, String nombre, String apellidos, int edad, int cantidadSangre, 
			String especialidad, int numColegiado) {
		super(nif, nombre, apellidos, edad, cantidadSangre);
		this.especialidad = especialidad;
		this.numColegiado = numColegiado;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getNumColegiado() {
		return numColegiado;
	}

	public void setNumColegiado(int numColegiado) {
		this.numColegiado = numColegiado;
	}
	
	@Override
   public int donarSangre(int cantPedida) {
		
		if (cantidadSangre-cantPedida<2 ) {
				return 0;
			}
			
		cantidadSangre= cantidadSangre-cantPedida;
		return cantPedida;
		
	}

	@Override
	public String toString() {
		return "Medico [especialidad=" + especialidad + ", numColegiado=" + numColegiado + ", nif=" + nif + ", nombre="
				+ nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", cantidadSangre=" + cantidadSangre + "]";
	}




   
   

}
