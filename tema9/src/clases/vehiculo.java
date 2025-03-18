package clases;

public class vehiculo {
	//propiedades
	public int pasajeros;  //número de pasajeros
	public int maxPasajeros;  //máximo de pasajeros

	public vehiculo(int num) {
		maxPasajeros=num;
		
	}
	//y luego van los métodos
		public void subePasajero()
		{
			//le sumo 1 a los que tuviera
			pasajeros = pasajeros + 1;
		}
@Override
public String toString() { //al imprimir el objeto devolvera esos datos
	return "Vehiculo [pasajeros=" + pasajeros + ", maxPasajeros=" + maxPasajeros + "]";
}
}
