package clases;

public class circulo {
	//propiedades
	public int radio;
	public int diametro;
	
	//constructores generate
	public circulo(int radio, int diametro) {
		super();
		this.radio = radio;
	}

public circulo() {
		super();
	}

//source generate getters and setters
	public int getRadio() {
		return radio;
	}


	public void setRadio(int radio) {
		this.radio = radio;
	}


	//metodos
	public void area (int radio) { //NO DEVUELVE NADA Y LE METO EL RADIO
		double area = (Math.PI) * (2 * radio);
		System.out.println(area);
	}

	@Override
	public String toString() {
		return "circulo [radio=" + radio + ", diametro=" + diametro + "]";
	}
	

}
