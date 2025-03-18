package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import clases.Estadios;
import util.Conexion;

public class DaoEstadios {
	public static List<Estadios> listaEstadios()
	{
		List<Estadios> lista = new ArrayList<Estadios>();
		try {
			Connection con = Conexion.getConexion();
			if(con!=null)
			{
				PreparedStatement pst = con.prepareStatement("select id_estadio from estadios");
				ResultSet rs = pst.executeQuery(); 
			    while(rs.next())
			    {
					lista.add(new Estadios(rs.getInt("id_estadio"),rs.getString("nombre"),rs.getString("ubicacion"),rs.getInt("capacidad")));
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
