package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import clases.Entrenadores;
import clases.Equipos;
import clases.Estadios;
import util.Conexion;

public class DaoEquipos {
	public static List<Equipos> listaEquipos()
	{
		List<Equipos> lista = new ArrayList<Equipos>();
		try {
			Connection con = Conexion.getConexion();
			if(con!=null)
			{
				PreparedStatement pst = con.prepareStatement("select * from equipos\r\n"
						+ "inner join estadios on equipos.id_estadio = estadios.id_estadio\r\n"
						+ "inner join entrenadores on equipos.id_entrenador = entrenadores.id_entrenador;");
				ResultSet rs = pst.executeQuery(); 
			    while(rs.next())
			    {
			    	Estadios elEstadio = new Estadios(rs.getInt("id_estadio"),rs.getString("nombre"),rs.getString("ubicacion"),rs.getInt("capacidad"));
			    	Entrenadores elEntrenador = new Entrenadores (rs.getInt("id_entrenador"),rs.getString("nombre"),rs.getString("nacionalidad"),rs.getInt("experiencia"));
					lista.add(new Equipos(rs.getInt("id_equipo"),elEstadio,elEntrenador,rs.getString("nombre")));
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
