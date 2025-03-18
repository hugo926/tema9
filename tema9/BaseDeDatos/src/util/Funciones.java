package util;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;

public class Funciones {
	
	//de String a Date 
			public static Date convierte_String_a_DateSql(String fecha)
		    {
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					sdf.setLenient(false);
		    		return new java.sql.Date(sdf.parse(fecha).getTime());
				} catch (Exception e) {
					return null;
				}
		    }
			
			//de Date a String
			public static String convierte_Date_a_String(Date fDate)
			{
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				return sdf.format(fDate);
			}
			
			//de Date a LocalDate
			public static LocalDate convierte_Date_a_LocalDate(Date fDate)
			{
				return fDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			}
			//de LocalDate a Date
			public static Date convierte_LocalDate_a_Date(LocalDate fLocalDate)
			{
				java.util.Date d = Date.from(fLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
				return new Date(d.getTime());
			}

}
