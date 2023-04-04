/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseEnvoltorio;

/**
 *
 * @author kadir
 */
public class Main {
    public static void main(String arrgs[]){
        ArrayNumeros numeros = new ArrayNumeros();
        int numero;
        
        numeros.llenarArryaList(10);
        
        System.out.println("Numeros del ArrayList:\n");
        for (int i = 0; i < 10; i++) {
            numero = numeros.getNumero(i);
            System.out.print(numero + "   ");
        }
        
        System.out.println("\n\nCantidad de iteraciones de cada numero en el ArrayList: \n");
        numeros.mostrarIteraciones();
        
        
    }
}
