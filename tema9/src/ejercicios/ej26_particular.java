package ejercicios;

import java.time.LocalDate;

import clases.persona;

public class ej26_particular {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		persona persona1 = new persona("Hugo",LocalDate.of(2006,01,13),1.70);
		System.out.println(persona1.getFecha_nacimiento());
		System.out.println(persona1.cumpleAnios());

	}

}
