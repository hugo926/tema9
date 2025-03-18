package ejercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import clases.Pedido;
import clases.Persona2;
import clases.Producto;

public class Ej35_produPerso2Pedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear 10 productos ccon datos aleatorios
		Random r = new Random();
		List<Producto> listaProductos = new ArrayList<Producto>(); //listaProductos
		for (int i = 1; i < 11; i++) {
			Producto elProducto = new Producto(i,"nombre" + i, redondear(r.nextDouble(0,51)) );
			listaProductos.add(elProducto); //añado el producto a la lista de productos
			System.out.println(elProducto);
		}
		//creo la lista de Pedido
		List<Producto> listaPedido = new ArrayList<Producto>();
		//crear persona
		Persona2 persona = new Persona2(54543,"Pepe","Garza","67868");
		
		//crear pedido
		Scanner sc = new Scanner(System.in);
		int productoElegido;
		do {
			productoElegido =util.Validarfunciones.dimeEntero("Elige un producto escribiendo su codigo", sc);
			Pedido.addProducto(productoElegido);
			
		// validar q el codigo exista
			if (codigoEnLista(productoElegido, listaProductos)) {
				for (Producto producto : listaProductos) {
			
					if (producto.getCodigo()==productoElegido) {
						listaPedido.add(producto);
						
					}
				}
				
				System.out.println("El producto se ha añadido");
			}	
			else if (productoElegido==-1) {
				break;
				}	
			else {
				System.out.println("Codigo incorrecto");
			}
		} while (productoElegido!=-1);
		
		//el pedido q han pedido
		Pedido elPedido = new Pedido(LocalDate.now(),listaPedido,5.90,persona);
		//pedido q han pedido /*para*/ persona2
		System.out.println(elPedido);
		
	}
	
	private static double redondear(double n) { //para redondear el decimal del precio
	
		return	Math.round(n*100)/100;
	}
	
	private static boolean codigoEnLista(int productoElegido, List<Producto> nuevos) {
		for (Producto codigo : nuevos) { //foreach tipo producto(como si fuera int) como le llamo (es como la i) : nuevos(la lista)
			if (productoElegido==codigo.getCodigo()) {
				return true;
			}
			else {
		}
			
		}
		return false;
	}

}
