package clases;

public class Electrodomesticos {
	
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico; //son las letras
	protected int peso;
	
	String[] Arraycolores = {"Blanco", "negro", "rojo", "azul", "gris"};
	char[] Arrayletras = {'A', 'B', 'C', 'D', 'E', 'F'};
	
	public Electrodomesticos() {
		super();
		this.precioBase=100;
		this.peso=5;
		this.color="Blanco";
		this.consumoEnergetico='F';
	}

	public Electrodomesticos(double precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
		this.color="Blanco";
		this.consumoEnergetico='F';
	}

	public Electrodomesticos(double precioBase, String color, char consumoEnergetico, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = Character.toUpperCase(consumoEnergetico); //pa q lo coja aunq me lo pongan en minusculas
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}
	
	private void comprobarConsumoEnergetico() {
		
		for (char LaLetra : Arrayletras) { //de tipo char
			if ( LaLetra==consumoEnergetico) { //para validar q el consumoEnergetico es una letra tipo char
				
			}
			else {
				this.consumoEnergetico='F';
			}
		}
	}
	
    private void comprobarColor() {
		
		for (String Elcolor : Arraycolores) {
			if ( Elcolor==color) {
				
			}
			else {
				this.color="Blanco";
			}
		}
	}
    
    public double precioFinal() {
    	
    	double precioTotal = 0;
    	
    	switch (consumoEnergetico) {
		case 'A':
			precioTotal = precioBase+100 + tamañoPrecio();
			break;
		case 'B':
			precioTotal = precioBase+80 + tamañoPrecio();
			break;
		case 'C':
			precioTotal = precioBase+60 + tamañoPrecio();
			break;
		case 'D':
			precioTotal = precioBase+50 + tamañoPrecio();
			break;
		case 'E':
			precioTotal = precioBase+30 + tamañoPrecio();
			break;
		case 'F':
			precioTotal = precioBase+10 + tamañoPrecio();
			break;

		default:
			break;
    }
		return precioTotal;
    
 }
    
    public double tamañoPrecio() {
    	if (peso>=0 && peso<=19) {
			return 10;
		}
    	if (peso>=20 && peso<=49) {
    		return 50;
		}
    	if (peso>=50 && peso<=79) {
    		return 80;
		}
    	if (peso>=80) {
    		return 100;
		}
		return 0;
    }

	@Override
	public String toString() {
		return "Electrodomesticos [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]" + precioFinal();
	}
    
    
}
	
