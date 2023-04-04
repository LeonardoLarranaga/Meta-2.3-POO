import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

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
				System.out.println("¡Tiraste " + resultado + "!");
				carasAleatorias.add(resultado);
				break;
				
			case 2:
				System.out.println("\n\nResultados anteriores:");
				for (int i = 0; i < carasAleatorias.size(); i++) {
					System.out.println(i + ". " + carasAleatorias.get(i));
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