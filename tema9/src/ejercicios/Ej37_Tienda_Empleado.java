package ejercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import clases.Empleado;
import clases.Tienda;

public class Ej37_Tienda_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creamos lista de los 10 empleados
		List<Empleado> listaCadaEmpleado = new ArrayList<Empleado>();
		
		//generamos los 10 empleados y los metemos a la lista
		Random r = new Random();
		int IDnombre =0;
		String nombre;
		double sueldo;
		
		 //lista de cada dempleado
		for (int i = 1; i < 11; i++) {
			IDnombre= i;
			nombre = "Empleado" + i;
			sueldo = r.nextInt(500,1501);	
			Empleado cadaEmpleado = new Empleado(IDnombre, nombre, sueldo);  //pa q cada empleado lo guarde
			listaCadaEmpleado.add(cadaEmpleado); //pa guardar cada empleado en la lista
			System.out.println(cadaEmpleado);
		}
		System.out.println();
		
		//generamos 3 tiendas
		String nombreTienda;
		String direccion;
		List<Tienda> listaCadaTienda = new ArrayList<Tienda>(); //lista de cada tienda
		for (int i = 1; i <= 3; i++) {
			nombreTienda = "Tienda" + i;
			direccion = "Avenida" + i;
			Tienda cadaTienda = new Tienda(nombreTienda, direccion, listaCadaEmpleado); //guardar todo en 3 tiendas
			System.out.println(cadaTienda);
	}
		
		// meter 2 empleados en cada tiendalistaCadaEmpleado.add(cadaEmpleado);
		
		//
	}
}


