

/**
 * Excepción que se utiliza cuándo un valor no se encuentra dentro del rango posible de valores de las cartas.
 * @author kadir y Leo.
 */
public class FueraDeRangoException extends Exception {

	private static final long serialVersionUID = 1L;

	public FueraDeRangoException(String message) {
	    super(message);
	  }	  
}
