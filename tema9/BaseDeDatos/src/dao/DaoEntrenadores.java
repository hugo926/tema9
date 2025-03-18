package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import clases.Entrenadores;
import util.Conexion;

public class DaoEntrenadores {
	public static List<Entrenadores> listaEntrenadores()
	{
		List<Entrenadores> lista = new ArrayList<Entrenadores>();
		try {
			Connection con = Conexion.getConexion();
			if(con!=null)
			{
				PreparedStatement pst = con.prepareStatement("select id_entrenador from entrenadores");
				ResultSet rs = pst.executeQuery(); 
			    while(rs.next())
			    {
					lista.add(new Entrenadores(rs.getInt("id_entrenador"),rs.getString("nombre"),rs.getString("nacionalidad"),rs.getInt("experiencia")));
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
