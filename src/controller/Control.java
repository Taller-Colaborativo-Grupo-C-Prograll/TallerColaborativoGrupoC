package controller;

import exceptions.IncorrectOptionException;
import model.Constans;
import view.View;
/**
 * Clase Control: Es donde se aplica y se controla las demás clases del programa.
 * @author TallerColaborativo
 *
 */
public class Control {
	
	private Constans constant;
	private View view;
	
	/**
	 * Metodo constructor: Se instancias dos clases, además ejecuta método run()
	 * @throws IncorrectOptionException
	 */
	public Control() throws IncorrectOptionException {
		constant = new Constans();
		view = new View();
		run();
	}
	
	/**
	 * run(): Es el metodo en el cuál se le da un orden a la ejecución del programa
	 * @throws IncorrectOptionException
	 */
	public void run() throws IncorrectOptionException {
		boolean isTrue = true;
		while (isTrue) {
			int option = 0;
			try {
				view.showMessage("\n"+"La cadena por defecto será: " + constant.getConstans());
				option = (view.readOptionMenu());
			} catch (NumberFormatException e) {
				view.showMessageErr("Opción no valida");
			} catch (IncorrectOptionException e) {
				view.showMessageErr(e.getMessage());
			}
			switch (option) {
			case 1:
				view.showMessage(constant.ownName());
				break;
			case 2:
				view.showMessage(constant.searchString(view.readString("Escribe la palabra que deseas buscar"))+"");
				break;
			case 3:
				view.showMessage(constant.encripter(view.readString("Escribe la frase que deseas encriptar")));
				break;
			case 4:
				view.showMessage(constant.desencripter(view.readString("Escribe la frase que deseas desencriptar")));
				break;
			case 5:
				char c = view.readChar("Escribe el caracter que desees: ");
				int n = view.readInt("Escribe las veces que desees repetir el caracter: ");
				boolean b = view.readBoolean("Escribe la direccion que desees: ");
				view.showMessage(constant.fillCharacters(c, n, b));
				break;
			case 6:
				view.showMessage(constant.delteCharacter(view.readChar("Escribe el caracter que deseas borrar: ")));
				break;
			case 7:
				view.showMessage(constant.interseccion(view.readString("Escribe la cadena: ")));
				break;
			case 8: 
				view.showMessage(constant.findDifference(view.readString("Escribe la cadena")));
				break;
			case 9 : 
				constant.deleteDirection(view.readString("Escribe una cadena"), view.readInt("Escribe 1 para la derecha, o esccribe cualquier otro numero para la izquierda"));
				break;
			case 10:
				view.showMessage(constant.convertDate(view.readString("Escribe la fecha de forma: dd/MM/yyyy" ))+"");
				break;
			case 11:
				view.showMessage("Gracias...");
				isTrue = false;
				break;

			}
		}
	}
}
