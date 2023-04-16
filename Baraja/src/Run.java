/**
 * Clase Run que contiene el método main para iniciar la aplicación.
 *
 */

public class Run{

  public static void main( String arrgs[]) {
    Baraja b = new Baraja();

    Carta carta = b.repartir();
    System.out.println(carta);
    
  }
  
}
