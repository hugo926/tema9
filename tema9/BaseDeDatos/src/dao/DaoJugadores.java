package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import clases.Entrenadores;
import clases.Equipos;
import clases.Estadios;
import clases.Jugadores;
import util.Conexion;

public class DaoJugadores {
	public static List<Jugadores> listaJugadores()
	{
		List<Jugadores> lista = new ArrayList<Jugadores>();
		try {
			Connection con = Conexion.getConexion();
			if(con!=null)
			{
				PreparedStatement pst = con.prepareStatement("select id_jugador from jugadores");
				ResultSet rs = pst.executeQuery(); 
			    while(rs.next())
			    {
			    	Estadios elEstadio = new Estadios(rs.getInt("id_estadio"),rs.getString("nombre"),rs.getString("ubicacion"),rs.getInt("capacidad"));
			    	Entrenadores elEntrenador = new Entrenadores (rs.getInt("id_entrenador"),rs.getString("nombre"),rs.getString("nacionalidad"),rs.getInt("experiencia"));
			    	Equipos elEquipo = new Equipos(rs.getInt("id_equipo"),elEstadio,elEntrenador,rs.getString("nombre"));
					lista.add(new Jugadores(rs.getInt("id_jugador"),elEquipo,rs.getString("nombreJug") ,rs.getString("posicion"),rs.getInt("goles")));
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
}




