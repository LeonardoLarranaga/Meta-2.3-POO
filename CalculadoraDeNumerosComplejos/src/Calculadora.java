/**
 * Clase Calculadora.
 * Contiene 4 métodos estáticos para:
 *	- sumar
 *	- restar
 *	- dividir
 *	- multipliar
 * números complejos.
 * Las 4 clases regresa un valor de tipo Complejo (resultado de la operación).
 */

public class Calculadora {
    
    public static Complejo sumar(Complejo num1, Complejo num2) {
    	double real = num1.getReal() + num2.getReal();
    	double imaginario = num1.getImaginario() + num2.getImaginario();
        return new Complejo(real, imaginario);
    }
    
    public static Complejo restar(Complejo num1, Complejo num2) { 
    	double real = num1.getReal() - num2.getReal();
    	double imaginario = num1.getImaginario() - num2.getImaginario();
        return new Complejo(real, imaginario);
    }
    
    public static Complejo multiplicar(Complejo num1, Complejo num2) {
    	double real = num1.getReal() * num2.getReal() - num1.getImaginario() * num2.getImaginario();
    	double imaginario = num1.getReal() * num2.getImaginario() + num1.getImaginario() * num2.getReal();
        return new Complejo(real, imaginario);
    }
    
    public static Complejo dividir(Complejo num1, Complejo num2) {
    	double denominador = num2.getReal() * num2.getReal() + num2.getImaginario() * num2.getImaginario();
    	double real = (num1.getReal() * num2.getReal() + num1.getImaginario() * num2.getImaginario()) / denominador;
    	double imaginario = (num2.getReal() * num1.getImaginario() - num1.getReal() * num2.getImaginario()) / denominador;
        return new Complejo(real, imaginario);
    }
}
