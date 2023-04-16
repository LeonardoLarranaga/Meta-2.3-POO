import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Clase Moneda, representa toda la aplicación.
 */

public class Moneda {
	private final static String[] caras = {"Sol", "Águila"}; 

	public static void main(String[] args) {
		
		ArrayList<String> carasAleatorias = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int opcion = 0;
		
		while (opcion != 3) {
			imprimirMenu();
			
			System.out.println("\nElige una opción:");
			opcion = scanner.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("\n\nLanzando moneda...");
				String resultado = caras[random.nextInt(2)];
				carasAleatorias.add(resultado);
				System.out.println("¡Tiraste " + resultado + "!");
				break;
				
			case 2:
				System.out.println("\n\nResultados anteriores:");
				
				for (Iterator<String> iterator = carasAleatorias.iterator(); iterator.hasNext();) {
					String string = (String) iterator.next();
					System.out.println(string);
				}
				
				break;
				
			case 3:
				System.out.println("Bye. :)");
				break;
				
			default:
				System.out.println("Opción no válida.");
				break;
			}
		}
		
		scanner.close();
	}
	

	private static void imprimirMenu() {
		System.out.println("\n\n[1] - Lanzar Moneda");
		System.out.println("[2] - Ver Todos los Resultados");
		System.out.println("[3] - Salir");
	}
}
