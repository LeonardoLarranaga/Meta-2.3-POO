package Baraja;

/**
 * Excepción que se utiliza cuándo un valor no se encuentra dentro del rango posible de valores de las cartas.
 * @author kadir
 */
public class FueraDeRangoException extends Exception {

  public FueraDeRangoException(String message) {
    super(message);
  }
  
}
