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
	 * ownName: Convierte palabras en nombres propios, es decir, convierte todas sus iniciales en mayÃºsculas
	 * @return  aux, la cÃºal contiene la cadena con todas las palabras convertidas
	 */
	public static String ownName(){
		char[] cambio= CONSTANS.toCharArray();
		String aux;
		cambio[0]=Character.toUpperCase(cambio[0]);
		for (int i = 0; i < CONSTANS.length()-2; i++) {
			if (cambio[i]==' ') {
				cambio[i+1]=Character.toUpperCase(cambio[i+1]);
			}
		}
		aux= new String(cambio);
		return aux;
	}
	
	
	
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
	 * deleteCharacter: Borrar caracter que entra por parametro, en la constante por defecto
	 * @param caracter
	 * @return Constante sin los caracteres borrados
	 */
	public String delteCharacter(char caracter) {
		String aux = "";
		String cara=""+caracter;
		aux=CONSTANS.replaceAll(cara, "").replaceAll(cara.toLowerCase(), "");
		return aux;
	}
	/**
	 * interseccion: Entre constante por defecto y cadena parametrizada
	 * @param cadena
	 * @return 
	 */
	public String interseccion(String cadena) {
		String repetida = "";
		char[] cambio = cadena.toCharArray();
		char[] frase = CONSTANS.toCharArray();
		for (int i = 0; i < cadena.length(); i++) {
			for (int j = 0; j < CONSTANS.length(); j++) {
				String aux;
				aux = "" + cambio[i];
				if (Character.toLowerCase(cambio[i]) == Character.toLowerCase(frase[j])) {
					if (repetida.contains(aux)) {

					} else {
						repetida = repetida + cambio[i];
					}
				}
			}
		}
		return repetida;
	}
	/**
	 * deleteLeftRight: Elimina caracteres hasta que encuentre uno que no este en las dos cadenas, derecha o izquierda segun corresponda
	 * 					1 si se empieza por la derecha o cualquier otro numero por la izquierda
	 * @return  fraseII, CONSTANS modificada( sin los caracteres correspondientes)
	 */
	public void deleteLeftRight(String cadena, int sentido) {
		int con=0;
		metodos me= new metodos(cadena);
		boolean direccion;
		String[]palabra=cadena.split("");
		con=palabra.length;
		String frase[]=CONSTANS.split("");
		String fraseII[]=CONSTANS.split("");
		if (sentido==1) {
			direccion=false;
		}else {
			direccion=true;
		}
		if (direccion) {
			for (int i = 0; i < frase.length; i++) {
				for (int j = 0; j < palabra.length; j++) {
					con=palabra.length;
					if (frase[i].toLowerCase().contains(palabra[j])) {
						frase[i]="/";
					}
				}
				if (i>0) {
					if (frase[i-1].contains("/")) {	
					}	
				}
			}
			for (int k = 0; k < frase.length; k++) {
				if (!frase[k].contains("/")) {
					con=k;
					break;
				}
			}
			for (int j = con; j < fraseII.length; j++) {
				System.out.print(fraseII[j]);
			}
		}else if(!direccion) {
			for (int i = 0; i < frase.length; i++) {
				for (int j = 0; j < palabra.length; j++) {
					con=palabra.length;
					if (frase[i].toLowerCase().contains(palabra[j])||frase[i].contains(" ")) {
						frase[i]="/";
					}
				}
				if (i>0) {
					if (frase[i-1].contains("/")) {	
					}	
				}
			}
			for (int k = frase.length-1; k >=0; k--) {
				if (!frase[k].contains("/")) {
					con=k;
					break;
				}			
			}
			for (int j = 0; j < con+1; j++) {
				System.out.print(fraseII[j]);
				}
			}
		}
	
	
	
	
	
	
	/**
	 * getConstans: retorna CONSTANTS
	 * @return
	 */
	public static String getConstans() {
		return CONSTANS;
	}

}
