package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import clases.Entrenador;
import clases.Equipo;
import clases.Jugador;
import clases.Producto;

public class Ej_RepasoFutbol_EquipoJugadorEntrenador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// creo 5 equipos
		Random r = new Random();
		List<Equipo> listaEquipos = creo5Equipos(); // lista equipos la rellleno con la funcion para crear 5 equipos
		
		// creo 25 jugadores
		int idJugador;
		int goles = 0;
		for (int i = 1; i <= 25; i++) {
			idJugador = i;
			Jugador jugadores = new Jugador(idJugador, "", goles);
			// System.out.println(jugadores);
		}

		// creo 10 entrenadores
		int idEntrenador;
		double sueldo;
		int saldo = 0;
		for (int i = 1; i <= 10; i++) {
			idEntrenador = i;
			sueldo = r.nextDouble(1000, 2001);
			Entrenador entrenadores = new Entrenador(idEntrenador, redondear(sueldo), saldo);
			// System.out.println(entrenadores);
		}

		// menu
		int opcion;
		do {
			System.out.println("1.Fichar jugadores");
			System.out.println("2.Fichar entrenador");
			System.out.println("3.Marcar gol");
			System.out.println("4.Despedir jugador");
			System.out.println("5.Ver equipos");
			System.out.println("6.Salir");
			opcion = util.Validarfunciones.dimeEntero("Elige una opcion", sc);

			switch (opcion) {
			case 1:
				FicharJugadores(listaEquipos, sc);
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;

			default:
				break;
			}
		} while (opcion != 6);

	}

	private static List<Equipo> creo5Equipos() {
		int idEquipo;
		double presupuesto;
		Random r = new Random();
		List<Equipo> listaEquipos = new ArrayList<Equipo>(); // creo la lista para tenerlos ahi

		for (int i = 1; i <= 5; i++) {
			idEquipo = i;
			presupuesto = r.nextDouble(20000, 100001);
			Equipo equipo = new Equipo(idEquipo, redondear(presupuesto)); // guardo datos
			listaEquipos.add(equipo); // añado los datos a la lista
			
		}
		return listaEquipos;
	}

	// funciones
	public static double redondear(double presupuesto) {
		return Math.round(presupuesto * 100) / 100;
	}

	public static void FicharJugadores(List<Equipo> listaEquipos, Scanner sc) {
		for (Equipo equipo : listaEquipos) { //pa imprimir la lista de 5 equipos
			System.out.println(equipo);
		}
		int idEquipo;
		do {
			idEquipo = util.Validarfunciones.dimeEntero("Elige un idEquipo", sc);
		} while (!(idEquipoEnListaEquipos(idEquipo, listaEquipos)));
	}
	
	public static boolean idEquipoEnListaEquipos(int idEquipo, List<Equipo> listaEquipos) { //pa ver q idEquipo este en la lista
		for (Equipo idEquipoRecorrido : listaEquipos) { //foreach tipo producto(como si fuera int) como le llamo (es como la i) : nuevos(la lista)
			if (idEquipoRecorrido.getIdEquipo()==idEquipo) {
				return true;
			}
			else {
		}
			
		}
		return false;
	}

}
