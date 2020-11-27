package view;

import java.util.Scanner;

import exceptions.IncorrectOptionException;
/**
 * 
 * @author TallerColaborativo
 *
 */
public class View {
	/**
	 * Scanner: console
	 */
	Scanner console = new Scanner(System.in);
	
	/**
	 * Lee e imprime las opciones del menú
	 * @return
	 * @throws IncorrectOptionException
	 */
	public int readOptionMenu() throws IncorrectOptionException {
		showMessage("Bienvenido, por favor elija la opción deseada: \n"+
						"1. Convertir a nombres propios.\n"+
						"2. Buscar cadena. \n"+
						"3. Encriptar cadena\n"+
						"4. Desencriptar cadena\n"+
						"5. Llenar caracteres\n"+
						"6. Borrar caracteres\n"+
						"7. Intersección\n"+
						"8. Diferencia\n"+
						"9. Borrar caracteres Izquierda o Derecha\r\n" + 
						"10. Convertir a fecha\n"+
						"11. Salir"+"\n");
		int option = Integer.parseInt(console.nextLine());
		if (option < 1 || option > 11) {
			throw new IncorrectOptionException();
		}
		return option;
	}
	
	/**
	 * Metodo para mostrar un mensaje
	 * @param message
	 */
	public void showMessage(String message) {
		System.out.println(message);
	}
	
	/**
	 * Metodo para mostar mensaje de error 
	 * @param message
	 */
	public void showMessageErr(String message) {
		System.err.println(message);
	}
	
	/**
	 * Metodo para leer un entero
	 * @param message
	 * @return
	 */
	public int readInt(String message) {
		System.out.println(message);
		return Integer.parseInt((console.nextLine()));
	}
	
	/**
	 * Metodo para leer una cadena
	 * @param message
	 * @return
	 */
	public String readString(String message) {
		System.out.println(message);
		return console.nextLine(); 
	}
	
	/**
	 * Metodo para leer un caracter
	 * @param message
	 * @return
	 */
	public Character readChar(String message) {
		System.out.println(message);
		return console.nextLine().charAt(0);
	}
	
	/**
	 * Metodo para elegir la dirección (derecha/izquiera) que es usado en algun otro metodo del programa
	 * @param message
	 * @return
	 * @throws IncorrectOptionException
	 */
	public boolean readBoolean(String message) throws IncorrectOptionException {
		System.out.println(message + "\n");
		System.out.println("1. Por derecha \n"+ "2. Por izquierda \n");
		int option = 0;
		boolean dor = true;
		option = Integer.parseInt(console.nextLine());
		if (option < 1 || option > 2) {
			throw new IncorrectOptionException();
		}
		if (option == 1) {
			return dor;
		}else {
			dor = false;
			return dor;
		}
	}

}
