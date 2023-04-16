package ClaseEnvoltorio;

/**
 *
 * @author Kadir y Leo.
 */
public class Main {
    public static void main(String arrgs[]){
        ArrayNumeros numeros = new ArrayNumeros();
        
        numeros.llenarArrayList(10);
        
        System.out.println("Numeros del ArrayList:\n");
        
        for (Integer numero : numeros.getNumeros()) {
			System.out.print(numero + " ");
		}
        
        System.out.println("\n\nCantidad de iteraciones de cada numero en el ArrayList: \n");
        numeros.mostrarIteraciones();
    }
}
