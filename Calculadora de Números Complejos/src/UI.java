import java.util.Scanner;

public class UI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner stringScanner = new Scanner(System.in);
		
		Complejo num1 = new Complejo(0, 0);
		Complejo num2 = new Complejo(0, 0);
		Complejo resultado;
		
		int opcion = 0;
		
		while(opcion != 7) {
			System.out.println("\t\tCalculadora de Números Complejos\n\n\n");
			
			imprimirMenu();
			
			System.out.println("\nIngresa una opción");
			opcion = scanner.nextInt();
			
			switch(opcion) {
			case 1:
			case 2:
				System.out.println("Ingrese la parte real del número complejo.");
				double real = scanner.nextDouble();
				
				System.out.println("Ingrese la parte imaginaria del número complejo.");
				double imaginario = scanner.nextDouble();
				
//				while(imaginario != 0) {
//					System.out.println("La parte imaginaria no puede ser 0.");
//					System.out.println("Ingrese la parte imaginaria del número complejo.");
//					imaginario = scanner.nextInt();
//				}
				
				if (opcion == 1) {
					num1 = new Complejo(real, imaginario);
				} else {
					num2 = new Complejo(real, imaginario);
				}
				
				break;
				
			case 3:
				resultado = Calculadora.sumar(num1, num2);
				imprimirResultado("+", num1, num2, resultado);
				break;
				
			case 4:
				resultado = Calculadora.restar(num1, num2);
				imprimirResultado("-", num1, num2, resultado);
				break;
				
			case 5:
				resultado = Calculadora.multiplicar(num1, num2);
				imprimirResultado("×", num1, num2, resultado);
				break;
				
			case 6:
				resultado = Calculadora.dividir(num1, num2);
				imprimirResultado("÷", num1, num2, resultado);
				break;
				
			case 7:
				System.out.println("\nBye. :)");
				break;
				
			default:
				System.out.println("\nOpción no válida.");
				break;
			}
			
			System.out.println("\n\nPrecione enter para continuar...");
			stringScanner.nextLine();
			for(int i = 0; i < 25; i++) System.out.println();
		}
		
		scanner.close();
		stringScanner.close();
	}
	
	private static void imprimirMenu() {
		System.out.println("[1] - Llenar Número Complejo 1");
		System.out.println("[2] - Llenar Número Complejo 2");
		System.out.println("[3] - Sumar");
		System.out.println("[4] - Restar");
		System.out.println("[5] - Multiplicar");
		System.out.println("[6] - Dividir");
		System.out.println("[7] - Salir");
	}
	
	private static void imprimirResultado(String simbolo, Complejo num1, Complejo num2, Complejo resultado) {
		System.out.println("  " + num1.toString() + 
				"\n" + simbolo + "\n" + 
				"  " + num2.toString() + 
				"\n----------------\n" + 
				"  " + resultado.toString());
	}
}
