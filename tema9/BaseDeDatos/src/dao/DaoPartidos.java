package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import clases.Competiciones;
import clases.Entrenadores;
import clases.Equipos;
import clases.Estadios;
import clases.Partidos;
import util.Conexion;

public class DaoPartidos {
	public static List<Partidos> listaPartidos(int idCompe)
	{
		List<Partidos> lista = new ArrayList<Partidos>();
		try {
			Connection con = Conexion.getConexion();
			if(con!=null)
			{
				//select base de datos
				PreparedStatement pst = con.prepareStatement("select partidos.id_partido, partidos.id_equipoLocal, elLocal.nombre, partidos.id_equipoVisitante, elVisitante.nombre, partidos.id_competicion, competiciones.nombreCompeticion, partidos.id_estadio, estadios.nombre, estadios.ubicacion, estadios.capacidad, partidos.fecha, partidos.goles_local, partidos.goles_visitante, entrenadores.id_entrenador, entrenadores.nombre, entrenadores.nacionalidad, entrenadores.experiencia\r\n"
						+ "from partidos\r\n"
						+ "inner join competiciones on partidos.id_competicion = competiciones.id_competicion\r\n"
						+ "inner join equipos elLocal on partidos.id_equipoLocal = elLocal.id_equipo\r\n"
						+ "inner join equipos elVisitante on partidos.id_equipoVisitante = elVisitante.id_equipo\r\n"
						+ "inner join estadios on elLocal.id_estadio = estadios.id_estadio\r\n"
						+ "inner join entrenadores on elLocal.id_entrenador = entrenadores.id_entrenador\r\n"
						+ "where partidos.id_competicion=?;");
				pst.setInt(1, idCompe); //asigna el valor de idCompe al primer ?
				
				ResultSet rs = pst.executeQuery(); 
			    while(rs.next())
			    {
			    //partido con todos los datos			    	
			    Estadios estadioLocal = new Estadios(rs.getInt("id_estadio"),rs.getString("estadios.nombre"),rs.getString("ubicacion"),rs.getInt("capacidad"));
			    Entrenadores elEntrenador = new Entrenadores (rs.getInt("id_entrenador"),rs.getString("nombre"),rs.getString("nacionalidad"),rs.getInt("experiencia")); //no sale xq en clase partidos no lo he puesto
			    Equipos equipoLocal = new Equipos(rs.getInt("id_equipoLocal"),estadioLocal,elEntrenador,rs.getString("elLocal.nombre"));
			    Equipos equipoVisitante = new Equipos(rs.getInt("id_equipoVisitante"),estadioLocal,elEntrenador,rs.getString("elVisitante.nombre"));
			    Competiciones laCompeticion = new Competiciones (rs.getInt("id_competicion"),equipoLocal,rs.getString("nombreCompeticion"));
				lista.add(new Partidos(rs.getInt("id_partido"),equipoLocal,equipoVisitante,laCompeticion,estadioLocal,rs.getDate("fecha"),rs.getInt("goles_local"),rs.getInt("goles_visitante")));
			    }
			    rs.close();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			Conexion.cierraConexion();
		}
		return lista;
	}
	
	public static Partidos inserta(Partidos partido) {
		try {
			Connection con = Conexion.getConexion();
			if(con!=null)
			{
				PreparedStatement pst = con.prepareStatement("insert into partidos (id_equipoLocal, id_equipoVisitante, id_competicion, id_estadio, fecha, goles_local, goles_visitante) Values (?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
				//asignar valores al insert para la base de datos
				pst.setInt(1, partido.getId_equipoLocal().getId_equipo());
				pst.setInt(2, partido.getId_equipoVisitante().getId_equipo());
				pst.setInt(3, partido.getId_competicion().getId_competicion());
				pst.setInt(4, partido.getId_estadio().getId_estadio());
				pst.setDate(5,partido.getFecha());
				pst.setInt(6, partido.getGoles_local());
				pst.setInt(7, partido.getGoles_visitante());
				
				pst.executeUpdate(); //pa ejecutar la consulta
				
				//recuperamos la clave generada() //para el id, al ser auto increment
				ResultSet rs = pst.getGeneratedKeys();
				if (rs.next()) {
					partido.setId_partido(rs.getInt(1)); // Asignar el ID generado al objeto partido
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			Conexion.cierraConexion();
		}
		return partido;
	}
}

