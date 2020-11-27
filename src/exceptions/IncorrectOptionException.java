package exceptions;
/**
 * 
 * @author TallerColaborativo
 *
 */
public class IncorrectOptionException extends Exception{

	private static final long serialVersionUID = 1L;
/**
 * Emite el mensaje cuando una opcion no es correcta
 */
	public IncorrectOptionException() {
		super("La opcion ingresada no es correcta");
	}
}
