package ClaseEnvoltorio;

import java.util.ArrayList;
import java.util.Random;

/**
 * Clase que representa un ArrayList de números.
 * @param numeros ArrayList de números.
 * Contiene métodos para mostrar las iteraciones y llenar el ArrayList.
 *
 * @author Kadir y Leo.
 */

public class ArrayNumeros {
    private ArrayList<Integer> numeros = new ArrayList<Integer>();
    
    public void llenarArrayList(int cantidad){
        Random rdm = new Random();
        
        for (int i = 0; i < cantidad; i++) {
            numeros.add(rdm.nextInt(12));
        }
    }
    
    public ArrayList<Integer> getNumeros() {
    	return numeros;
    }
            
    public void mostrarIteraciones(){
        ArrayList<Integer> iteraciones= new ArrayList<Integer>();
        int it = 0;
        
        for (int j = 0; j <= 11; j++) {
            for (int i = 0; i < numeros.size(); i++) {
                if(numeros.get(i) == j){
                    it = it + 1;
                }
            }
            iteraciones.add(it);
            it = 0;
        }
        
        for (int i = 0; i <= 11; i++) {
            System.out.println(i + ": " + iteraciones.get(i));
        }
        
    }
 
}
