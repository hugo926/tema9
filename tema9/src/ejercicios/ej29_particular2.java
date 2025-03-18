package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import clases.particular2;

public class ej29_particular2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		int edad;
		String email;
		
		do {
			nombre = util.Validarfunciones.dimeString("Dime tu nombre", sc);
			edad= util.Validarfunciones.dimeEntero("Dime tu edad", sc);
			email= util.Validarfunciones.dimeString("Dime tu email", sc);
		} while (!((validar_email(email)) && nombre.length()>0 && edad>0));

		List<String> telefonos = new ArrayList<String>();
		particular2 personaParticular2 = new particular2(nombre,edad,email,telefonos); //creo objeto
		
		String tel = util.Validarfunciones.dimeString("Dime tu telefono", sc);
		personaParticular2.addtelefono(tel);//pa añadir el telefono q me digan a la lista
		
		
		System.out.println(personaParticular2.seguro());
		System.out.println(personaParticular2);

	}
	
	
	public static boolean validar_email (String email) {
		
		for (int i = 0; i <email.length() ; i++) {
			if (email.contains("@")&& email.contains(".") ) {
				return true;
			}
		}
		return false;
	}

		

}
