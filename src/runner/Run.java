package runner;
/**
 * Clase Run
 */
import controller.Control;
import exceptions.IncorrectOptionException;

public class Run {
	/**
	 * Ejecuta el programa
	 * @param args
	 * @throws IncorrectOptionException
	 */
	public static void main(String[] args) throws IncorrectOptionException {
		new Control();
	}
}
