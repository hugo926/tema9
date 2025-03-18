package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import clases.Competiciones;
import clases.Entrenadores;
import clases.Equipos;
import clases.Estadios;
import clases.EstadisticasPartido;
import clases.Partidos;
import dao.DaoCompeticion;
import dao.DaoEquipos;
import dao.DaoEstadiPartidos;
import dao.DaoPartidos;
import util.Funciones;
import util.ValidarFunciones;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("¡Bienvenido!");
		System.out.println("1.Generar partidos de una competicion");
		System.out.println("2.Ver partidos de una competicion");
		System.out.println("3.Ver todos los equipos");
		System.out.println("4.Ver estadisticas de un partido en una competicion");
		System.out.println("5.Ver estadisticas de un jugador en una competicion");
		//estadiEquipos no la uso
		System.out.println("6.Salir");
		
		//incializar variable para poner en la funcion
		List<Competiciones> listaCompe = DaoCompeticion.listaCompeticiones();
		List<Equipos> listaEquip = DaoEquipos.listaEquipos();
		List<Partidos> listaPartidos = DaoPartidos.listaPartidos(0);
	//	Competiciones idCompe = new Competiciones();
		
		//variables para el switch
		int opcion;
		int idPartido = 80;
		int idEquipo =6;
		do {
			
		opcion =ValidarFunciones.dimeEntero("Introduce una opcion", sc);
	
		switch (opcion) {
		case 1:
			Competiciones competicion =escogerCompeticiones(sc, listaCompe); //competiciones pq devuelvo competiciones y asi la guardo para meter esa a generar partidos
			generarPartidos(listaEquip, competicion);
			System.out.println("¡Partidos generados!");
			//System.out.println(escogerCompeticion(opcion));
			//System.out.println(generarFechaRandom(fechaAyer, fechaHoy, fechaManana)); 
			break;
			
		case 2:
			Competiciones competicion2 = escogerCompeticiones(sc, listaCompe);
			mostrarPartidos(competicion2.getId_competicion());
			break;
			
		case 3:
			mostrarEquipos(listaEquip);
			break;
		
		case 4:
			//escogerCompeticiones(sc, listaCompe);
			generarEstadisticasPartido(listaPartidos, idPartido, listaEquip, idEquipo);
			
			break;
			
		case 5:
			escogerCompeticiones(sc, listaCompe);
			break;	
		}
		} while (opcion!=6);
	}


	private static Competiciones escogerCompeticiones(Scanner sc, List<Competiciones> listaCompeticiones) {

		for (Competiciones competicion : listaCompeticiones) {
			System.out.println(competicion);
		}

		do {
			int opcionCompe = ValidarFunciones.dimeEntero("Elige una competicion", sc);

			for (Competiciones lacompe : listaCompeticiones) {
				if (opcionCompe == lacompe.getId_competicion()) {
					System.out.println("Competicion encontrada");
					System.out.println(lacompe);
					return lacompe;
				}
			}
			System.out.println("Competicion no encontrada"); // si no entra en el 2for q salga esto
		} while (true);
	}

	
	public static void mostrarEquipos(List<Equipos> listaEquipos ) {
		for (Equipos equipo : listaEquipos) {
			System.out.println(equipo);
		}
	}

	private static void mostrarPartidos(int idCompe) {
		List<Partidos> listaPart = DaoPartidos.listaPartidos(idCompe);
		
		if (listaPart.size() == 0) {
			System.out.println("Partidos no encontrados");
		}

		else {
			System.out.println("La competicion tiene estos partidos");
			for (Partidos partido : listaPart) {
				System.out.println(partido);
			}
		}
	}
	 
	public static Date generarFechaRandom(Date ayer, Date hoy, Date manana) {
	    Random random = new Random();

	    int diaRandom = random.nextInt(0,2); // 0(Ayer) 1(hoy) o 2(manana) pa q coja un numero de 0 a 2

	    if (diaRandom == 0) {
	        return ayer;
	    } else if (diaRandom == 1) {
	        return hoy;
	    } else {
	        return manana;
	    }
	}
       
	public static void generarPartidos (List<Equipos> listaEquipos, Competiciones idCompeticion) {
		//TRAEMOS EQUIPOS
		listaEquipos = DaoEquipos.listaEquipos();
		//List<Competiciones> listaCompe = DaoCompeticion.listaCompeticiones();
		//creo  partido	
		//FOR Q SE EJCUTE TANTAS VECES COMO LA MITAD DE EQUIPOS
		//CREO PARTIDO COJO UNO PARA LOCAL OTRO VISITANTE Y GENERO FECHAS GOLES.. 
		//Scanner sc = new Scanner (System.in);
		int cont=0;
		LocalDate hoy = LocalDate.now();
		Date fechaHoy = Funciones.convierte_LocalDate_a_Date(hoy);
		LocalDate ayer = hoy.minusDays(1);
		Date fechaAyer = Funciones.convierte_LocalDate_a_Date(ayer);
		LocalDate manana = hoy.plusDays(1);
		Date fechaManana= Funciones.convierte_LocalDate_a_Date(manana);

		
		for (int i = 1; i <=listaEquipos.size()/2; i++) {
			Equipos equipoLocal = listaEquipos.get(cont++);
			Equipos equipoVisitante = listaEquipos.get(cont++);
			//Competiciones competicion = (Competiciones) escogerCompeticiones(sc, listaCompe);
			Estadios estadio = equipoLocal.getId_estadio();
			Date fecha = generarFechaRandom(fechaAyer, fechaHoy, fechaManana);
			Random r = new Random();
			int golLocal = r.nextInt(1,5);
			int golVis = r.nextInt(1,5);
			Partidos partido = new Partidos(0,equipoLocal,equipoVisitante,idCompeticion,estadio,fecha,golLocal,golVis);
			partido=DaoPartidos.inserta(partido); 
			System.out.println(partido);
		}
	
	}
	
	public static void generarEstadisticasPartido (List<Partidos> listaPartidos, int idPartido, List<Equipos>listaEquipos, int idEquipo ) {
		
		EstadisticasPartido estadistica;
		
		listaPartidos = DaoPartidos.listaPartidos(idEquipo);//le paso los partidos
		
		for (Partidos partido : listaPartidos) {
			idPartido =partido.getId_partido();
		
		
		listaEquipos = DaoEquipos.listaEquipos(); //le paso los partidos
		
		for (Equipos equipo : listaEquipos) {
			idEquipo =equipo.getId_equipo();
		
		
	//	for (int i = 1; i <=listaPartidos.size()/2; i++) {
			Random r = new Random();
			int posesionEquipo = r.nextInt(0,101);
			int tirosPuerta = r.nextInt(0,20);
			int faltas = r.nextInt(0,20);
			int amarillas = r.nextInt(6);
			int rojas = r.nextInt(3);
			int corners = r.nextInt(0,12);
			int goles = r.nextInt(0,9);
			
			 estadistica = new EstadisticasPartido(0, partido, equipo, posesionEquipo, tirosPuerta, faltas, amarillas, rojas, corners, goles);
			
			// DaoEstadiPartidos.inserta(estadistica);	
			 System.out.println(estadistica);
		}
		
	}
	
}
	}
//}
	
