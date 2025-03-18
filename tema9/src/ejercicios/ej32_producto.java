package ejercicios;

import java.util.Iterator;
import java.util.Random;

import clases.Producto;



public class ej32_producto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		for (int i = 1; i < 11; i++) {
	
			Producto nuevos = new Producto(i,"nombre" + i, redondear(r.nextDouble(0,51)) );		
			System.out.println(nuevos);
		}
		
	}

	private static double redondear(double n) {
		
	return	Math.round(n*100)/100;
	}

}

