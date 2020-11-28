package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
/**
 * 
 * @author TallerColaborativo
 *
 */
public class Constans {
	/**
	 * Constante CONSTANS: Guarda la frase con la que se realizarán algunas pruebas.
	 */
	private final static String CONSTANS = "Sogamoso ciudad del sol y del acero";

	
	
	
	/**
	 * searchString: Busca una cadena en la cadena por defecto, y hace un conteo de cuantas veces se encuentra ésta cadena
	 * @param cadena
	 * @return El número de veces que se encuentra la cadena en la constante por defecto 
	 */
	public static int searchString(String cadena) {
		String nombre = "";
		int count = 0;
		for (int i = 0; i < CONSTANS.length(); i++) {
			char caracter = CONSTANS.charAt(i);
			nombre = nombre + caracter;
			if (caracter == ' ') {
				nombre = "";
				continue;
			}
			if (cadena.length() == nombre.length() && nombre.equalsIgnoreCase(cadena)) {
				count++;
			}
		}
		return count;
	}
	
	
	
	
	
	
	
	
	
	/**
	 * getConstans: retorna CONSTANTS
	 * @return
	 */
	public static String getConstans() {
		return CONSTANS;
	}

}
